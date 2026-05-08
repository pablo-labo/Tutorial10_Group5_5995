package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {159}, m = "invokeSuspend")
public final class wn5 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ vu0 $asyncLoader;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn5(vu0 vu0Var, lu2<? super wn5> lu2Var) {
        super(2, lu2Var);
        this.$asyncLoader = vu0Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new wn5(this.$asyncLoader, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wn5) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            vu0 vu0Var = this.$asyncLoader;
            this.label = 1;
            Object objI = vu0Var.i(this);
            g13 g13Var = g13.a;
            if (objI == g13Var) {
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
