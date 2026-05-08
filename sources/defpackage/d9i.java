package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzn;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class d9i implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ zzn b;
    public final /* synthetic */ y8i c;

    public d9i(y8i y8iVar, AtomicReference atomicReference, zzn zznVar) {
        this.c = y8iVar;
        this.a = atomicReference;
        this.b = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8i y8iVar;
        pvh pvhVar;
        synchronized (this.a) {
            try {
                try {
                    y8iVar = this.c;
                    pvhVar = y8iVar.d;
                } finally {
                    this.a.notify();
                }
            } catch (RemoteException e) {
                this.c.zzr().f.a(e, "Failed to get app instance id");
            }
            if (pvhVar == null) {
                y8iVar.zzr().f.b("Failed to get app instance id");
                return;
            }
            this.a.set(pvhVar.y0(this.b));
            String str = (String) this.a.get();
            if (str != null) {
                this.c.h().V.set(str);
                this.c.f().a0.b(str);
            }
            this.c.u();
            this.a.notify();
        }
    }
}
