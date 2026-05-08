package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zmi extends hlh {
    @Override // defpackage.hlh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) koh.a(parcel, Bundle.CREATOR);
            koh.c(parcel);
            zrh zrhVar = (zrh) this;
            fib.j(zrhVar.a, "onPostInitComplete can be called only once per call to getRemoteService");
            g91 g91Var = zrhVar.a;
            int i3 = zrhVar.b;
            g91Var.getClass();
            zwh zwhVar = new zwh(g91Var, i2, strongBinder, bundle);
            dlh dlhVar = g91Var.f;
            dlhVar.sendMessage(dlhVar.obtainMessage(1, i3, -1, zwhVar));
            zrhVar.a = null;
        } else if (i == 2) {
            parcel.readInt();
            koh.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) koh.a(parcel, zzj.CREATOR);
            koh.c(parcel);
            zrh zrhVar2 = (zrh) this;
            g91 g91Var2 = zrhVar2.a;
            fib.j(g91Var2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            fib.i(zzjVar);
            g91Var2.v = zzjVar;
            if (g91Var2.n()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.d;
                pfd pfdVarA = pfd.a();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a;
                synchronized (pfdVarA) {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = pfd.c;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = pfdVarA.a;
                        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.a < rootTelemetryConfiguration.a) {
                        }
                    }
                    pfdVarA.a = rootTelemetryConfiguration;
                }
            }
            Bundle bundle2 = zzjVar.a;
            fib.j(zrhVar2.a, "onPostInitComplete can be called only once per call to getRemoteService");
            g91 g91Var3 = zrhVar2.a;
            int i5 = zrhVar2.b;
            g91Var3.getClass();
            zwh zwhVar2 = new zwh(g91Var3, i4, strongBinder2, bundle2);
            dlh dlhVar2 = g91Var3.f;
            dlhVar2.sendMessage(dlhVar2.obtainMessage(1, i5, -1, zwhVar2));
            zrhVar2.a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
