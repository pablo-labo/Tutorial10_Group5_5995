package com.indeed.android.jobsearch.fcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.vh8;
import defpackage.vla;
import defpackage.wl7;
import defpackage.xh8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jobsearch/fcm/NotificationBlockStateReceiver;", "Landroid/content/BroadcastReceiver;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationBlockStateReceiver extends BroadcastReceiver implements xh8 {
    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        if (wl7.b(action, "android.app.action.APP_BLOCK_STATE_CHANGED") || wl7.b(action, "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
            vla.a(context);
        }
    }
}
