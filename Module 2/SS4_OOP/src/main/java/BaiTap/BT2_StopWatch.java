/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

/**
 *
 * @author DELL
 */
import java.time.Instant;

public class BT2_StopWatch {
     private long startTime;
    private long endTime;

    public BT2_StopWatch() {
        this.startTime = Instant.now().toEpochMilli();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = Instant.now().toEpochMilli();
    }

    public void stop() {
        this.endTime = Instant.now().toEpochMilli();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        
    }
}

