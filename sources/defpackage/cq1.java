package defpackage;

import android.util.SparseArray;
import defpackage.l42;
import defpackage.zpf;

/* JADX INFO: loaded from: classes.dex */
public final class cq1 implements o55, l42 {
    public static final dhb Y = new dhb();
    public long V;
    public zxd W;
    public androidx.media3.common.a[] X;
    public final m55 a;
    public final int b;
    public final androidx.media3.common.a c;
    public final SparseArray<a> d = new SparseArray<>();
    public boolean e;
    public l42.a f;

    public static final class a implements zpf {
        public final int a;
        public final androidx.media3.common.a b;
        public final u54 c = new u54();
        public androidx.media3.common.a d;
        public zpf e;
        public long f;

        public a(int i, int i2, androidx.media3.common.a aVar) {
            this.a = i2;
            this.b = aVar;
        }

        @Override // defpackage.zpf
        public final void a(long j, int i, int i2, int i3, zpf.a aVar) {
            long j2 = this.f;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.e = this.c;
            }
            zpf zpfVar = this.e;
            String str = vjg.a;
            zpfVar.a(j, i, i2, i3, aVar);
        }

        @Override // defpackage.zpf
        public final void b(g4b g4bVar, int i, int i2) {
            zpf zpfVar = this.e;
            String str = vjg.a;
            zpfVar.f(i, g4bVar);
        }

        @Override // defpackage.zpf
        public final void d(androidx.media3.common.a aVar) {
            androidx.media3.common.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar = aVar.d(aVar2);
            }
            this.d = aVar;
            zpf zpfVar = this.e;
            String str = vjg.a;
            zpfVar.d(aVar);
        }

        @Override // defpackage.zpf
        public final int e(te3 te3Var, int i, boolean z) {
            zpf zpfVar = this.e;
            String str = vjg.a;
            return zpfVar.c(te3Var, i, z);
        }
    }

    public static final class b {
        public qq3 a;
        public boolean b;
    }

    public cq1(m55 m55Var, int i, androidx.media3.common.a aVar) {
        this.a = m55Var;
        this.b = i;
        this.c = aVar;
    }

    @Override // defpackage.l42
    public final void a(l42.a aVar, long j, long j2) {
        this.f = aVar;
        this.V = j2;
        boolean z = this.e;
        m55 m55Var = this.a;
        if (!z) {
            m55Var.l(this);
            if (j != -9223372036854775807L) {
                m55Var.d(0L, j);
            }
            this.e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        m55Var.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray<a> sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            a aVarValueAt = sparseArray.valueAt(i);
            if (aVar == null) {
                aVarValueAt.e = aVarValueAt.c;
            } else {
                aVarValueAt.f = j2;
                zpf zpfVarA = ((ga1) aVar).a(aVarValueAt.a);
                aVarValueAt.e = zpfVarA;
                androidx.media3.common.a aVar2 = aVarValueAt.d;
                if (aVar2 != null) {
                    zpfVarA.d(aVar2);
                }
            }
            i++;
        }
    }

    @Override // defpackage.o55
    public final void b(zxd zxdVar) {
        this.W = zxdVar;
    }

    @Override // defpackage.l42
    public final n42 c() {
        zxd zxdVar = this.W;
        if (zxdVar instanceof n42) {
            return (n42) zxdVar;
        }
        return null;
    }

    @Override // defpackage.l42
    public final boolean d(hn3 hn3Var) {
        int iB = this.a.b(hn3Var, Y);
        ka2.q(iB != 1);
        return iB == 0;
    }

    @Override // defpackage.l42
    public final androidx.media3.common.a[] e() {
        return this.X;
    }

    @Override // defpackage.o55
    public final void m() {
        SparseArray<a> sparseArray = this.d;
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            androidx.media3.common.a aVar = sparseArray.valueAt(i).d;
            ka2.r(aVar);
            aVarArr[i] = aVar;
        }
        this.X = aVarArr;
    }

    @Override // defpackage.o55
    public final zpf o(int i, int i2) {
        SparseArray<a> sparseArray = this.d;
        a aVar = sparseArray.get(i);
        if (aVar == null) {
            ka2.q(this.X == null);
            aVar = new a(i, i2, i2 == this.b ? this.c : null);
            l42.a aVar2 = this.f;
            long j = this.V;
            if (aVar2 == null) {
                aVar.e = aVar.c;
            } else {
                aVar.f = j;
                zpf zpfVarA = ((ga1) aVar2).a(i2);
                aVar.e = zpfVarA;
                androidx.media3.common.a aVar3 = aVar.d;
                if (aVar3 != null) {
                    zpfVarA.d(aVar3);
                }
            }
            sparseArray.put(i, aVar);
        }
        return aVar;
    }

    @Override // defpackage.l42
    public final void release() {
        this.a.release();
    }
}
