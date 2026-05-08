package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class k34 extends BroadcastReceiver {
    public final /* synthetic */ ym1 a;

    public k34(ym1 ym1Var) {
        this.a = ym1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if ((context.getPackageName() + ".RELOAD_APP_ACTION").equals(intent.getAction())) {
            this.a.w();
        }
    }
}
