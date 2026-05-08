package defpackage;

import defpackage.c7e;
import defpackage.mnf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d81 implements c7e {
    @Override // defpackage.c7e
    public final c7e.b a(uu8 uu8Var, List list) {
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
            en6 en6VarD2 = bVar2.d();
            kd9 kd9Var = zd9.x;
            boolean zB = wl7.b(en6VarD2, kd9Var);
            kd9 kd9Var2 = zd9.y;
            if (zB || wl7.b(bVar2.d(), kd9Var2)) {
                mnf.a aVarA = bVar2.a();
                int iC = bVar2.c() - (wl7.b(bVar2.d(), kd9Var2) ? 2 : 0);
                while (true) {
                    if (aVarA.d() == null) {
                        aVarA = null;
                        break;
                    }
                    if (wl7.b(aVarA.d(), kd9Var) || wl7.b(aVarA.d(), kd9Var2)) {
                        if (aVarA.c() - (wl7.b(aVarA.d(), kd9Var2) ? 1 : 0) == iC) {
                            break;
                        }
                    }
                    aVarA = aVarA.a();
                }
                if (aVarA != null) {
                    bVar.a.add(new c7e.a(new oh7(i3, aVarA.a + 1, 1), pg8.X));
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
