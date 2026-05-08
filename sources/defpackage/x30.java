package defpackage;

import defpackage.z30;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {283}, m = "invokeSuspend")
public final class x30 extends c1f implements wu5<z20, pa4<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<na4, lu2<? super j6g>, Object> $block;
    int label;
    final /* synthetic */ z30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x30(z30 z30Var, Function2<? super na4, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super x30> lu2Var) {
        super(3, lu2Var);
        this.this$0 = z30Var;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            z30.a aVar = this.this$0.a;
            Function2<na4, lu2<? super j6g>, Object> function2 = this.$block;
            this.label = 1;
            Object objInvoke = function2.invoke(aVar, this);
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

    @Override // defpackage.wu5
    public final Object q(z20 z20Var, pa4<Object> pa4Var, lu2<? super j6g> lu2Var) {
        return new x30(this.this$0, this.$block, lu2Var).invokeSuspend(j6g.a);
    }
}
