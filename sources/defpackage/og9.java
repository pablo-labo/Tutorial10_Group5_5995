package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.c;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ll3;
import defpackage.tx0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class og9 extends MediaCodecRenderer implements ng9 {
    public androidx.media3.common.a A1;
    public long B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public int F1;
    public boolean G1;
    public long H1;
    public final ry0 u1;
    public final ll3 v1;
    public final u79 w1;
    public int x1;
    public boolean y1;
    public androidx.media3.common.a z1;

    public final class a implements ty0 {
        public a() {
        }

        public final void a(Exception exc) {
            zkd.x("MediaCodecAudioRenderer", "Audio sink error", exc);
            ry0 ry0Var = og9.this.u1;
            Handler handler = ry0Var.a;
            if (handler != null) {
                handler.post(new ny0(0, ry0Var, exc));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og9(Context context, c.b bVar, boolean z, Handler handler, d.a aVar, ll3 ll3Var) {
        super(1, bVar, z, 44100.0f);
        u79 u79Var = Build.VERSION.SDK_INT >= 35 ? new u79() : null;
        context.getApplicationContext();
        this.v1 = ll3Var;
        this.w1 = u79Var;
        this.F1 = -1000;
        this.u1 = new ry0(handler, aVar);
        this.H1 = -9223372036854775807L;
        ll3Var.s = new a();
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final ng9 C() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean D0(androidx.media3.common.a aVar) {
        w1d w1dVar = this.d;
        w1dVar.getClass();
        if (w1dVar.a != 0) {
            int iI0 = I0(aVar);
            if ((iI0 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                w1d w1dVar2 = this.d;
                w1dVar2.getClass();
                if (w1dVar2.a == 2 || (iI0 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                    return true;
                }
                if (aVar.I == 0 && aVar.J == 0) {
                    return true;
                }
            }
        }
        return this.v1.z(aVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.b
    public final void E() {
        ry0 ry0Var = this.u1;
        this.D1 = true;
        this.z1 = null;
        this.H1 = -9223372036854775807L;
        try {
            this.v1.g();
            try {
                super.E();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.E();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E0(defpackage.ia r19, androidx.media3.common.a r20) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og9.E0(ia, androidx.media3.common.a):int");
    }

    @Override // androidx.media3.exoplayer.b
    public final void F(boolean z, boolean z2) {
        ak3 ak3Var = new ak3();
        this.l1 = ak3Var;
        ry0 ry0Var = this.u1;
        Handler handler = ry0Var.a;
        int i = 0;
        if (handler != null) {
            handler.post(new ky0(i, ry0Var, ak3Var));
        }
        w1d w1dVar = this.d;
        w1dVar.getClass();
        boolean z3 = w1dVar.b;
        ll3 ll3Var = this.v1;
        if (z3) {
            ka2.q(ll3Var.V);
            if (!ll3Var.a0) {
                ll3Var.a0 = true;
                ll3Var.g();
            }
        } else if (ll3Var.a0) {
            ll3Var.a0 = false;
            ll3Var.g();
        }
        sdb sdbVar = this.f;
        sdbVar.getClass();
        ll3Var.r = sdbVar;
        d82 d82Var = this.V;
        d82Var.getClass();
        ll3Var.h.F = d82Var;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        super.G(j, z);
        this.v1.g();
        this.B1 = j;
        this.H1 = -9223372036854775807L;
        this.E1 = false;
        this.C1 = true;
    }

    @Override // androidx.media3.exoplayer.b
    public final void H() {
        u79 u79Var;
        tx0 tx0Var = this.v1.y;
        if (tx0Var != null) {
            Context context = tx0Var.a;
            if (tx0Var.j) {
                tx0Var.g = null;
                tx0.a aVar = tx0Var.d;
                if (aVar != null) {
                    ey0.a(context).unregisterAudioDeviceCallback(aVar);
                }
                context.unregisterReceiver(tx0Var.e);
                tx0.b bVar = tx0Var.f;
                if (bVar != null) {
                    bVar.a.unregisterContentObserver(bVar);
                }
                tx0Var.j = false;
            }
        }
        if (Build.VERSION.SDK_INT < 35 || (u79Var = this.w1) == null) {
            return;
        }
        u79Var.b();
    }

    @Override // androidx.media3.exoplayer.b
    public final void I() {
        ll3 ll3Var = this.v1;
        this.E1 = false;
        this.H1 = -9223372036854775807L;
        try {
            try {
                this.U0 = false;
                u0();
                s0();
                DrmSession drmSession = this.v0;
                if (drmSession != null) {
                    drmSession.f(null);
                }
                this.v0 = null;
            } catch (Throwable th) {
                DrmSession drmSession2 = this.v0;
                if (drmSession2 != null) {
                    drmSession2.f(null);
                }
                this.v0 = null;
                throw th;
            }
        } finally {
            if (this.D1) {
                this.D1 = false;
                ll3Var.u();
            }
        }
    }

    public final int I0(androidx.media3.common.a aVar) {
        fy0 fy0VarH = this.v1.h(aVar);
        if (!fy0VarH.a) {
            return 0;
        }
        int i = fy0VarH.b ? 1536 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        return fy0VarH.c ? i | 2048 : i;
    }

    @Override // androidx.media3.exoplayer.b
    public final void J() {
        this.v1.r();
        this.G1 = true;
    }

    public final void J0() {
        long j;
        long jMax;
        long j2;
        c();
        ll3 ll3Var = this.v1;
        ll3.f fVar = ll3Var.b;
        if (!ll3Var.o() || ll3Var.L) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(ll3Var.h.a(), vjg.V(ll3Var.u.e, ll3Var.k()));
            ArrayDeque<ll3.g> arrayDeque = ll3Var.i;
            while (!arrayDeque.isEmpty() && jMin >= arrayDeque.getFirst().c) {
                ll3Var.C = arrayDeque.remove();
            }
            ll3.g gVar = ll3Var.C;
            long jX = jMin - gVar.c;
            long jZ = vjg.z(jX, gVar.a.a);
            if (arrayDeque.isEmpty()) {
                androidx.media3.common.audio.c cVar = fVar.c;
                if (!cVar.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (cVar.o >= 1024) {
                    long j3 = cVar.n;
                    nne nneVar = cVar.j;
                    nneVar.getClass();
                    long j4 = j3 - ((long) ((nneVar.k * nneVar.b) * 2));
                    int i = cVar.h.a;
                    int i2 = cVar.g.a;
                    j = Long.MIN_VALUE;
                    long j5 = cVar.o;
                    jX = i == i2 ? vjg.X(jX, j4, j5, RoundingMode.DOWN) : vjg.X(jX, j4 * ((long) i), j5 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jX = (long) (((double) cVar.c) * jX);
                }
                ll3.g gVar2 = ll3Var.C;
                j2 = gVar2.b + jX;
                gVar2.d = jX - jZ;
            } else {
                j = Long.MIN_VALUE;
                ll3.g gVar3 = ll3Var.C;
                j2 = gVar3.b + jZ + gVar3.d;
            }
            long j6 = fVar.b.q;
            jMax = vjg.V(ll3Var.u.e, j6) + j2;
            long j7 = ll3Var.g0;
            if (j6 > j7) {
                long jV = vjg.V(ll3Var.u.e, j6 - j7);
                ll3Var.g0 = j6;
                ll3Var.h0 += jV;
                if (ll3Var.i0 == null) {
                    ll3Var.i0 = new Handler(Looper.myLooper());
                }
                ll3Var.i0.removeCallbacksAndMessages(null);
                ll3Var.i0.postDelayed(new qb0(ll3Var, 1), 100L);
            }
        }
        if (jMax != j) {
            if (!this.C1) {
                jMax = Math.max(this.B1, jMax);
            }
            this.B1 = jMax;
            this.C1 = false;
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void K() {
        J0();
        this.G1 = false;
        ll3 ll3Var = this.v1;
        ll3Var.U = false;
        if (ll3Var.o()) {
            vy0 vy0Var = ll3Var.h;
            vy0Var.f();
            if (vy0Var.w == -9223372036854775807L) {
                uy0 uy0Var = vy0Var.e;
                uy0Var.getClass();
                uy0Var.a(0);
            }
            vy0Var.y = vy0Var.b();
            if (!ll3Var.S || ll3.p(ll3Var.w)) {
                ll3Var.w.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final dk3 O(androidx.media3.exoplayer.mediacodec.d dVar, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        dk3 dk3VarB = dVar.b(aVar, aVar2);
        int i = dk3VarB.e;
        if (this.v0 == null && D0(aVar2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(dVar.a);
        if (aVar2.o > this.x1) {
            i |= 64;
        }
        int i2 = i;
        return new dk3(dVar.a, aVar, aVar2, i2 != 0 ? 0 : dk3VarB.d, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float W(float f, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        int iMax = -1;
        for (androidx.media3.common.a aVar2 : aVarArr) {
            int i = aVar2.G;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList X(defpackage.ia r3, androidx.media3.common.a r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = r4.n
            if (r0 != 0) goto L7
            qyc r2 = defpackage.qyc.e
            goto L2f
        L7:
            ll3 r2 = r2.v1
            boolean r2 = r2.z(r4)
            r0 = 0
            if (r2 == 0) goto L2b
            java.lang.String r2 = "audio/raw"
            java.util.List r2 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.d(r2, r0, r0)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L1e
            r2 = 0
            goto L24
        L1e:
            java.lang.Object r2 = r2.get(r0)
            androidx.media3.exoplayer.mediacodec.d r2 = (androidx.media3.exoplayer.mediacodec.d) r2
        L24:
            if (r2 == 0) goto L2b
            qyc r2 = defpackage.e47.n(r2)
            goto L2f
        L2b:
            qyc r2 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f(r3, r4, r5, r0)
        L2f:
            java.util.HashMap<androidx.media3.exoplayer.mediacodec.MediaCodecUtil$a, java.util.List<androidx.media3.exoplayer.mediacodec.d>> r3 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            t91 r2 = new t91
            r5 = 5
            r2.<init>(r4, r5)
            qg9 r4 = new qg9
            r4.<init>(r2)
            java.util.Collections.sort(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og9.X(ia, androidx.media3.common.a, boolean):java.util.ArrayList");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final long Y(long j, long j2) {
        long jX;
        boolean z = this.H1 != -9223372036854775807L;
        if (this.G1) {
            ll3 ll3Var = this.v1;
            if (ll3Var.o()) {
                AudioTrack audioTrack = ll3Var.w;
                ll3.e eVar = ll3Var.u;
                if (eVar.c == 0) {
                    jX = vjg.V(eVar.e, audioTrack.getBufferSizeInFrames());
                } else {
                    long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                    int iT = ewa.t(eVar.g);
                    ka2.q(iT != -2147483647);
                    jX = vjg.X(bufferSizeInFrames, 1000000L, iT, RoundingMode.DOWN);
                }
            } else {
                jX = -9223372036854775807L;
            }
            if (z && jX != -9223372036854775807L) {
                float fMin = Math.min(jX, this.H1 - j);
                cdb cdbVar = ll3Var.D;
                float f = cdbVar != null ? cdbVar.a : 1.0f;
                d82 d82Var = this.V;
                d82Var.getClass();
                return Math.max(10000L, ((long) ((fMin / f) / 2.0f)) - (vjg.O(d82Var.d()) - j2));
            }
        } else if (z || this.h1) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final c.a Z(androidx.media3.exoplayer.mediacodec.d dVar, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, float f) {
        androidx.media3.common.a[] aVarArr = this.Y;
        aVarArr.getClass();
        String str = dVar.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = aVar.o;
        String str2 = aVar.n;
        int i = aVar.F;
        if (aVarArr.length != 1) {
            for (androidx.media3.common.a aVar2 : aVarArr) {
                if (dVar.b(aVar, aVar2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, aVar2.o);
                }
            }
        }
        this.x1 = iMax;
        this.y1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = dVar.c;
        int i2 = this.x1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i3 = aVar.G;
        mediaFormat.setInteger("sample-rate", i3);
        dj9.b(mediaFormat, aVar.q);
        dj9.a(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair<Integer, Integer> pairB = d92.b(aVar);
            if (pairB != null) {
                dj9.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                dj9.a(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        a.C0036a c0036a = new a.C0036a();
        c0036a.m = st9.p("audio/raw");
        c0036a.E = i;
        c0036a.F = i3;
        c0036a.G = 4;
        if (this.v1.i(new androidx.media3.common.a(c0036a)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i4 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.F1));
        }
        this.A1 = (!"audio/raw".equals(dVar.b) || "audio/raw".equals(str2)) ? null : aVar;
        return new c.a(dVar, mediaFormat, aVar, null, mediaCrypto, this.w1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void a0(DecoderInputBuffer decoderInputBuffer) {
        androidx.media3.common.a aVar;
        if (Build.VERSION.SDK_INT < 29 || (aVar = decoderInputBuffer.b) == null || !Objects.equals(aVar.n, "audio/opus") || !this.U0) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.V;
        byteBuffer.getClass();
        androidx.media3.common.a aVar2 = decoderInputBuffer.b;
        aVar2.getClass();
        int i = aVar2.I;
        if (byteBuffer.remaining() == 8) {
            this.v1.w(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.k
    public final boolean b() {
        return this.v1.m() || super.b();
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean c() {
        if (!this.h1) {
            return false;
        }
        ll3 ll3Var = this.v1;
        if (ll3Var.o()) {
            return ll3Var.R && !ll3Var.m();
        }
        return true;
    }

    @Override // defpackage.ng9
    public final cdb e() {
        return this.v1.D;
    }

    @Override // defpackage.ng9
    public final void g(cdb cdbVar) {
        ll3 ll3Var = this.v1;
        ll3Var.getClass();
        ll3Var.D = new cdb(vjg.h(cdbVar.a, 0.1f, 8.0f), vjg.h(cdbVar.b, 0.1f, 8.0f));
        ll3.e eVar = ll3Var.u;
        if (eVar != null && eVar.j) {
            ll3Var.v();
            return;
        }
        ll3.g gVar = new ll3.g(cdbVar, -9223372036854775807L, -9223372036854775807L);
        if (ll3Var.o()) {
            ll3Var.B = gVar;
        } else {
            ll3Var.C = gVar;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void g0(Exception exc) {
        zkd.x("MediaCodecAudioRenderer", "Audio codec error", exc);
        ry0 ry0Var = this.u1;
        Handler handler = ry0Var.a;
        if (handler != null) {
            handler.post(new yi0(1, ry0Var, exc));
        }
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.ng9
    public final boolean h() {
        boolean z = this.E1;
        this.E1 = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void h0(final long j, final String str, final long j2) {
        final ry0 ry0Var = this.u1;
        Handler handler = ry0Var.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: iy0
                @Override // java.lang.Runnable
                public final void run() {
                    d.a aVar = ry0Var.b;
                    String str2 = vjg.a;
                    d.this.s.k0(j, str, j2);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void i0(String str) {
        ry0 ry0Var = this.u1;
        Handler handler = ry0Var.a;
        if (handler != null) {
            handler.post(new jy0(0, ry0Var, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final dk3 j0(ql0 ql0Var) {
        androidx.media3.common.a aVar = (androidx.media3.common.a) ql0Var.c;
        aVar.getClass();
        this.z1 = aVar;
        dk3 dk3VarJ0 = super.j0(ql0Var);
        ry0 ry0Var = this.u1;
        Handler handler = ry0Var.a;
        if (handler != null) {
            handler.post(new oy0(0, ry0Var, aVar, dk3VarJ0));
        }
        return dk3VarJ0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[Catch: AudioSink$ConfigurationException -> 0x00df, TryCatch #0 {AudioSink$ConfigurationException -> 0x00df, blocks: (B:36:0x00bf, B:39:0x00c7, B:41:0x00cb, B:43:0x00d4, B:46:0x00e1, B:47:0x00e4), top: B:51:0x00bf }] */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(androidx.media3.common.a r7, android.media.MediaFormat r8) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og9.k0(androidx.media3.common.a, android.media.MediaFormat):void");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void l0(long j) {
        this.v1.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.j.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og9.m(int, java.lang.Object):void");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void n0() {
        this.v1.K = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q0(long r1, long r3, androidx.media3.exoplayer.mediacodec.c r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, androidx.media3.common.a r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r0 = this;
            r6.getClass()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.H1 = r1
            androidx.media3.common.a r1 = r0.A1
            r2 = 1
            if (r1 == 0) goto L1a
            r1 = r8 & 2
            if (r1 == 0) goto L1a
            r5.getClass()
            r5.g(r7)
            return r2
        L1a:
            ll3 r1 = r0.v1
            if (r12 == 0) goto L2d
            if (r5 == 0) goto L23
            r5.g(r7)
        L23:
            ak3 r0 = r0.l1
            int r3 = r0.f
            int r3 = r3 + r9
            r0.f = r3
            r1.K = r2
            return r2
        L2d:
            boolean r1 = r1.l(r6, r10, r9)     // Catch: androidx.media3.exoplayer.audio.AudioSink$WriteException -> L44 androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L5e
            if (r1 == 0) goto L40
            if (r5 == 0) goto L38
            r5.g(r7)
        L38:
            ak3 r0 = r0.l1
            int r1 = r0.e
            int r1 = r1 + r9
            r0.e = r1
            return r2
        L40:
            r0.H1 = r10
            r0 = 0
            return r0
        L44:
            r1 = move-exception
            boolean r2 = r1.isRecoverable
            boolean r3 = r0.U0
            if (r3 == 0) goto L57
            w1d r3 = r0.d
            r3.getClass()
            int r3 = r3.a
            if (r3 == 0) goto L57
            r3 = 5003(0x138b, float:7.01E-42)
            goto L59
        L57:
            r3 = 5002(0x138a, float:7.009E-42)
        L59:
            androidx.media3.exoplayer.ExoPlaybackException r0 = r0.D(r1, r14, r2, r3)
            throw r0
        L5e:
            r1 = move-exception
            androidx.media3.common.a r2 = r0.z1
            boolean r3 = r1.isRecoverable
            boolean r4 = r0.U0
            if (r4 == 0) goto L73
            w1d r4 = r0.d
            r4.getClass()
            int r4 = r4.a
            if (r4 == 0) goto L73
            r4 = 5004(0x138c, float:7.012E-42)
            goto L75
        L73:
            r4 = 5001(0x1389, float:7.008E-42)
        L75:
            androidx.media3.exoplayer.ExoPlaybackException r0 = r0.D(r1, r2, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og9.q0(long, long, androidx.media3.exoplayer.mediacodec.c, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, androidx.media3.common.a):boolean");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void t0() throws ExoPlaybackException {
        try {
            ll3 ll3Var = this.v1;
            if (!ll3Var.R && ll3Var.o() && ll3Var.f()) {
                ll3Var.s();
                ll3Var.R = true;
            }
            long j = this.f1;
            if (j != -9223372036854775807L) {
                this.H1 = j;
            }
        } catch (AudioSink$WriteException e) {
            throw D(e, e.format, e.isRecoverable, this.U0 ? 5003 : 5002);
        }
    }

    @Override // defpackage.ng9
    public final long w() {
        if (this.W == 2) {
            J0();
        }
        return this.B1;
    }
}
