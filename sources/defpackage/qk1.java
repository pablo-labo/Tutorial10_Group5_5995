package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.navigation.BottomSheetNavigator$sheetContent$1$1$1", f = "BottomSheetNavigator.kt", l = {178}, m = "invokeSuspend")
public final class qk1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ pk1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk1(pk1 pk1Var, lu2<? super qk1> lu2Var) {
        super(2, lu2Var);
        this.this$0 = pk1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new qk1(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((qk1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            hw9 hw9Var = this.this$0.c;
            this.label = 1;
            Object objD = hw9Var.d(this);
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
