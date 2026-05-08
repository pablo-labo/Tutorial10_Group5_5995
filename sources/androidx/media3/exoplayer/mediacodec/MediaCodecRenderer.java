package androidx.media3.exoplayer.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.c;
import defpackage.ak3;
import defpackage.akb;
import defpackage.d82;
import defpackage.dk3;
import defpackage.dmf;
import defpackage.ia;
import defpackage.ka2;
import defpackage.ke1;
import defpackage.ql0;
import defpackage.rjd;
import defpackage.sdb;
import defpackage.ws5;
import defpackage.zkd;
import defpackage.zoa;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends androidx.media3.exoplayer.b {
    public static final byte[] t1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public float A0;
    public androidx.media3.exoplayer.mediacodec.c B0;
    public androidx.media3.common.a C0;
    public MediaFormat D0;
    public boolean E0;
    public float F0;
    public ArrayDeque<d> G0;
    public DecoderInitializationException H0;
    public d I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public long O0;
    public int P0;
    public int Q0;
    public ByteBuffer R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public int Y0;
    public int Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public long e1;
    public long f1;
    public boolean g1;
    public final c.b h0;
    public boolean h1;
    public final ia i0;
    public boolean i1;
    public final boolean j0;
    public boolean j1;
    public final float k0;
    public ExoPlaybackException k1;
    public final DecoderInputBuffer l0;
    public ak3 l1;
    public final DecoderInputBuffer m0;
    public c m1;
    public final DecoderInputBuffer n0;
    public long n1;
    public final ke1 o0;
    public boolean o1;
    public final MediaCodec.BufferInfo p0;
    public boolean p1;
    public final ArrayDeque<c> q0;
    public boolean q1;
    public final zoa r0;
    public long r1;
    public androidx.media3.common.a s0;
    public long s1;
    public androidx.media3.common.a t0;
    public DrmSession u0;
    public DrmSession v0;
    public k.a w0;
    public MediaCrypto x0;
    public final long y0;
    public float z0;

    public static final class a {
        public static void a(c.a aVar, sdb sdbVar) {
            LogSessionId logSessionIdA = sdbVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public final class b {
        public b() {
        }
    }

    public static final class c {
        public static final c e = new c(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;
        public final long c;
        public final dmf<androidx.media3.common.a> d = new dmf<>();

        public c(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public MediaCodecRenderer(int i, c.b bVar, boolean z, float f) {
        super(i);
        this.h0 = bVar;
        this.i0 = f.T;
        this.j0 = z;
        this.k0 = f;
        this.l0 = new DecoderInputBuffer(0);
        this.m0 = new DecoderInputBuffer(0);
        this.n0 = new DecoderInputBuffer(2);
        ke1 ke1Var = new ke1(2);
        ke1Var.Z = 32;
        this.o0 = ke1Var;
        this.p0 = new MediaCodec.BufferInfo();
        this.z0 = 1.0f;
        this.A0 = 1.0f;
        this.y0 = -9223372036854775807L;
        this.q0 = new ArrayDeque<>();
        this.m1 = c.e;
        ke1Var.p(0);
        ke1Var.d.order(ByteOrder.nativeOrder());
        zoa zoaVar = new zoa();
        zoaVar.a = AudioProcessor.a;
        zoaVar.c = 0;
        zoaVar.b = 2;
        this.r0 = zoaVar;
        this.F0 = -1.0f;
        this.Y0 = 0;
        this.P0 = -1;
        this.Q0 = -1;
        this.O0 = -9223372036854775807L;
        this.e1 = -9223372036854775807L;
        this.f1 = -9223372036854775807L;
        this.n1 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.Z0 = 0;
        this.a1 = 0;
        this.l1 = new ak3();
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
    }

    public boolean A0() {
        return true;
    }

    public boolean B0(d dVar) {
        return true;
    }

    public boolean C0() {
        int i = this.a1;
        if (i == 3 || (this.J0 && !this.d1)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            G0();
            return false;
        } catch (ExoPlaybackException e) {
            zkd.U("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean D0(androidx.media3.common.a aVar) {
        return false;
    }

    @Override // androidx.media3.exoplayer.b
    public void E() {
        this.s0 = null;
        y0(c.e);
        this.q0.clear();
        if (!this.U0) {
            T();
        } else {
            this.U0 = false;
            u0();
        }
    }

    public abstract int E0(ia iaVar, androidx.media3.common.a aVar);

    public final boolean F0(androidx.media3.common.a aVar) {
        if (this.B0 != null && this.a1 != 3 && this.W != 0) {
            float f = this.A0;
            aVar.getClass();
            androidx.media3.common.a[] aVarArr = this.Y;
            aVarArr.getClass();
            float fW = W(f, aVar, aVarArr);
            float f2 = this.F0;
            if (f2 != fW) {
                if (fW == -1.0f) {
                    if (this.b1) {
                        this.Z0 = 1;
                        this.a1 = 3;
                        return false;
                    }
                    s0();
                    d0();
                    return false;
                }
                if (f2 != -1.0f || fW > this.k0) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fW);
                    androidx.media3.exoplayer.mediacodec.c cVar = this.B0;
                    cVar.getClass();
                    cVar.setParameters(bundle);
                    this.F0 = fW;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.b
    public void G(long j, boolean z) {
        this.g1 = false;
        this.h1 = false;
        this.j1 = false;
        if (this.U0) {
            u0();
        } else if (T()) {
            d0();
        }
        if (this.m1.d.h() > 0) {
            this.i1 = true;
        }
        this.m1.d.b();
        this.q0.clear();
    }

    public final void G0() throws ExoPlaybackException {
        DrmSession drmSession = this.v0;
        drmSession.getClass();
        ws5 ws5VarD = drmSession.d();
        if (ws5VarD != null) {
            try {
                MediaCrypto mediaCrypto = this.x0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(ws5VarD.b);
            } catch (MediaCryptoException e) {
                throw D(e, this.s0, false, 6006);
            }
        }
        x0(this.v0);
        this.Z0 = 0;
        this.a1 = 0;
    }

    public final void H0(long j) {
        androidx.media3.common.a aVarF = this.m1.d.f(j);
        if (aVarF == null && this.o1 && this.D0 != null) {
            aVarF = this.m1.d.e();
        }
        if (aVarF != null) {
            this.t0 = aVarF;
        } else if (!this.E0 || this.t0 == null) {
            return;
        }
        androidx.media3.common.a aVar = this.t0;
        aVar.getClass();
        k0(aVar, this.D0);
        this.E0 = false;
        this.o1 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(androidx.media3.common.a[] r12, long r13, long r15, androidx.media3.exoplayer.source.h.b r17) {
        /*
            r11 = this;
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$c r12 = r11.m1
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$c r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$c
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.y0(r4)
            boolean r12 = r11.p1
            if (r12 == 0) goto L56
            r11.n0()
            return
        L24:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$c> r12 = r11.q0
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.e1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.n1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$c r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$c
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.y0(r4)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$c r12 = r11.m1
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.n0()
        L56:
            return
        L57:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$c r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$c
            long r1 = r11.e1
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.L(androidx.media3.common.a[], long, long, androidx.media3.exoplayer.source.h$b):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fd  */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.media3.exoplayer.b, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.N(long, long):boolean");
    }

    public abstract dk3 O(d dVar, androidx.media3.common.a aVar, androidx.media3.common.a aVar2);

    public MediaCodecDecoderException P(IllegalStateException illegalStateException, d dVar) {
        return new MediaCodecDecoderException(illegalStateException, dVar);
    }

    public final boolean Q(long j, long j2) throws ExoPlaybackException {
        androidx.media3.exoplayer.mediacodec.c cVar = this.B0;
        cVar.getClass();
        int i = this.Q0;
        MediaCodec.BufferInfo bufferInfo = this.p0;
        if (i < 0) {
            int iJ = cVar.j(bufferInfo);
            if (iJ < 0) {
                if (iJ == -2) {
                    this.d1 = true;
                    androidx.media3.exoplayer.mediacodec.c cVar2 = this.B0;
                    cVar2.getClass();
                    this.D0 = cVar2.getOutputFormat();
                    this.E0 = true;
                    return true;
                }
                if (this.M0 && (this.g1 || this.Z0 == 2)) {
                    p0();
                }
                long j3 = this.N0;
                if (j3 != -9223372036854775807L) {
                    long j4 = j3 + 100;
                    d82 d82Var = this.V;
                    d82Var.getClass();
                    if (j4 < d82Var.a()) {
                        p0();
                        return false;
                    }
                }
                return false;
            }
            if (this.L0) {
                this.L0 = false;
                cVar.g(iJ);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                p0();
                return false;
            }
            this.Q0 = iJ;
            ByteBuffer outputBuffer = cVar.getOutputBuffer(iJ);
            this.R0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.R0.limit(bufferInfo.offset + bufferInfo.size);
            }
            H0(bufferInfo.presentationTimeUs);
        }
        long j5 = bufferInfo.presentationTimeUs;
        this.S0 = j5 < this.a0;
        long j6 = this.f1;
        this.T0 = j6 != -9223372036854775807L && j6 <= j5;
        if (this.q1) {
            long j7 = this.r1;
            if (j7 == -9223372036854775807L || j5 > j7) {
                this.r1 = j5;
                this.S0 = true;
                this.T0 = false;
            } else {
                this.q1 = false;
                this.r1 = -9223372036854775807L;
            }
        }
        ByteBuffer byteBuffer = this.R0;
        int i2 = this.Q0;
        int i3 = bufferInfo.flags;
        boolean z = this.S0;
        boolean z2 = this.T0;
        androidx.media3.common.a aVar = this.t0;
        aVar.getClass();
        if (!q0(j, j2, cVar, byteBuffer, i2, i3, 1, j5, z, z2, aVar)) {
            return false;
        }
        m0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.c1 && this.T0) {
            d82 d82Var2 = this.V;
            d82Var2.getClass();
            this.N0 = d82Var2.a();
        }
        this.Q0 = -1;
        this.R0 = null;
        if (!z3) {
            return true;
        }
        p0();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean R() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.R():boolean");
    }

    public final void S() {
        try {
            androidx.media3.exoplayer.mediacodec.c cVar = this.B0;
            ka2.r(cVar);
            cVar.flush();
        } finally {
            v0();
        }
    }

    public final boolean T() {
        if (this.B0 != null) {
            if (C0()) {
                s0();
                return true;
            }
            if (A0()) {
                S();
                return false;
            }
            long j = this.s1;
            if (j != -9223372036854775807L && this.a0 <= j && this.n1 < j) {
                this.q1 = true;
                this.s1 = -9223372036854775807L;
            }
        }
        return false;
    }

    public final List<d> U(boolean z) {
        androidx.media3.common.a aVar = this.s0;
        aVar.getClass();
        ia iaVar = this.i0;
        ArrayList arrayListX = X(iaVar, aVar, z);
        if (!arrayListX.isEmpty() || !z) {
            return arrayListX;
        }
        ArrayList arrayListX2 = X(iaVar, aVar, false);
        if (!arrayListX2.isEmpty()) {
            zkd.T("MediaCodecRenderer", "Drm session requires secure decoder for " + aVar.n + ", but no secure decoder available. Trying to proceed with " + arrayListX2 + ".");
        }
        return arrayListX2;
    }

    public int V(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public abstract float W(float f, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr);

    public abstract ArrayList X(ia iaVar, androidx.media3.common.a aVar, boolean z);

    public long Y(long j, long j2) {
        return super.r(j, j2);
    }

    public abstract c.a Z(d dVar, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, float f);

    @Override // androidx.media3.exoplayer.l
    public final int a(androidx.media3.common.a aVar) throws ExoPlaybackException {
        try {
            return E0(this.i0, aVar);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw this.D(e, aVar, false, 4002);
        }
    }

    public abstract void a0(DecoderInputBuffer decoderInputBuffer);

    @Override // androidx.media3.exoplayer.k
    public boolean b() {
        boolean zB;
        if (this.s0 != null) {
            if (j()) {
                zB = this.c0;
            } else {
                rjd rjdVar = this.X;
                rjdVar.getClass();
                zB = rjdVar.b();
            }
            if (!zB) {
                if (!(this.Q0 >= 0)) {
                    if (this.O0 != -9223372036854775807L) {
                        d82 d82Var = this.V;
                        d82Var.getClass();
                        if (d82Var.d() < this.O0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void b0(d dVar, MediaCrypto mediaCrypto) {
        this.I0 = dVar;
        androidx.media3.common.a aVar = this.s0;
        aVar.getClass();
        String str = dVar.a;
        float f = this.A0;
        androidx.media3.common.a[] aVarArr = this.Y;
        aVarArr.getClass();
        float fW = W(f, aVar, aVarArr);
        if (fW <= this.k0) {
            fW = -1.0f;
        }
        d82 d82Var = this.V;
        d82Var.getClass();
        long jD = d82Var.d();
        c.a aVarZ = Z(dVar, aVar, mediaCrypto, fW);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            sdb sdbVar = this.f;
            sdbVar.getClass();
            a.a(aVarZ, sdbVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            androidx.media3.exoplayer.mediacodec.c cVarA = this.h0.a(aVarZ);
            this.B0 = cVarA;
            cVarA.k(new b());
            Trace.endSection();
            d82 d82Var2 = this.V;
            d82Var2.getClass();
            long jD2 = d82Var2.d();
            if (!dVar.e(aVar)) {
                String strC = androidx.media3.common.a.c(aVar);
                Locale locale = Locale.US;
                zkd.T("MediaCodecRenderer", akb.k("Format exceeds selected codec's capabilities [", strC, ", ", str, "]"));
            }
            this.F0 = fW;
            this.C0 = aVar;
            boolean z = false;
            this.J0 = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = dVar.a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && dVar.f)) {
                z = true;
            }
            this.M0 = z;
            this.B0.getClass();
            if (this.W == 2) {
                d82 d82Var3 = this.V;
                d82Var3.getClass();
                this.O0 = d82Var3.d() + 1000;
            }
            this.l1.a++;
            h0(jD2, str, jD2 - jD);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean c0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        androidx.media3.common.a aVar = this.t0;
        return aVar == null || !Objects.equals(aVar.n, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.d0():void");
    }

    public final void e0(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        androidx.media3.common.a aVar = this.s0;
        aVar.getClass();
        if (this.G0 == null) {
            try {
                List<d> listU = U(z);
                ArrayDeque<d> arrayDeque = new ArrayDeque<>();
                this.G0 = arrayDeque;
                if (this.j0) {
                    arrayDeque.addAll(listU);
                } else {
                    ArrayList arrayList = (ArrayList) listU;
                    if (!arrayList.isEmpty()) {
                        this.G0.add((d) arrayList.get(0));
                    }
                }
                this.H0 = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(aVar, e, z, -49998);
            }
        }
        if (this.G0.isEmpty()) {
            throw new DecoderInitializationException(aVar, null, z, -49999);
        }
        ArrayDeque<d> arrayDeque2 = this.G0;
        arrayDeque2.getClass();
        while (this.B0 == null) {
            d dVarPeekFirst = arrayDeque2.peekFirst();
            dVarPeekFirst.getClass();
            if (!f0(aVar) || !B0(dVarPeekFirst)) {
                return;
            }
            try {
                b0(dVarPeekFirst, mediaCrypto);
            } catch (Exception e2) {
                zkd.U("MediaCodecRenderer", "Failed to initialize decoder: " + dVarPeekFirst, e2);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException("Decoder init failed: " + dVarPeekFirst.a + ", " + aVar, e2, aVar.n, z, dVarPeekFirst, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null, null);
                g0(decoderInitializationException);
                DecoderInitializationException decoderInitializationException2 = this.H0;
                if (decoderInitializationException2 == null) {
                    this.H0 = decoderInitializationException;
                } else {
                    this.H0 = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.mimeType, decoderInitializationException2.secureDecoderRequired, decoderInitializationException2.codecInfo, decoderInitializationException2.diagnosticInfo, decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.H0;
                }
            }
        }
        this.G0 = null;
    }

    public boolean f0(androidx.media3.common.a aVar) {
        return true;
    }

    public abstract void g0(Exception exc);

    public abstract void h0(long j, String str, long j2);

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // androidx.media3.exoplayer.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(long r12, long r14) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.i(long, long):void");
    }

    public abstract void i0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
    
        if (r4.g(r2) != false) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.dk3 j0(defpackage.ql0 r13) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.j0(ql0):dk3");
    }

    public abstract void k0(androidx.media3.common.a aVar, MediaFormat mediaFormat);

    public void l0(long j) {
    }

    public void m0(long j) {
        this.n1 = j;
        while (true) {
            ArrayDeque<c> arrayDeque = this.q0;
            if (arrayDeque.isEmpty() || j < arrayDeque.peek().a) {
                return;
            }
            c cVarPoll = arrayDeque.poll();
            cVarPoll.getClass();
            y0(cVarPoll);
            n0();
        }
    }

    public abstract void n0();

    public void o0(DecoderInputBuffer decoderInputBuffer) {
    }

    @TargetApi(23)
    public final void p0() throws ExoPlaybackException {
        int i = this.a1;
        if (i == 1) {
            S();
            return;
        }
        if (i == 2) {
            S();
            G0();
        } else if (i != 3) {
            this.h1 = true;
            t0();
        } else {
            s0();
            d0();
        }
    }

    public abstract boolean q0(long j, long j2, androidx.media3.exoplayer.mediacodec.c cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar);

    @Override // androidx.media3.exoplayer.k
    public final long r(long j, long j2) {
        return Y(j, j2);
    }

    public final boolean r0(int i) throws ExoPlaybackException {
        ql0 ql0Var = this.c;
        ql0Var.d();
        DecoderInputBuffer decoderInputBuffer = this.l0;
        decoderInputBuffer.n();
        int iM = M(ql0Var, decoderInputBuffer, i | 4);
        if (iM == -5) {
            j0(ql0Var);
            return true;
        }
        if (iM != -4 || !decoderInputBuffer.h(4)) {
            return false;
        }
        this.g1 = true;
        p0();
        return false;
    }

    public final void s0() {
        try {
            androidx.media3.exoplayer.mediacodec.c cVar = this.B0;
            if (cVar != null) {
                cVar.release();
                this.l1.b++;
                d dVar = this.I0;
                dVar.getClass();
                i0(dVar.a);
            }
            this.B0 = null;
            try {
                MediaCrypto mediaCrypto = this.x0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.B0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.x0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void t0();

    public final void u0() {
        this.e1 = -9223372036854775807L;
        this.f1 = -9223372036854775807L;
        this.n1 = -9223372036854775807L;
        this.W0 = false;
        this.o0.n();
        this.n0.n();
        this.V0 = false;
        zoa zoaVar = this.r0;
        zoaVar.getClass();
        zoaVar.a = AudioProcessor.a;
        zoaVar.c = 0;
        zoaVar.b = 2;
    }

    public void v0() {
        this.P0 = -1;
        this.m0.d = null;
        this.Q0 = -1;
        this.R0 = null;
        this.e1 = -9223372036854775807L;
        this.f1 = -9223372036854775807L;
        this.n1 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.c1 = false;
        this.N0 = -9223372036854775807L;
        this.b1 = false;
        this.K0 = false;
        this.L0 = false;
        this.S0 = false;
        this.T0 = false;
        this.Z0 = 0;
        this.a1 = 0;
        this.Y0 = this.X0 ? 1 : 0;
        this.q1 = false;
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
    }

    public final void w0() {
        v0();
        this.k1 = null;
        this.G0 = null;
        this.I0 = null;
        this.C0 = null;
        this.D0 = null;
        this.E0 = false;
        this.d1 = false;
        this.F0 = -1.0f;
        this.J0 = false;
        this.M0 = false;
        this.X0 = false;
        this.Y0 = 0;
    }

    @Override // androidx.media3.exoplayer.k
    public void x(float f, float f2) {
        this.z0 = f;
        this.A0 = f2;
        F0(this.C0);
    }

    public final void x0(DrmSession drmSession) {
        DrmSession drmSession2 = this.u0;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.e(null);
            }
            if (drmSession2 != null) {
                drmSession2.f(null);
            }
        }
        this.u0 = drmSession;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.l
    public final int y() {
        return 8;
    }

    public final void y0(c cVar) {
        this.m1 = cVar;
        long j = cVar.c;
        if (j != -9223372036854775807L) {
            this.o1 = true;
            l0(j);
        }
    }

    public boolean z0(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    public static class DecoderInitializationException extends Exception {
        public final d codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(androidx.media3.common.a aVar, MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + aVar, decoderQueryException, aVar.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i), null);
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z, d dVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = dVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
