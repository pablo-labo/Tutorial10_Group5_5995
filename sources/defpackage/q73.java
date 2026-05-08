package defpackage;

import defpackage.y52;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q73 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q73(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((gme) ((csf) obj).d).getValue();
            case 1:
                v04 v04Var = (v04) obj;
                ax9 ax9Var = v04Var.X;
                ax9 ax9Var2 = ax9.c;
                if (ax9Var == ax9Var2) {
                    List<Integer> listE0 = v04Var.e.E0();
                    listE0.getClass();
                    if (!listE0.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Integer num : listE0) {
                            h04 h04Var = v04Var.a0;
                            g04 g04Var = h04Var.a;
                            o8a o8aVar = h04Var.b;
                            num.getClass();
                            a62 a62VarA = q8a.a(o8aVar, num.intValue());
                            y52 y52Var = g04Var.t;
                            Set<a62> set = y52.c;
                            y52Var.getClass();
                            t52 t52Var = (t52) y52Var.b.invoke(new y52.a(a62VarA, null));
                            if (t52Var != null) {
                                arrayList.add(t52Var);
                            }
                        }
                        return arrayList;
                    }
                    if (ax9Var == ax9Var2) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        aj3 aj3Var = v04Var.f0;
                        if (aj3Var instanceof lya) {
                            g72.J1(v04Var, linkedHashSet, ((lya) aj3Var).n(), false);
                        }
                        in9 in9VarT = v04Var.T();
                        in9VarT.getClass();
                        g72.J1(v04Var, linkedHashSet, in9VarT, true);
                        return z92.p1(linkedHashSet, new f72(i2));
                    }
                }
                return zr4.a;
            case 2:
                return ((wf8) obj).D();
            default:
                ArrayList arrayList2 = ((q7b) obj).a;
                z3a z3aVar = new z3a(arrayList2.size());
                int size = arrayList2.size();
                while (i2 < size) {
                    qg8 qg8Var = (qg8) arrayList2.get(i2);
                    Object obj2 = qg8Var.b;
                    int i3 = qg8Var.a;
                    v1a.a(z3aVar, obj2 != null ? new v88(Integer.valueOf(i3), qg8Var.b) : Integer.valueOf(i3), qg8Var);
                    i2++;
                }
                return new v1a(z3aVar);
        }
    }
}
