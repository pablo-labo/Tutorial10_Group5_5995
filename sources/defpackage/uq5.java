package defpackage;

import defpackage.kv8;

/* JADX INFO: loaded from: classes2.dex */
public final class uq5 implements uv8 {
    public final /* synthetic */ wm2 a;

    public uq5(wm2 wm2Var) {
        this.a = wm2Var;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        if (aVar == kv8.a.ON_DESTROY) {
            this.a.a = null;
        }
    }
}
