package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class pp8 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pp8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qp8 qp8Var = (qp8) obj2;
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                ArrayList arrayList = new ArrayList();
                d4c d4cVarInvoke = qp8Var.g.invoke(n8aVar);
                if (d4cVarInvoke != null) {
                    arrayList.add(d4cVarInvoke);
                }
                qp8Var.n(n8aVar, arrayList);
                aj3 aj3VarQ = qp8Var.q();
                int i2 = yz3.a;
                if (yz3.n(aj3VarQ, c62.ANNOTATION_CLASS)) {
                    return z92.z1(arrayList);
                }
                mp8 mp8Var = qp8Var.b;
                return z92.z1(mp8Var.a.r.c(mp8Var, arrayList));
            case 1:
                return ((Function1) obj2).invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                if (ug8.a.a(((ng8) obj).a) == mg8.COPY) {
                    ((j4e) obj2).c();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
