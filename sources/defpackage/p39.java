package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class p39 {
    public static void a(String str) {
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", str);
        }
    }

    public static void b(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }
}
