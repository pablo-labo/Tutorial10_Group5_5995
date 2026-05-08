package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$9$1", f = "MyJobsScreen.kt", l = {656}, m = "invokeSuspend")
public final class i7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ e8a $myJobsViewModel;
    final /* synthetic */ e2b $pagerState;
    final /* synthetic */ g4a<j7f> $selectedFilter$delegate;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ e2b a;
        public final /* synthetic */ g4a<j7f> b;

        /* JADX INFO: renamed from: i7a$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$9$1$1", f = "MyJobsScreen.kt", l = {657}, m = "emit")
        public static final class C0265a extends pu2 {
            int I$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0265a(a<? super T> aVar, lu2<? super C0265a> lu2Var) {
                super(lu2Var);
                this.this$0 = aVar;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.c(0, this);
            }
        }

        public a(e2b e2bVar, g4a<j7f> g4aVar) {
            this.a = e2bVar;
            this.b = g4aVar;
        }

        @Override // defpackage.wi5
        public final /* bridge */ /* synthetic */ Object a(Object obj, lu2 lu2Var) {
            return c(((Number) obj).intValue(), lu2Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(int r5, defpackage.lu2<? super defpackage.j6g> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof i7a.a.C0265a
                if (r0 == 0) goto L13
                r0 = r6
                i7a$a$a r0 = (i7a.a.C0265a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                i7a$a$a r0 = new i7a$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                int r1 = r0.label
                e2b r2 = r4.a
                r3 = 1
                if (r1 == 0) goto L2e
                if (r1 != r3) goto L27
                defpackage.r7d.b(r6)
                goto L3e
            L27:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                r4 = 0
                return r4
            L2e:
                defpackage.r7d.b(r6)
                r0.I$0 = r5
                r0.label = r3
                java.lang.Object r5 = defpackage.e2b.v(r2, r5, r0)
                g13 r6 = defpackage.g13.a
                if (r5 != r6) goto L3e
                return r6
            L3e:
                int r5 = r2.k()
                j7f r5 = defpackage.u63.M(r5)
                g4a<j7f> r4 = r4.b
                r4.setValue(r5)
                j6g r4 = defpackage.j6g.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: i7a.a.c(int, lu2):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7a(e8a e8aVar, e2b e2bVar, g4a<j7f> g4aVar, lu2<? super i7a> lu2Var) {
        super(2, lu2Var);
        this.$myJobsViewModel = e8aVar;
        this.$pagerState = e2bVar;
        this.$selectedFilter$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i7a(this.$myJobsViewModel, this.$pagerState, this.$selectedFilter$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
        ((i7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        nde ndeVar = this.$myJobsViewModel.d;
        a aVar = new a(this.$pagerState, this.$selectedFilter$delegate);
        this.label = 1;
        ndeVar.getClass();
        nde.o(ndeVar, aVar, this);
        return g13.a;
    }
}
