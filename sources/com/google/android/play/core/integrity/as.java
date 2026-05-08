package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import defpackage.h7h;
import defpackage.q8h;
import defpackage.s8h;

/* JADX INFO: loaded from: classes2.dex */
final class as extends q8h {
    final TaskCompletionSource a;
    final h7h b;
    private final s8h c = new s8h("RequestDialogCallbackImpl");
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, h7h h7hVar) {
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = h7hVar;
    }

    @Override // defpackage.r8h
    public final void b(Bundle bundle) {
        this.b.d(this.a);
        this.c.b("onRequestDialog(%s)", this.d);
        ApiException apiExceptionA = this.e.a(bundle);
        if (apiExceptionA != null) {
            this.a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            s8h s8hVar = this.c;
            Object[] objArr = {this.d};
            s8hVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", s8h.d(s8hVar.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        s8h s8hVar2 = this.c;
        Object[] objArr2 = new Object[0];
        s8hVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", s8h.d(s8hVar2.a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
