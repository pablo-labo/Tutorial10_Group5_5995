package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.kv8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$setupRnBottomSheetFragment$1", f = "IanMainFragment.kt", l = {1776}, m = "invokeSuspend")
public final class cq6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ IanMainFragment this$0;

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$setupRnBottomSheetFragment$1$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ IanMainFragment this$0;

        /* JADX INFO: renamed from: cq6$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$setupRnBottomSheetFragment$1$1$1", f = "IanMainFragment.kt", l = {1778}, m = "invokeSuspend")
        public static final class C0197a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ IanMainFragment this$0;

            /* JADX INFO: renamed from: cq6$a$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$setupRnBottomSheetFragment$1$1$1$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
            public static final class C0198a extends c1f implements Function2<Boolean, lu2<? super j6g>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ IanMainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0198a(IanMainFragment ianMainFragment, lu2<? super C0198a> lu2Var) {
                    super(2, lu2Var);
                    this.this$0 = ianMainFragment;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    C0198a c0198a = new C0198a(this.this$0, lu2Var);
                    c0198a.Z$0 = ((Boolean) obj).booleanValue();
                    return c0198a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Boolean bool, lu2<? super j6g> lu2Var) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C0198a) create(bool2, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    ((np7) cr8.p(np7.class)).a("IanMainFragment", "toggleRnBottomSheetContainerVisibility -> " + z);
                    dr5 dr5Var = this.this$0.c0;
                    dr5Var.getClass();
                    dr5Var.h.setVisibility(z ? 0 : 8);
                    if (z) {
                        this.this$0.getClass();
                        ((qbc) pnb.B(this.this$0).a(null, fwc.a.b(qbc.class), null)).e();
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0197a(IanMainFragment ianMainFragment, lu2<? super C0197a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ianMainFragment;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0197a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0197a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    nde ndeVarD = ((obc) pnb.B(this.this$0).a(null, fwc.a.b(obc.class), null)).d();
                    C0198a c0198a = new C0198a(this.this$0, null);
                    this.label = 1;
                    Object objQ = wg2.q(ndeVarD, c0198a, this);
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
            u63.Y(e13Var, null, null, new C0197a(this.this$0, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq6(IanMainFragment ianMainFragment, lu2<? super cq6> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ianMainFragment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new cq6(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((cq6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
