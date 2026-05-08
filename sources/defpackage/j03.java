package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {342}, m = "invokeSuspend")
public final class j03 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ fn1 $bringIntoViewRequester;
    final /* synthetic */ nif $layoutResult;
    final /* synthetic */ roa $offsetMapping;
    final /* synthetic */ lu8 $state;
    final /* synthetic */ jhf $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j03(fn1 fn1Var, jhf jhfVar, lu8 lu8Var, nif nifVar, roa roaVar, lu2<? super j03> lu2Var) {
        super(2, lu2Var);
        this.$bringIntoViewRequester = fn1Var;
        this.$value = jhfVar;
        this.$state = lu8Var;
        this.$layoutResult = nifVar;
        this.$offsetMapping = roaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new j03(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((j03) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            fn1 fn1Var = this.$bringIntoViewRequester;
            jhf jhfVar = this.$value;
            qdf qdfVar = this.$state.a;
            mif mifVar = this.$layoutResult.a;
            roa roaVar = this.$offsetMapping;
            this.label = 1;
            int iC = roaVar.c(kjf.e(jhfVar.b));
            Object objA = fn1Var.a(iC < mifVar.a.a.b.length() ? mifVar.b(iC) : iC != 0 ? mifVar.b(iC - 1) : new qtc(0.0f, 0.0f, 1.0f, (int) (kef.a(qdfVar.b, qdfVar.g, qdfVar.h, kef.a, 1) & 4294967295L)), this);
            g13 g13Var = g13.a;
            if (objA != g13Var) {
                objA = j6g.a;
            }
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
