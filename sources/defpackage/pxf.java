package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pxf {
    public static Collection a(Object obj) {
        if ((obj instanceof ze8) && !(obj instanceof bf8)) {
            g(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            wl7.e(e, pxf.class.getName());
            throw e;
        }
    }

    public static Map b(Object obj) {
        if ((obj instanceof ze8) && !(obj instanceof cf8)) {
            g(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            wl7.e(e, pxf.class.getName());
            throw e;
        }
    }

    public static Set c(Object obj) {
        if ((obj instanceof ze8) && !(obj instanceof jf8)) {
            g(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            wl7.e(e, pxf.class.getName());
            throw e;
        }
    }

    public static Object d(int i, Object obj) {
        if (obj == null || e(i, obj)) {
            return obj;
        }
        g(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean e(int i, Object obj) {
        if (obj instanceof vu5) {
            if ((obj instanceof fv5 ? ((fv5) obj).getArity() : obj instanceof gu5 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof wu5 ? 3 : obj instanceof xu5 ? 4 : obj instanceof yu5 ? 5 : obj instanceof zu5 ? 6 : obj instanceof av5 ? 7 : obj instanceof bv5 ? 8 : obj instanceof cv5 ? 9 : obj instanceof hu5 ? 10 : obj instanceof iu5 ? 11 : obj instanceof ju5 ? 12 : obj instanceof ku5 ? 13 : obj instanceof lu5 ? 14 : obj instanceof mu5 ? 15 : obj instanceof nu5 ? 16 : obj instanceof ou5 ? 17 : obj instanceof pu5 ? 18 : obj instanceof qu5 ? 19 : obj instanceof su5 ? 20 : obj instanceof tu5 ? 21 : obj instanceof uu5 ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof ze8) || (obj instanceof cf8);
        }
        return false;
    }

    public static void g(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(z3.m(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        wl7.e(classCastException, pxf.class.getName());
        throw classCastException;
    }
}
