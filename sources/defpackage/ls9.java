package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ls9 implements d65<ks9> {
    public final ig7 a;
    public final o63 b;

    public ls9(ig7 ig7Var, o63 o63Var) {
        this.a = ig7Var;
        this.b = o63Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new ks9((Context) this.a.a, (n63) this.b.get());
    }
}
