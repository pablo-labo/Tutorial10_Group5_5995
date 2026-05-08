package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s9i implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public s9i(y8i y8iVar, f8i f8iVar) {
        this.c = y8iVar;
        this.b = f8iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y8i y8iVar = (y8i) obj;
                pvh pvhVar = y8iVar.d;
                if (pvhVar == null) {
                    y8iVar.zzr().f.b("Failed to send current screen to service");
                } else {
                    try {
                        f8i f8iVar = (f8i) obj2;
                        if (f8iVar == null) {
                            pvhVar.x(0L, null, null, y8iVar.a.a.getPackageName());
                        } else {
                            pvhVar.x(f8iVar.c, f8iVar.a, f8iVar.b, y8iVar.a.a.getPackageName());
                        }
                        y8iVar.u();
                    } catch (RemoteException e) {
                        y8iVar.zzr().f.a(e, "Failed to send current screen to the service");
                        return;
                    }
                }
                break;
            default:
                fei feiVar = (fei) obj2;
                feiVar.F();
                Runnable runnable = (Runnable) obj;
                feiVar.H();
                if (feiVar.b0 == null) {
                    feiVar.b0 = new ArrayList();
                }
                feiVar.b0.add(runnable);
                feiVar.E();
                break;
        }
    }

    public s9i(fei feiVar, Runnable runnable) {
        this.b = feiVar;
        this.c = runnable;
    }
}
