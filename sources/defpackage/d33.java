package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class d33 implements Callable<Task<Void>> {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ nbe d;
    public final /* synthetic */ g33 e;

    public d33(g33 g33Var, long j, Throwable th, Thread thread, nbe nbeVar) {
        this.e = g33Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = nbeVar;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Throwable {
        long j = this.a;
        long j2 = j / 1000;
        g33 g33Var = this.e;
        String strE = g33Var.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        g33Var.c.a();
        w9e w9eVar = g33Var.m;
        w9eVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        w9eVar.e(this.b, this.c, strE, "crash", j2, true);
        try {
            oa5 oa5Var = g33Var.g;
            String str = ".ae" + j;
            oa5Var.getClass();
            if (!new File(oa5Var.b, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        nbe nbeVar = this.d;
        g33Var.c(false, nbeVar);
        new bs1(g33Var.f);
        g33.a(g33Var, bs1.b, Boolean.FALSE);
        if (!g33Var.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = g33Var.e.a;
        return nbeVar.i.get().getTask().onSuccessTask(executor, new x7(this, executor, strE));
    }
}
