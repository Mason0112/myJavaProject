package org.example.parking;


import java.time.Duration;
import java.time.LocalDateTime;

public class Car {

    private String  id;
    private LocalDateTime enterTime;
    private LocalDateTime exitTime;

    public Car(String id, LocalDateTime enterTime) {
        this.id = id;
        this.enterTime = enterTime;
    }
    public long getDuration(){
        Duration duration = Duration.between(enterTime, exitTime);
        return duration.toMinutes();
    }

    public void leave(){
        exitTime = LocalDateTime.now();
    }

    public void setLeaveTime(LocalDateTime exitTime){
        if(exitTime.isAfter(enterTime)){
            this.exitTime = exitTime;
        }

    }
}
