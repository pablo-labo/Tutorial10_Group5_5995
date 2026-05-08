package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import defpackage.aug;
import defpackage.dmc;
import defpackage.hzh;
import defpackage.rfh;
import defpackage.ykh;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends aug {
    public static final /* synthetic */ int d = 0;
    public final ThreadPoolExecutor c = dmc.o();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
        if (intent2 != null) {
            intent = intent2;
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        boolean zEquals = "google.com/iid".equals(intent.getStringExtra("from"));
        ThreadPoolExecutor threadPoolExecutor = this.c;
        ykh hzhVar = zEquals ? new hzh(threadPoolExecutor) : new rfh(context, threadPoolExecutor);
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        hzhVar.a(intent).addOnCompleteListener(threadPoolExecutor, new OnCompleteListener(zIsOrderedBroadcast, pendingResultGoAsync) { // from class: wki
            public final boolean a;
            public final BroadcastReceiver.PendingResult b;

            {
                this.a = zIsOrderedBroadcast;
                this.b = pendingResultGoAsync;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                int i = FirebaseInstanceIdReceiver.d;
                boolean z = this.a;
                BroadcastReceiver.PendingResult pendingResult = this.b;
                if (z) {
                    pendingResult.setResultCode(task.isSuccessful() ? ((Integer) task.getResult()).intValue() : 500);
                }
                pendingResult.finish();
            }
        });
    }
}
