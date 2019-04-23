/*
 * Copyright (c) RESONANCE JSC, 22.04.2019
 */

package sample.periphery.indicator;

import sample.periphery.Device;

public interface Indicator extends Device {
    int LINE_LENGTH_DEFAULT = 20;

    void setLineLength(int length);

    default int getLineLength() {
        return LINE_LENGTH_DEFAULT;
    }
}