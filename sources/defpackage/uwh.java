package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.c;

/* JADX INFO: loaded from: classes2.dex */
public final class uwh extends x9i {
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ g7i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwh(g7i g7iVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.c = g7iVar;
        this.b = taskCompletionSource2;
    }

    @Override // defpackage.x9i
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.b;
        g7i g7iVar = this.c;
        try {
            g7iVar.a.m.j(g7iVar.b, w9i.a(), new c(g7iVar, taskCompletionSource));
        } catch (RemoteException e) {
            w6i w6iVar = g7i.c;
            Object[] objArr = {g7iVar.b};
            w6iVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", w6i.b(w6iVar.a, "error requesting in-app review for %s", objArr), e);
            }
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}
