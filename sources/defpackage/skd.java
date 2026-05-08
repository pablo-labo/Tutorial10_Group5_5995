package defpackage;

import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final class skd implements uv8, AutoCloseable {
    public final String a;
    public final qkd b;
    public boolean c;

    public skd(String str, qkd qkdVar) {
        this.a = str;
        this.b = qkdVar;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        if (aVar == kv8.a.ON_DESTROY) {
            this.c = false;
            zv8Var.getLifecycle().c(this);
        }
    }

    public final void a(kv8 kv8Var, ald aldVar) {
        aldVar.getClass();
        kv8Var.getClass();
        if (this.c) {
            r6.g("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        kv8Var.a(this);
        aldVar.c(this.a, this.b.b.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
