package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.h;
import defpackage.emf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class adb {
    public static final h.b u = new h.b(new Object());
    public final emf a;
    public final h.b b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final xpf h;
    public final gqf i;
    public final List<js9> j;
    public final h.b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final cdb o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public adb(emf emfVar, h.b bVar, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, xpf xpfVar, gqf gqfVar, List<js9> list, h.b bVar2, boolean z2, int i2, int i3, cdb cdbVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = emfVar;
        this.b = bVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = xpfVar;
        this.i = gqfVar;
        this.j = list;
        this.k = bVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = cdbVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static adb k(gqf gqfVar) {
        emf.a aVar = emf.a;
        xpf xpfVar = xpf.d;
        qyc qycVar = qyc.e;
        cdb cdbVar = cdb.d;
        h.b bVar = u;
        return new adb(aVar, bVar, -9223372036854775807L, 0L, 1, null, false, xpfVar, gqfVar, qycVar, bVar, false, 1, 0, cdbVar, 0L, 0L, 0L, 0L, false);
    }

    public final adb a() {
        return new adb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final adb b(boolean z) {
        return new adb(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final adb c(h.b bVar) {
        return new adb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, bVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final adb d(h.b bVar, long j, long j2, long j3, long j4, xpf xpfVar, gqf gqfVar, List<js9> list) {
        return new adb(this.a, bVar, j2, j3, this.e, this.f, this.g, xpfVar, gqfVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final adb e(int i, int i2, boolean z) {
        return new adb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final adb f(ExoPlaybackException exoPlaybackException) {
        return new adb(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final adb g(cdb cdbVar) {
        return new adb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, cdbVar, this.q, this.r, this.s, this.t, this.p);
    }

    public final adb h(int i) {
        return new adb(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final adb i(boolean z) {
        return new adb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final adb j(emf emfVar) {
        return new adb(emfVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return vjg.O(vjg.c0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
