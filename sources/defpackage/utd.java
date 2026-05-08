package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayComponentsKt$SearchOverlayTextInput$2$1", f = "SearchOverlayComponents.kt", l = {}, m = "invokeSuspend")
public final class utd extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ sm5 $focusRequester;
    final /* synthetic */ boolean $isFocusedByDefault;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utd(boolean z, sm5 sm5Var, lu2<? super utd> lu2Var) {
        super(2, lu2Var);
        this.$isFocusedByDefault = z;
        this.$focusRequester = sm5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new utd(this.$isFocusedByDefault, this.$focusRequester, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((utd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$isFocusedByDefault) {
            sm5.b(this.$focusRequester);
        }
        return j6g.a;
    }
}
