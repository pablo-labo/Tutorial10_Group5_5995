package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$1$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
public final class z6a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ude $sharedViewModel;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$1$1$1", f = "MyJobsScreen.kt", l = {490}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ude $sharedViewModel;
        int label;

        /* JADX INFO: renamed from: z6a$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$1$1$1$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
        public static final class C0487a extends c1f implements Function2<vde, lu2<? super j6g>, Object> {
            int label;

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0487a(2, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vde vdeVar, lu2<? super j6g> lu2Var) {
                return ((C0487a) create(vdeVar, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ude udeVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$sharedViewModel = udeVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$sharedViewModel, lu2Var);
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
                gse gseVar = this.$sharedViewModel.c;
                C0487a c0487a = new C0487a(2, null);
                this.label = 1;
                Object objQ = wg2.q(gseVar, c0487a, this);
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
    public z6a(ude udeVar, lu2<? super z6a> lu2Var) {
        super(2, lu2Var);
        this.$sharedViewModel = udeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        z6a z6aVar = new z6a(this.$sharedViewModel, lu2Var);
        z6aVar.L$0 = obj;
        return z6aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((z6a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        e13 e13Var = (e13) this.L$0;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        u63.Y(e13Var, null, null, new a(this.$sharedViewModel, null), 3);
        return j6g.a;
    }
}
