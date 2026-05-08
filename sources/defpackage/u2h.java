package defpackage;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class u2h implements d65<t2h> {
    public final Provider<Executor> a;
    public final Provider<q05> b;
    public final kod c;
    public final Provider<c2f> d;

    public u2h(Provider provider, Provider provider2, kod kodVar, Provider provider3) {
        this.a = provider;
        this.b = provider2;
        this.c = kodVar;
        this.d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t2h(this.a.get(), this.b.get(), (p3h) this.c.get(), this.d.get());
    }
}
