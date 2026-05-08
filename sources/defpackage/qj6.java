package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.R;
import defpackage.cd4;
import defpackage.grg;
import defpackage.p63;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lqj6;", "Lp91;", "<init>", "()V", "Lc4g;", "topNavState", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class qj6 extends p91 {
    public static final /* synthetic */ int r0 = 0;
    public final Lazy j0 = boa.E(qt8.a, new r(this));
    public final frg k0;
    public final frg l0;
    public final frg m0;
    public final frg n0;
    public final frg o0;
    public final frg p0;
    public final xj1 q0;

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.tabs.home.HomeTabWebViewFragment$TopNavContent$1$1$1", f = "HomeTabWebViewFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return qj6.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            oj6 oj6VarB0 = qj6.this.b0();
            qj6 qj6Var = qj6.this;
            int i = 7;
            wm1 wm1Var = new wm1(qj6Var, i);
            cq0 cq0Var = new cq0(qj6Var, 6);
            o91 o91Var = new o91(qj6Var, i);
            oq oqVar = new oq(qj6Var, 10);
            dd ddVar = new dd(qj6Var, 8);
            oj6VarB0.a0 = wm1Var;
            oj6VarB0.b0 = cq0Var;
            oj6VarB0.c0 = o91Var;
            oj6VarB0.d0 = oqVar;
            oj6VarB0.e0 = ddVar;
            oj6VarB0.e = true;
            oj6VarB0.n();
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.tabs.home.HomeTabWebViewFragment$TopNavContent$1$2$1", f = "HomeTabWebViewFragment.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return qj6.this.new b(lu2Var);
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
            oj6 oj6VarB0 = qj6.this.b0();
            int iE = ((dme) qj6.this.d0().W).e();
            ((np7) cr8.p(np7.class)).a("HomeTabTopNavViewModel", "updateUnreadNotificationCount(" + iE + ")");
            oj6VarB0.X = iE;
            oj6VarB0.n();
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class d extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class e extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class f extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class h extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class i extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class j extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class k extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class l extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class m extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class n extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class o extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class p extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class q extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(qj6 qj6Var) {
            super(0);
            this.$this_activityViewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class r extends mj8 implements gu5<d1g> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(qj6 qj6Var) {
            super(0);
            this.$this_inject = qj6Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [d1g, java.lang.Object] */
        @Override // defpackage.gu5
        public final d1g invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(d1g.class), a9cVar);
        }
    }

    public static final class s extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(qj6 qj6Var) {
            super(0);
            this.$this_viewModels = qj6Var;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class t extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(s sVar) {
            super(0);
            this.$ownerProducer = sVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class u extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class v extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Lazy lazy) {
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

    public static final class w extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(qj6 qj6Var, Lazy lazy) {
            super(0);
            this.$this_viewModels = qj6Var;
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

    public qj6() {
        iwc iwcVar = fwc.a;
        this.k0 = os5.a(this, iwcVar.b(ik3.class), new i(this), new j(this), new k(this));
        this.l0 = os5.a(this, iwcVar.b(jq6.class), new l(this), new m(this), new n(this));
        this.m0 = os5.a(this, iwcVar.b(pj6.class), new o(this), new p(this), new q(this));
        Lazy lazyE = boa.E(qt8.c, new t(new s(this)));
        this.n0 = os5.a(this, iwcVar.b(oj6.class), new u(lazyE), new v(lazyE), new w(this, lazyE));
        this.o0 = os5.a(this, iwcVar.b(zee.class), new c(this), new d(this), new e(this));
        this.p0 = os5.a(this, iwcVar.b(c6f.class), new f(this), new g(this), new h(this));
        this.q0 = xj1.b;
    }

    @Override // defpackage.p91
    public final void L(int i2, androidx.compose.runtime.b bVar) {
        bVar.L(-348003022);
        ne4 ne4Var = p97.a;
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        ad4Var.e(cd4.a.D0);
        cd4.i3.a.getClass();
        rm2.a(ne4Var.a(h07.a), bh2.c(-51324814, new rj4(this, 3), bVar), bVar, 56);
        bVar.F();
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: N */
    public String getQ0() {
        return zo6.a.b();
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: O, reason: from getter */
    public final xj1 getR0() {
        return this.q0;
    }

    @Override // defpackage.p91
    public final String P() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("KEY_INITIAL_URL");
        }
        return null;
    }

    @Override // defpackage.p91
    public final boolean Y() {
        if (d0().h() == xj1.b) {
            this.Y.h("HOME");
            if (Z()) {
                ArrayList arrayList = lz2.a;
                lz2.d("HomeTabWebViewFragment", "handleBackNavigation() -> back in WebView", false, null);
                return true;
            }
            if (c0().g() || ((Boolean) ((gme) c0().c).getValue()).booleanValue()) {
                ArrayList arrayList2 = lz2.a;
                lz2.d("HomeTabWebViewFragment", "handleBackNavigation() -> SYSTEM_BACK_RESET, resetting tab to home state", false, null);
                c0().h(false);
                c0().i(false);
                W(gq6.SYSTEM_BACK_RESET);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p91
    public void a0() {
        boolean z = G().g() || G().e() || G().f();
        if (G().f()) {
            c0().i(true);
            b0().m(true);
        } else {
            c0().i(false);
            b0().m(false);
        }
        if (z) {
            c0().h(false);
            b0().l(false);
        } else {
            c0().h(true);
            b0().l(true);
        }
    }

    public final oj6 b0() {
        return (oj6) this.n0.getValue();
    }

    public final pj6 c0() {
        return (pj6) this.m0.getValue();
    }

    public final jq6 d0() {
        return (jq6) this.l0.getValue();
    }

    public final void e0() {
        this.Y.e("HOME", "ian-full-screen-detail-view", true);
        ((zee) this.o0.getValue()).c = false;
        String string = ((Context) pnb.B(this).a(null, fwc.a.b(Context.class), null)).getString(R.string.indeed_login_url);
        string.getClass();
        lr5 lr5VarU = requireActivity().u();
        lr5VarU.getClass();
        ka2.H(string, true, false, lr5VarU);
    }

    @Override // defpackage.p91, defpackage.an0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zo6 zo6Var = zo6.a;
        zo6Var.getClass();
        try {
            Iterator<String> it = Uri.parse(zo6Var.b()).getQueryParameterNames().iterator();
            while (it.hasNext()) {
                if (wl7.b(it.next(), "bltk")) {
                    ArrayList arrayList = lz2.a;
                    lz2.d("HomeTabWebViewFragment", "Starting deep link handling.", false, null);
                    ((d1g) this.j0.getValue()).c = true;
                    ((ik3) this.k0.getValue()).b = true;
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.p91, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((d1g) this.j0.getValue()).b.e(getViewLifecycleOwner(), new rj6(new wi(this, 7)));
        ((c6f) this.p0.getValue()).l(xj1.b).a.e(getViewLifecycleOwner(), new rj6(new tv(this, 9)));
    }
}
