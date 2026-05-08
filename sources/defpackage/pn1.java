package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class pn1 extends BroadcastReceiver {
    public final /* synthetic */ qn1<Object> a;

    public pn1(qn1<Object> qn1Var) {
        this.a = qn1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        this.a.g(intent);
    }
}
