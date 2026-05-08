package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.source.n;
import defpackage.g4b;
import defpackage.g7;
import defpackage.j20;
import defpackage.joe;
import defpackage.k20;
import defpackage.ka2;
import defpackage.qk3;
import defpackage.ql0;
import defpackage.te3;
import defpackage.zpf;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o implements zpf {
    public androidx.media3.common.a A;
    public androidx.media3.common.a B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final n a;
    public final androidx.media3.exoplayer.drm.b d;
    public final a.C0043a e;
    public c f;
    public androidx.media3.common.a g;
    public DrmSession h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final a b = new a();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public zpf.a[] o = new zpf.a[1000];
    public final joe<b> c = new joe<>(new g7(20));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public static final class a {
        public int a;
        public long b;
        public zpf.a c;
    }

    public static final class b {
        public final androidx.media3.common.a a;
        public final b.InterfaceC0045b b;

        public b(androidx.media3.common.a aVar, b.InterfaceC0045b interfaceC0045b) {
            this.a = aVar;
            this.b = interfaceC0045b;
        }
    }

    public interface c {
        void a();
    }

    public o(qk3 qk3Var, androidx.media3.exoplayer.drm.b bVar, a.C0043a c0043a) {
        this.d = bVar;
        this.e = c0043a;
        this.a = new n(qk3Var);
    }

    public final synchronized long A() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[t(this.s)] : this.C;
    }

    public final int B(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        a aVar = this.b;
        synchronized (this) {
            try {
                decoderInputBuffer.e = false;
                i2 = -3;
                if (this.s != this.p) {
                    androidx.media3.common.a aVar2 = this.c.a(s()).a;
                    if (!z2 && aVar2 == this.g) {
                        int iT = t(this.s);
                        if (x(iT)) {
                            decoderInputBuffer.a = this.m[iT];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                decoderInputBuffer.c(536870912);
                            }
                            decoderInputBuffer.f = this.n[iT];
                            aVar.a = this.l[iT];
                            aVar.b = this.k[iT];
                            aVar.c = this.o[iT];
                            i2 = -4;
                        } else {
                            decoderInputBuffer.e = true;
                        }
                    }
                    z(aVar2, ql0Var);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        androidx.media3.common.a aVar3 = this.B;
                        if (aVar3 == null || (!z2 && aVar3 == this.g)) {
                        }
                        z(aVar3, ql0Var);
                        i2 = -5;
                    }
                    decoderInputBuffer.a = 4;
                    decoderInputBuffer.f = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !decoderInputBuffer.h(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                n nVar = this.a;
                a aVar4 = this.b;
                if (z3) {
                    n.f(nVar.e, decoderInputBuffer, aVar4, nVar.c);
                } else {
                    nVar.e = n.f(nVar.e, decoderInputBuffer, aVar4, nVar.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void C(boolean z) {
        n nVar = this.a;
        nVar.a(nVar.d);
        n.a aVar = nVar.d;
        int i = nVar.b;
        ka2.q(aVar.c == null);
        aVar.a = 0L;
        aVar.b = i;
        n.a aVar2 = nVar.d;
        nVar.e = aVar2;
        nVar.f = aVar2;
        nVar.g = 0L;
        nVar.a.c();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        joe<b> joeVar = this.c;
        SparseArray<b> sparseArray = joeVar.b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            joeVar.c.accept(sparseArray.valueAt(i2));
        }
        joeVar.a = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean D(int i) {
        synchronized (this) {
            this.s = 0;
            n nVar = this.a;
            nVar.e = nVar.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean E(long j, boolean z) {
        Throwable th;
        o oVar;
        o oVar2;
        long j2;
        int iN;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.s = 0;
                                n nVar = this.a;
                                nVar.e = nVar.d;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    oVar = this;
                                    th = th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                oVar = this;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th6) {
                        th = th6;
                        oVar = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            int iT = t(0);
            int i = this.s;
            int i2 = this.p;
            if (!(i != i2) || j < this.n[iT] || (j > this.v && !z)) {
                return false;
            }
            if (this.D) {
                iN = i2 - i;
                int i3 = 0;
                while (true) {
                    if (i3 < iN) {
                        try {
                            if (this.n[iT] >= j) {
                                iN = i3;
                                break;
                            }
                            iT++;
                            if (iT == this.i) {
                                iT = 0;
                            }
                            i3++;
                        } catch (Throwable th8) {
                            th = th8;
                            oVar = this;
                        }
                    } else if (!z) {
                        iN = -1;
                    }
                }
                oVar2 = this;
                j2 = j;
            } else {
                oVar2 = this;
                j2 = j;
                iN = oVar2.n(iT, i2 - i, j2, true);
            }
            if (iN == -1) {
                return false;
            }
            oVar2.t = j2;
            oVar2.s += iN;
            return true;
        } catch (Throwable th9) {
            th = th9;
            oVar = this;
            th = th;
        }
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void F(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            defpackage.ka2.l(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.o.F(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0108 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00ef, B:96:0x0165, B:98:0x016e, B:75:0x0108, B:77:0x0111, B:79:0x011a, B:81:0x012d, B:85:0x0136, B:86:0x013b, B:88:0x0141, B:92:0x014f, B:94:0x0154, B:95:0x0162, B:78:0x0118), top: B:104:0x008d }] */
    @Override // defpackage.zpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r10, int r12, int r13, int r14, zpf.a r15) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.o.a(long, int, int, int, zpf$a):void");
    }

    @Override // defpackage.zpf
    public final void b(g4b g4bVar, int i, int i2) {
        while (true) {
            n nVar = this.a;
            if (i <= 0) {
                nVar.getClass();
                return;
            }
            int iC = nVar.c(i);
            n.a aVar = nVar.f;
            j20 j20Var = aVar.c;
            g4bVar.h(((int) (nVar.g - aVar.a)) + j20Var.b, j20Var.a, iC);
            i -= iC;
            long j = nVar.g + ((long) iC);
            nVar.g = j;
            n.a aVar2 = nVar.f;
            if (j == aVar2.b) {
                nVar.f = aVar2.d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0026, B:15:0x003d, B:19:0x0055, B:18:0x0053), top: B:29:0x000a }] */
    @Override // defpackage.zpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.media3.common.a r5) {
        /*
            r4 = this;
            androidx.media3.common.a r0 = r4.o(r5)
            r1 = 0
            r4.z = r1
            r4.A = r5
            monitor-enter(r4)
            r4.y = r1     // Catch: java.lang.Throwable -> L51
            androidx.media3.common.a r5 = r4.B     // Catch: java.lang.Throwable -> L51
            boolean r5 = java.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L16
            monitor-exit(r4)
            goto L68
        L16:
            joe<androidx.media3.exoplayer.source.o$b> r5 = r4.c     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray<V> r5 = r5.b     // Catch: java.lang.Throwable -> L51
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L51
            r2 = 1
            if (r5 != 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            if (r5 != 0) goto L53
            joe<androidx.media3.exoplayer.source.o$b> r5 = r4.c     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray<V> r5 = r5.b     // Catch: java.lang.Throwable -> L51
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L51
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L51
            androidx.media3.exoplayer.source.o$b r5 = (androidx.media3.exoplayer.source.o.b) r5     // Catch: java.lang.Throwable -> L51
            androidx.media3.common.a r5 = r5.a     // Catch: java.lang.Throwable -> L51
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L53
            joe<androidx.media3.exoplayer.source.o$b> r5 = r4.c     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray<V> r5 = r5.b     // Catch: java.lang.Throwable -> L51
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L51
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L51
            androidx.media3.exoplayer.source.o$b r5 = (androidx.media3.exoplayer.source.o.b) r5     // Catch: java.lang.Throwable -> L51
            androidx.media3.common.a r5 = r5.a     // Catch: java.lang.Throwable -> L51
            r4.B = r5     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r5 = move-exception
            goto L72
        L53:
            r4.B = r0     // Catch: java.lang.Throwable -> L51
        L55:
            boolean r5 = r4.D     // Catch: java.lang.Throwable -> L51
            androidx.media3.common.a r0 = r4.B     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r0.n     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r0.k     // Catch: java.lang.Throwable -> L51
            boolean r0 = defpackage.st9.a(r3, r0)     // Catch: java.lang.Throwable -> L51
            r5 = r5 & r0
            r4.D = r5     // Catch: java.lang.Throwable -> L51
            r4.E = r1     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)
            r1 = r2
        L68:
            androidx.media3.exoplayer.source.o$c r4 = r4.f
            if (r4 == 0) goto L71
            if (r1 == 0) goto L71
            r4.a()
        L71:
            return
        L72:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.o.d(androidx.media3.common.a):void");
    }

    @Override // defpackage.zpf
    public final int e(te3 te3Var, int i, boolean z) throws EOFException {
        n nVar = this.a;
        int iC = nVar.c(i);
        n.a aVar = nVar.f;
        j20 j20Var = aVar.c;
        int i2 = te3Var.read(j20Var.a, ((int) (nVar.g - aVar.a)) + j20Var.b, iC);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            k20.n();
            return 0;
        }
        long j = nVar.g + ((long) i2);
        nVar.g = j;
        n.a aVar2 = nVar.f;
        if (j == aVar2.b) {
            nVar.f = aVar2.d;
        }
        return i2;
    }

    public final int g(long j) {
        int i = this.p;
        int iT = t(i - 1);
        while (i > this.s && this.n[iT] >= j) {
            i--;
            iT--;
            if (iT == -1) {
                iT = this.i - 1;
            }
        }
        return i;
    }

    public final long h(int i) {
        this.u = Math.max(this.u, r(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        joe<b> joeVar = this.c;
        SparseArray<b> sparseArray = joeVar.b;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            joeVar.c.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = joeVar.a;
            if (i8 > 0) {
                joeVar.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r12, boolean r14, boolean r15) {
        /*
            r11 = this;
            androidx.media3.exoplayer.source.n r0 = r11.a
            monitor-enter(r11)
            int r1 = r11.p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r15 == 0) goto L1d
            int r15 = r11.s     // Catch: java.lang.Throwable -> L22
            if (r15 == r1) goto L1d
            int r1 = r15 + 1
        L1d:
            r5 = r11
            r8 = r12
            r10 = r14
            r7 = r1
            goto L26
        L22:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L26:
            int r11 = r5.n(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r12 = -1
            if (r11 != r12) goto L2f
            monitor-exit(r5)
            goto L3c
        L2f:
            long r2 = r5.h(r11)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r5)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r5)
        L3c:
            r0.b(r2)
            return
        L40:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.o.i(long, boolean, boolean):void");
    }

    public final void j() {
        long jH;
        n nVar = this.a;
        synchronized (this) {
            int i = this.p;
            jH = i == 0 ? -1L : h(i);
        }
        nVar.b(jH);
    }

    public final void k(long j) {
        if (this.p == 0) {
            return;
        }
        ka2.l(j > q());
        m(this.q + g(j));
    }

    public final long l(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        ka2.l(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, r(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        joe<b> joeVar = this.c;
        SparseArray<b> sparseArray = joeVar.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            joeVar.c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        joeVar.a = sparseArray.size() > 0 ? Math.min(joeVar.a, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        int iT = t(i6 - 1);
        return this.k[iT] + ((long) this.l[iT]);
    }

    public final void m(int i) {
        n.a aVar;
        long jL = l(i);
        n nVar = this.a;
        int i2 = nVar.b;
        ka2.l(jL <= nVar.g);
        nVar.g = jL;
        if (jL != 0) {
            n.a aVar2 = nVar.d;
            if (jL != aVar2.a) {
                while (true) {
                    long j = nVar.g;
                    long j2 = aVar2.b;
                    aVar = aVar2.d;
                    if (j <= j2) {
                        break;
                    } else {
                        aVar2 = aVar;
                    }
                }
                aVar.getClass();
                nVar.a(aVar);
                n.a aVar3 = new n.a(aVar2.b, i2);
                aVar2.d = aVar3;
                if (nVar.g == aVar2.b) {
                    aVar2 = aVar3;
                }
                nVar.f = aVar2;
                if (nVar.e == aVar) {
                    nVar.e = aVar3;
                    return;
                }
                return;
            }
        }
        nVar.a(nVar.d);
        n.a aVar4 = new n.a(nVar.g, i2);
        nVar.d = aVar4;
        nVar.e = aVar4;
        nVar.f = aVar4;
    }

    public final int n(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public androidx.media3.common.a o(androidx.media3.common.a aVar) {
        if (this.F == 0 || aVar.s == Long.MAX_VALUE) {
            return aVar;
        }
        a.C0036a c0036aA = aVar.a();
        c0036aA.r = aVar.s + this.F;
        return new androidx.media3.common.a(c0036aA);
    }

    public final synchronized long p() {
        return this.v;
    }

    public final synchronized long q() {
        return Math.max(this.u, r(this.s));
    }

    public final long r(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iT = t(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iT]);
            if ((this.m[iT] & 1) != 0) {
                return jMax;
            }
            iT--;
            if (iT == -1) {
                iT = this.i - 1;
            }
        }
        return jMax;
    }

    public final int s() {
        return this.q + this.s;
    }

    public final int t(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int u(long j, boolean z) throws Throwable {
        try {
            try {
                int iT = t(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iT]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int iN = n(iT, i2 - i, j, true);
                if (iN == -1) {
                    return 0;
                }
                return iN;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    public final synchronized androidx.media3.common.a v() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean w(boolean z) {
        androidx.media3.common.a aVar;
        boolean z2 = false;
        if (this.s != this.p) {
            if (this.c.a(s()).a != this.g) {
                return true;
            }
            return x(t(this.s));
        }
        if (z || this.w || ((aVar = this.B) != null && aVar != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean x(int i) {
        DrmSession drmSession = this.h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.b();
    }

    public final void y() throws DrmSession.DrmSessionException {
        DrmSession drmSession = this.h;
        if (drmSession == null || drmSession.getState() != 1) {
            return;
        }
        DrmSession.DrmSessionException drmSessionExceptionC = this.h.c();
        drmSessionExceptionC.getClass();
        throw drmSessionExceptionC;
    }

    public final void z(androidx.media3.common.a aVar, ql0 ql0Var) {
        androidx.media3.common.a aVar2;
        androidx.media3.common.a aVar3 = this.g;
        boolean z = aVar3 == null;
        DrmInitData drmInitData = aVar3 == null ? null : aVar3.r;
        this.g = aVar;
        DrmInitData drmInitData2 = aVar.r;
        androidx.media3.exoplayer.drm.b bVar = this.d;
        if (bVar != null) {
            int iC = bVar.c(aVar);
            a.C0036a c0036aA = aVar.a();
            c0036aA.N = iC;
            aVar2 = new androidx.media3.common.a(c0036aA);
        } else {
            aVar2 = aVar;
        }
        ql0Var.c = aVar2;
        ql0Var.b = this.h;
        if (bVar == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.h;
            a.C0043a c0043a = this.e;
            DrmSession drmSessionB = bVar.b(c0043a, aVar);
            this.h = drmSessionB;
            ql0Var.b = drmSessionB;
            if (drmSession != null) {
                drmSession.f(c0043a);
            }
        }
    }
}
