package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {83}, m = "invokeSuspend")
public final class yqc extends c1f implements Function2<e13, lu2<? super c37>, Object> {
    final /* synthetic */ w27 $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xqc this$0;

    @uh3(c = "coil3.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super c37>, Object> {
        final /* synthetic */ w27 $request;
        int label;
        final /* synthetic */ xqc this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, w27 w27Var, xqc xqcVar) {
            super(2, lu2Var);
            this.this$0 = xqcVar;
            this.$request = w27Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(lu2Var, this.$request, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super c37> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            xqc xqcVar = this.this$0;
            w27 w27Var = this.$request;
            this.label = 1;
            int i2 = xqc.f;
            Object objC = xqcVar.c(w27Var, 1, this);
            g13 g13Var = g13.a;
            return objC == g13Var ? g13Var : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqc(lu2 lu2Var, w27 w27Var, xqc xqcVar) {
        super(2, lu2Var);
        this.$request = w27Var;
        this.this$0 = xqcVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        yqc yqcVar = new yqc(lu2Var, this.$request, this.this$0);
        yqcVar.L$0 = obj;
        return yqcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super c37> lu2Var) {
        return ((yqc) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        e13 e13Var = (e13) this.L$0;
        eq3 eq3Var = a74.a;
        xr3<c37> xr3VarC = irc.a(this.$request, u63.l(e13Var, m89.a.J1(), new a(null, this.$request, this.this$0), 2)).c();
        this.label = 1;
        Object objN1 = xr3VarC.n1(this);
        g13 g13Var = g13.a;
        return objN1 == g13Var ? g13Var : objN1;
    }
}
