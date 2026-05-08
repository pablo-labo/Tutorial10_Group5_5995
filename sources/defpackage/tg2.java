package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tg2 {
    public final d4f a;
    public final tg2 b;
    public final List<tg2> c;

    public tg2() {
        throw null;
    }

    public tg2(d4f d4fVar, tg2 tg2Var) {
        ArrayList arrayList = new ArrayList();
        d4fVar.getClass();
        this.a = d4fVar;
        this.b = tg2Var;
        this.c = arrayList;
    }

    public final boolean a() {
        if (!b(cy1.class) && !b(vx1.class)) {
            return false;
        }
        tg2 tg2Var = this.b;
        return tg2Var == null ? true : wl7.b(z92.Z0(tg2Var.c), this);
    }

    public final boolean b(Class<? extends d4f> cls) {
        d4f d4fVar;
        tg2 tg2Var = this.b;
        if (tg2Var == null || (d4fVar = tg2Var.a) == null) {
            return false;
        }
        return cls.isInstance(d4fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg2)) {
            return false;
        }
        tg2 tg2Var = (tg2) obj;
        return wl7.b(this.a, tg2Var.a) && wl7.b(this.b, tg2Var.b) && wl7.b(this.c, tg2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tg2 tg2Var = this.b;
        return this.c.hashCode() + ((iHashCode + (tg2Var == null ? 0 : tg2Var.hashCode())) * 31);
    }

    public final String toString() {
        return "TreeNode(component=" + fwc.a.b(this.a.getClass()).r() + ", childrenCount=" + this.c.size() + ")";
    }
}
