package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bki extends x9i {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ eli c;

    public bki(eli eliVar, IBinder iBinder) {
        this.c = eliVar;
        this.b = iBinder;
    }

    @Override // defpackage.x9i
    public final void a() {
        vwh urhVar;
        mli mliVar = this.c.a;
        int i = juh.b;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            urhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            urhVar = iInterfaceQueryLocalInterface instanceof vwh ? (vwh) iInterfaceQueryLocalInterface : new urh(iBinder);
        }
        mliVar.m = urhVar;
        mliVar.b.a("linkToDeath", new Object[0]);
        try {
            mliVar.m.asBinder().linkToDeath(mliVar.j, 0);
        } catch (RemoteException e) {
            w6i w6iVar = mliVar.b;
            Object[] objArr = new Object[0];
            w6iVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", w6i.b(w6iVar.a, "linkToDeath failed", objArr), e);
            }
        }
        mliVar.g = false;
        Iterator it = mliVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        mliVar.d.clear();
    }
}
