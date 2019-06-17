package com.citybase.testrepository.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class Timer {

    private static Logger log = LoggerFactory.getLogger(Timer.class);

    private static long startTime;
    private static long finishTime;


    public static void startTimer() {
        log.debug("Started timer at: " + LocalDateTime.now());
        startTime = System.currentTimeMillis();
    }

    public static void stopTimer() {
        log.debug("Stopped timer at: " + LocalDateTime.now());
        finishTime = System.currentTimeMillis();
    }

    public static long getTimeInSeconds() {
        return (finishTime - startTime) / 1000;
    }

    public static long getTimeInMinutes() {
        long minutes = ((finishTime - startTime) / 1000) / 60;
        log.info("Elapsed time: " + minutes + " seconds");
        return minutes;
    }

    public static void resetTimer() {
        log.info("Timer has been reset!");
        startTime = 0;
        finishTime = 0;
    }
}
