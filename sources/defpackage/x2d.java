package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class x2d {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final ysf<v33> h;
    public final jb6 i;
    public int j;
    public long k;

    public final class a implements Runnable {
        public final d43 a;
        public final TaskCompletionSource<d43> b;

        public a(d43 d43Var, TaskCompletionSource taskCompletionSource) {
            this.a = d43Var;
            this.b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TaskCompletionSource<d43> taskCompletionSource = this.b;
            x2d x2dVar = x2d.this;
            d43 d43Var = this.a;
            x2dVar.b(d43Var, taskCompletionSource);
            ((AtomicInteger) x2dVar.i.b).set(0);
            double dMin = Math.min(3600000.0d, Math.pow(x2dVar.b, x2dVar.a()) * (60000.0d / x2dVar.a));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + d43Var.c();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public x2d(ysf<v33> ysfVar, hbe hbeVar, jb6 jb6Var) {
        double d = hbeVar.d;
        double d2 = hbeVar.e;
        long j = ((long) hbeVar.f) * 1000;
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = ysfVar;
        this.i = jb6Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int iMin = size == this.e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(d43 d43Var, TaskCompletionSource<d43> taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + d43Var.c();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.b(new x21(d43Var.a(), jnb.c), new w2d(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.d < 2000, d43Var));
    }
}
