package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class hh8 {
    public static Integer a;

    public static Boolean a(Context context, View view, Function1 function1) {
        context.getClass();
        view.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            return Boolean.valueOf(rzg.h(null, view.getRootWindowInsets()).a.q(8));
        }
        try {
            Object systemService = context.getSystemService("input_method");
            systemService.getClass();
            Object objInvoke = InputMethodManager.class.getMethod("getInputMethodWindowVisibleHeight", null).invoke((InputMethodManager) systemService, null);
            objInvoke.getClass();
            return Boolean.valueOf(((Integer) objInvoke).intValue() > 0);
        } catch (Exception e) {
            function1.invoke(e);
            if (Build.VERSION.SDK_INT >= 30) {
                return Boolean.valueOf(rzg.h(null, view.getRootWindowInsets()).a.q(8));
            }
            return null;
        }
    }
}
