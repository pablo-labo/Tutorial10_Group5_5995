package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class i49 {
    public static void a(Object obj, String str, String str2) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }
}
