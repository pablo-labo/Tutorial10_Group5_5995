package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class x6f extends mj8 implements Function2<bxe, iq2, bg9> {
    final /* synthetic */ Function2<b, Integer, j6g> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ wu5<List<o6f>, b, Integer, j6g> $indicator;
    final /* synthetic */ psd $scrollableTabData;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ Function2<b, Integer, j6g> $tabs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x6f(float f, Function2<? super b, ? super Integer, j6g> function2, Function2<? super b, ? super Integer, j6g> function22, psd psdVar, int i, wu5<? super List<o6f>, ? super b, ? super Integer, j6g> wu5Var) {
        super(2);
        this.$edgePadding = f;
        this.$tabs = function2;
        this.$divider = function22;
        this.$scrollableTabData = psdVar;
        this.$selectedTabIndex = i;
        this.$indicator = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final bg9 invoke(bxe bxeVar, iq2 iq2Var) {
        bxe bxeVar2 = bxeVar;
        long j = iq2Var.a;
        dvf dvfVar = u6f.a;
        int iX0 = bxeVar2.x0(90.0f);
        int iX02 = bxeVar2.x0(this.$edgePadding);
        List<vf9> listF = bxeVar2.F(h7f.a, this.$tabs);
        Integer numValueOf = 0;
        int size = listF.size();
        for (int i = 0; i < size; i++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), listF.get(i).w(Integer.MAX_VALUE)));
        }
        int iIntValue = numValueOf.intValue();
        long jA = iq2.a(iX0, 0, iIntValue, iIntValue, 2, j);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = listF.size();
        for (int i2 = 0; i2 < size2; i2++) {
            vf9 vf9Var = listF.get(i2);
            w wVarR = vf9Var.R(jA);
            float fK1 = bxeVar2.k1(Math.min(vf9Var.P(wVarR.b), wVarR.a)) - (f6f.c * 2.0f);
            arrayList.add(wVarR);
            arrayList2.add(new j94(fK1));
        }
        Integer numValueOf2 = Integer.valueOf(iX02 * 2);
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((w) arrayList.get(i3)).a);
        }
        int iIntValue2 = numValueOf2.intValue();
        return bxeVar2.Y0(iIntValue2, iIntValue, bs4.a, new w6f(iX02, arrayList, bxeVar2, this.$divider, this.$scrollableTabData, this.$selectedTabIndex, arrayList2, j, iIntValue2, iIntValue, this.$indicator));
    }
}
