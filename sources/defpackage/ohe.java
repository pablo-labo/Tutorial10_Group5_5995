package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
public final class ohe extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Object $curData;
    final /* synthetic */ Function2<Object, lu2<Object>, Object> $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ohe(Function2<Object, ? super lu2<Object>, ? extends Object> function2, Object obj, lu2<? super ohe> lu2Var) {
        super(2, lu2Var);
        this.$transform = function2;
        this.$curData = obj;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ohe(this.$transform, this.$curData, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((ohe) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        Function2<Object, lu2<Object>, Object> function2 = this.$transform;
        Object obj2 = this.$curData;
        this.label = 1;
        Object objInvoke = function2.invoke(obj2, this);
        g13 g13Var = g13.a;
        return objInvoke == g13Var ? g13Var : objInvoke;
    }
}
