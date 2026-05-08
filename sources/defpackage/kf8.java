package defpackage;

import defpackage.ewc;
import defpackage.lf8;
import defpackage.te8;

/* JADX INFO: loaded from: classes3.dex */
public final class kf8 implements gu5 {
    public final lf8 a;
    public final lf8.a b;

    public kf8(lf8 lf8Var, lf8.a aVar) {
        this.a = lf8Var;
        this.b = aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        ewc.a aVar = this.b.d;
        qf8<Object> qf8Var = lf8.a.g[1];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        te8.c cVar = te8.c.a;
        return this.a.x((in9) objInvoke, cVar);
    }
}
