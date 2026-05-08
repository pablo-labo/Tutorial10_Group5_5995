package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class jhg implements d65<ihg> {
    public final Provider<Context> a;
    public final Provider<k71> b;
    public final Provider<q05> c;
    public final kod d;
    public final Provider<Executor> e;
    public final Provider<c2f> f;
    public final Provider<s72> g;

    public jhg(Provider provider, Provider provider2, Provider provider3, kod kodVar, Provider provider4, Provider provider5, Provider provider6) {
        this.a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = kodVar;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ihg(this.a.get(), this.b.get(), this.c.get(), (p3h) this.d.get(), this.e.get(), this.f.get(), new dmc(), new zkd(26), this.g.get());
    }
}
