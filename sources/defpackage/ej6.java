package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.util.AppStartupTimes;
import defpackage.cd4;
import defpackage.e9a;
import defpackage.grg;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lej6;", "Lqj6;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ej6 extends qj6 {
    public String s0 = zo6.a.b();
    public long t0 = -1;
    public final frg u0 = os5.a(this, fwc.a.b(fj6.class), new a(this), new b(this), new c(this));

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ej6 ej6Var) {
            super(0);
            this.$this_activityViewModels = ej6Var;
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
        public b(ej6 ej6Var) {
            super(0);
            this.$this_activityViewModels = ej6Var;
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
        public c(ej6 ej6Var) {
            super(0);
            this.$this_activityViewModels = ej6Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    @Override // defpackage.qj6, defpackage.p91
    /* JADX INFO: renamed from: N */
    public final String getQ0() {
        zo6.a.getClass();
        return zo6.e;
    }

    @Override // defpackage.p91
    public final void S() {
        ArrayList arrayList = lz2.a;
        lz2.d("HomeTabReactNativeWebViewFragment", "invalidate", false, null);
        i0();
        super.S();
    }

    @Override // defpackage.p91
    public final void T() {
        ArrayList arrayList = lz2.a;
        lz2.d("HomeTabReactNativeWebViewFragment", "loadOrReloadIfNecessary", false, null);
        long j = this.t0;
        if (j == -1 || System.currentTimeMillis() - j <= 1800000) {
            return;
        }
        i0();
    }

    @Override // defpackage.p91
    public final void U(String str, boolean z, boolean z2) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("HomeTabReactNativeWebViewFragment", "loadUrl: url=" + str + " clearHistory=" + z, false, null);
        if (g0(str)) {
            super.U("about:blank", true, true);
            if (str.equals(getQ0())) {
                this.s0 = zo6.a.b();
                i0();
                return;
            } else {
                if (str.equals("about:blank")) {
                    return;
                }
                r97.a.getClass();
                if ((r97.h(str) || r97.y(str)) && !str.equals(this.s0)) {
                    this.s0 = str;
                    i0();
                    return;
                }
                return;
            }
        }
        r97.a.getClass();
        if (r97.l(str)) {
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            if (ad4Var.e(cd4.a.d2) == cd4.m2.a.getValue()) {
                c0().i(true);
                Log.d("HomeTabReactNativeWebViewFragment", "tryInitRnSerpFragment", null);
                Fragment fragmentD = getChildFragmentManager().D("RNSerpFragment");
                String strE = ep5.a.e();
                String strA = dd4Var.a();
                Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
                builderBuildUpon.appendQueryParameter("json", "1");
                j6g j6gVar = j6g.a;
                String string = builderBuildUpon.toString();
                string.getClass();
                dhc dhcVar = new dhc();
                Bundle bundleE = l6.e("arg_component_name", "Serp");
                bundleE.putBundle("arg_launch_options", aq1.a(new Pair("nativeContext", e9a.a.a(strE, strA).toBundle()), new Pair("serpUrl", string)));
                bundleE.putBoolean("arg_fabric_enabled", false);
                dhcVar.setArguments(bundleE);
                if (fragmentD == null) {
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    aVar.d(R.id.rn_serp_fragment, dhcVar, "RnHomePageFragment", 1);
                    aVar.h(false);
                } else if (fragmentD instanceof eed) {
                    FragmentManager childFragmentManager2 = getChildFragmentManager();
                    childFragmentManager2.getClass();
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager2);
                    aVar2.e(R.id.rn_serp_fragment, dhcVar, "RnHomePageFragment");
                    aVar2.h(false);
                }
                M().l.setVisibility(8);
                M().i.setVisibility(8);
                M().k.setVisibility(0);
                return;
            }
        }
        super.U(str, z, true);
    }

    @Override // defpackage.p91
    public final void V() {
        super.V();
        if (dmc.l()) {
            d0().k(true, true);
        }
    }

    @Override // defpackage.p91
    public final void W(gq6 gq6Var) {
        ArrayList arrayList = lz2.a;
        lz2.d("HomeTabReactNativeWebViewFragment", "resetToHomeState", false, null);
        U(getQ0(), true, true);
    }

    @Override // defpackage.qj6, defpackage.p91
    public final void a0() {
        String strB = G().b();
        if (strB == null) {
            strB = getQ0();
        }
        boolean zG0 = g0(strB);
        boolean z = zG0 || G().e() || G().f();
        if (G().f()) {
            c0().i(true);
        } else {
            c0().i(false);
        }
        if (z) {
            c0().h(false);
        } else {
            c0().h(true);
        }
        if (zG0) {
            h0();
        } else {
            f0();
        }
    }

    public final void f0() {
        ArrayList arrayList = lz2.a;
        Log.d("HomeTabReactNativeWebViewFragment", "hideRnHomepage", null);
        M().l.setVisibility(0);
        M().i.setVisibility(8);
        ((gme) ((fj6) this.u0.getValue()).b).setValue(Boolean.FALSE);
        if (dmc.l()) {
            d0().k(true, true);
        }
    }

    public final boolean g0(String str) {
        if (wl7.b(str, getQ0()) || wl7.b(str, "about:blank")) {
            return true;
        }
        r97.a.getClass();
        return r97.h(str) || r97.y(str);
    }

    public final void h0() {
        ArrayList arrayList = lz2.a;
        Log.d("HomeTabReactNativeWebViewFragment", "showRnHomepage", null);
        M().l.setVisibility(8);
        M().k.setVisibility(8);
        M().i.setVisibility(0);
        ((gme) ((fj6) this.u0.getValue()).b).setValue(Boolean.TRUE);
    }

    public final void i0() {
        ArrayList arrayList = lz2.a;
        Log.d("HomeTabReactNativeWebViewFragment", "tryInitRnHomepageFragment: currentHomepageUrl=" + this.s0, null);
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        AppStartupTimes.a("initRnHomepageFragmentStart");
        Fragment fragmentD = getChildFragmentManager().D("RnHomePageFragment");
        oud oudVar = ((h2g) cr8.p(h2g.class)).a() ? oud.VISIBLE : oud.HIDDEN;
        String strE = ep5.a.e();
        String strA = dd4.a.a();
        String str = this.s0;
        String strA2 = oudVar.a();
        str.getClass();
        strA2.getClass();
        eed eedVar = new eed();
        Bundle bundleE = l6.e("arg_component_name", "HomePage");
        bundleE.putBundle("arg_launch_options", aq1.a(new Pair("nativeContext", e9a.a.a(strE, strA).toBundle()), new Pair("homepageUrl", str), new Pair("searchTabVisibilityStatus", strA2)));
        bundleE.putBoolean("arg_fabric_enabled", false);
        eedVar.setArguments(bundleE);
        if (fragmentD == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
            aVar.d(R.id.rn_homepage_fragment, eedVar, "RnHomePageFragment", 1);
            aVar.h(false);
            this.t0 = System.currentTimeMillis();
            return;
        }
        if (fragmentD instanceof eed) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            childFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager2);
            aVar2.e(R.id.rn_homepage_fragment, eedVar, "RnHomePageFragment");
            aVar2.h(false);
            this.t0 = System.currentTimeMillis();
        }
    }

    @Override // defpackage.qj6, defpackage.p91, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("HomeTabReactNativeWebViewFragment", "onViewCreated()", false, null);
        super.onViewCreated(view, bundle);
        h0();
        if (P() != null) {
            String strP = P();
            strP.getClass();
            if (!g0(strP)) {
                f0();
                return;
            }
        }
        if (P() != null) {
            String strP2 = P();
            strP2.getClass();
            if (g0(strP2)) {
                String strP3 = P();
                strP3.getClass();
                U(strP3, true, true);
                return;
            }
        }
        W(gq6.HOME);
    }
}
