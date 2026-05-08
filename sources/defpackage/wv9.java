package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", l = {330}, m = "invokeSuspend")
public final class wv9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hee $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv9(hee heeVar, lu2<? super wv9> lu2Var) {
        super(2, lu2Var);
        this.$this_with = heeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new wv9(this.$this_with, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wv9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            hee heeVar = this.$this_with;
            this.label = 1;
            Object objD = heeVar.d(this);
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
