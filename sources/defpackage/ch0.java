package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.onegraph.tasks.ApolloApiExecutor$execute$response$2", f = "ApolloApiExecutor.kt", l = {52}, m = "invokeSuspend")
public final class ch0 extends c1f implements Function2<e13, lu2<? super sh0<Object>>, Object> {
    final /* synthetic */ p4a<Object> $mutation;
    int label;
    final /* synthetic */ ah0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch0(ah0 ah0Var, p4a<Object> p4aVar, lu2<? super ch0> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ah0Var;
        this.$mutation = p4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ch0(this.this$0, this.$mutation, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super sh0<Object>> lu2Var) {
        return ((ch0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        lh0 lh0Var = this.this$0.a;
        p4a<Object> p4aVar = this.$mutation;
        lh0Var.getClass();
        p4aVar.getClass();
        kh0 kh0Var = new kh0(lh0Var, p4aVar);
        this.label = 1;
        Object objB = kh0Var.b(this);
        g13 g13Var = g13.a;
        return objB == g13Var ? g13Var : objB;
    }
}
