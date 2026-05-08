package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class fzh implements ServiceConnection {
    public final String a;
    public final /* synthetic */ hzh b;

    public fzh(hzh hzhVar, String str) {
        this.b = hzhVar;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i0i i0iVar = (i0i) this.b.a;
        if (iBinder == null) {
            ewh ewhVar = i0iVar.X;
            i0i.i(ewhVar);
            ewhVar.X.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = y0i.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            esh cxhVar = iInterfaceQueryLocalInterface instanceof esh ? (esh) iInterfaceQueryLocalInterface : new cxh(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            ewh ewhVar2 = i0iVar.X;
            i0i.i(ewhVar2);
            ewhVar2.c0.b("Install Referrer Service connected");
            a0i a0iVar = i0iVar.Y;
            i0i.i(a0iVar);
            a0iVar.m(new ozh(this, cxhVar, this));
        } catch (Exception e) {
            ewh ewhVar3 = i0iVar.X;
            i0i.i(ewhVar3);
            ewhVar3.X.a(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ewh ewhVar = ((i0i) this.b.a).X;
        i0i.i(ewhVar);
        ewhVar.c0.b("Install Referrer Service disconnected");
    }
}
