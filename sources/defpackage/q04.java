package defpackage;

import defpackage.ke8;
import defpackage.ke9;
import defpackage.mf8;
import defpackage.wd8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q04 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IOException {
        int i;
        int i2 = this.a;
        int i3 = 1;
        Object obj = this.b;
        switch (i2) {
            case 0:
                v04 v04Var = (v04) obj;
                return z92.z1(v04Var.a0.a.e.f(v04Var.l0));
            case 1:
                ic8 ic8Var = (ic8) obj;
                iy8 iy8VarS = u63.s();
                iy8VarS.add(ic8Var.a.a());
                v2d v2dVar = ic8Var.b;
                if (v2dVar != null) {
                    iy8VarS.add("under-migration:" + v2dVar.a());
                }
                for (Map.Entry<mq5, v2d> entry : ic8Var.c.entrySet()) {
                    iy8VarS.add("@" + entry.getKey() + ':' + entry.getValue().a());
                }
                return (String[]) iy8VarS.l().toArray(new String[0]);
            case 2:
                wd8 wd8Var = (wd8) obj;
                hv1 hv1VarZ = wd8Var.z();
                ArrayList arrayList = new ArrayList();
                if (wd8Var.C()) {
                    i = 0;
                } else {
                    hsc hscVarG = akg.g(hv1VarZ);
                    int i4 = 2;
                    if (hscVarG != null) {
                        arrayList.add(new of8(wd8Var, 0, mf8.a.a, new r4(hscVarG, i4)));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    hsc hscVarO = hv1VarZ.O();
                    if (hscVarO != null) {
                        arrayList.add(new of8(wd8Var, i, mf8.a.b, new x04(hscVarO, i4)));
                        i++;
                    }
                }
                int size = hv1VarZ.i().size();
                int i5 = 0;
                while (i5 < size) {
                    arrayList.add(new of8(wd8Var, i, mf8.a.c, new vd8(hv1VarZ, i5, 0)));
                    i5++;
                    i++;
                }
                if (wd8Var.B() && (hv1VarZ instanceof mu7) && arrayList.size() > 1) {
                    w92.E0(new wd8.a(), arrayList);
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                Collection<t52> collectionX = ((ke8.a) obj).b().x();
                collectionX.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (t52 t52Var : collectionX) {
                    t52Var.getClass();
                    Class<?> clsJ = akg.j(t52Var);
                    ke8 ke8Var = clsJ != null ? new ke8(clsJ) : null;
                    if (ke8Var != null) {
                        arrayList2.add(ke8Var);
                    }
                }
                return arrayList2;
            case 4:
                xf8 xf8Var = (xf8) obj;
                te8 te8Var = xf8Var.V;
                String str = xf8Var.W;
                String str2 = xf8Var.X;
                te8Var.getClass();
                str.getClass();
                str2.getClass();
                ke9 ke9VarC = te8.a.c(str2);
                if (ke9VarC != null) {
                    String str3 = (String) ((ke9.a) ke9VarC.a()).get(1);
                    d4c d4cVarW = te8Var.w(Integer.parseInt(str3));
                    if (d4cVarW != null) {
                        return d4cVarW;
                    }
                    StringBuilder sbM = akb.m("Local property #", str3, " not found in ");
                    sbM.append(te8Var.j());
                    throw new qi8(sbM.toString());
                }
                Collection<d4c> collectionZ = te8Var.z(n8a.h(str));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : collectionZ) {
                    if (wl7.b(rhd.b((d4c) obj2).a(), str2)) {
                        arrayList3.add(obj2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    StringBuilder sbF = u40.f("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                    sbF.append(te8Var);
                    throw new qi8(sbF.toString());
                }
                if (arrayList3.size() == 1) {
                    return (d4c) z92.k1(arrayList3);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList3) {
                    e04 visibility = ((d4c) obj3).getVisibility();
                    Object arrayList4 = linkedHashMap.get(visibility);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList4);
                    }
                    ((List) arrayList4).add(obj3);
                }
                Collection collectionValues = kc9.X(linkedHashMap, new en5(i3)).values();
                collectionValues.getClass();
                List list = (List) z92.X0(collectionValues);
                if (list.size() == 1) {
                    return (d4c) z92.O0(list);
                }
                String strW0 = z92.W0(te8Var.z(n8a.h(str)), "\n", null, null, op1.d, 30);
                StringBuilder sbF2 = u40.f("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbF2.append(te8Var);
                sbF2.append(':');
                sbF2.append(strW0.length() == 0 ? " no members found" : "\n".concat(strW0));
                throw new qi8(sbF2.toString());
            default:
                return ewa.L(((hre) obj).a);
        }
    }
}
