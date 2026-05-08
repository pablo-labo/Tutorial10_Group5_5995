package defpackage;

import android.net.Uri;
import defpackage.emf;
import defpackage.ij9;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xge extends emf {
    public static final Object r = new Object();
    public final long e;
    public final long f;
    public final long g = -9223372036854775807L;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Object o;
    public final ij9 p;
    public final ij9.e q;

    static {
        ij9.b.a aVar = new ij9.b.a();
        ij9.d.a aVar2 = new ij9.d.a();
        List list = Collections.EMPTY_LIST;
        qyc qycVar = qyc.e;
        ij9.e.a aVar3 = new ij9.e.a();
        ij9.g gVar = ij9.g.d;
        Uri uri = Uri.EMPTY;
        ka2.q(aVar2.b == null || aVar2.a != null);
        if (uri != null) {
            new ij9.f(uri, null, aVar2.a != null ? new ij9.d(aVar2) : null, null, list, null, qycVar, -9223372036854775807L);
        }
        new ij9.c(aVar);
        new ij9.e(aVar3);
        oj9 oj9Var = oj9.K;
    }

    public xge(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, ojh ojhVar, ij9 ij9Var, ij9.e eVar) {
        this.e = j;
        this.f = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = ojhVar;
        ij9Var.getClass();
        this.p = ij9Var;
        this.q = eVar;
    }

    @Override // defpackage.emf
    public final int b(Object obj) {
        return r != obj ? -1 : 0;
    }

    @Override // defpackage.emf
    public final emf.b f(int i, emf.b bVar, boolean z) {
        ka2.m(i, 1);
        Object obj = z ? r : null;
        long j = -this.j;
        bVar.getClass();
        bVar.i(null, obj, 0, this.h, j, ba.f, false);
        return bVar;
    }

    @Override // defpackage.emf
    public final int h() {
        return 1;
    }

    @Override // defpackage.emf
    public final Object l(int i) {
        ka2.m(i, 1);
        return r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.emf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final emf.d m(int r25, emf.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.ka2.m(r2, r1)
            long r1 = r0.k
            boolean r14 = r0.m
            if (r14 == 0) goto L2d
            boolean r3 = r0.n
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = emf.d.p
            r21 = 0
            long r1 = r0.j
            ij9 r5 = r0.p
            java.lang.Object r6 = r0.o
            long r7 = r0.e
            long r9 = r0.f
            long r11 = r0.g
            boolean r13 = r0.l
            ij9$e r15 = r0.q
            r22 = r1
            long r0 = r0.i
            r20 = 0
            r3 = r26
            r18 = r0
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xge.m(int, emf$d, long):emf$d");
    }

    @Override // defpackage.emf
    public final int o() {
        return 1;
    }
}
