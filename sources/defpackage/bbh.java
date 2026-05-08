package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.vf0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bbh extends vbh {
    public final ieh b;

    public bbh(int i, ieh iehVar) {
        super(i);
        this.b = iehVar;
    }

    @Override // defpackage.vbh
    public final void a(Status status) {
        try {
            this.b.j(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.vbh
    public final void b(Exception exc) {
        try {
            this.b.j(new Status(10, z3.m(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.vbh
    public final void c(y9h y9hVar) throws DeadObjectException {
        try {
            ieh iehVar = this.b;
            vf0.f fVar = y9hVar.b;
            iehVar.getClass();
            try {
                iehVar.i(fVar);
            } catch (DeadObjectException e) {
                iehVar.j(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                iehVar.j(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }

    @Override // defpackage.vbh
    public final void d(j9h j9hVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = j9hVar.a;
        ieh iehVar = this.b;
        map.put(iehVar, boolValueOf);
        iehVar.b(new i9h(j9hVar, iehVar));
    }
}
