package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class jpf {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;
    public static Method e;

    public static void a(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            kpf.a(i, g(str));
            return;
        }
        String strG = g(str);
        try {
            if (c == null) {
                c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            c.invoke(null, Long.valueOf(a), strG, Integer.valueOf(i));
        } catch (Exception e2) {
            e(e2, "asyncTraceBegin");
        }
    }

    public static void b(String str) {
        Trace.beginSection(g(str));
    }

    public static void c(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            kpf.b(i, g(str));
            return;
        }
        String strG = g(str);
        try {
            if (d == null) {
                d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            d.invoke(null, Long.valueOf(a), strG, Integer.valueOf(i));
        } catch (Exception e2) {
            e(e2, "asyncTraceEnd");
        }
    }

    public static void d() {
        Trace.endSection();
    }

    public static void e(Exception exc, String str) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            l5.r(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT >= 29) {
            return kpf.c();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e2) {
            e(e2, "isTagEnabled");
            return false;
        }
    }

    public static String g(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
