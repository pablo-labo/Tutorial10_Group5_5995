package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import defpackage.ha;
import defpackage.jk8;
import defpackage.mb8;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mk8 implements ga<jk8> {
    public static final List<String> a = u63.a0("id", "type", "subType", "messagePreview", "publicationDateTime", "author", "attachments", "__typename");

    public static jk8 c(mb8 mb8Var, lb3 lb3Var) {
        Object next;
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        sw2 sw2Var = null;
        qw2 qw2Var = null;
        String strA = null;
        Date date = null;
        jk8.b bVar = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (true) {
            switch (mb8Var.D1(a)) {
                case 0:
                    str = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
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
                    sw2 sw2Var2 = (sw2) next;
                    sw2Var = sw2Var2 != null ? sw2Var2 : sw2.m0;
                    break;
                case 2:
                    ha.g gVar = ha.a;
                    rw2 rw2Var = rw2.a;
                    if (mb8Var.peek() == mb8.a.Y) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = rw2Var.a(mb8Var, lb3Var);
                    }
                    qw2Var = (qw2) objA;
                    break;
                case 3:
                    strA = ha.i.a(mb8Var, lb3Var);
                    break;
                case 4:
                    date = (Date) lb3Var.e(qg3.a).a(mb8Var, lb3Var);
                    break;
                case 5:
                    lk8 lk8Var = lk8.a;
                    ha.g gVar2 = ha.a;
                    bVar = (jk8.b) new ena(lk8Var, false).a(mb8Var, lb3Var);
                    break;
                case 6:
                    kk8 kk8Var = kk8.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar = new ena(kk8Var, false);
                    mb8Var.m();
                    ArrayList arrayList2 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList2.add(enaVar.a(mb8Var, lb3Var));
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
                case 7:
                    str2 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                default:
                    if (str == null) {
                        mh2.q(mb8Var, "id");
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
                    if (bVar == null) {
                        mh2.q(mb8Var, "author");
                        throw null;
                    }
                    if (arrayList == null) {
                        mh2.q(mb8Var, "attachments");
                        throw null;
                    }
                    if (str2 != null) {
                        return new jk8(str, sw2Var, qw2Var, strA, date, bVar, arrayList, str2);
                    }
                    mh2.q(mb8Var, "__typename");
                    throw null;
            }
        }
    }

    public static void d(hc8 hc8Var, lb3 lb3Var, jk8 jk8Var) {
        hc8Var.getClass();
        lb3Var.getClass();
        jk8Var.getClass();
        hc8Var.u0("id");
        ha.g gVar = ha.a;
        gVar.b(hc8Var, lb3Var, jk8Var.a);
        hc8Var.u0("type");
        hc8Var.T0(jk8Var.b.a());
        hc8Var.u0("subType");
        rw2 rw2Var = rw2.a;
        qw2 qw2Var = jk8Var.c;
        if (qw2Var == null) {
            hc8Var.H1();
        } else {
            rw2Var.b(hc8Var, lb3Var, qw2Var);
        }
        hc8Var.u0("messagePreview");
        ha.i.b(hc8Var, lb3Var, jk8Var.d);
        hc8Var.u0("publicationDateTime");
        lb3Var.e(qg3.a).b(hc8Var, lb3Var, jk8Var.e);
        hc8Var.u0("author");
        lk8 lk8Var = lk8.a;
        jk8.b bVar = jk8Var.f;
        hc8Var.j();
        lk8Var.b(hc8Var, lb3Var, bVar);
        hc8Var.t();
        hc8Var.u0("attachments");
        kk8 kk8Var = kk8.a;
        ArrayList arrayList = jk8Var.g;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            kk8Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("__typename");
        gVar.b(hc8Var, lb3Var, jk8Var.h);
    }
}
