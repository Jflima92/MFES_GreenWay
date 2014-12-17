import org.overture.codegen.runtime.*;

import java.util.*;


public class Device {
    public Number lastLocation;
    public Number balance = 0L;
    public Number id;
    public Number time;
    public VDMMap history = MapUtil.map();

    public Device(final Number ID, final Number bal) {
        cg_init_Device_1(ID, bal);
    }

    public Device() {
    }

    public void cg_init_Device_1(final Number ID, final Number bal) {
        id = ID;
        balance = bal;
        lastLocation = 0L;
        time = 0L;

        return;
    }

    public void setBalance(final Number balan) {
        balance = balan;
    }

    public void setLastLocation(final Number lastloc) {
        lastLocation = lastloc;
    }

    public String toString() {
        return "Device{" + "lastLocation := " + Utils.toString(lastLocation) +
        ", balance := " + Utils.toString(balance) + ", id := " +
        Utils.toString(id) + ", time := " + Utils.toString(time) +
        ", history := " + Utils.toString(history) + "}";
    }
}
