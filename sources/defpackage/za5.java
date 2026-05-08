package defpackage;

import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class za5 implements hc8 {
    public final hc8 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public za5(hc8 hc8Var) {
        this.a = hc8Var;
    }

    @Override // defpackage.hc8
    public final hc8 C(zgg zggVar) {
        zggVar.getClass();
        hc8 hc8Var = this.a;
        this.b.put(hc8Var.c(), zggVar);
        hc8Var.H1();
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 E(long j) {
        this.a.E(j);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 F(int i) {
        this.a.F(i);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 H1() {
        this.a.H1();
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 K(double d) {
        this.a.K(d);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 M0(za8 za8Var) {
        za8Var.getClass();
        this.a.M0(za8Var);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 T0(String str) {
        str.getClass();
        this.a.T0(str);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 V(boolean z) {
        this.a.V(z);
        return this;
    }

    @Override // defpackage.hc8
    public final String c() {
        return this.a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.hc8
    public final hc8 j() {
        this.a.j();
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 l() {
        this.a.l();
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 m() {
        this.a.m();
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 t() {
        this.a.t();
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 u0(String str) {
        str.getClass();
        this.a.u0(str);
        return this;
    }
}
