package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.c;
import defpackage.bg;
import defpackage.c59;
import defpackage.d82;
import defpackage.dmf;
import defpackage.gie;
import defpackage.h54;
import defpackage.ka2;
import defpackage.my1;
import defpackage.or3;
import defpackage.pr3;
import defpackage.rng;
import defpackage.tog;
import defpackage.wng;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a implements VideoSink {
    public final e a;
    public final f b;
    public final ArrayDeque c;
    public Surface d;
    public androidx.media3.common.a e;
    public long f;
    public VideoSink.a g;
    public Executor h;
    public rng i;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.video.a$a, reason: collision with other inner class name */
    public final class C0053a {
        public androidx.media3.common.a a;

        public C0053a() {
        }
    }

    public a(e eVar, d82 d82Var) {
        this.a = eVar;
        eVar.l = d82Var;
        this.b = new f(new C0053a(), eVar);
        this.c = new ArrayDeque();
        this.e = new androidx.media3.common.a(new a.C0036a());
        this.f = -9223372036854775807L;
        this.g = VideoSink.a.a;
        this.h = new or3();
        this.i = new pr3();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean c() {
        f fVar = this.b;
        long j = fVar.i;
        return j != -9223372036854775807L && fVar.h == j;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean d() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final Surface e() {
        Surface surface = this.d;
        ka2.r(surface);
        return surface;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void g(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void h(float f) {
        this.a.i(f);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void i(long j, long j2) throws VideoSink.VideoSinkException {
        try {
            this.b.a(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink.VideoSinkException(e, this.e);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void j() {
        f fVar = this.b;
        if (fVar.g == -9223372036854775807L) {
            fVar.g = Long.MIN_VALUE;
            fVar.h = Long.MIN_VALUE;
        }
        fVar.i = fVar.g;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void k(androidx.media3.common.a aVar, long j, int i, List list) {
        ka2.q(list.isEmpty());
        int i2 = aVar.u;
        int i3 = aVar.v;
        androidx.media3.common.a aVar2 = this.e;
        int i4 = aVar2.u;
        f fVar = this.b;
        if (i2 != i4 || i3 != aVar2.v) {
            dmf<tog> dmfVar = fVar.d;
            long j2 = fVar.g;
            dmfVar.a(new tog(i2, i3), j2 == -9223372036854775807L ? 0L : j2 + 1);
        }
        float f = aVar.y;
        if (f != this.e.y) {
            this.a.g(f);
        }
        this.e = aVar;
        if (j != this.f) {
            if (fVar.f.c == 0) {
                fVar.b.f(i);
                fVar.k = j;
            } else {
                dmf<Long> dmfVar2 = fVar.e;
                long j3 = fVar.g;
                dmfVar2.a(Long.valueOf(j), j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1);
            }
            this.f = j;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void l(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean m(boolean z) {
        return this.a.b(z);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void n(Surface surface, gie gieVar) {
        this.d = surface;
        this.a.h(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean o(androidx.media3.common.a aVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void p() {
        e eVar = this.a;
        if (eVar.e == 0) {
            eVar.e = 1;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final boolean q(long j, c.a aVar) {
        this.c.add(aVar);
        f fVar = this.b;
        c59 c59Var = fVar.f;
        int i = c59Var.c;
        long[] jArr = c59Var.d;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                bg.h();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = c59Var.a;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy(c59Var.d, 0, jArr2, i3, i2);
            c59Var.a = 0;
            c59Var.b = c59Var.c - 1;
            c59Var.d = jArr2;
            c59Var.e = length - 1;
        }
        int i4 = (c59Var.b + 1) & c59Var.e;
        c59Var.b = i4;
        c59Var.d[i4] = j;
        c59Var.c++;
        fVar.g = j;
        fVar.i = -9223372036854775807L;
        this.h.execute(new my1(this, 3));
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void r() {
        this.a.e();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void s(b bVar) {
        this.g = bVar;
        this.h = h54.a;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void t() {
        this.a.d();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void u(int i) {
        wng wngVar = this.a.b;
        if (wngVar.j == i) {
            return;
        }
        wngVar.j = i;
        wngVar.d(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void v() {
        this.d = null;
        this.a.h(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void w(boolean z) {
        if (z) {
            e eVar = this.a;
            wng wngVar = eVar.b;
            wngVar.m = 0L;
            wngVar.p = -1L;
            wngVar.n = -1L;
            eVar.h = -9223372036854775807L;
            eVar.f = -9223372036854775807L;
            eVar.e = Math.min(eVar.e, 1);
            eVar.i = -9223372036854775807L;
        }
        f fVar = this.b;
        dmf<tog> dmfVar = fVar.d;
        c59 c59Var = fVar.f;
        c59Var.a = 0;
        c59Var.b = -1;
        c59Var.c = 0;
        fVar.g = -9223372036854775807L;
        fVar.h = -9223372036854775807L;
        fVar.i = -9223372036854775807L;
        dmf<Long> dmfVar2 = fVar.e;
        if (dmfVar2.h() > 0) {
            ka2.l(dmfVar2.h() > 0);
            while (dmfVar2.h() > 1) {
                dmfVar2.e();
            }
            Long lE = dmfVar2.e();
            lE.getClass();
            fVar.k = lE.longValue();
        }
        if (dmfVar.h() > 0) {
            ka2.l(dmfVar.h() > 0);
            while (dmfVar.h() > 1) {
                dmfVar.e();
            }
            tog togVarE = dmfVar.e();
            togVarE.getClass();
            dmfVar.a(togVarE, 0L);
        }
        this.c.clear();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void x(boolean z) {
        this.a.c(z);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void y(rng rngVar) {
        this.i = rngVar;
    }
}
