package androidx.compose.ui.layout;

import androidx.compose.ui.layout.x;
import defpackage.cd6;
import defpackage.gg9;
import defpackage.iq2;
import defpackage.iy3;
import defpackage.j6g;
import defpackage.lh7;
import defpackage.nic;
import defpackage.th7;
import defpackage.uz9;
import defpackage.vl8;
import defpackage.xc6;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements gg9 {
    public int a;
    public int b;
    public long c = 0;
    public long d = x.b;
    public long e = 0;

    public static abstract class a implements iy3 {
        public boolean a;

        public static void A(a aVar, w wVar, long j) {
            x.a aVar2 = x.a;
            if (aVar.k() == vl8.a || aVar.p() == 0) {
                d(aVar, wVar);
                wVar.h0(lh7.d(j, wVar.e), 0.0f, aVar2);
            } else {
                int iP = (aVar.p() - wVar.a) - ((int) (j >> 32));
                d(aVar, wVar);
                wVar.h0(lh7.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iP) << 32), wVar.e), 0.0f, aVar2);
            }
        }

        public static void B(a aVar, w wVar, long j, xc6 xc6Var) {
            if (aVar.k() == vl8.a || aVar.p() == 0) {
                d(aVar, wVar);
                wVar.g0(lh7.d(j, wVar.e), 0.0f, xc6Var);
            } else {
                int iP = (aVar.p() - wVar.a) - ((int) (j >> 32));
                d(aVar, wVar);
                wVar.g0(lh7.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iP) << 32), wVar.e), 0.0f, xc6Var);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void C(a aVar, w wVar, int i, int i2, Function1 function1, int i3) {
            if ((i3 & 8) != 0) {
                function1 = x.a;
            }
            aVar.getClass();
            d(aVar, wVar);
            wVar.h0(lh7.d((((long) i2) & 4294967295L) | (((long) i) << 32), wVar.e), 0.0f, function1);
        }

        public static void E(a aVar, w wVar, long j) {
            x.a aVar2 = x.a;
            aVar.getClass();
            d(aVar, wVar);
            wVar.h0(lh7.d(j, wVar.e), 0.0f, aVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void d(a aVar, w wVar) {
            aVar.getClass();
            if (wVar instanceof uz9) {
                ((uz9) wVar).C(aVar.a);
            }
        }

        public static void w(a aVar, w wVar, long j) {
            aVar.getClass();
            d(aVar, wVar);
            wVar.h0(lh7.d(j, wVar.e), 0.0f, null);
        }

        public static void y(a aVar, w wVar, int i, int i2) {
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            if (aVar.k() == vl8.a || aVar.p() == 0) {
                d(aVar, wVar);
                wVar.h0(lh7.d(j, wVar.e), 0.0f, null);
            } else {
                int iP = (aVar.p() - wVar.a) - ((int) (j >> 32));
                d(aVar, wVar);
                wVar.h0(lh7.d((((long) iP) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), wVar.e), 0.0f, null);
            }
        }

        public static void z(a aVar, w wVar, int i, int i2) {
            x.a aVar2 = x.a;
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            if (aVar.k() == vl8.a || aVar.p() == 0) {
                d(aVar, wVar);
                wVar.h0(lh7.d(j, wVar.e), 0.0f, aVar2);
            } else {
                int iP = (aVar.p() - wVar.a) - ((int) (j >> 32));
                d(aVar, wVar);
                wVar.h0(lh7.d((((long) iP) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), wVar.e), 0.0f, aVar2);
            }
        }

        public float g(z zVar) {
            return Float.NaN;
        }

        @Override // defpackage.iy3
        public float getDensity() {
            return 1.0f;
        }

        public abstract vl8 k();

        public abstract int p();

        @Override // defpackage.iy3
        public float p1() {
            return 1.0f;
        }

        public final void r(w wVar, int i, int i2, float f) {
            d(this, wVar);
            wVar.h0(lh7.d((((long) i2) & 4294967295L) | (((long) i) << 32), wVar.e), f, null);
        }
    }

    public int c0() {
        return (int) (this.c & 4294967295L);
    }

    public int e0() {
        return (int) (this.c >> 32);
    }

    public final void f0() {
        this.a = nic.C((int) (this.c >> 32), iq2.j(this.d), iq2.h(this.d));
        int iC = nic.C((int) (this.c & 4294967295L), iq2.i(this.d), iq2.g(this.d));
        this.b = iC;
        int i = this.a;
        long j = this.c;
        this.e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iC - ((int) (j & 4294967295L))) / 2)));
    }

    public void g0(long j, float f, xc6 xc6Var) {
        h0(j, f, null);
    }

    public abstract void h0(long j, float f, Function1<? super cd6, j6g> function1);

    public final void j0(long j) {
        if (th7.b(this.c, j)) {
            return;
        }
        this.c = j;
        f0();
    }

    public final void l0(long j) {
        if (iq2.b(this.d, j)) {
            return;
        }
        this.d = j;
        f0();
    }
}
