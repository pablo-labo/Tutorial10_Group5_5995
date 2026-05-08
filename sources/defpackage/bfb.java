package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.pm8;

/* JADX INFO: loaded from: classes.dex */
public final class bfb {
    public final pm8 a;
    public final pi6 b;
    public final zeb c = new zeb();
    public final qi6 d = new qi6();
    public boolean e;

    public bfb(pm8 pm8Var) {
        this.a = pm8Var;
        this.b = new pi6(pm8Var.t0.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(x7 x7Var, AndroidComposeView androidComposeView, boolean z) {
        byte b;
        pi6 pi6Var;
        int i;
        int i2;
        qi6 qi6Var = this.d;
        if (this.e) {
            return 0;
        }
        try {
            this.e = true;
            aj7 aj7VarA = this.c.a(x7Var, androidComposeView);
            r59<yeb> r59Var = aj7VarA.a;
            int iJ = r59Var.j();
            for (int i3 = 0; i3 < iJ; i3++) {
                yeb yebVarK = r59Var.k(i3);
                if (!yebVarK.d && !yebVarK.h) {
                }
                b = false;
                break;
            }
            b = true;
            int iJ2 = r59Var.j();
            int i4 = 0;
            while (true) {
                pi6Var = this.b;
                if (i4 >= iJ2) {
                    break;
                }
                yeb yebVarK2 = r59Var.k(i4);
                if (b != false || mh2.g(yebVarK2)) {
                    pm8 pm8Var = this.a;
                    long j = yebVarK2.c;
                    qi6 qi6Var2 = this.d;
                    int i5 = yebVarK2.i;
                    pm8.c cVar = pm8.F0;
                    pm8Var.O(j, qi6Var2, i5, true);
                    if (!qi6Var.a.d()) {
                        pi6Var.a(yebVarK2.a, qi6Var, mh2.g(yebVarK2));
                        qi6Var.clear();
                    }
                }
                i4++;
            }
            boolean zB = pi6Var.b(aj7VarA, z);
            if (aj7VarA.c) {
                i = 0;
            } else {
                int iJ3 = r59Var.j();
                for (int i6 = 0; i6 < iJ3; i6++) {
                    yeb yebVarK3 = r59Var.k(i6);
                    if (!ooa.c(mh2.s(yebVarK3, true), 0L) && yebVarK3.b()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iJ4 = r59Var.j();
            int i7 = 0;
            while (true) {
                if (i7 >= iJ4) {
                    i2 = 0;
                    break;
                }
                if (r59Var.k(i7).b()) {
                    i2 = 1;
                    break;
                }
                i7++;
            }
            int i8 = (zB ? 1 : 0) | (i << 1) | (i2 << 2);
            this.e = false;
            return i8;
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }
}
