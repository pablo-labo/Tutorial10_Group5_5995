package defpackage;

import defpackage.ewc;
import defpackage.ke8;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class de8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ de8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ke8.a aVar = (ke8.a) obj;
                Collection<wd8<?>> collectionA = aVar.a();
                ewc.a aVar2 = aVar.l;
                qf8<Object> qf8Var = ke8.a.q[10];
                Object objInvoke = aVar2.invoke();
                objInvoke.getClass();
                return z92.h1(collectionA, (Collection) objInvoke);
            case 1:
                kte kteVar = (kte) obj;
                return kteVar.c ? u63.b0(jz3.e(kteVar.b)) : zr4.a;
            default:
                return lx4.c(kx4.l0, ((vxf) obj).toString());
        }
    }
}
