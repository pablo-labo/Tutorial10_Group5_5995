package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class ahb {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ahb(boolean z, yxd yxdVar, boolean z2) {
        ne4 ne4Var = x80.a;
        int i = !z ? 262152 : 262144;
        i = yxdVar == yxd.b ? i | 8192 : i;
        i = z2 ? i : i | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        boolean z3 = yxdVar == yxd.a;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahb)) {
            return false;
        }
        ahb ahbVar = (ahb) obj;
        return this.a == ahbVar.a && this.b == ahbVar.b && this.c == ahbVar.c && this.d == ahbVar.d && this.e == ahbVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ia.f(ia.f(ia.f(ia.f(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public ahb(int i) {
        this((i & 1) == 0, yxd.a, true);
    }
}
