package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class g7h implements ServiceConnection {
    public final /* synthetic */ h7h a;

    public /* synthetic */ g7h(h7h h7hVar) {
        this.a = h7hVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h7h h7hVar = this.a;
        h7hVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        h7hVar.a().post(new e7h(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        h7h h7hVar = this.a;
        h7hVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        h7hVar.a().post(new f7h(this));
    }
}
