package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class q3h {
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static final Method e;
    public static Boolean f;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        c = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            method4 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method4 = null;
        }
        d = method4;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e3) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method5 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method5.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method5 = null;
            }
        } else {
            method5 = null;
        }
        e = method5;
        f = null;
    }

    public static void a(WorkSource workSource, int i, String str) {
        Method method = b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    public static synchronized boolean b(Context context) {
        Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z = ot2.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f = Boolean.valueOf(z);
        return z;
    }

    public static boolean c(WorkSource workSource) {
        Method method = e;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                fib.i(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e2) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e2);
            }
        }
        return d(workSource) == 0;
    }

    public static int d(WorkSource workSource) {
        Method method = c;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            fib.i(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return 0;
        }
    }
}
