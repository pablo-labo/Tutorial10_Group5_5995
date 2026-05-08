package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qx4 {
    public final e5g a;
    public final String b;
    public final ArrayList c;

    public qx4(e5g e5gVar, String str, ArrayList arrayList) {
        str.getClass();
        this.a = e5gVar;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qx4) {
            qx4 qx4Var = (qx4) obj;
            if (this.a == qx4Var.a && wl7.b(this.b, qx4Var.b) && this.c.equals(qx4Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Event(uid=" + this.a + ", name=" + this.b + ", params=" + this.c + ")";
    }
}
