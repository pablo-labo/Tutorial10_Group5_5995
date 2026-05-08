package defpackage;

import defpackage.gq2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sd6 {
    public static dzg a(gq2 gq2Var, int i, ArrayList<dzg> arrayList, dzg dzgVar) {
        int i2;
        int i3 = i == 0 ? gq2Var.o0 : gq2Var.p0;
        if (i3 != -1 && (dzgVar == null || i3 != dzgVar.b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                dzg dzgVar2 = arrayList.get(i4);
                if (dzgVar2.b == i3) {
                    if (dzgVar != null) {
                        dzgVar.c(i, dzgVar2);
                        arrayList.remove(dzgVar);
                    }
                    dzgVar = dzgVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return dzgVar;
        }
        if (dzgVar == null) {
            if (gq2Var instanceof oh6) {
                oh6 oh6Var = (oh6) gq2Var;
                int i5 = 0;
                while (true) {
                    if (i5 >= oh6Var.r0) {
                        i2 = -1;
                        break;
                    }
                    gq2 gq2Var2 = oh6Var.q0[i5];
                    if ((i == 0 && (i2 = gq2Var2.o0) != -1) || (i == 1 && (i2 = gq2Var2.p0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        dzg dzgVar3 = arrayList.get(i6);
                        if (dzgVar3.b == i2) {
                            dzgVar = dzgVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (dzgVar == null) {
                dzgVar = new dzg();
                dzgVar.a = new ArrayList<>();
                dzgVar.d = null;
                dzgVar.e = -1;
                int i7 = dzg.f;
                dzg.f = i7 + 1;
                dzgVar.b = i7;
                dzgVar.c = i;
            }
            arrayList.add(dzgVar);
        }
        ArrayList<gq2> arrayList2 = dzgVar.a;
        if (arrayList2.contains(gq2Var)) {
            return dzgVar;
        }
        arrayList2.add(gq2Var);
        if (gq2Var instanceof fe6) {
            fe6 fe6Var = (fe6) gq2Var;
            fe6Var.t0.b(fe6Var.u0 == 0 ? 1 : 0, dzgVar, arrayList);
        }
        int i8 = dzgVar.b;
        if (i == 0) {
            gq2Var.o0 = i8;
            gq2Var.I.b(i, dzgVar, arrayList);
            gq2Var.K.b(i, dzgVar, arrayList);
        } else {
            gq2Var.p0 = i8;
            gq2Var.J.b(i, dzgVar, arrayList);
            gq2Var.M.b(i, dzgVar, arrayList);
            gq2Var.L.b(i, dzgVar, arrayList);
        }
        gq2Var.P.b(i, dzgVar, arrayList);
        return dzgVar;
    }

    public static boolean b(gq2.a aVar, gq2.a aVar2, gq2.a aVar3, gq2.a aVar4) {
        gq2.a aVar5 = gq2.a.d;
        gq2.a aVar6 = gq2.a.b;
        gq2.a aVar7 = gq2.a.a;
        return (aVar3 == aVar7 || aVar3 == aVar6 || (aVar3 == aVar5 && aVar != aVar6)) || (aVar4 == aVar7 || aVar4 == aVar6 || (aVar4 == aVar5 && aVar2 != aVar6));
    }
}
