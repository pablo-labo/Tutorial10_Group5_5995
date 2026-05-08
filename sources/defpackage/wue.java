package defpackage;

import defpackage.c7e;
import defpackage.fy3;
import defpackage.mnf;
import defpackage.zq4;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class wue extends fy3 {
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
                if (wl7.b(aVar.a, ak2.c) && (i = aVar.g) != -1) {
                    zA = zq4.a.a(arrayList, size, i);
                    fy3.a aVar2 = (fy3.a) arrayList.get(aVar.g);
                    if (zA) {
                        bVar2.a.add(new c7e.a(new oh7(aVar.b - 1, aVar2.b + 2, 1), c0h.c0));
                    }
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
        kd9 kd9Var = ak2.c;
        if (!wl7.b(en6VarD, kd9Var)) {
            return 0;
        }
        int i = 1;
        mnf.a aVarA = aVar;
        for (int i2 = 0; i2 < 50 && wl7.b(aVarA.f(), kd9Var); i2++) {
            aVarA = aVarA.a();
            i++;
        }
        Pair pairA = fy3.a(uu8Var, aVar, aVarA, true);
        boolean zBooleanValue = ((Boolean) pairA.a()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pairA.b()).booleanValue();
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add(new fy3.a(kd9Var, aVar.a + i3, 0, zBooleanValue, zBooleanValue2, '~'));
        }
        return i;
    }
}
