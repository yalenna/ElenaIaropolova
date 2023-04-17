package Homework4;

import jdk.jshell.spi.ExecutionControl;

public interface Illuminated {
    void illuminateRed() throws ExecutionControl.NotImplementedException;
    void illuminateWhite() throws ExecutionControl.NotImplementedException;
}