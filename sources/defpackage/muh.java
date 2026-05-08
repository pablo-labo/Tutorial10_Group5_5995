package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class muh implements ServiceConnection {
    public final int a;
    public final /* synthetic */ g91 b;

    public muh(g91 g91Var, int i) {
        this.b = g91Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        g91 g91Var = this.b;
        if (iBinder == null) {
            synchronized (g91Var.g) {
                i = g91Var.n;
            }
            if (i == 3) {
                g91Var.u = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            dlh dlhVar = g91Var.f;
            dlhVar.sendMessage(dlhVar.obtainMessage(i2, g91Var.w.get(), 16));
            return;
        }
        synchronized (g91Var.h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                g91Var.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gn6)) ? new ggh(iBinder) : (gn6) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        g91 g91Var2 = this.b;
        int i3 = this.a;
        g91Var2.getClass();
        t0i t0iVar = new t0i(g91Var2, 0, null);
        dlh dlhVar2 = g91Var2.f;
        dlhVar2.sendMessage(dlhVar2.obtainMessage(7, i3, -1, t0iVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g91 g91Var = this.b;
        synchronized (g91Var.h) {
            g91Var.i = null;
        }
        g91 g91Var2 = this.b;
        int i = this.a;
        dlh dlhVar = g91Var2.f;
        dlhVar.sendMessage(dlhVar.obtainMessage(6, i, 1));
    }
}
