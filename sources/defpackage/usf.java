package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class usf {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList<esf> c = new ArrayList<>();

    public usf(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof usf)) {
            return false;
        }
        usf usfVar = (usf) obj;
        return this.b == usfVar.b && this.a.equals(usfVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbG = h5.g("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbG.append(this.b);
        sbG.append("\n");
        String strConcat = sbG.toString().concat("    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }

    @Deprecated
    public usf() {
    }
}
