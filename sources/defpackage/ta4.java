package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ta4<T> extends e.c implements lm8 {
    public d40<T> d0;
    public ct e0;
    public dwa f0;
    public boolean g0;

    public ta4() {
        throw null;
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        this.g0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(j);
        if (!qVar.m0() || !this.g0) {
            Pair pair = (Pair) this.e0.invoke(new th7((((long) wVarR.b) & 4294967295L) | (((long) wVarR.a) << 32)), new iq2(j));
            d40<T> d40Var = this.d0;
            pa4 pa4Var = (pa4) pair.d();
            Object objE = pair.e();
            g4a g4aVar = d40Var.l;
            if (!wl7.b(d40Var.e(), pa4Var)) {
                ((gme) d40Var.m).setValue(pa4Var);
                a5a a5aVar = d40Var.e.b;
                boolean zD = a5aVar.d();
                if (zD) {
                    try {
                        u30 u30Var = d40Var.n;
                        float f = d40Var.e().f(objE);
                        if (!Float.isNaN(f)) {
                            u30Var.a(f, 0.0f);
                            ((gme) g4aVar).setValue(null);
                        }
                        d40Var.h((T) objE);
                        j6g j6gVar = j6g.a;
                    } finally {
                        a5aVar.p(null);
                    }
                }
                if (!zD) {
                    ((gme) g4aVar).setValue(objE);
                }
            }
        }
        this.g0 = qVar.m0() || this.g0;
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new yb1(1, qVar, this, wVarR));
    }
}
