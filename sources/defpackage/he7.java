package defpackage;

import defpackage.c7e;
import defpackage.mnf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class he7 implements c7e {

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0182  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.t09 a(mnf.a r17) {
            /*
                Method dump skipped, instruction units count: 442
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: he7.a.a(mnf$a):t09");
        }
    }

    @Override // defpackage.c7e
    public final c7e.b a(uu8 uu8Var, List list) {
        t09 t09VarA;
        c7e.b bVar = new c7e.b();
        ArrayList arrayList = new ArrayList();
        mnf.a bVar2 = new mnf.b(uu8Var, list);
        int i = -239;
        int i2 = -239;
        while (bVar2.d() != null) {
            if (!wl7.b(bVar2.d(), zd9.i) || (t09VarA = a.a(bVar2)) == null) {
                int i3 = bVar2.a;
                if (i + 1 != i3) {
                    if (i2 != -239) {
                        arrayList.add(new oh7(i2, i, 1));
                    }
                    i2 = i3;
                }
                bVar2 = bVar2.a();
                i = i3;
            } else {
                bVar2 = t09VarA.a.a();
                bVar.b(t09VarA);
            }
        }
        if (i2 != -239) {
            arrayList.add(new oh7(i2, i, 1));
        }
        bVar.a(arrayList);
        return bVar;
    }
}
