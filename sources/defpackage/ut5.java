package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import defpackage.grg;
import defpackage.kpg;
import defpackage.p63;
import defpackage.pgd;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lut5;", "Ly91;", "Lxh8;", "<init>", "()V", "Lc4g;", "topNavState", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ut5 extends y91 {
    public final bp6 Y = new bp6();
    public final Lazy Z;
    public vq5 a0;
    public ot5 b0;
    public final frg c0;
    public final frg d0;
    public final Lazy e0;
    public final frg f0;
    public final frg g0;
    public final frg h0;
    public final frg i0;
    public final frg j0;
    public final Lazy k0;
    public String l0;
    public boolean m0;

    public static final class a extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModel = ut5Var;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class a0 extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ut5 ut5Var, Lazy lazy) {
            super(0);
            this.$this_viewModels = ut5Var;
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

    public static final class b extends mj8 implements gu5<m99> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ut5 ut5Var, a aVar) {
            super(0);
            this.$this_activityViewModel = ut5Var;
            this.$ownerProducer = aVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, m99] */
        @Override // defpackage.gu5
        public final m99 invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_activityViewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(m99.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class b0 extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ut5 ut5Var) {
            super(0);
            this.$this_viewModels = ut5Var;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class c extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class c0 extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(b0 b0Var) {
            super(0);
            this.$ownerProducer = b0Var;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class d extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class d0 extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class e extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class e0 extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(Lazy lazy) {
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

    public static final class f extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
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
        public g(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
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
        public h(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class i extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
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
        public j(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
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
        public k(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class l extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
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
        public m(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
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
        public n(ut5 ut5Var) {
            super(0);
            this.$this_activityViewModels = ut5Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class o extends mj8 implements gu5<yof> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ut5 ut5Var) {
            super(0);
            this.$this_inject = ut5Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yof] */
        @Override // defpackage.gu5
        public final yof invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(yof.class), a9cVar);
        }
    }

    public static final class p extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ut5 ut5Var) {
            super(0);
            this.$this_inject = ut5Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    public static final class q extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ut5 ut5Var, Lazy lazy) {
            super(0);
            this.$this_viewModels = ut5Var;
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

    public static final class r extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ut5 ut5Var) {
            super(0);
            this.$this_viewModels = ut5Var;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class s extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(r rVar) {
            super(0);
            this.$ownerProducer = rVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class t extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class u extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Lazy lazy) {
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

    public static final class v extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ut5 ut5Var, Lazy lazy) {
            super(0);
            this.$this_viewModels = ut5Var;
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

    public static final class w extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ut5 ut5Var) {
            super(0);
            this.$this_viewModels = ut5Var;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class x extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(w wVar) {
            super(0);
            this.$ownerProducer = wVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class y extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class z extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Lazy lazy) {
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

    public ut5() {
        o oVar = new o(this);
        qt8 qt8Var = qt8.a;
        this.Z = boa.E(qt8Var, oVar);
        iwc iwcVar = fwc.a;
        this.c0 = os5.a(this, iwcVar.b(jq6.class), new f(this), new g(this), new h(this));
        this.d0 = os5.a(this, iwcVar.b(ik3.class), new i(this), new j(this), new k(this));
        b bVar = new b(this, new a(this));
        qt8 qt8Var2 = qt8.c;
        this.e0 = boa.E(qt8Var2, bVar);
        this.f0 = os5.a(this, iwcVar.b(apf.class), new l(this), new m(this), new n(this));
        Lazy lazyE = boa.E(qt8Var2, new x(new w(this)));
        this.g0 = os5.a(this, iwcVar.b(lt5.class), new y(lazyE), new z(lazyE), new a0(this, lazyE));
        Lazy lazyE2 = boa.E(qt8Var2, new c0(new b0(this)));
        this.h0 = os5.a(this, iwcVar.b(kt5.class), new d0(lazyE2), new e0(lazyE2), new q(this, lazyE2));
        Lazy lazyE3 = boa.E(qt8Var2, new s(new r(this)));
        this.i0 = os5.a(this, iwcVar.b(ohb.class), new t(lazyE3), new u(lazyE3), new v(this, lazyE3));
        this.j0 = os5.a(this, iwcVar.b(zee.class), new c(this), new d(this), new e(this));
        this.k0 = boa.E(qt8Var, new p(this));
    }

    public static View L(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.getClass();
            if (childAt.getVisibility() == 0 && childAt.isEnabled() && childAt.isFocusable()) {
                return childAt;
            }
            View viewL = L(childAt);
            if (viewL != null) {
                return viewL;
            }
        }
        return null;
    }

    public static boolean R() {
        return ((h2g) cr8.p(h2g.class)).c();
    }

    public final jq6 M() {
        return (jq6) this.c0.getValue();
    }

    public final ohb N() {
        return (ohb) this.i0.getValue();
    }

    public final zee O() {
        return (zee) this.j0.getValue();
    }

    public final void P() {
        boolean z2;
        IndeedWebView indeedWebView;
        mq6 mq6VarG = G();
        IndeedWebView indeedWebView2 = mq6VarG.V;
        if ((indeedWebView2 == null ? false : indeedWebView2.canGoBack()) && (indeedWebView = mq6VarG.V) != null) {
            mq6VarG.c();
            indeedWebView.goBack();
            z2 = true;
        } else {
            z2 = false;
        }
        bp6 bp6Var = this.Y;
        if (z2) {
            ArrayList arrayList = lz2.a;
            lz2.d("FsdvWebViewFragment", "handleBackAction() -> back in WebView", false, null);
            bp6Var.c("ian-full-screen-detail-view", "ian-full-screen-detail-view");
            return;
        }
        boolean zBooleanValue = R() ? ((Boolean) ((gme) ((kt5) this.h0.getValue()).d).getValue()).booleanValue() : ((Boolean) ((gme) ((lt5) this.g0.getValue()).b).getValue()).booleanValue();
        dd4 dd4Var = dd4.a;
        if (!dd4.h() || !zBooleanValue || !O().c) {
            ArrayList arrayList2 = lz2.a;
            lz2.d("FsdvWebViewFragment", "handleBackAction() -> closing FSDV", false, null);
            Q();
            return;
        }
        ArrayList arrayList3 = lz2.a;
        lz2.d("FsdvWebViewFragment", "handleBackAction() -> back to RegPromo, closing FSDV", false, null);
        bp6Var.c("ian-full-screen-detail-view", "reg-promo-native");
        O().c = false;
        ((m99) this.e0.getValue()).i(mh2.k(this));
        lr5 lr5VarU = requireActivity().u();
        lr5VarU.getClass();
        web.D(lr5VarU, "FsdvFragment");
        lz2.d("FsdvUtils", "Closing FSDV Fragment", false, null);
    }

    public final void Q() {
        String str;
        String str2;
        String strName = M().h().name();
        bp6 bp6Var = this.Y;
        bp6Var.c("ian-full-screen-detail-view", strName);
        O().c = false;
        LinkedHashMap linkedHashMap = iq6.b;
        if (linkedHashMap.containsKey(M().h())) {
            Pair pair = (Pair) linkedHashMap.get(M().h());
            String str3 = "";
            if (pair == null || (str = (String) pair.e()) == null) {
                str = "";
            }
            String strA = yhg.a.b(str, str).a.a();
            Pair pair2 = (Pair) linkedHashMap.get(M().h());
            if (pair2 != null && (str2 = (String) pair2.d()) != null) {
                str3 = str2;
            }
            bp6Var.k(strA, str, str3);
            linkedHashMap.remove(M().h());
            ArrayList arrayList = lz2.a;
            lz2.d("FsdvWebViewFragment", "WebView brought to foreground upon closing FSDV: ".concat(str), false, null);
        }
        lr5 lr5VarU = requireActivity().u();
        lr5VarU.getClass();
        web.D(lr5VarU, "FsdvFragment");
        ArrayList arrayList2 = lz2.a;
        lz2.d("FsdvUtils", "Closing FSDV Fragment", false, null);
    }

    @Override // defpackage.an0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            l5.q("Missing argument USE_BOT_USER_AGENT_KEY");
            return;
        }
        arguments.getBoolean("USE_BOT_USER_AGENT_KEY");
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            l5.q("Missing argument CANCEL_PASSPORT_REDIRECT_KEY");
            return;
        }
        this.m0 = arguments2.getBoolean("CANCEL_PASSPORT_REDIRECT_KEY");
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("INITIAL_URL_KEY")) == null) {
            l5.q("Missing argument INITIAL_URL_KEY");
        } else {
            this.l0 = string;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        vq5 vq5VarA = vq5.a(layoutInflater, viewGroup);
        this.a0 = vq5VarA;
        FrameLayout frameLayout = vq5VarA.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view;
        ViewTreeObserver viewTreeObserver;
        ot5 ot5Var = this.b0;
        if (ot5Var != null && (view = getView()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(ot5Var);
        }
        this.b0 = null;
        mq6 mq6VarG = G();
        IndeedWebView indeedWebView = mq6VarG.V;
        if (indeedWebView != null) {
            indeedWebView.removeAllViews();
        }
        IndeedWebView indeedWebView2 = mq6VarG.V;
        if (indeedWebView2 != null) {
            indeedWebView2.destroy();
        }
        w97 w97Var = mq6VarG.Y;
        if (w97Var != null) {
            w97Var.a();
        }
        mq6VarG.V = null;
        mq6VarG.Y = null;
        this.a0 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.ViewTreeObserver$OnGlobalFocusChangeListener, ot5] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        dqa dqaVarR;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (R()) {
            kt5 kt5Var = (kt5) this.h0.getValue();
            ((gme) kt5Var.d).setValue(Boolean.valueOf(O().c));
            kt5Var.l();
        } else {
            ((gme) ((lt5) this.g0.getValue()).b).setValue(Boolean.valueOf(O().c));
        }
        final int i2 = 1;
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        ?? r3 = new ViewTreeObserver.OnGlobalFocusChangeListener(this) { // from class: ot5
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                if (view3 == null) {
                    return;
                }
                ViewParent parent = view3.getParent();
                while (true) {
                    View view4 = view;
                    if (parent == null) {
                        View viewFindFocus = view4.findFocus();
                        if (viewFindFocus != null) {
                            viewFindFocus.requestFocus();
                            return;
                        }
                        View viewL = ut5.L(view4);
                        if (viewL != null) {
                            viewL.requestFocus();
                            return;
                        }
                        return;
                    }
                    if (parent.equals(view4)) {
                        return;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
        };
        this.b0 = r3;
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(r3);
        vq5 vq5Var = this.a0;
        vq5Var.getClass();
        ComposeView composeView = vq5Var.c;
        kpg.a aVar = kpg.a.a;
        composeView.setViewCompositionStrategy(aVar);
        final int i3 = 0;
        composeView.setContent(new ah2(2049243552, new w91(this, i3), true));
        vq5 vq5Var2 = this.a0;
        vq5Var2.getClass();
        ComposeView composeView2 = vq5Var2.d;
        composeView2.setViewCompositionStrategy(aVar);
        composeView2.setContent(jh2.c);
        vq5 vq5Var3 = this.a0;
        vq5Var3.getClass();
        ComposeView composeView3 = vq5Var3.g;
        composeView3.setViewCompositionStrategy(aVar);
        composeView3.setContent(new ah2(783384110, new Function2(this) { // from class: v91
            public final /* synthetic */ ut5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i4 = i3;
                ut5 ut5Var = this.b;
                switch (i4) {
                    case 0:
                        b bVar = (b) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                            b3c.a(((Boolean) ((gme) ut5Var.e).getValue()).booleanValue(), bVar, 0);
                        } else {
                            bVar.D();
                        }
                        break;
                    default:
                        b bVar2 = (b) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            boolean z2 = ut5Var.E().g().g;
                            vq5 vq5Var4 = ut5Var.a0;
                            if (z2) {
                                vq5Var4.getClass();
                                vq5Var4.h.setVisibility(0);
                                vq5 vq5Var5 = ut5Var.a0;
                                vq5Var5.getClass();
                                vq5Var5.h.requestFocus();
                            } else {
                                vq5Var4.getClass();
                                vq5Var4.h.setVisibility(8);
                                vq5 vq5Var6 = ut5Var.a0;
                                vq5Var6.getClass();
                                vq5Var6.h.clearFocus();
                            }
                            fv6 fv6Var = fv6.q4;
                            String strI = ak2.I(R.string.failed_to_find_email_app, bVar2);
                            boolean zX = bVar2.x(ut5Var);
                            Object objV = bVar2.v();
                            if (zX || objV == b.a.a) {
                                objV = new wm1(ut5Var, 6);
                                bVar2.p(objV);
                            }
                            tz6.a(390, 888, null, (gu5) objV, fv6Var, bVar2, null, strI, null, null, null, true);
                        } else {
                            bVar2.D();
                        }
                        break;
                }
                return j6g.a;
            }
        }, true));
        androidx.fragment.app.g activity = getActivity();
        if (activity != null && (dqaVarR = activity.r()) != null) {
            zv8 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dqaVarR.a(viewLifecycleOwner, new st5(this));
        }
        String str = this.l0;
        if (str == null) {
            wl7.g("initialUrl");
            throw null;
        }
        this.Y.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, "ian-full-screen-detail-view", null, new ap6(str, i3)));
        String str2 = this.l0;
        if (str2 == null) {
            wl7.g("initialUrl");
            throw null;
        }
        boolean z2 = zwc.c(str2) && zve.L(str2, "#Cookies", true);
        huc hucVar = new huc();
        String strQ0 = this.l0;
        if (z2) {
            if (strQ0 == null) {
                wl7.g("initialUrl");
                throw null;
            }
            strQ0 = zve.q0(strQ0, "#Cookies");
        } else if (strQ0 == null) {
            wl7.g("initialUrl");
            throw null;
        }
        String str3 = strQ0;
        o02 o02Var = new o02(this, z2, hucVar, i2);
        int i4 = 6;
        this.d = new mq6("FsdvWebViewFragment", str3, o02Var, new ym0(i4), new oe(this, i4), E());
        mq6 mq6VarG = G();
        androidx.fragment.app.g activity2 = getActivity();
        activity2.getClass();
        LaunchActivity launchActivity = (LaunchActivity) activity2;
        vq5 vq5Var4 = this.a0;
        vq5Var4.getClass();
        IndeedWebView indeedWebView = vq5Var4.l;
        vq5 vq5Var5 = this.a0;
        vq5Var5.getClass();
        ComposeView composeView4 = vq5Var5.c;
        vq5 vq5Var6 = this.a0;
        vq5Var6.getClass();
        int i5 = 12;
        final int i6 = 0;
        mq6.j(mq6VarG, launchActivity, null, indeedWebView, composeView4, vq5Var6.d, this.m0, new fy(this, i5), new j91(this, 7), new a3(this, i5), new Function1(this) { // from class: mt5
            public final /* synthetic */ ut5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i2;
                ut5 ut5Var = this.b;
                switch (i7) {
                    case 0:
                        pgd.x xVar = (pgd.x) obj;
                        xVar.getClass();
                        ut5Var.I(xVar);
                        break;
                    default:
                        ShowSearchOverlayData showSearchOverlayData = (ShowSearchOverlayData) obj;
                        showSearchOverlayData.getClass();
                        rq7 rq7Var = (rq7) cr8.p(rq7.class);
                        lr5 lr5VarU = ut5Var.requireActivity().u();
                        lr5VarU.getClass();
                        rq7Var.h(lr5VarU, ak2.L(showSearchOverlayData), showSearchOverlayData.d, new i35(ut5Var, 2));
                        break;
                }
                return j6g.a;
            }
        }, new wi(this, i4), new nt5(this, i2), null, new la(this, 9), null, new Function1(this) { // from class: mt5
            public final /* synthetic */ ut5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i6;
                ut5 ut5Var = this.b;
                switch (i7) {
                    case 0:
                        pgd.x xVar = (pgd.x) obj;
                        xVar.getClass();
                        ut5Var.I(xVar);
                        break;
                    default:
                        ShowSearchOverlayData showSearchOverlayData = (ShowSearchOverlayData) obj;
                        showSearchOverlayData.getClass();
                        rq7 rq7Var = (rq7) cr8.p(rq7.class);
                        lr5 lr5VarU = ut5Var.requireActivity().u();
                        lr5VarU.getClass();
                        rq7Var.h(lr5VarU, ak2.L(showSearchOverlayData), showSearchOverlayData.d, new i35(ut5Var, 2));
                        break;
                }
                return j6g.a;
            }
        }, 20480);
        p87 p87Var = (p87) this.k0.getValue();
        vq5 vq5Var7 = this.a0;
        vq5Var7.getClass();
        p87Var.b(vq5Var7.l.getSettings().getUserAgentString());
        vq5 vq5Var8 = this.a0;
        vq5Var8.getClass();
        vq5Var8.m.setViewCompositionStrategy(aVar);
        vq5 vq5Var9 = this.a0;
        vq5Var9.getClass();
        vq5Var9.m.setContent(new ah2(2041710788, new rj4(this, 2), true));
        vq5 vq5Var10 = this.a0;
        vq5Var10.getClass();
        vq5Var10.f.setViewCompositionStrategy(aVar);
        vq5 vq5Var11 = this.a0;
        vq5Var11.getClass();
        final int i7 = 1;
        vq5Var11.f.setContent(new ah2(-770992726, new uv(this, 4), true));
        vq5 vq5Var12 = this.a0;
        vq5Var12.getClass();
        ComposeView composeView5 = vq5Var12.h;
        composeView5.setViewCompositionStrategy(aVar);
        composeView5.setContent(new ah2(906656134, new Function2(this) { // from class: v91
            public final /* synthetic */ ut5 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i42 = i7;
                ut5 ut5Var = this.b;
                switch (i42) {
                    case 0:
                        b bVar = (b) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                            b3c.a(((Boolean) ((gme) ut5Var.e).getValue()).booleanValue(), bVar, 0);
                        } else {
                            bVar.D();
                        }
                        break;
                    default:
                        b bVar2 = (b) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            boolean z22 = ut5Var.E().g().g;
                            vq5 vq5Var42 = ut5Var.a0;
                            if (z22) {
                                vq5Var42.getClass();
                                vq5Var42.h.setVisibility(0);
                                vq5 vq5Var52 = ut5Var.a0;
                                vq5Var52.getClass();
                                vq5Var52.h.requestFocus();
                            } else {
                                vq5Var42.getClass();
                                vq5Var42.h.setVisibility(8);
                                vq5 vq5Var62 = ut5Var.a0;
                                vq5Var62.getClass();
                                vq5Var62.h.clearFocus();
                            }
                            fv6 fv6Var = fv6.q4;
                            String strI = ak2.I(R.string.failed_to_find_email_app, bVar2);
                            boolean zX = bVar2.x(ut5Var);
                            Object objV = bVar2.v();
                            if (zX || objV == b.a.a) {
                                objV = new wm1(ut5Var, 6);
                                bVar2.p(objV);
                            }
                            tz6.a(390, 888, null, (gu5) objV, fv6Var, bVar2, null, strI, null, null, null, true);
                        } else {
                            bVar2.D();
                        }
                        break;
                }
                return j6g.a;
            }
        }, true));
        zee zeeVarO = O();
        if (!bu8.a.i() && zeeVarO.b) {
            dd4 dd4Var = dd4.a;
            if (dd4.b()) {
                H(true);
            } else {
                J(true);
            }
            O().b = false;
        }
        G().l(null, new jr(7));
        ArrayList arrayList = lz2.a;
        lz2.d("FsdvWebViewFragment", "onViewCreated", false, null);
    }
}
