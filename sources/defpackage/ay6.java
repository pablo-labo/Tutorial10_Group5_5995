package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.ifl.components.IdlSuggestListKt$InternalSuggestList$2$1", f = "IdlSuggestList.kt", l = {}, m = "invokeSuspend")
public final class ay6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ g4a<Boolean> $shouldRefocus$delegate;
    final /* synthetic */ sm5 $textInputFocusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay6(boolean z, sm5 sm5Var, g4a<Boolean> g4aVar, lu2<? super ay6> lu2Var) {
        super(2, lu2Var);
        this.$isExpanded = z;
        this.$textInputFocusRequester = sm5Var;
        this.$shouldRefocus$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ay6(this.$isExpanded, this.$textInputFocusRequester, this.$shouldRefocus$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ay6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (!this.$isExpanded && this.$shouldRefocus$delegate.getValue().booleanValue()) {
            sm5.b(this.$textInputFocusRequester);
            this.$shouldRefocus$delegate.setValue(Boolean.FALSE);
        }
        return j6g.a;
    }
}
