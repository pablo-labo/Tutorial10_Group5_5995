package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.components.PagerIndicatorKt$PagerIndicator$1$1", f = "PagerIndicator.kt", l = {58}, m = "invokeSuspend")
public final class g1b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ese<Integer> $currentItem$delegate;
    final /* synthetic */ ss8 $listState;
    final /* synthetic */ float $widthInPx;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1b(ss8 ss8Var, float f, ese<Integer> eseVar, lu2<? super g1b> lu2Var) {
        super(2, lu2Var);
        this.$listState = ss8Var;
        this.$widthInPx = f;
        this.$currentItem$delegate = eseVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g1b(this.$listState, this.$widthInPx, this.$currentItem$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g1b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            long jB = this.$listState.j().b();
            ss8 ss8Var = this.$listState;
            int iIntValue = this.$currentItem$delegate.getValue().intValue();
            int i2 = (int) ((this.$widthInPx / 2.0f) - (((int) (jB >> 32)) / 2));
            this.J$0 = jB;
            this.label = 1;
            ss8Var.getClass();
            Object objA = ss8Var.a(n4a.a, new ps8(ss8Var, iIntValue, i2, null), this);
            g13 g13Var = g13.a;
            if (objA != g13Var) {
                objA = j6g.a;
            }
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
