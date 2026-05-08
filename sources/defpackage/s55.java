package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s55 {
    public static final wab a = wab.Z;

    public static void a(Object obj, String str, String str2) {
        a.getClass();
        if (wab.p(3)) {
            wab.t(3, str, String.format(null, str2, obj));
        }
    }

    public static void b(String str, String str2) {
        a.getClass();
        if (wab.p(3)) {
            wab.t(3, str, str2);
        }
    }

    public static void c(String str, String str2, Object obj, Object obj2) {
        a.getClass();
        if (wab.p(3)) {
            wab.t(3, str, String.format(null, str2, obj, obj2));
        }
    }

    public static void d(Class<?> cls, String str) {
        a.getClass();
        if (wab.p(6)) {
            wab.t(6, cls.getSimpleName(), str);
        }
    }

    public static void e(Class<?> cls, String str, Throwable th) {
        a.getClass();
        if (wab.p(6)) {
            wab.u(6, cls.getSimpleName(), str, th);
        }
    }

    public static void f(String str, String str2) {
        a.getClass();
        if (wab.p(6)) {
            wab.t(6, str, str2);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        a.getClass();
        if (wab.p(6)) {
            wab.u(6, str, str2, th);
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        a.getClass();
        if (wab.p(6)) {
            wab.t(6, str, String.format(null, str2, objArr));
        }
    }

    public static void i(Class cls, Object obj, String str) {
        a.getClass();
        if (wab.p(2)) {
            wab.t(2, cls.getSimpleName(), String.format(null, str, obj));
        }
    }

    public static void j(Class cls, String str, Integer num, Object obj) {
        a.getClass();
        if (wab.p(2)) {
            wab.t(2, cls.getSimpleName(), String.format(null, str, num, obj));
        }
    }

    public static void k(Class cls, String str, Integer num, Object obj, Object obj2) {
        boolean zP = wab.p(2);
        wab wabVar = a;
        wabVar.getClass();
        if (zP) {
            String str2 = String.format(null, str, num, obj, obj2);
            wabVar.getClass();
            if (zP) {
                wab.t(2, cls.getSimpleName(), str2);
            }
        }
    }

    public static void l(Class<?> cls, String str, Object... objArr) {
        a.getClass();
        if (wab.p(5)) {
            wab.t(5, cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void m(Exception exc, String str, Object... objArr) {
        boolean zP = wab.p(5);
        a.getClass();
        if (zP) {
            String str2 = String.format(null, str, objArr);
            if (zP) {
                wab.u(5, po1.class.getSimpleName(), str2, exc);
            }
        }
    }

    public static void n(String str, String str2) {
        a.getClass();
        if (wab.p(5)) {
            wab.t(5, str, str2);
        }
    }

    public static void o(String str, String str2, Exception exc) {
        a.getClass();
        if (wab.p(5)) {
            wab.u(5, str, str2, exc);
        }
    }

    public static void p(String str, String str2, Object... objArr) {
        a.getClass();
        if (wab.p(5)) {
            wab.t(5, str, String.format(null, str2, objArr));
        }
    }

    public static void q(Throwable th, String str, Object... objArr) {
        a.getClass();
        if (wab.p(5)) {
            wab.u(5, "ReactNative", String.format(null, str, objArr), th);
        }
    }

    public static void r(String str, String str2, Object... objArr) {
        a.getClass();
        if (wab.p(6)) {
            wab.t(6, str, String.format(null, str2, objArr));
        }
    }
}
