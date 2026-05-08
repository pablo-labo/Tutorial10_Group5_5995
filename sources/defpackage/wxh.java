package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class wxh extends BroadcastReceiver {
    public final fei a;
    public boolean b;
    public boolean c;

    public wxh(fei feiVar) {
        this.a = feiVar;
    }

    public final void a() {
        fei feiVar = this.a;
        feiVar.D();
        feiVar.zzq().b();
        feiVar.zzq().b();
        if (this.b) {
            feiVar.zzr().c0.b("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                feiVar.X.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                feiVar.zzr().f.a(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fei feiVar = this.a;
        feiVar.D();
        String action = intent.getAction();
        feiVar.zzr().c0.a(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            feiVar.zzr().X.a(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        nxh nxhVar = feiVar.b;
        fei.v(nxhVar);
        boolean zN = nxhVar.n();
        if (this.c != zN) {
            this.c = zN;
            feiVar.zzq().m(new gyh(this, zN));
        }
    }
}
