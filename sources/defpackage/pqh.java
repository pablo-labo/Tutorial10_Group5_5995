package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.to6;

/* JADX INFO: loaded from: classes2.dex */
public final class pqh extends to6.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ TaskCompletionSource b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqh(Boolean bool, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
        this.a = bool;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.to6
    public final void w0(Status status) {
        zte.f(status, this.a, this.b);
    }
}
