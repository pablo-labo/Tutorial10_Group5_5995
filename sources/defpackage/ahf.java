package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1", f = "TextFieldSelectionManager.android.kt", l = {106}, m = "invokeSuspend")
public final class ahf extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<lu2<? super j6g>, Object> $onClick;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ahf(Function1<? super lu2<? super j6g>, ? extends Object> function1, lu2<? super ahf> lu2Var) {
        super(2, lu2Var);
        this.$onClick = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ahf(this.$onClick, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ahf) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            Function1<lu2<? super j6g>, Object> function1 = this.$onClick;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
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
