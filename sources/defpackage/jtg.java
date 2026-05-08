package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class jtg {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = jtg.class.getName();

    public static class a {
        public static final boolean c = jtg.a;
        public final ArrayList a = new ArrayList();
        public boolean b = false;

        /* JADX INFO: renamed from: jtg$a$a, reason: collision with other inner class name */
        public static class C0282a {
            public final String a;
            public final long b;
            public final long c;

            public C0282a(long j, String str, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }
        }

        public final synchronized void a(long j, String str) {
            if (this.b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.a.add(new C0282a(j, str, SystemClock.elapsedRealtime()));
        }

        public final synchronized void b(String str) {
            long j;
            this.b = true;
            ArrayList arrayList = this.a;
            if (arrayList.size() == 0) {
                j = 0;
            } else {
                j = ((C0282a) arrayList.get(arrayList.size() - 1)).c - ((C0282a) arrayList.get(0)).c;
            }
            if (j <= 0) {
                return;
            }
            long j2 = ((C0282a) this.a.get(0)).c;
            jtg.b("(%-4d ms) %s", Long.valueOf(j), str);
            for (C0282a c0282a : this.a) {
                long j3 = c0282a.c;
                jtg.b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(c0282a.b), c0282a.a);
                j2 = j3;
            }
        }

        public final void finalize() {
            if (this.b) {
                return;
            }
            b("Request on the loose");
            jtg.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public static String a(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbG = h5.g(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbG.append(stackTrace[i].getMethodName());
                string = sbG.toString();
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append("] ");
        sb.append(string);
        return l6.i(sb, ": ", str2);
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
        if (a) {
            Log.v("Volley", a(str, objArr));
        }
    }
}
