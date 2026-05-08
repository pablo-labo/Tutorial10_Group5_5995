package com.indeed.android.jobsearch.launch;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.util.AppStartupTimes;
import defpackage.a9c;
import defpackage.ah2;
import defpackage.ai8;
import defpackage.boa;
import defpackage.bt;
import defpackage.c1f;
import defpackage.cd;
import defpackage.cj;
import defpackage.cl8;
import defpackage.cr8;
import defpackage.d2f;
import defpackage.dqa;
import defpackage.e13;
import defpackage.ed;
import defpackage.epb;
import defpackage.f91;
import defpackage.frg;
import defpackage.fwc;
import defpackage.g13;
import defpackage.g99;
import defpackage.gl8;
import defpackage.grg;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.h99;
import defpackage.hg6;
import defpackage.i99;
import defpackage.il0;
import defpackage.irg;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.j91;
import defpackage.jrg;
import defpackage.kpg;
import defpackage.lu2;
import defpackage.lx5;
import defpackage.m99;
import defpackage.mj8;
import defpackage.mka;
import defpackage.nl0;
import defpackage.os5;
import defpackage.p63;
import defpackage.pq;
import defpackage.q6;
import defpackage.qpd;
import defpackage.qq2;
import defpackage.qt8;
import defpackage.r6;
import defpackage.r7d;
import defpackage.r81;
import defpackage.s87;
import defpackage.tp7;
import defpackage.tx5;
import defpackage.uh3;
import defpackage.vh8;
import defpackage.wl7;
import defpackage.wpa;
import defpackage.wy5;
import defpackage.xh8;
import defpackage.z0;
import defpackage.zob;
import defpackage.zv8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jobsearch/launch/LaunchFragment;", "Lf91;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LaunchFragment extends f91 implements xh8 {
    public final frg V;
    public LaunchActivity W;
    public final frg X;
    public final Lazy Y;
    public boolean a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final tx5 e;
    public final d2f f;

    @uh3(c = "com.indeed.android.jobsearch.launch.LaunchFragment$onCreate$1", f = "LaunchFragment.kt", l = {102}, m = "invokeSuspend")
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
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                il0 il0Var = il0.a;
                this.label = 1;
                Object objI = il0Var.i(this);
                g13 g13Var = g13.a;
                if (objI == g13Var) {
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

    public static final class b extends wpa {
        @Override // defpackage.wpa
        public final void b() {
        }
    }

    public static final class c extends mj8 implements gu5<r81> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LaunchFragment launchFragment) {
            super(0);
            this.$this_inject = launchFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, r81] */
        @Override // defpackage.gu5
        public final r81 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(r81.class), a9cVar);
        }
    }

    public static final class d extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LaunchFragment launchFragment) {
            super(0);
            this.$this_inject = launchFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class e extends mj8 implements gu5<mka> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LaunchFragment launchFragment) {
            super(0);
            this.$this_inject = launchFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, mka] */
        @Override // defpackage.gu5
        public final mka invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(mka.class), a9cVar);
        }
    }

    public static final class f extends mj8 implements gu5<nl0> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LaunchFragment launchFragment) {
            super(0);
            this.$this_inject = launchFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nl0] */
        @Override // defpackage.gu5
        public final nl0 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(nl0.class), a9cVar);
        }
    }

    public static final class g extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LaunchFragment launchFragment) {
            super(0);
            this.$this_viewModels = launchFragment;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class h extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.$ownerProducer = gVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class i extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class j extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            if (gu5Var != null && (p63Var = (p63) gu5Var.invoke()) != null) {
                return p63Var;
            }
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            return hg6Var != null ? hg6Var.getDefaultViewModelCreationExtras() : p63.a.b;
        }
    }

    public static final class k extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(LaunchFragment launchFragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = launchFragment;
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            grg.c defaultViewModelProviderFactory;
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            if (hg6Var != null && (defaultViewModelProviderFactory = hg6Var.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            grg.c defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            defaultViewModelProviderFactory2.getClass();
            return defaultViewModelProviderFactory2;
        }
    }

    public LaunchFragment() {
        c cVar = new c(this);
        qt8 qt8Var = qt8.a;
        this.b = boa.E(qt8Var, cVar);
        this.c = boa.E(qt8Var, new d(this));
        this.d = boa.E(qt8Var, new e(this));
        this.e = new tx5();
        this.f = new d2f(new z0(this, 13));
        iwc iwcVar = fwc.a;
        this.V = os5.a(this, iwcVar.b(m99.class), new g99(this), new h99(this), new i99(this));
        Lazy lazyE = boa.E(qt8.c, new h(new g(this)));
        this.X = os5.a(this, iwcVar.b(gl8.class), new i(lazyE), new j(lazyE), new k(this, lazyE));
        this.Y = boa.E(qt8Var, new f(this));
    }

    public final gl8 E() {
        return (gl8) this.X.getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.W = (LaunchActivity) context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0061  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.jobsearch.launch.LaunchFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Lazy lazy = this.c;
        ((gz4) lazy.getValue()).a("splash_screen_shown", new pq(this, 10));
        q6.n("splash_screen", null, null, 6, (tp7) cr8.p(tp7.class));
        Lazy<s87> lazy2 = s87.f;
        gz4 gz4Var = (gz4) lazy.getValue();
        Object systemService = layoutInflater.getContext().getSystemService("uimode");
        systemService.getClass();
        int nightMode = ((UiModeManager) systemService).getNightMode();
        String str = nightMode != 0 ? nightMode != 1 ? nightMode != 2 ? nightMode != 3 ? "unsupported" : "custom" : "dark" : "light" : "auto";
        tx5 tx5Var = this.e;
        tx5Var.getClass();
        s87.a.a(gz4Var, new lx5("user_interface_style", "other", "userInterfaceStyle", 1, tx5Var.a, new wy5(str)));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setViewCompositionStrategy(kpg.a.a);
        composeView.setContent(new ah2(338530231, new ed(this, 5), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        AppStartupTimes.a("launch_frag_view_created_start");
        E().W.e(getViewLifecycleOwner(), new cl8(new cj(this, 6)));
        E().X.e(getViewLifecycleOwner(), new cl8(new bt(this, 10)));
        E().Y.e(getViewLifecycleOwner(), new cl8(new cd(this, 7)));
        gl8 gl8VarE = E();
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        if (jobSearchApplication == null) {
            wl7.g("appInstance");
            throw null;
        }
        epb epbVar = jobSearchApplication.e;
        if (epbVar == null) {
            wl7.g("proctorLoaderWrapper");
            throw null;
        }
        epbVar.a(zob.Initial, new j91(gl8VarE, 9), new qq2(gl8VarE));
        LaunchActivity launchActivity = this.W;
        if (launchActivity == null) {
            wl7.g("activity");
            throw null;
        }
        dqa dqaVarR = launchActivity.r();
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dqaVarR.a(viewLifecycleOwner, new b(true));
        AppStartupTimes.a("launch_frag_view_logo_in_loaded");
        AppStartupTimes.a("launch_frag_view_logo_out_loaded");
    }
}
