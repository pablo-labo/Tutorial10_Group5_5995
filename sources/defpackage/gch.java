package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.v7b;

/* JADX INFO: loaded from: classes2.dex */
public final class gch implements v7b.a {
    public final /* synthetic */ v7b a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ w7b c;

    public gch(v7b v7bVar, TaskCompletionSource taskCompletionSource, w7b w7bVar) {
        this.a = v7bVar;
        this.b = taskCompletionSource;
        this.c = w7bVar;
    }

    @Override // v7b.a
    public final void a(Status status) {
        boolean zS0 = status.s0();
        TaskCompletionSource taskCompletionSource = this.b;
        if (!zS0) {
            taskCompletionSource.setException(hh2.q(status));
        } else {
            taskCompletionSource.setResult(this.c.d(this.a.a()));
        }
    }
}
