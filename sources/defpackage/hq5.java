package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class hq5 extends kmf {
    public kmf e;

    public hq5(kmf kmfVar) {
        kmfVar.getClass();
        this.e = kmfVar;
    }

    @Override // defpackage.kmf
    public final kmf a() {
        return this.e.a();
    }

    @Override // defpackage.kmf
    public final kmf b() {
        return this.e.b();
    }

    @Override // defpackage.kmf
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.kmf
    public final kmf d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.kmf
    /* JADX INFO: renamed from: e */
    public final boolean getA() {
        return this.e.getA();
    }

    @Override // defpackage.kmf
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.kmf
    public final kmf g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.e.g(j, timeUnit);
    }

    @Override // defpackage.kmf
    /* JADX INFO: renamed from: h */
    public final long getC() {
        return this.e.getC();
    }
}
