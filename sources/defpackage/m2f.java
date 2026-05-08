package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class m2f implements ComponentCallbacks2 {
    public final Context a;
    public final WeakReference<frc> b;
    public final oga c;
    public volatile boolean d;
    public final AtomicBoolean e;

    public m2f(frc frcVar, Context context) {
        oga ojhVar;
        this.a = context;
        this.b = new WeakReference<>(frcVar);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        int i = 11;
        if (connectivityManager == null || ot2.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            ojhVar = new ojh(i);
        } else {
            try {
                qrc qrcVar = new qrc();
                qrcVar.a = connectivityManager;
                qrcVar.b = this;
                prc prcVar = new prc(qrcVar);
                qrcVar.c = prcVar;
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), prcVar);
                ojhVar = qrcVar;
            } catch (Exception unused) {
                ojhVar = new ojh(i);
            }
        }
        this.c = ojhVar;
        this.d = ojhVar.a();
        this.e = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.a.unregisterComponentCallbacks(this);
        this.c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.b.get() == null) {
            a();
            j6g j6gVar = j6g.a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        j6g j6gVar;
        frc frcVar = this.b.get();
        if (frcVar != null) {
            MemoryCache memoryCache = (MemoryCache) frcVar.b.getValue();
            if (memoryCache != null) {
                memoryCache.a(i);
            }
            j6gVar = j6g.a;
        } else {
            j6gVar = null;
        }
        if (j6gVar == null) {
            a();
        }
    }
}
