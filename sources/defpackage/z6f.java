package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class z6f extends mj8 implements Function1<w.a, j6g> {
    final /* synthetic */ long $constraints;
    final /* synthetic */ Function2<b, Integer, j6g> $divider;
    final /* synthetic */ wu5<List<o6f>, b, Integer, j6g> $indicator;
    final /* synthetic */ List<w> $tabPlaceables;
    final /* synthetic */ List<o6f> $tabPositions;
    final /* synthetic */ int $tabRowHeight;
    final /* synthetic */ int $tabRowWidth;
    final /* synthetic */ juc $tabWidth;
    final /* synthetic */ bxe $this_SubcomposeLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6f(ArrayList arrayList, bxe bxeVar, Function2 function2, juc jucVar, long j, int i, wu5 wu5Var, ArrayList arrayList2, int i2) {
        super(1);
        this.$tabPlaceables = arrayList;
        this.$this_SubcomposeLayout = bxeVar;
        this.$divider = function2;
        this.$tabWidth = jucVar;
        this.$constraints = j;
        this.$tabRowHeight = i;
        this.$indicator = wu5Var;
        this.$tabPositions = arrayList2;
        this.$tabRowWidth = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(w.a aVar) {
        w.a aVar2 = aVar;
        List<w> list = this.$tabPlaceables;
        juc jucVar = this.$tabWidth;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            w.a.y(aVar2, list.get(i), jucVar.element * i, 0);
        }
        List<vf9> listF = this.$this_SubcomposeLayout.F(h7f.b, this.$divider);
        long j = this.$constraints;
        int i2 = this.$tabRowHeight;
        int size2 = listF.size();
        for (int i3 = 0; i3 < size2; i3++) {
            w wVarR = listF.get(i3).R(iq2.a(0, 0, 0, 0, 11, j));
            w.a.y(aVar2, wVarR, 0, i2 - wVarR.b);
        }
        List<vf9> listF2 = this.$this_SubcomposeLayout.F(h7f.c, new ah2(1621992604, new y6f(this.$indicator, this.$tabPositions), true));
        int i4 = this.$tabRowWidth;
        int i5 = this.$tabRowHeight;
        int size3 = listF2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            vf9 vf9Var = listF2.get(i6);
            if (!((i4 >= 0) & (i5 >= 0))) {
                ce7.a("width and height must be >= 0");
            }
            w.a.y(aVar2, vf9Var.R(mq2.h(i4, i4, i5, i5)), 0, 0);
        }
        return j6g.a;
    }
}
