package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", f = "ProduceState.kt", l = {204}, m = "invokeSuspend")
public final class mme extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<mpb<Object>, lu2<? super j6g>, Object> $producer;
    final /* synthetic */ g4a<Object> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mme(Function2<? super mpb<Object>, ? super lu2<? super j6g>, ? extends Object> function2, g4a<Object> g4aVar, lu2<? super mme> lu2Var) {
        super(2, lu2Var);
        this.$producer = function2;
        this.$result = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        mme mmeVar = new mme(this.$producer, this.$result, lu2Var);
        mmeVar.L$0 = obj;
        return mmeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mme) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            e13 e13Var = (e13) this.L$0;
            Function2<mpb<Object>, lu2<? super j6g>, Object> function2 = this.$producer;
            npb npbVar = new npb(this.$result, e13Var.getCoroutineContext());
            this.label = 1;
            Object objInvoke = function2.invoke(npbVar, this);
            g13 g13Var = g13.a;
            if (objInvoke == g13Var) {
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
