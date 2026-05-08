package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class kod implements d65<p3h> {
    public final Provider<Context> a;
    public final Provider<q05> b;
    public final jod c;

    public kod(Provider provider, Provider provider2, jod jodVar) {
        this.a = provider;
        this.b = provider2;
        this.c = jodVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new uy7(this.a.get(), this.b.get(), (hod) this.c.get());
    }
}
