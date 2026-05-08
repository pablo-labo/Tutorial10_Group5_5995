package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.ifl.components.IdlToastKt$IdlToastCard$1$1$1", f = "IdlToast.kt", l = {296}, m = "invokeSuspend")
public final class pz6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<String> $accessibilityAnnoucement$delegate;
    final /* synthetic */ String $text;
    final /* synthetic */ String $title;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz6(String str, String str2, g4a<String> g4aVar, lu2<? super pz6> lu2Var) {
        super(2, lu2Var);
        this.$title = str;
        this.$text = str2;
        this.$accessibilityAnnoucement$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new pz6(this.$title, this.$text, this.$accessibilityAnnoucement$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((pz6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.label = 1;
            Object objB = ls3.b(500L, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.$accessibilityAnnoucement$delegate.setValue(z92.W0(ut0.i0(new String[]{this.$title, this.$text}), ". ", null, null, null, 62));
        return j6g.a;
    }
}
