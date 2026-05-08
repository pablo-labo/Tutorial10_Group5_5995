package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.g7i;
import defpackage.mli;
import defpackage.p0i;
import defpackage.pii;
import defpackage.w6i;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends p0i {
    public final w6i b;
    public final TaskCompletionSource c;
    public final /* synthetic */ g7i d;

    public c(g7i g7iVar, TaskCompletionSource taskCompletionSource) {
        w6i w6iVar = new w6i("OnRequestInstallCallback");
        this.d = g7iVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.b = w6iVar;
        this.c = taskCompletionSource;
    }

    public final void h(Bundle bundle) {
        mli mliVar = this.d.a;
        if (mliVar != null) {
            TaskCompletionSource taskCompletionSource = this.c;
            synchronized (mliVar.f) {
                mliVar.e.remove(taskCompletionSource);
            }
            synchronized (mliVar.f) {
                try {
                    if (mliVar.k.get() <= 0 || mliVar.k.decrementAndGet() <= 0) {
                        mliVar.a().post(new pii(mliVar));
                    } else {
                        mliVar.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                } finally {
                }
            }
        }
        this.b.a("onGetLaunchReviewFlowInfo", new Object[0]);
        this.c.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
