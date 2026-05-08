package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
public final class to8 extends c1f implements Function2<xrd, lu2<? super j6g>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ so8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to8(so8 so8Var, int i, int i2, lu2<? super to8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = so8Var;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new to8(this.this$0, this.$index, this.$scrollOffset, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xrd xrdVar, lu2<? super j6g> lu2Var) {
        return ((to8) create(xrdVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        so8 so8Var = this.this$0;
        int i = this.$index;
        int i2 = this.$scrollOffset;
        lo8 lo8Var = so8Var.d;
        if (((dme) lo8Var.a).e() != i || ((dme) lo8Var.b).e() != i2) {
            LazyLayoutItemAnimator<ho8> lazyLayoutItemAnimator = so8Var.m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.b = null;
            lazyLayoutItemAnimator.c = -1;
            oo3 oo3Var = so8Var.a;
        }
        lo8Var.a(i, i2);
        lo8Var.d = null;
        zzc zzcVar = so8Var.j;
        if (zzcVar != null) {
            zzcVar.e();
        }
        return j6g.a;
    }
}
