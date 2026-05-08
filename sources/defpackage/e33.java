package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.g33;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class e33 implements SuccessContinuation<hbe, Void> {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ f33 b;

    public e33(f33 f33Var, Executor executor) {
        this.b = f33Var;
        this.a = executor;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> then(hbe hbeVar) {
        if (hbeVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        g33.a aVar = this.b.b;
        g33 g33Var = g33.this;
        g33.b(g33.this);
        g33Var.m.f(null, this.a);
        g33Var.q.trySetResult(null);
        return Tasks.forResult(null);
    }
}
