package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.ha;
import defpackage.mb8;
import defpackage.o75;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u75 implements ga<o75.e> {
    public static final u75 a = new u75();
    public static final List<String> b = u63.a0("id", "author", "type", "subType", "messageBody", "messageContentFormat", "cleanedMessageBody", "publicationDateTime", "attachments", "timelineModuleResult", "__typename");

    @Override // defpackage.ga
    public final o75.e a(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        Object objA;
        Object objA2;
        Object objA3;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        o75.b bVar = null;
        sw2 sw2Var = null;
        qw2 qw2Var = null;
        String strA = null;
        jw2 jw2Var = null;
        String strA2 = null;
        Date date = null;
        ArrayList arrayList = null;
        o75.k kVar = null;
        String str2 = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            switch (iD1) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    r75 r75Var = r75.a;
                    ha.g gVar = ha.a;
                    bVar = (o75.b) new ena(r75Var, false).a(mb8Var, lb3Var);
                    break;
                case 2:
                    String strI0 = mb8Var.I0();
                    strI0.getClass();
                    sw2.a.getClass();
                    Iterator<T> it = sw2.o0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (wl7.b(((sw2) next).a(), strI0)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    sw2Var = (sw2) next;
                    if (sw2Var == null) {
                        sw2Var = sw2.m0;
                    }
                    break;
                case 3:
                    ha.g gVar2 = ha.a;
                    rw2 rw2Var = rw2.a;
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = rw2Var.a(mb8Var, lb3Var);
                    }
                    qw2Var = (qw2) objA;
                    break;
                case 4:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 5:
                    ha.g gVar3 = ha.a;
                    kw2 kw2Var = kw2.a;
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = kw2Var.a(mb8Var, lb3Var);
                    }
                    jw2Var = (jw2) objA2;
                    break;
                case 6:
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    break;
                case 7:
                    date = (Date) lb3Var.e(qg3.a).a(mb8Var, lb3Var);
                    break;
                case 8:
                    q75 q75Var = q75.a;
                    ha.g gVar4 = ha.a;
                    ena enaVar = new ena(q75Var, false);
                    mb8Var.m();
                    arrayList = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList.add(enaVar.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e;
                        }
                    }
                    mb8Var.l();
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    a85 a85Var = a85.a;
                    ha.g gVar5 = ha.a;
                    ena enaVar2 = new ena(a85Var, true);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA3 = null;
                    } else {
                        objA3 = enaVar2.a(mb8Var, lb3Var);
                    }
                    kVar = (o75.k) objA3;
                    break;
                case 10:
                    str2 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                default:
                    if (str == null) {
                        mh2.q(mb8Var, "id");
                        throw null;
                    }
                    if (bVar == null) {
                        mh2.q(mb8Var, "author");
                        throw null;
                    }
                    if (sw2Var == null) {
                        mh2.q(mb8Var, "type");
                        throw null;
                    }
                    if (date == null) {
                        mh2.q(mb8Var, "publicationDateTime");
                        throw null;
                    }
                    if (arrayList == null) {
                        mh2.q(mb8Var, "attachments");
                        throw null;
                    }
                    if (str2 != null) {
                        return new o75.e(str, bVar, sw2Var, qw2Var, strA, jw2Var, strA2, date, arrayList, kVar, str2);
                    }
                    mh2.q(mb8Var, "__typename");
                    throw null;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, o75.e eVar) {
        o75.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, eVar2.a);
        hc8Var.u0("author");
        r75 r75Var = r75.a;
        o75.b bVar = eVar2.b;
        hc8Var.j();
        r75Var.b(hc8Var, lb3Var, bVar);
        hc8Var.t();
        hc8Var.u0("type");
        hc8Var.T0(eVar2.c.a());
        hc8Var.u0("subType");
        rw2 rw2Var = rw2.a;
        qw2 qw2Var = eVar2.d;
        if (qw2Var == null) {
            hc8Var.H1();
        } else {
            rw2Var.b(hc8Var, lb3Var, qw2Var);
        }
        hc8Var.u0("messageBody");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, eVar2.e);
        hc8Var.u0("messageContentFormat");
        kw2 kw2Var = kw2.a;
        jw2 jw2Var = eVar2.f;
        if (jw2Var == null) {
            hc8Var.H1();
        } else {
            kw2Var.b(hc8Var, lb3Var, jw2Var);
        }
        hc8Var.u0("cleanedMessageBody");
        nmaVar.b(hc8Var, lb3Var, eVar2.g);
        hc8Var.u0("publicationDateTime");
        lb3Var.e(qg3.a).b(hc8Var, lb3Var, eVar2.h);
        hc8Var.u0("attachments");
        q75 q75Var = q75.a;
        ArrayList arrayList = eVar2.i;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            q75Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("timelineModuleResult");
        ena enaVar = new ena(a85.a, true);
        o75.k kVar = eVar2.j;
        if (kVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, kVar);
        }
        hc8Var.u0("__typename");
        gVar.b(hc8Var, lb3Var, eVar2.k);
    }
}
