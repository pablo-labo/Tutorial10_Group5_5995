package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", f = "Scrollable.kt", l = {357}, m = "invokeSuspend")
public final class ksd extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ jsd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksd(jsd jsdVar, long j, lu2<? super ksd> lu2Var) {
        super(2, lu2Var);
        this.this$0 = jsdVar;
        this.$velocity = j;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ksd(this.this$0, this.$velocity, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ksd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xsd xsdVar = this.this$0.t0;
            long j = this.$velocity;
            this.label = 1;
            Object objB = xsdVar.b(j, true, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
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
