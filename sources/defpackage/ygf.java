package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2", f = "TextFieldSelectionManager.android.kt", l = {}, m = "invokeSuspend")
public final class ygf extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ rgf $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygf(rgf rgfVar, lu2<? super ygf> lu2Var) {
        super(1, lu2Var);
        this.$this_with = rgfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new ygf(this.$this_with, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((ygf) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        rgf rgfVar = this.$this_with;
        rgfVar.d(rgfVar.B);
        return j6g.a;
    }
}
