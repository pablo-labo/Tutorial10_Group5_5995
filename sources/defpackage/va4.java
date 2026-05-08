package defpackage;

import defpackage.v94;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {303}, m = "invokeSuspend")
public final class va4 extends c1f implements Function2<na4, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<Function1<? super v94.b, j6g>, lu2<? super j6g>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wa4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public va4(Function2<? super Function1<? super v94.b, j6g>, ? super lu2<? super j6g>, ? extends Object> function2, wa4 wa4Var, lu2<? super va4> lu2Var) {
        super(2, lu2Var);
        this.$forEachDelta = function2;
        this.this$0 = wa4Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        va4 va4Var = new va4(this.$forEachDelta, this.this$0, lu2Var);
        va4Var.L$0 = obj;
        return va4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(na4 na4Var, lu2<? super j6g> lu2Var) {
        return ((va4) create(na4Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            r7d.b(obj);
            na4 na4Var = (na4) this.L$0;
            Function2<Function1<? super v94.b, j6g>, lu2<? super j6g>, Object> function2 = this.$forEachDelta;
            o72 o72Var = new o72(i2, na4Var, this.this$0);
            this.label = 1;
            Object objInvoke = function2.invoke(o72Var, this);
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
