package defpackage;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a49 {
    public static final r39 a = new r39();

    public static void a() {
        a.getClass();
    }

    public static void b(String str) {
        a.getClass();
        HashSet hashSet = r39.a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = r39.a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
