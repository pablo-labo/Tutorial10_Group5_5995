package com.indeed.android.jobsearch.searchoverlay;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.jsmappservices.util.LocationSensor;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.ak2;
import defpackage.aud;
import defpackage.boa;
import defpackage.cr8;
import defpackage.cu;
import defpackage.cud;
import defpackage.frg;
import defpackage.fwc;
import defpackage.gme;
import defpackage.gu5;
import defpackage.hg6;
import defpackage.hh8;
import defpackage.irg;
import defpackage.jrg;
import defpackage.kt7;
import defpackage.l1g;
import defpackage.l5;
import defpackage.lr5;
import defpackage.lt7;
import defpackage.lz2;
import defpackage.m19;
import defpackage.mga;
import defpackage.mj8;
import defpackage.oj;
import defpackage.os5;
import defpackage.p6;
import defpackage.p63;
import defpackage.p87;
import defpackage.qga;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.s87;
import defpackage.s9e;
import defpackage.sp7;
import defpackage.tga;
import defpackage.tp7;
import defpackage.tx5;
import defpackage.u8;
import defpackage.vh6;
import defpackage.vh8;
import defpackage.w40;
import defpackage.xh8;
import defpackage.z8;
import defpackage.ztd;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jobsearch/searchoverlay/SearchOverlayFragment;", "Ll1g;", "Lm19;", "Lxh8;", "<init>", "()V", "a", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SearchOverlayFragment extends l1g implements m19, xh8 {
    public final Lazy V;
    public final Lazy W;
    public final frg X;
    public String Y;
    public String Z;
    public kt7 a;
    public String a0;
    public final Lazy b;
    public final z8<String[]> b0;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public static final class a {
        public static final SearchType a(Bundle bundle) {
            SearchType searchType;
            if (bundle == null || !bundle.containsKey("KEY_SEARCH_TYPE")) {
                l5.q("Missing argument KEY_SEARCH_TYPE");
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                searchType = (SearchType) bundle.getSerializable("KEY_SEARCH_TYPE", SearchType.class);
            } else {
                Serializable serializable = bundle.getSerializable("KEY_SEARCH_TYPE");
                serializable.getClass();
                searchType = (SearchType) serializable;
            }
            if (searchType != null) {
                return searchType;
            }
            l5.q("Missing argument KEY_SEARCH_TYPE");
            return null;
        }
    }

    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ ComposeView b;

        public b(ComposeView composeView) {
            this.b = composeView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchOverlayFragment searchOverlayFragment = SearchOverlayFragment.this;
            if (view == null) {
                ((gme) searchOverlayFragment.I().X).setValue(Boolean.FALSE);
                return;
            }
            Context context = this.b.getContext();
            context.getClass();
            Boolean boolA = hh8.a(context, view, new cu(searchOverlayFragment, 14));
            if (boolA != null) {
                ((gme) searchOverlayFragment.I().X).setValue(boolA);
                return;
            }
            ((gme) searchOverlayFragment.I().X).setValue(Boolean.FALSE);
            aud audVarH = searchOverlayFragment.H();
            int i9 = Build.VERSION.SDK_INT;
            audVarH.getClass();
            ArrayList arrayList = lz2.a;
            w40.n("Keyboard visibility update skipped", "SearchOverlayFragment", p6.c(i9, "Keyboard visibility update skipped, osVersion = "), false);
        }
    }

    public static final class c extends mj8 implements gu5<s9e> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SearchOverlayFragment searchOverlayFragment) {
            super(0);
            this.$this_inject = searchOverlayFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, s9e] */
        @Override // defpackage.gu5
        public final s9e invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(s9e.class), a9cVar);
        }
    }

    public static final class d extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SearchOverlayFragment searchOverlayFragment) {
            super(0);
            this.$this_inject = searchOverlayFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    public static final class e extends mj8 implements gu5<tga> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SearchOverlayFragment searchOverlayFragment) {
            super(0);
            this.$this_inject = searchOverlayFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, tga] */
        @Override // defpackage.gu5
        public final tga invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(tga.class), a9cVar);
        }
    }

    public static final class f extends mj8 implements gu5<mga> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SearchOverlayFragment searchOverlayFragment) {
            super(0);
            this.$this_inject = searchOverlayFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, mga] */
        @Override // defpackage.gu5
        public final mga invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(mga.class), a9cVar);
        }
    }

    public static final class g extends mj8 implements gu5<qga> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SearchOverlayFragment searchOverlayFragment) {
            super(0);
            this.$this_inject = searchOverlayFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, qga] */
        @Override // defpackage.gu5
        public final qga invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(qga.class), a9cVar);
        }
    }

    public static final class h extends mj8 implements gu5<LocationSensor> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SearchOverlayFragment searchOverlayFragment) {
            super(0);
            this.$this_inject = searchOverlayFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.indeed.android.jsmappservices.util.LocationSensor, java.lang.Object] */
        @Override // defpackage.gu5
        public final LocationSensor invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(LocationSensor.class), a9cVar);
        }
    }

    public static final class i extends mj8 implements gu5<aud> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SearchOverlayFragment searchOverlayFragment) {
            super(0);
            this.$this_inject = searchOverlayFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [aud, java.lang.Object] */
        @Override // defpackage.gu5
        public final aud invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(aud.class), a9cVar);
        }
    }

    public static final class j extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SearchOverlayFragment searchOverlayFragment) {
            super(0);
            this.$this_viewModels = searchOverlayFragment;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class k extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.$ownerProducer = jVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class l extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class m extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Lazy lazy) {
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

    public SearchOverlayFragment() {
        c cVar = new c(this);
        qt8 qt8Var = qt8.a;
        this.b = boa.E(qt8Var, cVar);
        this.c = boa.E(qt8Var, new d(this));
        this.d = boa.E(qt8Var, new e(this));
        this.e = boa.E(qt8Var, new f(this));
        this.f = boa.E(qt8Var, new g(this));
        this.V = boa.E(qt8Var, new h(this));
        this.W = boa.E(qt8Var, new i(this));
        oj ojVar = new oj(this, 17);
        Lazy lazyE = boa.E(qt8.c, new k(new j(this)));
        this.X = os5.a(this, fwc.a.b(cud.class), new l(lazyE), new m(lazyE), ojVar);
        this.Y = "";
        z8<String[]> z8VarRegisterForActivityResult = registerForActivityResult(new u8(), new vh6(this, 10));
        z8VarRegisterForActivityResult.getClass();
        this.b0 = z8VarRegisterForActivityResult;
    }

    public static /* synthetic */ void G(SearchOverlayFragment searchOverlayFragment) {
        searchOverlayFragment.F(lt7.a.a);
    }

    @Override // defpackage.m19
    public final void A() {
        aud audVarH = H();
        SearchType searchTypeM = I().m();
        audVarH.getClass();
        searchTypeM.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, ak2.M(searchTypeM).concat("-location-permissions"), null, 0 == true ? 1 : 0));
        this.b0.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }

    public final void F(lt7 lt7Var) {
        kt7 kt7Var = this.a;
        if (kt7Var != null) {
            kt7Var.a(lt7Var);
        }
        I();
        View view = getView();
        if (view != null) {
            Context context = view.getContext();
            context.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
        if (getActivity() != null) {
            lr5 lr5VarU = requireActivity().u();
            lr5VarU.getClass();
            ztd.b(lr5VarU);
            return;
        }
        ArrayList arrayList = lz2.a;
        lz2.h("SearchOverlayFragment", "Tried to close Search Overlay with null activity. origin=" + this.Y + " searchType=" + I().m(), null, 12);
    }

    public final aud H() {
        return (aud) this.W.getValue();
    }

    public final cud I() {
        return (cud) this.X.getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.m19
    public final boolean j() {
        return ((LocationSensor) this.V.getValue()).c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        androidx.fragment.app.g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        try {
            hh8.a = Integer.valueOf(gVarRequireActivity.getWindow().getAttributes().softInputMode);
            gVarRequireActivity.getWindow().setSoftInputMode(32);
        } catch (Exception e2) {
            ArrayList arrayList = lz2.a;
            lz2.b("KeyboardUtils", "safelyAdjustSoftInputMode error", false, e2);
        }
        if (bundle == null) {
            ((gme) I().a0).setValue(a.a(getArguments()));
            Bundle arguments = getArguments();
            String string2 = null;
            String string3 = (arguments == null || !arguments.containsKey("KEY_INITIAL_WHAT")) ? null : arguments.getString("KEY_INITIAL_WHAT");
            this.Z = string3;
            if (string3 != null) {
                I().A(string3, true);
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null && arguments2.containsKey("KEY_INITIAL_WHERE")) {
                string2 = arguments2.getString("KEY_INITIAL_WHERE");
            }
            this.a0 = string2;
            if (string2 != null) {
                I().B(string2);
            }
            Bundle arguments3 = getArguments();
            if (arguments3 == null || !arguments3.containsKey("KEY_ORIGIN") || (string = arguments3.getString("KEY_ORIGIN")) == null) {
                string = "";
            }
            this.Y = string;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            r3.getClass()
            cud r3 = r2.I()
            monitor-enter(r3)
            uqe r4 = r3.k0     // Catch: java.lang.Throwable -> La8
            r5 = 0
            if (r4 == 0) goto L10
            r4.h(r5)     // Catch: java.lang.Throwable -> La8
        L10:
            r3.k0 = r5     // Catch: java.lang.Throwable -> La8
            k82 r4 = defpackage.ee3.p(r3)     // Catch: java.lang.Throwable -> La8
            fud r0 = new fud     // Catch: java.lang.Throwable -> La8
            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> La8
            r1 = 3
            uqe r4 = defpackage.u63.Y(r4, r5, r5, r0, r1)     // Catch: java.lang.Throwable -> La8
            r3.k0 = r4     // Catch: java.lang.Throwable -> La8
            j6g r4 = defpackage.j6g.a     // Catch: java.lang.Throwable -> La8
            monitor-exit(r3)
            dd4 r3 = defpackage.dd4.a
            ed4 r3 = defpackage.dd4.n()
            ad4 r3 = r3.a
            r3.getClass()
            cd4$a r4 = cd4.a.T0
            int r3 = r3.e(r4)
            cd4$p2 r0 = cd4.p2.a
            int r0 = r0.getValue()
            if (r3 != r0) goto L3f
            goto L6a
        L3f:
            ed4 r3 = defpackage.dd4.n()
            ad4 r3 = r3.a
            r3.getClass()
            int r3 = r3.e(r4)
            cd4$p2 r0 = cd4.p2.b
            int r0 = r0.getValue()
            if (r3 != r0) goto L55
            goto L6a
        L55:
            ed4 r3 = defpackage.dd4.n()
            ad4 r3 = r3.a
            r3.getClass()
            int r3 = r3.e(r4)
            cd4$p2 r4 = cd4.p2.c
            int r4 = r4.getValue()
            if (r3 != r4) goto L7a
        L6a:
            cud r3 = r2.I()
            k82 r4 = defpackage.ee3.p(r3)
            eud r0 = new eud
            r0.<init>(r3, r5)
            defpackage.u63.Y(r4, r5, r5, r0, r1)
        L7a:
            androidx.compose.ui.platform.ComposeView r3 = new androidx.compose.ui.platform.ComposeView
            android.content.Context r4 = r2.requireContext()
            r4.getClass()
            r0 = 6
            r3.<init>(r4, r5, r0)
            kpg$a r4 = kpg.a.a
            r3.setViewCompositionStrategy(r4)
            ed r4 = new ed
            r5 = 11
            r4.<init>(r2, r5)
            ah2 r5 = new ah2
            r0 = 1610146446(0x5ff8e28e, float:3.5868106E19)
            r1 = 1
            r5.<init>(r0, r4, r1)
            r3.setContent(r5)
            com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment$b r4 = new com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment$b
            r4.<init>(r3)
            r3.addOnLayoutChangeListener(r4)
            return r3
        La8:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ArrayList arrayList = lz2.a;
        lz2.d("SearchOverlayFragment", "onDestroy()", false, null);
        this.a = null;
        androidx.fragment.app.g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        try {
            Integer num = hh8.a;
            if (num != null) {
                gVarRequireActivity.getWindow().setSoftInputMode(num.intValue());
            }
        } catch (Exception e2) {
            ArrayList arrayList2 = lz2.a;
            lz2.b("KeyboardUtils", "safelyResetSoftInputMode error", false, e2);
        }
        super.onDestroy();
    }

    @Override // defpackage.l1g, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        aud audVarH = H();
        SearchType searchTypeM = I().m();
        audVarH.getClass();
        searchTypeM.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, ak2.M(searchTypeM), null, 0 == true ? 1 : 0));
    }

    @Override // defpackage.l1g
    public final boolean tryHandleBackNavigation() {
        aud audVarH = H();
        SearchType searchTypeM = I().m();
        audVarH.getClass();
        searchTypeM.getClass();
        Lazy<s87> lazy = s87.f;
        s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(searchTypeM), "system-back", null, 12));
        G(this);
        return false;
    }
}
