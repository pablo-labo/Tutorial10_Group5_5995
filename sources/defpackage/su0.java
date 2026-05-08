package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend")
public final class su0 extends c1f implements Function1<lu2<? super Object>, Object> {
    final /* synthetic */ jn5 $font;
    int label;
    final /* synthetic */ vu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su0(vu0 vu0Var, jn5 jn5Var, lu2<? super su0> lu2Var) {
        super(1, lu2Var);
        this.this$0 = vu0Var;
        this.$font = jn5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new su0(this.this$0, this.$font, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super Object> lu2Var) {
        return ((su0) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        vu0 vu0Var = this.this$0;
        jn5 jn5Var = this.$font;
        this.label = 1;
        Object objN = vu0Var.n(jn5Var, this);
        g13 g13Var = g13.a;
        return objN == g13Var ? g13Var : objN;
    }
}
