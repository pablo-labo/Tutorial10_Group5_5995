package defpackage;

import defpackage.g15;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zka {
    public final g15.b a;
    public final cr8 b;
    public final LinkedHashMap c;

    public static final class a {
        public final ArrayList a = new ArrayList();
    }

    public zka(g15.b bVar, String str, cr8 cr8Var) {
        str.getClass();
        this.a = bVar;
        this.b = cr8Var;
        this.c = new LinkedHashMap();
    }

    public static void b(List list, String str, String str2, a aVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vd2 vd2Var = (vd2) it.next();
            if (vd2Var instanceof pd2) {
                aVar.a.add(vd2Var);
            } else {
                if (!(vd2Var instanceof qd2)) {
                    l.g();
                    return;
                }
                qd2 qd2Var = (qd2) vd2Var;
                if (z92.I0(qd2Var.b, str2) || wl7.b(qd2Var.a, str)) {
                    b(qd2Var.d, str, str2, aVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qt1 a(java.util.Map<java.lang.String, ? extends java.lang.Object> r18, java.lang.String r19, java.util.List<? extends defpackage.vd2> r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zka.a(java.util.Map, java.lang.String, java.util.List, java.lang.String):qt1");
    }

    public final Object c(Object obj, pd2 pd2Var, ka6 ka6Var, String str) {
        String str2;
        qt1 qt1Var = null;
        if (ka6Var instanceof ud2) {
            if (obj == null) {
                r6.g("Check failed.");
                return null;
            }
            ka6Var = ((ud2) ka6Var).d;
        } else if (obj == null) {
            return null;
        }
        if (ka6Var instanceof sd2) {
            if (!(obj instanceof List)) {
                r6.g("Check failed.");
                return null;
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
            int i = 0;
            for (Object obj2 : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    u63.o0();
                    throw null;
                }
                ka6 ka6Var2 = ((sd2) ka6Var).d;
                String strValueOf = String.valueOf(i);
                if (str != null) {
                    strValueOf = g7.e(JwtParser.SEPARATOR_CHAR, str, strValueOf);
                }
                arrayList.add(c(obj2, pd2Var, ka6Var2, strValueOf));
                i = i2;
            }
            return arrayList;
        }
        if (ka6Var instanceof td2) {
            td2 td2Var = (td2) ka6Var;
            int i3 = rd2.a;
            if ((td2Var instanceof h6g) || (td2Var instanceof ji7) || (td2Var instanceof sna)) {
                if (!(obj instanceof Map)) {
                    r6.g("Check failed.");
                    return null;
                }
                Map<String, ? extends Object> map = (Map) obj;
                st1 st1Var = new st1(pd2Var, this.a);
                map.getClass();
                td2 td2VarM0 = st1Var.a.b.M0();
                int i4 = rd2.a;
                td2VarM0.getClass();
                Collection collection = td2VarM0 instanceof ji7 ? ((ji7) td2VarM0).e : td2VarM0 instanceof sna ? ((sna) td2VarM0).e : zr4.a;
                if (!collection.isEmpty()) {
                    String strValueOf2 = String.valueOf(map.get("__typename"));
                    Collection collection2 = collection;
                    ArrayList arrayList2 = new ArrayList(t92.r0(collection2, 10));
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.valueOf(map.get((String) it.next())));
                    }
                    qt1Var = new qt1(strValueOf2, arrayList2);
                }
                if (qt1Var != null && (str2 = qt1Var.a) != null) {
                    str = str2;
                }
                return a(map, str, pd2Var.e, pd2Var.b.M0().d);
            }
        }
        return obj;
    }
}
