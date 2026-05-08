package defpackage;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class gq3 implements d65<fq3> {
    public final Provider<Executor> a;
    public final Provider<k71> b;
    public final kod c;
    public final Provider<q05> d;
    public final Provider<c2f> e;

    public gq3(Provider provider, Provider provider2, kod kodVar, Provider provider3, Provider provider4) {
        this.a = provider;
        this.b = provider2;
        this.c = kodVar;
        this.d = provider3;
        this.e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new fq3(this.a.get(), this.b.get(), (p3h) this.c.get(), this.d.get(), this.e.get());
    }
}
