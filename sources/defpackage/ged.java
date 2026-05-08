package defpackage;

import defpackage.kv8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.rnmessaging.RnMessagingFragment$observeMessageReceived$1", f = "RnMessagingFragment.kt", l = {343}, m = "invokeSuspend")
public final class ged extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ hed this$0;

    @uh3(c = "com.indeed.android.rnmessaging.RnMessagingFragment$observeMessageReceived$1$1", f = "RnMessagingFragment.kt", l = {344}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;
        final /* synthetic */ hed this$0;

        /* JADX INFO: renamed from: ged$a$a, reason: collision with other inner class name */
        public static final class C0249a<T> implements wi5 {
            public final /* synthetic */ hed a;

            public C0249a(hed hedVar) {
                this.a = hedVar;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                hed hedVar = this.a;
                hedVar.getClass();
                ked.a(hedVar, "RnMessagingFragment");
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hed hedVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = hedVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            nde ndeVarE = ((w1g) cr8.p(w1g.class)).e();
            C0249a c0249a = new C0249a(this.this$0);
            this.label = 1;
            ndeVarE.e(c0249a, this);
            return g13.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ged(hed hedVar, lu2<? super ged> lu2Var) {
        super(2, lu2Var);
        this.this$0 = hedVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ged(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ged) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
            Object objB = c2d.b(viewLifecycleOwner, kv8.b.d, aVar, this);
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
