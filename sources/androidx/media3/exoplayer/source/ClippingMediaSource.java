package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.h;
import defpackage.ba;
import defpackage.emf;
import defpackage.gq5;
import defpackage.ij9;
import defpackage.ka2;
import defpackage.qk3;
import defpackage.vjg;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource extends t {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList<androidx.media3.exoplayer.source.b> r;
    public final emf.d s;
    public b t;
    public IllegalClippingException u;
    public long v;
    public long w;

    public static final class a {
        public final h a;
        public long b;
        public long c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;

        public a(h hVar) {
            hVar.getClass();
            this.a = hVar;
            this.d = true;
            this.c = Long.MIN_VALUE;
        }
    }

    public static final class b extends gq5 {
        public final long f;
        public final long g;
        public final long h;
        public final boolean i;

        public b(emf emfVar, long j, long j2, boolean z) throws IllegalClippingException {
            super(emfVar);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new IllegalClippingException(j, 2, j2);
            }
            boolean z2 = false;
            if (emfVar.h() != 1) {
                throw new IllegalClippingException(0);
            }
            emf.d dVarM = emfVar.m(0, new emf.d(), 0L);
            long jMax = Math.max(0L, j);
            if (!z && !dVarM.j && jMax != 0 && !dVarM.g) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? dVarM.l : Math.max(0L, j2);
            long j3 = dVarM.l;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f = jMax;
            this.g = jMax2;
            this.h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (dVarM.h && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z2 = true;
            }
            this.i = z2;
        }

        @Override // defpackage.gq5, defpackage.emf
        public final emf.b f(int i, emf.b bVar, boolean z) {
            this.e.f(0, bVar, z);
            long j = bVar.e - this.f;
            long j2 = this.h;
            bVar.i(bVar.a, bVar.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, ba.f, false);
            return bVar;
        }

        @Override // defpackage.gq5, defpackage.emf
        public final emf.d m(int i, emf.d dVar, long j) {
            this.e.m(0, dVar, 0L);
            long j2 = dVar.o;
            long j3 = this.f;
            dVar.o = j2 + j3;
            dVar.l = this.h;
            dVar.h = this.i;
            long j4 = dVar.k;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                dVar.k = jMax;
                long j5 = this.g;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                dVar.k = jMax - j3;
            }
            long jC0 = vjg.c0(j3);
            long j6 = dVar.d;
            if (j6 != -9223372036854775807L) {
                dVar.d = j6 + jC0;
            }
            long j7 = dVar.e;
            if (j7 != -9223372036854775807L) {
                dVar.e = j7 + jC0;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(a aVar) {
        super(aVar.a);
        this.l = aVar.b;
        this.m = aVar.c;
        this.n = aVar.d;
        this.o = aVar.e;
        this.p = aVar.f;
        this.q = aVar.g;
        this.r = new ArrayList<>();
        this.s = new emf.d();
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void C(emf emfVar) {
        if (this.u != null) {
            return;
        }
        F(emfVar);
    }

    public final void F(emf emfVar) {
        long j;
        long j2;
        long j3;
        emf.d dVar = this.s;
        emfVar.n(0, dVar);
        long j4 = dVar.o;
        b bVar = this.t;
        long j5 = this.m;
        ArrayList<androidx.media3.exoplayer.source.b> arrayList = this.r;
        if (bVar == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            j = this.l;
            if (z) {
                long j6 = dVar.k;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.v = j4 + j;
            this.w = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                androidx.media3.exoplayer.source.b bVar2 = arrayList.get(i);
                long j7 = this.v;
                long j8 = this.w;
                bVar2.e = j7;
                bVar2.f = j8;
            }
            j3 = j2;
        } else {
            j = this.v - j4;
            j3 = j5 != Long.MIN_VALUE ? this.w - j4 : Long.MIN_VALUE;
        }
        try {
            b bVar3 = new b(emfVar, j, j3, this.q);
            this.t = bVar3;
            u(bVar3);
        } catch (IllegalClippingException e) {
            this.u = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).V = this.u;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final boolean a(ij9 ij9Var) {
        h hVar = this.k;
        return hVar.d().e.equals(ij9Var.e) && hVar.a(ij9Var);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void h(g gVar) {
        ArrayList<androidx.media3.exoplayer.source.b> arrayList = this.r;
        ka2.q(arrayList.remove(gVar));
        this.k.h(((androidx.media3.exoplayer.source.b) gVar).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        b bVar = this.t;
        bVar.getClass();
        F(bVar.e);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.h
    public final void m() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.u;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.m();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final g o(h.b bVar, qk3 qk3Var, long j) {
        androidx.media3.exoplayer.source.b bVar2 = new androidx.media3.exoplayer.source.b(this.k.o(bVar, qk3Var, j), this.n, this.v, this.w);
        this.r.add(bVar2);
        return bVar2;
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void v() {
        super.v();
        this.u = null;
        this.t = null;
    }

    public static final class IllegalClippingException extends IOException {
        public final int reason;

        /* JADX WARN: Illegal instructions before constructor call */
        public IllegalClippingException(long j, int i, long j2) {
            String str;
            if (i != 0) {
                if (i == 1) {
                    str = "not seekable to start";
                } else if (i != 2) {
                    str = "unknown";
                } else {
                    ka2.q((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                    str = "start exceeds end. Start time: " + j + ", End time: " + j2;
                }
            } else {
                str = "invalid period count";
            }
            super("Illegal clipping: ".concat(str));
            this.reason = i;
        }

        public IllegalClippingException(int i) {
            this(-9223372036854775807L, i, -9223372036854775807L);
        }
    }
}
