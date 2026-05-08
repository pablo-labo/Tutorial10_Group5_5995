package defpackage;

import defpackage.u2e;

/* JADX INFO: loaded from: classes.dex */
public final class i3e implements udf {
    public long a = 0;
    public long b = 0;
    public final /* synthetic */ la c;
    public final /* synthetic */ n4e d;
    public final /* synthetic */ long e;

    public i3e(la laVar, n4e n4eVar, long j) {
        this.c = laVar;
        this.d = n4eVar;
        this.e = j;
    }

    @Override // defpackage.udf
    public final void a() {
    }

    @Override // defpackage.udf
    public final void b(long j) {
        sl8 sl8Var = (sl8) this.c.invoke();
        n4e n4eVar = this.d;
        if (sl8Var != null) {
            if (!sl8Var.d()) {
                return;
            }
            n4eVar.g(sl8Var, j, u2e.a.b, true);
            this.a = j;
        }
        if (q4e.a(n4eVar, this.e)) {
            this.b = 0L;
        }
    }

    @Override // defpackage.udf
    public final void c() {
    }

    @Override // defpackage.udf
    public final void d(long j) {
        sl8 sl8Var = (sl8) this.c.invoke();
        if (sl8Var == null || !sl8Var.d()) {
            return;
        }
        n4e n4eVar = this.d;
        if (q4e.a(n4eVar, this.e)) {
            long jF = ooa.f(this.b, j);
            this.b = jF;
            long jF2 = ooa.f(this.a, jF);
            if (n4eVar.i(sl8Var, jF2, this.a, u2e.a.b, true)) {
                this.a = jF2;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.udf
    public final void onCancel() {
        long j = this.e;
        n4e n4eVar = this.d;
        if (q4e.a(n4eVar, j)) {
            n4eVar.h();
        }
    }

    @Override // defpackage.udf
    public final void onStop() {
        long j = this.e;
        n4e n4eVar = this.d;
        if (q4e.a(n4eVar, j)) {
            n4eVar.h();
        }
    }
}
