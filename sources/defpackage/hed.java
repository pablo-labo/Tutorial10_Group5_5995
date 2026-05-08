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
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.indeed.android.jobsearch.R;
import com.indeed.android.reactnative.nativemodules.RNCoreNativeModule;
import defpackage.e9a;
import defpackage.grg;
import defpackage.kpg;
import defpackage.p63;
import defpackage.xh8;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lhed;", "Lm6f;", "Lk3g;", "Lxh8;", "<init>", "()V", "Lc4g;", "uiState", "rnmessaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hed extends m6f implements k3g, xh8 {
    public final frg V;
    public boolean b;
    public ied d;
    public final frg f;
    public boolean c = true;
    public final Lazy e = boa.E(qt8.a, new e(this));

    public static final class a implements goa, ev5 {
        public final /* synthetic */ a3 a;

        public a(a3 a3Var) {
            this.a = a3Var;
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

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hed hedVar) {
            super(0);
            this.$this_activityViewModels = hedVar;
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
        public c(hed hedVar) {
            super(0);
            this.$this_activityViewModels = hedVar;
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
        public d(hed hedVar) {
            super(0);
            this.$this_activityViewModels = hedVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class e extends mj8 implements gu5<jed> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(hed hedVar) {
            super(0);
            this.$this_inject = hedVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, jed] */
        @Override // defpackage.gu5
        public final jed invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(jed.class), a9cVar);
        }
    }

    public static final class f extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(hed hedVar) {
            super(0);
            this.$this_viewModels = hedVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class g extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.$ownerProducer = fVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class h extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class i extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Lazy lazy) {
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

    public static final class j extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(hed hedVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = hedVar;
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

    public hed() {
        iwc iwcVar = fwc.a;
        this.f = os5.a(this, iwcVar.b(t8c.class), new b(this), new c(this), new d(this));
        Lazy lazyE = boa.E(qt8.c, new g(new f(this)));
        this.V = os5.a(this, iwcVar.b(d4g.class), new h(lazyE), new i(lazyE), new j(this, lazyE));
    }

    public static boolean Q(String str) {
        if (str != null) {
            String strN = nn2.n(str);
            String strO = nn2.o(str);
            if (strN != null && strO != null) {
                ((np7) cr8.p(np7.class)).c("RnMessagingFragment", t40.l("Both conversationId and initiateToken are specified: conversationId: ", strN, ", initiateToken: ", strO), false, null);
                return false;
            }
            if (strN != null || strO != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m6f
    /* JADX INFO: renamed from: F */
    public final xj1 getB() {
        return xj1.d;
    }

    @Override // defpackage.m6f
    public final void G() {
        RNCoreNativeModule rNCoreNativeModule;
        try {
            Object applicationContext = requireContext().getApplicationContext();
            applicationContext.getClass();
            rkc rkcVarB = ((pjc) applicationContext).b();
            ReactContext reactContextA = rkcVarB != null ? rkcVarB.a() : null;
            if (reactContextA == null || (rNCoreNativeModule = (RNCoreNativeModule) reactContextA.getNativeModule(RNCoreNativeModule.class)) == null) {
                return;
            }
            xj1 xj1Var = xj1.d;
            rNCoreNativeModule.signalScrollMainContentToTop(xj1Var);
            prd prdVar = prd.a;
            c6f c6fVar = (c6f) this.a.getValue();
            getB();
            c6fVar.l(xj1Var).a(true, prdVar);
        } catch (Exception e2) {
            ((np7) cr8.p(np7.class)).f("RnMessagingFragment", "Error encountered in handleScrollToTop for Messaging", false, e2);
        }
    }

    @Override // defpackage.m6f
    public final void H(String str) {
        str.getClass();
        if (!this.b) {
            S(str);
            return;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("from");
        if (queryParameter == null) {
            queryParameter = "url_load_from_null";
        } else if (queryParameter.length() == 0) {
            queryParameter = "url_load_from_empty";
        }
        if (!queryParameter.equals("rn-messaging")) {
            O(queryParameter);
        }
        if (Q(str)) {
            R(str);
        }
    }

    @Override // defpackage.m6f
    public final void I() {
    }

    @Override // defpackage.m6f
    public final void J() {
        if (!this.b) {
            Bundle arguments = getArguments();
            S(arguments != null ? arguments.getString("initialUrl") : null);
        }
        Bundle arguments2 = getArguments();
        boolean zC = new d8c(arguments2 != null ? arguments2.getBoolean("underQaAutomation") : false).c(xj1.d, false);
        frg frgVar = this.f;
        if (zC) {
            ((t8c) frgVar.getValue()).h(s8c.NATIVE_INBOX);
        } else {
            ((t8c) frgVar.getValue()).g(false);
        }
    }

    @Override // defpackage.m6f
    public final void K() {
    }

    @Override // defpackage.m6f
    public final void L(prd prdVar) {
        prdVar.getClass();
    }

    @Override // defpackage.m6f
    public final void M(gq6 gq6Var) {
        O(gq6Var.a());
    }

    @Override // defpackage.m6f
    public final void N() {
        O(gq6.RESET_ON_NAV.a());
    }

    public final void O(String str) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        try {
            Object applicationContext = requireContext().getApplicationContext();
            applicationContext.getClass();
            rkc rkcVarB = ((pjc) applicationContext).b();
            ReactContext reactContextA = rkcVarB != null ? rkcVarB.a() : null;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("from", str);
            writableMapCreateMap.putBoolean("isInitialPageLoad", this.c);
            this.c = false;
            if (reactContextA == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextA.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
                return;
            }
            rCTDeviceEventEmitter.emit("messagingPageLoad", writableMapCreateMap);
        } catch (Exception e2) {
            ((np7) cr8.p(np7.class)).c("RnMessagingFragment", "Error emitting messagingPageLoad event", false, e2);
        }
    }

    public final void P(boolean z) {
        ied iedVar = this.d;
        if (iedVar == null) {
            wl7.g("binding");
            throw null;
        }
        iedVar.b.setVisibility(z ? 0 : 8);
        ied iedVar2 = this.d;
        if (iedVar2 != null) {
            iedVar2.c.setVisibility(z ? 8 : 0);
        } else {
            wl7.g("binding");
            throw null;
        }
    }

    public final void R(String str) {
        lr5 lr5VarU;
        String strN = nn2.n(str);
        String queryParameter = Uri.parse(str).getQueryParameter("from");
        if (queryParameter == null) {
            queryParameter = "url_load_from_null";
        } else if (queryParameter.length() == 0) {
            queryParameter = "url_load_from_empty";
        }
        String strO = nn2.o(str);
        androidx.fragment.app.g activity = getActivity();
        if (activity == null || (lr5VarU = activity.u()) == null) {
            return;
        }
        i1g i1gVar = (i1g) cr8.p(i1g.class);
        String queryParameter2 = Uri.parse(str).getQueryParameter("presetDraftText");
        if (queryParameter2 == null || queryParameter2.length() == 0) {
            queryParameter2 = null;
        }
        Bundle arguments = getArguments();
        e9a e9aVarA = e9a.a.a(null, arguments != null ? arguments.getString("proctorGroups") : null);
        ped pedVar = new ped();
        Bundle bundle = new Bundle();
        if (strN != null) {
            bundle.putString("conversationId", strN);
        }
        if (strO != null) {
            bundle.putString("initiateToken", strO);
        }
        if (queryParameter2 != null) {
            bundle.putString("presetDraftText", queryParameter2);
        }
        bundle.putString("sessionSource", queryParameter);
        bundle.putBundle("nativeContext", e9aVarA.toBundle());
        pedVar.setArguments(bundle);
        i1gVar.e(lr5VarU, pedVar);
    }

    public final void S(String str) {
        String strA;
        synchronized (this) {
            try {
                if (((bp7) cr8.p(bp7.class)).e() && !this.b) {
                    if (getChildFragmentManager().C(R.id.rn_messaging_container) != null) {
                        return;
                    }
                    if (str != null) {
                        strA = Uri.parse(str).getQueryParameter("from");
                        if (strA == null) {
                            strA = "url_load_from_null";
                        } else if (strA.length() == 0) {
                            strA = "url_load_from_empty";
                        }
                    } else {
                        strA = gq6.RESET_ON_NAV.a();
                    }
                    Bundle arguments = getArguments();
                    Bundle bundleA = aq1.a(new Pair("nativeContext", e9a.a.a(null, arguments != null ? arguments.getString("proctorGroups") : null).toBundle()), new Pair("sessionSource", strA));
                    ija ijaVar = new ija();
                    Bundle bundle = new Bundle();
                    bundle.putString("arg_component_name", "Messaging");
                    bundle.putBundle("arg_launch_options", bundleA);
                    bundle.putBoolean("arg_fabric_enabled", false);
                    ijaVar.setArguments(bundle);
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    aVar.d(R.id.rn_messaging_container, ijaVar, null, 1);
                    aVar.h(false);
                    this.b = true;
                    if (str != null) {
                        if (!Q(str)) {
                            str = null;
                        }
                        if (str != null) {
                            R(str);
                        }
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.k3g
    public final void a(da2 da2Var) {
        ((d4g) this.V.getValue()).g(da2Var);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.k3g
    public final void m(List<raa> list) {
        ((d4g) this.V.getValue()).h(list);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.rn_messaging_fragment, (ViewGroup) null, false);
        int i2 = R.id.messaging_login_compose_view;
        ComposeView composeView = (ComposeView) esg.a(viewInflate, R.id.messaging_login_compose_view);
        if (composeView != null) {
            i2 = R.id.rn_messaging_container;
            FrameLayout frameLayout = (FrameLayout) esg.a(viewInflate, R.id.rn_messaging_container);
            if (frameLayout != null) {
                FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                i2 = R.id.rn_messaging_tare_top_nav_bar;
                ComposeView composeView2 = (ComposeView) esg.a(viewInflate, R.id.rn_messaging_tare_top_nav_bar);
                if (composeView2 != null) {
                    this.d = new ied(frameLayout2, composeView, frameLayout, frameLayout2, composeView2);
                    frameLayout2.getClass();
                    return frameLayout2;
                }
            }
        }
        ja.k("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.m6f, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        boolean zC = ((h2g) cr8.p(h2g.class)).c();
        ied iedVar = this.d;
        int i2 = 8;
        if (zC) {
            if (iedVar == null) {
                wl7.g("binding");
                throw null;
            }
            ComposeView composeView = iedVar.e;
            composeView.setVisibility(0);
            composeView.setViewCompositionStrategy(kpg.a.a);
            composeView.setContent(new ah2(-1018220585, new js0(this, i2), true));
        } else {
            if (iedVar == null) {
                wl7.g("binding");
                throw null;
            }
            iedVar.e.setVisibility(8);
        }
        ied iedVar2 = this.d;
        if (iedVar2 == null) {
            wl7.g("binding");
            throw null;
        }
        iedVar2.b.setContent(new ah2(-727286920, new pj(this, 13), true));
        if (((bp7) cr8.p(bp7.class)).e()) {
            P(false);
        } else {
            P(true);
        }
        ((jed) this.e.getValue()).b.e(getViewLifecycleOwner(), new a(new a3(this, 20)));
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        u63.Y(hh1.A(viewLifecycleOwner), null, null, new ged(this, null), 3);
    }

    @Override // defpackage.k3g
    public final void v(List<raa> list) {
        ((d4g) this.V.getValue()).j(list);
    }

    @Override // defpackage.k3g
    public final void z(sof sofVar) {
        ((d4g) this.V.getValue()).i(sofVar);
    }
}
