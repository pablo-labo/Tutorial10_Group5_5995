package defpackage;

import defpackage.qu2;
import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class afd implements Runnable {
    public final /* synthetic */ v03 a;
    public final /* synthetic */ qw1 b;
    public final /* synthetic */ xed c;
    public final /* synthetic */ cfd d;

    @uh3(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2017}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ pw1<Object> $continuation;
        final /* synthetic */ xed $this_startTransactionCoroutine;
        final /* synthetic */ Function2<e13, lu2<Object>, Object> $transactionBlock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xed xedVar, pw1<Object> pw1Var, Function2<? super e13, ? super lu2<Object>, ? extends Object> function2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$this_startTransactionCoroutine = xedVar;
            this.$continuation = pw1Var;
            this.$transactionBlock = function2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            lu2 lu2Var;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                v03.a aVarH1 = ((e13) this.L$0).getCoroutineContext().h1(qu2.a.a);
                aVarH1.getClass();
                qu2 qu2Var = (qu2) aVarH1;
                xed xedVar = this.$this_startTransactionCoroutine;
                arf arfVar = new arf(qu2Var);
                v03 v03VarD1 = qu2Var.d1(arfVar).d1(new tkf(Integer.valueOf(System.identityHashCode(arfVar)), xedVar.i));
                pw1<Object> pw1Var = this.$continuation;
                Function2<e13, lu2<Object>, Object> function2 = this.$transactionBlock;
                this.L$0 = pw1Var;
                this.label = 1;
                obj = u63.q0(v03VarD1, function2, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
                lu2Var = pw1Var;
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lu2Var = (lu2) this.L$0;
                r7d.b(obj);
            }
            lu2Var.resumeWith(obj);
            return j6g.a;
        }
    }

    public afd(v03 v03Var, qw1 qw1Var, xed xedVar, cfd cfdVar) {
        this.a = v03Var;
        this.b = qw1Var;
        this.c = xedVar;
        this.d = cfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qw1 qw1Var = this.b;
        try {
            u63.i0(this.a.P(qu2.a.a), new a(this.c, qw1Var, this.d, null));
        } catch (Throwable th) {
            qw1Var.g(th);
        }
    }
}
