/*
 * Copyright (c) RESONANCE JSC, 22.04.2019
 */

package sample.periphery;

public interface Device {

    void init();

    void finish();

    <T> void sendTo(T data);
}
