import org.overture.codegen.runtime.*;

import java.util.*;


public class Entity {
    public Number entityID;
    public Number location;
    public Number cost;

    public Entity(final Number ID, final Number loc, final Number c) {
        cg_init_Entity_1(ID, loc, c);
    }

    public Entity() {
    }

    public void cg_init_Entity_1(final Number ID, final Number loc,
        final Number c) {
        entityID = ID;
        location = loc;
        cost = c;

        return;
    }

    public String toString() {
        return "Entity{" + "entityID := " + Utils.toString(entityID) +
        ", location := " + Utils.toString(location) + ", cost := " +
        Utils.toString(cost) + "}";
    }
}
