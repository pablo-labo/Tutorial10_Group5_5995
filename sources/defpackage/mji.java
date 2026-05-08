package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mji implements ServiceConnection, yki {
    public final /* synthetic */ fki V;
    public final HashMap a;
    public int b;
    public boolean c;
    public IBinder d;
    public final jii e;
    public ComponentName f;

    public mji(fki fkiVar, jii jiiVar) {
        Objects.requireNonNull(fkiVar);
        this.V = fkiVar;
        this.e = jiiVar;
        this.a = new HashMap();
        this.b = 2;
    }

    public final ConnectionResult a(String str, Executor executor) {
        try {
            Intent intentA = whh.a(this.V.e, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(aph.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                fki fkiVar = this.V;
                zo2 zo2Var = fkiVar.g;
                Context context = fkiVar.e;
                jii jiiVar = this.e;
                boolean zD = zo2Var.d(context, str, intentA, this, 4225, executor);
                this.c = zD;
                if (zD) {
                    fkiVar.f.sendMessageDelayed(fkiVar.f.obtainMessage(1, jiiVar), fkiVar.i);
                    ConnectionResult connectionResult = ConnectionResult.f;
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult;
                }
                this.b = 2;
                try {
                    fkiVar.g.c(fkiVar.e, this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return connectionResult2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (zzaf e) {
            return e.zza;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fki fkiVar = this.V;
        synchronized (fkiVar.d) {
            try {
                fkiVar.f.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        fki fkiVar = this.V;
        synchronized (fkiVar.d) {
            try {
                fkiVar.f.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
