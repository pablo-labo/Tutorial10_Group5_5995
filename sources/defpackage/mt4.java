package defpackage;

import defpackage.vt4;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {120}, m = "invokeSuspend")
public final class mt4 extends c1f implements Function2<e13, lu2<? super vt4.a>, Object> {
    final /* synthetic */ luc<og2> $components;
    final /* synthetic */ cz4 $eventListener;
    final /* synthetic */ luc<l85> $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ luc<nva> $options;
    final /* synthetic */ w27 $request;
    int label;
    final /* synthetic */ vt4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt4(vt4 vt4Var, luc<l85> lucVar, luc<og2> lucVar2, w27 w27Var, Object obj, luc<nva> lucVar3, cz4 cz4Var, lu2<? super mt4> lu2Var) {
        super(2, lu2Var);
        this.this$0 = vt4Var;
        this.$fetchResult = lucVar;
        this.$components = lucVar2;
        this.$request = w27Var;
        this.$mappedData = obj;
        this.$options = lucVar3;
        this.$eventListener = cz4Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new mt4(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super vt4.a> lu2Var) {
        return ((mt4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        vt4 vt4Var = this.this$0;
        rne rneVar = (rne) this.$fetchResult.element;
        og2 og2Var = this.$components.element;
        w27 w27Var = this.$request;
        Object obj2 = this.$mappedData;
        nva nvaVar = this.$options.element;
        cz4 cz4Var = this.$eventListener;
        this.label = 1;
        Object objB = vt4.b(vt4Var, rneVar, og2Var, w27Var, obj2, nvaVar, cz4Var, this);
        g13 g13Var = g13.a;
        return objB == g13Var ? g13Var : objB;
    }
}
