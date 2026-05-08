package com.indeed.android.jobsearch.viewjob;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.a3;
import defpackage.a32;
import defpackage.a9c;
import defpackage.ad4;
import defpackage.au8;
import defpackage.axg;
import defpackage.bh;
import defpackage.bh2;
import defpackage.boa;
import defpackage.bp6;
import defpackage.bp7;
import defpackage.bu8;
import defpackage.c55;
import defpackage.cc1;
import defpackage.cd4;
import defpackage.cr8;
import defpackage.ct;
import defpackage.cya;
import defpackage.d2f;
import defpackage.dd4;
import defpackage.ea7;
import defpackage.eb6;
import defpackage.eqg;
import defpackage.esc;
import defpackage.frg;
import defpackage.fwc;
import defpackage.gme;
import defpackage.gqg;
import defpackage.grg;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.h07;
import defpackage.hg;
import defpackage.hg6;
import defpackage.hh1;
import defpackage.i30;
import defpackage.i35;
import defpackage.ik3;
import defpackage.irg;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.jde;
import defpackage.jq6;
import defpackage.jq7;
import defpackage.jqg;
import defpackage.jrg;
import defpackage.jz2;
import defpackage.k91;
import defpackage.k98;
import defpackage.kqg;
import defpackage.l5;
import defpackage.l77;
import defpackage.lqg;
import defpackage.lr;
import defpackage.lr5;
import defpackage.lz2;
import defpackage.ma;
import defpackage.mh2;
import defpackage.mj8;
import defpackage.ne4;
import defpackage.nj;
import defpackage.nl0;
import defpackage.np7;
import defpackage.nv;
import defpackage.nxg;
import defpackage.o6;
import defpackage.oj;
import defpackage.os5;
import defpackage.p63;
import defpackage.p97;
import defpackage.pnb;
import defpackage.qf8;
import defpackage.qt8;
import defpackage.rm2;
import defpackage.rq7;
import defpackage.s0b;
import defpackage.se;
import defpackage.sp7;
import defpackage.tp7;
import defpackage.tx5;
import defpackage.u63;
import defpackage.ua6;
import defpackage.ue;
import defpackage.v81;
import defpackage.vw9;
import defpackage.vx0;
import defpackage.w8;
import defpackage.w92;
import defpackage.wl7;
import defpackage.xa6;
import defpackage.ye;
import defpackage.z0;
import defpackage.z8;
import defpackage.zh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/viewjob/a;", "Lv81;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends v81 {
    public static final /* synthetic */ int H0 = 0;
    public LaunchActivity A0;
    public ModalWebview B0;
    public String C0;
    public final z8<Intent> D0;
    public boolean E0;
    public final boolean F0;
    public final d2f G0;
    public vw9 j0;
    public final Lazy k0;
    public final bp6 l0;
    public final frg m0;
    public final frg n0;
    public com.google.android.material.bottomsheet.b o0;
    public final Lazy p0;
    public final Lazy q0;
    public final z8<Intent> r0;
    public final Lazy s0;
    public final tx5 t0;
    public final Lazy u0;
    public final ArrayList v0;
    public jde w0;
    public final frg x0;
    public s0b y0;
    public c55 z0;

    /* JADX INFO: renamed from: com.indeed.android.jobsearch.viewjob.a$a, reason: collision with other inner class name */
    public static final class C0170a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0170a(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
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
        public b(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
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
        public c(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class d extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
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
        public e(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
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
        public f(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class g extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class i extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class j extends mj8 implements gu5<cya> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a aVar) {
            super(0);
            this.$this_inject = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [cya, java.lang.Object] */
        @Override // defpackage.gu5
        public final cya invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(cya.class), a9cVar);
        }
    }

    public static final class k extends mj8 implements gu5<ua6> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(a aVar) {
            super(0);
            this.$this_inject = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ua6] */
        @Override // defpackage.gu5
        public final ua6 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(ua6.class), a9cVar);
        }
    }

    public static final class l extends mj8 implements gu5<xa6> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(a aVar) {
            super(0);
            this.$this_inject = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xa6] */
        @Override // defpackage.gu5
        public final xa6 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(xa6.class), a9cVar);
        }
    }

    public static final class m extends mj8 implements gu5<gz4> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(a aVar) {
            super(0);
            this.$this_inject = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class n extends mj8 implements gu5<nl0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(a aVar) {
            super(0);
            this.$this_inject = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nl0] */
        @Override // defpackage.gu5
        public final nl0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(nl0.class), a9cVar);
        }
    }

    public static final class o extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(a aVar) {
            super(0);
            this.$this_viewModels = aVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class p extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.$ownerProducer = oVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class q extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class r extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Lazy lazy) {
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

    public static final class s extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(a aVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = aVar;
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

    public a() {
        iwc iwcVar = fwc.a;
        os5.a(this, iwcVar.b(ea7.class), new C0170a(this), new b(this), new c(this));
        j jVar = new j(this);
        qt8 qt8Var = qt8.a;
        this.k0 = boa.E(qt8Var, jVar);
        this.l0 = new bp6();
        this.m0 = os5.a(this, iwcVar.b(ik3.class), new d(this), new e(this), new f(this));
        this.n0 = os5.a(this, iwcVar.b(jq6.class), new g(this), new h(this), new i(this));
        this.p0 = boa.E(qt8Var, new k(this));
        this.q0 = boa.E(qt8Var, new l(this));
        z8<Intent> z8VarRegisterForActivityResult = registerForActivityResult(new w8(), new k91(this));
        z8VarRegisterForActivityResult.getClass();
        this.r0 = z8VarRegisterForActivityResult;
        this.s0 = boa.E(qt8Var, new m(this));
        this.t0 = new tx5();
        this.u0 = boa.E(qt8Var, new n(this));
        this.v0 = new ArrayList();
        Lazy lazyE = boa.E(qt8.c, new p(new o(this)));
        this.x0 = os5.a(this, iwcVar.b(lqg.class), new q(lazyE), new r(lazyE), new s(this, lazyE));
        z8<Intent> z8VarRegisterForActivityResult2 = registerForActivityResult(new w8(), new i35(this, 7));
        z8VarRegisterForActivityResult2.getClass();
        this.D0 = z8VarRegisterForActivityResult2;
        this.F0 = Build.VERSION.SDK_INT >= 34;
        this.G0 = new d2f(new ye(this, 25));
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.oj0, androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) super.H(bundle);
        this.o0 = bVar;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorH = bVar.h();
        bottomSheetBehaviorH.getClass();
        com.google.android.material.bottomsheet.b bVar2 = this.o0;
        if (bVar2 == null) {
            wl7.g("bottomSheetDialog");
            throw null;
        }
        Window window = bVar2.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        bottomSheetBehaviorH.H(3);
        lqg lqgVarQ = Q();
        ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, false, false, null, false, null, null, 0.0f, false, false, 3839));
        Q().h(3);
        bottomSheetBehaviorH.s(new gqg(bottomSheetBehaviorH, this));
        com.google.android.material.bottomsheet.b bVar3 = this.o0;
        if (bVar3 == null) {
            wl7.g("bottomSheetDialog");
            throw null;
        }
        mh2.e(bVar3.c, this, new hg(this, 12), 2);
        com.google.android.material.bottomsheet.b bVar4 = this.o0;
        if (bVar4 != null) {
            return bVar4;
        }
        wl7.g("bottomSheetDialog");
        throw null;
    }

    @Override // defpackage.t81
    @SuppressLint({"ComposableNaming"})
    public final void O(int i2, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-75316718);
        int i3 = (cVarH.x(this) ? 4 : 2) | i2;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            ne4 ne4Var = p97.a;
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            ad4Var.e(cd4.a.D0);
            cd4.i3.a.getClass();
            rm2.a(ne4Var.a(h07.a), bh2.c(43566802, new lr(this, 14), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ct(this, i2, 16);
        }
    }

    public final gz4 P() {
        return (gz4) this.s0.getValue();
    }

    public final lqg Q() {
        return (lqg) this.x0.getValue();
    }

    public final void R(String str) {
        dd4 dd4Var = dd4.a;
        if (dd4.h() && !((bp7) cr8.p(bp7.class)).e()) {
            if (getActivity() == null || !isAdded()) {
                np7 np7Var = (np7) cr8.p(np7.class);
                boolean z = getActivity() == null;
                String str2 = "navigateToRegPromoIfNeeded called on detached fragment: from=" + str + ", activityNull=" + z + ", isAdded=" + isAdded();
                boolean z2 = getActivity() == null;
                np7Var.c("view-job-bottom-sheet", str2, false, new VJBSFragmentDetachedException("from=" + str + ", activityNull=" + z2 + ", isAdded=" + isAdded()));
            }
            try {
                androidx.fragment.app.g activity = getActivity();
                if (activity == null || !isAdded()) {
                    return;
                }
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = activity.u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(this), jq7.x.INSTANCE, str);
            } catch (Exception e2) {
                ((np7) cr8.p(np7.class)).c("view-job-bottom-sheet", "Failed to navigate to RegPromo", false, e2);
            }
        }
    }

    public final void S(String str) {
        String strEncode = Uri.encode(str);
        ModalWebview modalWebview = this.B0;
        if (modalWebview == null) {
            wl7.g("webview");
            throw null;
        }
        String str2 = String.format("token=%s&preExtRedirectUrl=%s", Arrays.copyOf(new Object[]{strEncode, Uri.encode(modalWebview.getUrl())}, 2));
        ModalWebview modalWebview2 = this.B0;
        if (modalWebview2 == null) {
            wl7.g("webview");
            throw null;
        }
        String string = getString(R.string.indeed_passport_google_auth_endpoint);
        byte[] bytes = str2.getBytes(a32.b);
        bytes.getClass();
        modalWebview2.postUrl(string, bytes);
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        R("view_job_cancel");
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        kqg.a.k(new jz2<>(j6g.a));
    }

    @Override // defpackage.t81, androidx.fragment.app.Fragment
    public final void onPause() {
        if (this.F0 && this.E0) {
            LaunchActivity launchActivity = this.A0;
            if (launchActivity == null) {
                wl7.g("launchActivity");
                throw null;
            }
            launchActivity.unregisterScreenCaptureCallback(l5.j(this.G0.getValue()));
            this.E0 = false;
        }
        super.onPause();
    }

    @Override // defpackage.t81, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.F0) {
            try {
                LaunchActivity launchActivity = this.A0;
                if (launchActivity == null) {
                    wl7.g("launchActivity");
                    throw null;
                }
                launchActivity.registerScreenCaptureCallback(launchActivity.getMainExecutor(), l5.j(this.G0.getValue()));
                this.E0 = true;
            } catch (Exception e2) {
                ArrayList arrayList = lz2.a;
                lz2.b("view-job-bottom-sheet", "Failed to register screen capture detection: " + e2.getMessage(), false, e2);
            }
        }
    }

    @Override // defpackage.v81, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        WindowInsetsController insetsController;
        view.getClass();
        super.onViewCreated(view, bundle);
        int i2 = 16;
        if (Build.VERSION.SDK_INT >= 35) {
            com.google.android.material.bottomsheet.b bVar = this.o0;
            if (bVar == null) {
                wl7.g("bottomSheetDialog");
                throw null;
            }
            Window window = bVar.getWindow();
            if (window != null && (insetsController = window.getInsetsController()) != null) {
                insetsController.setSystemBarsAppearance(16, 16);
            }
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("VIEW_JOB_URL")) == null) {
            l5.q("Missing viewJobUrl argument");
            return;
        }
        this.C0 = string;
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, "view-job-bottom-sheet", null, new ma(this, 23)));
        androidx.fragment.app.g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        LaunchActivity launchActivity = (LaunchActivity) gVarRequireActivity;
        this.A0 = launchActivity;
        int i3 = 1;
        this.y0 = new s0b(launchActivity, hh1.A(this), new eqg(this, i3));
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.Z0) == cd4.q0.a.getValue()) {
            lqg lqgVarQ = Q();
            bu8 bu8Var = bu8.a;
            bu8Var.getClass();
            au8 au8Var = bu8.I0;
            qf8<Object>[] qf8VarArr = bu8.b;
            ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, false, false, null, false, null, null, 0.0f, !((Boolean) au8Var.a(qf8VarArr[46], bu8Var)).booleanValue(), false, 3071));
            au8Var.b(qf8VarArr[46], bu8Var, Boolean.TRUE);
        }
        LaunchActivity launchActivity2 = this.A0;
        if (launchActivity2 == null) {
            wl7.g("launchActivity");
            throw null;
        }
        this.z0 = new c55(launchActivity2, new i30(this, 18));
        s0b s0bVar = this.y0;
        if (s0bVar == null) {
            wl7.g("pageMetadataExtractorComponent");
            throw null;
        }
        esc escVar = new esc(new a3(this, 26));
        LaunchActivity launchActivity3 = this.A0;
        if (launchActivity3 == null) {
            wl7.g("launchActivity");
            throw null;
        }
        k98 k98Var = new k98(launchActivity3);
        LaunchActivity launchActivity4 = this.A0;
        if (launchActivity4 == null) {
            wl7.g("launchActivity");
            throw null;
        }
        l77 l77Var = new l77(launchActivity4, new vx0(this, 14));
        c55 c55Var = this.z0;
        if (c55Var == null) {
            wl7.g("externalApplyComponent");
            throw null;
        }
        int i4 = 0;
        List listA0 = u63.a0(s0bVar, escVar, k98Var, l77Var, c55Var, new eb6(new se(this, i2)));
        ArrayList arrayList = this.v0;
        w92.w0(arrayList, listA0);
        Lazy lazy = axg.a;
        String str = this.C0;
        if (str == null) {
            wl7.g("viewJobUrl");
            throw null;
        }
        int i5 = 21;
        int i6 = 25;
        Pair pairA = axg.a(str, arrayList, this.D0, new oj(this, i5), new eqg(this, i4), new ue(i5), new bh(13), nxg.ViewJob, ((jq6) this.n0.getValue()).d0, new z0(this, i6), new zh(this, 27), new nj(this, i6), new nv(this, 24), null, 16416);
        this.B0 = (ModalWebview) pairA.d();
        this.j0 = (vw9) pairA.e();
        ModalWebview modalWebview = this.B0;
        if (modalWebview == null) {
            wl7.g("webview");
            throw null;
        }
        modalWebview.getViewTreeObserver().addOnScrollChangedListener(new cc1(this, i3));
        ad4 ad4Var2 = dd4.n().a;
        ad4Var2.getClass();
        if (ad4Var2.e(cd4.a.t0) != cd4.b4.a.getValue() || dd4.f()) {
            return;
        }
        lqg lqgVarQ2 = Q();
        ((gme) lqgVarQ2.b).setValue(jqg.a(lqgVarQ2.g(), false, false, false, false, null, true, null, null, 0.0f, false, false, 4063));
    }
}
