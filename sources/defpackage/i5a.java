package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.datadog.android.core.internal.CoreFeature;
import com.indeed.android.backendservices.data.IndeedAppDatabase;
import defpackage.c87;
import defpackage.e9a;
import defpackage.grg;
import defpackage.kv8;
import defpackage.p63;
import defpackage.sp7;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li5a;", "Lm6f;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i5a extends m6f implements xh8 {
    public final frg V;
    public final frg W;
    public final tx5 X;
    public led Y;
    public boolean Z;
    public String a0;
    public final xj1 b = xj1.c;
    public String b0;
    public final Lazy c;
    public final frg c0;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    @uh3(c = "com.indeed.android.jobsearch.myjobs.MyJobsFragment$onViewCreated$3", f = "MyJobsFragment.kt", l = {265}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        /* JADX INFO: renamed from: i5a$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.myjobs.MyJobsFragment$onViewCreated$3$1", f = "MyJobsFragment.kt", l = {266}, m = "invokeSuspend")
        public static final class C0261a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ i5a this$0;

            /* JADX INFO: renamed from: i5a$a$a$a, reason: collision with other inner class name */
            public static final class C0262a<T> implements wi5 {
                public final /* synthetic */ i5a a;

                public C0262a(i5a i5aVar) {
                    this.a = i5aVar;
                }

                @Override // defpackage.wi5
                public final Object a(Object obj, lu2 lu2Var) {
                    i5a i5aVar = this.a;
                    e8a e8aVarP = i5aVar.P();
                    String str = ((k7f) obj).a;
                    String str2 = i5aVar.a0;
                    if (str2 == null) {
                        wl7.g("homeUrl");
                        throw null;
                    }
                    String strU0 = zve.u0(zve.q0(str2, CoreFeature.DEFAULT_APP_VERSION), '/');
                    String str3 = i5aVar.a0;
                    if (str3 == null) {
                        wl7.g("homeUrl");
                        throw null;
                    }
                    String strN0 = zve.n0(str3, CoreFeature.DEFAULT_APP_VERSION, "");
                    String strM = z3.m(strU0, "/", str);
                    if (strN0.length() > 0) {
                        strM = z3.m(strM, CoreFeature.DEFAULT_APP_VERSION, strN0);
                    }
                    e8aVarP.m(strM);
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0261a(i5a i5aVar, lu2<? super C0261a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = i5aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0261a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
                ((C0261a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                return g13.a;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        throw s6.e(obj);
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                pqc pqcVar = w7a.b;
                C0262a c0262a = new C0262a(this.this$0);
                this.label = 1;
                pqcVar.a.e(c0262a, this);
                return g13.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return i5a.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zv8 viewLifecycleOwner = i5a.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                C0261a c0261a = new C0261a(i5a.this, null);
                this.label = 1;
                Object objB = c2d.b(viewLifecycleOwner, kv8.b.d, c0261a, this);
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
        public b(i5a i5aVar) {
            super(0);
            this.$this_activityViewModels = i5aVar;
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
        public c(i5a i5aVar) {
            super(0);
            this.$this_activityViewModels = i5aVar;
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
        public d(i5a i5aVar) {
            super(0);
            this.$this_activityViewModels = i5aVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class e extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i5a i5aVar) {
            super(0);
            this.$this_activityViewModels = i5aVar;
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
        public f(i5a i5aVar) {
            super(0);
            this.$this_activityViewModels = i5aVar;
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
        public g(i5a i5aVar) {
            super(0);
            this.$this_activityViewModels = i5aVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class h extends mj8 implements gu5<gsa> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(i5a i5aVar) {
            super(0);
            this.$this_inject = i5aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gsa, java.lang.Object] */
        @Override // defpackage.gu5
        public final gsa invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gsa.class), a9cVar);
        }
    }

    public static final class i extends mj8 implements gu5<IndeedAppDatabase> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(i5a i5aVar) {
            super(0);
            this.$this_inject = i5aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.indeed.android.backendservices.data.IndeedAppDatabase, java.lang.Object] */
        @Override // defpackage.gu5
        public final IndeedAppDatabase invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(IndeedAppDatabase.class), a9cVar);
        }
    }

    public static final class j extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i5a i5aVar) {
            super(0);
            this.$this_inject = i5aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class k extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(i5a i5aVar) {
            super(0);
            this.$this_inject = i5aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    public static final class l extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(i5a i5aVar) {
            super(0);
            this.$this_viewModels = i5aVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class m extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.$ownerProducer = lVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class n extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class o extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Lazy lazy) {
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

    public i5a() {
        h hVar = new h(this);
        qt8 qt8Var = qt8.a;
        this.c = boa.E(qt8Var, hVar);
        this.d = boa.E(qt8Var, new i(this));
        this.e = boa.E(qt8Var, new j(this));
        this.f = boa.E(qt8Var, new k(this));
        iwc iwcVar = fwc.a;
        this.V = os5.a(this, iwcVar.b(jq6.class), new b(this), new c(this), new d(this));
        this.W = os5.a(this, iwcVar.b(t8c.class), new e(this), new f(this), new g(this));
        this.X = new tx5();
        fk0 fk0Var = new fk0(this, 14);
        Lazy lazyE = boa.E(qt8.c, new m(new l(this)));
        this.c0 = os5.a(this, iwcVar.b(e8a.class), new n(lazyE), new o(lazyE), fk0Var);
    }

    @Override // defpackage.m6f
    /* JADX INFO: renamed from: F, reason: from getter */
    public final xj1 getV() {
        return this.b;
    }

    @Override // defpackage.m6f
    public final void G() {
        e8a e8aVarP = P();
        j7f j7fVar = (j7f) ((gme) P().V).getValue();
        j7fVar.getClass();
        e8aVarP.W.k(new jz2<>(j7fVar));
    }

    @Override // defpackage.m6f
    public final void H(String str) {
        str.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("MyJobsFragment", l5.m("onLoadUrl(", str, ")"), false, null);
        P().m(str);
    }

    @Override // defpackage.m6f
    public final void I() {
    }

    @Override // defpackage.m6f
    public final void J() {
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, ((bp7) cr8.p(bp7.class)).e() ? "myjobs_screen" : "myjobs_logged_out_screen", null, null));
        boolean zC = new d8c(w8c.c).c(xj1.c, false);
        frg frgVar = this.W;
        if (zC) {
            ((t8c) frgVar.getValue()).h(s8c.NATIVE_MYJOBS);
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
        ArrayList arrayList = lz2.a;
        lz2.d("MyJobsFragment", "onReset(" + gq6Var + ")", false, null);
        if (((bp7) cr8.p(bp7.class)).e()) {
            Q();
            P().j();
            P().h0.k(Boolean.valueOf(!(((at7) cr8.p(at7.class)).a() == ft7.c)));
        }
    }

    @Override // defpackage.m6f
    public final void N() {
        ArrayList arrayList = lz2.a;
        lz2.d("MyJobsFragment", "onLoad()", false, null);
    }

    public final led O(uha uhaVar) {
        String strE = ep5.a.e();
        String strA = dd4.a.a();
        if (uhaVar == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zr4 zr4Var = zr4.a;
            uhaVar = new uha(zr4Var, zr4Var, zr4Var, zr4Var, jCurrentTimeMillis, false);
        }
        led ledVar = new led();
        Bundle bundleE = l6.e("arg_component_name", "NextStepsDashboard");
        bundleE.putBundle("arg_launch_options", new vha(e9a.a.a(strE, strA), uhaVar).toBundle());
        bundleE.putBoolean("arg_fabric_enabled", false);
        ledVar.setArguments(bundleE);
        ledVar.d = new qr(this, 14);
        return ledVar;
    }

    public final e8a P() {
        return (e8a) this.c0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        d2f d2fVar = c87.a;
        String strA = c87.a.a(ez2.W);
        String str = strA == null ? "" : strA;
        String cookie = CookieManager.getInstance().getCookie(d93.g());
        String strA2 = com.indeed.android.jobsearch.backend.util.a.a();
        String str2 = strA2 == null ? "" : strA2;
        cookie.getClass();
        hh1.D(str, str2, cookie, ((p87) this.f.getValue()).c(), d93.c(), d93.a(), (gsa) this.c.getValue(), new na0(this, 15));
    }

    public final void R() {
        lr5 lr5VarU;
        androidx.fragment.app.g activity = getActivity();
        if (activity == null || (lr5VarU = activity.u()) == null) {
            return;
        }
        ((rq7) cr8.p(rq7.class)).b(lr5VarU, new he(11));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("KEY_HOME_URL")) == null) {
            l5.q("Missing homeUrl argument");
            return;
        }
        this.a0 = string;
        if (bundle == null) {
            Bundle arguments2 = getArguments();
            this.b0 = arguments2 != null ? arguments2.getString("KEY_INITIAL_URL") : null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Q();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(-1004425366, new fr2(this, 4), true));
        return composeView;
    }

    @Override // defpackage.iw8, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        P().j();
        P().h0.k(Boolean.valueOf(!(((at7) cr8.p(at7.class)).a() == ft7.c)));
        Q();
    }

    @Override // defpackage.m6f, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        P().a0.e(getViewLifecycleOwner(), new j5a(new or(this, 12), 0));
        e8a e8aVarP = P();
        String str = this.a0;
        if (str == null) {
            wl7.g("homeUrl");
            throw null;
        }
        e8aVarP.m(str);
        String str2 = this.b0;
        if (str2 != null) {
            ArrayList arrayList = lz2.a;
            lz2.d("MyJobsFragment", "Loading url ".concat(str2), false, null);
            P().m(str2);
            ((c1g) cr8.p(c1g.class)).a();
        }
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        u63.Y(hh1.A(viewLifecycleOwner), null, null, new a(null), 3);
    }
}
