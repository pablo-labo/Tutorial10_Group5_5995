package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import defpackage.grg;
import defpackage.kpg;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp91;", "Ly91;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class p91 extends y91 {
    public static final /* synthetic */ qf8<Object>[] i0 = {fwc.a.e(new w3a(p91.class, "bindingBaseIanTabWebView", "getBindingBaseIanTabWebView()Lcom/indeed/android/jobsearch/databinding/FragmentBottomNavTabWebviewBinding;", 0))};
    public final bp6 Y = new bp6();
    public final wm2 Z = new wm2();
    public final frg a0;
    public final frg b0;
    public final frg c0;
    public final frg d0;
    public final frg e0;
    public final Lazy f0;
    public boolean g0;
    public boolean h0;

    public static final class a extends wpa {
        public a() {
            super(true);
        }

        @Override // defpackage.wpa
        public final void b() {
            dqa dqaVarR;
            ArrayList arrayList = lz2.a;
            qf8<Object>[] qf8VarArr = p91.i0;
            p91 p91Var = p91.this;
            lz2.d(p91Var.Q(), "OnBackPressedCallback.handleOnBackPressed", false, null);
            if (p91Var.Y()) {
                return;
            }
            f(false);
            androidx.fragment.app.g activity = p91Var.getActivity();
            if (activity != null && (dqaVarR = activity.r()) != null) {
                dqaVarR.d();
            }
            f(true);
        }
    }

    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            p91.this.h0 = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            p91.this.h0 = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public static final class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            p91.this.h0 = true;
        }
    }

    public static final class e extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
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
        public f(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
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
        public g(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class h extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class i extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class j extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class k extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class l extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class m extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class n extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class o extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class p extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class q extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class r extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class s extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(p91 p91Var) {
            super(0);
            this.$this_activityViewModels = p91Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class t extends mj8 implements gu5<p87> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(p91 p91Var) {
            super(0);
            this.$this_inject = p91Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    public p91() {
        iwc iwcVar = fwc.a;
        this.a0 = os5.a(this, iwcVar.b(jq6.class), new k(this), new l(this), new m(this));
        this.b0 = os5.a(this, iwcVar.b(c6f.class), new n(this), new o(this), new p(this));
        this.c0 = os5.a(this, iwcVar.b(ohb.class), new q(this), new r(this), new s(this));
        this.d0 = os5.a(this, iwcVar.b(t8c.class), new e(this), new f(this), new g(this));
        this.e0 = os5.a(this, iwcVar.b(ik3.class), new h(this), new i(this), new j(this));
        this.f0 = boa.E(qt8.a, new t(this));
    }

    public abstract void L(int i2, androidx.compose.runtime.b bVar);

    public final vq5 M() {
        return (vq5) this.Z.b(i0[0], this);
    }

    /* JADX INFO: renamed from: N */
    public abstract String getQ0();

    /* JADX INFO: renamed from: O */
    public abstract xj1 getR0();

    public abstract String P();

    public final String Q() {
        return "BaseIanTabWebViewFragment_" + getR0();
    }

    public final t8c R() {
        return (t8c) this.d0.getValue();
    }

    public void S() {
        G().d0 = false;
    }

    public void T() {
        ArrayList arrayList = lz2.a;
        boolean z = false;
        lz2.d(Q(), "loadOrReloadIfNecessary()", false, null);
        int i2 = 1;
        if (!G().d0) {
            G().l(P(), new jr(i2));
            return;
        }
        mq6 mq6VarG = G();
        String str = mq6VarG.b;
        IndeedWebView indeedWebView = mq6VarG.V;
        if (indeedWebView == null) {
            return;
        }
        String url = indeedWebView.getUrl();
        if (url != null) {
            r97.a.getClass();
            if (r97.x(url)) {
                iq6 iq6Var = iq6.a;
                if (bu8.a.i()) {
                    z = true;
                }
            }
        }
        zo6 zo6Var = zo6.a;
        zo6Var.getClass();
        if (wl7.b(str, zo6.f)) {
            return;
        }
        if (url == null || zve.U(url) || "about:blank".equals(url) || z) {
            mq6VarG.c0 = true;
            zo6Var.getClass();
            mq6VarG.h(zo6.g(str, gq6.HOME), true, true);
            return;
        }
        long j2 = mq6VarG.b0;
        if (j2 == -1 || System.currentTimeMillis() - j2 <= 1800000) {
            return;
        }
        j6g j6gVar = j6g.a;
        mq6VarG.k(true);
        indeedWebView.reload();
    }

    public void U(String str, boolean z, boolean z2) {
        str.getClass();
        G().h(str, z, z2);
    }

    public void V() {
        ArrayList arrayList = lz2.a;
        lz2.d(Q(), "tabLeaveEvent", false, null);
    }

    public void W(gq6 gq6Var) {
        mq6 mq6VarG = G();
        zo6 zo6Var = zo6.a;
        String str = mq6VarG.b;
        zo6Var.getClass();
        mq6VarG.h(zo6.g(str, gq6Var), true, true);
    }

    public final void X(IndeedWebView indeedWebView) {
        if (this.h0) {
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(indeedWebView, "scrollY", indeedWebView.getScrollY(), 0);
        objectAnimatorOfInt.setDuration(400L);
        objectAnimatorOfInt.addListener(new d());
        objectAnimatorOfInt.addListener(new c());
        objectAnimatorOfInt.addListener(new b());
        objectAnimatorOfInt.start();
    }

    public abstract boolean Y();

    public final boolean Z() {
        IndeedWebView indeedWebView;
        ArrayList arrayList = lz2.a;
        lz2.d(Q(), "tryWebViewGoBack()", false, null);
        mq6 mq6VarG = G();
        IndeedWebView indeedWebView2 = mq6VarG.V;
        if (!(indeedWebView2 == null ? false : indeedWebView2.canGoBack()) || (indeedWebView = mq6VarG.V) == null) {
            return false;
        }
        mq6VarG.c();
        indeedWebView.goBack();
        return true;
    }

    public abstract void a0();

    @Override // defpackage.an0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = 2;
        this.d = new mq6(getR0().name(), getQ0(), new na(this, i2), new oq(this, i2), new dd(this, i2), E());
        ArrayList arrayList = lz2.a;
        lz2.d(Q(), "onCreate()", false, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        vq5 vq5VarA = vq5.a(layoutInflater, viewGroup);
        this.Z.d(i0[0], this, vq5VarA);
        M().m.setContent(new ah2(1748726164, new s5(this, 4), true));
        ComposeView composeView = M().c;
        kpg.a aVar = kpg.a.a;
        composeView.setViewCompositionStrategy(aVar);
        composeView.setContent(new ah2(2049243552, new w91(this, 0), true));
        ComposeView composeView2 = M().d;
        composeView2.setViewCompositionStrategy(aVar);
        composeView2.setContent(jh2.c);
        M().e.setVisibility(8);
        FrameLayout frameLayout = M().a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ArrayList arrayList = lz2.a;
        lz2.d(Q(), "onDestroy()", false, null);
        if (this.g0) {
            lr5 lr5VarU = requireActivity().u();
            lr5VarU.getClass();
            ztd.b(lr5VarU);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
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
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0133  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p91.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
