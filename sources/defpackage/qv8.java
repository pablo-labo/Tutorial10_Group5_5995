package defpackage;

import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final class qv8 extends ov8 implements uv8 {
    public final kv8 a;
    public final v03 b;

    public qv8(kv8 kv8Var, v03 v03Var) {
        v03Var.getClass();
        this.a = kv8Var;
        this.b = v03Var;
        if (kv8Var.b() == kv8.b.a) {
            u63.o(v03Var, null);
        }
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        kv8 kv8Var = this.a;
        if (kv8Var.b().compareTo(kv8.b.a) <= 0) {
            kv8Var.c(this);
            u63.o(this.b, null);
        }
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        return this.b;
    }
}
