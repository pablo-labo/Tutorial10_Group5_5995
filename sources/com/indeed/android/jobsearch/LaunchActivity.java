package com.indeed.android.jobsearch;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import android.webkit.GeolocationPermissions;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.appwidget.RecentSearchAppWidgetProvider;
import com.indeed.android.jobsearch.appwidget.RelevantJobsAppWidgetProvider;
import com.indeed.android.jobsearch.util.AppStartupTimes;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import com.indeed.android.jsmappservices.util.LocationSensor;
import defpackage.a9c;
import defpackage.ah2;
import defpackage.at7;
import defpackage.b52;
import defpackage.boa;
import defpackage.bu8;
import defpackage.c1f;
import defpackage.c94;
import defpackage.cr8;
import defpackage.d0h;
import defpackage.d93;
import defpackage.e13;
import defpackage.e9;
import defpackage.ea7;
import defpackage.esg;
import defpackage.et7;
import defpackage.ev1;
import defpackage.f8;
import defpackage.f8b;
import defpackage.f97;
import defpackage.frg;
import defpackage.ft7;
import defpackage.fv4;
import defpackage.fwc;
import defpackage.g13;
import defpackage.g4a;
import defpackage.g8b;
import defpackage.gme;
import defpackage.goa;
import defpackage.grg;
import defpackage.gse;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.hf4;
import defpackage.hh1;
import defpackage.hpe;
import defpackage.i73;
import defpackage.if4;
import defpackage.irg;
import defpackage.iwc;
import defpackage.izg;
import defpackage.j6g;
import defpackage.j99;
import defpackage.ja;
import defpackage.jf4;
import defpackage.ju;
import defpackage.jz2;
import defpackage.k19;
import defpackage.k99;
import defpackage.kf4;
import defpackage.kpg;
import defpackage.kq7;
import defpackage.kr7;
import defpackage.l2f;
import defpackage.l99;
import defpackage.lc9;
import defpackage.lf4;
import defpackage.ls3;
import defpackage.lu2;
import defpackage.lx5;
import defpackage.lz2;
import defpackage.m99;
import defpackage.mca;
import defpackage.mhb;
import defpackage.mj8;
import defpackage.na6;
import defpackage.nhb;
import defpackage.o87;
import defpackage.oa6;
import defpackage.ohb;
import defpackage.ot2;
import defpackage.oy5;
import defpackage.p63;
import defpackage.pk3;
import defpackage.pmc;
import defpackage.pnb;
import defpackage.py5;
import defpackage.pyd;
import defpackage.q34;
import defpackage.qt8;
import defpackage.r6;
import defpackage.r74;
import defpackage.r7d;
import defpackage.r8c;
import defpackage.rkc;
import defpackage.rq;
import defpackage.s87;
import defpackage.sk3;
import defpackage.t91;
import defpackage.tf2;
import defpackage.tk3;
import defpackage.tla;
import defpackage.tn3;
import defpackage.tx5;
import defpackage.u63;
import defpackage.u8;
import defpackage.u91;
import defpackage.ua6;
import defpackage.uh3;
import defpackage.ut0;
import defpackage.uwg;
import defpackage.ux0;
import defpackage.ux5;
import defpackage.v8;
import defpackage.vh6;
import defpackage.vk8;
import defpackage.w1g;
import defpackage.w74;
import defpackage.w8;
import defpackage.w8c;
import defpackage.wl7;
import defpackage.wuf;
import defpackage.wve;
import defpackage.xa6;
import defpackage.y7c;
import defpackage.yb;
import defpackage.zve;
import defpackage.zw8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\n\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/indeed/android/jobsearch/LaunchActivity;", "Lk19;", "Ltn3;", "Lf8b;", "<init>", "()V", "", "showDialog", "showToast", "", "stringResId", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"CustomSplashScreen"})
public final class LaunchActivity extends k19 implements tn3, f8b {
    public static final /* synthetic */ int e1 = 0;
    public final Lazy A0;
    public final Lazy B0;
    public final frg C0;
    public final frg D0;
    public final Lazy E0;
    public final Lazy F0;
    public final Lazy G0;
    public final Lazy H0;
    public o87 I0;
    public f8 J0;
    public final frg K0;
    public final frg L0;
    public final e9 M0;
    public final e9 N0;
    public final ev1 O0;
    public c94 P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public g8b T0;
    public final e9 U0;
    public Function1<? super et7, j6g> V0;
    public Function1<? super et7, j6g> W0;
    public final e9 X0;
    public final e9 Y0;
    public final a Z0;
    public final b a1;
    public String b1;
    public GeolocationPermissions.Callback c1;
    public final e9 d1;
    public final tx5 v0 = new tx5();
    public final Lazy w0;
    public final Lazy x0;
    public final Lazy y0;
    public final Lazy z0;

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: com.indeed.android.jobsearch.LaunchActivity$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$networkCallbackListener$1$onAvailable$1", f = "LaunchActivity.kt", l = {}, m = "invokeSuspend")
        public static final class C0165a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ LaunchActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0165a(LaunchActivity launchActivity, lu2<? super C0165a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = launchActivity;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0165a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0165a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                f8 f8Var = this.this$0.J0;
                if (f8Var != null) {
                    f8Var.e.setVisibility(8);
                }
                return j6g.a;
            }
        }

        @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$networkCallbackListener$1$onLost$1", f = "LaunchActivity.kt", l = {}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ LaunchActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LaunchActivity launchActivity, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.this$0 = launchActivity;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                f8 f8Var = this.this$0.J0;
                if (f8Var != null) {
                    f8Var.e.setVisibility(0);
                }
                return j6g.a;
            }
        }

        @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$networkCallbackListener$1$onUnavailable$1", f = "LaunchActivity.kt", l = {}, m = "invokeSuspend")
        public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ LaunchActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(LaunchActivity launchActivity, lu2<? super c> lu2Var) {
                super(2, lu2Var);
                this.this$0 = launchActivity;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new c(this.this$0, lu2Var);
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
                f8 f8Var = this.this$0.J0;
                if (f8Var != null) {
                    f8Var.e.setVisibility(0);
                }
                return j6g.a;
            }
        }

        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            network.getClass();
            super.onAvailable(network);
            LaunchActivity launchActivity = LaunchActivity.this;
            u63.Y(hh1.A(launchActivity), null, null, new C0165a(launchActivity, null), 3);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            network.getClass();
            super.onLost(network);
            LaunchActivity launchActivity = LaunchActivity.this;
            u63.Y(hh1.A(launchActivity), null, null, new b(launchActivity, null), 3);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onUnavailable() {
            super.onUnavailable();
            LaunchActivity launchActivity = LaunchActivity.this;
            u63.Y(hh1.A(launchActivity), null, null, new c(launchActivity, null), 3);
        }
    }

    public static final class b implements goa<jz2<? extends com.indeed.android.jobsearch.deeplink.b>> {
        public b() {
        }

        @Override // defpackage.goa
        public final void d(jz2<? extends com.indeed.android.jobsearch.deeplink.b> jz2Var) {
            androidx.navigation.k kVar;
            jz2<? extends com.indeed.android.jobsearch.deeplink.b> jz2Var2 = jz2Var;
            jz2Var2.getClass();
            if (jz2Var2.b) {
                return;
            }
            ArrayList arrayList = lz2.a;
            lz2.d("LaunchActivity", "Handling deep link request...", false, null);
            LaunchActivity launchActivity = LaunchActivity.this;
            f8 f8Var = launchActivity.J0;
            if (f8Var == null) {
                wl7.g("binding");
                throw null;
            }
            androidx.navigation.e eVarB = mca.b(f8Var.d);
            androidx.navigation.d dVarJ = eVarB.g.j();
            Integer numValueOf = (dVarJ == null || (kVar = dVarJ.b) == null) ? null : Integer.valueOf(kVar.W);
            if (numValueOf == null || numValueOf.intValue() == 0) {
                return;
            }
            lz2.d("LaunchActivity", "Received a new deeplink request. Current destination is: " + launchActivity.getResources().getResourceName(numValueOf.intValue()), false, null);
            if (numValueOf.intValue() != R.id.ianMainFragment) {
                lz2.d("LaunchActivity", "Will force to navigate right now", false, null);
                ((m99) launchActivity.D0.getValue()).h(launchActivity, eVarB);
            }
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.LaunchActivity$shareDiagnosticsLauncher$1$1$1$1", f = "LaunchActivity.kt", l = {228}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<Boolean> $showDialog$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g4a<Boolean> g4aVar, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$showDialog$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$showDialog$delegate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                g4a<Boolean> g4aVar = this.$showDialog$delegate;
                int i2 = LaunchActivity.e1;
                g4aVar.setValue(Boolean.TRUE);
                this.label = 1;
                Object objB = ls3.b(4000L, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            g4a<Boolean> g4aVar2 = this.$showDialog$delegate;
            int i3 = LaunchActivity.e1;
            g4aVar2.setValue(Boolean.FALSE);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements gu5<d0h> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [d0h, java.lang.Object] */
        @Override // defpackage.gu5
        public final d0h invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(d0h.class), a9cVar);
        }
    }

    public static final class e extends mj8 implements gu5<gz4> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class f extends mj8 implements gu5<LocationSensor> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.indeed.android.jsmappservices.util.LocationSensor, java.lang.Object] */
        @Override // defpackage.gu5
        public final LocationSensor invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(LocationSensor.class), a9cVar);
        }
    }

    public static final class g extends mj8 implements gu5<pk3> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, pk3] */
        @Override // defpackage.gu5
        public final pk3 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(pk3.class), a9cVar);
        }
    }

    public static final class h extends mj8 implements gu5<ua6> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ua6] */
        @Override // defpackage.gu5
        public final ua6 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(ua6.class), a9cVar);
        }
    }

    public static final class i extends mj8 implements gu5<xa6> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xa6] */
        @Override // defpackage.gu5
        public final xa6 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(xa6.class), a9cVar);
        }
    }

    public static final class j extends mj8 implements gu5<zw8> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zw8] */
        @Override // defpackage.gu5
        public final zw8 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(zw8.class), a9cVar);
        }
    }

    public static final class k extends mj8 implements gu5<f97> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [f97, java.lang.Object] */
        @Override // defpackage.gu5
        public final f97 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(f97.class), a9cVar);
        }
    }

    public static final class l extends mj8 implements gu5<y7c> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y7c] */
        @Override // defpackage.gu5
        public final y7c invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(y7c.class), a9cVar);
        }
    }

    public static final class m extends mj8 implements gu5<r8c> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(LaunchActivity launchActivity) {
            super(0);
            this.$this_inject = launchActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, r8c] */
        @Override // defpackage.gu5
        public final r8c invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(r8c.class), a9cVar);
        }
    }

    public static final class n extends mj8 implements gu5<grg.c> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(LaunchActivity launchActivity) {
            super(0);
            this.$this_viewModels = launchActivity;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }

    public static final class o extends mj8 implements gu5<irg> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(LaunchActivity launchActivity) {
            super(0);
            this.$this_viewModels = launchActivity;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    public static final class p extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(LaunchActivity launchActivity) {
            super(0);
            this.$this_viewModels = launchActivity;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class q extends mj8 implements gu5<grg.c> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(LaunchActivity launchActivity) {
            super(0);
            this.$this_viewModels = launchActivity;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }

    public static final class r extends mj8 implements gu5<irg> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(LaunchActivity launchActivity) {
            super(0);
            this.$this_viewModels = launchActivity;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    public static final class s extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(LaunchActivity launchActivity) {
            super(0);
            this.$this_viewModels = launchActivity;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class t extends mj8 implements gu5<grg.c> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(LaunchActivity launchActivity) {
            super(0);
            this.$this_viewModels = launchActivity;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }

    public static final class u extends mj8 implements gu5<irg> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(LaunchActivity launchActivity) {
            super(0);
            this.$this_viewModels = launchActivity;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    public static final class v extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(LaunchActivity launchActivity) {
            super(0);
            this.$this_viewModels = launchActivity;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public LaunchActivity() {
        e eVar = new e(this);
        qt8 qt8Var = qt8.a;
        this.w0 = boa.E(qt8Var, eVar);
        this.x0 = boa.E(qt8Var, new f(this));
        this.y0 = boa.E(qt8Var, new g(this));
        this.z0 = boa.E(qt8Var, new h(this));
        this.A0 = boa.E(qt8Var, new i(this));
        this.B0 = boa.E(qt8Var, new j(this));
        n nVar = new n(this);
        iwc iwcVar = fwc.a;
        this.C0 = new frg(iwcVar.b(ea7.class), new o(this), nVar, new p(this));
        this.D0 = new frg(iwcVar.b(m99.class), new k99(this), new j99(this), new l99(this));
        this.E0 = boa.E(qt8Var, new k(this));
        this.F0 = boa.E(qt8Var, new l(this));
        this.G0 = boa.E(qt8Var, new m(this));
        this.H0 = boa.E(qt8Var, new d(this));
        this.K0 = new frg(iwcVar.b(ohb.class), new r(this), new q(this), new s(this));
        this.L0 = new frg(iwcVar.b(mhb.class), new u(this), new t(this), new v(this));
        int i2 = 6;
        this.M0 = (e9) t(new w8(), new i73(this, i2));
        t(new w8(), new t91(this, 4));
        this.N0 = (e9) t(new w8(), new u91(this, i2));
        this.O0 = new ev1(this);
        this.U0 = (e9) t(new w8(), new tf2(this, 4));
        this.X0 = (e9) t(new v8(), new sk3(this, 3));
        this.Y0 = (e9) t(new w8(), new vh6(this, 1));
        this.Z0 = new a();
        this.a1 = new b();
        this.d1 = (e9) t(new u8(), new tk3(this, 2));
    }

    public final Map<String, String> B() {
        String string;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(this, (Class<?>) RecentSearchAppWidgetProvider.class));
        int[] appWidgetIds2 = appWidgetManager.getAppWidgetIds(new ComponentName(this, (Class<?>) RelevantJobsAppWidgetProvider.class));
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        boolean zK = false;
        boolean z = ot2.a(applicationContext, "android.permission.ACCESS_FINE_LOCATION") == 0 || ot2.a(applicationContext, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        boolean zAreNotificationsEnabled = new tla(applicationContext2).b.areNotificationsEnabled();
        String str = ((kq7) cr8.p(kq7.class)).j("Onboarding", "OnboardingCompleted", false) ? "1" : "0";
        String str2 = ((kq7) cr8.p(kq7.class)).j("Onboarding", "EligibleWhenSawRegPromo", false) ? "1" : "0";
        try {
            String packageName = new Intent("android.intent.action.VIEW", Uri.parse(d93.c())).resolveActivity(getPackageManager()).getPackageName();
            packageName.getClass();
            zK = wve.K(packageName, "com.indeed.android.jobsearch", false);
        } catch (Exception e2) {
            ArrayList arrayList = lz2.a;
            lz2.b("DeepLinkUrlUtil", "Error detecting link_click package name", false, e2);
        }
        float f2 = getResources().getConfiguration().fontScale;
        String stringExtra = getIntent().getStringExtra("com.android.browser.application_id");
        Uri uri = stringExtra != null ? Uri.parse(stringExtra) : null;
        Uri uri2 = (Uri) getIntent().getParcelableExtra("android.intent.extra.REFERRER");
        if (uri2 == null || (string = uri2.toString()) == null) {
            String string2 = uri != null ? uri.toString() : null;
            string = string2 == null ? "" : string2;
        }
        appWidgetIds.getClass();
        Pair pair = new Pair("isRecentSearchWidgetInstalled", appWidgetIds.length == 0 ? "0" : "1");
        appWidgetIds2.getClass();
        return lc9.a0(pair, new Pair("isRelevantJobsWidgetInstalled", appWidgetIds2.length == 0 ? "0" : "1"), new Pair("hasLocationPermissionsEnabled", z ? "1" : "0"), new Pair("hasPushPermissionEnabled", zAreNotificationsEnabled ? "1" : "0"), new Pair("isOnboardingCompleted", str), new Pair("isOnboardingEligible", str2), new Pair("isIjsDefaultForDeepLinks", zK ? "1" : "0"), new Pair("fontScale", String.valueOf(f2)), new Pair("source", string));
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final ev1 getO0() {
        return this.O0;
    }

    public final gz4 D() {
        return (gz4) this.w0.getValue();
    }

    public final IndeedWebView E() {
        wl7.g("indeedWebView");
        throw null;
    }

    public final rkc F() {
        if (pyd.h0) {
            Application application = getApplication();
            JobSearchApplication jobSearchApplication = application instanceof JobSearchApplication ? (JobSearchApplication) application : null;
            if (jobSearchApplication != null) {
                return jobSearchApplication.b();
            }
        }
        return null;
    }

    public final void G(boolean z) {
        Lazy<s87> lazy = s87.f;
        gz4 gz4VarD = D();
        oy5 oy5Var = oy5.b;
        tx5 tx5Var = this.v0;
        tx5Var.getClass();
        oy5Var.getClass();
        s87.a.a(gz4VarD, new lx5("permission_decision", "other", "permissionDecision", 1, tx5Var.a, new py5(z, oy5Var)));
        ArrayList arrayList = lz2.a;
        lz2.d("LaunchActivity", "WRITE_EXTERNAL_STORAGE permission ".concat(z ? "granted" : "denied"), false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(android.content.Intent r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.jobsearch.LaunchActivity.H(android.content.Intent, java.lang.String):void");
    }

    public final void I(nhb nhbVar) {
        nhbVar.getClass();
        ea7 ea7Var = (ea7) this.C0.getValue();
        ea7Var.b.k(new jz2<>(nhbVar));
        ea7Var.c.k(new jz2<>(Boolean.TRUE));
    }

    public final void J(nhb nhbVar) {
        ((r8c) this.G0.getValue()).getClass();
        if (((kr7) cr8.p(kr7.class)).e("meg_accel_droid_post_indeed_apply_primer").a == 1) {
            mhb mhbVar = (mhb) this.L0.getValue();
            String str = nhbVar.c;
            ft7 ft7VarA = ((at7) cr8.p(at7.class)).a();
            boolean zH = ((at7) cr8.p(at7.class)).h();
            boolean z = ft7VarA == ft7.b;
            if (zH) {
                ((at7) cr8.p(at7.class)).b();
                mhbVar.f.setValue(str);
                gse gseVar = mhbVar.e;
                Boolean boolValueOf = Boolean.valueOf(z);
                gseVar.getClass();
                gseVar.m(null, boolValueOf);
                gse gseVar2 = mhbVar.c;
                Boolean bool = Boolean.TRUE;
                gseVar2.getClass();
                gseVar2.m(null, bool);
                return;
            }
        }
        ohb ohbVar = (ohb) this.K0.getValue();
        ohbVar.h(true);
        ((gme) ohbVar.c).setValue(nhbVar);
    }

    public final void K(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.S0) {
            ArrayList arrayList = lz2.a;
            lz2.h("LaunchActivity", "External webview is already open", null, 12);
        } else {
            this.S0 = true;
            Intent intentPutExtra = new Intent(this, (Class<?>) ExternalActivity.class).putExtra("url", str).putExtra("ua", str2).putExtra("params", str3).putExtra("shareUrl", str4).putExtra("shareMessage", str5).putExtra("shareTk", str6);
            intentPutExtra.getClass();
            this.U0.a(intentPutExtra);
        }
    }

    @Override // defpackage.tn3
    public final void a() {
        if (!w74.i0) {
            WeakReference weakReference = w74.h0;
            pmc pmcVar = weakReference != null ? (pmc) weakReference.get() : null;
            w74.h0 = null;
            if (pmcVar != null && pmcVar.y()) {
                w74.i0 = true;
                try {
                    pmcVar.i();
                    return;
                } finally {
                    w74.i0 = false;
                }
            }
        }
        onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r21, int r22, android.content.Intent r23) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.jobsearch.LaunchActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // defpackage.k19, androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PackageInfo packageInfoA;
        String str;
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        AppStartupTimes.a("launch_act_create_start");
        List<String> list = w8c.a;
        Intent intent = getIntent();
        intent.getClass();
        boolean z = intent.getIntExtra("qaAutomationBuild", 0) == 1;
        w8c.c = z;
        if (z) {
            ArrayList arrayList = lz2.a;
            lz2.c("QaAutomationIntentHandler", "Extra qaAutomation* does not work on release builds", false, null, 12);
        }
        if (pyd.h0) {
            try {
                ArrayList arrayList2 = lz2.a;
                lz2.d("LaunchActivity", "Starting React Native initialization early using ReactHost.start()", false, null);
                rkc rkcVarF = F();
                if (rkcVarF != null) {
                    rkcVarF.start();
                }
                lz2.d("LaunchActivity", "React Native start() called successfully", false, null);
            } catch (Throwable th) {
                ArrayList arrayList3 = lz2.a;
                lz2.b("LaunchActivity", "Failed to start React Native during early initialization", false, th);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 3;
        (i2 >= 31 ? new hpe(this) : new ux0(this, 3)).b();
        super.onCreate(bundle);
        if (i2 >= 35) {
            int i4 = hf4.a;
            fv4 fv4Var = fv4.c;
            fv4Var.getClass();
            l2f l2fVar = new l2f(0, 0, fv4Var);
            l2f l2fVar2 = new l2f(hf4.a, hf4.b, fv4Var);
            View decorView = getWindow().getDecorView();
            decorView.getClass();
            Resources resources = decorView.getResources();
            resources.getClass();
            boolean zBooleanValue = ((Boolean) fv4Var.invoke(resources)).booleanValue();
            Resources resources2 = decorView.getResources();
            resources2.getClass();
            boolean zBooleanValue2 = ((Boolean) fv4Var.invoke(resources2)).booleanValue();
            if4 lf4Var = i2 >= 30 ? new lf4() : i2 >= 29 ? new kf4() : i2 >= 28 ? new jf4() : new if4();
            Window window = getWindow();
            window.getClass();
            lf4Var.b(l2fVar, l2fVar2, window, decorView, zBooleanValue, zBooleanValue2);
            Window window2 = getWindow();
            window2.getClass();
            lf4Var.a(window2);
            getWindow().getAttributes().layoutInDisplayCutoutMode = 2;
            izg.a(getWindow(), false);
        }
        ArrayList arrayList4 = lz2.a;
        lz2.d("LaunchActivity", "@@onCreate", false, null);
        if (bundle != null) {
            AppStartupTimes.e = true;
        }
        Intent intent2 = getIntent();
        intent2.getClass();
        H(intent2, "onCreate");
        Lazy lazy = q34.a;
        Context context = (Context) lazy.getValue();
        context.getClass();
        na6 na6Var = na6.d;
        na6Var.getClass();
        boolean zContains = ut0.I0(new Integer[]{1, 3, 9}).contains(Integer.valueOf(na6Var.c(context, oa6.a)));
        boolean z2 = !zContains;
        Context context2 = (Context) lazy.getValue();
        context2.getClass();
        boolean z3 = wuf.g("GET_WEB_VIEW_CLIENT") && (packageInfoA = uwg.a(context2)) != null && (str = packageInfoA.packageName) != null && (zve.U(str) ^ true);
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair("hasGooglePlayServices", Boolean.valueOf(z2)), new Pair("hasSystemWebView", Boolean.valueOf(z3)));
        boolean z4 = !zContains && z3;
        Lazy<s87> lazy2 = s87.f;
        gz4 gz4Var = (gz4) q34.b.getValue();
        tx5 tx5Var = q34.c;
        r74 r74Var = r74.c;
        tx5Var.getClass();
        r74Var.getClass();
        s87.a.a(gz4Var, new lx5("device_compatibility", "other", "deviceCompatibility", 1, tx5Var.a, new ux5(z4, linkedHashMapB0, r74Var)));
        if (z4) {
            View viewInflate = getLayoutInflater().inflate(R.layout.activity_fragment_host, (ViewGroup) null, false);
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            int i5 = R.id.componentReportEmailThanks;
            ComposeView composeView = (ComposeView) esg.a(viewInflate, R.id.componentReportEmailThanks);
            if (composeView != null) {
                i5 = R.id.debugStub;
                if (((ViewStub) esg.a(viewInflate, R.id.debugStub)) != null) {
                    i5 = R.id.mainNavHostFragment;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) esg.a(viewInflate, R.id.mainNavHostFragment);
                    if (fragmentContainerView != null) {
                        i5 = R.id.network_error_compose_view;
                        ComposeView composeView2 = (ComposeView) esg.a(viewInflate, R.id.network_error_compose_view);
                        if (composeView2 != null) {
                            i5 = R.id.reportErrorToast;
                            ComposeView composeView3 = (ComposeView) esg.a(viewInflate, R.id.reportErrorToast);
                            if (composeView3 != null) {
                                this.J0 = new f8(frameLayout, frameLayout, composeView, fragmentContainerView, composeView2, composeView3);
                                this.I0 = new o87(this);
                                f8 f8Var = this.J0;
                                if (f8Var == null) {
                                    wl7.g("binding");
                                    throw null;
                                }
                                ComposeView composeView4 = f8Var.e;
                                kpg.a aVar = kpg.a.a;
                                composeView4.setViewCompositionStrategy(aVar);
                                composeView4.setContent(new ah2(-1148237068, new b52(this, i3), true));
                                f8 f8Var2 = this.J0;
                                if (f8Var2 == null) {
                                    wl7.g("binding");
                                    throw null;
                                }
                                ComposeView composeView5 = f8Var2.f;
                                composeView5.setViewCompositionStrategy(aVar);
                                composeView5.setContent(new ah2(1370073367, new rq(this, 5), true));
                                f8 f8Var3 = this.J0;
                                if (f8Var3 == null) {
                                    wl7.g("binding");
                                    throw null;
                                }
                                setContentView(f8Var3.a);
                                if (i2 >= 35) {
                                    f8 f8Var4 = this.J0;
                                    if (f8Var4 == null) {
                                        wl7.g("binding");
                                        throw null;
                                    }
                                    f8Var4.a.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: uk8
                                        @Override // android.view.View.OnApplyWindowInsetsListener
                                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                            int i6 = LaunchActivity.e1;
                                            view.getClass();
                                            windowInsets.getClass();
                                            LaunchActivity launchActivity = this.a;
                                            boolean z5 = ((m99) launchActivity.D0.getValue()).e0;
                                            Lazy lazy3 = launchActivity.H0;
                                            if (!z5) {
                                                d0h d0hVar = (d0h) lazy3.getValue();
                                                f8 f8Var5 = launchActivity.J0;
                                                if (f8Var5 == null) {
                                                    wl7.g("binding");
                                                    throw null;
                                                }
                                                FrameLayout frameLayout2 = f8Var5.a;
                                                frameLayout2.getClass();
                                                d0hVar.getClass();
                                                return d0h.b(view, frameLayout2, windowInsets);
                                            }
                                            d0h d0hVar2 = (d0h) lazy3.getValue();
                                            f8 f8Var6 = launchActivity.J0;
                                            if (f8Var6 == null) {
                                                wl7.g("binding");
                                                throw null;
                                            }
                                            FrameLayout frameLayout3 = f8Var6.a;
                                            frameLayout3.getClass();
                                            d0hVar2.getClass();
                                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                            if (layoutParams == null) {
                                                ja.k("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                return null;
                                            }
                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                            marginLayoutParams.bottomMargin = 0;
                                            marginLayoutParams.leftMargin = 0;
                                            marginLayoutParams.rightMargin = 0;
                                            marginLayoutParams.topMargin = 0;
                                            view.setLayoutParams(marginLayoutParams);
                                            return d0h.a(frameLayout3, 0);
                                        }
                                    });
                                }
                                AppStartupTimes appStartupTimes2 = AppStartupTimes.a;
                                AppStartupTimes.a("launch_act_create_end");
                            }
                        }
                    }
                }
            }
            ja.k("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
            return;
        }
        lz2.h("DeviceCompatibilityUtils", "Device is not compatible. hasGooglePlayServices: " + z2 + ", hasSystemWebView: " + z3, null, 8);
        s87.a.a(D(), tx5.e(this.v0, "incompatible-device-dialog", "incompatible-device-dialog", null, 12));
        new AlertDialog.Builder(this).setTitle(getString(R.string.play_services_check_alert_title)).setMessage(getString(R.string.play_services_check_alert_message)).setPositiveButton(getString(R.string.play_services_check_alert_positive_button), new DialogInterface.OnClickListener() { // from class: rk8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                int i7 = LaunchActivity.e1;
                Lazy<s87> lazy3 = s87.f;
                LaunchActivity launchActivity = this.a;
                s87.a.a(launchActivity.D(), tx5.k(launchActivity.v0, "incompatible-device-dialog", "incompatible-device-dialog-close-button", null, 12));
                launchActivity.finishAndRemoveTask();
            }
        }).setCancelable(false).show();
        bu8 bu8Var = bu8.a;
        String strF = bu8Var.f();
        if (strF != null && strF.length() != 2 && strF.length() != 3) {
            lz2.b("LaunchActivity", "Clearing incorrect language code ".concat(strF), false, new IllegalArgumentException("Invalid language code"));
            bu8.c0.f(bu8.b[12], bu8Var, null);
        }
        if (i2 >= 33) {
            u63.Y(hh1.A(this), null, null, new vk8(this, null), 3);
        }
    }

    @Override // defpackage.wi0, androidx.fragment.app.g, android.app.Activity
    public final void onDestroy() {
        try {
            rkc rkcVarF = F();
            if (rkcVarF != null) {
                rkcVarF.i(this);
            }
        } catch (Throwable th) {
            ArrayList arrayList = lz2.a;
            lz2.b("LaunchActivity", "Failed to destroy React Native host", false, th);
        }
        super.onDestroy();
        ArrayList arrayList2 = lz2.a;
        lz2.d("LaunchActivity", "@@onDestroy", false, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        H(intent, "onNewIntent");
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onPause() {
        try {
            rkc rkcVarF = F();
            if (rkcVarF != null) {
                rkcVarF.onHostPause();
            }
        } catch (Throwable th) {
            ArrayList arrayList = lz2.a;
            lz2.b("LaunchActivity", "Failed to pause React Native host", false, th);
        }
        super.onPause();
        if (bu8.a.h()) {
            ((w1g) pnb.B(this).a(null, fwc.a.b(w1g.class), null)).b();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback(this.Z0);
        }
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i2, strArr, iArr);
        g8b g8bVar = this.T0;
        if (g8bVar != null && g8bVar.onRequestPermissionsResult(i2, strArr, iArr)) {
            this.T0 = null;
        }
        if (i2 == 1) {
            if (iArr.length != 1 || iArr[0] != 0) {
                G(false);
                return;
            }
            G(true);
            c94 c94Var = this.P0;
            if (c94Var == null) {
                ArrayList arrayList = lz2.a;
                lz2.c("LaunchActivity", "No download started: downloadInfo is null", false, null, 12);
                return;
            }
            o87 o87Var = this.I0;
            if (o87Var != null) {
                o87Var.a(this, c94Var, new yb(7));
            } else {
                wl7.g("indeedDownloadListener");
                throw null;
            }
        }
    }

    @Override // defpackage.k19, androidx.fragment.app.g, android.app.Activity
    public final void onResume() {
        super.onResume();
        c94 c94Var = this.P0;
        if (c94Var != null) {
            if (this.I0 == null) {
                wl7.g("indeedDownloadListener");
                throw null;
            }
            if ((Build.VERSION.SDK_INT > 28 || checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) && this.Q0) {
                o87 o87Var = this.I0;
                if (o87Var == null) {
                    wl7.g("indeedDownloadListener");
                    throw null;
                }
                o87Var.a(this, c94Var, new ju(6));
                this.Q0 = false;
            }
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(this.Z0);
        }
        rkc rkcVarF = F();
        if (rkcVarF != null) {
            rkcVarF.l(this, this);
        }
    }

    @Override // defpackage.k19, defpackage.wi0, androidx.fragment.app.g, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.R0++;
    }

    @Override // defpackage.f8b
    public final void x(String[] strArr, int i2, g8b g8bVar) {
        strArr.getClass();
        this.T0 = g8bVar;
        requestPermissions(strArr, i2);
    }
}
