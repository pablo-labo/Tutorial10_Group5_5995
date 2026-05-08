package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {643}, m = "invokeSuspend")
public final class vm3 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<na4, lu2<? super j6g>, Object> $block;
    final /* synthetic */ n4a $dragPriority;
    int label;
    final /* synthetic */ xm3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vm3(xm3 xm3Var, n4a n4aVar, Function2<? super na4, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super vm3> lu2Var) {
        super(2, lu2Var);
        this.this$0 = xm3Var;
        this.$dragPriority = n4aVar;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new vm3(this.this$0, this.$dragPriority, this.$block, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((vm3) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xm3 xm3Var = this.this$0;
            y4a y4aVar = xm3Var.c;
            wm3 wm3Var = xm3Var.b;
            n4a n4aVar = this.$dragPriority;
            Function2<na4, lu2<? super j6g>, Object> function2 = this.$block;
            this.label = 1;
            y4aVar.getClass();
            Object objD = f13.d(new x4a(n4aVar, y4aVar, function2, wm3Var, null), this);
            g13 g13Var = g13.a;
            if (objD == g13Var) {
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
