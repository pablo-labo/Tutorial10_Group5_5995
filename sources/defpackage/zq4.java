package defpackage;

import defpackage.c7e;
import defpackage.fy3;
import defpackage.mnf;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class zq4 extends fy3 {

    public static final class a {
        public static boolean a(ArrayList arrayList, int i, int i2) {
            fy3.a aVar = (fy3.a) arrayList.get(i);
            fy3.a aVar2 = (fy3.a) arrayList.get(i2);
            if (i <= 0) {
                return false;
            }
            int i3 = i - 1;
            return ((fy3.a) arrayList.get(i3)).g == aVar.g + 1 && ((fy3.a) arrayList.get(i3)).f == aVar.f && ((fy3.a) arrayList.get(i3)).b == aVar.b - 1 && ((fy3.a) arrayList.get(aVar.g + 1)).b == aVar2.b + 1;
        }
    }

    @Override // defpackage.fy3
    public final void d(uu8 uu8Var, mnf.b bVar, ArrayList arrayList, c7e.b bVar2) {
        int i;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        boolean zA = false;
        while (true) {
            int i2 = size - 1;
            if (zA) {
                zA = false;
            } else {
                fy3.a aVar = (fy3.a) arrayList.get(size);
                en6 en6Var = aVar.a;
                int i3 = aVar.b;
                if (wl7.b(en6Var, zd9.w) && (i = aVar.g) != -1) {
                    zA = a.a(arrayList, size, i);
                    fy3.a aVar2 = (fy3.a) arrayList.get(aVar.g);
                    bVar2.a.add(zA ? new c7e.a(new oh7(i3 - 1, aVar2.b + 2, 1), pg8.b0) : new c7e.a(new oh7(i3, aVar2.b + 1, 1), pg8.a0));
                }
            }
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    @Override // defpackage.fy3
    public final int e(uu8 uu8Var, mnf.a aVar, ArrayList arrayList) {
        aVar.getClass();
        en6 en6VarD = aVar.d();
        kd9 kd9Var = zd9.w;
        if (!wl7.b(en6VarD, kd9Var)) {
            return 0;
        }
        char cE = mnf.this.e(aVar.e(0).b);
        int i = 1;
        mnf.a aVarA = aVar;
        for (int i2 = 0; i2 < 50 && wl7.b(aVarA.f(), kd9Var); i2++) {
            mnf.a aVarA2 = aVarA.a();
            if (mnf.this.e(aVarA2.e(0).b) != cE) {
                break;
            }
            aVarA = aVarA.a();
            i++;
        }
        Pair pairA = fy3.a(uu8Var, aVar, aVarA, cE == '*');
        boolean zBooleanValue = ((Boolean) pairA.a()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pairA.b()).booleanValue();
        int i3 = 0;
        while (i3 < i) {
            int i4 = i;
            arrayList.add(new fy3.a(kd9Var, aVar.a + i3, i4, zBooleanValue, zBooleanValue2, cE));
            i3++;
            i = i4;
        }
        return i;
    }
}
