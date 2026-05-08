package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.l;
import defpackage.og1;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class u27 extends androidx.media3.exoplayer.b {
    public boolean A0;
    public final og1.a h0;
    public final DecoderInputBuffer i0;
    public final ArrayDeque<a> j0;
    public boolean k0;
    public boolean l0;
    public a m0;
    public long n0;
    public long o0;
    public int p0;
    public int q0;
    public androidx.media3.common.a r0;
    public og1 s0;
    public DecoderInputBuffer t0;
    public ImageOutput u0;
    public Bitmap v0;
    public boolean w0;
    public b x0;
    public b y0;
    public int z0;

    public static final class a {
        public static final a c = new a(-9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public static class b {
        public final int a;
        public final long b;
        public Bitmap c;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public u27(og1.a aVar) {
        super(4);
        this.h0 = aVar;
        this.u0 = ImageOutput.a;
        this.i0 = new DecoderInputBuffer(0);
        this.m0 = a.c;
        this.j0 = new ArrayDeque<>();
        this.o0 = -9223372036854775807L;
        this.n0 = -9223372036854775807L;
        this.p0 = 0;
        this.q0 = 1;
    }

    @Override // androidx.media3.exoplayer.b
    public final void E() {
        this.r0 = null;
        this.m0 = a.c;
        this.j0.clear();
        Q();
        this.u0.a();
    }

    @Override // androidx.media3.exoplayer.b
    public final void F(boolean z, boolean z2) {
        this.q0 = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        this.q0 = Math.min(this.q0, 1);
        this.l0 = false;
        this.k0 = false;
        this.v0 = null;
        this.x0 = null;
        this.y0 = null;
        this.w0 = false;
        this.t0 = null;
        og1 og1Var = this.s0;
        if (og1Var != null) {
            og1Var.flush();
        }
        this.j0.clear();
    }

    @Override // androidx.media3.exoplayer.b
    public final void H() {
        Q();
    }

    @Override // androidx.media3.exoplayer.b
    public final void I() {
        Q();
        this.q0 = Math.min(this.q0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(androidx.media3.common.a[] r5, long r6, long r8, androidx.media3.exoplayer.source.h.b r10) {
        /*
            r4 = this;
            u27$a r5 = r4.m0
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque<u27$a> r5 = r4.j0
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.o0
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.n0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            u27$a r6 = new u27$a
            long r0 = r4.o0
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            u27$a r5 = new u27$a
            r5.<init>(r0, r8)
            r4.m0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u27.L(androidx.media3.common.a[], long, long, androidx.media3.exoplayer.source.h$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(long r13) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u27.N(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O(long r13) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u27.O(long):boolean");
    }

    public final void P() throws ExoPlaybackException {
        if (this.A0) {
            androidx.media3.common.a aVar = this.r0;
            aVar.getClass();
            og1.a aVar2 = this.h0;
            int iA = aVar2.a(aVar);
            if (iA != l.f(4, 0, 0, 0) && iA != l.f(3, 0, 0, 0)) {
                throw D(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.r0, false, 4005);
            }
            og1 og1Var = this.s0;
            if (og1Var != null) {
                og1Var.release();
            }
            this.s0 = new og1(aVar2.a);
            this.A0 = false;
        }
    }

    public final void Q() {
        this.t0 = null;
        this.p0 = 0;
        this.o0 = -9223372036854775807L;
        og1 og1Var = this.s0;
        if (og1Var != null) {
            og1Var.release();
            this.s0 = null;
        }
    }

    @Override // androidx.media3.exoplayer.l
    public final int a(androidx.media3.common.a aVar) {
        return this.h0.a(aVar);
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        int i = this.q0;
        if (i != 3) {
            return i == 0 && this.w0;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean c() {
        return this.l0;
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void i(long j, long j2) throws ExoPlaybackException {
        if (this.l0) {
            return;
        }
        if (this.r0 == null) {
            ql0 ql0Var = this.c;
            ql0Var.d();
            DecoderInputBuffer decoderInputBuffer = this.i0;
            decoderInputBuffer.n();
            int iM = M(ql0Var, decoderInputBuffer, 2);
            if (iM != -5) {
                if (iM == -4) {
                    ka2.q(decoderInputBuffer.h(4));
                    this.k0 = true;
                    this.l0 = true;
                    return;
                }
                return;
            }
            androidx.media3.common.a aVar = (androidx.media3.common.a) ql0Var.c;
            ka2.r(aVar);
            this.r0 = aVar;
            this.A0 = true;
        }
        if (this.s0 == null) {
            P();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (N(j)) {
            }
            while (O(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw D(e, null, false, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.j.b
    public final void m(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.u0 = imageOutput;
    }
}
