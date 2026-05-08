package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {146}, m = "invokeSuspend")
public final class zqc extends c1f implements Function2<e13, lu2<? super d37>, Object> {
    final /* synthetic */ v27 $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ frc this$0;

    @uh3(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {139}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super d37>, Object> {
        final /* synthetic */ v27 $request;
        int label;
        final /* synthetic */ frc this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, v27 v27Var, frc frcVar) {
            super(2, lu2Var);
            this.this$0 = frcVar;
            this.$request = v27Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(lu2Var, this.$request, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super d37> lu2Var) {
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
            frc frcVar = this.this$0;
            v27 v27Var = this.$request;
            this.label = 1;
            Object objA = frc.a(frcVar, v27Var, 1, this);
            g13 g13Var = g13.a;
            return objA == g13Var ? g13Var : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqc(lu2 lu2Var, v27 v27Var, frc frcVar) {
        super(2, lu2Var);
        this.$request = v27Var;
        this.this$0 = frcVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        zqc zqcVar = new zqc(lu2Var, this.$request, this.this$0);
        zqcVar.L$0 = obj;
        return zqcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super d37> lu2Var) {
        return ((zqc) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        yr3 yr3VarL = u63.l(e13Var, m89.a.J1(), new a(null, this.$request, this.this$0), 2);
        this.$request.getClass();
        this.label = 1;
        Object objO = yr3VarL.o(this);
        g13 g13Var = g13.a;
        return objO == g13Var ? g13Var : objO;
    }
}
