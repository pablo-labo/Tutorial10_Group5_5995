package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lbh extends eah {
    public final rah b;
    public final TaskCompletionSource c;
    public final yid d;

    public lbh(int i, rah rahVar, TaskCompletionSource taskCompletionSource, yid yidVar) {
        super(i);
        this.c = taskCompletionSource;
        this.b = rahVar;
        this.d = yidVar;
        if (i == 2 && rahVar.b) {
            l5.q("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.vbh
    public final void a(Status status) {
        this.d.getClass();
        this.c.trySetException(hh2.q(status));
    }

    @Override // defpackage.vbh
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // defpackage.vbh
    public final void c(y9h y9hVar) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            rah rahVar = this.b;
            rahVar.d.a.accept(y9hVar.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(vbh.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override // defpackage.vbh
    public final void d(j9h j9hVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = j9hVar.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new ln2(j9hVar, taskCompletionSource));
    }

    @Override // defpackage.eah
    public final boolean f(y9h y9hVar) {
        return this.b.b;
    }

    @Override // defpackage.eah
    public final Feature[] g(y9h y9hVar) {
        return this.b.a;
    }
}
