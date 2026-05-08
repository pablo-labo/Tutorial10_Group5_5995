package defpackage;

import androidx.compose.runtime.b;
import com.wlappdebug.DebugFlagsActivity;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qh3 extends mj8 implements xu5<xo8, Integer, b, Integer, j6g> {
    final /* synthetic */ ub5 $filterResult$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ DebugFlagsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh3(List list, DebugFlagsActivity debugFlagsActivity, ub5 ub5Var) {
        super(4);
        this.$items = list;
        this.this$0 = debugFlagsActivity;
        this.$filterResult$inlined = ub5Var;
    }

    @Override // defpackage.xu5
    public final j6g j(xo8 xo8Var, Integer num, b bVar, Integer num2) {
        int i;
        xo8 xo8Var2 = xo8Var;
        int iIntValue = num.intValue();
        b bVar2 = bVar;
        int iIntValue2 = num2.intValue();
        xo8Var2.getClass();
        if ((iIntValue2 & 14) == 0) {
            i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i |= bVar2.d(iIntValue) ? 32 : 16;
        }
        if ((i & 731) == 146 && bVar2.i()) {
            bVar2.D();
        } else {
            DebugFlagsActivity.A(this.this$0, (DebugFlagsActivity.a) this.$items.get(iIntValue), this.$filterResult$inlined.a, bVar2, 584);
        }
        return j6g.a;
    }
}
