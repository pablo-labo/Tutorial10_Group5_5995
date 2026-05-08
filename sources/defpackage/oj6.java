package defpackage;

import defpackage.saa;
import defpackage.xh8;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Loj6;", "Ld4g;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class oj6 extends d4g implements xh8 {
    public boolean V;
    public boolean W;
    public int X;
    public wm1 a0;
    public cq0 b0;
    public o91 c0;
    public oq d0;
    public boolean e;
    public dd e0;
    public final Lazy d = boa.E(qt8.a, new b(this));
    public boolean f = ((bp7) cr8.p(bp7.class)).e();
    public final d2f Y = new d2f(new j30(this, 8));
    public final d2f Z = new d2f(new k30(this, 11));

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.tabs.home.HomeTabTopNavViewModel$1", f = "HomeTabTopNavViewModel.kt", l = {61}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        /* JADX INFO: renamed from: oj6$a$a, reason: collision with other inner class name */
        public static final class C0368a<T> implements wi5 {
            public final /* synthetic */ oj6 a;

            public C0368a(oj6 oj6Var) {
                this.a = oj6Var;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                boolean z = ((y49) obj) == y49.a;
                oj6 oj6Var = this.a;
                oj6Var.f = z;
                ((np7) cr8.p(np7.class)).a("HomeTabTopNavViewModel", "collect login state: " + oj6Var.f);
                oj6Var.n();
                return j6g.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return oj6.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
            nde ndeVarA = ((t49) oj6.this.d.getValue()).a();
            C0368a c0368a = new C0368a(oj6.this);
            this.label = 1;
            ndeVarA.e(c0368a, this);
            return g13.a;
        }
    }

    public static final class b extends mj8 implements gu5<t49> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oj6 oj6Var) {
            super(0);
            this.$this_inject = oj6Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, t49] */
        @Override // defpackage.gu5
        public final t49 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(t49.class), a9cVar);
        }
    }

    public oj6() {
        k82 k82VarP = ee3.p(this);
        eq3 eq3Var = a74.a;
        u63.Y(k82VarP, m89.a, null, new a(null), 2);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final void l(boolean z) {
        ((np7) cr8.p(np7.class)).a("HomeTabTopNavViewModel", "updateInlineDetailTopNav(" + z + ")");
        this.V = z;
        n();
    }

    public final void m(boolean z) {
        ((np7) cr8.p(np7.class)).a("HomeTabTopNavViewModel", "updateShowSerpTopNav(" + z + ")");
        this.W = z;
        n();
    }

    public final void n() {
        if (!this.e) {
            ((np7) cr8.p(np7.class)).a("HomeTabTopNavViewModel", "updateTopNavState() skipped - not yet initialized");
            return;
        }
        h(u63.Z((this.V || this.W) ? new raa(saa.a.a, (String) null, (String) null, (Integer) null, this.a0, 30) : new raa(saa.f.a, (String) null, (String) null, (Integer) null, (gu5) null, 62)));
        boolean z = this.f;
        boolean z2 = this.V;
        int i = this.X;
        String str = (String) this.Y.getValue();
        String str2 = (String) this.Z.getValue();
        cq0 cq0Var = this.b0;
        o91 o91Var = this.c0;
        oq oqVar = this.d0;
        dd ddVar = this.e0;
        boolean zA = ((h2g) cr8.p(h2g.class)).a();
        List<raa> listZ = zr4.a;
        if (zA) {
            if (z2 && z) {
                listZ = u63.Z(new raa(new saa.e(fv6.W1, str2, "DetailsCloseButton", 4), (String) null, (String) null, (Integer) null, cq0Var, 30));
            } else if (!z2) {
                listZ = z ? u63.a0(new raa(new saa.e(fv6.t6, str, "notificationIcon", 4), (String) null, (String) null, Integer.valueOf(i), o91Var, 22), new raa(saa.g.a, (String) null, (String) null, (Integer) null, ddVar, 30)) : u63.a0(new raa(saa.j.a, (String) null, (String) null, (Integer) null, oqVar, 30), new raa(saa.g.a, (String) null, (String) null, (Integer) null, ddVar, 30));
            }
        } else if (z2 && z) {
            listZ = u63.Z(new raa(new saa.e(fv6.W1, str2, "DetailsCloseButton", 4), (String) null, (String) null, (Integer) null, cq0Var, 30));
        } else if (!z2) {
            listZ = z ? u63.Z(new raa(new saa.e(fv6.t6, str, "notificationIcon", 4), (String) null, (String) null, Integer.valueOf(i), o91Var, 22)) : u63.Z(new raa(saa.j.a, (String) null, (String) null, (Integer) null, oqVar, 30));
        }
        j(listZ);
    }
}
