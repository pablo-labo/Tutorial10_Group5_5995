package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class v8h extends t8h {
    public final /* synthetic */ TaskCompletionSource V;
    public final /* synthetic */ t8h W;
    public final /* synthetic */ h7h X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8h(h7h h7hVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t8h t8hVar) {
        super(taskCompletionSource);
        this.V = taskCompletionSource2;
        this.W = t8hVar;
        this.X = h7hVar;
    }

    @Override // defpackage.t8h
    public final void b() {
        synchronized (this.X.f) {
            try {
                h7h h7hVar = this.X;
                TaskCompletionSource taskCompletionSource = this.V;
                h7hVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new by3(h7hVar, taskCompletionSource));
                if (this.X.l.getAndIncrement() > 0) {
                    this.X.b.b("Already connected to the service.", new Object[0]);
                }
                h7h.b(this.X, this.W);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
