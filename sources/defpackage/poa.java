package defpackage;

import androidx.compose.runtime.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class poa implements nr0, nmg {
    public final int a;
    public int b;
    public final Object c;

    public poa(int i, int i2, af4 af4Var) {
        this.a = i;
        this.b = i2;
        this.c = new pmg(new gi5(i, i2, af4Var));
    }

    @Override // defpackage.nr0
    public void b(Object obj, Function2 function2) {
        ((nr0) this.c).b(obj, function2);
    }

    @Override // defpackage.nr0
    public Object c() {
        return ((nr0) this.c).c();
    }

    @Override // defpackage.nr0
    public void clear() {
        d.c("Clear is not valid on OffsetApplier");
    }

    @Override // defpackage.nr0
    public void e(int i, int i2, int i3) {
        int i4 = this.b == 0 ? this.a : 0;
        ((nr0) this.c).e(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.nr0
    public void f(int i, int i2) {
        ((nr0) this.c).f(i + (this.b == 0 ? this.a : 0), i2);
    }

    @Override // defpackage.nr0
    public void g(int i, Object obj) {
        ((nr0) this.c).g(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.nmg
    public int i() {
        return this.b;
    }

    @Override // defpackage.nmg
    public int j() {
        return this.a;
    }

    @Override // defpackage.nr0
    public void l(int i, Object obj) {
        ((nr0) this.c).l(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.nr0
    public void m(Object obj) {
        this.b++;
        ((nr0) this.c).m(obj);
    }

    @Override // defpackage.nr0
    public void n() {
        ((nr0) this.c).n();
    }

    @Override // defpackage.lmg
    public ge0 o(long j, ge0 ge0Var, ge0 ge0Var2, ge0 ge0Var3) {
        return ((pmg) this.c).o(j, ge0Var, ge0Var2, ge0Var3);
    }

    @Override // defpackage.nr0
    public void p() {
        if (this.b <= 0) {
            d.c("OffsetApplier up called with no corresponding down");
        }
        this.b--;
        ((nr0) this.c).p();
    }

    @Override // defpackage.lmg
    public ge0 q(long j, ge0 ge0Var, ge0 ge0Var2, ge0 ge0Var3) {
        return ((pmg) this.c).q(j, ge0Var, ge0Var2, ge0Var3);
    }

    public poa(nr0 nr0Var, int i) {
        this.c = nr0Var;
        this.a = i;
    }
}
