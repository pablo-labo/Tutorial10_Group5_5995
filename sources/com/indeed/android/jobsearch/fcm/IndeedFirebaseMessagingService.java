package com.indeed.android.jobsearch.fcm;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.a74;
import defpackage.a9c;
import defpackage.bd4;
import defpackage.boa;
import defpackage.bu8;
import defpackage.c1f;
import defpackage.e13;
import defpackage.eq3;
import defpackage.eu2;
import defpackage.eze;
import defpackage.f13;
import defpackage.f97;
import defpackage.fp7;
import defpackage.fwc;
import defpackage.g13;
import defpackage.gu5;
import defpackage.ht0;
import defpackage.il0;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.lz2;
import defpackage.mj8;
import defpackage.no3;
import defpackage.pnb;
import defpackage.qt8;
import defpackage.r6;
import defpackage.r7d;
import defpackage.u34;
import defpackage.u63;
import defpackage.uh3;
import defpackage.v03;
import defpackage.vla;
import defpackage.w1g;
import defpackage.wea;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/fcm/IndeedFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndeedFirebaseMessagingService extends FirebaseMessagingService {
    public final Lazy V;
    public final Lazy W;

    @uh3(c = "com.indeed.android.jobsearch.fcm.IndeedFirebaseMessagingService$onMessageReceived$2", f = "IndeedFirebaseMessagingService.kt", l = {66}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                il0 il0Var = il0.a;
                this.label = 1;
                Object objH = il0Var.h(this);
                g13 g13Var = g13.a;
                if (objH == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.fcm.IndeedFirebaseMessagingService$onMessageReceived$3", f = "IndeedFirebaseMessagingService.kt", l = {78}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                il0 il0Var = il0.a;
                this.label = 1;
                Object objH = il0Var.h(this);
                g13 g13Var = g13.a;
                if (objH == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.fcm.IndeedFirebaseMessagingService$onMessageReceived$4", f = "IndeedFirebaseMessagingService.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return IndeedFirebaseMessagingService.this.new c(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            Lazy lazy = vla.a;
            vla.a((Context) IndeedFirebaseMessagingService.this.V.getValue());
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements gu5<Context> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IndeedFirebaseMessagingService indeedFirebaseMessagingService) {
            super(0);
            this.$this_inject = indeedFirebaseMessagingService;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    public static final class e extends mj8 implements gu5<w1g> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(IndeedFirebaseMessagingService indeedFirebaseMessagingService) {
            super(0);
            this.$this_inject = indeedFirebaseMessagingService;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, w1g] */
        @Override // defpackage.gu5
        public final w1g invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(w1g.class), a9cVar);
        }
    }

    public IndeedFirebaseMessagingService() {
        d dVar = new d(this);
        qt8 qt8Var = qt8.a;
        this.V = boa.E(qt8Var, dVar);
        this.W = boa.E(qt8Var, new e(this));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void f(RemoteMessage remoteMessage) {
        if (remoteMessage.b == null) {
            Bundle bundle = remoteMessage.a;
            ht0 ht0Var = new ht0();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        ht0Var.put(str, str2);
                    }
                }
            }
            remoteMessage.b = ht0Var;
        }
        ht0 ht0Var2 = remoteMessage.b;
        ht0Var2.getClass();
        if (ht0Var2.isEmpty()) {
            ArrayList arrayList = lz2.a;
            lz2.h("FCMService", "Message data is empty", null, 12);
            return;
        }
        ArrayList arrayList2 = lz2.a;
        Log.d("FCMService", "Message data: " + ht0Var2, null);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : (ht0.a) ht0Var2.entrySet()) {
            bundle2.putString((String) entry.getKey(), (String) entry.getValue());
        }
        u34.a.getClass();
        u34.c(bundle2);
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        eu2 eu2VarA = f13.a(v03.a.C0438a.c(ezeVarA, no3.c));
        fp7 fp7Var = (fp7) pnb.B(this).a(null, fwc.a.b(fp7.class), null);
        bu8 bu8Var = bu8.a;
        if (!bu8Var.h()) {
            u63.Y(eu2VarA, null, null, new b(2, null), 3);
        } else if (fp7Var.a) {
            u63.Y(eu2VarA, null, null, new a(2, null), 3);
        } else {
            ArrayList arrayList3 = lz2.a;
            Log.d("FCMService", "App is in background, skipping unread messages update request", null);
            j6g j6gVar = j6g.a;
        }
        u63.Y(eu2VarA, null, null, new c(null), 3);
        if (wl7.b(bundle2.getString("notification_id"), String.valueOf(bd4.a.c()))) {
            boolean zH = bu8Var.h();
            Lazy lazy = this.W;
            if (!zH) {
                ((w1g) lazy.getValue()).c();
            } else if (fp7Var.a) {
                ((w1g) lazy.getValue()).c();
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void g(String str) {
        str.getClass();
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        if (jobSearchApplication == null) {
            wl7.g("appInstance");
            throw null;
        }
        f97 f97Var = jobSearchApplication.c;
        if (f97Var != null) {
            f97Var.b(this, str, false);
        } else {
            wl7.g("indeedFcmManager");
            throw null;
        }
    }
}
