package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mbc {
    public final float a;
    public final boolean b;
    public final boolean c;

    public mbc(float f, boolean z, boolean z2) {
        this.a = f;
        this.b = z;
        this.c = z2;
    }

    public static mbc a(mbc mbcVar, float f, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            f = mbcVar.a;
        }
        if ((i & 2) != 0) {
            z = mbcVar.b;
        }
        if ((i & 4) != 0) {
            z2 = mbcVar.c;
        }
        mbcVar.getClass();
        return new mbc(f, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbc)) {
            return false;
        }
        mbc mbcVar = (mbc) obj;
        return Float.compare(this.a, mbcVar.a) == 0 && this.b == mbcVar.b && this.c == mbcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ia.f(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RNBottomSheetDialogState(grabberIconAlpha=");
        sb.append(this.a);
        sb.append(", shouldAllowSwipeToClose=");
        sb.append(this.b);
        sb.append(", shouldShowCloseButton=");
        return z3.o(sb, this.c, ")");
    }

    public mbc() {
        this(0);
    }

    public /* synthetic */ mbc(int i) {
        this(1.0f, true, false);
    }
}
