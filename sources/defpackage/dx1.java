package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class dx1 {
    public static Method a;
    public static Method b;
    public static boolean c;

    @SuppressLint({"SoonBlockedPrivateApi", "PrivateApi"})
    public static final void a(Canvas canvas, boolean z) {
        Method method;
        Method method2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!c) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Object[].class);
                    Object objInvoke = declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    objInvoke.getClass();
                    a = (Method) objInvoke;
                    Object objInvoke2 = declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                    objInvoke2.getClass();
                    b = (Method) objInvoke2;
                } else {
                    a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                method2 = a;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (method2 != null && b != null) {
                method2.setAccessible(true);
                Method method3 = b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
                c = true;
            }
        }
        if (z) {
            try {
                Method method4 = a;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
