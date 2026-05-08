package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e7h extends t8h {
    public final /* synthetic */ IBinder V;
    public final /* synthetic */ g7h W;

    public e7h(g7h g7hVar, IBinder iBinder) {
        this.V = iBinder;
        this.W = g7hVar;
    }

    @Override // defpackage.t8h
    public final void b() {
        h7h h7hVar = this.W.a;
        h7hVar.n = (IInterface) h7hVar.i.a(this.V);
        s8h s8hVar = h7hVar.b;
        s8hVar.b("linkToDeath", new Object[0]);
        try {
            h7hVar.n.asBinder().linkToDeath(h7hVar.k, 0);
        } catch (RemoteException e) {
            s8hVar.a(e, "linkToDeath failed", new Object[0]);
        }
        h7hVar.g = false;
        Iterator it = h7hVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        h7hVar.d.clear();
    }
}
