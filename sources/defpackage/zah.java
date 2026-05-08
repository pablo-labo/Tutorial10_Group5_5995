package defpackage;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"HandlerLeak"})
public final class zah extends och {
    public final Context a;
    public final /* synthetic */ na6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zah(na6 na6Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = na6Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = oa6.a;
        na6 na6Var = this.b;
        Context context = this.a;
        int iC = na6Var.c(context, i2);
        AtomicBoolean atomicBoolean = bb6.a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentA = na6Var.a(context, "n", iC);
            na6Var.g(context, iC, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
