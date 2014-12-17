package quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


public class start {
    private static int hc = 0;
    private static start instance = null;

    public start() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static start getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new start();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof start;
    }

    public String toString() {
        return "<start>";
    }
}
