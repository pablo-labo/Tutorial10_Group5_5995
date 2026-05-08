package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class cpd implements d65<bpd> {
    public final Provider<Context> a;

    public cpd(Provider provider) {
        this.a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new bpd(this.a.get(), "com.google.android.datatransport.events", Integer.valueOf(bpd.d).intValue());
    }
}
