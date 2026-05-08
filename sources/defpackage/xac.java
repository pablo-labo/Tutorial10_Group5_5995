package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.ReactContext;
import com.indeed.android.jobsearch.R;
import com.indeed.android.reactnative.nativemodules.RNCoreNativeModule;
import com.indeed.android.rnace.RNAceModule;
import defpackage.e9a;
import defpackage.grg;
import defpackage.kpg;
import defpackage.p63;
import defpackage.xh8;
import defpackage.zac;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lxac;", "Lm6f;", "Lk3g;", "Lxh8;", "<init>", "()V", "", "showToast", "", "stringResId", "Lc4g;", "uiState", "rnace_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xac extends m6f implements k3g, xh8 {
    public final frg W;
    public boolean b;
    public muf<String, String, String> c;
    public String d;
    public c7 e;
    public final Lazy f = boa.E(qt8.a, new b(this));
    public final xj1 V = xj1.W;

    public static final class a implements goa, ev5 {
        public final /* synthetic */ fj a;

        public a(fj fjVar) {
            this.a = fjVar;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        @Override // defpackage.goa
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof goa) && (obj instanceof ev5)) {
                return this.a == ((ev5) obj).c();
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class b extends mj8 implements gu5<cbc> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xac xacVar) {
            super(0);
            this.$this_inject = xacVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [cbc, java.lang.Object] */
        @Override // defpackage.gu5
        public final cbc invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(cbc.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xac xacVar) {
            super(0);
            this.$this_viewModels = xacVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class d extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.$ownerProducer = cVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class e extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class f extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Lazy lazy) {
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

    public static final class g extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xac xacVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = xacVar;
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

    public xac() {
        Lazy lazyE = boa.E(qt8.c, new d(new c(this)));
        this.W = os5.a(this, fwc.a.b(d4g.class), new e(lazyE), new f(lazyE), new g(this, lazyE));
    }

    @Override // defpackage.m6f
    /* JADX INFO: renamed from: F, reason: from getter */
    public final xj1 getB() {
        return this.V;
    }

    @Override // defpackage.m6f
    public final void G() {
        RNCoreNativeModule rNCoreNativeModule;
        try {
            ReactContext reactContextO = O();
            if (reactContextO == null || (rNCoreNativeModule = (RNCoreNativeModule) reactContextO.getNativeModule(RNCoreNativeModule.class)) == null) {
                return;
            }
            rNCoreNativeModule.signalScrollMainContentToTop(this.V);
        } catch (Exception e2) {
            ((np7) cr8.p(np7.class)).f("RNAceChatFragment", "React context was null while handling scrollToTop for Career Scout", false, e2);
        }
    }

    @Override // defpackage.m6f
    public final void H(String str) {
        RNAceModule rNAceModule;
        str.getClass();
        try {
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter("conversationId");
            String queryParameter2 = uri.getQueryParameter("content");
            String queryParameter3 = uri.getQueryParameter("agentType");
            try {
                if (!this.b) {
                    this.c = new muf<>(queryParameter, queryParameter2, queryParameter3);
                    this.d = str;
                    Q();
                    return;
                }
                ReactContext reactContextO = O();
                if (reactContextO != null) {
                    RNAceModule rNAceModule2 = (RNAceModule) reactContextO.getNativeModule(RNAceModule.class);
                    if (rNAceModule2 != null) {
                        rNAceModule2.emitDeeplinkEvent(queryParameter, queryParameter2, queryParameter3, null, str);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        Exception exc = e;
        ArrayList arrayList = lz2.a;
        lz2.b("RNAceChatFragment", "Error parsing URL: ".concat(str), true, exc);
        if (!this.b) {
            this.c = new muf<>(null, null, null);
            this.d = null;
            Q();
        } else {
            ReactContext reactContextO2 = O();
            if (reactContextO2 == null || (rNAceModule = (RNAceModule) reactContextO2.getNativeModule(RNAceModule.class)) == null) {
                return;
            }
            rNAceModule.emitDeeplinkEvent(null, null, null, null, null);
        }
    }

    @Override // defpackage.m6f
    public final void I() {
    }

    @Override // defpackage.m6f
    public final void J() {
        Q();
    }

    @Override // defpackage.m6f
    public final void K() {
        RNAceModule rNAceModule;
        if (this.b) {
            try {
                ReactContext reactContextO = O();
                if (reactContextO == null || (rNAceModule = (RNAceModule) reactContextO.getNativeModule(RNAceModule.class)) == null) {
                    return;
                }
                rNAceModule.emitAceBottomNavTabBlurredEvent();
            } catch (Exception e2) {
                ((np7) cr8.p(np7.class)).f("RNAceChatFragment", "Failed to emit aceBottomNavTabBlurred on tab leave", false, e2);
            }
        }
    }

    @Override // defpackage.m6f
    public final void L(prd prdVar) {
        prdVar.getClass();
    }

    @Override // defpackage.m6f
    public final void M(gq6 gq6Var) {
        RNAceModule rNAceModule;
        if (gq6Var == gq6.RESET_ON_NAV) {
            return;
        }
        try {
            ReactContext reactContextO = O();
            if (reactContextO == null || (rNAceModule = (RNAceModule) reactContextO.getNativeModule(RNAceModule.class)) == null) {
                return;
            }
            rNAceModule.emitPopToAceRootViewEvent();
        } catch (Exception e2) {
            ((np7) cr8.p(np7.class)).f("RNAceChatFragment", "Failed to emit popToAceRootView on resetToInitialState", false, e2);
        }
    }

    @Override // defpackage.m6f
    public final void N() {
    }

    public final ReactContext O() {
        Object applicationContext = requireContext().getApplicationContext();
        applicationContext.getClass();
        rkc rkcVarB = ((pjc) applicationContext).b();
        rkcVarB.getClass();
        return rkcVarB.a();
    }

    public final void P(boolean z) {
        c7 c7Var = this.e;
        if (c7Var == null) {
            wl7.g("binding");
            throw null;
        }
        c7Var.b.setVisibility(z ? 0 : 8);
        c7 c7Var2 = this.e;
        if (c7Var2 != null) {
            c7Var2.e.setVisibility(z ? 8 : 0);
        } else {
            wl7.g("binding");
            throw null;
        }
    }

    public final void Q() {
        synchronized (this) {
            try {
                if (((bp7) cr8.p(bp7.class)).e() && !this.b) {
                    e9a e9aVarA = e9a.a.a(((q2g) cr8.p(q2g.class)).b(), ((q2g) cr8.p(q2g.class)).c());
                    muf<String, String, String> mufVar = this.c;
                    Bundle bundle = mufVar != null ? new zac.a(mufVar.a(), mufVar.b(), mufVar.c(), this.d, e9aVarA).toBundle() : aq1.a(new Pair("nativeContext", e9aVarA.toBundle()));
                    ija ijaVar = new ija();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("arg_component_name", "AceChat");
                    bundle2.putBundle("arg_launch_options", bundle);
                    bundle2.putBoolean("arg_fabric_enabled", false);
                    ijaVar.setArguments(bundle2);
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    aVar.d(R.id.rn_ace_container, ijaVar, null, 1);
                    aVar.h(false);
                    this.b = true;
                    this.c = null;
                    this.d = null;
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.k3g
    public final void a(da2 da2Var) {
        ((d4g) this.W.getValue()).g(da2Var);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.k3g
    public final void m(List<raa> list) {
        ((d4g) this.W.getValue()).h(list);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.ace_chat_fragment, (ViewGroup) null, false);
        int i = R.id.ace_login_compose_view;
        ComposeView composeView = (ComposeView) esg.a(viewInflate, R.id.ace_login_compose_view);
        if (composeView != null) {
            i = R.id.ace_tare_top_nav_bar;
            ComposeView composeView2 = (ComposeView) esg.a(viewInflate, R.id.ace_tare_top_nav_bar);
            if (composeView2 != null) {
                i = R.id.downloadFeedbackToast;
                ComposeView composeView3 = (ComposeView) esg.a(viewInflate, R.id.downloadFeedbackToast);
                if (composeView3 != null) {
                    i = R.id.rn_ace_container;
                    FrameLayout frameLayout = (FrameLayout) esg.a(viewInflate, R.id.rn_ace_container);
                    if (frameLayout != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                        this.e = new c7(frameLayout2, composeView, composeView2, composeView3, frameLayout, frameLayout2);
                        frameLayout2.getClass();
                        return frameLayout2;
                    }
                }
            }
        }
        ja.k("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.m6f, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        view.getClass();
        super.onViewCreated(view, bundle);
        boolean zC = ((h2g) cr8.p(h2g.class)).c();
        c7 c7Var = this.e;
        kpg.a aVar = kpg.a.a;
        if (zC) {
            if (c7Var == null) {
                wl7.g("binding");
                throw null;
            }
            ComposeView composeView = c7Var.c;
            composeView.setVisibility(0);
            composeView.setViewCompositionStrategy(aVar);
            composeView.setContent(new ah2(-1948385304, new ct(this, 11), true));
        } else {
            if (c7Var == null) {
                wl7.g("binding");
                throw null;
            }
            c7Var.c.setVisibility(8);
        }
        c7 c7Var2 = this.e;
        if (c7Var2 == null) {
            wl7.g("binding");
            throw null;
        }
        c7Var2.b.setContent(new ah2(-584044343, new e45(this, 7), true));
        c7 c7Var3 = this.e;
        if (c7Var3 == null) {
            wl7.g("binding");
            throw null;
        }
        ComposeView composeView2 = c7Var3.d;
        composeView2.setViewCompositionStrategy(aVar);
        composeView2.setContent(new ah2(-22939749, new ed(this, 9), true));
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("initialUrl")) != null) {
            H(string);
        }
        if (((bp7) cr8.p(bp7.class)).e()) {
            P(false);
        } else {
            P(true);
        }
        ((cbc) this.f.getValue()).b.e(getViewLifecycleOwner(), new a(new fj(this, 16)));
    }

    @Override // defpackage.k3g
    public final void v(List<raa> list) {
        ((d4g) this.W.getValue()).j(list);
    }

    @Override // defpackage.k3g
    public final void z(sof sofVar) {
        ((d4g) this.W.getValue()).i(sofVar);
    }
}
