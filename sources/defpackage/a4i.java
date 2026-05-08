package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a4i extends tuh {
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ iuh c;
    public final /* synthetic */ qji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4i(qji qjiVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, iuh iuhVar) {
        super(taskCompletionSource);
        this.b = taskCompletionSource2;
        this.c = iuhVar;
        Objects.requireNonNull(qjiVar);
        this.d = qjiVar;
    }

    @Override // defpackage.tuh
    public final void b() {
        qji qjiVar = this.d;
        synchronized (qjiVar.f) {
            try {
                TaskCompletionSource taskCompletionSource = this.b;
                qjiVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new p24(5, qjiVar, taskCompletionSource));
                if (qjiVar.k.getAndIncrement() > 0) {
                    qjiVar.b.a("Already connected to the service.", new Object[0]);
                }
                qji.b(qjiVar, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
