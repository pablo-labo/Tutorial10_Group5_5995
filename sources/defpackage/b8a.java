package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.cd4;
import defpackage.grg;
import defpackage.p63;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb8a;", "Lp91;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b8a extends p91 {
    public static final /* synthetic */ int o0 = 0;
    public final frg j0;
    public final frg k0;
    public final frg l0;
    public final String m0;
    public final xj1 n0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b8a b8aVar) {
            super(0);
            this.$this_activityViewModels = b8aVar;
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
        public b(b8a b8aVar) {
            super(0);
            this.$this_activityViewModels = b8aVar;
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
        public c(b8a b8aVar) {
            super(0);
            this.$this_activityViewModels = b8aVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class d extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b8a b8aVar) {
            super(0);
            this.$this_activityViewModels = b8aVar;
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
        public e(b8a b8aVar) {
            super(0);
            this.$this_activityViewModels = b8aVar;
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
        public f(b8a b8aVar) {
            super(0);
            this.$this_activityViewModels = b8aVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class g extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b8a b8aVar) {
            super(0);
            this.$this_viewModels = b8aVar;
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
        public k(b8a b8aVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = b8aVar;
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

    public b8a() {
        iwc iwcVar = fwc.a;
        this.j0 = os5.a(this, iwcVar.b(jq6.class), new a(this), new b(this), new c(this));
        Lazy lazyE = boa.E(qt8.c, new h(new g(this)));
        this.k0 = os5.a(this, iwcVar.b(a8a.class), new i(lazyE), new j(lazyE), new k(this, lazyE));
        this.l0 = os5.a(this, iwcVar.b(c6f.class), new d(this), new e(this), new f(this));
        zo6 zo6Var = zo6.a;
        zo6Var.getClass();
        xj1 xj1Var = xj1.c;
        this.m0 = zo6Var.c(xj1Var);
        this.n0 = xj1Var;
    }

    @Override // defpackage.p91
    public final void L(int i2, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-1835497777);
        int i3 = (cVarH.x(this) ? 4 : 2) | i2;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            ne4 ne4Var = p97.a;
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            ad4Var.e(cd4.a.D0);
            cd4.i3.a.getClass();
            rm2.a(ne4Var.a(h07.a), bh2.c(-309065201, new zw4(this, 3), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new uw(this, i2, 6);
        }
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getQ0() {
        return this.m0;
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: O, reason: from getter */
    public final xj1 getQ0() {
        return this.n0;
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
        if (((jq6) this.j0.getValue()).h() == xj1.c) {
            this.Y.h("MY_JOBS");
            if (Z()) {
                ArrayList arrayList = lz2.a;
                lz2.d("MyJobsTabWebViewFragment", "handleBackNavigation() -> back in WebView", false, null);
                return true;
            }
            if (b0().g()) {
                ArrayList arrayList2 = lz2.a;
                lz2.d("MyJobsTabWebViewFragment", "handleBackNavigation() -> SYSTEM_BACK_RESET, resetting tab to home state", false, null);
                b0().h(false);
                W(gq6.SYSTEM_BACK_RESET);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    @Override // defpackage.p91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0() {
        /*
            r8 = this;
            mq6 r0 = r8.G()
            java.lang.String r0 = r0.b()
            if (r0 == 0) goto L70
            int r1 = r0.length()
            if (r1 != 0) goto L11
            goto L70
        L11:
            r97 r1 = defpackage.r97.a
            r1.getClass()
            zo6 r1 = defpackage.zo6.a
            r1.getClass()
            xj1 r2 = defpackage.xj1.c
            java.lang.String r1 = r1.c(r2)
            java.lang.String r2 = "saved/"
            java.lang.String r3 = "https://myjobs.indeed.com/"
            r4 = 0
            java.lang.String r2 = defpackage.zo6.a(r3, r2, r4)
            java.lang.String r5 = "applied/"
            java.lang.String r5 = defpackage.zo6.a(r3, r5, r4)
            java.lang.String r6 = "interviews/"
            java.lang.String r6 = defpackage.zo6.a(r3, r6, r4)
            java.lang.String r7 = "archived/"
            java.lang.String r3 = defpackage.zo6.a(r3, r7, r4)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r5, r6, r3}
            java.util.List r1 = defpackage.u63.a0(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L54
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L54
            goto L70
        L54:
            java.util.Iterator r1 = r1.iterator()
        L58:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            zo6 r3 = defpackage.zo6.a
            r3.getClass()
            boolean r2 = defpackage.zo6.e(r0, r2)
            if (r2 == 0) goto L58
            goto L8e
        L70:
            mq6 r0 = r8.G()
            boolean r0 = r0.g()
            if (r0 != 0) goto L8e
            mq6 r0 = r8.G()
            boolean r0 = r0.e()
            if (r0 == 0) goto L85
            goto L8e
        L85:
            a8a r8 = r8.b0()
            r0 = 1
            r8.h(r0)
            return
        L8e:
            a8a r8 = r8.b0()
            r0 = 0
            r8.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8a.a0():void");
    }

    public final a8a b0() {
        return (a8a) this.k0.getValue();
    }

    @Override // defpackage.p91, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        ((c6f) this.l0.getValue()).l(xj1.c).a.e(getViewLifecycleOwner(), new j5a(new cu(this, 9), 1));
    }
}
