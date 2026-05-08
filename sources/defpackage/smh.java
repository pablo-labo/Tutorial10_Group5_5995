package defpackage;

import android.location.Location;
import android.os.WorkSource;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.paf;
import defpackage.vf0;

/* JADX INFO: loaded from: classes2.dex */
public final class smh extends ma6 implements wv5 {
    public static final vf0 k = new vf0("LocationServices.API", new omh(), new vf0.g());

    @Override // defpackage.wv5
    public final Task<Location> a(int i, CancellationToken cancellationToken) {
        mvh.a(i);
        CurrentLocationRequest currentLocationRequest = new CurrentLocationRequest(60000L, 0, i, Long.MAX_VALUE, false, 0, null, new WorkSource(null), null);
        if (cancellationToken != null) {
            fib.a("cancellationToken may not be already canceled", !cancellationToken.isCancellationRequested());
        }
        paf.a aVarA = paf.a();
        aVarA.a = new ure(currentLocationRequest, cancellationToken);
        aVarA.d = 2415;
        Task<Location> taskE = e(0, aVarA.a());
        if (cancellationToken == null) {
            return taskE;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        taskE.continueWith(new fz1(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // defpackage.wv5
    public final Task<Location> b() {
        paf.a aVarA = paf.a();
        aVarA.a = w74.b0;
        aVarA.d = 2414;
        return e(0, aVarA.a());
    }
}
