package defpackage;

import android.media.AudioTrack;
import defpackage.ll3;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class vy0 {
    public boolean A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public d82 F;
    public final ll3.j a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public uy0 e;
    public int f;
    public long g;
    public float h;
    public boolean i;
    public long j;
    public int k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public int v;
    public long w;
    public long x;
    public long y;
    public long z;

    public vy0(ll3.j jVar) {
        this.a = jVar;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.C = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.F = d82.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy0.a():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r12 = this;
            long r0 = r12.w
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.d()
            long r2 = r12.z
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            d82 r0 = r12.F
            long r0 = r0.d()
            long r4 = r12.r
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L7c
            android.media.AudioTrack r4 = r12.c
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L33
            goto L7a
        L33:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r4 > r8) goto L5e
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5c
            long r10 = r12.s
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5c
            r4 = 3
            if (r5 != r4) goto L5c
            long r4 = r12.x
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L7a
            r12.x = r0
            goto L7a
        L5c:
            r12.x = r2
        L5e:
            long r2 = r12.s
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L78
            boolean r4 = r12.D
            if (r4 == 0) goto L71
            long r4 = r12.E
            long r4 = r4 + r2
            r12.E = r4
            r2 = 0
            r12.D = r2
            goto L78
        L71:
            long r2 = r12.t
            r4 = 1
            long r2 = r2 + r4
            r12.t = r2
        L78:
            r12.s = r6
        L7a:
            r12.r = r0
        L7c:
            long r0 = r12.s
            long r2 = r12.E
            long r0 = r0 + r2
            long r2 = r12.t
            r12 = 32
            long r2 = r2 << r12
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy0.b():long");
    }

    public final long c(long j) {
        long jZ;
        if (this.v != 0) {
            jZ = vjg.z(j + this.l, this.h);
        } else if (this.w != -9223372036854775807L) {
            jZ = vjg.V(this.f, d());
        } else {
            jZ = vjg.V(this.f, b());
        }
        long jMax = Math.max(0L, jZ - this.o);
        if (this.w == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(vjg.V(this.f, this.z), jMax);
    }

    public final long d() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.y;
        }
        return this.y + vjg.X(vjg.z(vjg.O(this.F.d()) - this.w, this.h), this.f, 1000000L, RoundingMode.UP);
    }

    public final void e(long j) {
        if (this.A) {
            long j2 = this.j;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jA = this.F.a() - vjg.c0(vjg.C(j - j2, this.h));
            this.j = -9223372036854775807L;
            this.a.a(jA);
        }
    }

    public final void f() {
        this.l = 0L;
        this.v = 0;
        this.u = 0;
        this.m = 0L;
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.i = false;
    }
}
