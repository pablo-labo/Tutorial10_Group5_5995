package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes3.dex */
public final class qd9 implements pd9 {
    public final iy3 a;
    public final g4a b;
    public final g4a c;

    public qd9(iy3 iy3Var) {
        iy3Var.getClass();
        this.a = iy3Var;
        this.b = r.f(new kie(9205357640488583168L));
        this.c = r.f(new kie(9205357640488583168L));
    }

    @Override // defpackage.pd9
    public final long a() {
        return ((kie) ((gme) this.c).getValue()).a;
    }

    @Override // defpackage.pd9
    public final void b(long j) {
        ((gme) this.b).setValue(new kie(hh1.Y(j)));
    }

    @Override // defpackage.pd9
    public final long c() {
        return ((kie) ((gme) this.b).getValue()).a;
    }

    @Override // defpackage.pd9
    public final iy3 getDensity() {
        return this.a;
    }
}
