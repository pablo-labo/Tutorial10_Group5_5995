package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.h7h;
import defpackage.y7h;

/* JADX INFO: loaded from: classes2.dex */
final class at {
    private final y7h a;
    private final y7h b;

    public at(y7h y7hVar, y7h y7hVar2) {
        this.a = y7hVar;
        this.b = y7hVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, h7h h7hVar) {
        Context context = (Context) this.a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        h7hVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, h7hVar);
    }
}
