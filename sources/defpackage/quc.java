package defpackage;

import defpackage.c7e;
import defpackage.mnf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class quc implements c7e {

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.t09 a(mnf.a r12) {
            /*
                r12.getClass()
                int r0 = r12.a
                t09 r1 = defpackage.vx8.b(r12)
                kd9 r2 = defpackage.zd9.p
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L11
            Lf:
                r7 = r4
                goto L5a
            L11:
                mnf$a r5 = r1.a
                mnf$a r5 = r5.a()
                en6 r6 = r5.d()
                boolean r6 = defpackage.wl7.b(r6, r2)
                if (r6 == 0) goto L25
                mnf$a r5 = r5.a()
            L25:
                t09 r5 = defpackage.vx8.a(r5)
                if (r5 != 0) goto L2c
                goto Lf
            L2c:
                mnf$a r6 = r5.a
                t09 r7 = new t09
                java.util.Collection<c7e$a> r8 = r1.b
                java.util.Collection<c7e$a> r9 = r5.b
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r8 = defpackage.z92.h1(r8, r9)
                c7e$a r9 = new c7e$a
                oh7 r10 = new oh7
                int r11 = r6.a
                int r11 = r11 + r3
                r10.<init>(r0, r11, r3)
                kd9 r11 = defpackage.pg8.i0
                r9.<init>(r10, r11)
                java.util.ArrayList r8 = defpackage.z92.g1(r9, r8)
                java.util.Collection<java.util.List<oh7>> r1 = r1.c
                java.util.Collection<java.util.List<oh7>> r5 = r5.c
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r1 = defpackage.z92.h1(r1, r5)
                r7.<init>(r6, r8, r1)
            L5a:
                if (r7 != 0) goto Lb0
                t09 r12 = defpackage.vx8.a(r12)
                if (r12 != 0) goto L63
                return r4
            L63:
                mnf$a r1 = r12.a
                mnf$a r4 = r1.a()
                en6 r5 = r4.d()
                boolean r2 = defpackage.wl7.b(r5, r2)
                if (r2 == 0) goto L77
                mnf$a r4 = r4.a()
            L77:
                en6 r2 = r4.d()
                kd9 r5 = defpackage.zd9.i
                boolean r2 = defpackage.wl7.b(r2, r5)
                if (r2 == 0) goto L93
                en6 r2 = r4.f()
                kd9 r5 = defpackage.zd9.j
                boolean r2 = defpackage.wl7.b(r2, r5)
                if (r2 == 0) goto L93
                mnf$a r1 = r4.a()
            L93:
                t09 r2 = new t09
                java.util.Collection<c7e$a> r4 = r12.b
                c7e$a r5 = new c7e$a
                oh7 r6 = new oh7
                int r7 = r1.a
                int r7 = r7 + r3
                r6.<init>(r0, r7, r3)
                kd9 r0 = defpackage.pg8.j0
                r5.<init>(r6, r0)
                java.util.ArrayList r0 = defpackage.z92.g1(r5, r4)
                java.util.Collection<java.util.List<oh7>> r12 = r12.c
                r2.<init>(r1, r0, r12)
                return r2
            Lb0:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: quc.a.a(mnf$a):t09");
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
