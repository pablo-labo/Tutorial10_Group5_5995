package com.indeed.android.jobsearch.bottomnav;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import androidx.compose.animation.i;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.u;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.deeplink.b;
import com.indeed.android.rnprofile.RNProfileModalNativeModule;
import defpackage.a09;
import defpackage.a3;
import defpackage.a9c;
import defpackage.ad4;
import defpackage.ah2;
import defpackage.apf;
import defpackage.b6f;
import defpackage.boa;
import defpackage.bp6;
import defpackage.bu8;
import defpackage.c1f;
import defpackage.c6f;
import defpackage.c87;
import defpackage.cd4;
import defpackage.cp6;
import defpackage.cq6;
import defpackage.cr8;
import defpackage.d2f;
import defpackage.d8c;
import defpackage.d9f;
import defpackage.dd4;
import defpackage.dq6;
import defpackage.dqa;
import defpackage.dr5;
import defpackage.e13;
import defpackage.e9a;
import defpackage.eq6;
import defpackage.esg;
import defpackage.ff6;
import defpackage.fj6;
import defpackage.flf;
import defpackage.fp6;
import defpackage.fpb;
import defpackage.fq6;
import defpackage.frg;
import defpackage.fwc;
import defpackage.g00;
import defpackage.g13;
import defpackage.g3a;
import defpackage.g99;
import defpackage.gme;
import defpackage.gp6;
import defpackage.gq6;
import defpackage.grg;
import defpackage.gu;
import defpackage.gu5;
import defpackage.gxa;
import defpackage.gy1;
import defpackage.gz4;
import defpackage.h2g;
import defpackage.h99;
import defpackage.hh1;
import defpackage.hn0;
import defpackage.hp6;
import defpackage.hq6;
import defpackage.hr;
import defpackage.ht7;
import defpackage.i1g;
import defpackage.i7f;
import defpackage.i99;
import defpackage.ija;
import defpackage.ik3;
import defpackage.in0;
import defpackage.ip6;
import defpackage.ipb;
import defpackage.iq6;
import defpackage.irg;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.ja;
import defpackage.jn0;
import defpackage.jp6;
import defpackage.jq6;
import defpackage.jq7;
import defpackage.jrg;
import defpackage.jz2;
import defpackage.ka2;
import defpackage.kpg;
import defpackage.kqg;
import defpackage.la;
import defpackage.lmh;
import defpackage.lr5;
import defpackage.lu2;
import defpackage.lz2;
import defpackage.m2g;
import defpackage.m99;
import defpackage.mdc;
import defpackage.mh;
import defpackage.mh2;
import defpackage.mhb;
import defpackage.mhh;
import defpackage.mj8;
import defpackage.na0;
import defpackage.naa;
import defpackage.np7;
import defpackage.o6;
import defpackage.oa;
import defpackage.ohb;
import defpackage.os5;
import defpackage.p24;
import defpackage.p63;
import defpackage.p66;
import defpackage.p8c;
import defpackage.pe0;
import defpackage.pk3;
import defpackage.pnb;
import defpackage.q1g;
import defpackage.q3;
import defpackage.q6;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.r6;
import defpackage.r7d;
import defpackage.r97;
import defpackage.ri3;
import defpackage.rob;
import defpackage.rp6;
import defpackage.rq7;
import defpackage.s2d;
import defpackage.s87;
import defpackage.sf5;
import defpackage.sp6;
import defpackage.sp7;
import defpackage.sz0;
import defpackage.t49;
import defpackage.t8c;
import defpackage.thb;
import defpackage.tp6;
import defpackage.tp7;
import defpackage.tx5;
import defpackage.u63;
import defpackage.uh3;
import defpackage.up6;
import defpackage.ut0;
import defpackage.ux4;
import defpackage.vm1;
import defpackage.vp6;
import defpackage.w1g;
import defpackage.w2;
import defpackage.w91;
import defpackage.wj1;
import defpackage.wl7;
import defpackage.wpa;
import defpackage.wv4;
import defpackage.wy2;
import defpackage.x02;
import defpackage.xd;
import defpackage.xj1;
import defpackage.y7c;
import defpackage.yba;
import defpackage.yc9;
import defpackage.yo0;
import defpackage.yof;
import defpackage.yp6;
import defpackage.zee;
import defpackage.zh;
import defpackage.zo6;
import defpackage.zob;
import defpackage.zof;
import defpackage.zp6;
import defpackage.zs0;
import defpackage.zv8;
import defpackage.zve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/indeed/android/jobsearch/bottomnav/IanMainFragment;", "Ls2d;", "Lhq6;", "<init>", "()V", "", "isKeyboardVisible", "shouldShowPrimer", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IanMainFragment extends s2d implements hq6 {
    public final Lazy V;
    public final x02 W;
    public final Lazy X;
    public final Lazy Y;
    public final d2f Z;
    public final Lazy a0;
    public final Lazy b0;
    public dr5 c0;
    public sp6 d0;
    public final Lazy e;
    public final frg e0;
    public final Lazy f;
    public final frg f0;
    public final frg g0;
    public final frg h0;
    public final frg i0;
    public final frg j0;
    public final frg k0;
    public final frg l0;
    public final frg m0;
    public final frg n0;
    public final frg o0;
    public final Lazy p0;
    public final Lazy q0;
    public final frg r0;
    public cp6 s0;
    public final naa t0;
    public final Lazy u0;
    public final Lazy v0;
    public final Lazy w0;
    public final Lazy x0;
    public final frg y0;
    public final gy1 z0;
    public final bp6 c = new bp6();
    public final p8c d = new p8c();

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ht7.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            int[] iArr2 = new int[gxa.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[xj1.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[6] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static final class a0 extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class a1 extends mj8 implements gu5<rob> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, rob] */
        @Override // defpackage.gu5
        public final rob invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(rob.class), a9cVar);
        }
    }

    public static final class b extends wpa {
        public b() {
            super(true);
        }

        @Override // defpackage.wpa
        public final void b() {
            ArrayList arrayList = lz2.a;
            lz2.d("IanMainFragment", "OnBackPressedCallback.handleOnBackPressed", false, null);
            IanMainFragment ianMainFragment = IanMainFragment.this;
            bp6 bp6Var = ianMainFragment.c;
            dr5 dr5Var = ianMainFragment.c0;
            dr5Var.getClass();
            if (dr5Var.i.getVisibility() == 0) {
                lz2.d("IanMainFragment", "handleBackNavigation() -> modal overlay visible, ignoring", false, null);
                return;
            }
            dr5 dr5Var2 = ianMainFragment.c0;
            dr5Var2.getClass();
            if (dr5Var2.h.getVisibility() == 0) {
                lz2.d("IanMainFragment", "handleBackNavigation() -> RN bottom sheet visible, ignoring", false, null);
                return;
            }
            jq6 jq6VarJ = ianMainFragment.J();
            p24 p24Var = jq6VarJ.b0;
            if (((h2g) cr8.p(h2g.class)).i()) {
                zs0 zs0Var = (zs0) p24Var.b;
                if (!zs0Var.isEmpty()) {
                }
                zs0 zs0Var2 = (zs0) p24Var.b;
                xj1 xj1Var = zs0Var2.isEmpty() ? null : (xj1) zs0Var2.first();
                if (xj1Var != null) {
                    ((gme) jq6VarJ.f).setValue(xj1Var);
                    IanMainFragment.U(ianMainFragment, xj1Var, null, 6);
                    j6g j6gVar = j6g.a;
                    return;
                }
            }
            if (mh2.k(ianMainFragment).r()) {
                bp6Var.getClass();
                lz2.b("IanLogger", "Nav controller back stack expected to be empty", false, new UnexpectedBackStackException("Nav controller back stack expected to be empty"));
                return;
            }
            f(false);
            androidx.fragment.app.g activity = ianMainFragment.getActivity();
            if (activity != null) {
                activity.r().d();
                String strName = ianMainFragment.J().h().name();
                bp6Var.getClass();
                strName.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(bp6Var.a(), bp6Var.b.o(strName, "backgrounded"));
            }
            f(true);
        }
    }

    public static final class b0 extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class b1 extends mj8 implements gu5<Bundle> {
        final /* synthetic */ Fragment $this_navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_navArgs = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final Bundle invoke() {
            Bundle arguments = this.$this_navArgs.getArguments();
            if (arguments != null) {
                return arguments;
            }
            ja.q("Fragment ", this.$this_navArgs, " has null arguments");
            return null;
        }
    }

    public static final class c extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModel = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class c0 extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$switchTabs$2", f = "IanMainFragment.kt", l = {1303}, m = "invokeSuspend")
    public static final class c1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public c1(lu2<? super c1> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return IanMainFragment.this.new c1(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                w1g w1gVar = (w1g) IanMainFragment.this.a0.getValue();
                wy2 wy2Var = new wy2(4);
                this.label = 1;
                Object objF = w1gVar.f(wy2Var, this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
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

    public static final class d extends mj8 implements gu5<zee> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IanMainFragment ianMainFragment, c cVar) {
            super(0);
            this.$this_activityViewModel = ianMainFragment;
            this.$ownerProducer = cVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, zee] */
        @Override // defpackage.gu5
        public final zee invoke() {
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
            return p66.a(fwc.a.b(zee.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class d0 extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModel = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class e0 extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class f extends mj8 implements gu5<fj6> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(IanMainFragment ianMainFragment, e eVar) {
            super(0);
            this.$this_activityViewModel = ianMainFragment;
            this.$ownerProducer = eVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, fj6] */
        @Override // defpackage.gu5
        public final fj6 invoke() {
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
            return p66.a(fwc.a.b(fj6.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class f0 extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class g extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class g0 extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
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
        public h(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class h0 extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
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
        public i(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class i0 extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class j extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class j0 extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class k extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class k0 extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class l extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class l0 extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class m extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class m0 extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class n extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class n0 extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class o extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class o0 extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class p extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class p0 extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class q extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class q0 extends mj8 implements gu5<y7c> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y7c] */
        @Override // defpackage.gu5
        public final y7c invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(y7c.class), a9cVar);
        }
    }

    public static final class r extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class r0 extends mj8 implements gu5<hn0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [hn0, java.lang.Object] */
        @Override // defpackage.gu5
        public final hn0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(hn0.class), a9cVar);
        }
    }

    public static final class s extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class s0 extends mj8 implements gu5<in0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [in0, java.lang.Object] */
        @Override // defpackage.gu5
        public final in0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(in0.class), a9cVar);
        }
    }

    public static final class t extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class t0 extends mj8 implements gu5<sf5> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, sf5] */
        @Override // defpackage.gu5
        public final sf5 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(sf5.class), a9cVar);
        }
    }

    public static final class u extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class u0 extends mj8 implements gu5<yof> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yof] */
        @Override // defpackage.gu5
        public final yof invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(yof.class), a9cVar);
        }
    }

    public static final class v extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class v0 extends mj8 implements gu5<d8c> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [d8c, java.lang.Object] */
        @Override // defpackage.gu5
        public final d8c invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(d8c.class), a9cVar);
        }
    }

    public static final class w extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class w0 extends mj8 implements gu5<g00> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [g00, java.lang.Object] */
        @Override // defpackage.gu5
        public final g00 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(g00.class), a9cVar);
        }
    }

    public static final class x extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class x0 extends mj8 implements gu5<w1g> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, w1g] */
        @Override // defpackage.gu5
        public final w1g invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(w1g.class), a9cVar);
        }
    }

    public static final class y extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class y0 extends mj8 implements gu5<m2g> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, m2g] */
        @Override // defpackage.gu5
        public final m2g invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(m2g.class), a9cVar);
        }
    }

    public static final class z extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_activityViewModels = ianMainFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class z0 extends mj8 implements gu5<t49> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(IanMainFragment ianMainFragment) {
            super(0);
            this.$this_inject = ianMainFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, t49] */
        @Override // defpackage.gu5
        public final t49 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(t49.class), a9cVar);
        }
    }

    public IanMainFragment() {
        s0 s0Var = new s0(this);
        qt8 qt8Var = qt8.a;
        this.e = boa.E(qt8Var, s0Var);
        this.f = boa.E(qt8Var, new t0(this));
        this.V = boa.E(qt8Var, new u0(this));
        this.W = new x02();
        this.X = boa.E(qt8Var, new v0(this));
        this.Y = boa.E(qt8Var, new w0(this));
        this.Z = new d2f(new sz0(3));
        this.a0 = boa.E(qt8Var, new x0(this));
        this.b0 = boa.E(qt8Var, new y0(this));
        iwc iwcVar = fwc.a;
        this.e0 = os5.a(this, iwcVar.b(jq6.class), new q(this), new b0(this), new j0(this));
        this.f0 = os5.a(this, iwcVar.b(i7f.class), new k0(this), new l0(this), new m0(this));
        this.g0 = os5.a(this, iwcVar.b(ff6.class), new n0(this), new o0(this), new p0(this));
        this.h0 = os5.a(this, iwcVar.b(c6f.class), new g(this), new h(this), new i(this));
        this.i0 = os5.a(this, iwcVar.b(ohb.class), new j(this), new k(this), new l(this));
        this.j0 = os5.a(this, iwcVar.b(t8c.class), new m(this), new n(this), new o(this));
        this.k0 = os5.a(this, iwcVar.b(mhb.class), new p(this), new r(this), new s(this));
        this.l0 = os5.a(this, iwcVar.b(jn0.class), new t(this), new u(this), new v(this));
        this.m0 = os5.a(this, iwcVar.b(m99.class), new g99(this), new h99(this), new i99(this));
        this.n0 = os5.a(this, iwcVar.b(apf.class), new w(this), new x(this), new y(this));
        this.o0 = os5.a(this, iwcVar.b(thb.class), new z(this), new a0(this), new c0(this));
        d dVar = new d(this, new c(this));
        qt8 qt8Var2 = qt8.c;
        this.p0 = boa.E(qt8Var2, dVar);
        this.q0 = boa.E(qt8Var2, new f(this, new e(this)));
        this.r0 = os5.a(this, iwcVar.b(d9f.class), new d0(this), new e0(this), new f0(this));
        this.t0 = new naa(iwcVar.b(eq6.class), new b1(this));
        this.u0 = boa.E(qt8Var, new z0(this));
        this.v0 = boa.E(qt8Var, new a1(this));
        this.w0 = boa.E(qt8Var, new q0(this));
        this.x0 = boa.E(qt8Var, new r0(this));
        this.y0 = os5.a(this, iwcVar.b(ik3.class), new g0(this), new h0(this), new i0(this));
        this.z0 = new gy1(new la(this, 11), new wy2(this));
    }

    public static final void G(IanMainFragment ianMainFragment, int i2) {
        dr5 dr5Var = ianMainFragment.c0;
        dr5Var.getClass();
        ViewPager2 viewPager2 = dr5Var.f;
        dr5 dr5Var2 = ianMainFragment.c0;
        dr5Var2.getClass();
        int paddingLeft = dr5Var2.f.getPaddingLeft();
        dr5 dr5Var3 = ianMainFragment.c0;
        dr5Var3.getClass();
        int paddingTop = dr5Var3.f.getPaddingTop();
        dr5 dr5Var4 = ianMainFragment.c0;
        dr5Var4.getClass();
        viewPager2.setPadding(paddingLeft, paddingTop, dr5Var4.f.getPaddingRight(), i2);
        dr5 dr5Var5 = ianMainFragment.c0;
        dr5Var5.getClass();
        ComposeView composeView = dr5Var5.c;
        dr5 dr5Var6 = ianMainFragment.c0;
        dr5Var6.getClass();
        int paddingLeft2 = dr5Var6.c.getPaddingLeft();
        dr5 dr5Var7 = ianMainFragment.c0;
        dr5Var7.getClass();
        int paddingTop2 = dr5Var7.c.getPaddingTop();
        dr5 dr5Var8 = ianMainFragment.c0;
        dr5Var8.getClass();
        composeView.setPadding(paddingLeft2, paddingTop2, dr5Var8.c.getPaddingRight(), i2);
    }

    public static xj1 I() {
        dd4 dd4Var = dd4.a;
        return dd4.f() ? xj1.X : xj1.b;
    }

    public static void P(IanMainFragment ianMainFragment, String str, boolean z2, boolean z3, int i2) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        lr5 lr5VarU = ianMainFragment.requireActivity().u();
        lr5VarU.getClass();
        ka2.H(str, z2, z3, lr5VarU);
    }

    public static void Q(IanMainFragment ianMainFragment) {
        rq7 rq7Var = (rq7) cr8.p(rq7.class);
        lr5 lr5VarU = ianMainFragment.requireActivity().u();
        lr5VarU.getClass();
        rq7Var.f(lr5VarU, mh2.k(ianMainFragment), new jq7.s(null), "ian_main_fragment");
    }

    public static /* synthetic */ void U(IanMainFragment ianMainFragment, xj1 xj1Var, String str, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        ianMainFragment.T(xj1Var, str, false);
    }

    @Override // defpackage.hq6
    public final boolean B(String str) {
        str.getClass();
        r97.a.getClass();
        if (r97.h(str) || r97.y(str)) {
            U(this, I(), str, 4);
            return true;
        }
        zo6.a.getClass();
        xj1 xj1VarH = zo6.h(str);
        if (xj1VarH == null) {
            return false;
        }
        U(this, xj1VarH, str, 4);
        return true;
    }

    public final ff6 H() {
        return (ff6) this.g0.getValue();
    }

    public final jq6 J() {
        return (jq6) this.e0.getValue();
    }

    public final ohb K() {
        return (ohb) this.i0.getValue();
    }

    public final zee L() {
        return (zee) this.p0.getValue();
    }

    public final c6f M() {
        return (c6f) this.h0.getValue();
    }

    public final d9f N() {
        return (d9f) this.r0.getValue();
    }

    public final void O(b.c cVar) {
        String string = cVar.f.toString();
        string.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("IanMainFragment", "loadUrlFromLink: url = ".concat(string), false, null);
        com.indeed.android.jobsearch.deeplink.a.a(cVar, new xd(this, 9));
    }

    public final void R() {
        L().c = false;
        M().g(J().h(), gq6.SIGN_IN_RELOAD);
        c6f c6fVarM = M();
        xj1 xj1VarG = J().g();
        xj1VarG.getClass();
        wv4 wv4Var = xj1.d0;
        wv4Var.getClass();
        w2.b bVar = new w2.b();
        while (bVar.hasNext()) {
            xj1 xj1Var = (xj1) bVar.next();
            if (xj1Var != xj1VarG) {
                ArrayList arrayList = lz2.a;
                lz2.d("TabEventManagerViewModel", xj1Var + ": fireMarkStateAsInvalidEvent", false, null);
                c6fVarM.l(xj1Var).c.k(new jz2<>(new yc9()));
            }
        }
    }

    public final void S(int i2, List<Integer> list) {
        dr5 dr5Var = this.c0;
        dr5Var.getClass();
        ViewPager2 viewPager2 = dr5Var.f;
        dr5 dr5Var2 = this.c0;
        dr5Var2.getClass();
        ComposeView composeView = dr5Var2.c;
        dr5 dr5Var3 = this.c0;
        dr5Var3.getClass();
        ComposeView composeView2 = dr5Var3.b;
        dr5 dr5Var4 = this.c0;
        dr5Var4.getClass();
        ComposeView composeView3 = dr5Var4.e;
        dr5 dr5Var5 = this.c0;
        dr5Var5.getClass();
        List listA0 = u63.a0(viewPager2, composeView, composeView2, composeView3, dr5Var5.d);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA0) {
            if (!list.contains(Integer.valueOf(((ViewGroup) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setImportantForAccessibility(i2);
        }
    }

    public final void T(xj1 xj1Var, String str, boolean z2) {
        if (J().j()) {
            J().l(false);
        }
        if (J().g() == xj1.d || J().g() == xj1.b0) {
            boolean zH = bu8.a.h();
            d2f d2fVar = this.Z;
            if (zH) {
                ((w1g) this.a0.getValue()).a((e13) d2fVar.getValue(), new vm1(7));
            } else {
                u63.Y((e13) d2fVar.getValue(), null, null, new c1(null), 3);
            }
        }
        if (J().g() != xj1Var) {
            M().j(J().g());
        }
        M().i(xj1Var);
        J().m(xj1Var);
        cp6 cp6Var = this.s0;
        if (cp6Var == null) {
            wl7.g("uiController");
            throw null;
        }
        cp6Var.a.b(cp6.a(xj1Var), false);
        jq6 jq6VarJ = J();
        boolean zA = ((h2g) cr8.p(h2g.class)).a();
        xj1 xj1Var2 = xj1.e;
        if (zA && jq6VarJ.g() == xj1Var2) {
            J().k(false, false);
        } else {
            J().k(true, false);
        }
        if (str == null) {
            iq6 iq6Var = iq6.a;
            if (ut0.I0(new xj1[]{xj1.b, xj1.c, xj1Var2, xj1.X, xj1.V}).contains(xj1Var)) {
                M().h(xj1Var);
                return;
            } else {
                M().g(xj1Var, gq6.RESET_ON_NAV);
                return;
            }
        }
        c6f c6fVarM = M();
        ArrayList arrayList = lz2.a;
        lz2.d("TabEventManagerViewModel", xj1Var + ": fireLoadUrlEvent", false, null);
        b6f b6fVarL = c6fVarM.l(xj1Var);
        b6fVarL.getClass();
        b6fVarL.e.k(new jz2<>(new a09(str, z2)));
    }

    public final void V(int i2) {
        Object next;
        Iterator it = ((List) ((gme) J().X).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            xj1 xj1Var = ((wj1) next).b;
            if (xj1Var == xj1.d || xj1Var == xj1.b0) {
                break;
            }
        }
        wj1 wj1Var = (wj1) next;
        if (wj1Var != null) {
            ((gme) wj1Var.c).setValue(Integer.valueOf(i2));
        }
    }

    @Override // defpackage.hq6
    public final boolean e(String str) {
        zo6.a.getClass();
        return zo6.h(str) != null;
    }

    @Override // defpackage.an0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jq6 jq6VarJ = J();
        iq6 iq6Var = iq6.a;
        boolean zI = bu8.a.i();
        ((gme) jq6VarJ.e).setValue(Boolean.valueOf(zI));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ian_main, viewGroup, false);
        int i2 = R.id.ianMainBottomNav;
        ComposeView composeView = (ComposeView) esg.a(viewInflate, R.id.ianMainBottomNav);
        if (composeView != null) {
            i2 = R.id.ianMainDialogContainer;
            ComposeView composeView2 = (ComposeView) esg.a(viewInflate, R.id.ianMainDialogContainer);
            if (composeView2 != null) {
                i2 = R.id.ianMainHamburgerMenu;
                ComposeView composeView3 = (ComposeView) esg.a(viewInflate, R.id.ianMainHamburgerMenu);
                if (composeView3 != null) {
                    i2 = R.id.ianMainTopBanner;
                    ComposeView composeView4 = (ComposeView) esg.a(viewInflate, R.id.ianMainTopBanner);
                    if (composeView4 != null) {
                        i2 = R.id.ianMainViewPager;
                        ViewPager2 viewPager2 = (ViewPager2) esg.a(viewInflate, R.id.ianMainViewPager);
                        if (viewPager2 != null) {
                            i2 = R.id.proctorRefreshDialogContainer;
                            ComposeView composeView5 = (ComposeView) esg.a(viewInflate, R.id.proctorRefreshDialogContainer);
                            if (composeView5 != null) {
                                i2 = R.id.rnBottomSheetContainer;
                                FrameLayout frameLayout = (FrameLayout) esg.a(viewInflate, R.id.rnBottomSheetContainer);
                                if (frameLayout != null) {
                                    i2 = R.id.rnProfileModalOverlay;
                                    FrameLayout frameLayout2 = (FrameLayout) esg.a(viewInflate, R.id.rnProfileModalOverlay);
                                    if (frameLayout2 != null) {
                                        i2 = R.id.rnProfileModalOverlayFragmentContainer;
                                        FragmentContainerView fragmentContainerView = (FragmentContainerView) esg.a(viewInflate, R.id.rnProfileModalOverlayFragmentContainer);
                                        if (fragmentContainerView != null) {
                                            FrameLayout frameLayout3 = (FrameLayout) viewInflate;
                                            this.c0 = new dr5(frameLayout3, composeView, composeView2, composeView3, composeView4, viewPager2, composeView5, frameLayout, frameLayout2, fragmentContainerView);
                                            frameLayout3.getClass();
                                            return frameLayout3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ja.k("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ArrayList arrayList = lz2.a;
        lz2.d("IanMainFragment", "onDestroy()", false, null);
        gy1 gy1Var = this.z0;
        if (gy1Var.isAdded()) {
            gy1Var.j0 = true;
            gy1Var.close();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        J().d0 = null;
        sp6 sp6Var = this.d0;
        if (sp6Var != null) {
            dr5 dr5Var = this.c0;
            dr5Var.getClass();
            dr5Var.a.getViewTreeObserver().removeOnGlobalLayoutListener(sp6Var);
            this.d0 = null;
        }
        this.c0 = null;
        super.onDestroyView();
    }

    @Override // defpackage.iw8, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        qpd qpdVarB = pnb.B(this);
        iwc iwcVar = fwc.a;
        d2f d2fVar = c87.a;
        CookieManager.getInstance().flush();
        mhh mhhVar = ((FirebaseAnalytics) ((sf5) this.f.getValue()).c.getValue()).a;
        mhhVar.getClass();
        mhhVar.c(new lmh(mhhVar, null, "app_open", null, false));
        if (System.currentTimeMillis() > ipb.a) {
            ((fpb) pnb.B(this).a(null, iwcVar.b(fpb.class), null)).b(zob.Periodic);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IanInitialState ianInitialState;
        dqa dqaVarR;
        String strB;
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        ArrayList arrayList = lz2.a;
        int i2 = 0;
        lz2.d("IanMainFragment", "onViewCreated", false, null);
        androidx.fragment.app.g activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        dr5 dr5Var = this.c0;
        dr5Var.getClass();
        ComposeView composeView = dr5Var.e;
        kpg.a aVar = kpg.a.a;
        composeView.setViewCompositionStrategy(aVar);
        int i3 = 1;
        composeView.setContent(new ah2(106316694, new mh(this, i3), true));
        dr5 dr5Var2 = this.c0;
        dr5Var2.getClass();
        ComposeView composeView2 = dr5Var2.g;
        composeView2.setViewCompositionStrategy(aVar);
        int i4 = 2;
        composeView2.setContent(new ah2(646048471, new w91(this, i4), true));
        qpd qpdVarB = pnb.B(this);
        iwc iwcVar = fwc.a;
        com.indeed.android.jobsearch.tare.nav.a aVar2 = (com.indeed.android.jobsearch.tare.nav.a) qpdVarB.a(null, iwcVar.b(rq7.class), null);
        aVar2.c.e(getViewLifecycleOwner(), new fq6(new fp6(this, i2), i2));
        aVar2.d.e(getViewLifecycleOwner(), new fq6(new gp6(this, i2), i2));
        aVar2.f.e(getViewLifecycleOwner(), new fq6(new hp6(this, i2), i2));
        aVar2.e.e(getViewLifecycleOwner(), new fq6(new ip6(this, i2), i2));
        aVar2.V.e(getViewLifecycleOwner(), new fq6(new a3(this, 13), i2));
        aVar2.W.e(getViewLifecycleOwner(), new fq6(new q3(this, 5), i2));
        g3a<jz2<Boolean>> g3aVar = ((q1g) pnb.B(this).a(null, iwcVar.b(q1g.class), null)).a;
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        g3aVar.e(viewLifecycleOwner, new dq6(this));
        final boolean zE = ((h2g) cr8.p(h2g.class)).e();
        dr5 dr5Var3 = this.c0;
        dr5Var3.getClass();
        ComposeView composeView3 = dr5Var3.b;
        composeView3.setViewCompositionStrategy(aVar);
        composeView3.setContent(new ah2(2055069131, new Function2() { // from class: kp6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.b bVar = (androidx.compose.runtime.b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    i6c i6cVarA = ne4Var.a(h07.a);
                    final IanMainFragment ianMainFragment = this.a;
                    final boolean z2 = zE;
                    rm2.a(i6cVarA, bh2.c(-1653894901, new Function2() { // from class: lp6
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            mv4 mv4Var;
                            s25 s25Var;
                            androidx.compose.runtime.b bVar2 = (androidx.compose.runtime.b) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                Context context = (Context) bVar2.M(AndroidCompositionLocals_androidKt.b);
                                Object objV = bVar2.v();
                                b.a.C0020a c0020a = b.a.a;
                                if (objV == c0020a) {
                                    objV = r.f(Boolean.FALSE);
                                    bVar2.p(objV);
                                }
                                g4a g4aVar = (g4a) objV;
                                dd4 dd4Var2 = dd4.a;
                                ad4 ad4Var2 = dd4.n().a;
                                ad4Var2.getClass();
                                cd4.a aVar3 = cd4.a.V0;
                                int iE = ad4Var2.e(aVar3);
                                cd4.o0 o0Var = cd4.o0.a;
                                int value = o0Var.getValue();
                                final IanMainFragment ianMainFragment2 = ianMainFragment;
                                if (iE == value) {
                                    bVar2.L(682104573);
                                    Object objM = bVar2.M(r09.a);
                                    boolean zX = bVar2.x(ianMainFragment2) | bVar2.x(context);
                                    Object objV2 = bVar2.v();
                                    if (zX || objV2 == c0020a) {
                                        objV2 = new ur(ianMainFragment2, context, g4aVar);
                                        bVar2.p(objV2);
                                    }
                                    to4.b(objM, (Function1) objV2, bVar2);
                                } else {
                                    bVar2.L(656258199);
                                }
                                bVar2.F();
                                ad4 ad4Var3 = dd4.n().a;
                                ad4Var3.getClass();
                                boolean z3 = ad4Var3.e(aVar3) == o0Var.getValue() && ((Boolean) g4aVar.getValue()).booleanValue() && ianMainFragment2.J().g() == IanMainFragment.I();
                                Boolean boolValueOf = Boolean.valueOf(ianMainFragment2.J().i());
                                Integer numValueOf = Integer.valueOf(((Number) ((gme) ianMainFragment2.J().a0).getValue()).intValue());
                                xj1 xj1VarG = ianMainFragment2.J().g();
                                Boolean bool = (Boolean) ((gme) ((fj6) ianMainFragment2.q0.getValue()).b).getValue();
                                bool.getClass();
                                Object[] objArr = {boolValueOf, numValueOf, xj1VarG, bool};
                                boolean zX2 = bVar2.x(ianMainFragment2);
                                Object objV3 = bVar2.v();
                                if (zX2 || objV3 == c0020a) {
                                    objV3 = new wp6(ianMainFragment2, null);
                                    bVar2.p(objV3);
                                }
                                to4.g(objArr, (Function2) objV3, bVar2);
                                if (z3) {
                                    bVar2.L(656258199);
                                } else {
                                    bVar2.L(685767781);
                                    boolean zI = ianMainFragment2.J().i();
                                    int i5 = 9;
                                    if (((Boolean) ((gme) ianMainFragment2.J().Z).getValue()).booleanValue()) {
                                        bVar2.L(685904274);
                                        dvf dvfVarD = zd0.d(300, 0, null, 6);
                                        Object objV4 = bVar2.v();
                                        if (objV4 == c0020a) {
                                            objV4 = new kd(i5);
                                            bVar2.p(objV4);
                                        }
                                        mvf mvfVar = ku4.a;
                                        mv4Var = new mv4(new gsf((k65) null, new bke(new gv4((Function1) objV4), dvfVarD), (t12) null, (vmd) null, (LinkedHashMap) null, 61));
                                        bVar2.F();
                                    } else {
                                        bVar2.L(-254963889);
                                        bVar2.F();
                                        mv4Var = lv4.a;
                                    }
                                    mv4 mv4Var2 = mv4Var;
                                    if (((Boolean) ((gme) ianMainFragment2.J().Z).getValue()).booleanValue()) {
                                        bVar2.L(686143377);
                                        dvf dvfVarD2 = zd0.d(300, 0, null, 6);
                                        Object objV5 = bVar2.v();
                                        if (objV5 == c0020a) {
                                            objV5 = new kd(i5);
                                            bVar2.p(objV5);
                                        }
                                        mvf mvfVar2 = ku4.a;
                                        s25Var = new s25(new gsf((k65) null, new bke(new jv4((Function1) objV5), dvfVarD2), (t12) null, (vmd) null, (LinkedHashMap) null, 61));
                                        bVar2.F();
                                    } else {
                                        bVar2.L(-254956177);
                                        bVar2.F();
                                        s25Var = r25.a;
                                    }
                                    s25 s25Var2 = s25Var;
                                    final boolean z4 = z2;
                                    i.e(zI, null, mv4Var2, s25Var2, null, bh2.c(132340897, new wu5() { // from class: mp6
                                        @Override // defpackage.wu5
                                        public final Object q(Object obj5, Object obj6, Object obj7) {
                                            androidx.compose.runtime.b bVar3 = (androidx.compose.runtime.b) obj6;
                                            ((Integer) obj7).getClass();
                                            ((qd0) obj5).getClass();
                                            e eVarF = g.f(e.a.b, 1.0f);
                                            IanMainFragment ianMainFragment3 = ianMainFragment2;
                                            boolean zX3 = bVar3.x(ianMainFragment3);
                                            Object objV6 = bVar3.v();
                                            b.a.C0020a c0020a2 = b.a.a;
                                            if (zX3 || objV6 == c0020a2) {
                                                objV6 = new fp6(ianMainFragment3, 1);
                                                bVar3.p(objV6);
                                            }
                                            e eVarA = u.a(eVarF, (Function1) objV6);
                                            List list = (List) ((gme) ianMainFragment3.J().X).getValue();
                                            xj1 xj1VarG2 = ianMainFragment3.J().g();
                                            boolean zX4 = bVar3.x(ianMainFragment3);
                                            Object objV7 = bVar3.v();
                                            if (zX4 || objV7 == c0020a2) {
                                                objV7 = new gp6(ianMainFragment3, 2);
                                                bVar3.p(objV7);
                                            }
                                            vj1.a(eVarA, list, xj1VarG2, (Function1) objV7, z4, bVar3, 0);
                                            return j6g.a;
                                        }
                                    }, bVar2), bVar2, 196608, 18);
                                }
                                bVar2.F();
                            } else {
                                bVar2.D();
                            }
                            return j6g.a;
                        }
                    }, bVar), bVar, 56);
                } else {
                    bVar.D();
                }
                return j6g.a;
            }
        }, true));
        dr5 dr5Var4 = this.c0;
        dr5Var4.getClass();
        ComposeView composeView4 = dr5Var4.c;
        composeView4.setViewCompositionStrategy(aVar);
        composeView4.setContent(new ah2(-425847606, new yo0(this, 4), true));
        naa naaVar = this.t0;
        bp6 bp6Var = this.c;
        if (bundle == null) {
            ianInitialState = ((eq6) naaVar.getValue()).a;
            boolean z2 = ((eq6) naaVar.getValue()).c;
            boolean z3 = ((eq6) naaVar.getValue()).b;
            if (ianInitialState == null && z3) {
                ianInitialState = new IanInitialState(xj1.b, null, zo6.g(zo6.a.b(), gq6.MAG_ONBOARDING), 2);
            } else {
                if ((ianInitialState != null ? ianInitialState.getOverlayTarget() : null) != null) {
                    String strB2 = ianInitialState.getInitialUrl();
                    if (strB2 == null) {
                        bp6Var.getClass();
                        String str = "Invalid initial state, ignoring: " + ianInitialState;
                        lz2.b("IanLogger", str, false, new InvalidInitialStateException(str));
                    } else {
                        gxa gxaVarC = ianInitialState.getOverlayTarget();
                        int i5 = gxaVarC == null ? -1 : a.b[gxaVarC.ordinal()];
                        if (i5 == 1) {
                            P(this, strB2, z2, false, 4);
                        } else if (i5 == 2) {
                            g3a<jz2<j6g>> g3aVar2 = kqg.a;
                            lr5 lr5VarU = requireActivity().u();
                            lr5VarU.getClass();
                            kqg.a(strB2, lr5VarU, true, "deeplink");
                        } else if (i5 == 3) {
                            ri3.a.k(new jz2<>(strB2));
                        } else if (i5 == 4) {
                            Q(this);
                        } else {
                            if (i5 != 5) {
                                defpackage.l.g();
                                return;
                            }
                            rq7 rq7Var = (rq7) cr8.p(rq7.class);
                            lr5 lr5VarU2 = requireActivity().u();
                            lr5VarU2.getClass();
                            androidx.navigation.e eVarK = mh2.k(this);
                            jq7.m mVar = jq7.m.INSTANCE;
                            r97.a.getClass();
                            rq7Var.f(lr5VarU2, eVarK, mVar, r97.c(strB2));
                        }
                    }
                    ianInitialState = null;
                }
            }
        } else {
            ianInitialState = null;
        }
        xj1 xj1VarA = ianInitialState != null ? ianInitialState.getInitialTab() : null;
        if (xj1VarA != null) {
            J().m(xj1VarA);
        }
        M().i(J().g());
        ka2.h0 = new jp6(this, i2);
        dr5 dr5Var5 = this.c0;
        dr5Var5.getClass();
        this.s0 = new cp6(dr5Var5.f, this, ianInitialState);
        ((yba) pnb.B(this).a(null, iwcVar.b(yba.class), null)).a0.e(getViewLifecycleOwner(), new fq6(new rp6(this, i3), i2));
        H().k();
        H().Z.e(getViewLifecycleOwner(), new fq6(new pe0(this, 5), i2));
        dr5 dr5Var6 = this.c0;
        dr5Var6.getClass();
        ComposeView composeView5 = dr5Var6.d;
        composeView5.setViewCompositionStrategy(aVar);
        composeView5.setContent(new ah2(2135904049, new gu(i4, this, composeView5), true));
        lr5 lr5VarU3 = requireActivity().u();
        lr5VarU3.getClass();
        if (lr5VarU3.D("RNJSTBottomSheetContainer") == null) {
            ((np7) cr8.p(np7.class)).a("IanMainFragment", "adding RNJSTBottomSheetContainer...");
            e9a e9aVarA = e9a.a.a(null, null);
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("nativeContext", e9aVarA.toBundle());
            mdc mdcVar = new mdc();
            Bundle bundle3 = new Bundle();
            bundle3.putString("arg_component_name", "RNJSTBottomSheetContainer");
            bundle3.putBundle("arg_launch_options", bundle2);
            bundle3.putBoolean("arg_fabric_enabled", false);
            mdcVar.setArguments(bundle3);
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(lr5VarU3);
            aVar3.d(R.id.rnBottomSheetContainer, mdcVar, "RNJSTBottomSheetContainer", 1);
            aVar3.h(true);
            ((np7) cr8.p(np7.class)).a("IanMainFragment", "RNJSTBottomSheetContainer added");
        }
        zv8 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        u63.Y(hh1.A(viewLifecycleOwner2), null, null, new cq6(this, null), 3);
        dr5 dr5Var7 = this.c0;
        dr5Var7.getClass();
        FrameLayout frameLayout = dr5Var7.i;
        lr5 lr5VarU4 = requireActivity().u();
        lr5VarU4.getClass();
        dr5 dr5Var8 = this.c0;
        dr5Var8.getClass();
        int id = dr5Var8.j.getId();
        if (lr5VarU4.D("RNProfileModalOverlay") == null) {
            e9a e9aVarA2 = e9a.a.a(null, null);
            Bundle bundle4 = new Bundle();
            bundle4.putBundle("nativeContext", e9aVarA2.toBundle());
            ija ijaVar = new ija();
            Bundle bundle5 = new Bundle();
            bundle5.putString("arg_component_name", "RNProfileModalOverlay");
            bundle5.putBundle("arg_launch_options", bundle4);
            bundle5.putBoolean("arg_fabric_enabled", false);
            ijaVar.setArguments(bundle5);
            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(lr5VarU4);
            aVar4.e(id, ijaVar, "RNProfileModalOverlay");
            aVar4.h(true);
        }
        RNProfileModalNativeModule.Companion companion = RNProfileModalNativeModule.INSTANCE;
        oa oaVar = new oa(frameLayout, 12);
        companion.getClass();
        RNProfileModalNativeModule.onShowModalCallback = oaVar;
        RNProfileModalNativeModule.onHideModalCallback = new zh(frameLayout, 9);
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.U1) == cd4.s0.a.getValue() && ((h2g) cr8.p(h2g.class)).h()) {
            bu8 bu8Var = bu8.a;
            if (bu8Var.i() && ((Boolean) bu8.L0.a(bu8.b[49], bu8Var)).booleanValue()) {
                IanInitialState ianInitialState2 = ((eq6) naaVar.getValue()).a;
                boolean zL = (ianInitialState2 == null || (strB = ianInitialState2.getInitialUrl()) == null) ? false : zve.L(strB, "onboardingData", false);
                Function1 function1 = null;
                Log.d("IanMainFragment", "cameFromOnboarding: " + zL, null);
                if (!zL) {
                    gy1 gy1Var = this.z0;
                    gy1Var.getClass();
                    ((tp7) cr8.p(tp7.class)).b(new sp7.f(4, "coWorkerPromo", u63.Z("coWorker"), function1));
                    i1g i1gVar = (i1g) cr8.p(i1g.class);
                    lr5 lr5VarU5 = requireActivity().u();
                    lr5VarU5.getClass();
                    i1gVar.a(lr5VarU5, gy1Var);
                }
            }
        }
        J().d0 = this;
        androidx.fragment.app.g activity2 = getActivity();
        if (activity2 != null && (dqaVarR = activity2.r()) != null) {
            zv8 viewLifecycleOwner3 = getViewLifecycleOwner();
            viewLifecycleOwner3.getClass();
            dqaVarR.a(viewLifecycleOwner3, new b());
        }
        ((w1g) this.a0.getValue()).g().e(getViewLifecycleOwner(), new fq6(new gp6(this, 1), 0));
        bp6Var.getClass();
        String str2 = "ian-main-screen";
        int i6 = 6;
        q6.n("ian-main-screen", null, null, 6, (tp7) cr8.p(tp7.class));
        if (zof.a.b()) {
            yof yofVar = (yof) this.V.getValue();
            yofVar.getClass();
            Lazy<s87> lazy = s87.f;
            s87.a.a((gz4) yofVar.a.getValue(), tx5.g(yofVar.b, "tos-update-banner", new ux4(str2, 7), 2));
            ((gme) ((apf) this.n0.getValue()).b).setValue(Boolean.TRUE);
        }
        new flf(new hr(view, i6)).start();
        ((pk3) pnb.B(this).a(null, iwcVar.b(pk3.class), null)).c.e(this, new yp6(this));
        J().c0.e(this, new zp6(this));
        J().d.e(getViewLifecycleOwner(), new fq6(new na0(this, 8), 0));
        u63.Y(hh1.A(this), null, null, new tp6(this, null), 3);
        zv8 viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        u63.Y(hh1.A(viewLifecycleOwner4), null, null, new up6(this, null), 3);
        if (Build.VERSION.SDK_INT >= 33) {
            zv8 viewLifecycleOwner5 = getViewLifecycleOwner();
            viewLifecycleOwner5.getClass();
            u63.Y(hh1.A(viewLifecycleOwner5), null, null, new vp6(this, null), 3);
        }
    }
}
