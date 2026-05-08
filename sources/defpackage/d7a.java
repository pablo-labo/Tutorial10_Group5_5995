package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$4$1", f = "MyJobsScreen.kt", l = {577}, m = "invokeSuspend")
public final class d7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ e8a $myJobsViewModel;
    final /* synthetic */ g4a<j7f> $selectedFilter$delegate;
    int label;

    @uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$4$1$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<Integer, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<j7f> $selectedFilter$delegate;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g4a<j7f> g4aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$selectedFilter$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$selectedFilter$delegate, lu2Var);
            aVar.I$0 = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, lu2<? super j6g> lu2Var) {
            return ((a) create(Integer.valueOf(num.intValue()), lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.I$0
                int r1 = r8.label
                if (r1 != 0) goto L3f
                defpackage.r7d.b(r9)
                g4a<j7f> r8 = r8.$selectedFilter$delegate
                boolean r9 = defpackage.i6a.i()
                j7f r1 = defpackage.j7f.c
                j7f r2 = defpackage.j7f.d
                j7f r3 = defpackage.j7f.e
                j7f r4 = defpackage.j7f.a
                r5 = 3
                r6 = 2
                r7 = 1
                if (r9 == 0) goto L30
                if (r0 == 0) goto L27
                if (r0 == r7) goto L2d
                if (r0 == r6) goto L39
                if (r0 == r5) goto L2b
                r9 = 4
                if (r0 == r9) goto L29
            L27:
                r1 = r4
                goto L39
            L29:
                r1 = r3
                goto L39
            L2b:
                r1 = r2
                goto L39
            L2d:
                j7f r1 = defpackage.j7f.b
                goto L39
            L30:
                if (r0 == 0) goto L27
                if (r0 == r7) goto L39
                if (r0 == r6) goto L2b
                if (r0 == r5) goto L29
                goto L27
            L39:
                r8.setValue(r1)
                j6g r8 = defpackage.j6g.a
                return r8
            L3f:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: d7a.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7a(e8a e8aVar, g4a<j7f> g4aVar, lu2<? super d7a> lu2Var) {
        super(2, lu2Var);
        this.$myJobsViewModel = e8aVar;
        this.$selectedFilter$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new d7a(this.$myJobsViewModel, this.$selectedFilter$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((d7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            if (i6a.o()) {
                nde ndeVar = this.$myJobsViewModel.d;
                a aVar = new a(this.$selectedFilter$delegate, null);
                this.label = 1;
                Object objQ = wg2.q(ndeVar, aVar, this);
                g13 g13Var = g13.a;
                if (objQ == g13Var) {
                    return g13Var;
                }
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
