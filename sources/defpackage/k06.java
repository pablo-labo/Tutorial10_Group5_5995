package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.q8b;

/* JADX INFO: loaded from: classes2.dex */
public final class k06 implements mse {
    public final TaskCompletionSource<String> a;

    public k06(TaskCompletionSource<String> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.mse
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.mse
    public final boolean b(k31 k31Var) {
        if (k31Var.f() != q8b.a.c && k31Var.f() != q8b.a.d && k31Var.f() != q8b.a.e) {
            return false;
        }
        this.a.trySetResult(k31Var.b);
        return true;
    }
}
