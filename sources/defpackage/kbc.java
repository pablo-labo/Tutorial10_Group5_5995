package defpackage;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.indeed.android.jobsearch.R;
import com.indeed.android.reactnative.nativemodules.RNCoreNativeModule;
import defpackage.epg;
import defpackage.grg;
import defpackage.jq7;
import defpackage.kbc;
import defpackage.p63;
import defpackage.sp7;
import defpackage.uzg;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkbc;", "Lcom/google/android/material/bottomsheet/c;", "Lcom/indeed/android/reactnative/nativemodules/RNCoreNativeModule$a;", "Lpmc;", "<init>", "()V", "a", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kbc extends com.google.android.material.bottomsheet.c implements RNCoreNativeModule.a, pmc {
    public gu5<j6g> g0;
    public final wm2 h0 = new wm2();
    public com.google.android.material.bottomsheet.b i0;
    public final frg j0;
    public final boolean k0;
    public boolean l0;
    public boolean m0;
    public final d2f n0;
    public lbc o0;
    public static final /* synthetic */ qf8<Object>[] q0 = {fwc.a.e(new w3a(kbc.class, "binding", "getBinding()Lcom/indeed/android/reactnative/databinding/RnDialogFragmentBinding;", 0))};
    public static final a p0 = new a();

    public static final class a {
        public static kbc a(String str, oec oecVar, String str2, double d, boolean z, gu5 gu5Var) {
            kbc kbcVar = new kbc();
            Bundle bundleA = aq1.a(new Pair("arg_component_name", str), new Pair("arg_launch_options", oecVar.toBundle()), new Pair("arg_event_name_prefix", str2), new Pair("arg_event_modal_height_modifer", Double.valueOf(d)));
            kbcVar.g0 = gu5Var;
            kbcVar.setArguments(bundleA);
            kbcVar.m0 = z;
            return kbcVar;
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ Configuration b;
        public final /* synthetic */ double c;

        public b(Configuration configuration, double d) {
            this.b = configuration;
            this.c = d;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View decorView;
            ViewTreeObserver viewTreeObserver;
            kbc kbcVar = kbc.this;
            com.google.android.material.bottomsheet.b bVar = kbcVar.i0;
            if (bVar == null) {
                wl7.g("bottomSheetDialog");
                throw null;
            }
            Window window = bVar.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            if (kbcVar.isAdded()) {
                kbcVar.P(this.c, this.b);
            }
        }
    }

    public static final class c extends wpa {
        public c() {
            super(true);
        }

        @Override // defpackage.wpa
        public final void b() {
            boolean z = w74.i0;
            kbc kbcVar = kbc.this;
            if (z) {
                kbcVar.i();
                return;
            }
            w74.h0 = new WeakReference(kbcVar);
            a aVar = kbc.p0;
            kbcVar.R().f();
        }
    }

    public static final class d implements ylc {
        public final /* synthetic */ rkc b;

        public d(rkc rkcVar) {
            this.b = rkcVar;
        }

        @Override // defpackage.ylc
        public final void a(ReactApplicationContext reactApplicationContext) {
            RNCoreNativeModule rNCoreNativeModule = (RNCoreNativeModule) reactApplicationContext.getNativeModule(RNCoreNativeModule.class);
            if (rNCoreNativeModule != null) {
                rNCoreNativeModule.setScrollListener(kbc.this);
            }
            this.b.c(this);
        }
    }

    public static final class e extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kbc kbcVar) {
            super(0);
            this.$this_viewModels = kbcVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class f extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.$ownerProducer = eVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class g extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class h extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Lazy lazy) {
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

    public static final class i extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kbc kbcVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = kbcVar;
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

    public kbc() {
        Lazy lazyE = boa.E(qt8.c, new f(new e(this)));
        this.j0 = os5.a(this, fwc.a.b(nbc.class), new g(lazyE), new h(lazyE), new i(this, lazyE));
        this.k0 = Build.VERSION.SDK_INT >= 34;
        this.n0 = new d2f(new ig(this, 18));
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.oj0, androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        Window window;
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) super.H(bundle);
        this.i0 = bVar;
        if (this.m0 && (window = bVar.getWindow()) != null) {
            window.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
            window.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            View decorView = window.getDecorView();
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.c.c(decorView);
        }
        com.google.android.material.bottomsheet.b bVar2 = this.i0;
        if (bVar2 == null) {
            wl7.g("bottomSheetDialog");
            throw null;
        }
        bVar2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: jbc
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                kbc.a aVar = kbc.p0;
                kbc kbcVar = this.a;
                if (kbcVar.isAdded()) {
                    Bundle arguments = kbcVar.getArguments();
                    double d2 = arguments != null ? arguments.getDouble("arg_event_modal_height_modifer") : 1.0d;
                    boolean z = kbcVar.m0;
                    b bVar3 = kbcVar.i0;
                    if (z) {
                        if (bVar3 == null) {
                            wl7.g("bottomSheetDialog");
                            throw null;
                        }
                        bVar3.h().H(3);
                        Configuration configuration = kbcVar.requireContext().getResources().getConfiguration();
                        configuration.getClass();
                        kbcVar.O(d2, configuration);
                        return;
                    }
                    if (bVar3 == null) {
                        wl7.g("bottomSheetDialog");
                        throw null;
                    }
                    Window window2 = bVar3.getWindow();
                    if (window2 != null) {
                        ine ineVar = new ine(window2.getDecorView());
                        int i2 = Build.VERSION.SDK_INT;
                        (i2 >= 35 ? new uzg.f(window2, ineVar) : i2 >= 30 ? new uzg.d(window2, ineVar) : new uzg.c(window2, ineVar)).c(true);
                    }
                    Configuration configuration2 = kbcVar.requireContext().getResources().getConfiguration();
                    configuration2.getClass();
                    kbcVar.P(d2, configuration2);
                }
            }
        });
        c cVar = new c();
        com.google.android.material.bottomsheet.b bVar3 = this.i0;
        if (bVar3 == null) {
            wl7.g("bottomSheetDialog");
            throw null;
        }
        dqa dqaVar = bVar3.c;
        dqaVar.getClass();
        dqaVar.b(cVar);
        com.google.android.material.bottomsheet.b bVar4 = this.i0;
        if (bVar4 != null) {
            return bVar4;
        }
        wl7.g("bottomSheetDialog");
        throw null;
    }

    public final void O(double d2, Configuration configuration) {
        jqd jqdVar;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = contextRequireContext.getSystemService("window");
            systemService.getClass();
            WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            currentWindowMetrics.getClass();
            Rect bounds = currentWindowMetrics.getBounds();
            bounds.getClass();
            jqdVar = new jqd(bounds.width(), bounds.height());
        } else {
            Object systemService2 = contextRequireContext.getSystemService("window");
            systemService2.getClass();
            Display defaultDisplay = ((WindowManager) systemService2).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            jqdVar = new jqd(point.x, point.y);
        }
        double d3 = ((double) jqdVar.b) * d2;
        com.google.android.material.bottomsheet.b bVar = this.i0;
        if (bVar == null) {
            wl7.g("bottomSheetDialog");
            throw null;
        }
        bVar.h().k = (int) d3;
        if (configuration.orientation == 2) {
            com.google.android.material.bottomsheet.b bVar2 = this.i0;
            if (bVar2 == null) {
                wl7.g("bottomSheetDialog");
                throw null;
            }
            bVar2.h().j = jqdVar.a;
        }
    }

    public final void P(double d2, Configuration configuration) {
        View decorView;
        if (configuration.orientation == 2 && Build.VERSION.SDK_INT <= 29) {
            d2 = 1.0d;
        }
        com.google.android.material.bottomsheet.b bVar = this.i0;
        if (bVar == null) {
            wl7.g("bottomSheetDialog");
            throw null;
        }
        Window window = bVar.getWindow();
        int height = (int) ((1.0d - d2) * ((double) ((window == null || (decorView = window.getDecorView()) == null) ? getResources().getDisplayMetrics().heightPixels : decorView.getHeight())));
        com.google.android.material.bottomsheet.b bVar2 = this.i0;
        if (bVar2 == null) {
            wl7.g("bottomSheetDialog");
            throw null;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorH = bVar2.h();
        bottomSheetBehaviorH.D(false);
        bottomSheetBehaviorH.C(height);
        bottomSheetBehaviorH.H(3);
    }

    public final nbc Q() {
        return (nbc) this.j0.getValue();
    }

    public final rkc R() {
        Object applicationContext = requireContext().getApplicationContext();
        applicationContext.getClass();
        rkc rkcVarB = ((pjc) applicationContext).b();
        rkcVarB.getClass();
        return rkcVarB;
    }

    public final String S() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("arg_event_name_prefix")) == null) {
            string = "rn";
        }
        return string.concat("-bottom-sheet");
    }

    public final void T() {
        ((np7) cr8.p(np7.class)).e(S(), "UIPContext.deeplink.notifyDeepLinkLoadCompleted()");
        ((c1g) cr8.p(c1g.class)).a();
    }

    @Override // defpackage.pmc
    public final void i() {
        T();
        E();
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        T();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        View decorView;
        ViewTreeObserver viewTreeObserver;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        if (this.i0 != null) {
            Bundle arguments = getArguments();
            double d2 = arguments != null ? arguments.getDouble("arg_event_modal_height_modifer") : 1.0d;
            if (this.m0) {
                O(d2, configuration);
                return;
            }
            com.google.android.material.bottomsheet.b bVar = this.i0;
            if (bVar == null) {
                wl7.g("bottomSheetDialog");
                throw null;
            }
            Window window = bVar.getWindow();
            if (window == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(new b(configuration, d2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.rn_dialog_fragment, viewGroup, false);
        if (viewInflate == null) {
            ja.k("rootView");
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        ded dedVar = new ded(frameLayout, frameLayout);
        qf8<Object>[] qf8VarArr = q0;
        qf8<Object> qf8Var = qf8VarArr[0];
        wm2 wm2Var = this.h0;
        wm2Var.d(qf8Var, this, dedVar);
        return ((ded) wm2Var.b(qf8VarArr[0], this)).a;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDetach() {
        RNCoreNativeModule rNCoreNativeModule;
        super.onDetach();
        lbc lbcVar = this.o0;
        if (lbcVar != null) {
            com.google.android.material.bottomsheet.b bVar = this.i0;
            if (bVar == null) {
                wl7.g("bottomSheetDialog");
                throw null;
            }
            bVar.h().B(lbcVar);
        }
        ReactContext reactContextA = R().a();
        if (reactContextA != null && (rNCoreNativeModule = (RNCoreNativeModule) reactContextA.getNativeModule(RNCoreNativeModule.class)) != null) {
            rNCoreNativeModule.removeScrollListener(this);
        }
        if (((kr7) cr8.p(kr7.class)).e("droid_mag_ftue_new_logged_out_experience_tst").a >= 0 && !((bp7) cr8.p(bp7.class)).e()) {
            try {
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                FragmentManager parentFragmentManager = getParentFragmentManager();
                parentFragmentManager.getClass();
                rq7Var.f(parentFragmentManager, mh2.k(this), jq7.x.INSTANCE, "rn_view_job_close");
            } catch (Exception e2) {
                ((np7) cr8.p(np7.class)).c(S(), "Failed to navigate to RegPromo", false, e2);
            }
        }
        gu5<j6g> gu5Var = this.g0;
        if (gu5Var != null) {
            gu5Var.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        if (this.k0 && this.l0) {
            requireActivity().unregisterScreenCaptureCallback(l5.j(this.n0.getValue()));
            this.l0 = false;
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.k0) {
            try {
                requireActivity().registerScreenCaptureCallback(requireActivity().getMainExecutor(), l5.j(this.n0.getValue()));
                this.l0 = true;
            } catch (Exception e2) {
                ((np7) cr8.p(np7.class)).c(S(), l5.l("Failed to register screen capture detection: ", e2.getMessage()), false, e2);
            }
        }
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.google.android.material.bottomsheet.b bVar = this.i0;
        if (bVar == null) {
            wl7.g("bottomSheetDialog");
            throw null;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorH = bVar.h();
        bottomSheetBehaviorH.getClass();
        lbc lbcVar = new lbc(bottomSheetBehaviorH, this);
        bottomSheetBehaviorH.s(lbcVar);
        this.o0 = lbcVar;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"VisibleForTests"})
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, S(), null, 0 == true ? 1 : 0));
        Context context = getContext();
        if (context != null) {
            String str = ((ep7) cr8.p(ep7.class)).b().b;
            boolean z = str == "ar" || str == "he";
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
            editorEdit.putBoolean("RCTI18nUtil_forceRTL", z);
            editorEdit.apply();
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg_component_name") : null;
        if (string == null) {
            ((np7) cr8.p(np7.class)).c(S(), "Component name is null", false, new IllegalStateException("Component name is null"));
            E();
            return;
        }
        Bundle arguments2 = getArguments();
        Bundle bundle2 = arguments2 != null ? arguments2.getBundle("arg_launch_options") : null;
        ija ijaVar = new ija();
        Bundle bundle3 = new Bundle();
        bundle3.putString("arg_component_name", string);
        bundle3.putBundle("arg_launch_options", bundle2);
        bundle3.putBoolean("arg_fabric_enabled", false);
        ijaVar.setArguments(bundle3);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.d(R.id.base_dialog_fragment_view, ijaVar, null, 1);
        aVar.h(false);
        rkc rkcVarR = R();
        ReactContext reactContextA = rkcVarR.a();
        if (reactContextA == null) {
            rkcVarR.j(new d(rkcVarR));
            return;
        }
        RNCoreNativeModule rNCoreNativeModule = (RNCoreNativeModule) reactContextA.getNativeModule(RNCoreNativeModule.class);
        if (rNCoreNativeModule != null) {
            rNCoreNativeModule.setScrollListener(this);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.RNCoreNativeModule.a
    public final void q(int i2) {
        if (!isAdded()) {
            ((np7) cr8.p(np7.class)).c(S(), "onChange called on a detached fragment", false, new IllegalStateException("Leaked RNViewJobBottomSheetFragment instance"));
            return;
        }
        g4a g4aVar = Q().b;
        ((gme) g4aVar).setValue(mbc.a((mbc) ((gme) g4aVar).getValue(), 0.0f, i2 <= 10, false, 5));
        com.google.android.material.bottomsheet.b bVar = this.i0;
        if (bVar != null) {
            bVar.h().F = ((mbc) ((gme) Q().b).getValue()).b;
        } else {
            wl7.g("bottomSheetDialog");
            throw null;
        }
    }
}
