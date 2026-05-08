package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzn;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class dbi implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzn e;
    public final /* synthetic */ y8i f;

    public dbi(y8i y8iVar, AtomicReference atomicReference, String str, String str2, boolean z, zzn zznVar) {
        this.f = y8iVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8i y8iVar;
        pvh pvhVar;
        synchronized (this.a) {
            try {
                try {
                    y8iVar = this.f;
                    pvhVar = y8iVar.d;
                } catch (RemoteException e) {
                    this.f.zzr().f.d("(legacy) Failed to get user properties; remote exception", null, this.b, e);
                    this.a.set(Collections.EMPTY_LIST);
                }
                if (pvhVar == null) {
                    y8iVar.zzr().f.d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                    this.a.set(Collections.EMPTY_LIST);
                    return;
                }
                boolean zIsEmpty = TextUtils.isEmpty(null);
                AtomicReference atomicReference = this.a;
                if (zIsEmpty) {
                    atomicReference.set(pvhVar.K0(this.b, this.c, this.d, this.e));
                } else {
                    atomicReference.set(pvhVar.p(null, this.b, this.c, this.d));
                }
                this.f.u();
                this.a.notify();
            } finally {
                this.a.notify();
            }
        }
    }
}
