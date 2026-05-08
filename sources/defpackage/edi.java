package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import defpackage.bn6;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class edi extends tuh {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ dhi c;

    public edi(dhi dhiVar, IBinder iBinder) {
        this.b = iBinder;
        this.c = dhiVar;
    }

    @Override // defpackage.tuh
    public final void b() {
        bn6 c0095a;
        int i = bn6.a.a;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            c0095a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            c0095a = iInterfaceQueryLocalInterface instanceof bn6 ? (bn6) iInterfaceQueryLocalInterface : new bn6.a.C0095a(iBinder);
        }
        qji qjiVar = this.c.a;
        qjiVar.m = c0095a;
        ArrayList arrayList = qjiVar.d;
        fsh fshVar = qjiVar.b;
        fshVar.a("linkToDeath", new Object[0]);
        try {
            qjiVar.m.asBinder().linkToDeath(qjiVar.j, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", fsh.c(fshVar.a, "linkToDeath failed", objArr), e);
            }
        }
        qjiVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
