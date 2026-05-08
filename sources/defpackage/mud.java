package defpackage;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.ReactContext;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.reactnative.nativemodules.RNCoreNativeModule;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.cd4;
import defpackage.e9a;
import defpackage.grg;
import defpackage.p63;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmud;", "Lp91;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class mud extends p91 {
    public static final /* synthetic */ int t0 = 0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final String m0 = "about:blank";
    public String n0;
    public final frg o0;
    public final frg p0;
    public final frg q0;
    public final String r0;
    public final xj1 s0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mud mudVar) {
            super(0);
            this.$this_activityViewModels = mudVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mud mudVar) {
            super(0);
            this.$this_activityViewModels = mudVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class c extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mud mudVar) {
            super(0);
            this.$this_activityViewModels = mudVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class d extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mud mudVar) {
            super(0);
            this.$this_activityViewModels = mudVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mud mudVar) {
            super(0);
            this.$this_activityViewModels = mudVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class f extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mud mudVar) {
            super(0);
            this.$this_activityViewModels = mudVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class g extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(mud mudVar) {
            super(0);
            this.$this_viewModels = mudVar;
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
        public k(mud mudVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = mudVar;
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

    public mud() {
        iwc iwcVar = fwc.a;
        this.o0 = os5.a(this, iwcVar.b(jq6.class), new a(this), new b(this), new c(this));
        Lazy lazyE = boa.E(qt8.c, new h(new g(this)));
        this.p0 = os5.a(this, iwcVar.b(nud.class), new i(lazyE), new j(lazyE), new k(this, lazyE));
        this.q0 = os5.a(this, iwcVar.b(c6f.class), new d(this), new e(this), new f(this));
        zo6.a.getClass();
        this.r0 = zo6.f;
        this.s0 = xj1.V;
    }

    @Override // defpackage.p91
    public final void L(int i2, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-2001018865);
        int i3 = (cVarH.x(this) ? 4 : 2) | i2;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            ne4 ne4Var = p97.a;
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            ad4Var.e(cd4.a.D0);
            cd4.i3.a.getClass();
            rm2.a(ne4Var.a(h07.a), bh2.c(-1120857265, new v02(this, 6), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new mh(this, i2, 9);
        }
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getQ0() {
        return this.r0;
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: O, reason: from getter */
    public final xj1 getQ0() {
        return this.s0;
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
        if (((jq6) this.o0.getValue()).h() == xj1.V) {
            this.Y.h("SEARCH");
            if (Z()) {
                ArrayList arrayList = lz2.a;
                lz2.d("SearchTabFragment", "handleBackNavigation() -> back in WebView", false, null);
                return true;
            }
            if (b0().g()) {
                ArrayList arrayList2 = lz2.a;
                lz2.d("SearchTabFragment", "handleBackNavigation() -> SYSTEM_BACK_RESET, resetting tab to home state", false, null);
                U(this.m0, true, false);
                d0();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p91
    public final void a0() {
        String strB = G().b();
        if (strB == null || strB.length() == 0 || G().g()) {
            b0().h(false);
        } else {
            b0().h(true);
        }
        if (wve.E(strB, this.m0, true)) {
            d0();
        } else {
            c0();
        }
    }

    public final nud b0() {
        return (nud) this.p0.getValue();
    }

    public final void c0() {
        M().l.setVisibility(0);
        M().j.setVisibility(8);
    }

    public final void d0() {
        RNCoreNativeModule rNCoreNativeModule;
        M().l.setVisibility(8);
        M().j.setVisibility(0);
        b0().h(false);
        Fragment fragmentD = getChildFragmentManager().D("RNSearchFragment");
        bhc bhcVar = fragmentD instanceof bhc ? (bhc) fragmentD : null;
        if (bhcVar != null) {
            try {
                ComponentCallbacks2 application = bhcVar.requireActivity().getApplication();
                application.getClass();
                rkc rkcVarB = ((pjc) application).b();
                ReactContext reactContextA = rkcVarB != null ? rkcVarB.a() : null;
                if (reactContextA == null || (rNCoreNativeModule = (RNCoreNativeModule) reactContextA.getNativeModule(RNCoreNativeModule.class)) == null) {
                    return;
                }
                RNCoreNativeModule.emitEvent$default(rNCoreNativeModule, reactContextA, "searchTabFocused", null, 4, null);
            } catch (Exception unused) {
                ((np7) cr8.p(np7.class)).f("RNSearchFragment", "React context was null while handling notifyTabFocused for Search Tab", false, null);
            }
        }
    }

    @Override // defpackage.p91, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str = this.n0;
        if (str != null) {
            ((JSTBroadcast) cr8.p(JSTBroadcast.class)).unsubscribe(str);
        }
        this.n0 = null;
        super.onDestroyView();
    }

    @Override // defpackage.p91, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        int i2 = 1;
        if (!this.l0) {
            if (getChildFragmentManager().D("RNSearchFragment") == null) {
                bhc.e = new chc(e9a.a.a(ep5.a.e(), dd4.a.a()), zo6.a.b());
                bhc bhcVar = new bhc();
                Bundle bundleE = l6.e("arg_component_name", "Search");
                chc chcVar = bhc.e;
                bundleE.putBundle("arg_launch_options", chcVar != null ? chcVar.toBundle() : null);
                bundleE.putBoolean("arg_fabric_enabled", false);
                bhcVar.setArguments(bundleE);
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                aVar.d(R.id.rn_search_fragment, bhcVar, "RNSearchFragment", 1);
                aVar.j();
                this.l0 = true;
            } else {
                this.l0 = true;
            }
        }
        b6f b6fVarL = ((c6f) this.q0.getValue()).l(xj1.V);
        b6fVarL.a.e(getViewLifecycleOwner(), new da7(new a3(this, 21), i2));
        b6fVarL.f.e(getViewLifecycleOwner(), new da7(new ma(this, 17), i2));
        b6fVarL.e.e(getViewLifecycleOwner(), new da7(new na(this, 12), i2));
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.d2) == cd4.m2.a.getValue()) {
            return;
        }
        this.n0 = ((JSTBroadcast) cr8.p(JSTBroadcast.class)).subscribe(fwc.a.b(JSTBroadcastEvent.ApplyStart.class), new hu(13), new hp0(this, 15));
    }
}
