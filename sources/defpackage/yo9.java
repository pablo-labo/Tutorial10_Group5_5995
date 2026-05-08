package defpackage;

import defpackage.e47;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yo9 implements r83 {
    public static final vm2 b;
    public final ArrayList a = new ArrayList();

    static {
        kaa kaaVar = kaa.a;
        n6 n6Var = new n6(9);
        kaaVar.getClass();
        uq1 uq1Var = new uq1(n6Var, kaaVar);
        sad sadVar = sad.a;
        o6 o6Var = new o6(16);
        sadVar.getClass();
        b = new vm2(uq1Var, new uq1(o6Var, sadVar));
    }

    @Override // defpackage.r83
    public final boolean a(s83 s83Var, long j) {
        long j2 = s83Var.b;
        ka2.l(j2 != -9223372036854775807L);
        ka2.l(s83Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < s83Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((s83) arrayList.get(size)).b) {
                arrayList.add(size + 1, s83Var);
                return z;
            }
        }
        arrayList.add(0, s83Var);
        return z;
    }

    @Override // defpackage.r83
    public final e47<n83> b(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((s83) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    s83 s83Var = (s83) arrayList.get(i);
                    if (j >= s83Var.b && j < s83Var.d) {
                        arrayList2.add(s83Var);
                    }
                    if (j < s83Var.b) {
                        break;
                    }
                }
                qyc qycVarQ = e47.q(b, arrayList2);
                e47.a aVar = new e47.a();
                for (int i2 = 0; i2 < qycVarQ.d; i2++) {
                    aVar.d(((s83) qycVarQ.get(i2)).a);
                }
                return aVar.f();
            }
        }
        e47.b bVar = e47.b;
        return qyc.e;
    }

    @Override // defpackage.r83
    public final long c(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((s83) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((s83) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((s83) arrayList.get(i)).b;
            long j3 = ((s83) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.r83
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.r83
    public final long d(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((s83) arrayList.get(i)).b;
            long j3 = ((s83) arrayList.get(i)).d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.r83
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((s83) arrayList.get(i)).b;
            if (j > j2 && j > ((s83) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
