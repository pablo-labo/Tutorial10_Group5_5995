package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lu8 {
    public final g4a A;
    public final g4a B;
    public qdf a;
    public final usc b;
    public final hne c;
    public final j04 d;
    public whf e;
    public final g4a f;
    public final g4a g;
    public sl8 h;
    public final g4a<nif> i;
    public le0 j;
    public final g4a k;
    public final g4a l;
    public final g4a m;
    public final g4a n;
    public final g4a o;
    public boolean p;
    public final g4a q;
    public final wg8 r;
    public final g4a s;
    public final g4a t;
    public Function1<? super jhf, j6g> u;
    public final pq v;
    public final or w;
    public final fj x;
    public final f80 y;
    public long z;

    public lu8(qdf qdfVar, usc uscVar, hne hneVar) {
        this.a = qdfVar;
        this.b = uscVar;
        this.c = hneVar;
        j04 j04Var = new j04();
        le0 le0Var = me0.a;
        long j = kjf.b;
        jhf jhfVar = new jhf(le0Var, j, (kjf) null);
        j04Var.a = jhfVar;
        j04Var.b = new co4(le0Var, jhfVar.b);
        this.d = j04Var;
        Boolean bool = Boolean.FALSE;
        this.f = r.f(bool);
        this.g = r.f(new j94(0.0f));
        this.i = r.f(null);
        this.k = r.f(mf6.a);
        this.l = r.f(bool);
        this.m = r.f(bool);
        this.n = r.f(bool);
        this.o = r.f(bool);
        this.p = true;
        this.q = r.f(Boolean.TRUE);
        this.r = new wg8(hneVar);
        this.s = r.f(bool);
        this.t = r.f(bool);
        this.u = new ju(7);
        int i = 11;
        this.v = new pq(this, i);
        this.w = new or(this, i);
        this.x = new fj(this, 9);
        this.y = g80.a();
        this.z = da2.i;
        this.A = r.f(new kjf(j));
        this.B = r.f(new kjf(j));
    }

    public final mf6 a() {
        return (mf6) ((gme) this.k).getValue();
    }

    public final boolean b() {
        return ((Boolean) ((gme) this.f).getValue()).booleanValue();
    }

    public final sl8 c() {
        sl8 sl8Var = this.h;
        if (sl8Var == null || !sl8Var.d()) {
            return null;
        }
        return sl8Var;
    }

    public final nif d() {
        return (nif) ((gme) this.i).getValue();
    }

    public final void e(long j) {
        ((gme) this.B).setValue(new kjf(j));
    }

    public final void f(long j) {
        ((gme) this.A).setValue(new kjf(j));
    }
}
