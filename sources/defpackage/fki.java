package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class fki extends ka6 {
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile x0i f;
    public final zo2 g;
    public final long h;
    public final long i;

    public fki(Context context, Looper looper) {
        uji ujiVar = new uji(this);
        this.e = context.getApplicationContext();
        x0i x0iVar = new x0i(looper, ujiVar);
        Looper.getMainLooper();
        this.f = x0iVar;
        this.g = zo2.b();
        this.h = 5000L;
        this.i = 300000L;
    }

    @Override // defpackage.ka6
    public final ConnectionResult C1(jii jiiVar, muh muhVar, String str, Executor executor) {
        ConnectionResult connectionResultA;
        HashMap map = this.d;
        synchronized (map) {
            try {
                mji mjiVar = (mji) map.get(jiiVar);
                if (executor == null) {
                    executor = null;
                }
                if (mjiVar == null) {
                    mjiVar = new mji(this, jiiVar);
                    mjiVar.a.put(muhVar, muhVar);
                    connectionResultA = mjiVar.a(str, executor);
                    map.put(jiiVar, mjiVar);
                } else {
                    this.f.removeMessages(0, jiiVar);
                    if (mjiVar.a.containsKey(muhVar)) {
                        String string = jiiVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    mjiVar.a.put(muhVar, muhVar);
                    int i = mjiVar.b;
                    if (i == 1) {
                        muhVar.onServiceConnected(mjiVar.f, mjiVar.d);
                    } else if (i == 2) {
                        connectionResultA = mjiVar.a(str, executor);
                    }
                    connectionResultA = null;
                }
                if (mjiVar.c) {
                    return ConnectionResult.f;
                }
                if (connectionResultA == null) {
                    connectionResultA = new ConnectionResult(-1, null, null);
                }
                return connectionResultA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ka6
    public final void G1(jii jiiVar, ServiceConnection serviceConnection) {
        fib.j(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.d;
        synchronized (map) {
            try {
                mji mjiVar = (mji) map.get(jiiVar);
                if (mjiVar == null) {
                    String string = jiiVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!mjiVar.a.containsKey(serviceConnection)) {
                    String string2 = jiiVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                mjiVar.a.remove(serviceConnection);
                if (mjiVar.a.isEmpty()) {
                    this.f.sendMessageDelayed(this.f.obtainMessage(0, jiiVar), this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
