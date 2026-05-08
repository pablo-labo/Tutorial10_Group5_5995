package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {315}, m = "invokeSuspend")
public final class uu0 extends c1f implements Function2<e13, lu2<? super Object>, Object> {
    final /* synthetic */ jn5 $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ vu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(vu0 vu0Var, jn5 jn5Var, lu2<? super uu0> lu2Var) {
        super(2, lu2Var);
        this.this$0 = vu0Var;
        this.$this_loadWithTimeoutOrNull = jn5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new uu0(this.this$0, this.$this_loadWithTimeoutOrNull, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super Object> lu2Var) {
        return ((uu0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        o70 o70Var = this.this$0.e;
        jn5 jn5Var = this.$this_loadWithTimeoutOrNull;
        this.label = 1;
        Object objA = o70Var.a(jn5Var, this);
        g13 g13Var = g13.a;
        return objA == g13Var ? g13Var : objA;
    }
}
