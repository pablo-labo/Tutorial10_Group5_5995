package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ooe {
    public static final String a(kv5 kv5Var) {
        n8a n8aVar;
        hv1 hv1VarB = ei8.A(kv5Var) ? b(kv5Var) : null;
        if (hv1VarB != null) {
            hv1 hv1VarI = b04.i(hv1VarB);
            if (hv1VarI instanceof d4c) {
                ei8.A(hv1VarI);
                hv1 hv1VarB2 = b04.b(b04.i(hv1VarI), y32.c);
                if (hv1VarB2 != null && (n8aVar = rp1.a.get(b04.g(hv1VarB2))) != null) {
                    return n8aVar.c();
                }
            } else if (hv1VarI instanceof sfe) {
                int i = mp1.l;
                LinkedHashMap linkedHashMap = qoe.i;
                String strB = vs9.b((sfe) hv1VarI);
                n8a n8aVar2 = strB == null ? null : (n8a) linkedHashMap.get(strB);
                if (n8aVar2 != null) {
                    return n8aVar2.c();
                }
            }
        }
        return null;
    }

    public static final <T extends hv1> T b(T t) {
        t.getClass();
        if (!qoe.j.contains(t.getName()) && !rp1.d.contains(b04.i(t).getName())) {
            return null;
        }
        if ((t instanceof d4c) || (t instanceof w3c)) {
            return (T) b04.b(t, sp8.f);
        }
        if (t instanceof sfe) {
            return (T) b04.b(t, jad.c);
        }
        return null;
    }

    public static final <T extends hv1> T c(T t) {
        t.getClass();
        T t2 = (T) b(t);
        if (t2 != null) {
            return t2;
        }
        int i = pp1.l;
        n8a name = t.getName();
        name.getClass();
        if (qoe.e.contains(name)) {
            return (T) b04.b(t, kad.c);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0143, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:
    
        return !defpackage.ei8.A(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(defpackage.t52 r13, defpackage.hv1 r14) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooe.d(t52, hv1):boolean");
    }
}
