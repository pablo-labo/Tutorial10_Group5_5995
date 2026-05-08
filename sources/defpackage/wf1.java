package defpackage;

import defpackage.zxd;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf1 {
    public final a a;
    public final f b;
    public c c;
    public final int d;

    public static class a implements zxd {
        public final d a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;

        public a(d dVar, long j, long j2, long j3, long j4, long j5) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
        }

        @Override // defpackage.zxd
        public final zxd.a e(long j) {
            byd bydVar = new byd(j, c.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
            return new zxd.a(bydVar, bydVar);
        }

        @Override // defpackage.zxd
        public final boolean h() {
            return true;
        }

        @Override // defpackage.zxd
        public final long k() {
            return this.b;
        }
    }

    public static final class b implements d {
        @Override // wf1.d
        public final long a(long j) {
            return j;
        }
    }

    public static class c {
        public final long a;
        public final long b;
        public final long c;
        public long d = 0;
        public long e;
        public long f;
        public long g;
        public long h;

        public c(long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = j;
            this.b = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.c = j6;
            this.h = a(j2, 0L, j3, j4, j5, j6);
        }

        public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return vjg.j(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    public interface d {
        long a(long j);
    }

    public static final class e {
        public static final e d = new e(-9223372036854775807L, -3, -1);
        public final int a;
        public final long b;
        public final long c;

        public e(long j, int i, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public interface f {
        e a(n55 n55Var, long j);

        default void b() {
        }
    }

    public wf1(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5);
    }

    public static int b(n55 n55Var, long j, dhb dhbVar) {
        if (j == n55Var.getPosition()) {
            return 0;
        }
        dhbVar.a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        return b(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.n55 r28, defpackage.dhb r29) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf1.a(n55, dhb):int");
    }

    public final void c(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.a != j) {
            a aVar = this.a;
            this.c = new c(j, aVar.a.a(j), aVar.c, aVar.d, aVar.e, aVar.f);
        }
    }
}
