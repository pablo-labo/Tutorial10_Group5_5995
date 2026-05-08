package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class fib {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        l5.q(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        o6.h();
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            ia.r(sb, "Must be called on ", name2, " thread, but got ", name);
            q6.o(sb, ".");
        }
    }

    public static void e(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        r6.g(str);
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            l5.q("Given String is empty or null");
        }
    }

    public static void g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            l5.q(str2);
        }
    }

    public static void h(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        r6.g(str);
    }

    public static void i(Object obj) {
        if (obj != null) {
            return;
        }
        ja.k("null reference");
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ja.k(str);
    }

    public static void k(String str, boolean z) {
        if (z) {
            return;
        }
        r6.g(str);
    }
}
