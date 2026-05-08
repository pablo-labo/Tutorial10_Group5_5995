package defpackage;

import defpackage.k1f;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {860}, m = "withTimeoutOrNull")
public final class j1f<T> extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k1f.a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1f(k1f.a aVar, x81 x81Var) {
        super(x81Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.P1(0L, null, this);
    }
}
