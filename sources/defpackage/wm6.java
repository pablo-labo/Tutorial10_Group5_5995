package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jsmappservices.components.hybridactionoverflow.HybridActionOverflowRow;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class wm6 implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ Function1 c;

    public wm6(ArrayList arrayList, Integer num, Function1 function1) {
        this.a = arrayList;
        this.b = num;
        this.c = function1;
    }

    @Override // defpackage.xu5
    public final j6g j(xo8 xo8Var, Integer num, b bVar, Integer num2) {
        int i;
        xo8 xo8Var2 = xo8Var;
        int iIntValue = num.intValue();
        b bVar2 = bVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= bVar2.d(iIntValue) ? 32 : 16;
        }
        if (bVar2.o(i & 1, (i & 147) != 146)) {
            HybridActionOverflowRow hybridActionOverflowRow = (HybridActionOverflowRow) this.a.get(iIntValue);
            bVar2.L(-964542069);
            xm6.c(iIntValue, hybridActionOverflowRow, this.b, this.c, bVar2, ((i & 126) >> 3) & 14);
            xm6.b(0, bVar2);
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
