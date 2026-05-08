package defpackage;

import android.os.IInterface;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class c4i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IInterface b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c4i(Object obj, IInterface iInterface, int i) {
        this.a = i;
        this.c = obj;
        this.b = iInterface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y8i y8iVarM = ((AppMeasurementDynamiteService) this.c).a.m();
                gmi gmiVar = (gmi) this.b;
                y8iVarM.b();
                y8iVarM.k();
                y8iVarM.p(new l9i(y8iVarM, y8iVarM.n(false), gmiVar));
                return;
            default:
                synchronized (((ibi) this.c)) {
                    try {
                        ((ibi) this.c).a = false;
                        if (!((ibi) this.c).c.r()) {
                            ((ibi) this.c).c.zzr().c0.b("Connected to service");
                            y8i y8iVar = ((ibi) this.c).c;
                            pvh pvhVar = (pvh) this.b;
                            y8iVar.b();
                            y8iVar.d = pvhVar;
                            y8iVar.u();
                            y8iVar.w();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
