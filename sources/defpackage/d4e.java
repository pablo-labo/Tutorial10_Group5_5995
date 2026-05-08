package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$1", f = "SelectionManager.kt", l = {180}, m = "invokeSuspend")
public final class d4e extends c1f implements Function1<lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ j4e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4e(j4e j4eVar, lu2<? super d4e> lu2Var) {
        super(1, lu2Var);
        this.this$0 = j4eVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new d4e(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((d4e) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            j4e j4eVar = this.this$0;
            this.label = 1;
            Object objA = j4e.a(j4eVar, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
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
