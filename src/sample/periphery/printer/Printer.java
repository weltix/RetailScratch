/*
 * Copyright (c) RESONANCE JSC, 22.04.2019
 */

package sample.periphery.printer;

import sample.periphery.CashDrawer;
import sample.periphery.Device;

public interface Printer extends Device, CashDrawer {
    int LINE_LENGTH_DEFAULT = 32;

    void setLineLength(int length);

    default int getLineLength() {
        return LINE_LENGTH_DEFAULT;
    }
}