package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.dye;
import defpackage.suf;
import defpackage.vuf;
import defpackage.wf1;
import defpackage.zxd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uuf implements m55 {
    public final int a;
    public final int b;
    public final List<qmf> c;
    public final g4b d;
    public final SparseIntArray e;
    public final lr3 f;
    public final dye.a g;
    public final SparseArray<vuf> h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final tuf k;
    public suf l;
    public o55 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public vuf r;
    public int s;
    public int t;

    public class a implements wxd {
        public final f4b a = new f4b(new byte[4], 4);

        public a() {
        }

        @Override // defpackage.wxd
        public final void a(g4b g4bVar) {
            uuf uufVar = uuf.this;
            SparseArray<vuf> sparseArray = uufVar.h;
            if (g4bVar.x() == 0 && (g4bVar.x() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                g4bVar.K(6);
                int iA = g4bVar.a() / 4;
                for (int i = 0; i < iA; i++) {
                    f4b f4bVar = this.a;
                    g4bVar.h(0, (byte[]) f4bVar.d, 4);
                    f4bVar.m(0);
                    int iG = f4bVar.g(16);
                    f4bVar.o(3);
                    if (iG == 0) {
                        f4bVar.o(13);
                    } else {
                        int iG2 = f4bVar.g(13);
                        if (sparseArray.get(iG2) == null) {
                            sparseArray.put(iG2, new xxd(uufVar.new b(iG2)));
                            uufVar.n++;
                        }
                    }
                }
                if (uufVar.a != 2) {
                    sparseArray.remove(0);
                }
            }
        }

        @Override // defpackage.wxd
        public final void b(qmf qmfVar, o55 o55Var, vuf.c cVar) {
        }
    }

    public class b implements wxd {
        public final f4b a = new f4b(new byte[5], 5);
        public final SparseArray<vuf> b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public b(int i) {
            this.d = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
        @Override // defpackage.wxd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(defpackage.g4b r39) {
            /*
                Method dump skipped, instruction units count: 751
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: uuf.b.a(g4b):void");
        }

        @Override // defpackage.wxd
        public final void b(qmf qmfVar, o55 o55Var, vuf.c cVar) {
        }
    }

    public uuf(int i, int i2, dye.a aVar, qmf qmfVar, lr3 lr3Var) {
        this.f = lr3Var;
        this.a = i;
        this.b = i2;
        this.g = aVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(qmfVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(qmfVar);
        }
        this.d = new g4b(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray<vuf> sparseArray = new SparseArray<>();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new tuf();
        this.m = o55.n;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (vuf) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new xxd(new a()));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [vuf] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) throws ParserException {
        n55 n55Var2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long jH;
        long length = n55Var.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j = -9223372036854775807L;
            tuf tufVar = this.k;
            if (length != -1 && !z2 && !tufVar.c) {
                int i6 = this.t;
                qmf qmfVar = tufVar.a;
                g4b g4bVar = tufVar.b;
                if (i6 <= 0) {
                    tufVar.a(n55Var);
                    return 0;
                }
                if (tufVar.e) {
                    if (tufVar.g == -9223372036854775807L) {
                        tufVar.a(n55Var);
                        return 0;
                    }
                    if (tufVar.d) {
                        long j2 = tufVar.f;
                        if (j2 == -9223372036854775807L) {
                            tufVar.a(n55Var);
                            return 0;
                        }
                        tufVar.h = qmfVar.c(tufVar.g) - qmfVar.b(j2);
                        tufVar.a(n55Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, n55Var.getLength());
                    if (n55Var.getPosition() != 0) {
                        dhbVar.a = 0L;
                        return 1;
                    }
                    g4bVar.G(iMin);
                    n55Var.f();
                    n55Var.h(0, g4bVar.a, iMin);
                    int i7 = g4bVar.b;
                    int i8 = g4bVar.c;
                    while (true) {
                        if (i7 >= i8) {
                            jH = -9223372036854775807L;
                            break;
                        }
                        if (g4bVar.a[i7] == 71) {
                            jH = wuf.h(g4bVar, i7, i6);
                            if (jH != -9223372036854775807L) {
                                break;
                            }
                        }
                        i7++;
                    }
                    tufVar.f = jH;
                    tufVar.d = true;
                    return 0;
                }
                long length2 = n55Var.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (n55Var.getPosition() != j3) {
                    dhbVar.a = j3;
                    return 1;
                }
                g4bVar.G(iMin2);
                n55Var.f();
                n55Var.h(0, g4bVar.a, iMin2);
                int i9 = g4bVar.b;
                int i10 = g4bVar.c;
                int i11 = i10 - 188;
                while (true) {
                    if (i11 < i9) {
                        break;
                    }
                    byte[] bArr = g4bVar.a;
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long jH2 = wuf.h(g4bVar, i11, i6);
                                if (jH2 != -9223372036854775807L) {
                                    j = jH2;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                tufVar.g = j;
                tufVar.e = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j4 = tufVar.h;
                if (j4 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    suf sufVar = new suf(new wf1.b(), new suf.a(this.t, tufVar.a), j4, j4 + 1, 0L, length, 188L, 940);
                    this.l = sufVar;
                    this.m.b(sufVar.a);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.b(new zxd.b(j4));
                }
            }
            if (this.q) {
                this.q = z;
                d(0L, 0L);
                if (n55Var.getPosition() != 0) {
                    dhbVar.a = 0L;
                    return i;
                }
            }
            suf sufVar2 = this.l;
            if (sufVar2 != null && sufVar2.c != null) {
                return sufVar2.a(n55Var, dhbVar);
            }
            n55Var2 = n55Var;
            r1 = z;
        } else {
            n55Var2 = n55Var;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        g4b g4bVar2 = this.d;
        byte[] bArr2 = g4bVar2.a;
        if (9400 - g4bVar2.b < 188) {
            int iA = g4bVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, g4bVar2.b, bArr2, r1, iA);
            }
            g4bVar2.H(iA, bArr2);
        }
        while (true) {
            int iA2 = g4bVar2.a();
            SparseArray<vuf> sparseArray = this.h;
            if (iA2 >= 188) {
                int i15 = g4bVar2.b;
                int i16 = g4bVar2.c;
                byte[] bArr3 = g4bVar2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                g4bVar2.J(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = g4bVar2.c;
                if (i18 > i20) {
                    return r1;
                }
                int iJ = g4bVar2.j();
                if ((8388608 & iJ) != 0) {
                    g4bVar2.J(i18);
                    return r1;
                }
                ?? r10 = (4194304 & iJ) != 0 ? 1 : r1;
                int i21 = (2096896 & iJ) >> 8;
                ?? r14 = (iJ & 32) != 0 ? 1 : r1;
                ?? r8 = (iJ & 16) != 0 ? sparseArray.get(i21) : 0;
                if (r8 == 0) {
                    g4bVar2.J(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i22 = iJ & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i23 = sparseIntArray.get(i21, i22 - 1);
                    sparseIntArray.put(i21, i22);
                    if (i23 == i22) {
                        g4bVar2.J(i18);
                        return r1;
                    }
                    if (i22 != ((i23 + 1) & 15)) {
                        r8.c();
                    }
                }
                if (r14 != 0) {
                    int iX = g4bVar2.x();
                    r10 = (r10 == true ? 1 : 0) | ((g4bVar2.x() & 64) != 0 ? i4 : r1);
                    g4bVar2.K(iX - 1);
                }
                boolean z3 = this.o;
                if (i3 == i4 || z3 || !this.j.get(i21, r1)) {
                    g4bVar2.I(i18);
                    r8.a(r10, g4bVar2);
                    g4bVar2.I(i20);
                }
                if (i3 != i4 && !z3 && this.o && length != -1) {
                    this.q = true;
                }
                g4bVar2.J(i18);
                return r1;
            }
            int i24 = g4bVar2.c;
            int i25 = n55Var2.read(bArr2, i24, 9400 - i24);
            if (i25 == -1) {
                for (?? r4 = r1; r4 < sparseArray.size(); r4++) {
                    vuf vufVarValueAt = sparseArray.valueAt(r4);
                    if (vufVarValueAt instanceof w9b) {
                        w9b w9bVar = (w9b) vufVarValueAt;
                        ?? r3 = (!z2 || w9bVar.e()) ? i : r1;
                        if (w9bVar.c == 3 && w9bVar.j == -1 && ((!z2 || !(w9bVar.a instanceof ke6)) && r3 != 0)) {
                            w9bVar.a(i, new g4b());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            g4bVar2.I(i24 + i25);
            i = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.n55 r6) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r5 = this;
            g4b r5 = r5.d
            byte[] r5 = r5.a
            hn3 r6 = (defpackage.hn3) r6
            r0 = 0
            r1 = 940(0x3ac, float:1.317E-42)
            r6.d(r5, r0, r1, r0)
            r1 = r0
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r1 >= r2) goto L29
            r2 = r0
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r1
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.c(r1, r0)
            r5 = 1
            return r5
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuf.c(n55):boolean");
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        suf sufVar;
        long j3;
        SparseArray<vuf> sparseArray = this.h;
        List<qmf> list = this.c;
        ka2.q(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qmf qmfVar = list.get(i);
            synchronized (qmfVar) {
                j3 = qmfVar.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = qmfVar.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                qmfVar.f(j2);
            }
        }
        if (j2 != 0 && (sufVar = this.l) != null) {
            sufVar.c(j2);
        }
        this.d.G(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray.valueAt(i2).c();
        }
        this.s = 0;
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        if ((this.b & 1) == 0) {
            o55Var = new eye(o55Var, this.g);
        }
        this.m = o55Var;
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
