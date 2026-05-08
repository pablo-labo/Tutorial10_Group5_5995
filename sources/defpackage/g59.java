package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g59 extends n3b {
    public final String a = "durationsMs";
    public final HashMap b;

    public g59(HashMap map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g59)) {
            return false;
        }
        g59 g59Var = (g59) obj;
        return wl7.b(this.a, g59Var.a) && wl7.b(this.b, g59Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a + "='" + this.b + "'";
    }
}
