package androidx.media3.exoplayer.video;

import androidx.media3.common.a;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.a;
import androidx.media3.exoplayer.video.e;
import defpackage.c59;
import defpackage.dmf;
import defpackage.k20;
import defpackage.p4;
import defpackage.qr3;
import defpackage.r6;
import defpackage.st9;
import defpackage.tog;
import defpackage.vjg;
import defpackage.w71;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final a.C0053a a;
    public final e b;
    public final e.a c = new e.a();
    public final dmf<tog> d = new dmf<>();
    public final dmf<Long> e = new dmf<>();
    public final c59 f;
    public long g;
    public long h;
    public long i;
    public tog j;
    public long k;

    public f(a.C0053a c0053a, e eVar) {
        this.a = c0053a;
        this.b = eVar;
        c59 c59Var = new c59();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c59Var.a = 0;
        c59Var.b = -1;
        c59Var.c = 0;
        c59Var.d = new long[iHighestOneBit];
        c59Var.e = iHighestOneBit - 1;
        this.f = c59Var;
        this.g = -9223372036854775807L;
        this.j = tog.d;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        a.C0053a c0053a = this.a;
        a aVar = a.this;
        while (true) {
            c59 c59Var = this.f;
            int i = c59Var.c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                k20.p();
                return;
            }
            long j3 = c59Var.d[c59Var.a];
            Long lF = this.e.f(j3);
            e eVar = this.b;
            if (lF != null && lF.longValue() != this.k) {
                this.k = lF.longValue();
                eVar.f(2);
            }
            long j4 = this.k;
            e eVar2 = this.b;
            e.a aVar2 = this.c;
            int iA = eVar2.a(j3, j, j2, j4, false, false, aVar2);
            if (iA == 0 || iA == 1) {
                this.h = j3;
                int i2 = 0;
                boolean z = iA == 0;
                long jA = c59Var.a();
                tog togVarF = this.d.f(jA);
                if (togVarF != null && !togVarF.equals(tog.d) && !togVarF.equals(this.j)) {
                    this.j = togVarF;
                    a.C0036a c0036a = new a.C0036a();
                    c0036a.t = togVarF.a;
                    c0036a.u = togVarF.b;
                    c0036a.m = st9.p("video/raw");
                    c0053a.a = new androidx.media3.common.a(c0036a);
                    aVar.h.execute(new w71(1, c0053a, togVarF));
                }
                long jNanoTime = z ? System.nanoTime() : aVar2.b;
                i = eVar.e == 3 ? 0 : 1;
                eVar.e = 3;
                eVar.g = vjg.O(eVar.l.d());
                if (i != 0 && aVar.d != null) {
                    aVar.h.execute(new qr3(c0053a, i2));
                }
                androidx.media3.common.a aVar3 = c0053a.a;
                aVar.i.e(jA, jNanoTime, aVar3 == null ? new androidx.media3.common.a(new a.C0036a()) : aVar3, null);
                ((VideoSink.b) aVar.c.remove()).a(jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.h = j3;
                c59Var.a();
                aVar.h.execute(new p4(c0053a, i));
                ((VideoSink.b) aVar.c.remove()).b();
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    r6.g(String.valueOf(iA));
                    return;
                }
                this.h = j3;
            }
        }
    }
}
