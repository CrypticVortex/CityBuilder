package com.crypticvortex.cb.core;

import com.crypticvortex.cb.core.time.Date;
import com.crypticvortex.cb.core.time.Month;
import com.sun.jmx.snmp.tasks.Task;

public class CoreThread{

    private Date date;
    private Thread coreThread;
    private boolean isCoreThreadPaused;

    public CoreThread(){
        this.date = new Date(0, Month.JANUARY, 0);
        coreThread = createCoreThread();
        isCoreThreadPaused = true;
        coreThread.start();
    }


    private Thread createCoreThread() {
        return new Thread(() -> {
            for(;;){
                try {
                    while(isCoreThreadPaused){
                        Thread.sleep(GlobalVars.PAUSED_UPDATE_RATE);
                    }
                    System.out.println(date);
                    Thread.sleep(GlobalVars.UPDATE_RATE);

                    date.addDay();

                    // Calls the update resources function
                    UpdateResources();


                } catch(Exception ex){ System.out.println("Well fuck : \n" + ex); }
            }
        });
    }

    // Will add the resource per tick value to the resource themselves
    private void UpdateResources() {
        GlobalVars.GetAllResourcesTick().forEach((key,value) -> {
            switch (key) {
                case "MONEY": GlobalVars.MONEY += value; break;
                case "TIMBER": GlobalVars.TIMBER += value; break;
                case "COTTON": GlobalVars.COTTON += value; break;
                case "GRAIN":  GlobalVars.GRAIN += value; break;
                case "STONE": GlobalVars.STONE += value; break;
                case "WATER":  GlobalVars.WATER += value; break;
                case "HEMP": GlobalVars.HEMP += value; break;
                case "ROPE": GlobalVars.ROPE += value; break;
                case "GOLD": GlobalVars.GOLD += value;  break;
                case "BARDS":  GlobalVars.BARDS += value; break;
                default: break;
            }
        });
    }
}
