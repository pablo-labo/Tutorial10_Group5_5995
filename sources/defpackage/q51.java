package defpackage;

import defpackage.c7e;
import defpackage.mnf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q51 implements c7e {
    public final List<en6> a;

    /* JADX WARN: Multi-variable type inference failed */
    public q51(List<? extends en6> list) {
        this.a = list;
    }

    @Override // defpackage.c7e
    public final c7e.b a(uu8 uu8Var, List list) {
        en6 en6VarF;
        kd9 kd9Var;
        c7e.b bVar = new c7e.b();
        ArrayList arrayList = new ArrayList();
        mnf.b bVar2 = new mnf.b(uu8Var, list);
        int i = -239;
        int i2 = -239;
        while (true) {
            int i3 = bVar2.a;
            if (bVar2.d() == null) {
                break;
            }
            if (wl7.b(bVar2.d(), zd9.k) && (en6VarF = bVar2.f()) != null && this.a.contains(en6VarF)) {
                while (true) {
                    en6 en6VarD = bVar2.d();
                    kd9Var = zd9.l;
                    if (wl7.b(en6VarD, kd9Var) || bVar2.d() == null) {
                        break;
                    }
                    bVar2 = bVar2.a();
                }
                if (wl7.b(bVar2.d(), kd9Var)) {
                    bVar.a.add(new c7e.a(new oh7(i3, bVar2.a + 1, 1), pg8.l0));
                }
            } else {
                if (i + 1 != i3) {
                    if (i2 != -239) {
                        arrayList.add(new oh7(i2, i, 1));
                    }
                    i2 = i3;
                }
                i = i3;
            }
            bVar2 = bVar2.a();
        }
        if (i2 != -239) {
            arrayList.add(new oh7(i2, i, 1));
        }
        bVar.a(arrayList);
        return bVar;
    }
}
