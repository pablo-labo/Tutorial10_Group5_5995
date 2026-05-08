package defpackage;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class dah extends BroadcastReceiver {
    public Context a;
    public final kt1 b;

    public dah(kt1 kt1Var) {
        this.b = kt1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            kt1 kt1Var = this.b;
            kch kchVar = ((fch) kt1Var.b).b;
            kchVar.b.set(null);
            och ochVar = ((k9h) kchVar).f.c0;
            ochVar.sendMessage(ochVar.obtainMessage(3));
            AlertDialog alertDialog = (AlertDialog) kt1Var.a;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
