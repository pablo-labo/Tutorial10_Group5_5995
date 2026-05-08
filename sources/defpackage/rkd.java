package defpackage;

import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final class rkd implements uv8 {
    public final xkd a;

    public rkd(xkd xkdVar) {
        this.a = xkdVar;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        if (aVar != kv8.a.ON_CREATE) {
            r40.g(aVar, "Next event must be ON_CREATE, it was ");
        } else {
            zv8Var.getLifecycle().c(this);
            this.a.b();
        }
    }
}
