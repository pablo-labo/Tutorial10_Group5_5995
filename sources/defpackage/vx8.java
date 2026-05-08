package defpackage;

import defpackage.c7e;
import defpackage.mnf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vx8 {
    public static t09 a(mnf.a aVar) {
        int i;
        kd9 kd9Var;
        aVar.getClass();
        en6 en6VarD = aVar.d();
        kd9 kd9Var2 = zd9.i;
        if (!wl7.b(en6VarD, kd9Var2)) {
            return null;
        }
        int i2 = aVar.a;
        ArrayList arrayList = new ArrayList();
        mnf.a aVarA = aVar.a();
        int i3 = -239;
        int i4 = -239;
        while (true) {
            en6 en6VarD2 = aVarA.d();
            i = aVarA.a;
            kd9Var = zd9.j;
            if (wl7.b(en6VarD2, kd9Var) || aVarA.d() == null) {
                break;
            }
            if (i3 + 1 != i) {
                if (i4 != -239) {
                    arrayList.add(new oh7(i4, i3, 1));
                }
                i4 = i;
            }
            if (wl7.b(aVarA.d(), kd9Var2)) {
                i3 = i;
                break;
            }
            aVarA = aVarA.a();
            i3 = i;
        }
        if (!wl7.b(aVarA.d(), kd9Var) || i == i2 + 1) {
            return null;
        }
        List listZ = u63.Z(new c7e.a(new oh7(i2, i + 1, 1), pg8.d0));
        if (i4 != -239) {
            arrayList.add(new oh7(i4, i3, 1));
        }
        return new t09(aVarA, listZ, u63.Z(arrayList));
    }

    public static t09 b(mnf.a aVar) {
        int i;
        kd9 kd9Var;
        aVar.getClass();
        en6 en6VarD = aVar.d();
        kd9 kd9Var2 = zd9.i;
        if (!wl7.b(en6VarD, kd9Var2)) {
            return null;
        }
        int i2 = aVar.a;
        ArrayList arrayList = new ArrayList();
        mnf.a aVarA = aVar.a();
        int i3 = -239;
        int i4 = -239;
        int i5 = 1;
        while (true) {
            en6 en6VarD2 = aVarA.d();
            i = aVarA.a;
            kd9Var = zd9.j;
            if (en6VarD2 == null || (wl7.b(aVarA.d(), kd9Var) && i5 - 1 == 0)) {
                break;
            }
            if (i3 + 1 != i) {
                if (i4 != -239) {
                    arrayList.add(new oh7(i4, i3, 1));
                }
                i4 = i;
            }
            if (wl7.b(aVarA.d(), kd9Var2)) {
                i5++;
            }
            aVarA = aVarA.a();
            i3 = i;
        }
        if (!wl7.b(aVarA.d(), kd9Var)) {
            return null;
        }
        List listZ = u63.Z(new c7e.a(new oh7(i2, i + 1, 1), pg8.g0));
        if (i4 != -239) {
            arrayList.add(new oh7(i4, i3, 1));
        }
        return new t09(aVarA, listZ, u63.Z(arrayList));
    }
}
