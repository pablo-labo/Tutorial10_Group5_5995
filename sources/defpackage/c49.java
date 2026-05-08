package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c49 {
    public static int c;
    public static final c49 a = new c49();
    public static final String b = c49.class.getSimpleName();
    public static f49 d = new ka2(23);

    public static final void a(String str, String str2, Object... objArr) {
        str.getClass();
        if (c >= 2) {
            a.getClass();
            String strConcat = "SnowplowTracker->".concat(str);
            String strC = c(str2, Arrays.copyOf(objArr, objArr.length));
            f49 f49Var = d;
            if (f49Var != null) {
                f49Var.a(strConcat, strC);
            }
        }
    }

    public static final void b(String str, String str2, Object... objArr) {
        str.getClass();
        if (c >= 1) {
            a.getClass();
            String strConcat = "SnowplowTracker->".concat(str);
            String strC = c(str2, Arrays.copyOf(objArr, objArr.length));
            f49 f49Var = d;
            if (f49Var != null) {
                f49Var.e(strConcat, strC);
            }
        }
    }

    public static String c(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        String name = Thread.currentThread().getName();
        name.getClass();
        sb.append(name);
        sb.append('|');
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        sb.append(String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
        return sb.toString();
    }

    public static final void d(String str, String str2, Object... objArr) {
        Throwable th;
        b(str, str2, Arrays.copyOf(objArr, objArr.length));
        try {
            int length = objArr.length;
            int i = 0;
            while (true) {
                th = null;
                if (i >= length) {
                    break;
                }
                Object obj = objArr[i];
                if (!Throwable.class.isInstance(obj)) {
                    i++;
                } else if (obj instanceof Throwable) {
                    th = (Throwable) obj;
                }
            }
            c49 c49Var = a;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            c49Var.getClass();
            pqf pqfVar = new pqf(str, c(str2, objArrCopyOf), th);
            HashMap map = new HashMap();
            map.put("event", pqfVar);
            lla.b("SnowplowTrackerDiagnostic", map);
        } catch (Exception e) {
            String str3 = b;
            str3.getClass();
            e(str3, "Error logger can't report the error: " + e, new Object[0]);
        }
    }

    public static final void e(String str, String str2, Object... objArr) {
        str.getClass();
        if (c >= 3) {
            a.getClass();
            String strConcat = "SnowplowTracker->".concat(str);
            String strC = c(str2, Arrays.copyOf(objArr, objArr.length));
            f49 f49Var = d;
            if (f49Var != null) {
                f49Var.d(strConcat, strC);
            }
        }
    }
}
