package com.indeed.android.jobsearch.fcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.aq1;
import defpackage.boa;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.jy5;
import defpackage.lx5;
import defpackage.mj8;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.s87;
import defpackage.tla;
import defpackage.tx5;
import defpackage.u34;
import defpackage.vh8;
import defpackage.xh8;
import defpackage.zz4;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jobsearch/fcm/NotificationNextActionReceiver;", "Landroid/content/BroadcastReceiver;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationNextActionReceiver extends BroadcastReceiver implements xh8 {
    public static final /* synthetic */ int c = 0;
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final tx5 b = new tx5();

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NotificationNextActionReceiver notificationNextActionReceiver) {
            super(0);
            this.$this_inject = notificationNextActionReceiver;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("action_next_body") : null;
        String stringExtra2 = intent != null ? intent.getStringExtra("action_next_title") : null;
        String stringExtra3 = intent != null ? intent.getStringExtra("action_next_url") : null;
        String stringExtra4 = intent != null ? intent.getStringExtra("channel_id") : null;
        String stringExtra5 = intent != null ? intent.getStringExtra("notification_id") : null;
        String stringExtra6 = intent != null ? intent.getStringExtra("cancelNotificationTag") : null;
        String stringExtra7 = intent != null ? intent.getStringExtra("entity_id") : null;
        Lazy<s87> lazy = s87.f;
        gz4 gz4Var = (gz4) this.a.getValue();
        zz4 zz4Var = new zz4(stringExtra7, 2);
        tx5 tx5Var = this.b;
        tx5Var.getClass();
        s87.a.a(gz4Var, new lx5("droid_notif_action_next", "interaction", "tapButton", 1, tx5Var.a, new jy5(zz4Var)));
        Bundle bundleA = aq1.a(new Pair("title", stringExtra2), new Pair("text", stringExtra), new Pair("url", stringExtra3), new Pair("notification_id", stringExtra5), new Pair("channel_id", stringExtra4));
        if (stringExtra6 != null && stringExtra5 != null) {
            u34 u34Var = u34.a;
            int i = Integer.parseInt(stringExtra5);
            u34Var.getClass();
            new tla(u34.b()).b.cancel(stringExtra6, i);
        }
        u34.a.getClass();
        u34.c(bundleA);
    }
}
