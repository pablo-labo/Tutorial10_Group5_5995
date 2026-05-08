package defpackage;

import defpackage.v94;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {340}, m = "invokeSuspend")
public final class hsd extends c1f implements Function2<afa, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<Function1<? super v94.b, j6g>, lu2<? super j6g>, Object> $forEachDelta;
    final /* synthetic */ xsd $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsd(lu2 lu2Var, xsd xsdVar, Function2 function2) {
        super(2, lu2Var);
        this.$forEachDelta = function2;
        this.$this_with = xsdVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        hsd hsdVar = new hsd(lu2Var, this.$this_with, this.$forEachDelta);
        hsdVar.L$0 = obj;
        return hsdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(afa afaVar, lu2<? super j6g> lu2Var) {
        return ((hsd) create(afaVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            afa afaVar = (afa) this.L$0;
            Function2<Function1<? super v94.b, j6g>, lu2<? super j6g>, Object> function2 = this.$forEachDelta;
            wj4 wj4Var = new wj4(7, afaVar, this.$this_with);
            this.label = 1;
            Object objInvoke = function2.invoke(wj4Var, this);
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
