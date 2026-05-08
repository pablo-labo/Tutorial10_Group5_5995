package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {861}, m = "invokeSuspend")
public final class wsd extends c1f implements Function2<xrd, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<afa, lu2<? super j6g>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xsd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsd(lu2 lu2Var, xsd xsdVar, Function2 function2) {
        super(2, lu2Var);
        this.this$0 = xsdVar;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        wsd wsdVar = new wsd(lu2Var, this.this$0, this.$block);
        wsdVar.L$0 = obj;
        return wsdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xrd xrdVar, lu2<? super j6g> lu2Var) {
        return ((wsd) create(xrdVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xrd xrdVar = (xrd) this.L$0;
            xsd xsdVar = this.this$0;
            xsdVar.k = xrdVar;
            Function2<afa, lu2<? super j6g>, Object> function2 = this.$block;
            usd usdVar = xsdVar.l;
            this.label = 1;
            Object objInvoke = function2.invoke(usdVar, this);
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
