package defpackage;

import defpackage.ke9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ob8 {
    public static Object a(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            pxc pxcVar = qt1.b;
            if (pxcVar.d(str)) {
                ke9 ke9VarC = pxcVar.c(str);
                List<String> listA = ke9VarC != null ? ke9VarC.a() : null;
                if (listA != null && ((l1) listA).a() > 1) {
                    return new qt1((String) ((ke9.a) listA).get(1));
                }
                h5.k(l5.m("Not a cache reference: ", str, " Must be of the form: ApolloCacheReference{%s}"));
                return null;
            }
        } else {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), a(entry.getValue()));
                }
                return linkedHashMap;
            }
            if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next()));
                }
                return arrayList;
            }
        }
        return obj;
    }

    public static String b(gtc gtcVar) throws Throwable {
        gtcVar.getClass();
        Map<String, Object> map = gtcVar.b;
        zn1 zn1Var = new zn1();
        so1 so1Var = new so1(zn1Var);
        try {
            so1Var.j();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                so1Var.u0(key);
                c(so1Var, value);
            }
            so1Var.t();
            try {
                so1Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                so1Var.close();
            } catch (Throwable th3) {
                boa.h(th, th3);
            }
        }
        if (th == null) {
            return zn1Var.z1();
        }
        throw th;
    }

    public static void c(hc8 hc8Var, Object obj) {
        if (obj == null) {
            hc8Var.H1();
            return;
        }
        if (obj instanceof String) {
            hc8Var.T0((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            hc8Var.V(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            hc8Var.F(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            hc8Var.E(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            hc8Var.K(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof za8) {
            hc8Var.M0((za8) obj);
            return;
        }
        if (obj instanceof qt1) {
            hc8Var.T0("ApolloCacheReference{" + ((qt1) obj).a + '}');
            return;
        }
        if (obj instanceof List) {
            hc8Var.m();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                c(hc8Var, it.next());
            }
            hc8Var.l();
            return;
        }
        if (!(obj instanceof Map)) {
            m6.l(obj, "Unsupported record value type: '");
            return;
        }
        hc8Var.j();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            c(hc8Var.u0((String) entry.getKey()), entry.getValue());
        }
        hc8Var.t();
    }
}
