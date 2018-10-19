package com.crypticvortex.cb.core;

import com.crypticvortex.cb.core.time.Date;
import com.crypticvortex.cb.core.time.Month;
import com.sun.jmx.snmp.tasks.Task;

public class CoreThread{

    private final static int UPDATE_RATE = 1000;
    private final static int PAUSED_UPDATE_RATE = 100;

    private Date date;
    private int cash;
    private int cashIncome;
    private Thread coreThread;
    private boolean isCoreThreadPaused;

    public CoreThread(){
        this.date = new Date(0, Month.JANUARY, 0);
        cash = 0;
        cashIncome = 0;
        coreThread = createCoreThread();
        isCoreThreadPaused = true;
        coreThread.start();
    }


    private Thread createCoreThread() {
        return new Thread(() -> {
            for(;;){
                try {
                    while(isCoreThreadPaused){
                        Thread.sleep(PAUSED_UPDATE_RATE);
                    }
                    System.out.println(date);
                    Thread.sleep(UPDATE_RATE);

                    date.addDay();
                    cash += cashIncome;


                } catch(Exception ex){ System.out.println("Well fuck : \n" + ex); }
            }
        });
    }
}
