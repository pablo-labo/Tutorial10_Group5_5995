package defpackage;

import android.view.ViewGroup;
import androidx.compose.runtime.r;
import defpackage.hmb;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
@sy3
public final class l90 extends pdd implements k0d, mdd {
    public final ViewGroup V;
    public ldd W;
    public final g4a X;
    public final g4a Y;
    public long Z;
    public int a0;
    public final k90 b0;
    public final boolean c;
    public final float d;
    public final g4a e;
    public final g4a f;

    public l90() {
        throw null;
    }

    public l90(boolean z, float f, g4a g4aVar, g4a g4aVar2, ViewGroup viewGroup) {
        super(g4aVar2, z);
        this.c = z;
        this.d = f;
        this.e = g4aVar;
        this.f = g4aVar2;
        this.V = viewGroup;
        this.X = r.f(null);
        this.Y = r.f(Boolean.TRUE);
        this.Z = 0L;
        this.a0 = -1;
        this.b0 = new k90(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pdd
    public final void a(hmb.b bVar) {
        ldd lddVarB = this.W;
        if (lddVarB == null) {
            lddVarB = web.b(this.V);
            this.W = lddVarB;
        }
        ndd nddVarA = lddVarB.a(this);
        nddVarA.b(bVar, this.c, this.Z, this.a0, ((da2) this.e.getValue()).a, ((idd) this.f.getValue()).d, this.b0);
        ((gme) this.X).setValue(nddVarA);
    }

    @Override // defpackage.k0d
    public final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qa7
    public final void c(sm8 sm8Var) {
        ax1 ax1Var = sm8Var.a;
        this.Z = ax1Var.c();
        float f = this.d;
        this.a0 = Float.isNaN(f) ? gf9.b(ojh.p(sm8Var, this.c, ax1Var.c())) : ax1Var.x0(f);
        long j = ((da2) this.e.getValue()).a;
        float f2 = ((idd) this.f.getValue()).d;
        sm8Var.N1();
        this.b.a(sm8Var, Float.isNaN(f) ? ojh.p(sm8Var, this.a, ax1Var.c()) : sm8Var.t1(f), j);
        ww1 ww1VarA = ax1Var.b.a();
        ((Boolean) ((gme) this.Y).getValue()).booleanValue();
        ndd nddVar = (ndd) ((gme) this.X).getValue();
        if (nddVar != null) {
            nddVar.e(ax1Var.c(), this.a0, j, f2);
            nddVar.draw(z40.a(ww1VarA));
        }
    }

    @Override // defpackage.k0d
    public final void d() {
        ldd lddVar = this.W;
        if (lddVar != null) {
            g1();
            gg1 gg1Var = lddVar.d;
            ndd nddVar = (ndd) ((LinkedHashMap) gg1Var.a).get(this);
            if (nddVar != null) {
                nddVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) gg1Var.a;
                ndd nddVar2 = (ndd) linkedHashMap.get(this);
                if (nddVar2 != null) {
                }
                linkedHashMap.remove(this);
                lddVar.c.add(nddVar);
            }
        }
    }

    @Override // defpackage.k0d
    public final void e() {
        ldd lddVar = this.W;
        if (lddVar != null) {
            g1();
            gg1 gg1Var = lddVar.d;
            ndd nddVar = (ndd) ((LinkedHashMap) gg1Var.a).get(this);
            if (nddVar != null) {
                nddVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) gg1Var.a;
                ndd nddVar2 = (ndd) linkedHashMap.get(this);
                if (nddVar2 != null) {
                }
                linkedHashMap.remove(this);
                lddVar.c.add(nddVar);
            }
        }
    }

    @Override // defpackage.pdd
    public final void f() {
        ndd nddVar = (ndd) ((gme) this.X).getValue();
        if (nddVar != null) {
            nddVar.d();
        }
    }

    @Override // defpackage.mdd
    public final void g1() {
        ((gme) this.X).setValue(null);
    }
}
