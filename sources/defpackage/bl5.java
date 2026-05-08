package defpackage;

import androidx.compose.ui.layout.w;
import defpackage.al5;

/* JADX INFO: loaded from: classes.dex */
public final class bl5 {
    public final al5.a a;
    public vf9 b;
    public w c;
    public vf9 d;
    public w e;
    public eh7 f;
    public eh7 g;

    public bl5(al5.a aVar) {
        this.a = aVar;
    }

    public final eh7 a(int i, int i2, boolean z) {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            if (z) {
                return this.f;
            }
            return null;
        }
        if (iOrdinal != 3) {
            l.g();
            return null;
        }
        if (z) {
            return this.f;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.g;
    }

    public final void b(pl7 pl7Var, pl7 pl7Var2, long j) {
        long jM = ewa.m(j, wm8.a);
        if (pl7Var != null) {
            int iG = iq2.g(jM);
            int i = zk5.a;
            int iO = pl7Var.O(iG);
            this.f = new eh7(eh7.a(iO, pl7Var.K(iO)));
            this.b = pl7Var instanceof vf9 ? (vf9) pl7Var : null;
            this.c = null;
        }
        if (pl7Var2 != null) {
            int iG2 = iq2.g(jM);
            int i2 = zk5.a;
            int iO2 = pl7Var2.O(iG2);
            this.g = new eh7(eh7.a(iO2, pl7Var2.K(iO2)));
            this.d = pl7Var2 instanceof vf9 ? (vf9) pl7Var2 : null;
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl5) && this.a == ((bl5) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + w40.c(0, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
