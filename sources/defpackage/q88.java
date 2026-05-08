package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import defpackage.ha;
import defpackage.j88;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q88 implements ga<j88.f> {
    public static final q88 a = new q88();
    public static final List<String> b = u63.a0("deviceId", "allocationResults", "dynamicAllocationResults", "matrixVersion", "proctorResultUpdateInterval", "proctorAllocationResultString", SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);

    @Override // defpackage.ga
    public final j88.f a(mb8 mb8Var, lb3 lb3Var) {
        Integer num;
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        Integer num2 = null;
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    num = num2;
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    num = num2;
                    l88 l88Var = l88.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(l88Var, true);
                    mb8Var.m();
                    ArrayList arrayList3 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList3.add(enaVar.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e;
                        }
                    }
                    mb8Var.l();
                    arrayList = arrayList3;
                    break;
                case 2:
                    num = num2;
                    o88 o88Var = o88.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(o88Var, true);
                    mb8Var.m();
                    ArrayList arrayList4 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList4.add(enaVar2.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e2) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e2;
                        }
                        break;
                    }
                    mb8Var.l();
                    arrayList2 = arrayList4;
                    break;
                case 3:
                    num = num2;
                    str2 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 4:
                    num2 = (Integer) ha.b.a(mb8Var, lb3Var);
                    continue;
                case 5:
                    num = num2;
                    str3 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 6:
                    num = num2;
                    hy8 hy8Var = new hy8(ha.a);
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = hy8Var.a(mb8Var, lb3Var);
                    }
                    list = (List) objA;
                    break;
                default:
                    Integer num3 = num2;
                    if (str == null) {
                        mh2.q(mb8Var, "deviceId");
                        throw null;
                    }
                    if (arrayList == null) {
                        mh2.q(mb8Var, "allocationResults");
                        throw null;
                    }
                    if (arrayList2 == null) {
                        mh2.q(mb8Var, "dynamicAllocationResults");
                        throw null;
                    }
                    if (str2 == null) {
                        mh2.q(mb8Var, "matrixVersion");
                        throw null;
                    }
                    if (num3 == null) {
                        mh2.q(mb8Var, "proctorResultUpdateInterval");
                        throw null;
                    }
                    int iIntValue = num3.intValue();
                    if (str3 != null) {
                        return new j88.f(str, arrayList, arrayList2, str2, iIntValue, str3, list);
                    }
                    mh2.q(mb8Var, "proctorAllocationResultString");
                    throw null;
            }
            num2 = num;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, j88.f fVar) {
        j88.f fVar2 = fVar;
        hc8Var.getClass();
        lb3Var.getClass();
        fVar2.getClass();
        hc8Var.u0("deviceId");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, fVar2.a);
        hc8Var.u0("allocationResults");
        l88 l88Var = l88.a;
        ArrayList arrayList = fVar2.b;
        hc8Var.m();
        for (Object obj : arrayList) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var = (ub9) hc8Var;
                ub9Var.j();
                l88Var.b(hc8Var, lb3Var, obj);
                ub9Var.t();
            } else {
                ub9 ub9Var2 = new ub9();
                ub9Var2.j();
                l88Var.b(ub9Var2, lb3Var, obj);
                ub9Var2.t();
                Object objH = ub9Var2.h();
                objH.getClass();
                f.a(hc8Var, objH);
            }
        }
        hc8Var.l();
        hc8Var.u0("dynamicAllocationResults");
        o88 o88Var = o88.a;
        ArrayList arrayList2 = fVar2.c;
        hc8Var.m();
        for (Object obj2 : arrayList2) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var3 = (ub9) hc8Var;
                ub9Var3.j();
                o88Var.b(hc8Var, lb3Var, obj2);
                ub9Var3.t();
            } else {
                ub9 ub9Var4 = new ub9();
                ub9Var4.j();
                o88Var.b(ub9Var4, lb3Var, obj2);
                ub9Var4.t();
                Object objH2 = ub9Var4.h();
                objH2.getClass();
                f.a(hc8Var, objH2);
            }
        }
        hc8Var.l();
        hc8Var.u0("matrixVersion");
        gVar.b(hc8Var, lb3Var, fVar2.d);
        hc8Var.u0("proctorResultUpdateInterval");
        ha.b.b(hc8Var, lb3Var, Integer.valueOf(fVar2.e));
        hc8Var.u0("proctorAllocationResultString");
        gVar.b(hc8Var, lb3Var, fVar2.f);
        hc8Var.u0(SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
        hy8 hy8Var = new hy8(gVar);
        List<String> list = fVar2.g;
        if (list == null) {
            hc8Var.H1();
        } else {
            hy8Var.b(hc8Var, lb3Var, list);
        }
    }
}
