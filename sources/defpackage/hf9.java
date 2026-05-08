package defpackage;

import defpackage.c7e;
import defpackage.mnf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hf9 implements c7e {
    @Override // defpackage.c7e
    public final c7e.b a(uu8 uu8Var, List list) {
        kd9 kd9Var = ak2.W;
        c7e.b bVar = new c7e.b();
        ArrayList arrayList = new ArrayList();
        mnf.a bVar2 = new mnf.b(uu8Var, list);
        int i = -239;
        int i2 = -239;
        while (true) {
            en6 en6VarD = bVar2.d();
            int i3 = bVar2.a;
            if (en6VarD == null) {
                break;
            }
            if (wl7.b(bVar2.d(), kd9Var)) {
                mnf.a aVarA = bVar2.a();
                int iC = bVar2.c();
                while (true) {
                    if (aVarA.d() == null) {
                        aVarA = null;
                        break;
                    }
                    if (wl7.b(aVarA.d(), kd9Var) && aVarA.c() == iC) {
                        break;
                    }
                    aVarA = aVarA.a();
                }
                if (aVarA != null) {
                    int i4 = aVarA.a;
                    int iC2 = bVar2.c();
                    ArrayList arrayList2 = bVar.a;
                    if (iC2 == 1) {
                        arrayList2.add(new c7e.a(new oh7(i3, i4 + 1, 1), c0h.g0));
                    } else {
                        arrayList2.add(new c7e.a(new oh7(i3, i4 + 1, 1), c0h.h0));
                    }
                    bVar2 = aVarA.a();
                }
            }
            if (i + 1 != i3) {
                if (i2 != -239) {
                    arrayList.add(new oh7(i2, i, 1));
                }
                i2 = i3;
            }
            bVar2 = bVar2.a();
            i = i3;
        }
        if (i2 != -239) {
            arrayList.add(new oh7(i2, i, 1));
        }
        bVar.a(arrayList);
        return bVar;
    }
}
