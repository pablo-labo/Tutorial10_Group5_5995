package defpackage;

import defpackage.c7e;
import defpackage.he7;
import defpackage.mnf;
import defpackage.quc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z17 implements c7e {
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
            if (wl7.b(bVar2.d(), zd9.n) && wl7.b(bVar2.f(), zd9.i)) {
                t09 t09VarA = he7.a.a(bVar2.a());
                if (t09VarA == null) {
                    t09VarA = quc.a.a(bVar2.a());
                }
                if (t09VarA != null) {
                    mnf.a aVar = t09VarA.a;
                    bVar.a.add(new c7e.a(new oh7(i3, aVar.a + 1, 1), pg8.k0));
                    bVar.b(t09VarA);
                    bVar2 = aVar.a();
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
