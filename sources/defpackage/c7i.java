package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c7i extends tuh {
    public final /* synthetic */ qji b;

    public c7i(qji qjiVar) {
        Objects.requireNonNull(qjiVar);
        this.b = qjiVar;
    }

    @Override // defpackage.tuh
    public final void b() {
        qji qjiVar = this.b;
        synchronized (qjiVar.f) {
            try {
                if (qjiVar.k.get() > 0 && qjiVar.k.decrementAndGet() > 0) {
                    qjiVar.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                if (qjiVar.m != null) {
                    qjiVar.b.a("Unbind from service.", new Object[0]);
                    qjiVar.a.unbindService(qjiVar.l);
                    qjiVar.g = false;
                    qjiVar.m = null;
                    qjiVar.l = null;
                }
                HashSet hashSet = qjiVar.e;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(qjiVar.c).concat(" : Binder has died.")));
                }
                hashSet.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
