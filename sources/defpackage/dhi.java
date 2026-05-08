package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class dhi implements ServiceConnection {
    public final /* synthetic */ qji a;

    public /* synthetic */ dhi(qji qjiVar) {
        Objects.requireNonNull(qjiVar);
        this.a = qjiVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qji qjiVar = this.a;
        qjiVar.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        qjiVar.a().post(new edi(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qji qjiVar = this.a;
        qjiVar.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        qjiVar.a().post(new vfi(this));
    }
}
