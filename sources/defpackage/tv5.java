package defpackage;

import defpackage.ere;
import defpackage.lf0;
import defpackage.rv5;
import defpackage.sv5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class tv5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(ui8 ui8Var) {
        ui8Var.getClass();
        af0 af0VarP = ui8Var.getAnnotations().p(ere.a.q);
        if (af0VarP == null) {
            return 0;
        }
        up2 up2Var = (up2) lc9.Y(ere.e, af0VarP.i());
        up2Var.getClass();
        return ((Number) ((wh7) up2Var).a).intValue();
    }

    public static final mge b(ei8 ei8Var, lf0 lf0Var, ui8 ui8Var, List list, ArrayList arrayList, ui8 ui8Var2, boolean z) {
        t52 t52VarK;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (ui8Var != null ? 1 : 0) + 1);
        List<ui8> list2 = list;
        ArrayList arrayList3 = new ArrayList(t92.r0(list2, 10));
        for (ui8 ui8Var3 : list2) {
            ui8Var3.getClass();
            arrayList3.add(new yxf(ui8Var3));
        }
        arrayList2.addAll(arrayList3);
        yxf yxfVar = ui8Var != null ? new yxf(ui8Var) : null;
        if (yxfVar != null) {
            arrayList2.add(yxfVar);
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                u63.o0();
                throw null;
            }
            ui8 ui8Var4 = (ui8) obj;
            ui8Var4.getClass();
            arrayList2.add(new yxf(ui8Var4));
            i = i2;
        }
        arrayList2.add(new yxf(ui8Var2));
        int size = list.size() + arrayList.size() + (ui8Var != null ? 1 : 0);
        if (z) {
            t52VarK = ei8Var.w(size);
        } else {
            n8a n8aVar = ere.a;
            t52VarK = ei8Var.k("Function" + size);
        }
        lf0 nf0Var = lf0.a.a;
        if (ui8Var != null) {
            mq5 mq5Var = ere.a.p;
            if (!lf0Var.P0(mq5Var)) {
                ArrayList arrayListF1 = z92.f1(lf0Var, new zo1(ei8Var, mq5Var, bs4.a));
                lf0Var = arrayListF1.isEmpty() ? nf0Var : new nf0(arrayListF1);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            mq5 mq5Var2 = ere.a.q;
            if (!lf0Var.P0(mq5Var2)) {
                ArrayList arrayListF12 = z92.f1(lf0Var, new zo1(ei8Var, mq5Var2, kc9.W(new Pair(ere.e, new wh7(size2)))));
                if (!arrayListF12.isEmpty()) {
                    nf0Var = new nf0(arrayListF12);
                }
                lf0Var = nf0Var;
            }
        }
        return yi8.b(hwf.d(lf0Var), t52VarK, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final n8a c(ui8 ui8Var) {
        String str;
        af0 af0VarP = ui8Var.getAnnotations().p(ere.a.r);
        if (af0VarP != null) {
            Object objL1 = z92.l1(af0VarP.i().values());
            pve pveVar = objL1 instanceof pve ? (pve) objL1 : null;
            if (pveVar != null && (str = (String) pveVar.a) != null) {
                if (!n8a.m(str)) {
                    str = null;
                }
                if (str != null) {
                    return n8a.h(str);
                }
            }
        }
        return null;
    }

    public static final List<ui8> d(ui8 ui8Var) {
        ui8Var.getClass();
        h(ui8Var);
        int iA = a(ui8Var);
        if (iA == 0) {
            return zr4.a;
        }
        List<wxf> listSubList = ui8Var.K0().subList(0, iA);
        ArrayList arrayList = new ArrayList(t92.r0(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((wxf) it.next()).getType());
        }
        return arrayList;
    }

    public static final rv5 e(v62 v62Var) {
        if (!(v62Var instanceof t52) || !ei8.K(v62Var)) {
            return null;
        }
        int i = b04.a;
        nq5 nq5VarG = yz3.g(v62Var);
        nq5VarG.getClass();
        if (!nq5VarG.d() || nq5VarG.c()) {
            return null;
        }
        sv5 sv5Var = sv5.c;
        mq5 mq5VarB = nq5VarG.g().b();
        String strC = nq5VarG.f().c();
        strC.getClass();
        sv5Var.getClass();
        sv5.a aVarA = sv5Var.a(mq5VarB, strC);
        if (aVarA != null) {
            return aVarA.a;
        }
        return null;
    }

    public static final ui8 f(ui8 ui8Var) {
        ui8Var.getClass();
        h(ui8Var);
        if (ui8Var.getAnnotations().p(ere.a.p) == null) {
            return null;
        }
        return ui8Var.K0().get(a(ui8Var)).getType();
    }

    public static final List<wxf> g(ui8 ui8Var) {
        ui8Var.getClass();
        h(ui8Var);
        List<wxf> listK0 = ui8Var.K0();
        return listK0.subList(((!h(ui8Var) || ui8Var.getAnnotations().p(ere.a.p) == null) ? 0 : 1) + a(ui8Var), listK0.size() - 1);
    }

    public static final boolean h(ui8 ui8Var) {
        ui8Var.getClass();
        v62 v62VarD = ui8Var.M0().d();
        if (v62VarD == null) {
            return false;
        }
        rv5 rv5VarE = e(v62VarD);
        return wl7.b(rv5VarE, rv5.a.c) || wl7.b(rv5VarE, rv5.d.c);
    }
}
