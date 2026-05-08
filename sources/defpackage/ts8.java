package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
public final class ts8 extends c1f implements Function2<xrd, lu2<? super j6g>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ ss8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts8(ss8 ss8Var, int i, int i2, lu2<? super ts8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ss8Var;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ts8(this.this$0, this.$index, this.$scrollOffset, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xrd xrdVar, lu2<? super j6g> lu2Var) {
        return ((ts8) create(xrdVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.this$0.l(this.$index, this.$scrollOffset);
        return j6g.a;
    }
}
