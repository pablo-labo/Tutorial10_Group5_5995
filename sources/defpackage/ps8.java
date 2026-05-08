package defpackage;

import androidx.compose.foundation.lazy.layout.g;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {560}, m = "invokeSuspend")
public final class ps8 extends c1f implements Function2<xrd, lu2<? super j6g>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ss8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps8(ss8 ss8Var, int i, int i2, lu2<? super ps8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ss8Var;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ps8 ps8Var = new ps8(this.this$0, this.$index, this.$scrollOffset, lu2Var);
        ps8Var.L$0 = obj;
        return ps8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xrd xrdVar, lu2<? super j6g> lu2Var) {
        return ((ps8) create(xrdVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xrd xrdVar = (xrd) this.L$0;
            ss8 ss8Var = this.this$0;
            ns8 ns8Var = new ns8(xrdVar, ss8Var);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            iy3 iy3Var = ((is8) ((gme) ss8Var.f).getValue()).i;
            this.label = 1;
            Object objA = g.a(ns8Var, i2, i3, 100, iy3Var, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
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
