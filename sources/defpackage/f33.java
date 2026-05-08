package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.g33;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class f33 implements Callable<Task<Void>> {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ g33.a b;

    public f33(g33.a aVar, Boolean bool) {
        this.b = aVar;
        this.a = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() {
        g33.a aVar = this.b;
        g33 g33Var = g33.this;
        Boolean bool = this.a;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            ce3 ce3Var = g33Var.b;
            if (zBooleanValue) {
                ce3Var.f.trySetResult(null);
                Executor executor = g33Var.e.a;
                return aVar.a.onSuccessTask(executor, new e33(this, executor));
            }
            ce3Var.getClass();
            r6.g("An invalid data collection token was used.");
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        oa5 oa5Var = g33Var.g;
        Iterator it = oa5.e(oa5Var.b.listFiles(g33.r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        oa5 oa5Var2 = g33Var.m.b.b;
        c43.a(oa5.e(oa5Var2.d.listFiles()));
        c43.a(oa5.e(oa5Var2.e.listFiles()));
        c43.a(oa5.e(oa5Var2.f.listFiles()));
        g33Var.q.trySetResult(null);
        return Tasks.forResult(null);
    }
}
