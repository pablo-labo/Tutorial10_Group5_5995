package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class z39 {
    public static final Object a = new Object();
    public static volatile a b;

    public static class a extends z39 {
        public final int c;

        public a(int i) {
            this.c = i;
        }

        @Override // defpackage.z39
        public final void a(String str, String str2) {
            if (this.c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // defpackage.z39
        public final void b(String str, String str2) {
            if (this.c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // defpackage.z39
        public final void c(String str, String str2, Throwable th) {
            if (this.c <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // defpackage.z39
        public final void e(String str, String str2) {
            if (this.c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // defpackage.z39
        public final void g(String str, String str2) {
            if (this.c <= 5) {
                Log.w(str, str2);
            }
        }
    }

    public static z39 d() {
        a aVar;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new a(3);
                }
                aVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2);

    public abstract void c(String str, String str2, Throwable th);

    public abstract void e(String str, String str2);

    public abstract void g(String str, String str2);
}
