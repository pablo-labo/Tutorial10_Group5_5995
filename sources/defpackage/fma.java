package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.cd4;
import defpackage.grg;
import defpackage.kpg;
import defpackage.p63;
import defpackage.sp7;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lfma;", "Lp91;", "<init>", "()V", "Lc4g;", "topNavState", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fma extends p91 {
    public static final /* synthetic */ int s0 = 0;
    public final frg j0;
    public final frg k0;
    public final frg l0;
    public final frg m0;
    public final d2f n0;
    public w29 o0;
    public final frg p0;
    public final String q0;
    public final xj1 r0;

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.notifications.NotificationsWebViewFragment$TopNavContent$1$1$1", f = "NotificationsWebViewFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return fma.this.new a(lu2Var);
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
            fma fmaVar = fma.this;
            int i = fma.s0;
            cma cmaVarB0 = fmaVar.b0();
            fma fmaVar2 = fma.this;
            ig igVar = new ig(fmaVar2, 12);
            vv vvVar = new vv(fmaVar2, 14);
            cmaVarB0.f = igVar;
            cmaVarB0.V = vvVar;
            cmaVarB0.e = true;
            cmaVarB0.l();
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fma fmaVar) {
            super(0);
            this.$this_activityViewModels = fmaVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fma fmaVar) {
            super(0);
            this.$this_activityViewModels = fmaVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class d extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fma fmaVar) {
            super(0);
            this.$this_activityViewModels = fmaVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class e extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fma fmaVar) {
            super(0);
            this.$this_activityViewModels = fmaVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(fma fmaVar) {
            super(0);
            this.$this_activityViewModels = fmaVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class g extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(fma fmaVar) {
            super(0);
            this.$this_activityViewModels = fmaVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class h extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(fma fmaVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = fmaVar;
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

    public static final class i extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(fma fmaVar) {
            super(0);
            this.$this_viewModels = fmaVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class j extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.$ownerProducer = iVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class k extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class l extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Lazy lazy) {
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

    public static final class m extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(fma fmaVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = fmaVar;
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

    public static final class n extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(fma fmaVar) {
            super(0);
            this.$this_viewModels = fmaVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class o extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.$ownerProducer = nVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class p extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class q extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Lazy lazy) {
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

    public static final class r extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(fma fmaVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = fmaVar;
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

    public static final class s extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(fma fmaVar) {
            super(0);
            this.$this_viewModels = fmaVar;
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

    public fma() {
        iwc iwcVar = fwc.a;
        this.j0 = os5.a(this, iwcVar.b(jq6.class), new b(this), new c(this), new d(this));
        o oVar = new o(new n(this));
        qt8 qt8Var = qt8.c;
        Lazy lazyE = boa.E(qt8Var, oVar);
        this.k0 = os5.a(this, iwcVar.b(dma.class), new p(lazyE), new q(lazyE), new r(this, lazyE));
        Lazy lazyE2 = boa.E(qt8Var, new t(new s(this)));
        this.l0 = os5.a(this, iwcVar.b(cma.class), new u(lazyE2), new v(lazyE2), new h(this, lazyE2));
        Lazy lazyE3 = boa.E(qt8Var, new j(new i(this)));
        this.m0 = os5.a(this, iwcVar.b(o8c.class), new k(lazyE3), new l(lazyE3), new m(this, lazyE3));
        this.n0 = new d2f(new j7(10));
        this.p0 = os5.a(this, iwcVar.b(c6f.class), new e(this), new f(this), new g(this));
        zo6 zo6Var = zo6.a;
        zo6Var.getClass();
        xj1 xj1Var = xj1.f;
        this.q0 = zo6Var.c(xj1Var);
        this.r0 = xj1Var;
    }

    public static boolean d0() {
        return ((h2g) cr8.p(h2g.class)).c();
    }

    @Override // defpackage.p91
    public final void L(int i2, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(1725401721);
        int i3 = (cVarH.x(this) ? 4 : 2) | i2;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            ne4 ne4Var = p97.a;
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            ad4Var.e(cd4.a.D0);
            cd4.i3.a.getClass();
            rm2.a(ne4Var.a(h07.a), bh2.c(-994574919, new ey(this, 7), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pj(this, i2, 9);
        }
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getK0() {
        return this.q0;
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: O, reason: from getter */
    public final xj1 getL0() {
        return this.r0;
    }

    @Override // defpackage.p91
    public final String P() {
        return null;
    }

    @Override // defpackage.p91
    public final void T() {
        w29 w29Var;
        super.T();
        if (Build.VERSION.SDK_INT < 33 || (w29Var = this.o0) == null) {
            return;
        }
        String strB = G().b();
        if (strB == null) {
            strB = this.q0;
        }
        r97.a.getClass();
        if (r97.v(strB)) {
            o8c o8cVar = (o8c) w29Var.a;
            d8c d8cVar = (d8c) w29Var.b;
            d8cVar.getClass();
            if (d8cVar.b(((z0g) cr8.p(z0g.class)).a(172800000L), false) && ((kr7) cr8.p(kr7.class)).e("meg_offsite_inline_push_primer").a == 1) {
                gme gmeVar = (gme) o8cVar.c;
                s8c s8cVar = s8c.WEBVIEW_NOTIFICATIONS;
                gmeVar.setValue(s8cVar);
                ((gme) o8cVar.b).setValue(Boolean.TRUE);
                p8c p8cVar = (p8c) w29Var.c;
                String strA = s8cVar.a();
                p8cVar.getClass();
                strA.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, "push-notification-primer-inline", null, new qz4(strA, 2)));
                Integer numC = ((kq7) cr8.p(kq7.class)).c("PushPrimer", 0, "PushPrimerShownCount");
                ((kq7) cr8.p(kq7.class)).a((numC != null ? numC.intValue() : 0) + 1, "PushPrimer", "PushPrimerShownCount");
            }
        }
    }

    @Override // defpackage.p91
    public final boolean Y() {
        frg frgVar = this.j0;
        if (((jq6) frgVar.getValue()).h() == xj1.f) {
            this.Y.h("NOTIFICATIONS");
            if (Z()) {
                ArrayList arrayList = lz2.a;
                lz2.d("NotificationsWebViewFragment", "handleBackNavigation() -> back in WebView", false, null);
                return true;
            }
            if (d0() ? ((Boolean) ((gme) b0().d).getValue()).booleanValue() : c0().g()) {
                ArrayList arrayList2 = lz2.a;
                lz2.d("NotificationsWebViewFragment", "handleBackNavigation() -> IDV close, resetting tab to home state", false, null);
                if (d0()) {
                    cma cmaVarB0 = b0();
                    ((gme) cmaVarB0.d).setValue(Boolean.FALSE);
                    cmaVarB0.l();
                } else {
                    c0().h(false);
                }
                W(gq6.IDV_CLOSE);
                return true;
            }
            if (((jq6) frgVar.getValue()).j()) {
                ArrayList arrayList3 = lz2.a;
                lz2.d("NotificationsWebViewFragment", "handleBackNavigation() -> hiding notifications view", false, null);
                ((jq6) frgVar.getValue()).c.k(new jz2<>(Boolean.FALSE));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // defpackage.p91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0() {
        /*
            r4 = this;
            mq6 r0 = r4.G()
            boolean r0 = r0.g()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L29
            mq6 r0 = r4.G()
            boolean r0 = r0.e()
            if (r0 != 0) goto L29
            mq6 r0 = r4.G()
            com.indeed.android.jobsearch.webview.IndeedWebView r0 = r0.V
            if (r0 != 0) goto L20
            r0 = r1
            goto L24
        L20:
            boolean r0 = r0.canGoBack()
        L24:
            if (r0 != 0) goto L27
            goto L29
        L27:
            r0 = r1
            goto L2a
        L29:
            r0 = r2
        L2a:
            boolean r3 = d0()
            if (r3 == 0) goto L54
            if (r0 == 0) goto L43
            cma r4 = r4.b0()
            g4a r0 = r4.d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            gme r0 = (defpackage.gme) r0
            r0.setValue(r1)
            r4.l()
            return
        L43:
            cma r4 = r4.b0()
            g4a r0 = r4.d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            gme r0 = (defpackage.gme) r0
            r0.setValue(r1)
            r4.l()
            return
        L54:
            if (r0 == 0) goto L5e
            dma r4 = r4.c0()
            r4.h(r1)
            return
        L5e:
            dma r4 = r4.c0()
            r4.h(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.a0():void");
    }

    public final cma b0() {
        return (cma) this.l0.getValue();
    }

    public final dma c0() {
        return (dma) this.k0.getValue();
    }

    @Override // defpackage.p91, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        int i2 = 12;
        int i3 = 1;
        if (Build.VERSION.SDK_INT >= 33) {
            this.o0 = new w29((o8c) this.m0.getValue(), (d8c) this.n0.getValue());
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
            composeView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            composeView.setViewCompositionStrategy(kpg.a.a);
            composeView.setContent(new ah2(-734722423, new js0(this, 6), true));
            ComposeView composeView2 = M().m;
            ViewParent parent = composeView2.getParent();
            LinearLayout linearLayout = parent instanceof LinearLayout ? (LinearLayout) parent : null;
            if (linearLayout != null) {
                int iIndexOfChild = linearLayout.indexOfChild(composeView2);
                if (iIndexOfChild >= 0) {
                    linearLayout.addView(composeView, iIndexOfChild + 1);
                } else {
                    ArrayList arrayList = lz2.a;
                    lz2.h("NotificationsWebViewFragment", "Could not find topNav index, push primer banner not added", null, 12);
                }
            } else {
                ArrayList arrayList2 = lz2.a;
                lz2.h("NotificationsWebViewFragment", "topNav parent is not a LinearLayout, push primer banner not added", null, 12);
            }
        }
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        ((c6f) this.p0.getValue()).l(xj1.f).a.e(getViewLifecycleOwner(), new cq9(new yh(this, i2), i3));
    }
}
