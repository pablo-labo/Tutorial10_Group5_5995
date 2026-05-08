package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class x59 extends w59 implements vf9 {
    public final tia e0;
    public LinkedHashMap g0;
    public bg9 i0;
    public long f0 = 0;
    public final y59 h0 = new y59(this);
    public final o3a<d20> j0 = mna.a();

    public x59(tia tiaVar) {
        this.e0 = tiaVar;
    }

    public static final void O0(x59 x59Var, bg9 bg9Var) {
        LinkedHashMap linkedHashMap;
        if (bg9Var != null) {
            x59Var.j0((((long) bg9Var.getHeight()) & 4294967295L) | (((long) bg9Var.getWidth()) << 32));
        } else {
            x59Var.j0(0L);
        }
        if (!wl7.b(x59Var.i0, bg9Var) && bg9Var != null && ((((linkedHashMap = x59Var.g0) != null && !linkedHashMap.isEmpty()) || !bg9Var.r().isEmpty()) && !wl7.b(bg9Var.r(), x59Var.g0))) {
            z59 z59Var = x59Var.e0.e0.u0.q;
            z59Var.getClass();
            z59Var.h0.g();
            LinkedHashMap linkedHashMap2 = x59Var.g0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                x59Var.g0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(bg9Var.r());
        }
        x59Var.i0 = bg9Var;
    }

    @Override // defpackage.w59
    public final boolean F0() {
        return this.i0 != null;
    }

    @Override // defpackage.w59
    public final bg9 G0() {
        bg9 bg9Var = this.i0;
        if (bg9Var != null) {
            return bg9Var;
        }
        throw l6.k("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.w59
    public final w59 H0() {
        tia tiaVar = this.e0.i0;
        if (tiaVar != null) {
            return tiaVar.d1();
        }
        return null;
    }

    @Override // defpackage.w59, defpackage.cg9
    public final pm8 H1() {
        return this.e0.e0;
    }

    @Override // defpackage.w59
    public final long I0() {
        return this.f0;
    }

    @Override // defpackage.w59
    public final void N0() {
        h0(this.f0, 0.0f, null);
    }

    public final long P0() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public void R0() {
        G0().j();
    }

    public final void T0(long j) {
        if (!lh7.b(this.f0, j)) {
            this.f0 = j;
            tia tiaVar = this.e0;
            z59 z59Var = tiaVar.e0.u0.q;
            if (z59Var != null) {
                z59Var.u0();
            }
            w59.K0(tiaVar);
        }
        if (this.Z) {
            return;
        }
        v0(G0());
    }

    public final long U0(x59 x59Var, boolean z) {
        long jD = 0;
        while (!this.equals(x59Var)) {
            if (!this.X || !z) {
                jD = lh7.d(jD, this.f0);
            }
            tia tiaVar = this.e0.i0;
            tiaVar.getClass();
            this = tiaVar.d1();
            this.getClass();
        }
        return jD;
    }

    @Override // defpackage.w59
    public final sl8 a1() {
        return this.h0;
    }

    @Override // defpackage.gg9, defpackage.pl7
    public final Object g() {
        return this.e0.g();
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.e0.getDensity();
    }

    @Override // defpackage.ql7
    public final vl8 getLayoutDirection() {
        return this.e0.e0.n0;
    }

    @Override // androidx.compose.ui.layout.w
    public final void h0(long j, float f, Function1<? super cd6, j6g> function1) {
        T0(j);
        if (this.Y) {
            return;
        }
        R0();
    }

    @Override // defpackage.w59, defpackage.ql7
    public final boolean m0() {
        return true;
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.e0.p1();
    }

    @Override // defpackage.w59
    public final w59 z0() {
        tia tiaVar = this.e0.h0;
        if (tiaVar != null) {
            return tiaVar.d1();
        }
        return null;
    }
}
