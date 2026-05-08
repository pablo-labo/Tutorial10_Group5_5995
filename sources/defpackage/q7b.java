package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q7b {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final a3a<od6> e;
    public final d2f f;

    public q7b(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            gib.a("Invalid start index");
        }
        this.d = new ArrayList();
        a3a<od6> a3aVar = new a3a<>();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            qg8 qg8Var = (qg8) this.a.get(i3);
            int i4 = qg8Var.c;
            int i5 = qg8Var.d;
            a3aVar.h(i4, new od6(i3, i2, i5));
            i2 += i5;
        }
        this.e = a3aVar;
        this.f = new d2f(new q73(this, 3));
    }

    public final boolean a(int i, int i2) {
        od6 od6Var;
        int i3;
        int i4;
        a3a<od6> a3aVar = this.e;
        od6 od6VarB = a3aVar.b(i);
        if (od6VarB == null) {
            return false;
        }
        int i5 = od6VarB.b;
        int i6 = i2 - od6VarB.c;
        od6VarB.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = a3aVar.c;
        long[] jArr = a3aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (od6Var = (od6) objArr[(i7 << 3) + i9]).b) >= i5 && od6Var != od6VarB && (i4 = i3 + i6) >= 0) {
                        od6Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
