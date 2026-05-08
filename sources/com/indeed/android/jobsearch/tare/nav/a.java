package com.indeed.android.jobsearch.tare.nav;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n;
import androidx.navigation.e;
import androidx.navigation.k;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.indeed.android.jobsearch.BuildConfig;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jobsearch.tare.nav.a;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import com.indeed.android.jsmappservices.bridge.ModalPresentationMode;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebviewData;
import com.indeed.android.rnpathfinder.RNPathfinderFragment;
import com.wlappdebug.r;
import defpackage.a32;
import defpackage.a74;
import defpackage.aq0;
import defpackage.aq3;
import defpackage.awe;
import defpackage.bca;
import defpackage.bg;
import defpackage.boa;
import defpackage.c1f;
import defpackage.cl3;
import defpackage.cr7;
import defpackage.cr8;
import defpackage.d93;
import defpackage.dd4;
import defpackage.dh;
import defpackage.dr7;
import defpackage.e13;
import defpackage.e87;
import defpackage.ela;
import defpackage.ep5;
import defpackage.ep7;
import defpackage.eq0;
import defpackage.eq3;
import defpackage.er7;
import defpackage.f13;
import defpackage.g3a;
import defpackage.goa;
import defpackage.gu5;
import defpackage.gx;
import defpackage.h2g;
import defpackage.h57;
import defpackage.huc;
import defpackage.i6a;
import defpackage.j30;
import defpackage.j6g;
import defpackage.jq7;
import defpackage.jt7;
import defpackage.jz2;
import defpackage.k7f;
import defpackage.k89;
import defpackage.kbc;
import defpackage.kl4;
import defpackage.kqg;
import defpackage.kt7;
import defpackage.ky;
import defpackage.l;
import defpackage.l5;
import defpackage.lr5;
import defpackage.lu2;
import defpackage.luc;
import defpackage.lz2;
import defpackage.m89;
import defpackage.ms7;
import defpackage.mt7;
import defpackage.np7;
import defpackage.nq7;
import defpackage.nw0;
import defpackage.oq7;
import defpackage.p87;
import defpackage.pa0;
import defpackage.pgd;
import defpackage.pi;
import defpackage.q97;
import defpackage.qe;
import defpackage.qk4;
import defpackage.qq7;
import defpackage.qr;
import defpackage.qt8;
import defpackage.qv;
import defpackage.r6;
import defpackage.r7d;
import defpackage.r97;
import defpackage.rq7;
import defpackage.rr;
import defpackage.ry;
import defpackage.s71;
import defpackage.sq7;
import defpackage.t40;
import defpackage.tdc;
import defpackage.ti;
import defpackage.u63;
import defpackage.uh3;
import defpackage.ut0;
import defpackage.vg;
import defpackage.vh8;
import defpackage.w7a;
import defpackage.w93;
import defpackage.wa;
import defpackage.web;
import defpackage.x7a;
import defpackage.x9;
import defpackage.xdc;
import defpackage.xh8;
import defpackage.xj1;
import defpackage.xnd;
import defpackage.y03;
import defpackage.yba;
import defpackage.ygg;
import defpackage.yhg;
import defpackage.yq7;
import defpackage.z3;
import defpackage.z92;
import defpackage.zba;
import defpackage.zq7;
import defpackage.zve;
import defpackage.zwc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements rq7, xh8 {
    public final g3a<jz2<String>> V;
    public final g3a<jz2<String>> W;
    public final Lazy X;
    public final Set<String> Y;
    public final y03 a;
    public final Lazy b;
    public final g3a<jz2<String>> c;
    public final g3a<jz2<xj1>> d;
    public final g3a<jz2<String>> e;
    public final g3a<jz2<String>> f;

    /* JADX INFO: renamed from: com.indeed.android.jobsearch.tare.nav.a$a, reason: collision with other inner class name */
    public static final class C0169a implements goa<jz2<? extends j6g>> {
        public final /* synthetic */ jz2<j6g> a;
        public final /* synthetic */ nq7<?> b;

        public C0169a(jz2<j6g> jz2Var, nq7<?> nq7Var) {
            this.a = jz2Var;
            this.b = nq7Var;
        }

        @Override // defpackage.goa
        public final void d(jz2<? extends j6g> jz2Var) {
            jz2<? extends j6g> jz2Var2 = jz2Var;
            jz2Var2.getClass();
            if (jz2Var2 != this.a) {
                tdc tdcVar = ((nq7.k) this.b).b;
                aq3.a aVar = aq3.Companion;
                tdcVar.invoke(new oq7.l());
                kqg.b.i(this);
            }
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.tare.nav.JSTNavigatorImpl$openModal$jsonCallback$1$1", f = "JSTNavigatorImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $bottomSheetTag;
        final /* synthetic */ Function1<oq7.j, j6g> $callback;
        final /* synthetic */ huc $callbackTriggered;
        final /* synthetic */ FragmentManager $fragmentManager;
        final /* synthetic */ xnd $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(huc hucVar, FragmentManager fragmentManager, String str, Function1<? super oq7.j, j6g> function1, xnd xndVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$callbackTriggered = hucVar;
            this.$fragmentManager = fragmentManager;
            this.$bottomSheetTag = str;
            this.$callback = function1;
            this.$result = xndVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$callbackTriggered, this.$fragmentManager, this.$bottomSheetTag, this.$callback, this.$result, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$callbackTriggered.element = true;
            try {
                Fragment fragmentD = this.$fragmentManager.D(this.$bottomSheetTag);
                kbc kbcVar = fragmentD instanceof kbc ? (kbc) fragmentD : null;
                if (kbcVar != null) {
                    kbcVar.E();
                }
            } catch (Exception e) {
                ((np7) cr8.p(np7.class)).c("JSTNavigatorImpl", l5.l("Error dismissing schedule apply onboarding: ", e.getMessage()), false, e);
            }
            this.$callback.invoke(new oq7.j(this.$result));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.tare.nav.JSTNavigatorImpl$runOnMainThread$1", f = "JSTNavigatorImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $work;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(gu5<j6g> gu5Var, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$work = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$work, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$work.invoke();
            return j6g.a;
        }
    }

    public a(int i) {
        eq3 eq3Var = a74.a;
        k89 k89Var = m89.a;
        k89Var.getClass();
        this.a = k89Var;
        cr7 cr7Var = new cr7(this);
        qt8 qt8Var = qt8.a;
        this.b = boa.E(qt8Var, cr7Var);
        this.c = new g3a<>();
        this.d = new g3a<>();
        this.e = new g3a<>();
        this.f = new g3a<>();
        this.V = new g3a<>();
        this.W = new g3a<>();
        this.X = boa.E(qt8Var, new dr7(this));
        this.Y = ut0.I0(new String[]{"from", "tk"});
    }

    @Override // defpackage.rq7
    public final void a(er7 er7Var, FragmentManager fragmentManager, String str, String str2, Function1 function1) {
        fragmentManager.getClass();
        n(new w93(er7Var, str, str2, fragmentManager, function1, this));
    }

    @Override // defpackage.rq7
    public final void b(lr5 lr5Var, Function1 function1) {
        n(new ti(lr5Var, function1, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0274, code lost:
    
        if (defpackage.wve.K(r3, r4, false) != false) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    @Override // defpackage.rq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.fragment.app.FragmentManager r16, defpackage.nq7<?> r17, java.lang.String r18) throws com.indeed.android.jobsearch.tare.nav.JSTNavigationException {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.jobsearch.tare.nav.a.c(androidx.fragment.app.FragmentManager, nq7, java.lang.String):void");
    }

    @Override // defpackage.rq7
    public final void e(lr5 lr5Var, String str, vg vgVar) {
        str.getClass();
        n(new nw0(lr5Var, str, this, vgVar));
    }

    @Override // defpackage.rq7
    public final void f(FragmentManager fragmentManager, e eVar, jq7 jq7Var, String str) throws Exception {
        String str2;
        Object obj;
        final Context context;
        String strA;
        String host;
        View view;
        LinkedHashMap linkedHashMap;
        fragmentManager.getClass();
        n nVar = fragmentManager.c;
        eVar.getClass();
        jq7Var.getClass();
        int i = 2;
        if (jq7Var instanceof jq7.i) {
            eVar.A(R.navigation.navigation_main);
            q97 q97Var = new q97();
            Map<String, String> map = ((jq7.i) jq7Var).b;
            if (map == null) {
                linkedHashMap = null;
            } else {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String lowerCase = entry.getKey().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (!this.Y.contains(lowerCase)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            n(new cl3(i, eVar, q97.b(((p87) q97Var.a.getValue()).h(), str, linkedHashMap), this));
            return;
        }
        int i2 = 0;
        if (jq7Var instanceof jq7.a0) {
            eVar.A(R.navigation.navigation_main);
            mt7 mt7Var = ((jq7.a0) jq7Var).b;
            if (!(mt7Var instanceof mt7.b)) {
                throw new ela("An operation is not implemented: navToSerp(JSTSerpTarget.Url) is not implemented");
            }
            String str3 = ((mt7.b) mt7Var).b;
            if (((h2g) cr8.p(h2g.class)).a()) {
                n(new yq7(i2, eVar, str3, this));
                return;
            } else {
                n(new cl3(i, eVar, str3, this));
                return;
            }
        }
        boolean z = jq7Var instanceof jq7.q;
        g3a<jz2<xj1>> g3aVar = this.d;
        if (z) {
            eVar.A(R.navigation.navigation_main);
            k kVarI = eVar.i();
            xj1 xj1Var = xj1.c;
            if (kVarI != null && kVarI.W == R.id.ianMainFragment) {
                g3aVar.k(new jz2<>(xj1Var));
                return;
            }
            Serializable ianInitialState = new IanInitialState(xj1Var, null, null, 2);
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
                bundle.putParcelable("initialState", (Parcelable) ianInitialState);
            } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
                bundle.putSerializable("initialState", ianInitialState);
            }
            bundle.putBoolean("fromOnboarding", false);
            bundle.putBoolean("fromRegPromo", false);
            eVar.n(R.id.navActionDirectlyBottomNav, bundle);
            return;
        }
        if (jq7Var instanceof jq7.a) {
            eVar.A(R.navigation.navigation_main);
            k kVarI2 = eVar.i();
            xj1 xj1Var2 = xj1.W;
            if (kVarI2 != null && kVarI2.W == R.id.ianMainFragment) {
                g3aVar.k(new jz2<>(xj1Var2));
                return;
            }
            Serializable ianInitialState2 = new IanInitialState(xj1Var2, null, null, 2);
            Bundle bundle2 = new Bundle();
            if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
                bundle2.putParcelable("initialState", (Parcelable) ianInitialState2);
            } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
                bundle2.putSerializable("initialState", ianInitialState2);
            }
            bundle2.putBoolean("fromOnboarding", false);
            bundle2.putBoolean("fromRegPromo", false);
            eVar.n(R.id.navActionDirectlyBottomNav, bundle2);
            return;
        }
        if (jq7Var instanceof jq7.o) {
            eVar.A(R.navigation.navigation_main);
            k kVarI3 = eVar.i();
            xj1 xj1Var3 = xj1.d;
            if (kVarI3 != null && kVarI3.W == R.id.ianMainFragment) {
                g3aVar.k(new jz2<>(xj1Var3));
                return;
            }
            Serializable ianInitialState3 = new IanInitialState(xj1Var3, null, null, 2);
            Bundle bundle3 = new Bundle();
            if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
                bundle3.putParcelable("initialState", (Parcelable) ianInitialState3);
            } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
                bundle3.putSerializable("initialState", ianInitialState3);
            }
            bundle3.putBoolean("fromOnboarding", false);
            bundle3.putBoolean("fromRegPromo", false);
            eVar.n(R.id.navActionDirectlyBottomNav, bundle3);
            return;
        }
        if (jq7Var instanceof jq7.u) {
            eVar.A(R.navigation.navigation_main);
            k kVarI4 = eVar.i();
            xj1 xj1Var4 = xj1.e;
            if (kVarI4 != null && kVarI4.W == R.id.ianMainFragment) {
                g3aVar.k(new jz2<>(xj1Var4));
                return;
            }
            Serializable ianInitialState4 = new IanInitialState(xj1Var4, null, null, 2);
            Bundle bundle4 = new Bundle();
            if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
                bundle4.putParcelable("initialState", (Parcelable) ianInitialState4);
            } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
                bundle4.putSerializable("initialState", ianInitialState4);
            }
            bundle4.putBoolean("fromOnboarding", false);
            bundle4.putBoolean("fromRegPromo", false);
            eVar.n(R.id.navActionDirectlyBottomNav, bundle4);
            return;
        }
        int i3 = 4;
        int i4 = 1;
        if (jq7Var instanceof jq7.s) {
            String str4 = ((jq7.s) jq7Var).b;
            new q97();
            String strM = "https://pathfinder.indeed.com/";
            if (str4 != null && !zve.U(str4)) {
                strM = z3.m(zve.u0("https://pathfinder.indeed.com/", '/'), "/", zve.v0(str4, '/'));
            }
            new q97();
            RNPathfinderFragment rNPathfinderFragmentCreateInstance = RNPathfinderFragment.INSTANCE.createInstance(ep5.a.e(), dd4.a.a(), q97.b(strM, str, null), null);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            web.E(fragmentManager, aVar, RNPathfinderFragment.FRAGMENT_NAME_TAG, null);
            aVar.d(R.id.app_container, rNPathfinderFragmentCreateInstance, RNPathfinderFragment.FRAGMENT_NAME_TAG, 1);
            aVar.h(true);
            for (Fragment fragment : nVar.f()) {
                if (fragment != rNPathfinderFragmentCreateInstance && (view = fragment.getView()) != null) {
                    view.setVisibility(4);
                }
            }
            return;
        }
        if (jq7Var instanceof jq7.c) {
            jq7.c cVar = (jq7.c) jq7Var;
            l(fragmentManager, eVar, null, cVar.b, cVar.c, str);
            return;
        }
        if (jq7Var instanceof jq7.b) {
            jq7.b bVar = (jq7.b) jq7Var;
            l(fragmentManager, eVar, bVar.b, bVar.c, bVar.d, str);
            return;
        }
        int i5 = 3;
        int i6 = 6;
        if (jq7Var instanceof jq7.e0) {
            jq7.n nVar2 = ((jq7.e0) jq7Var).b;
            if (nVar2 instanceof jq7.n.b) {
                strA = new q97().a(((jq7.n.b) nVar2).b, str);
            } else {
                if (!(nVar2 instanceof jq7.n.c)) {
                    l.g();
                    return;
                }
                strA = ((jq7.n.c) nVar2).b;
            }
            r97.a.getClass();
            if (!r97.k(strA)) {
                if (!((r97.j(strA) && (host = Uri.parse(strA).getHost()) != null) ? r97.p0.contains(host) : false)) {
                    if (r97.m(strA)) {
                        n(new eq0(i4, strA, fragmentManager, str));
                        return;
                    } else {
                        ((np7) cr8.p(np7.class)).c("JSTNavigatorImpl", l5.m("Invalid ViewJob url '", strA.length() > 40 ? awe.A0(40, strA).concat("...") : strA, "', handling in FSDV WebView"), false, new JSTNavigationException("Invalid ViewJob url: navigateTo JSTLandingScreen.ViewJob must be a ViewJob url"));
                        n(new gx(i6, strA, fragmentManager));
                        return;
                    }
                }
            }
            n(new s71(i5, strA, fragmentManager));
            return;
        }
        int i7 = 9;
        if (jq7Var instanceof jq7.f0) {
            jq7.f0 f0Var = (jq7.f0) jq7Var;
            String str5 = f0Var.d;
            r97.a.getClass();
            if (!r97.m(str5)) {
                throw new JSTNavigationException("navigateTo ViewJobFeed must be a viewjob url");
            }
            n(new rr(i7, f0Var, fragmentManager));
            return;
        }
        if (jq7Var instanceof jq7.d0) {
            new q97();
            n(new aq0(i3, q97.b("https://secure.indeed.com/account/changeemail", str, ((jq7.d0) jq7Var).b), fragmentManager));
            return;
        }
        if (jq7Var instanceof jq7.v) {
            String strK = t40.k(zve.u0("https://profile.indeed.com/", '/'), "/exclusions");
            Map<String, String> map2 = ((jq7.v) jq7Var).b;
            LinkedHashMap linkedHashMap2 = map2 != null ? new LinkedHashMap(map2) : new LinkedHashMap();
            linkedHashMap2.put("co", ((ep7) cr8.p(ep7.class)).b().a);
            linkedHashMap2.put("hl", ((ep7) cr8.p(ep7.class)).b().b);
            linkedHashMap2.put(SessionEndedMetric.PROCESS_TYPE_VALUE, "{277.1,Android");
            new q97();
            n(new ry(8, q97.b(strK, str, linkedHashMap2), fragmentManager));
            return;
        }
        if (jq7Var instanceof jq7.k) {
            new q97();
            n(new pi(i6, q97.b("https://www.indeed.com/career-services/resume-help/instant-report", str, ((jq7.k) jq7Var).b), fragmentManager));
            return;
        }
        int i8 = 5;
        if (jq7Var instanceof jq7.h) {
            String str6 = ((jq7.h) jq7Var).b;
            r97.a.getClass();
            if (r97.j(str6)) {
                n(new qv(i8, str6, fragmentManager));
                return;
            }
            List<Fragment> listF = nVar.f();
            listF.getClass();
            Fragment fragment2 = (Fragment) z92.Q0(listF);
            Context context2 = fragment2 != null ? fragment2.getContext() : null;
            if (context2 != null) {
                k(context2, str6, null, null, null, null, null);
                return;
            } else {
                DetachedFragmentException detachedFragmentException = new DetachedFragmentException();
                ((np7) cr8.p(np7.class)).c("JSTNavigatorImpl", "launchExternalActivity error", false, detachedFragmentException);
                throw detachedFragmentException;
            }
        }
        boolean z2 = jq7Var instanceof jq7.c0;
        Lazy lazy = this.b;
        if (z2) {
            String string = null;
            for (zba zbaVar : ((yba) lazy.getValue()).d) {
                if (zbaVar.a == bca.c0) {
                    string = zbaVar.b;
                }
            }
            if (string == null) {
                Uri.Builder builderBuildUpon = Uri.parse(d93.c()).buildUpon();
                builderBuildUpon.path("legal");
                builderBuildUpon.appendQueryParameter("hl", d93.e());
                string = builderBuildUpon.toString();
            }
            m(fragmentManager, string, str);
            return;
        }
        if (jq7Var instanceof jq7.t) {
            String strA2 = null;
            for (zba zbaVar2 : ((yba) lazy.getValue()).d) {
                if (zbaVar2.a == bca.b0) {
                    strA2 = zbaVar2.b;
                }
            }
            if (strA2 == null) {
                strA2 = zwc.a("privacypolicy");
            }
            m(fragmentManager, strA2, str);
            return;
        }
        if (jq7Var instanceof jq7.d) {
            String string2 = null;
            for (zba zbaVar3 : ((yba) lazy.getValue()).d) {
                if (zbaVar3.a == bca.e0) {
                    string2 = zbaVar3.b;
                }
            }
            if (string2 == null) {
                Uri.Builder builderBuildUpon2 = Uri.parse(d93.c()).buildUpon();
                builderBuildUpon2.path("legal/ccpa-dns");
                builderBuildUpon2.appendQueryParameter("hl", d93.e());
                string2 = builderBuildUpon2.toString();
            }
            m(fragmentManager, string2, str);
            return;
        }
        if (jq7Var instanceof jq7.g) {
            String strA3 = null;
            for (zba zbaVar4 : ((yba) lazy.getValue()).d) {
                if (zbaVar4.a == bca.a0) {
                    strA3 = zbaVar4.b;
                }
            }
            if (strA3 == null) {
                strA3 = zwc.a("Cookies");
            }
            m(fragmentManager, strA3, str);
            return;
        }
        if (jq7Var instanceof jq7.j) {
            Lazy lazy2 = zwc.a;
            Lazy lazy3 = e87.a;
            m(fragmentManager, l5.m("https://", e87.b(d93.a(), d93.e()).c, "/about/citations"), str);
            return;
        }
        if (jq7Var instanceof jq7.b0) {
            m(fragmentManager, ((jq7.b0) jq7Var).b, str);
            return;
        }
        if (jq7Var instanceof jq7.l) {
            jq7.l lVar = (jq7.l) jq7Var;
            n(new dh(fragmentManager, lVar.b, lVar.c, lVar.d, str, 1));
            return;
        }
        if (jq7Var instanceof jq7.m) {
            n(new ky(i3, fragmentManager, str));
            return;
        }
        if (jq7Var instanceof jq7.y) {
            n(new pa0(7, fragmentManager, str));
            return;
        }
        if (jq7Var instanceof jq7.p) {
            jq7.p pVar = (jq7.p) jq7Var;
            String str7 = pVar.b;
            Map<String, String> map3 = pVar.c;
            if (str7.length() == 0) {
                l5.q("ConversationId must not be empty");
                return;
            }
            eVar.A(R.navigation.navigation_main);
            q97 q97Var2 = new q97();
            byte[] bytes = "CONVERSATION_SERVICE_ENCRYPTED///".concat(str7).getBytes(a32.b);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            strEncodeToString.getClass();
            String string3 = Uri.parse(((p87) q97Var2.a.getValue()).e()).buildUpon().appendPath("conversations").appendEncodedPath(strEncodeToString).build().toString();
            string3.getClass();
            n(new qk4(2, eVar, q97.b(string3, str, map3), this));
            return;
        }
        if (jq7Var instanceof jq7.f) {
            jq7.f fVar = (jq7.f) jq7Var;
            try {
                List<Fragment> listF2 = nVar.f();
                listF2.getClass();
                Fragment fragment3 = (Fragment) z92.Q0(listF2);
                if (fragment3 == null || (context = fragment3.getContext()) == null) {
                    throw new DetachedFragmentException();
                }
                String str8 = fVar.b;
                final String str9 = fVar.c;
                final String str10 = fVar.d;
                final String str11 = fVar.e;
                final String str12 = fVar.f;
                pgd pgdVarB = yhg.a.b(str8, str9);
                if (!(pgdVarB instanceof pgd.n)) {
                    n(new gu5() { // from class: xq7
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.gu5
                        public final Object invoke() {
                            a aVar2 = this.a;
                            boolean z3 = aVar2 instanceof ai8;
                            p87 p87Var = (p87) (z3 ? ((ai8) aVar2).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(p87.class), null);
                            ((r.b) (z3 ? ((ai8) aVar2).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(r.b.class), null)).b(BuildConfig.VERSION_NAME, "initService.appVersion");
                            d2f d2fVar = ajg.a;
                            aVar2.k(context, str9, ajg.a(p87Var.a()), null, str10, str11, str12);
                            return j6g.a;
                        }
                    });
                    return;
                }
                HttpUrl.Companion companion = HttpUrl.k;
                String strG = d93.g();
                companion.getClass();
                final HttpUrl httpUrlH = HttpUrl.Companion.c(strG).h(((pgd.n) pgdVarB).b);
                if (httpUrlH == null) {
                    throw new Exception("Unable to parse externalUrl");
                }
                final pgd.n nVar3 = (pgd.n) pgdVarB;
                n(new gu5() { // from class: wq7
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        String str13 = httpUrlH.i;
                        pgd.n nVar4 = nVar3;
                        this.a.k(context, str13, nVar4.c, nVar4.d, str10, str11, str12);
                        return j6g.a;
                    }
                });
                return;
            } catch (Exception e) {
                ((np7) cr8.p(np7.class)).c("JSTNavigatorImpl", "navToCompanyPage error", false, e);
                throw e;
            }
        }
        if (jq7Var instanceof jq7.z) {
            kqg.b(fragmentManager);
            n(new kl4(i4, fragmentManager, ((jq7.z) jq7Var).b, str));
            return;
        }
        if (!(jq7Var instanceof jq7.r)) {
            if (jq7Var instanceof jq7.w) {
                jq7.w wVar = (jq7.w) jq7Var;
                c(fragmentManager, new nq7.h(new qq7.j(wVar.b, wVar.c, wVar.d, wVar.e), new wa(9)), str);
                return;
            } else {
                if (jq7Var instanceof jq7.x) {
                    n(new j30(eVar, 10));
                    return;
                }
                ((np7) cr8.p(np7.class)).c("JSTNavigatorImpl", "navigateTo was not able to handle JSTLandingScreen type: " + jq7Var, false, new UnexpectedJSTLandingScreenException("Unexpected JSTLandingScreen type: " + jq7Var));
                return;
            }
        }
        x7a x7aVar = ((jq7.r) jq7Var).b;
        if (i6a.j() && !ygg.n() && x7aVar != x7a.b) {
            int iOrdinal = x7aVar.ordinal();
            if (iOrdinal != 0) {
                obj = k7f.a.b;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            obj = k7f.c.b;
                        } else {
                            if (iOrdinal != 4) {
                                if (iOrdinal == 5) {
                                    return;
                                }
                                l.g();
                                return;
                            }
                            obj = k7f.b.b;
                        }
                    }
                } else if (i6a.i()) {
                    obj = k7f.d.b;
                }
            } else {
                obj = k7f.e.b;
            }
            w7a.a.b(obj);
            return;
        }
        int iOrdinal2 = x7aVar.ordinal();
        if (iOrdinal2 == 0) {
            str2 = "saved";
        } else if (iOrdinal2 == 1) {
            str2 = "invitations";
        } else if (iOrdinal2 == 2) {
            str2 = "applied";
        } else if (iOrdinal2 == 3) {
            str2 = "interviews";
        } else if (iOrdinal2 == 4) {
            str2 = "archived";
        } else {
            if (iOrdinal2 != 5) {
                l.g();
                return;
            }
            str2 = "ghostwriterAutoApply";
        }
        Uri uriBuild = Uri.parse(((p87) this.X.getValue()).h()).buildUpon().clearQuery().appendPath("myjobs").appendPath(str2).build();
        new q97();
        String string4 = uriBuild.toString();
        string4.getClass();
        String strB = q97.b(string4, str, null);
        eVar.A(R.navigation.navigation_main);
        n(new zq7(0, eVar, strB, this));
    }

    @Override // defpackage.rq7
    public final void g(lr5 lr5Var) {
        n(new qr(lr5Var, 7));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.rq7
    public final void h(lr5 lr5Var, jt7 jt7Var, String str, kt7 kt7Var) {
        jt7Var.getClass();
        n(new sq7(lr5Var, jt7Var, str, kt7Var, this));
    }

    @Override // defpackage.rq7
    public final void i(lr5 lr5Var, Function1 function1) {
        try {
            new q97();
            n(new qk4(1, function1, new ShowModalWithWebviewData(q97.b("https://profile.indeed.com/import", "jsma-droid", null), null, ModalPresentationMode.c), lr5Var));
        } catch (Exception e) {
            ((np7) cr8.p(np7.class)).c("JSTNavigatorImpl", bg.e(e, "Error opening Profile Resume Data Import modal: "), false, e);
            function1.invoke(ms7.c);
        }
    }

    @Override // defpackage.rq7
    public final void j(Activity activity, rq7.a aVar, xdc xdcVar) {
        n(new h57(1, activity, aVar, xdcVar));
    }

    public final void k(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        Intent intentPutExtra = new Intent(context, (Class<?>) ExternalActivity.class).putExtra("url", str).putExtra("ua", str2).putExtra("params", str3).putExtra("shareUrl", str4).putExtra("shareMessage", str5).putExtra("shareTk", str6);
        intentPutExtra.getClass();
        n(new qe(10, context, intentPutExtra));
    }

    public final void l(FragmentManager fragmentManager, e eVar, String str, String str2, String str3, String str4) {
        fragmentManager.getClass();
        web.D(fragmentManager, "FsdvFragment");
        ArrayList arrayList = lz2.a;
        lz2.d("FsdvUtils", "Closing FSDV Fragment", false, null);
        Uri.Builder builderClearQuery = Uri.parse(((p87) new q97().a.getValue()).h()).buildUpon().clearQuery();
        builderClearQuery.getClass();
        builderClearQuery.appendPath("ace");
        builderClearQuery.appendQueryParameter("subscreen", str != null ? "ace_existing_conversation" : "new_conversation");
        if (str != null) {
            builderClearQuery.appendQueryParameter("conversationId", str);
        }
        if (str2 != null) {
            builderClearQuery.appendQueryParameter("content", str2);
        }
        if (str3 != null) {
            builderClearQuery.appendQueryParameter("agentType", str3);
        }
        if (str4 != null) {
            builderClearQuery.appendQueryParameter("from", str4);
        }
        String string = builderClearQuery.build().toString();
        string.getClass();
        k kVarI = eVar.i();
        if (kVarI != null && kVarI.W == R.id.ianMainFragment) {
            this.f.k(new jz2<>(string));
            return;
        }
        Serializable ianInitialState = new IanInitialState(xj1.W, null, string, 2);
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
            bundle.putParcelable("initialState", (Parcelable) ianInitialState);
        } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
            bundle.putSerializable("initialState", ianInitialState);
        }
        bundle.putBoolean("fromOnboarding", false);
        bundle.putBoolean("fromRegPromo", false);
        eVar.n(R.id.navActionDirectlyBottomNav, bundle);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.String] */
    public final void m(FragmentManager fragmentManager, String str, String str2) {
        luc lucVar = new luc();
        lucVar.element = "";
        if (str == null) {
            new q97();
            r97.a.getClass();
            lucVar.element = q97.b(r97.b(), str2, null);
        } else {
            r97.a.getClass();
            if (!r97.j(str) && !zwc.c(str)) {
                l5.q(l5.m("Non-Indeed-hosted URL detected: '", str, "' is not supported by this API. Please reach out to @chmcgrath, @mmacias, or @dlau from the US-MAP team in order to get a new URL added to the allow list."));
                return;
            } else {
                new q97();
                lucVar.element = q97.b(str, str2, null);
            }
        }
        n(new x9(8, lucVar, fragmentManager));
    }

    public final void n(gu5<j6g> gu5Var) {
        u63.Y(f13.a(this.a), null, null, new c(gu5Var, null), 3);
    }

    public a() {
        this(0);
    }
}
