package defpackage;

import android.net.Uri;
import android.util.Pair;
import defpackage.ba;
import defpackage.ij9;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class emf {
    public static final a a = new a();
    public static final String b;
    public static final String c;
    public static final String d;

    public class a extends emf {
        @Override // defpackage.emf
        public final int b(Object obj) {
            return -1;
        }

        @Override // defpackage.emf
        public final b f(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.emf
        public final int h() {
            return 0;
        }

        @Override // defpackage.emf
        public final Object l(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.emf
        public final d m(int i, d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // defpackage.emf
        public final int o() {
            return 0;
        }
    }

    public static final class b {
        public static final String h;
        public static final String i;
        public static final String j;
        public static final String k;
        public static final String l;
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public ba g = ba.f;

        static {
            String str = vjg.a;
            h = Integer.toString(0, 36);
            i = Integer.toString(1, 36);
            j = Integer.toString(2, 36);
            k = Integer.toString(3, 36);
            l = Integer.toString(4, 36);
        }

        public final long a(int i2, int i3) {
            ba.a aVarA = this.g.a(i2);
            if (aVarA.b != -1) {
                return aVarA.g[i3];
            }
            return -9223372036854775807L;
        }

        public final int b(long j2) {
            ba.a aVarA;
            int i2;
            ba baVar = this.g;
            long j3 = this.d;
            int i3 = baVar.a;
            if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
                int i4 = baVar.d;
                while (i4 < i3 && ((baVar.a(i4).a != Long.MIN_VALUE && baVar.a(i4).a <= j2) || ((i2 = (aVarA = baVar.a(i4)).b) != -1 && aVarA.a(-1) >= i2))) {
                    i4++;
                }
                if (i4 < i3 && (j3 == -9223372036854775807L || baVar.a(i4).a <= j3)) {
                    return i4;
                }
            }
            return -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c(long r14) {
            /*
                r13 = this;
                ba r0 = r13.g
                long r1 = r13.d
                int r13 = r0.a
                int r3 = r13 + (-1)
                r4 = 1
                int r13 = r13 - r4
                r5 = 0
                r6 = -9223372036854775808
                r8 = -1
                if (r3 != r13) goto L24
                ba$a r13 = r0.a(r3)
                boolean r9 = r13.k
                if (r9 == 0) goto L24
                long r9 = r13.a
                int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r9 != 0) goto L24
                int r13 = r13.b
                if (r13 != r8) goto L24
                r13 = r4
                goto L25
            L24:
                r13 = r5
            L25:
                int r3 = r3 - r13
            L26:
                if (r3 < 0) goto L59
                int r13 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
                if (r13 != 0) goto L2d
                goto L59
            L2d:
                ba$a r13 = r0.a(r3)
                long r9 = r13.a
                int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r11 != 0) goto L52
                r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r11 == 0) goto L56
                boolean r11 = r13.k
                if (r11 == 0) goto L4d
                int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r9 != 0) goto L4d
                int r13 = r13.b
                if (r13 != r8) goto L4d
                goto L56
            L4d:
                int r13 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r13 >= 0) goto L59
                goto L56
            L52:
                int r13 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                if (r13 >= 0) goto L59
            L56:
                int r3 = r3 + (-1)
                goto L26
            L59:
                if (r3 < 0) goto L73
                ba$a r13 = r0.a(r3)
                int r14 = r13.b
                if (r14 != r8) goto L64
                goto L72
            L64:
                if (r5 >= r14) goto L73
                int[] r15 = r13.f
                r15 = r15[r5]
                if (r15 == 0) goto L72
                if (r15 != r4) goto L6f
                goto L72
            L6f:
                int r5 = r5 + 1
                goto L64
            L72:
                return r3
            L73:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: emf.b.c(long):int");
        }

        public final long d(int i2) {
            return this.g.a(i2).a;
        }

        public final int e(int i2, int i3) {
            ba.a aVarA = this.g.a(i2);
            if (aVarA.b != -1) {
                return aVarA.f[i3];
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && Objects.equals(this.g, bVar.g)) {
                    return true;
                }
            }
            return false;
        }

        public final int f(int i2) {
            return this.g.a(i2).a(-1);
        }

        public final boolean g(int i2) {
            ba baVar = this.g;
            int i3 = baVar.a;
            if (i2 != i3 - 1 || i2 != i3 - 1) {
                return false;
            }
            ba.a aVarA = baVar.a(i2);
            return aVarA.k && aVarA.a == Long.MIN_VALUE && aVarA.b == -1;
        }

        public final boolean h(int i2) {
            return this.g.a(i2).j;
        }

        public final int hashCode() {
            Object obj = this.a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j2 = this.d;
            int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.e;
            return this.g.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
        }

        public final void i(Object obj, Object obj2, int i2, long j2, long j3, ba baVar, boolean z) {
            this.a = obj;
            this.b = obj2;
            this.c = i2;
            this.d = j2;
            this.e = j3;
            this.g = baVar;
            this.f = z;
        }
    }

    public static final class c extends emf {
        public final e47<d> e;
        public final e47<b> f;
        public final int[] g;
        public final int[] h;

        public c(qyc qycVar, qyc qycVar2, int[] iArr) {
            ka2.l(qycVar.d == iArr.length);
            this.e = qycVar;
            this.f = qycVar2;
            this.g = iArr;
            this.h = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.h[iArr[i]] = i;
            }
        }

        @Override // defpackage.emf
        public final int a(boolean z) {
            if (p()) {
                return -1;
            }
            if (z) {
                return this.g[0];
            }
            return 0;
        }

        @Override // defpackage.emf
        public final int b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // defpackage.emf
        public final int c(boolean z) {
            if (p()) {
                return -1;
            }
            e47<d> e47Var = this.e;
            if (!z) {
                return e47Var.size() - 1;
            }
            return this.g[e47Var.size() - 1];
        }

        @Override // defpackage.emf
        public final int e(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == c(z)) {
                if (i2 == 2) {
                    return a(z);
                }
                return -1;
            }
            if (!z) {
                return i + 1;
            }
            return this.g[this.h[i] + 1];
        }

        @Override // defpackage.emf
        public final b f(int i, b bVar, boolean z) {
            b bVar2 = this.f.get(i);
            bVar.i(bVar2.a, bVar2.b, bVar2.c, bVar2.d, bVar2.e, bVar2.g, bVar2.f);
            return bVar;
        }

        @Override // defpackage.emf
        public final int h() {
            return this.f.size();
        }

        @Override // defpackage.emf
        public final int k(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == a(z)) {
                if (i2 == 2) {
                    return c(z);
                }
                return -1;
            }
            if (!z) {
                return i - 1;
            }
            return this.g[this.h[i] - 1];
        }

        @Override // defpackage.emf
        public final Object l(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // defpackage.emf
        public final d m(int i, d dVar, long j) {
            d dVar2 = this.e.get(i);
            dVar.b(dVar2.a, dVar2.b, dVar2.c, dVar2.d, dVar2.e, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.k, dVar2.l, dVar2.m, dVar2.n, dVar2.o);
            dVar.j = dVar2.j;
            return dVar;
        }

        @Override // defpackage.emf
        public final int o() {
            return this.e.size();
        }
    }

    public static final class d {
        public static final String A;
        public static final String B;
        public static final String C;
        public static final String D;
        public static final String E;
        public static final Object p = new Object();
        public static final Object q = new Object();
        public static final ij9 r;
        public static final String s;
        public static final String t;
        public static final String u;
        public static final String v;
        public static final String w;
        public static final String x;
        public static final String y;
        public static final String z;
        public Object a = p;
        public ij9 b = r;
        public Object c;
        public long d;
        public long e;
        public long f;
        public boolean g;
        public boolean h;
        public ij9.e i;
        public boolean j;
        public long k;
        public long l;
        public int m;
        public int n;
        public long o;

        static {
            ij9.f fVar;
            ij9.b.a aVar = new ij9.b.a();
            ij9.d.a aVar2 = new ij9.d.a();
            List list = Collections.EMPTY_LIST;
            qyc qycVar = qyc.e;
            ij9.e.a aVar3 = new ij9.e.a();
            ij9.g gVar = ij9.g.d;
            Uri uri = Uri.EMPTY;
            ka2.q(aVar2.b == null || aVar2.a != null);
            ij9.d dVar = null;
            if (uri != null) {
                if (aVar2.a != null) {
                    dVar = new ij9.d(aVar2);
                }
                fVar = new ij9.f(uri, null, dVar, null, list, null, qycVar, -9223372036854775807L);
            } else {
                fVar = null;
            }
            r = new ij9("androidx.media3.common.Timeline", new ij9.c(aVar), fVar, new ij9.e(aVar3), oj9.K, gVar);
            s = Integer.toString(1, 36);
            t = Integer.toString(2, 36);
            u = Integer.toString(3, 36);
            v = Integer.toString(4, 36);
            w = Integer.toString(5, 36);
            x = Integer.toString(6, 36);
            y = Integer.toString(7, 36);
            z = Integer.toString(8, 36);
            A = Integer.toString(9, 36);
            B = Integer.toString(10, 36);
            C = Integer.toString(11, 36);
            D = Integer.toString(12, 36);
            E = Integer.toString(13, 36);
        }

        public final boolean a() {
            return this.i != null;
        }

        public final void b(Object obj, ij9 ij9Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, ij9.e eVar, long j4, long j5, int i, int i2, long j6) {
            this.a = obj;
            this.b = ij9Var != null ? ij9Var : r;
            if (ij9Var != null) {
                ij9.f fVar = ij9Var.b;
            }
            this.c = obj2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = z2;
            this.h = z3;
            this.i = eVar;
            this.k = j4;
            this.l = j5;
            this.m = i;
            this.n = i2;
            this.o = j6;
            this.j = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (Objects.equals(this.a, dVar.a) && Objects.equals(this.b, dVar.b) && Objects.equals(this.c, dVar.c) && Objects.equals(this.i, dVar.i) && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.j == dVar.j && this.k == dVar.k && this.l == dVar.l && this.m == dVar.m && this.n == dVar.n && this.o == dVar.o) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
            Object obj = this.c;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            ij9.e eVar = this.i;
            int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j = this.d;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
            long j4 = this.k;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.l;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
            long j6 = this.o;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    static {
        String str = vjg.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, b bVar, d dVar, int i2, boolean z) {
        int i3 = f(i, bVar, false).c;
        if (m(i3, dVar, 0L).n != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, dVar, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        bg.h();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof emf) {
                emf emfVar = (emf) obj;
                if (emfVar.o() == o() && emfVar.h() == h()) {
                    d dVar = new d();
                    b bVar = new b();
                    d dVar2 = new d();
                    b bVar2 = new b();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int iA = a(true);
                                    if (iA == emfVar.a(true) && (iC = c(true)) == emfVar.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == emfVar.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, bVar, true).equals(emfVar.f(i2, bVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, dVar, 0L).equals(emfVar.m(i, dVar2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract b f(int i, b bVar, boolean z);

    public b g(Object obj, b bVar) {
        return f(b(obj), bVar, true);
    }

    public abstract int h();

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, dVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair<Object, Long> i(d dVar, b bVar, int i, long j) {
        Pair<Object, Long> pairJ = j(dVar, bVar, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair<Object, Long> j(d dVar, b bVar, int i, long j, long j2) {
        ka2.m(i, o());
        m(i, dVar, j2);
        if (j == -9223372036854775807L) {
            j = dVar.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.m;
        f(i2, bVar, false);
        while (i2 < dVar.n && bVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, bVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, bVar, true);
        long jMin = j - bVar.e;
        long j3 = bVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        bg.h();
        return 0;
    }

    public abstract Object l(int i);

    public abstract d m(int i, d dVar, long j);

    public final void n(int i, d dVar) {
        m(i, dVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
