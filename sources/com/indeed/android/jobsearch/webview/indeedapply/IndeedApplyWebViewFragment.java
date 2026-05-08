package com.indeed.android.jobsearch.webview.indeedapply;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import com.wlappdebug.r;
import defpackage.a32;
import defpackage.a9c;
import defpackage.ah2;
import defpackage.apf;
import defpackage.axg;
import defpackage.boa;
import defpackage.cr8;
import defpackage.cya;
import defpackage.d0h;
import defpackage.d2f;
import defpackage.dqa;
import defpackage.dz1;
import defpackage.ea7;
import defpackage.eb6;
import defpackage.esc;
import defpackage.exg;
import defpackage.fj;
import defpackage.fk0;
import defpackage.frg;
import defpackage.fwc;
import defpackage.gme;
import defpackage.grg;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.hg6;
import defpackage.hqa;
import defpackage.irg;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.j84;
import defpackage.jq6;
import defpackage.jrg;
import defpackage.k1;
import defpackage.k98;
import defpackage.kd;
import defpackage.kpg;
import defpackage.l5;
import defpackage.lr;
import defpackage.lr5;
import defpackage.lz2;
import defpackage.m77;
import defpackage.mj8;
import defpackage.nl0;
import defpackage.nxg;
import defpackage.o6;
import defpackage.oe;
import defpackage.os5;
import defpackage.p20;
import defpackage.p63;
import defpackage.pe0;
import defpackage.pnb;
import defpackage.pq;
import defpackage.q77;
import defpackage.qq;
import defpackage.qt8;
import defpackage.ree;
import defpackage.s77;
import defpackage.s87;
import defpackage.sp7;
import defpackage.t77;
import defpackage.tp7;
import defpackage.tx5;
import defpackage.u63;
import defpackage.u8;
import defpackage.u91;
import defpackage.ua6;
import defpackage.ux4;
import defpackage.vg;
import defpackage.vk3;
import defpackage.vw9;
import defpackage.w8;
import defpackage.w92;
import defpackage.wl7;
import defpackage.xa6;
import defpackage.yb1;
import defpackage.yof;
import defpackage.yw9;
import defpackage.z8;
import defpackage.zh;
import defpackage.zof;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/webview/indeedapply/IndeedApplyWebViewFragment;", "Lyw9;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndeedApplyWebViewFragment extends yw9 {
    public final z8<Intent> A0;
    public yb1 B0;
    public final z8<String[]> C0;
    public final Lazy D0;
    public final Lazy E0;
    public ModalWebview F0;
    public gu5<j6g> G0;
    public gu5<j6g> H0;
    public final d2f I0;
    public final frg n0;
    public final frg o0;
    public final frg p0;
    public final Lazy q0;
    public final Lazy r0;
    public final Lazy s0;
    public final tx5 t0;
    public final frg u0;
    public final Lazy v0;
    public final Lazy w0;
    public final Lazy x0;
    public final z8<Intent> y0;
    public String z0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_activityViewModels = indeedApplyWebViewFragment;
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
        public b(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_activityViewModels = indeedApplyWebViewFragment;
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
        public c(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_activityViewModels = indeedApplyWebViewFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class d extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_activityViewModels = indeedApplyWebViewFragment;
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
        public e(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_activityViewModels = indeedApplyWebViewFragment;
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
        public f(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_activityViewModels = indeedApplyWebViewFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class g extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_activityViewModels = indeedApplyWebViewFragment;
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
        public h(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_activityViewModels = indeedApplyWebViewFragment;
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
        public i(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_activityViewModels = indeedApplyWebViewFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class j extends mj8 implements gu5<r.b> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_inject = indeedApplyWebViewFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    public static final class k extends mj8 implements gu5<yof> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_inject = indeedApplyWebViewFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yof] */
        @Override // defpackage.gu5
        public final yof invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(yof.class), a9cVar);
        }
    }

    public static final class l extends mj8 implements gu5<gz4> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_inject = indeedApplyWebViewFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class m extends mj8 implements gu5<nl0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_inject = indeedApplyWebViewFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nl0] */
        @Override // defpackage.gu5
        public final nl0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(nl0.class), a9cVar);
        }
    }

    public static final class n extends mj8 implements gu5<ua6> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_inject = indeedApplyWebViewFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ua6] */
        @Override // defpackage.gu5
        public final ua6 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(ua6.class), a9cVar);
        }
    }

    public static final class o extends mj8 implements gu5<xa6> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_inject = indeedApplyWebViewFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xa6] */
        @Override // defpackage.gu5
        public final xa6 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(xa6.class), a9cVar);
        }
    }

    public static final class p extends mj8 implements gu5<cya> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_inject = indeedApplyWebViewFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [cya, java.lang.Object] */
        @Override // defpackage.gu5
        public final cya invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(cya.class), a9cVar);
        }
    }

    public static final class q extends mj8 implements gu5<d0h> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_inject = indeedApplyWebViewFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [d0h, java.lang.Object] */
        @Override // defpackage.gu5
        public final d0h invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(d0h.class), a9cVar);
        }
    }

    public static final class r extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(IndeedApplyWebViewFragment indeedApplyWebViewFragment) {
            super(0);
            this.$this_viewModels = indeedApplyWebViewFragment;
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
        public v(IndeedApplyWebViewFragment indeedApplyWebViewFragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = indeedApplyWebViewFragment;
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

    public IndeedApplyWebViewFragment() {
        iwc iwcVar = fwc.a;
        this.n0 = os5.a(this, iwcVar.b(ea7.class), new a(this), new b(this), new c(this));
        this.o0 = os5.a(this, iwcVar.b(apf.class), new d(this), new e(this), new f(this));
        Lazy lazyE = boa.E(qt8.c, new s(new r(this)));
        this.p0 = os5.a(this, iwcVar.b(t77.class), new t(lazyE), new u(lazyE), new v(this, lazyE));
        j jVar = new j(this);
        qt8 qt8Var = qt8.a;
        this.q0 = boa.E(qt8Var, jVar);
        this.r0 = boa.E(qt8Var, new k(this));
        this.s0 = boa.E(qt8Var, new l(this));
        this.t0 = new tx5();
        this.u0 = os5.a(this, iwcVar.b(jq6.class), new g(this), new h(this), new i(this));
        this.v0 = boa.E(qt8Var, new m(this));
        this.w0 = boa.E(qt8Var, new n(this));
        this.x0 = boa.E(qt8Var, new o(this));
        z8<Intent> z8VarRegisterForActivityResult = registerForActivityResult(new w8(), new p20(this));
        z8VarRegisterForActivityResult.getClass();
        this.y0 = z8VarRegisterForActivityResult;
        z8<Intent> z8VarRegisterForActivityResult2 = registerForActivityResult(new w8(), new u91(this, 5));
        z8VarRegisterForActivityResult2.getClass();
        this.A0 = z8VarRegisterForActivityResult2;
        z8<String[]> z8VarRegisterForActivityResult3 = registerForActivityResult(new u8(), new dz1(this, 4));
        z8VarRegisterForActivityResult3.getClass();
        this.C0 = z8VarRegisterForActivityResult3;
        this.D0 = boa.E(qt8Var, new p(this));
        this.E0 = boa.E(qt8Var, new q(this));
        this.I0 = new d2f(new fk0(this, 8));
    }

    @Override // defpackage.yw9
    public final ModalWebview N() {
        ModalWebview modalWebview = this.F0;
        if (modalWebview != null) {
            return modalWebview;
        }
        wl7.g("webview");
        throw null;
    }

    public final void O() {
        if (M().isFinishing()) {
            return;
        }
        try {
            Lazy<s87> lazy = s87.f;
            s87.a.a(P(), tx5.k(this.t0, "IndeedApplyWebViewFragment", "done", null, 12));
            ArrayList arrayList = lz2.a;
            lz2.d("IndeedApplyWebViewFragment", "Dismissing Indeed Apply modal and View Job modal", false, null);
            ((JSTBroadcast) cr8.p(JSTBroadcast.class)).dispatch(new JSTBroadcastEvent.ApplyFinished("success", (String) this.I0.getValue()));
            E();
            gu5<j6g> gu5Var = this.H0;
            if (gu5Var != null) {
                gu5Var.invoke();
            }
            lr5 lr5VarU = M().u();
            lr5VarU.getClass();
            lr5VarU.v(new FragmentManager.n("ViewJobBottomSheetFragment", -1), false);
        } catch (Exception e2) {
            ArrayList arrayList2 = lz2.a;
            o6.l("Error while exiting IndeedApplyFlow: ", e2, "IndeedApplyWebViewFragment", false, e2);
        }
    }

    public final gz4 P() {
        return (gz4) this.s0.getValue();
    }

    public final t77 Q() {
        return (t77) this.p0.getValue();
    }

    public final void R(String str, boolean z) {
        try {
            if (M().isFinishing() || isDetached()) {
                return;
            }
            ((gme) Q().c).setValue(Boolean.valueOf(z));
            if (z) {
                ((gme) Q().b).setValue(Boolean.FALSE);
            }
        } catch (Exception e2) {
            ArrayList arrayList = lz2.a;
            lz2.b("IndeedApplyWebViewFragment", "Error in " + str + ": " + e2, false, e2);
        }
    }

    public final void S(String str) {
        String str2 = String.format("token=%s&preExtRedirectUrl=%s", Arrays.copyOf(new Object[]{Uri.encode(str), Uri.encode(N().getUrl())}, 2));
        ModalWebview modalWebviewN = N();
        String string = getString(R.string.indeed_passport_google_auth_endpoint);
        byte[] bytes = str2.getBytes(a32.b);
        bytes.getClass();
        modalWebviewN.postUrl(string, bytes);
        ((gme) Q().W).setValue(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("KEY_APPLY_URL")) == null) {
            l5.q("Missing indeedApplyUrl argument");
            return null;
        }
        this.z0 = string;
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, "IndeedApplyWebViewFragment", null, null));
        final int i2 = 1;
        int i3 = 5;
        final int i4 = 0;
        List listA0 = u63.a0(new k98(M()), new j84(new Function1(this) { // from class: o77
            public final /* synthetic */ IndeedApplyWebViewFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i2;
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = this.b;
                switch (i5) {
                    case 0:
                        ex4 ex4Var = (ex4) obj;
                        ex4Var.getClass();
                        Lazy<s87> lazy = s87.f;
                        s87.a.a(indeedApplyWebViewFragment.P(), tx5.g(indeedApplyWebViewFragment.t0, ex4Var == ex4.b ? "network-error-screen" : "http-error-screen", null, 6));
                        g4a g4aVar = indeedApplyWebViewFragment.Q().d;
                        Boolean bool = Boolean.FALSE;
                        ((gme) g4aVar).setValue(bool);
                        ((gme) indeedApplyWebViewFragment.Q().e).setValue(Boolean.TRUE);
                        ((gme) indeedApplyWebViewFragment.Q().f).setValue(ex4Var);
                        ((gme) indeedApplyWebViewFragment.Q().b).setValue(bool);
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        bool2.booleanValue();
                        try {
                            if (!indeedApplyWebViewFragment.M().isFinishing() && !indeedApplyWebViewFragment.isDetached()) {
                                ((gme) indeedApplyWebViewFragment.Q().b).setValue(bool2);
                            }
                        } catch (Exception e2) {
                            ArrayList arrayList = lz2.a;
                            o6.l("Error in DoUpdateVisitedHistoryComponent: ", e2, "IndeedApplyWebViewFragment", false, e2);
                        }
                        break;
                }
                return j6g.a;
            }
        }, new pq(this, 8), new qq(this, 13)), new m77(new fj(this, i3), new pe0(this, 6)), new esc(new Function1(this) { // from class: o77
            public final /* synthetic */ IndeedApplyWebViewFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i4;
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = this.b;
                switch (i5) {
                    case 0:
                        ex4 ex4Var = (ex4) obj;
                        ex4Var.getClass();
                        Lazy<s87> lazy = s87.f;
                        s87.a.a(indeedApplyWebViewFragment.P(), tx5.g(indeedApplyWebViewFragment.t0, ex4Var == ex4.b ? "network-error-screen" : "http-error-screen", null, 6));
                        g4a g4aVar = indeedApplyWebViewFragment.Q().d;
                        Boolean bool = Boolean.FALSE;
                        ((gme) g4aVar).setValue(bool);
                        ((gme) indeedApplyWebViewFragment.Q().e).setValue(Boolean.TRUE);
                        ((gme) indeedApplyWebViewFragment.Q().f).setValue(ex4Var);
                        ((gme) indeedApplyWebViewFragment.Q().b).setValue(bool);
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        bool2.booleanValue();
                        try {
                            if (!indeedApplyWebViewFragment.M().isFinishing() && !indeedApplyWebViewFragment.isDetached()) {
                                ((gme) indeedApplyWebViewFragment.Q().b).setValue(bool2);
                            }
                        } catch (Exception e2) {
                            ArrayList arrayList = lz2.a;
                            o6.l("Error in DoUpdateVisitedHistoryComponent: ", e2, "IndeedApplyWebViewFragment", false, e2);
                        }
                        break;
                }
                return j6g.a;
            }
        }), new ree(new k1(this, 7)), new eb6(new Function1(this) { // from class: p77
            public final /* synthetic */ IndeedApplyWebViewFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i4;
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = this.b;
                switch (i5) {
                    case 0:
                        ((Boolean) obj).getClass();
                        dd4 dd4Var = dd4.a;
                        int i6 = 8;
                        if (dd4.b()) {
                            xa6.b((xa6) indeedApplyWebViewFragment.x0.getValue(), new i30(indeedApplyWebViewFragment, i6), false, new a3(indeedApplyWebViewFragment, 14), new k30(indeedApplyWebViewFragment, 12), 18);
                        } else {
                            ((ua6) indeedApplyWebViewFragment.w0.getValue()).c(false, new ui(indeedApplyWebViewFragment, i6));
                        }
                        break;
                    default:
                        ((nhb) obj).getClass();
                        indeedApplyWebViewFragment.O();
                        break;
                }
                return j6g.a;
            }
        }));
        ArrayList arrayList = this.j0;
        w92.w0(arrayList, listA0);
        this.i0 = false;
        vk3 vk3Var = new vk3(this, i2);
        Lazy lazy = axg.a;
        String str = this.z0;
        if (str == null) {
            wl7.g("indeedApplyUrl");
            throw null;
        }
        int i5 = 11;
        Pair pairA = axg.a(str, arrayList, this.A0, new oe(this, 9), new Function1(this) { // from class: p77
            public final /* synthetic */ IndeedApplyWebViewFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i2;
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = this.b;
                switch (i52) {
                    case 0:
                        ((Boolean) obj).getClass();
                        dd4 dd4Var = dd4.a;
                        int i6 = 8;
                        if (dd4.b()) {
                            xa6.b((xa6) indeedApplyWebViewFragment.x0.getValue(), new i30(indeedApplyWebViewFragment, i6), false, new a3(indeedApplyWebViewFragment, 14), new k30(indeedApplyWebViewFragment, 12), 18);
                        } else {
                            ((ua6) indeedApplyWebViewFragment.w0.getValue()).c(false, new ui(indeedApplyWebViewFragment, i6));
                        }
                        break;
                    default:
                        ((nhb) obj).getClass();
                        indeedApplyWebViewFragment.O();
                        break;
                }
                return j6g.a;
            }
        }, new vg(15), new kd(i5), nxg.IndeedApply, ((jq6) this.u0.getValue()).d0, new zh(this, i5), null, null, null, vk3Var, 14368);
        ModalWebview modalWebview = (ModalWebview) pairA.a();
        this.l0 = (vw9) pairA.b();
        modalWebview.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.F0 = modalWebview;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setViewCompositionStrategy(kpg.a.a);
        composeView.setContent(new ah2(32562246, new lr(this, i3), true));
        return composeView;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        exg.a.b(N(), "indeed-apply-webview-state", bundle);
    }

    @Override // defpackage.yw9, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (zof.a.b()) {
            yof yofVar = (yof) this.r0.getValue();
            yofVar.getClass();
            Lazy<s87> lazy = s87.f;
            s87.a.a((gz4) yofVar.a.getValue(), tx5.g(yofVar.b, "tos-update-banner", new ux4("IndeedApplyWebViewFragment", 7), 2));
            ((gme) ((apf) this.o0.getValue()).b).setValue(Boolean.TRUE);
        }
        ((ea7) this.n0.getValue()).d.e(this, new q77(this));
        if (bundle != null) {
            exg.a.a(N(), "indeed-apply-webview-state", bundle);
        }
        KeyEvent.Callback callbackI = I();
        if (callbackI instanceof hqa) {
            dqa dqaVarR = ((hqa) callbackI).r();
            s77 s77Var = new s77(this, 0);
            dqaVarR.getClass();
            dqaVarR.b(s77Var);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: n77
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    view2.getClass();
                    windowInsets.getClass();
                    ((d0h) this.a.E0.getValue()).getClass();
                    return d0h.b(view2, view2, windowInsets);
                }
            });
        }
    }
}
