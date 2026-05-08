package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.navigation.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.c87;
import defpackage.kv8;
import defpackage.n2g;
import defpackage.s87;
import defpackage.w2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePulseEvents$1", f = "IanMainFragment.kt", l = {1502}, m = "invokeSuspend")
public final class up6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ IanMainFragment this$0;

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePulseEvents$1$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ IanMainFragment this$0;

        /* JADX INFO: renamed from: up6$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePulseEvents$1$1$1", f = "IanMainFragment.kt", l = {1504}, m = "invokeSuspend")
        public static final class C0434a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ IanMainFragment this$0;

            /* JADX INFO: renamed from: up6$a$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePulseEvents$1$1$1$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
            public static final class C0435a extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
                int label;
                final /* synthetic */ IanMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0435a(IanMainFragment ianMainFragment, lu2<? super C0435a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = ianMainFragment;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0435a(this.this$0, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
                    return ((C0435a) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    ArrayList arrayList = lz2.a;
                    lz2.d("IanMainFragment", "proctor-refresh-failure, hiding proctor refresh dialog", false, null);
                    ((gme) ((thb) this.this$0.o0.getValue()).b).setValue(Boolean.FALSE);
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0434a(IanMainFragment ianMainFragment, lu2<? super C0434a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ianMainFragment;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0434a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0434a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    nde ndeVarA = ((rob) this.this$0.v0.getValue()).a();
                    C0435a c0435a = new C0435a(this.this$0, null);
                    this.label = 1;
                    Object objQ = wg2.q(ndeVarA, c0435a, this);
                    g13 g13Var = g13.a;
                    if (objQ == g13Var) {
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

        @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePulseEvents$1$1$2", f = "IanMainFragment.kt", l = {1511}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ IanMainFragment this$0;

            /* JADX INFO: renamed from: up6$a$b$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePulseEvents$1$1$2$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
            public static final class C0436a extends c1f implements Function2<j6g, lu2<? super j6g>, Object> {
                int label;
                final /* synthetic */ IanMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0436a(IanMainFragment ianMainFragment, lu2<? super C0436a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = ianMainFragment;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0436a(this.this$0, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(j6g j6gVar, lu2<? super j6g> lu2Var) {
                    return ((C0436a) create(j6gVar, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    ArrayList arrayList = lz2.a;
                    lz2.d("IanMainFragment", "proctor-update-2", false, null);
                    dd4 dd4Var = dd4.a;
                    if (dd4.m() && this.this$0.L().c && ((m2g) this.this$0.b0.getValue()).b(n2g.a.a)) {
                        Log.d("IanMainFragment", "navigating to onboarding", null);
                        this.this$0.c.e("ian-full-screen-detail-view", "onboarding", false);
                        this.this$0.L().c = false;
                        ((m2g) this.this$0.b0.getValue()).a(mh2.k(this.this$0));
                    }
                    lz2.d("IanMainFragment", "hiding proctor refresh dialog", false, null);
                    ((gme) ((thb) this.this$0.o0.getValue()).b).setValue(Boolean.FALSE);
                    bu8 bu8Var = bu8.a;
                    bu8Var.getClass();
                    if (((Boolean) bu8.J0.a(bu8.b[47], bu8Var)).booleanValue()) {
                        e eVarK = mh2.k(this.this$0);
                        Bundle bundle = new Bundle();
                        eVarK.getClass();
                        eVarK.n(R.id.navActionDirectlyBlockingToS, bundle);
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(IanMainFragment ianMainFragment, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ianMainFragment;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    nde ndeVarD = ((rob) this.this$0.v0.getValue()).d();
                    C0436a c0436a = new C0436a(this.this$0, null);
                    this.label = 1;
                    Object objQ = wg2.q(ndeVarD, c0436a, this);
                    g13 g13Var = g13.a;
                    if (objQ == g13Var) {
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

        @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePulseEvents$1$1$3", f = "IanMainFragment.kt", l = {1539}, m = "invokeSuspend")
        public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ IanMainFragment this$0;

            /* JADX INFO: renamed from: up6$a$c$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observePulseEvents$1$1$3$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
            public static final class C0437a extends c1f implements Function2<y49, lu2<? super j6g>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ IanMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0437a(IanMainFragment ianMainFragment, lu2<? super C0437a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = ianMainFragment;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0437a c0437a = new C0437a(this.this$0, lu2Var);
                    c0437a.L$0 = obj;
                    return c0437a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(y49 y49Var, lu2<? super j6g> lu2Var) {
                    return ((C0437a) create(y49Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    String str;
                    String str2;
                    y49 y49Var = (y49) this.L$0;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    ArrayList arrayList = lz2.a;
                    lz2.d("IanMainFragment", "login-event-" + y49Var.name(), false, null);
                    int iOrdinal = y49Var.ordinal();
                    boolean z = true;
                    if (iOrdinal == 0) {
                        IanMainFragment ianMainFragment = this.this$0;
                        bp6 bp6Var = ianMainFragment.c;
                        Lazy lazy = ianMainFragment.b0;
                        frg frgVar = ianMainFragment.n0;
                        lz2.d("IanMainFragment", "updateStateAfterSignIn()", false, null);
                        ((ik3) ianMainFragment.y0.getValue()).b = false;
                        g4a g4aVar = ianMainFragment.J().e;
                        Boolean bool = Boolean.TRUE;
                        ((gme) g4aVar).setValue(bool);
                        ianMainFragment.H().k();
                        if (((apf) frgVar.getValue()).h()) {
                            ((apf) frgVar.getValue()).g();
                        }
                        LinkedHashMap linkedHashMap = iq6.b;
                        if (linkedHashMap.containsKey(ianMainFragment.J().h())) {
                            Pair pair = (Pair) linkedHashMap.get(ianMainFragment.J().h());
                            String str3 = "";
                            if (pair == null || (str = (String) pair.e()) == null) {
                                str = "";
                            }
                            String strA = yhg.a.b(str, str).a.a();
                            Pair pair2 = (Pair) linkedHashMap.get(ianMainFragment.J().h());
                            if (pair2 != null && (str2 = (String) pair2.d()) != null) {
                                str3 = str2;
                            }
                            bp6Var.k(strA, str, str3);
                            linkedHashMap.remove(ianMainFragment.J().h());
                            lz2.d("IanMainFragment", "WebView brought to foreground upon closing FSDV: ".concat(str), false, null);
                        }
                        lr5 lr5VarU = ianMainFragment.requireActivity().u();
                        lr5VarU.getClass();
                        web.D(lr5VarU, "FsdvFragment");
                        lz2.d("FsdvUtils", "Closing FSDV Fragment", false, null);
                        if (ianMainFragment.L().c) {
                            dd4 dd4Var = dd4.a;
                            if (dd4.m()) {
                                lz2.d("IanMainFragment", "cameFromRegPromo", false, null);
                                if (!((kq7) cr8.p(kq7.class)).j("Onboarding", "OnboardingCompleted", false)) {
                                    Integer numC = ((kq7) cr8.p(kq7.class)).c("Onboarding", 0, "OnboardingShownCount");
                                    if ((numC != null ? numC.intValue() : 0) < 2) {
                                        z = false;
                                    }
                                }
                                lz2.d("IanMainFragment", "alreadySeenOnboarding = " + z, false, null);
                                if (z) {
                                    ianMainFragment.R();
                                } else {
                                    bp6Var.getClass();
                                    Lazy<s87> lazy2 = s87.f;
                                    s87.a.a(bp6Var.a(), tx5.e(bp6Var.b, "proctor-refresh-dialog", "ian-main-screen", null, 12));
                                    ((gme) ((thb) ianMainFragment.o0.getValue()).b).setValue(bool);
                                }
                            } else if (((m2g) lazy.getValue()).b(n2g.a.a)) {
                                bp6Var.e("ian-full-screen-detail-view", "onboarding", false);
                                ianMainFragment.L().c = false;
                                ((m2g) lazy.getValue()).a(mh2.k(ianMainFragment));
                            }
                        } else {
                            ianMainFragment.R();
                        }
                    } else {
                        if (iOrdinal != 1) {
                            l.g();
                            return null;
                        }
                        IanMainFragment ianMainFragment2 = this.this$0;
                        ((gme) ianMainFragment2.J().e).setValue(Boolean.FALSE);
                        ianMainFragment2.H().k();
                        ((ik3) ianMainFragment2.y0.getValue()).b = false;
                        ianMainFragment2.V(0);
                        c6f c6fVarM = ianMainFragment2.M();
                        wv4 wv4Var = xj1.d0;
                        wv4Var.getClass();
                        w2.b bVar = new w2.b();
                        while (bVar.hasNext()) {
                            xj1 xj1Var = (xj1) bVar.next();
                            ArrayList arrayList2 = lz2.a;
                            lz2.d("TabEventManagerViewModel", xj1Var + ": fireMarkStateAsInvalidEvent", false, null);
                            c6fVarM.l(xj1Var).c.k(new jz2<>(new yc9()));
                        }
                        d2f d2fVar = c87.a;
                        String strA2 = c87.a.a(ez2.V);
                        if (strA2 == null) {
                            strA2 = "0";
                        }
                        if (strA2.equals("1")) {
                            ArrayList arrayList3 = lz2.a;
                            lz2.d("IanMainFragment", "Logging out via DSA non-recommender flow", false, null);
                            IanMainFragment.U(ianMainFragment2, IanMainFragment.I(), null, 6);
                        } else {
                            ((m99) ianMainFragment2.m0.getValue()).i(mh2.k(ianMainFragment2));
                            ianMainFragment2.J().m(IanMainFragment.I());
                        }
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(IanMainFragment ianMainFragment, lu2<? super c> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ianMainFragment;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new c(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    nde ndeVarA = ((t49) this.this$0.u0.getValue()).a();
                    C0437a c0437a = new C0437a(this.this$0, null);
                    this.label = 1;
                    Object objQ = wg2.q(ndeVarA, c0437a, this);
                    g13 g13Var = g13.a;
                    if (objQ == g13Var) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IanMainFragment ianMainFragment, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ianMainFragment;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            e13 e13Var = (e13) this.L$0;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            u63.Y(e13Var, null, null, new C0434a(this.this$0, null), 3);
            u63.Y(e13Var, null, null, new b(this.this$0, null), 3);
            u63.Y(e13Var, null, null, new c(this.this$0, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up6(IanMainFragment ianMainFragment, lu2<? super up6> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ianMainFragment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new up6(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((up6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zv8 viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            a aVar = new a(this.this$0, null);
            this.label = 1;
            Object objB = c2d.b(viewLifecycleOwner, kv8.b.c, aVar, this);
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
