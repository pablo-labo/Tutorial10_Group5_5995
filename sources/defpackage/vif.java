package defpackage;

import androidx.compose.ui.layout.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class vif implements ag9 {
    public final gu5<Boolean> a;
    public final gu5<List<qtc>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public vif(gu5<Boolean> gu5Var, gu5<? extends List<qtc>> gu5Var2) {
        this.a = gu5Var;
        this.b = gu5Var2;
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<? extends vf9> list2;
        Pair pair;
        ArrayList arrayList3 = new ArrayList(list.size());
        List<? extends vf9> list3 = list;
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            vf9 vf9Var = list.get(i);
            if (!(vf9Var.g() instanceof mjf)) {
                arrayList3.add(vf9Var);
            }
        }
        List<qtc> listInvoke = this.b.invoke();
        if (listInvoke != null) {
            ArrayList arrayList4 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            int i2 = 0;
            while (i2 < size2) {
                qtc qtcVar = listInvoke.get(i2);
                if (qtcVar != null) {
                    float f = qtcVar.b;
                    float f2 = qtcVar.a;
                    vf9 vf9Var2 = (vf9) arrayList3.get(i2);
                    int iFloor = (int) Math.floor(qtcVar.c - f2);
                    float f3 = qtcVar.d - f;
                    arrayList2 = arrayList3;
                    list2 = list3;
                    pair = new Pair(vf9Var2.R(mq2.b(iFloor, (int) Math.floor(f3), 5)), new lh7((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                } else {
                    arrayList2 = arrayList3;
                    list2 = list3;
                    pair = null;
                }
                if (pair != null) {
                    arrayList4.add(pair);
                }
                i2++;
                arrayList3 = arrayList2;
                list3 = list2;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        List<? extends vf9> list4 = list3;
        ArrayList arrayList5 = new ArrayList(list.size());
        int size3 = list4.size();
        for (int i3 = 0; i3 < size3; i3++) {
            vf9 vf9Var3 = list.get(i3);
            if (vf9Var3.g() instanceof mjf) {
                arrayList5.add(vf9Var3);
            }
        }
        return qVar.Y0(iq2.h(j), iq2.g(j), bs4.a, new ev2(arrayList, nd1.f(arrayList5, this.a)));
    }
}
