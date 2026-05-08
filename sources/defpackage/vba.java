package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.NavMenuImpl$5", f = "NavMenuImpl.kt", l = {98}, m = "invokeSuspend")
public final class vba extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ e13 $ioScope;
    int label;
    final /* synthetic */ yba this$0;

    @uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.NavMenuImpl$5$1", f = "NavMenuImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<y49, lu2<? super j6g>, Object> {
        final /* synthetic */ e13 $ioScope;
        int label;
        final /* synthetic */ yba this$0;

        /* JADX INFO: renamed from: vba$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.NavMenuImpl$5$1$1", f = "NavMenuImpl.kt", l = {103}, m = "invokeSuspend")
        public static final class C0450a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ yba this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0450a(yba ybaVar, lu2<? super C0450a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ybaVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0450a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0450a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    yba ybaVar = this.this$0;
                    yba.f(ybaVar, ybaVar.g().h());
                    yba ybaVar2 = this.this$0;
                    yba.e(ybaVar2, ybaVar2.g().a());
                    yba ybaVar3 = this.this$0;
                    bo0 bo0Var = new bo0(15);
                    this.label = 1;
                    Object objH = yba.h(ybaVar3, bo0Var, null, this, 2);
                    g13 g13Var = g13.a;
                    if (objH == g13Var) {
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
        public a(lu2 lu2Var, e13 e13Var, yba ybaVar) {
            super(2, lu2Var);
            this.$ioScope = e13Var;
            this.this$0 = ybaVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(lu2Var, this.$ioScope, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(y49 y49Var, lu2<? super j6g> lu2Var) {
            return ((a) create(y49Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            u63.Y(this.$ioScope, null, null, new C0450a(this.this$0, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vba(lu2 lu2Var, e13 e13Var, yba ybaVar) {
        super(2, lu2Var);
        this.this$0 = ybaVar;
        this.$ioScope = e13Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new vba(lu2Var, this.$ioScope, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((vba) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            nde ndeVarA = ((t49) this.this$0.b.getValue()).a();
            a aVar = new a(null, this.$ioScope, this.this$0);
            this.label = 1;
            Object objQ = wg2.q(ndeVarA, aVar, this);
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
