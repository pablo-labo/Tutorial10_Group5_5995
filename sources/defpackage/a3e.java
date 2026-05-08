package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1", f = "SelectionContainer.kt", l = {105}, m = "invokeSuspend")
public final class a3e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ y72 $clipboard;
    final /* synthetic */ le0 $textToCopy;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3e(y72 y72Var, le0 le0Var, lu2<? super a3e> lu2Var) {
        super(2, lu2Var);
        this.$clipboard = y72Var;
        this.$textToCopy = le0Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new a3e(this.$clipboard, this.$textToCopy, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((a3e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            y72 y72Var = this.$clipboard;
            x72 x72VarA = a82.a(this.$textToCopy);
            this.label = 1;
            j6g j6gVarB = y72Var.b(x72VarA);
            g13 g13Var = g13.a;
            if (j6gVarB == g13Var) {
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
