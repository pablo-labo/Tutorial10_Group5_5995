package defpackage;

import defpackage.kv8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.fsdv.FsdvWebViewFragment$handlePageLoadStarted$1", f = "FsdvWebViewFragment.kt", l = {631}, m = "invokeSuspend")
public final class rt5 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ ut5 this$0;

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.fsdv.FsdvWebViewFragment$handlePageLoadStarted$1$1", f = "FsdvWebViewFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ut5 this$0;

        /* JADX INFO: renamed from: rt5$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.bottomnav.fsdv.FsdvWebViewFragment$handlePageLoadStarted$1$1$1", f = "FsdvWebViewFragment.kt", l = {}, m = "invokeSuspend")
        public static final class C0412a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ ut5 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0412a(ut5 ut5Var, lu2<? super C0412a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ut5Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0412a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0412a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                if (((ik3) this.this$0.d0.getValue()).b) {
                    ArrayList arrayList = lz2.a;
                    lz2.d("FsdvWebViewFragment", "UIPContext.deeplink.notifyDeepLinkLoadCompleted())", false, null);
                    ((c1g) cr8.p(c1g.class)).a();
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ut5 ut5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ut5Var;
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
            u63.Y(e13Var, null, null, new C0412a(this.this$0, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt5(ut5 ut5Var, lu2<? super rt5> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ut5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new rt5(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((rt5) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
