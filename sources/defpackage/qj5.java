package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {91}, m = "invokeSuspend")
public final class qj5 extends c1f implements xu5<wi5<Object>, Throwable, Long, lu2<? super Boolean>, Object> {
    final /* synthetic */ Function2<Throwable, lu2<? super Boolean>, Object> $predicate;
    final /* synthetic */ long $retries;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qj5(long j, Function2<? super Throwable, ? super lu2<? super Boolean>, ? extends Object> function2, lu2<? super qj5> lu2Var) {
        super(4, lu2Var);
        this.$retries = j;
        this.$predicate = function2;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            Throwable th = (Throwable) this.L$0;
            if (this.J$0 < this.$retries) {
                Function2<Throwable, lu2<? super Boolean>, Object> function2 = this.$predicate;
                this.label = 1;
                obj = function2.invoke(th, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        boolean z = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xu5
    public final Object j(wi5<Object> wi5Var, Throwable th, Long l, lu2<? super Boolean> lu2Var) {
        long jLongValue = l.longValue();
        qj5 qj5Var = new qj5(this.$retries, this.$predicate, lu2Var);
        qj5Var.L$0 = th;
        qj5Var.J$0 = jLongValue;
        return qj5Var.invokeSuspend(j6g.a);
    }
}
