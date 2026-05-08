package defpackage;

import androidx.compose.material3.internal.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", l = {321}, m = "invokeSuspend")
public final class uv9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hee $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv9(hee heeVar, lu2<? super uv9> lu2Var) {
        super(2, lu2Var);
        this.$sheetState = heeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new uv9(this.$sheetState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((uv9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            hee heeVar = this.$sheetState;
            this.label = 1;
            q30<jee> q30Var = heeVar.c;
            Object objB = a.b(q30Var, jee.b, ((cme) q30Var.l).g(), this);
            Object obj2 = g13.a;
            if (objB != obj2) {
                objB = j6g.a;
            }
            if (objB == obj2) {
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
