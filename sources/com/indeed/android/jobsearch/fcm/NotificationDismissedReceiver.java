package com.indeed.android.jobsearch.fcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.boa;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.hb9;
import defpackage.j6g;
import defpackage.lc9;
import defpackage.lx5;
import defpackage.ly5;
import defpackage.mj8;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.s87;
import defpackage.tx5;
import defpackage.vh8;
import defpackage.xh8;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jobsearch/fcm/NotificationDismissedReceiver;", "Landroid/content/BroadcastReceiver;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationDismissedReceiver extends BroadcastReceiver implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final tx5 b = new tx5();

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NotificationDismissedReceiver notificationDismissedReceiver) {
            super(0);
            this.$this_inject = notificationDismissedReceiver;
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
        context.getClass();
        intent.getClass();
        Bundle bundleExtra = intent.getBundleExtra("loggedParams");
        if (bundleExtra != null) {
            hb9 hb9Var = new hb9();
            for (String str : bundleExtra.keySet()) {
                String string = bundleExtra.getString(str);
                if (string != null) {
                    str.getClass();
                    hb9Var.put(str, string);
                }
            }
            j6g j6gVar = j6g.a;
            hb9 hb9VarJ = hb9Var.j();
            Lazy<s87> lazy = s87.f;
            gz4 gz4Var = (gz4) this.a.getValue();
            Map mapG0 = lc9.g0(hb9VarJ);
            tx5 tx5Var = this.b;
            tx5Var.getClass();
            s87.a.a(gz4Var, new lx5("droid_notif_dismiss", "PUSH_NOTIFICATION", "DISMISS", 1, tx5Var.a, new ly5(mapG0)));
        }
    }
}
