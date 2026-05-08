package defpackage;

import androidx.compose.runtime.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a7f extends mj8 implements Function2<bxe, iq2, bg9> {
    final /* synthetic */ Function2<b, Integer, j6g> $divider;
    final /* synthetic */ wu5<List<o6f>, b, Integer, j6g> $indicator;
    final /* synthetic */ Function2<b, Integer, j6g> $tabs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a7f(Function2<? super b, ? super Integer, j6g> function2, Function2<? super b, ? super Integer, j6g> function22, wu5<? super List<o6f>, ? super b, ? super Integer, j6g> wu5Var) {
        super(2);
        this.$tabs = function2;
        this.$divider = function22;
        this.$indicator = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final bg9 invoke(bxe bxeVar, iq2 iq2Var) {
        bxe bxeVar2 = bxeVar;
        long j = iq2Var.a;
        int iH = iq2.h(j);
        List<vf9> listF = bxeVar2.F(h7f.a, this.$tabs);
        int size = listF.size();
        juc jucVar = new juc();
        if (size > 0) {
            jucVar.element = iH / size;
        }
        Integer numValueOf = 0;
        int size2 = listF.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(listF.get(i).w(jucVar.element), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList = new ArrayList(listF.size());
        int size3 = listF.size();
        for (int i2 = 0; i2 < size3; i2++) {
            vf9 vf9Var = listF.get(i2);
            int i3 = jucVar.element;
            if (i3 < 0 || iIntValue < 0) {
                ce7.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
            }
            arrayList.add(vf9Var.R(mq2.h(i3, i3, iIntValue, iIntValue)));
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            j94 j94Var = new j94(bxeVar2.k1(Math.min(listF.get(i4).P(iIntValue), jucVar.element)) - (f6f.c * 2.0f));
            j94 j94Var2 = new j94(24.0f);
            if (j94Var.compareTo(j94Var2) < 0) {
                j94Var = j94Var2;
            }
            arrayList2.add(new o6f(bxeVar2.k1(jucVar.element) * i4, bxeVar2.k1(jucVar.element), j94Var.a));
        }
        return bxeVar2.Y0(iH, iIntValue, bs4.a, new z6f(arrayList, bxeVar2, this.$divider, jucVar, j, iIntValue, this.$indicator, arrayList2, iH));
    }
}
