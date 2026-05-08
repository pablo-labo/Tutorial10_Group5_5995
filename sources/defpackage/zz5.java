package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.q8b;

/* JADX INFO: loaded from: classes2.dex */
public final class zz5 implements mse {
    public final ekg a;
    public final TaskCompletionSource<eg7> b;

    public zz5(ekg ekgVar, TaskCompletionSource<eg7> taskCompletionSource) {
        this.a = ekgVar;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.mse
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // defpackage.mse
    public final boolean b(k31 k31Var) {
        if (k31Var.f() == q8b.a.d && !this.a.a(k31Var)) {
            String str = k31Var.d;
            if (str != null) {
                this.b.setResult(new d31(k31Var.f, str, k31Var.g));
                return true;
            }
            ja.k("Null token");
        }
        return false;
    }
}
