package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pu9 implements ga<ou9> {
    public static final pu9 a = new pu9();

    @Override // defpackage.ga
    public final ou9 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, ou9 ou9Var) {
        ou9 ou9Var2 = ou9Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ou9Var2.getClass();
        hva<List<String>> hvaVar = ou9Var2.l;
        hva<jx0> hvaVar2 = ou9Var2.k;
        hva<gx0> hvaVar3 = ou9Var2.j;
        hva<String> hvaVar4 = ou9Var2.i;
        hc8Var.u0("platform");
        qu9 qu9Var = ou9Var2.a;
        qu9Var.getClass();
        hc8Var.T0(qu9Var.a());
        hc8Var.u0("appVersion");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, ou9Var2.b);
        hc8Var.u0("osVersion");
        gVar.b(hc8Var, lb3Var, ou9Var2.c);
        hva<String> hvaVar5 = ou9Var2.d;
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("deviceId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        hc8Var.u0("isTablet");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(ou9Var2.e));
        hc8Var.u0("countrySelectionMethod");
        mu9 mu9Var = ou9Var2.f;
        mu9Var.getClass();
        hc8Var.T0(mu9Var.a());
        hc8Var.u0("proctorTestNames");
        ArrayList arrayList = ou9Var2.g;
        arrayList.getClass();
        hc8Var.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gVar.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
        hc8Var.u0("services");
        List<String> list = ou9Var2.h;
        list.getClass();
        hc8Var.m();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            gVar.b(hc8Var, lb3Var, it2.next());
        }
        hc8Var.l();
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("employerKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("attributionParametersInput");
            ena enaVar = new ena(hx0.a, false);
            V v = ((hva.c) hvaVar3).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("attributionParams");
            ena enaVar2 = new ena(kx0.a, false);
            V v2 = ((hva.c) hvaVar2).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("dynamicProctorMetatags");
            hy8 hy8Var = new hy8(gVar);
            Object obj = ((hva.c) hvaVar).a;
            if (obj == null) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, obj);
            }
        }
    }
}
