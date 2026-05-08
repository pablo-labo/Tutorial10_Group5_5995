package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.k;

/* JADX INFO: loaded from: classes.dex */
public final class x1d {
    public final k a;
    public final int b;
    public final k c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public x1d(k kVar, k kVar2, int i) {
        this.a = kVar;
        this.b = i;
        this.c = kVar2;
    }

    public static boolean g(k kVar) {
        return kVar.getState() != 0;
    }

    public static void k(k kVar, long j) {
        kVar.l();
        if (kVar instanceof ojf) {
            ojf ojfVar = (ojf) kVar;
            ka2.q(ojfVar.c0);
            ojfVar.z0 = j;
        }
    }

    public final void a(k kVar, cp3 cp3Var) {
        ka2.q(this.a == kVar || this.c == kVar);
        if (g(kVar)) {
            if (kVar == cp3Var.c) {
                cp3Var.d = null;
                cp3Var.c = null;
                cp3Var.e = true;
            }
            if (kVar.getState() == 2) {
                kVar.stop();
            }
            kVar.disable();
        }
    }

    public final int b() {
        boolean zG = g(this.a);
        k kVar = this.c;
        return (zG ? 1 : 0) + ((kVar == null || !g(kVar)) ? 0 : 1);
    }

    public final k c(xj9 xj9Var) {
        if (xj9Var == null) {
            return null;
        }
        rjd[] rjdVarArr = xj9Var.c;
        int i = this.b;
        if (rjdVarArr[i] == null) {
            return null;
        }
        k kVar = this.a;
        if (kVar.z() == rjdVarArr[i]) {
            return kVar;
        }
        k kVar2 = this.c;
        if (kVar2 == null || kVar2.z() != rjdVarArr[i]) {
            return null;
        }
        return kVar2;
    }

    public final boolean d(xj9 xj9Var, k kVar) {
        if (kVar == null) {
            return true;
        }
        rjd[] rjdVarArr = xj9Var.c;
        int i = this.b;
        rjd rjdVar = rjdVarArr[i];
        if (kVar.z() == null) {
            return true;
        }
        if (kVar.z() == rjdVar) {
            if (rjdVar == null || kVar.j()) {
                return true;
            }
            xj9 xj9Var2 = xj9Var.m;
            if (xj9Var.g.g && xj9Var2 != null && xj9Var2.e && ((kVar instanceof ojf) || (kVar instanceof ss9) || kVar.A() >= xj9Var2.e())) {
                return true;
            }
        }
        xj9 xj9Var3 = xj9Var.m;
        return xj9Var3 != null && xj9Var3.c[i] == kVar.z();
    }

    public final boolean e() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public final boolean f() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return g(this.a);
        }
        k kVar = this.c;
        kVar.getClass();
        return kVar.getState() != 0;
    }

    public final void h(boolean z) {
        if (z) {
            if (this.e) {
                this.a.reset();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            k kVar = this.c;
            kVar.getClass();
            kVar.reset();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int i(k kVar, xj9 xj9Var, gqf gqfVar, cp3 cp3Var) {
        k kVar2;
        int i;
        if (kVar == null || kVar.getState() == 0 || (kVar == (kVar2 = this.a) && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (kVar == this.c && this.d == 3) {
            return 1;
        }
        rjd rjdVarZ = kVar.z();
        rjd[] rjdVarArr = xj9Var.c;
        int i2 = this.b;
        byte b = rjdVarZ != rjdVarArr[i2];
        boolean zC = gqfVar.c(i2);
        if (!zC || b != false) {
            if (!kVar.o()) {
                p35 p35Var = ((p35[]) gqfVar.c)[i2];
                int length = p35Var != null ? p35Var.length() : 0;
                a[] aVarArr = new a[length];
                for (int i3 = 0; i3 < length; i3++) {
                    p35Var.getClass();
                    aVarArr[i3] = p35Var.e(i3);
                }
                rjd rjdVar = xj9Var.c[i2];
                rjdVar.getClass();
                kVar.t(aVarArr, rjdVar, xj9Var.e(), xj9Var.p, xj9Var.g.a);
                return 3;
            }
            if (!kVar.c()) {
                return 0;
            }
            a(kVar, cp3Var);
            if (!zC || e()) {
                h(kVar == kVar2);
                return 1;
            }
        }
        return 1;
    }

    public final void j() {
        if (!g(this.a)) {
            h(true);
        }
        k kVar = this.c;
        if (kVar == null || kVar.getState() != 0) {
            return;
        }
        h(false);
    }

    public final void l() {
        k kVar = this.a;
        if (kVar.getState() == 1 && this.d != 4) {
            kVar.start();
            return;
        }
        k kVar2 = this.c;
        if (kVar2 == null || kVar2.getState() != 1 || this.d == 3) {
            return;
        }
        kVar2.start();
    }
}
