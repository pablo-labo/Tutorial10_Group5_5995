package defpackage;

import defpackage.awc;
import defpackage.ewc;
import defpackage.ke8;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class be8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ be8(Object obj, int i) {
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
                ewc.a aVar2 = aVar.m;
                qf8<Object> qf8Var = ke8.a.q[11];
                Object objInvoke = aVar2.invoke();
                objInvoke.getClass();
                return z92.h1(collectionA, (Collection) objInvoke);
            case 1:
                return awc.a.a(((lf8) obj).b);
            case 2:
                yo8 yo8Var = (yo8) obj;
                ArrayList<gu7> arrayListG = yo8Var.b.g();
                ArrayList arrayList = new ArrayList();
                for (gu7 gu7Var : arrayListG) {
                    n8a name = gu7Var.getName();
                    if (name == null) {
                        name = kc8.b;
                    }
                    up2<?> up2VarB = yo8Var.b(gu7Var);
                    Pair pair = up2VarB != null ? new Pair(name, up2VarB) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return lc9.f0(arrayList);
            default:
                return ((qp8) obj).k();
        }
    }
}
