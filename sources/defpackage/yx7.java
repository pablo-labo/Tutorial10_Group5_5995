package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.ha;
import defpackage.mb8;
import defpackage.rx7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yx7 implements ga<rx7> {
    public static final List<String> a = u63.a0("key", "url", "title", "location", "sourceEmployerName", "employer", "compensation", RumFeature.EVENT_ATTRIBUTES_PROPERTY);

    public static rx7 c(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        rx7.g gVar = null;
        String str4 = null;
        rx7.d dVar = null;
        rx7.b bVar = null;
        ArrayList arrayList = null;
        while (true) {
            int iD1 = mb8Var.D1(a);
            mb8.a aVar = mb8.a.Y;
            switch (iD1) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    str2 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 2:
                    str3 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 3:
                    zx7 zx7Var = zx7.a;
                    ha.g gVar2 = ha.a;
                    gVar = (rx7.g) new ena(zx7Var, false).a(mb8Var, lb3Var);
                    break;
                case 4:
                    str4 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 5:
                    vx7 vx7Var = vx7.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar = new ena(vx7Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar.a(mb8Var, lb3Var);
                    }
                    dVar = (rx7.d) objA;
                    break;
                case 6:
                    tx7 tx7Var = tx7.a;
                    ha.g gVar4 = ha.a;
                    ena enaVar2 = new ena(tx7Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar2.a(mb8Var, lb3Var);
                    }
                    bVar = (rx7.b) objA2;
                    break;
                case 7:
                    sx7 sx7Var = sx7.a;
                    ha.g gVar5 = ha.a;
                    ena enaVar3 = new ena(sx7Var, false);
                    mb8Var.m();
                    ArrayList arrayList2 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList2.add(enaVar3.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e;
                        }
                        break;
                    }
                    mb8Var.l();
                    arrayList = arrayList2;
                    break;
                default:
                    if (str == null) {
                        mh2.q(mb8Var, "key");
                        throw null;
                    }
                    if (str2 == null) {
                        mh2.q(mb8Var, "url");
                        throw null;
                    }
                    if (str3 == null) {
                        mh2.q(mb8Var, "title");
                        throw null;
                    }
                    if (gVar == null) {
                        mh2.q(mb8Var, "location");
                        throw null;
                    }
                    if (str4 == null) {
                        mh2.q(mb8Var, "sourceEmployerName");
                        throw null;
                    }
                    if (arrayList != null) {
                        return new rx7(str, str2, str3, gVar, str4, dVar, bVar, arrayList);
                    }
                    mh2.q(mb8Var, RumFeature.EVENT_ATTRIBUTES_PROPERTY);
                    throw null;
            }
        }
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, rx7 rx7Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        rx7Var.getClass();
        hc8Var.u0("key");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, rx7Var.a);
        hc8Var.u0("url");
        gVar.b(hc8Var, lb3Var, rx7Var.b);
        hc8Var.u0("title");
        gVar.b(hc8Var, lb3Var, rx7Var.c);
        hc8Var.u0("location");
        zx7 zx7Var = zx7.a;
        rx7.g gVar2 = rx7Var.d;
        hc8Var.j();
        zx7Var.b(hc8Var, lb3Var, gVar2);
        hc8Var.t();
        hc8Var.u0("sourceEmployerName");
        gVar.b(hc8Var, lb3Var, rx7Var.e);
        hc8Var.u0("employer");
        ena enaVar = new ena(vx7.a, false);
        rx7.d dVar = rx7Var.f;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("compensation");
        ena enaVar2 = new ena(tx7.a, false);
        rx7.b bVar = rx7Var.g;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, bVar);
        }
        hc8Var.u0(RumFeature.EVENT_ATTRIBUTES_PROPERTY);
        sx7 sx7Var = sx7.a;
        ArrayList arrayList = rx7Var.h;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            sx7Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
    }
}
