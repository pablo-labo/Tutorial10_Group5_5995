package defpackage;

import defpackage.ht4;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {127}, m = "invokeSuspend")
public final class nt4 extends c1f implements Function2<e13, lu2<? super ht4.a>, Object> {
    final /* synthetic */ luc<ng2> $components;
    final /* synthetic */ bz4 $eventListener;
    final /* synthetic */ luc<m85> $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ luc<qva> $options;
    final /* synthetic */ v27 $request;
    int label;
    final /* synthetic */ ht4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt4(ht4 ht4Var, luc<m85> lucVar, luc<ng2> lucVar2, v27 v27Var, Object obj, luc<qva> lucVar3, bz4 bz4Var, lu2<? super nt4> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ht4Var;
        this.$fetchResult = lucVar;
        this.$components = lucVar2;
        this.$request = v27Var;
        this.$mappedData = obj;
        this.$options = lucVar3;
        this.$eventListener = bz4Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new nt4(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super ht4.a> lu2Var) {
        return ((nt4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        ht4 ht4Var = this.this$0;
        zne zneVar = (zne) this.$fetchResult.element;
        ng2 ng2Var = this.$components.element;
        v27 v27Var = this.$request;
        Object obj2 = this.$mappedData;
        qva qvaVar = this.$options.element;
        bz4 bz4Var = this.$eventListener;
        this.label = 1;
        Object objB = ht4.b(ht4Var, zneVar, ng2Var, v27Var, obj2, qvaVar, bz4Var, this);
        g13 g13Var = g13.a;
        return objB == g13Var ? g13Var : objB;
    }
}
