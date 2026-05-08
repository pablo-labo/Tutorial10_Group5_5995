package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.o7d;

/* JADX INFO: loaded from: classes3.dex */
public final class ki8 implements jv1, OnCompleteListener {
    public final /* synthetic */ qw1 a;

    public /* synthetic */ ki8(qw1 qw1Var) {
        this.a = qw1Var;
    }

    @Override // defpackage.jv1
    public void a(av1 av1Var, Throwable th) {
        this.a.resumeWith(new o7d.a(th));
    }

    @Override // defpackage.jv1
    public void b(av1 av1Var, m6d m6dVar) {
        this.a.resumeWith(m6dVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        qw1 qw1Var = this.a;
        if (exception != null) {
            qw1Var.resumeWith(new o7d.a(exception));
        } else if (task.isCanceled()) {
            qw1Var.g(null);
        } else {
            qw1Var.resumeWith(task.getResult());
        }
    }
}
