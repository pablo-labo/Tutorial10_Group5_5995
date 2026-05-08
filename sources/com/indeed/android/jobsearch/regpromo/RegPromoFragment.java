package com.indeed.android.jobsearch.regpromo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import defpackage.a9c;
import defpackage.ad4;
import defpackage.ah2;
import defpackage.ai8;
import defpackage.an0;
import defpackage.b87;
import defpackage.boa;
import defpackage.c87;
import defpackage.cd4;
import defpackage.cr8;
import defpackage.d2f;
import defpackage.d93;
import defpackage.dd4;
import defpackage.ez2;
import defpackage.fk0;
import defpackage.fwc;
import defpackage.g00;
import defpackage.gu5;
import defpackage.gxa;
import defpackage.gz4;
import defpackage.hh1;
import defpackage.irg;
import defpackage.jrg;
import defpackage.kq7;
import defpackage.le;
import defpackage.lz2;
import defpackage.m99;
import defpackage.mh2;
import defpackage.mj8;
import defpackage.nj;
import defpackage.oe;
import defpackage.p63;
import defpackage.p66;
import defpackage.pnb;
import defpackage.pxc;
import defpackage.q6;
import defpackage.qpd;
import defpackage.qr;
import defpackage.qt8;
import defpackage.s87;
import defpackage.sra;
import defpackage.tp7;
import defpackage.tx5;
import defpackage.u63;
import defpackage.vh8;
import defpackage.xh;
import defpackage.xh8;
import defpackage.ywc;
import defpackage.z0;
import defpackage.zee;
import defpackage.zh;
import defpackage.zo6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jobsearch/regpromo/RegPromoFragment;", "Lan0;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RegPromoFragment extends an0 implements xh8 {
    public final String V;
    public final z0 W;
    public final fk0 X;
    public final le Y;
    public final qr Z;
    public final Lazy a;
    public final xh a0;
    public final Lazy b;
    public final oe b0;
    public final Lazy c;
    public final zh c0;
    public final Lazy d;
    public final nj d0;
    public final tx5 e;
    public final Lazy f;

    public static final class a extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RegPromoFragment regPromoFragment) {
            super(0);
            this.$this_activityViewModel = regPromoFragment;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class b extends mj8 implements gu5<m99> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RegPromoFragment regPromoFragment, a aVar) {
            super(0);
            this.$this_activityViewModel = regPromoFragment;
            this.$ownerProducer = aVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, m99] */
        @Override // defpackage.gu5
        public final m99 invoke() {
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
            return p66.a(fwc.a.b(m99.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class c extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RegPromoFragment regPromoFragment) {
            super(0);
            this.$this_activityViewModel = regPromoFragment;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class d extends mj8 implements gu5<zee> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RegPromoFragment regPromoFragment, c cVar) {
            super(0);
            this.$this_activityViewModel = regPromoFragment;
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

    public static final class e extends mj8 implements gu5<sra> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RegPromoFragment regPromoFragment) {
            super(0);
            this.$this_inject = regPromoFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, sra] */
        @Override // defpackage.gu5
        public final sra invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(sra.class), a9cVar);
        }
    }

    public static final class f extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RegPromoFragment regPromoFragment) {
            super(0);
            this.$this_inject = regPromoFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class g extends mj8 implements gu5<g00> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(RegPromoFragment regPromoFragment) {
            super(0);
            this.$this_inject = regPromoFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [g00, java.lang.Object] */
        @Override // defpackage.gu5
        public final g00 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(g00.class), a9cVar);
        }
    }

    public RegPromoFragment() {
        b bVar = new b(this, new a(this));
        qt8 qt8Var = qt8.c;
        this.a = boa.E(qt8Var, bVar);
        this.b = boa.E(qt8Var, new d(this, new c(this)));
        e eVar = new e(this);
        qt8 qt8Var2 = qt8.a;
        this.c = boa.E(qt8Var2, eVar);
        this.d = boa.E(qt8Var2, new f(this));
        this.e = new tx5();
        this.f = boa.E(qt8Var2, new g(this));
        this.V = d93.g();
        this.W = new z0(this, 18);
        int i = 15;
        this.X = new fk0(this, i);
        this.Y = new le(this, i);
        this.Z = new qr(this, 17);
        this.a0 = new xh(this, i);
        this.b0 = new oe(this, 17);
        int i2 = 21;
        this.c0 = new zh(this, i2);
        this.d0 = new nj(this, i2);
    }

    public final void E(String str) {
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.d.getValue(), tx5.k(this.e, "reg-promo-native", str, null, 12));
    }

    public final void F(String str, boolean z) {
        Lazy lazy = this.a;
        ((m99) lazy.getValue()).b0.j(Boolean.TRUE);
        if (z) {
            ((zee) this.b.getValue()).b = true;
        }
        ArrayList arrayList = lz2.a;
        lz2.d("reg-promo-native", "Loading Home tab in the background with bltk", false, null);
        zo6 zo6Var = zo6.a;
        zo6Var.getClass();
        zo6.f();
        lz2.d("reg-promo-native", "Loading Home tab in the background with bltk:".concat(zo6Var.b()), false, null);
        m99 m99Var = (m99) lazy.getValue();
        androidx.navigation.e eVarK = mh2.k(this);
        m99Var.getClass();
        eVarK.getClass();
        m99Var.g("bottom_nav -> FSDV url");
        m99Var.j("bottom_nav");
        lz2.d("MaingraphViewModel", "@@navigate decision: bottom_nav", false, null);
        Serializable ianInitialState = new IanInitialState(null, gxa.a, str, 1);
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
            bundle.putParcelable("initialState", (Parcelable) ianInitialState);
        } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
            bundle.putSerializable("initialState", ianInitialState);
        }
        bundle.putBoolean("fromOnboarding", false);
        bundle.putBoolean("fromRegPromo", true);
        eVarK.n(R.id.navActionDirectlyBottomNav, bundle);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        dd4 dd4Var = dd4.a;
        if (dd4.c()) {
            d2f d2fVar = c87.a;
            c87.a.d(ez2.Y, "1");
        } else {
            pxc pxcVar = b87.a;
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.getClass();
            b87.g(cookieManager, d93.g(), "appSignIn", "1");
        }
        if (bundle == null) {
            q6.n("reg-promo-native", null, null, 6, (tp7) cr8.p(tp7.class));
        }
        ((sra) this.c.getValue()).getClass();
        if (cr8.o()) {
            ((kq7) cr8.p(kq7.class)).e("Onboarding", "EligibleWhenSawRegPromo", true);
        }
        ((zee) this.b.getValue()).c = true;
        final boolean z = getResources().getInteger(R.integer.regpromo_claims_visibility) == 0;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(512487583, new Function2() { // from class: wwc
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var2 = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    i6c i6cVarA = ne4Var.a(h07.a);
                    final RegPromoFragment regPromoFragment = this.a;
                    final boolean z2 = z;
                    rm2.a(i6cVarA, bh2.c(586183647, new Function2() { // from class: xwc
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
                        @Override // kotlin.jvm.functions.Function2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) {
                            /*
                                Method dump skipped, instruction units count: 310
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.xwc.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, bVar), bVar, 56);
                } else {
                    bVar.D();
                }
                return j6g.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        String upperCase = d93.a().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (upperCase.equals("JP")) {
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            if (ad4Var.e(cd4.a.R0) == cd4.d3.a.getValue()) {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                if ((contextRequireContext.getResources().getConfiguration().screenLayout & 15) < 3) {
                    requireActivity().setRequestedOrientation(2);
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    ((m99) this.a.getValue()).e0 = false;
                    requireActivity().findViewById(R.id.app_container).requestApplyInsets();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        String upperCase = d93.a().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (upperCase.equals("JP")) {
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            if (ad4Var.e(cd4.a.R0) == cd4.d3.a.getValue()) {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                if ((contextRequireContext.getResources().getConfiguration().screenLayout & 15) < 3) {
                    requireActivity().setRequestedOrientation(1);
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    ((m99) this.a.getValue()).e0 = true;
                    requireActivity().findViewById(R.id.app_container).requestApplyInsets();
                }
            }
        }
        u63.Y(hh1.A(this), null, null, new ywc(this, null), 3);
    }
}
