package defpackage;

import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class hre extends xxf {
    public final rxf a;
    public final Lazy b;

    public hre(rxf rxfVar) {
        rxfVar.getClass();
        this.a = rxfVar;
        this.b = boa.E(qt8.b, new q04(this, 5));
    }

    @Override // defpackage.wxf
    public final wxf a(bj8 bj8Var) {
        bj8Var.getClass();
        return this;
    }

    @Override // defpackage.wxf
    public final boolean b() {
        return true;
    }

    @Override // defpackage.wxf
    public final ylg c() {
        return ylg.OUT_VARIANCE;
    }

    @Override // defpackage.wxf
    public final ui8 getType() {
        return (ui8) this.b.getValue();
    }
}
