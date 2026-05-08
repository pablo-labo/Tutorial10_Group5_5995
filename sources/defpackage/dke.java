package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, RumViewScope.SLOW_RENDERED_THRESHOLD_FPS, 58}, m = "invokeSuspend")
public final class dke extends n7d implements Function2<t6e<? super List<Object>>, lu2<? super j6g>, Object> {
    final /* synthetic */ Iterator<Object> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dke(int i, int i2, Iterator<Object> it, boolean z, boolean z2, lu2<? super dke> lu2Var) {
        super(2, lu2Var);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        dke dkeVar = new dke(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, lu2Var);
        dkeVar.L$0 = obj;
        return dkeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(t6e<? super List<Object>> t6eVar, lu2<? super j6g> lu2Var) {
        return ((dke) create(t6eVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016b A[SYNTHETIC] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dke.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
