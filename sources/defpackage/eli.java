package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class eli implements ServiceConnection {
    public final /* synthetic */ mli a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mli mliVar = this.a;
        mliVar.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        mliVar.a().post(new bki(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        mli mliVar = this.a;
        mliVar.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        mliVar.a().post(new nki(this));
    }
}
