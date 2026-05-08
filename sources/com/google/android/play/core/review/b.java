package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import defpackage.g7i;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class b {
    public final g7i a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public b(g7i g7iVar) {
        this.a = g7iVar;
    }

    public final void a(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            Tasks.forResult(null);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this.b, taskCompletionSource));
        activity.startActivity(intent);
        taskCompletionSource.getTask();
    }
}
