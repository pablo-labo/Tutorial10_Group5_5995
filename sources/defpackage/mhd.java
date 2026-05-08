package defpackage;

import defpackage.o7d;
import defpackage.qu2;
import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
public final class mhd extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Function2<e13, lu2<Object>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Function2<e13, lu2<Object>, Object> $block;
        final /* synthetic */ xd2<Object> $deferred;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xd2<Object> xd2Var, Function2<? super e13, ? super lu2<Object>, ? extends Object> function2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$deferred = xd2Var;
            this.$block = function2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$deferred, this.$block, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            xd2<Object> xd2Var;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                e13 e13Var = (e13) this.L$0;
                xd2<Object> xd2Var2 = this.$deferred;
                Function2<e13, lu2<Object>, Object> function2 = this.$block;
                try {
                    this.L$0 = xd2Var2;
                    this.label = 1;
                    obj = function2.invoke(e13Var, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                    xd2Var = xd2Var2;
                } catch (Throwable th) {
                    th = th;
                    xd2Var = xd2Var2;
                    obj = new o7d.a(th);
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xd2Var = (xd2) this.L$0;
                try {
                    r7d.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    obj = new o7d.a(th);
                }
            }
            Throwable thA = o7d.a(obj);
            if (thA == null) {
                xd2Var.j0(obj);
            } else {
                xd2Var.h0(thA);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<Object>, Object> {
        final /* synthetic */ xd2<Object> $deferred;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xd2<Object> xd2Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$deferred = xd2Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$deferred, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
            xd2<Object> xd2Var = this.$deferred;
            this.label = 1;
            Object objN1 = xd2Var.n1(this);
            g13 g13Var = g13.a;
            return objN1 == g13Var ? g13Var : objN1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mhd(Function2<? super e13, ? super lu2<Object>, ? extends Object> function2, lu2<? super mhd> lu2Var) {
        super(2, lu2Var);
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        mhd mhdVar = new mhd(this.$block, lu2Var);
        mhdVar.L$0 = obj;
        return mhdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((mhd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        v03.a aVarH1 = ((e13) this.L$0).getCoroutineContext().h1(qu2.a.a);
        aVarH1.getClass();
        qu2 qu2Var = (qu2) aVarH1;
        yd2 yd2VarE = hh1.e();
        u63.X(ba6.a, qu2Var, i13.d, new a(yd2VarE, this.$block, null));
        while (!yd2VarE.o0()) {
            try {
                return u63.i0(qu2Var, new b(yd2VarE, null));
            } catch (InterruptedException unused) {
            }
        }
        return yd2VarE.C();
    }
}
