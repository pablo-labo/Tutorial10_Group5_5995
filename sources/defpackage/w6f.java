package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class w6f extends mj8 implements Function1<w.a, j6g> {
    final /* synthetic */ long $constraints;
    final /* synthetic */ Function2<b, Integer, j6g> $divider;
    final /* synthetic */ wu5<List<o6f>, b, Integer, j6g> $indicator;
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ int $layoutWidth;
    final /* synthetic */ int $padding;
    final /* synthetic */ psd $scrollableTabData;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ List<j94> $tabContentWidths;
    final /* synthetic */ List<w> $tabPlaceables;
    final /* synthetic */ bxe $this_SubcomposeLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6f(int i, ArrayList arrayList, bxe bxeVar, Function2 function2, psd psdVar, int i2, ArrayList arrayList2, long j, int i3, int i4, wu5 wu5Var) {
        super(1);
        this.$padding = i;
        this.$tabPlaceables = arrayList;
        this.$this_SubcomposeLayout = bxeVar;
        this.$divider = function2;
        this.$scrollableTabData = psdVar;
        this.$selectedTabIndex = i2;
        this.$tabContentWidths = arrayList2;
        this.$constraints = j;
        this.$layoutWidth = i3;
        this.$layoutHeight = i4;
        this.$indicator = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(w.a aVar) {
        w.a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        int i = this.$padding;
        List<w> list = this.$tabPlaceables;
        bxe bxeVar = this.$this_SubcomposeLayout;
        List<j94> list2 = this.$tabContentWidths;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            w wVar = list.get(i2);
            w.a.y(aVar2, wVar, i, 0);
            arrayList.add(new o6f(bxeVar.k1(i), bxeVar.k1(wVar.a), list2.get(i2).a));
            i += wVar.a;
        }
        List<vf9> listF = this.$this_SubcomposeLayout.F(h7f.b, this.$divider);
        long j = this.$constraints;
        int i3 = this.$layoutWidth;
        int i4 = this.$layoutHeight;
        int size2 = listF.size();
        for (int i5 = 0; i5 < size2; i5++) {
            w wVarR = listF.get(i5).R(iq2.a(i3, i3, 0, 0, 8, j));
            w.a.y(aVar2, wVarR, 0, i4 - wVarR.b);
        }
        List<vf9> listF2 = this.$this_SubcomposeLayout.F(h7f.c, new ah2(1734082948, new v6f(this.$indicator, arrayList), true));
        int i6 = this.$layoutWidth;
        int i7 = this.$layoutHeight;
        int size3 = listF2.size();
        for (int i8 = 0; i8 < size3; i8++) {
            vf9 vf9Var = listF2.get(i8);
            if (!((i6 >= 0) & (i7 >= 0))) {
                ce7.a("width and height must be >= 0");
            }
            w.a.y(aVar2, vf9Var.R(mq2.h(i6, i6, i7, i7)), 0, 0);
        }
        psd psdVar = this.$scrollableTabData;
        bxe bxeVar2 = this.$this_SubcomposeLayout;
        int i9 = this.$padding;
        int i10 = this.$selectedTabIndex;
        zrd zrdVar = psdVar.a;
        Integer num = psdVar.c;
        if (num == null || num.intValue() != i10) {
            psdVar.c = Integer.valueOf(i10);
            o6f o6fVar = (o6f) z92.R0(i10, arrayList);
            if (o6fVar != null) {
                o6f o6fVar2 = (o6f) z92.Y0(arrayList);
                int iX0 = bxeVar2.x0(o6fVar2.a + o6fVar2.b) + i9;
                int iF = iX0 - zrdVar.f();
                int iX02 = bxeVar2.x0(o6fVar.a) - ((iF / 2) - (bxeVar2.x0(o6fVar.b) / 2));
                int i11 = iX0 - iF;
                if (i11 < 0) {
                    i11 = 0;
                }
                int iC = nic.C(iX02, 0, i11);
                if (((dme) zrdVar.a).e() != iC) {
                    u63.Y(psdVar.b, null, null, new osd(psdVar, iC, null), 3);
                }
            }
        }
        return j6g.a;
    }
}
