package com.indeed.android.rnmyjobs;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.indeed.android.reactnative.nativemodules.RNCoreNativeModule;
import defpackage.aq1;
import defpackage.bf9;
import defpackage.bp7;
import defpackage.c1f;
import defpackage.c1g;
import defpackage.c2d;
import defpackage.cr8;
import defpackage.d8a;
import defpackage.d8c;
import defpackage.e13;
import defpackage.e9a;
import defpackage.frg;
import defpackage.fwc;
import defpackage.g13;
import defpackage.gq6;
import defpackage.grg;
import defpackage.gu5;
import defpackage.ija;
import defpackage.irg;
import defpackage.j6g;
import defpackage.jp6;
import defpackage.ka2;
import defpackage.kv8;
import defpackage.l5;
import defpackage.lu2;
import defpackage.mj8;
import defpackage.n6f;
import defpackage.np7;
import defpackage.o6;
import defpackage.os5;
import defpackage.p63;
import defpackage.pjc;
import defpackage.prd;
import defpackage.r6;
import defpackage.r7d;
import defpackage.rkc;
import defpackage.rq;
import defpackage.s8c;
import defpackage.t8c;
import defpackage.to4;
import defpackage.u40;
import defpackage.uh3;
import defpackage.xj1;
import defpackage.zv8;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/rnmyjobs/a;", "Ln6f;", "<init>", "()V", "rnmyjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends n6f {
    public String V;
    public String W;
    public String X;
    public boolean e;
    public final xj1 b = xj1.c;
    public final frg c = os5.a(this, fwc.a.b(t8c.class), new b(this), new c(this), new d(this));
    public final n6f.a d = new n6f.a();
    public String f = "";

    /* JADX INFO: renamed from: com.indeed.android.rnmyjobs.a$a, reason: collision with other inner class name */
    @uh3(c = "com.indeed.android.rnmyjobs.RNMyJobsFragment$LoggedInContent$2$1", f = "RNMyJobsFragment.kt", l = {105}, m = "invokeSuspend")
    public static final class C0184a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ int $containerId;
        int label;

        /* JADX INFO: renamed from: com.indeed.android.rnmyjobs.a$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.rnmyjobs.RNMyJobsFragment$LoggedInContent$2$1$1", f = "RNMyJobsFragment.kt", l = {}, m = "invokeSuspend")
        public static final class C0185a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ int $containerId;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0185a(a aVar, int i, lu2<? super C0185a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = aVar;
                this.$containerId = i;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0185a(this.this$0, this.$containerId, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0185a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                a aVar = this.this$0;
                int i = this.$containerId;
                aVar.getClass();
                if (((bp7) cr8.p(bp7.class)).e() && !aVar.e) {
                    if (aVar.getChildFragmentManager().D("RNMyJobsFragment") != null || aVar.getChildFragmentManager().C(i) != null) {
                        aVar.e = true;
                    } else if (aVar.getLifecycle().b().compareTo(kv8.b.d) >= 0) {
                        e9a e9aVarA = e9a.a.a(null, null);
                        String str = aVar.f;
                        String str2 = aVar.V;
                        String str3 = aVar.W;
                        String str4 = aVar.X;
                        str.getClass();
                        Bundle bundleA = aq1.a(new Pair("nativeContext", e9aVarA.toBundle()), new Pair("myJobsUrl", str), new Pair("fetchOnLoad", Boolean.FALSE));
                        if (str2 != null) {
                            bundleA.putString("initialSubscreenId", str2);
                        }
                        if (str3 != null) {
                            bundleA.putString("initialFrom", str3);
                        }
                        if (str4 != null) {
                            bundleA.putString("initialApplicationId", str4);
                        }
                        ija ijaVar = new ija();
                        Bundle bundle = new Bundle();
                        bundle.putString("arg_component_name", "MyJobs");
                        bundle.putBundle("arg_launch_options", bundleA);
                        bundle.putBoolean("arg_fabric_enabled", false);
                        ijaVar.setArguments(bundle);
                        FragmentManager childFragmentManager = aVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
                        aVar2.d(i, ijaVar, "RNMyJobsFragment", 1);
                        aVar2.h(true);
                        aVar.e = true;
                    }
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0184a(int i, lu2<? super C0184a> lu2Var) {
            super(2, lu2Var);
            this.$containerId = i;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return a.this.new C0184a(this.$containerId, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((C0184a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zv8 viewLifecycleOwner = a.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                C0185a c0185a = new C0185a(a.this, this.$containerId, null);
                this.label = 1;
                Object objB = c2d.b(viewLifecycleOwner, kv8.b.d, c0185a, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
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
        public c(a aVar) {
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

    public static final class d extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    @Override // defpackage.m6f
    /* JADX INFO: renamed from: F, reason: from getter */
    public final xj1 getB() {
        return this.b;
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
            rNCoreNativeModule.signalScrollMainContentToTop(this.b);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).f("RNMyJobsFragment", "Error handling scrollToTop", false, e);
        }
    }

    @Override // defpackage.m6f
    public final void H(String str) {
        str.getClass();
        ((np7) cr8.p(np7.class)).a("RNMyJobsFragment", "loadUrl: ".concat(str));
        R(str);
    }

    @Override // defpackage.m6f
    public final void I() {
        ((np7) cr8.p(np7.class)).a("RNMyJobsFragment", "markCurrentStateAsInvalid");
    }

    @Override // defpackage.m6f
    public final void J() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        ((np7) cr8.p(np7.class)).a("RNMyJobsFragment", "onTabFocus");
        jp6 jp6Var = ka2.h0;
        if (jp6Var != null) {
            jp6Var.invoke();
        }
        boolean zC = new d8c(false).c(xj1.c, false);
        frg frgVar = this.c;
        if (zC) {
            ((t8c) frgVar.getValue()).h(s8c.NATIVE_MYJOBS);
        } else {
            ((t8c) frgVar.getValue()).g(false);
        }
        RNMyJobsModule.INSTANCE.getClass();
        if (!RNMyJobsModule.isSubscriptionActive) {
            RNMyJobsModule.hasPendingFocusEvent = true;
            return;
        }
        try {
            Object applicationContext = requireContext().getApplicationContext();
            applicationContext.getClass();
            rkc rkcVarB = ((pjc) applicationContext).b();
            ReactContext reactContextA = rkcVarB != null ? rkcVarB.a() : null;
            if (reactContextA == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextA.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
                return;
            }
            rCTDeviceEventEmitter.emit("myJobsBottomNavTabFocused", null);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).f("RNMyJobsFragment", "Error emitting myJobsTabFocused event", false, e);
        }
    }

    @Override // defpackage.m6f
    public final void K() {
        ((np7) cr8.p(np7.class)).a("RNMyJobsFragment", "onTabLeave");
    }

    @Override // defpackage.m6f
    public final void L(prd prdVar) {
        prdVar.getClass();
    }

    @Override // defpackage.m6f
    public final void M(gq6 gq6Var) {
        ((np7) cr8.p(np7.class)).a("RNMyJobsFragment", "resetToInitialState: " + gq6Var);
    }

    @Override // defpackage.m6f
    public final void N() {
        ((np7) cr8.p(np7.class)).a("RNMyJobsFragment", "startInitialLoad");
    }

    @Override // defpackage.n6f
    public final void O(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(1972957781);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = Integer.valueOf(View.generateViewId());
                cVarH.p(objV);
            }
            final int iIntValue = ((Number) objV).intValue();
            e eVarD = g.d(e.a.b, 1.0f);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new Function1() { // from class: vdc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.setId(iIntValue);
                        frameLayout.setTag("rn_myjobs_container");
                        return frameLayout;
                    }
                };
                cVarH.p(objV2);
            }
            androidx.compose.ui.viewinterop.a.a((Function1) objV2, eVarD, null, cVarH, 54, 4);
            Integer numValueOf = Integer.valueOf(iIntValue);
            boolean zX = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX || objV3 == c0020a) {
                objV3 = new C0184a(iIntValue, null);
                cVarH.p(objV3);
            }
            to4.d(cVarH, numValueOf, (Function2) objV3);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rq(this, i, 10);
        }
    }

    @Override // defpackage.n6f
    /* JADX INFO: renamed from: P, reason: from getter */
    public final n6f.a getD() {
        return this.d;
    }

    public final void Q(String str, String str2, String str3) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        np7 np7Var = (np7) cr8.p(np7.class);
        StringBuilder sbF = u40.f("navigateToSubscreen: ", str, " from: ", str2, " applicationId: ");
        sbF.append(str3);
        np7Var.a("RNMyJobsFragment", sbF.toString());
        if (!this.e) {
            this.V = str;
            this.W = str2;
            this.X = str3;
            return;
        }
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("subscreenId", str);
            writableMapCreateMap.putString("from", str2 == null ? "" : str2);
            if (str3 != null) {
                writableMapCreateMap.putString("applicationId", str3);
            }
            Object applicationContext = requireContext().getApplicationContext();
            applicationContext.getClass();
            rkc rkcVarB = ((pjc) applicationContext).b();
            ReactContext reactContextA = rkcVarB != null ? rkcVarB.a() : null;
            if (reactContextA != null && (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextA.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) != null) {
                rCTDeviceEventEmitter.emit("myJobsNavigateToSubscreen", writableMapCreateMap);
            }
            ((np7) cr8.p(np7.class)).a("RNMyJobsFragment", "Emitted navigate event: " + str + " from: " + str2 + " applicationId: " + str3);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).f("RNMyJobsFragment", "Error emitting navigate event", false, e);
        }
    }

    public final void R(String str) {
        try {
            d8a d8aVarD = bf9.d(str);
            Q(d8aVarD.a, d8aVarD.b, d8aVarD.c);
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).f("RNMyJobsFragment", l5.l("Error parsing URL for navigation: ", str), false, e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        jp6 jp6Var = ka2.h0;
        if (jp6Var != null) {
            jp6Var.invoke();
        }
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("arg_myjobs_url", "")) != null) {
            str = string;
        }
        this.f = str;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("arg_initial_url") : null;
        if (string2 != null) {
            R(string2);
            ((c1g) cr8.p(c1g.class)).a();
        }
    }
}
