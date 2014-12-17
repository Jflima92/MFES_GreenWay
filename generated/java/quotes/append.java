package quotes;

import org.overture.codegen.runtime.*;

import java.util.*;


public class append {
    private static int hc = 0;
    private static append instance = null;

    public append() {
        if (Utils.equals(hc, 0)) {
            hc = super.hashCode();
        }
    }

    public static append getInstance() {
        if (Utils.equals(instance, null)) {
            instance = new append();
        }

        return instance;
    }

    public int hashCode() {
        return hc;
    }

    public boolean equals(final Object obj) {
        return obj instanceof append;
    }

    public String toString() {
        return "<append>";
    }
}
