package org.example;

import org.example.sensors.Sensor;

public interface ISensorObservable {
    public void addSensor(Sensor sensor);
    public void removeSensor(Sensor sensor);
    public void notifySensors();
}
