package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class o63 implements d65<n63> {
    public final ig7 a;

    public o63(ig7 ig7Var) {
        this.a = ig7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n63((Context) this.a.a, new dmc(), new zkd(26));
    }
}
