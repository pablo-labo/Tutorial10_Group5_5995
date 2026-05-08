package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {148}, m = "invokeSuspend")
public final class pv9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ float $it;
    final /* synthetic */ hee $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv9(hee heeVar, float f, lu2<? super pv9> lu2Var) {
        super(2, lu2Var);
        this.$sheetState = heeVar;
        this.$it = f;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new pv9(this.$sheetState, this.$it, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((pv9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            hee heeVar = this.$sheetState;
            float f = this.$it;
            this.label = 1;
            Object objJ = heeVar.c.j(f, this);
            Object obj2 = g13.a;
            if (objJ != obj2) {
                objJ = j6g.a;
            }
            if (objJ == obj2) {
                return obj2;
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
