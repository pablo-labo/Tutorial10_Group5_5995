package defpackage;

import defpackage.sv5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bp1 implements v52 {
    public final j29 a;
    public final xx9 b;

    public bp1(j29 j29Var, yx9 yx9Var) {
        yx9Var.getClass();
        this.a = j29Var;
        this.b = yx9Var;
    }

    @Override // defpackage.v52
    public final t52 a(a62 a62Var) {
        mq5 mq5Var;
        sv5.a aVarA;
        a62Var.getClass();
        if (a62Var.c || a62Var.g()) {
            return null;
        }
        String str = a62Var.b.a.a;
        if (!zve.L(str, "Function", false) || (aVarA = sv5.c.a((mq5Var = a62Var.a), str)) == null) {
            return null;
        }
        rv5 rv5Var = aVarA.a;
        int i = aVarA.b;
        List<lya> listH0 = this.b.S(mq5Var).h0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH0) {
            if (obj instanceof ip1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof nv5) {
                arrayList2.add(obj2);
            }
        }
        ip1 ip1Var = (nv5) z92.Q0(arrayList2);
        if (ip1Var == null) {
            ip1Var = (ip1) z92.O0(arrayList);
        }
        return new hv5(this.a, ip1Var, rv5Var, i);
    }

    @Override // defpackage.v52
    public final Collection<t52> b(mq5 mq5Var) {
        mq5Var.getClass();
        return is4.a;
    }

    @Override // defpackage.v52
    public final boolean c(mq5 mq5Var, n8a n8aVar) {
        mq5Var.getClass();
        n8aVar.getClass();
        String strC = n8aVar.c();
        strC.getClass();
        return (wve.K(strC, "Function", false) || wve.K(strC, "KFunction", false) || wve.K(strC, "SuspendFunction", false) || wve.K(strC, "KSuspendFunction", false)) && sv5.c.a(mq5Var, strC) != null;
    }
}
