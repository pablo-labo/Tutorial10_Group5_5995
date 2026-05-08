package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class q33 {
    public final Context a;
    public final ce3 b;
    public final jb6 c;
    public final long d;
    public r33 e;
    public r33 f;
    public g33 g;
    public final nr6 h;
    public final oa5 i;
    public final p20 j;
    public final q20 k;
    public final ExecutorService l;
    public final a33 m;
    public final x23 n;
    public final u33 o;
    public final p0d p;

    public q33(pf5 pf5Var, nr6 nr6Var, u33 u33Var, ce3 ce3Var, p20 p20Var, q20 q20Var, oa5 oa5Var, ExecutorService executorService, x23 x23Var, p0d p0dVar) {
        this.b = ce3Var;
        pf5Var.a();
        this.a = pf5Var.a;
        this.h = nr6Var;
        this.o = u33Var;
        this.j = p20Var;
        this.k = q20Var;
        this.l = executorService;
        this.i = oa5Var;
        this.m = new a33(executorService);
        this.n = x23Var;
        this.p = p0dVar;
        this.d = System.currentTimeMillis();
        this.c = new jb6(3);
    }

    public static Task a(final q33 q33Var, qbe qbeVar) {
        Task<Void> taskForException;
        o33 o33Var;
        a33 a33Var = q33Var.m;
        if (!Boolean.TRUE.equals(a33Var.d.get())) {
            r6.g("Not running on background worker thread as intended.");
            return null;
        }
        q33Var.e.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                q33Var.j.d(new hm1() { // from class: l33
                    @Override // defpackage.hm1
                    public final void a(String str) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        q33 q33Var2 = this.a;
                        long j = jCurrentTimeMillis - q33Var2.d;
                        g33 g33Var = q33Var2.g;
                        g33Var.e.a(new h33(g33Var, j, str));
                    }
                });
                q33Var.g.g();
                nbe nbeVar = (nbe) qbeVar;
                if (nbeVar.b().b.a) {
                    if (!q33Var.g.d(nbeVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    taskForException = q33Var.g.h(nbeVar.i.get().getTask());
                    o33Var = new o33(q33Var);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    taskForException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    o33Var = new o33(q33Var);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                taskForException = Tasks.forException(e);
                o33Var = new o33(q33Var);
            }
            a33Var.a(o33Var);
            return taskForException;
        } catch (Throwable th) {
            a33Var.a(new o33(q33Var));
            throw th;
        }
    }

    public final void b(nbe nbeVar) {
        Future<?> futureSubmit = this.l.submit(new n33(this, nbeVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }
}
