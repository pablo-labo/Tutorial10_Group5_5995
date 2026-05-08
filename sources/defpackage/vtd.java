package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayComponentsKt$SearchOverlayTextInput$3$1", f = "SearchOverlayComponents.kt", l = {}, m = "invokeSuspend")
public final class vtd extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<jhf> $textFieldValue$delegate;
    final /* synthetic */ String $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtd(String str, g4a<jhf> g4aVar, lu2<? super vtd> lu2Var) {
        super(2, lu2Var);
        this.$value = str;
        this.$textFieldValue$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new vtd(this.$value, this.$textFieldValue$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((vtd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        long jC;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (!wl7.b(this.$value, this.$textFieldValue$delegate.getValue().a.b)) {
            if (zve.U(this.$value)) {
                jC = kjf.b;
            } else {
                int length = this.$value.length();
                jC = cr8.c(length, length);
            }
            this.$textFieldValue$delegate.setValue(new jhf(this.$value, jC, 4));
        }
        return j6g.a;
    }
}
