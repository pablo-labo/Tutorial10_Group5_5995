package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sah extends eah {
    public final TaskCompletionSource b;

    public sah(TaskCompletionSource taskCompletionSource) {
        super(4);
        this.b = taskCompletionSource;
    }

    @Override // defpackage.vbh
    public final void a(Status status) {
        this.b.trySetException(new ApiException(status));
    }

    @Override // defpackage.vbh
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // defpackage.vbh
    public final void c(y9h y9hVar) throws DeadObjectException {
        try {
            h(y9hVar);
        } catch (DeadObjectException e) {
            a(vbh.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(vbh.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    public abstract void h(y9h y9hVar);
}
