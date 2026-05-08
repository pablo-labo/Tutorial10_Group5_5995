package defpackage;

import defpackage.t05;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class hid implements d65<fid> {
    public final Provider<bpd> a;
    public final Provider<String> b;

    public hid(Provider provider, Provider provider2) {
        this.a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new fid(new dmc(), new zkd(26), (z21) t05.a.a.get(), this.a.get(), this.b);
    }
}
