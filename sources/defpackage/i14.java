package defpackage;

import defpackage.hf8;
import defpackage.kz3;
import defpackage.te8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i14 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ i14(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                j14 j14Var = (j14) obj;
                Set<n8a> setN = j14Var.n();
                if (setN == null) {
                    return null;
                }
                return bbe.o(bbe.o(j14Var.m(), j14Var.c.f()), setN);
            case 1:
                ke8 ke8Var = (ke8) obj;
                in9 in9VarL0 = ke8Var.getDescriptor().l0();
                in9VarL0.getClass();
                return ke8Var.x(in9VarL0, te8.c.a);
            case 2:
                return new hf8.a((hf8) obj);
            case 3:
                qp8 qp8Var = (qp8) obj;
                lz3 lz3Var = lz3.m;
                in9.a.getClass();
                zz3 zz3Var = zz3.c;
                lz3Var.getClass();
                List<kz3> list = lz3Var.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = lz3Var.a(lz3.l);
                dia diaVar = dia.d;
                if (zA) {
                    for (n8a n8aVar : qp8Var.h(lz3Var, zz3Var)) {
                        zz3Var.invoke(n8aVar);
                        v62 v62VarD = qp8Var.d(n8aVar, diaVar);
                        if (v62VarD != null) {
                            linkedHashSet.add(v62VarD);
                        }
                    }
                }
                if (lz3Var.a(lz3.i) && !list.contains(kz3.a.a)) {
                    for (n8a n8aVar2 : qp8Var.i(lz3Var, zz3Var)) {
                        zz3Var.invoke(n8aVar2);
                        linkedHashSet.addAll(qp8Var.e(n8aVar2, diaVar));
                    }
                }
                if (lz3Var.a(lz3.j) && !list.contains(kz3.a.a)) {
                    for (n8a n8aVar3 : qp8Var.o(lz3Var)) {
                        zz3Var.invoke(n8aVar3);
                        linkedHashSet.addAll(qp8Var.b(n8aVar3, diaVar));
                    }
                }
                return z92.z1(linkedHashSet);
            case 4:
                return (ArrayList) obj;
            case 5:
                return bnb.a((bnb) obj);
            default:
                cqd cqdVar = (cqd) obj;
                return (in9) cqdVar.b.invoke(cqdVar.c);
        }
    }
}
