package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v10 implements ag9 {
    public static final void b(ArrayList arrayList, juc jucVar, q qVar, ArrayList arrayList2, ArrayList arrayList3, juc jucVar2, ArrayList arrayList4, juc jucVar3, juc jucVar4) {
        if (!arrayList.isEmpty()) {
            jucVar.element = qVar.x0(12.0f) + jucVar.element;
        }
        arrayList.add(0, z92.z1(arrayList2));
        arrayList3.add(Integer.valueOf(jucVar2.element));
        arrayList4.add(Integer.valueOf(jucVar.element));
        jucVar.element += jucVar2.element;
        jucVar3.element = Math.max(jucVar3.element, jucVar4.element);
        arrayList2.clear();
        jucVar4.element = 0;
        jucVar2.element = 0;
    }

    @Override // defpackage.ag9
    public final bg9 c(final q qVar, List<? extends vf9> list, long j) {
        List<? extends vf9> list2 = list;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        juc jucVar = new juc();
        juc jucVar2 = new juc();
        ArrayList arrayList4 = new ArrayList();
        juc jucVar3 = new juc();
        juc jucVar4 = new juc();
        int i = 0;
        long jB = mq2.b(iq2.h(j), 0, 13);
        int size = list2.size();
        while (i < size) {
            w wVarR = list2.get(i).R(jB);
            if (!arrayList4.isEmpty()) {
                if (qVar.x0(8.0f) + jucVar3.element + wVarR.a > iq2.h(j)) {
                    b(arrayList, jucVar2, qVar, arrayList4, arrayList2, jucVar4, arrayList3, jucVar, jucVar3);
                }
            }
            if (!arrayList4.isEmpty()) {
                jucVar3.element = qVar.x0(8.0f) + jucVar3.element;
            }
            arrayList4.add(wVarR);
            jucVar3.element += wVarR.a;
            jucVar4.element = Math.max(jucVar4.element, wVarR.b);
            i++;
            list2 = list;
        }
        if (!arrayList4.isEmpty()) {
            b(arrayList, jucVar2, qVar, arrayList4, arrayList2, jucVar4, arrayList3, jucVar, jucVar3);
        }
        final int iH = iq2.h(j) != Integer.MAX_VALUE ? iq2.h(j) : Math.max(jucVar.element, iq2.j(j));
        return qVar.Y0(iH, Math.max(jucVar2.element, iq2.i(j)), bs4.a, new Function1() { // from class: u10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                w.a aVar = (w.a) obj;
                ArrayList arrayList5 = arrayList;
                int size2 = arrayList5.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    List list3 = (List) arrayList5.get(i2);
                    int size3 = list3.size();
                    int[] iArr = new int[size3];
                    int i3 = 0;
                    while (i3 < size3) {
                        iArr[i3] = ((w) list3.get(i3)).a + (i3 < list3.size() + (-1) ? qVar.x0(8.0f) : 0);
                        i3++;
                    }
                    int[] iArr2 = new int[size3];
                    int i4 = 0;
                    for (int i5 = 0; i5 < size3; i5++) {
                        i4 += iArr[i5];
                    }
                    int i6 = iH - i4;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size3) {
                        int i9 = iArr[i7];
                        iArr2[i8] = i6;
                        i6 += i9;
                        i7++;
                        i8++;
                    }
                    int size4 = list3.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        aVar.r((w) list3.get(i10), iArr2[i10], ((Number) arrayList3.get(i2)).intValue(), 0.0f);
                    }
                }
                return j6g.a;
            }
        });
    }
}
