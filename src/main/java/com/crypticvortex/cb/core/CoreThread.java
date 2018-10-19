package com.crypticvortex.cb.core;

import com.crypticvortex.cb.core.time.Date;

public class CoreThread implements Runnable {

    private final static int UPDATE_RATE = 1000;

    private Date date;

    public CoreThread(){

    }


    public void run() {
        for(;;){
            try {
                Thread.sleep(UPDATE_RATE);


            } catch(Exception ex){ System.out.println("Well fuck : \n" + ex); }
        }
    }
}
