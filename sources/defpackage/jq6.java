package defpackage;

import androidx.compose.runtime.p;
import androidx.compose.runtime.r;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.xh8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljq6;", "Lbrg;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jq6 extends brg implements xh8 {
    public final g4a V;
    public final c3a W;
    public final g4a X;
    public final g4a Y;
    public final g4a Z;
    public final g4a a0;
    public final g4a b;
    public final p24 b0;
    public final g3a<jz2<Boolean>> c;
    public final g3a c0;
    public final g3a d;
    public IanMainFragment d0;
    public final g4a e;
    public final g4a f;

    public jq6() {
        g4a g4aVarF;
        Boolean bool = Boolean.FALSE;
        this.b = r.f(bool);
        g3a<jz2<Boolean>> g3aVar = new g3a<>();
        this.c = g3aVar;
        this.d = g3aVar;
        this.e = r.f(bool);
        dd4 dd4Var = dd4.a;
        this.f = dd4.f() ? r.f(xj1.X) : r.f(xj1.b);
        g4a g4aVarF2 = r.f(0);
        this.V = g4aVarF2;
        this.W = p.a(0);
        if (dd4.f()) {
            g4aVarF = dd4.g() ? r.f(ut0.i0(new wj1[]{y88.d, c98.d, b98.d, e98.d})) : r.f(ut0.i0(new wj1[]{y88.d, w88.d, c98.d, e98.d}));
        } else if (((h2g) cr8.p(h2g.class)).a()) {
            g4aVarF = r.f(ut0.i0(new wj1[]{dj6.d, lud.d, e7.d, y7a.d, zp9.d}));
        } else {
            e7 e7Var = ((h2g) cr8.p(h2g.class)).h() ? e7.d : null;
            zp9 zp9Var = zp9.d;
            ((gme) zp9Var.c).setValue(Integer.valueOf(((Number) ((gme) g4aVarF2).getValue()).intValue()));
            j6g j6gVar = j6g.a;
            g4aVarF = r.f(ut0.i0(new wj1[]{dj6.d, y7a.d, e7Var, zp9Var, sxb.d}));
        }
        this.X = g4aVarF;
        this.Y = r.f(bool);
        this.Z = r.f(Boolean.TRUE);
        this.a0 = r.f(0);
        this.b0 = new p24(g());
        this.c0 = new g3a();
    }

    public final xj1 g() {
        return (xj1) ((gme) this.f).getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final xj1 h() {
        return j() ? xj1.f : g();
    }

    public final boolean i() {
        return (j() || ((Boolean) ((gme) this.Y).getValue()).booleanValue()) ? false : true;
    }

    public final boolean j() {
        return ((Boolean) ((gme) this.b).getValue()).booleanValue();
    }

    public final void k(boolean z, boolean z2) {
        g4a g4aVar = this.Z;
        g4a g4aVar2 = this.Y;
        if (z) {
            ((gme) g4aVar2).setValue(Boolean.FALSE);
            ((gme) g4aVar).setValue(Boolean.valueOf(z2));
            return;
        }
        boolean z3 = h() == xj1.b;
        boolean z4 = h() == xj1.e;
        if (z3 || (((h2g) cr8.p(h2g.class)).a() && z4)) {
            ((gme) g4aVar2).setValue(Boolean.TRUE);
            ((gme) g4aVar).setValue(Boolean.valueOf(z2));
        }
    }

    public final void l(boolean z) {
        ((gme) this.b).setValue(Boolean.valueOf(z));
    }

    public final void m(xj1 xj1Var) {
        xj1Var.getClass();
        if (((h2g) cr8.p(h2g.class)).i()) {
            p24 p24Var = this.b0;
            p24Var.getClass();
            zs0 zs0Var = (zs0) p24Var.b;
            zs0Var.remove(xj1Var);
            zs0Var.addFirst(xj1Var);
            Object objLast = zs0Var.last();
            xj1 xj1Var2 = (xj1) p24Var.c;
            if (objLast != xj1Var2) {
                zs0Var.addLast(xj1Var2);
            }
        }
        ((gme) this.f).setValue(xj1Var);
    }
}
