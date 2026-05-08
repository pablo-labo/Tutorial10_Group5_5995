package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
public final class lgf extends c1f implements Function1<lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ rgf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgf(rgf rgfVar, lu2<? super lgf> lu2Var) {
        super(1, lu2Var);
        this.this$0 = rgfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new lgf(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((lgf) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.this$0.B = false;
        return j6g.a;
    }
}
