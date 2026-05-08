package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.h;
import defpackage.e47;
import defpackage.emf;
import defpackage.ka2;
import defpackage.m20;
import defpackage.q20;
import defpackage.sf6;
import defpackage.xj9;
import defpackage.yj9;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final m20 c;
    public final sf6 d;
    public final q20 e;
    public long f;
    public int g;
    public boolean h;
    public xj9 j;
    public xj9 k;
    public xj9 l;
    public xj9 m;
    public xj9 n;
    public int o;
    public Object p;
    public long q;
    public ExoPlayer.c i = ExoPlayer.c.a;
    public final emf.b a = new emf.b();
    public final emf.d b = new emf.d();
    public ArrayList r = new ArrayList();

    public h(m20 m20Var, sf6 sf6Var, q20 q20Var) {
        this.c = m20Var;
        this.d = sf6Var;
        this.e = q20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.exoplayer.source.h.b q(defpackage.emf r14, java.lang.Object r15, long r16, long r18, emf.d r20, emf.b r21) {
        /*
            r0 = r16
            r2 = r20
            r4 = r21
            r14.g(r15, r4)
            int r5 = r4.c
            r14.n(r5, r2)
            int r5 = r14.b(r15)
            r7 = r15
        L13:
            ba r3 = r4.g
            int r3 = r3.a
            r6 = -1
            if (r3 == 0) goto L6d
            r8 = 1
            r9 = 0
            if (r3 != r8) goto L24
            boolean r10 = r4.g(r9)
            if (r10 != 0) goto L6d
        L24:
            ba r10 = r4.g
            int r10 = r10.d
            boolean r10 = r4.h(r10)
            if (r10 == 0) goto L6d
            r10 = 0
            int r12 = r4.c(r10)
            if (r12 == r6) goto L37
            goto L6d
        L37:
            long r12 = r4.d
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 != 0) goto L3e
            goto L5e
        L3e:
            int r12 = r3 + (-1)
            boolean r12 = r4.g(r12)
            if (r12 == 0) goto L48
            r12 = 2
            goto L49
        L48:
            r12 = r8
        L49:
            int r3 = r3 - r12
        L4a:
            if (r9 > r3) goto L58
            ba r12 = r4.g
            ba$a r12 = r12.a(r9)
            long r12 = r12.i
            long r10 = r10 + r12
            int r9 = r9 + 1
            goto L4a
        L58:
            long r12 = r4.d
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 > 0) goto L6d
        L5e:
            int r3 = r2.n
            if (r5 > r3) goto L6d
            r14.f(r5, r4, r8)
            java.lang.Object r7 = r4.b
            r7.getClass()
            int r5 = r5 + 1
            goto L13
        L6d:
            r14.g(r7, r4)
            int r8 = r4.c(r0)
            if (r8 != r6) goto L82
            int r14 = r4.b(r0)
            androidx.media3.exoplayer.source.h$b r0 = new androidx.media3.exoplayer.source.h$b
            r10 = r18
            r0.<init>(r7, r14, r10)
            return r0
        L82:
            r10 = r18
            int r9 = r4.f(r8)
            androidx.media3.exoplayer.source.h$b r6 = new androidx.media3.exoplayer.source.h$b
            r12 = -1
            r6.<init>(r7, r8, r9, r10, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.h.q(emf, java.lang.Object, long, long, emf$d, emf$b):androidx.media3.exoplayer.source.h$b");
    }

    public final xj9 a() {
        xj9 xj9Var = this.j;
        if (xj9Var == null) {
            return null;
        }
        if (xj9Var == this.k) {
            this.k = xj9Var.m;
        }
        if (xj9Var == this.l) {
            this.l = xj9Var.m;
        }
        xj9Var.i();
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.m = null;
            xj9 xj9Var2 = this.j;
            this.p = xj9Var2.b;
            this.q = xj9Var2.g.a.d;
        }
        this.j = this.j.m;
        m();
        return this.j;
    }

    public final void b() {
        if (this.o == 0) {
            return;
        }
        xj9 xj9Var = this.j;
        ka2.r(xj9Var);
        this.p = xj9Var.b;
        this.q = xj9Var.g.a.d;
        while (xj9Var != null) {
            xj9Var.i();
            xj9Var = xj9Var.m;
        }
        this.j = null;
        this.m = null;
        this.k = null;
        this.l = null;
        this.o = 0;
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yj9 c(defpackage.emf r19, defpackage.xj9 r20, long r21) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.h.c(emf, xj9, long):yj9");
    }

    public final yj9 d(emf emfVar, xj9 xj9Var, long j) {
        emf.b bVar;
        emf emfVar2;
        yj9 yj9Var = xj9Var.g;
        long j2 = (xj9Var.p + yj9Var.e) - j;
        if (yj9Var.h) {
            return c(emfVar, xj9Var, j2);
        }
        h.b bVar2 = yj9Var.a;
        Object obj = bVar2.a;
        int i = bVar2.e;
        emf.b bVar3 = this.a;
        emfVar.g(obj, bVar3);
        boolean z = yj9Var.g;
        if (!bVar2.b()) {
            if (i != -1 && bVar3.g(i)) {
                return c(emfVar, xj9Var, j2);
            }
            int iF = bVar3.f(i);
            boolean z2 = bVar3.h(i) && bVar3.e(i, iF) == 3;
            if (iF != bVar3.g.a(i).b && !z2) {
                return f(emfVar, bVar2.a, bVar2.e, iF, yj9Var.e, bVar2.d, z);
            }
            emfVar.g(obj, bVar3);
            long jD = bVar3.d(i);
            return g(emfVar, bVar2.a, jD == Long.MIN_VALUE ? bVar3.d : bVar3.g.a(i).i + jD, yj9Var.e, bVar2.d, false);
        }
        int i2 = bVar2.b;
        int i3 = bVar3.g.a(i2).b;
        if (i3 == -1) {
            return null;
        }
        int iA = bVar3.g.a(i2).a(bVar2.c);
        if (iA < i3) {
            return f(emfVar, bVar2.a, i2, iA, yj9Var.c, bVar2.d, z);
        }
        long jLongValue = yj9Var.c;
        if (jLongValue == -9223372036854775807L) {
            Pair<Object, Long> pairJ = emfVar.j(this.b, bVar3, bVar3.c, -9223372036854775807L, Math.max(0L, j2));
            bVar = bVar3;
            emfVar2 = emfVar;
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
        } else {
            bVar = bVar3;
            emfVar2 = emfVar;
        }
        int i4 = bVar2.b;
        emfVar2.g(obj, bVar);
        long jD2 = bVar.d(i4);
        return g(emfVar, bVar2.a, Math.max(jD2 == Long.MIN_VALUE ? bVar.d : bVar.g.a(i4).i + jD2, jLongValue), yj9Var.c, bVar2.d, z);
    }

    public final yj9 e(emf emfVar, h.b bVar, long j, long j2) {
        emfVar.g(bVar.a, this.a);
        boolean zB = bVar.b();
        Object obj = bVar.a;
        return zB ? f(emfVar, obj, bVar.b, bVar.c, j, bVar.d, false) : g(emfVar, obj, j2, j, bVar.d, false);
    }

    public final yj9 f(emf emfVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        h.b bVar = new h.b(obj, i, i2, j2, -1);
        emf.b bVar2 = this.a;
        long jA = emfVar.g(obj, bVar2).a(i, i2);
        long jMax = i2 == bVar2.f(i) ? bVar2.g.b : 0L;
        boolean zH = bVar2.h(i);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new yj9(bVar, jMax, j, -9223372036854775807L, jA, z, zH, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yj9 g(defpackage.emf r27, java.lang.Object r28, long r29, long r31, long r33, boolean r35) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.h.g(emf, java.lang.Object, long, long, long, boolean):yj9");
    }

    public final xj9 h() {
        return this.l;
    }

    public final yj9 i(emf emfVar, yj9 yj9Var) {
        boolean z;
        h.b bVar = yj9Var.a;
        boolean zB = bVar.b();
        int i = bVar.e;
        boolean zH = false;
        boolean z2 = !zB && i == -1;
        int i2 = bVar.b;
        boolean zK = k(emfVar, bVar);
        boolean zJ = j(emfVar, bVar, z2);
        Object obj = bVar.a;
        emf.b bVar2 = this.a;
        emfVar.g(obj, bVar2);
        long jD = (bVar.b() || i == -1) ? -9223372036854775807L : bVar2.d(i);
        long jA = bVar.b() ? bVar2.a(i2, bVar.c) : (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? bVar2.d : jD;
        if (!bVar.b()) {
            if (i != -1 && bVar2.h(i)) {
                z = true;
            }
            return new yj9(bVar, yj9Var.b, yj9Var.c, jD, jA, yj9Var.f, z, z2, zK, zJ);
        }
        zH = bVar2.h(i2);
        z = zH;
        return new yj9(bVar, yj9Var.b, yj9Var.c, jD, jA, yj9Var.f, z, z2, zK, zJ);
    }

    public final boolean j(emf emfVar, h.b bVar, boolean z) {
        int iB = emfVar.b(bVar.a);
        if (!emfVar.m(emfVar.f(iB, this.a, false).c, this.b, 0L).h) {
            if (emfVar.d(iB, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(emf emfVar, h.b bVar) {
        boolean z = !bVar.b() && bVar.e == -1;
        Object obj = bVar.a;
        if (z) {
            if (emfVar.m(emfVar.g(obj, this.a).c, this.b, 0L).n == emfVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        xj9 xj9Var = this.n;
        if (xj9Var == null || xj9Var.h()) {
            this.n = null;
            for (int i = 0; i < this.r.size(); i++) {
                xj9 xj9Var2 = (xj9) this.r.get(i);
                if (!xj9Var2.h()) {
                    this.n = xj9Var2;
                    return;
                }
            }
        }
    }

    public final void m() {
        e47.b bVar = e47.b;
        final e47.a aVar = new e47.a();
        for (xj9 xj9Var = this.j; xj9Var != null; xj9Var = xj9Var.m) {
            aVar.c(xj9Var.g.a);
        }
        xj9 xj9Var2 = this.k;
        final h.b bVar2 = xj9Var2 == null ? null : xj9Var2.g.a;
        this.d.i(new Runnable() { // from class: zj9
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.a0(aVar.f(), bVar2);
            }
        });
    }

    public final void n(long j) {
        xj9 xj9Var = this.m;
        if (xj9Var != null) {
            ka2.q(xj9Var.m == null);
            if (xj9Var.e) {
                xj9Var.a.u(j - xj9Var.p);
            }
        }
    }

    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.r.size(); i++) {
            ((xj9) this.r.get(i)).i();
        }
        this.r = arrayList;
        this.n = null;
        l();
    }

    public final int p(xj9 xj9Var) {
        ka2.r(xj9Var);
        int i = 0;
        if (xj9Var != this.m) {
            this.m = xj9Var;
            while (true) {
                xj9Var = xj9Var.m;
                if (xj9Var == null) {
                    break;
                }
                if (xj9Var == this.k) {
                    xj9 xj9Var2 = this.j;
                    this.k = xj9Var2;
                    this.l = xj9Var2;
                    i = 3;
                }
                if (xj9Var == this.l) {
                    this.l = this.k;
                    i |= 2;
                }
                xj9Var.i();
                this.o--;
            }
            xj9 xj9Var3 = this.m;
            xj9Var3.getClass();
            if (xj9Var3.m != null) {
                xj9Var3.b();
                xj9Var3.m = null;
                xj9Var3.c();
            }
            m();
        }
        return i;
    }

    public final h.b r(emf emfVar, Object obj, long j) {
        long jS;
        int iB;
        Object obj2 = obj;
        emf.b bVar = this.a;
        int i = emfVar.g(obj2, bVar).c;
        Object obj3 = this.p;
        if (obj3 == null || (iB = emfVar.b(obj3)) == -1 || emfVar.f(iB, bVar, false).c != i) {
            xj9 xj9Var = this.j;
            while (true) {
                if (xj9Var == null) {
                    xj9 xj9Var2 = this.j;
                    while (true) {
                        if (xj9Var2 != null) {
                            int iB2 = emfVar.b(xj9Var2.b);
                            if (iB2 != -1 && emfVar.f(iB2, bVar, false).c == i) {
                                jS = xj9Var2.g.a.d;
                                break;
                            }
                            xj9Var2 = xj9Var2.m;
                        } else {
                            jS = s(obj2);
                            if (jS == -1) {
                                jS = this.f;
                                this.f = 1 + jS;
                                if (this.j == null) {
                                    this.p = obj2;
                                    this.q = jS;
                                }
                            }
                        }
                    }
                } else {
                    if (xj9Var.b.equals(obj2)) {
                        jS = xj9Var.g.a.d;
                        break;
                    }
                    xj9Var = xj9Var.m;
                }
            }
        } else {
            jS = this.q;
        }
        emfVar.g(obj2, bVar);
        int i2 = bVar.c;
        emf.d dVar = this.b;
        emfVar.n(i2, dVar);
        boolean z = false;
        for (int iB3 = emfVar.b(obj); iB3 >= dVar.m; iB3--) {
            emfVar.f(iB3, bVar, true);
            boolean z2 = bVar.g.a > 0;
            z |= z2;
            if (bVar.c(bVar.d) != -1) {
                obj2 = bVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || bVar.d != 0)) {
                break;
            }
        }
        return q(emfVar, obj2, j, jS, this.b, this.a);
    }

    public final long s(Object obj) {
        for (int i = 0; i < this.r.size(); i++) {
            xj9 xj9Var = (xj9) this.r.get(i);
            if (xj9Var.b.equals(obj)) {
                return xj9Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int t(emf emfVar) {
        emf emfVar2;
        xj9 xj9Var;
        xj9 xj9Var2 = this.j;
        if (xj9Var2 == null) {
            return 0;
        }
        int iB = emfVar.b(xj9Var2.b);
        while (true) {
            emfVar2 = emfVar;
            iB = emfVar2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                xj9Var = xj9Var2.m;
                if (xj9Var == null || xj9Var2.g.h) {
                    break;
                }
                xj9Var2 = xj9Var;
            }
            if (iB == -1 || xj9Var == null || emfVar2.b(xj9Var.b) != iB) {
                break;
            }
            xj9Var2 = xj9Var;
            emfVar = emfVar2;
        }
        int iP = p(xj9Var2);
        xj9Var2.g = i(emfVar2, xj9Var2.g);
        return iP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        return p(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u(defpackage.emf r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            xj9 r2 = r0.j
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Lb5
            yj9 r5 = r2.g
            if (r3 != 0) goto L15
            yj9 r3 = r0.i(r1, r5)
            r6 = r19
            goto L30
        L15:
            r6 = r19
            yj9 r8 = r0.d(r1, r3, r6)
            if (r8 == 0) goto Lb0
            long r9 = r5.b
            long r11 = r8.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto Lb0
            androidx.media3.exoplayer.source.h$b r9 = r5.a
            androidx.media3.exoplayer.source.h$b r10 = r8.a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r3 = r8
        L30:
            long r8 = r3.e
            long r10 = r5.c
            long r12 = r5.e
            yj9 r10 = r3.a(r10)
            r2.g = r10
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 == 0) goto La7
            r2.k()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L52
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L55
        L52:
            long r10 = r2.p
            long r8 = r8 + r10
        L55:
            xj9 r1 = r0.k
            r10 = 1
            r14 = -9223372036854775808
            if (r2 != r1) goto L6c
            yj9 r1 = r2.g
            boolean r1 = r1.g
            if (r1 != 0) goto L6c
            int r1 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r1 == 0) goto L6a
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 < 0) goto L6c
        L6a:
            r1 = r10
            goto L6d
        L6c:
            r1 = r4
        L6d:
            xj9 r11 = r0.l
            if (r2 != r11) goto L7b
            int r11 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r11 == 0) goto L79
            int r8 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r8 < 0) goto L7b
        L79:
            r8 = r10
            goto L7c
        L7b:
            r8 = r4
        L7c:
            int r0 = r0.p(r2)
            if (r0 == 0) goto L83
            return r0
        L83:
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L99
            long r11 = r5.d
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 != 0) goto L99
            long r2 = r3.d
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 == 0) goto L99
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L99
            r2 = r10
            goto L9a
        L99:
            r2 = r4
        L9a:
            if (r1 == 0) goto La1
            if (r0 != 0) goto La0
            if (r2 == 0) goto La1
        La0:
            r4 = r10
        La1:
            if (r8 == 0) goto La6
            r0 = r4 | 2
            return r0
        La6:
            return r4
        La7:
            xj9 r3 = r2.m
            r16 = r3
            r3 = r2
            r2 = r16
            goto L7
        Lb0:
            int r0 = r0.p(r3)
            return r0
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.h.u(emf, long, long, long):int");
    }
}
