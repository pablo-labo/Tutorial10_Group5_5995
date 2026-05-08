package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.util.VisibleForTesting;
import defpackage.g91;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class ibi implements ServiceConnection, g91.a, g91.b {
    public volatile boolean a;
    public volatile gwh b;
    public final /* synthetic */ y8i c;

    public ibi(y8i y8iVar) {
        this.c = y8iVar;
    }

    @Override // g91.a
    public final void c() {
        fib.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c.zzq().m(new sbi(this, this.b.i()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // g91.a
    public final void e(int i) {
        fib.e("MeasurementServiceConnection.onConnectionSuspended");
        y8i y8iVar = this.c;
        y8iVar.zzr().b0.b("Service connection suspended");
        y8iVar.zzq().m(new l6i(this, 2));
    }

    @Override // g91.b
    public final void h(ConnectionResult connectionResult) {
        fib.e("MeasurementServiceConnection.onConnectionFailed");
        ewh ewhVar = this.c.a.X;
        if (ewhVar == null || !ewhVar.b) {
            ewhVar = null;
        }
        if (ewhVar != null) {
            ewhVar.X.a(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.zzq().m(new wbi(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fib.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.zzr().f.b("Service connected with null binder");
                return;
            }
            IInterface uvhVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    uvhVar = iInterfaceQueryLocalInterface instanceof pvh ? (pvh) iInterfaceQueryLocalInterface : new uvh(iBinder);
                    this.c.zzr().c0.b("Bound to IMeasurementService interface");
                } else {
                    this.c.zzr().f.a(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.c.zzr().f.b("Service connect failed to get IMeasurementService");
            }
            if (uvhVar == null) {
                this.a = false;
                try {
                    zo2 zo2VarB = zo2.b();
                    y8i y8iVar = this.c;
                    zo2VarB.c(y8iVar.a.a, y8iVar.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.zzq().m(new c4i(this, uvhVar, 1));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        fib.e("MeasurementServiceConnection.onServiceDisconnected");
        y8i y8iVar = this.c;
        y8iVar.zzr().b0.b("Service disconnected");
        y8iVar.zzq().m(new t9d(2, this, componentName));
    }
}
