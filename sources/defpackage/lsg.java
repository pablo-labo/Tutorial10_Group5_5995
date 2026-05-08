package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class lsg extends ksg {
    public static boolean s0 = true;

    @SuppressLint({"NewApi"})
    public void Z(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (s0) {
                try {
                    view.setTransitionVisibility(i);
                    return;
                } catch (NoSuchMethodError unused) {
                    s0 = false;
                    return;
                }
            }
            return;
        }
        if (!pnb.n0) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                pnb.m0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            pnb.n0 = true;
        }
        Field field = pnb.m0;
        if (field != null) {
            try {
                pnb.m0.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }
}
