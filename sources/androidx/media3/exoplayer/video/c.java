package androidx.media3.exoplayer.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.d;
import androidx.media3.exoplayer.video.d.c;
import androidx.media3.exoplayer.video.e;
import androidx.media3.exoplayer.video.g;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ak3;
import defpackage.bg;
import defpackage.cg2;
import defpackage.d82;
import defpackage.dk3;
import defpackage.dm3;
import defpackage.e47;
import defpackage.ek9;
import defpackage.emf;
import defpackage.gie;
import defpackage.ia;
import defpackage.ka2;
import defpackage.qg9;
import defpackage.ql0;
import defpackage.qog;
import defpackage.qyc;
import defpackage.r6;
import defpackage.rjd;
import defpackage.rng;
import defpackage.sng;
import defpackage.st9;
import defpackage.t91;
import defpackage.tog;
import defpackage.vb0;
import defpackage.vjg;
import defpackage.w1d;
import defpackage.wng;
import defpackage.xf3;
import defpackage.zkd;
import defpackage.zsd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class c extends MediaCodecRenderer {
    public static final int[] k2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean l2;
    public static boolean m2;
    public final e.a A1;
    public final long B1;
    public final PriorityQueue<Long> C1;
    public d D1;
    public boolean E1;
    public boolean F1;
    public VideoSink G1;
    public boolean H1;
    public int I1;
    public List<Object> J1;
    public Surface K1;
    public PlaceholderSurface L1;
    public gie M1;
    public boolean N1;
    public int O1;
    public int P1;
    public long Q1;
    public int R1;
    public int S1;
    public int T1;
    public zsd U1;
    public boolean V1;
    public long W1;
    public int X1;
    public long Y1;
    public tog Z1;
    public tog a2;
    public int b2;
    public boolean c2;
    public int d2;
    public e e2;
    public rng f2;
    public long g2;
    public long h2;
    public boolean i2;
    public int j2;
    public final Context u1;
    public final boolean v1;
    public final g.a w1;
    public final int x1;
    public final boolean y1;
    public final androidx.media3.exoplayer.video.e z1;

    public class a implements VideoSink.b {
        public final /* synthetic */ androidx.media3.exoplayer.mediacodec.c a;
        public final /* synthetic */ int b;

        public a(androidx.media3.exoplayer.mediacodec.c cVar, int i, long j) {
            this.a = cVar;
            this.b = i;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public final void a(long j) {
            c.this.R0(this.a, this.b, j);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public final void b() {
            c.this.V0(this.a, this.b);
        }
    }

    public static final class b {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.video.c$c, reason: collision with other inner class name */
    public static final class C0054c {
        public final Context a;
        public boolean b;
        public c.b c;
        public long d;
        public boolean e;
        public Handler f;
        public d.a g;
        public int h;

        public C0054c(Context context) {
            this.a = context;
            this.c = new androidx.media3.exoplayer.mediacodec.b(context);
        }
    }

    public static final class d {
        public final int a;
        public final int b;
        public final int c;

        public d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public final class e implements Handler.Callback {
        public final Handler a;

        public e(androidx.media3.exoplayer.mediacodec.c cVar) {
            Handler handlerP = vjg.p(this);
            this.a = handlerP;
            cVar.c(this, handlerP);
        }

        public final void a(long j) {
            Surface surface;
            c cVar = c.this;
            g.a aVar = cVar.w1;
            if (this != cVar.e2 || cVar.B0 == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                cVar.j1 = true;
                return;
            }
            try {
                cVar.H0(j);
                tog togVar = cVar.Z1;
                if (!togVar.equals(tog.d) && !togVar.equals(cVar.a2)) {
                    cVar.a2 = togVar;
                    aVar.a(togVar);
                }
                cVar.l1.e++;
                androidx.media3.exoplayer.video.e eVar = cVar.z1;
                boolean z = eVar.e != 3;
                eVar.e = 3;
                eVar.g = vjg.O(eVar.l.d());
                if (z && (surface = cVar.K1) != null) {
                    Handler handler = aVar.a;
                    if (handler != null) {
                        handler.post(new qog(aVar, surface, SystemClock.elapsedRealtime()));
                    }
                    cVar.N1 = true;
                }
                cVar.m0(j);
            } catch (ExoPlaybackException e) {
                cVar.k1 = e;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            String str = vjg.a;
            a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
            return true;
        }
    }

    public c(C0054c c0054c) {
        super(2, c0054c.c, c0054c.e, 30.0f);
        Context applicationContext = c0054c.a.getApplicationContext();
        this.u1 = applicationContext;
        this.x1 = c0054c.h;
        this.G1 = null;
        this.w1 = new g.a(c0054c.f, c0054c.g);
        this.v1 = this.G1 == null;
        this.z1 = new androidx.media3.exoplayer.video.e(applicationContext, this, c0054c.d);
        this.A1 = new e.a();
        this.y1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.M1 = gie.c;
        this.O1 = 1;
        this.P1 = 0;
        this.Z1 = tog.d;
        this.d2 = 0;
        this.a2 = null;
        this.b2 = -1000;
        this.g2 = -9223372036854775807L;
        this.h2 = -9223372036854775807L;
        this.C1 = new PriorityQueue<>();
        this.B1 = -9223372036854775807L;
        this.U1 = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean I0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 3206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.c.I0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int J0(androidx.media3.exoplayer.mediacodec.d r11, androidx.media3.common.a r12) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.c.J0(androidx.media3.exoplayer.mediacodec.d, androidx.media3.common.a):int");
    }

    public static List<androidx.media3.exoplayer.mediacodec.d> K0(Context context, androidx.media3.exoplayer.mediacodec.f fVar, androidx.media3.common.a aVar, boolean z, boolean z2) {
        String str = aVar.n;
        if (str == null) {
            return qyc.e;
        }
        if ("video/dolby-vision".equals(str) && !b.a(context)) {
            String strB = MediaCodecUtil.b(aVar);
            List<androidx.media3.exoplayer.mediacodec.d> listC = strB == null ? qyc.e : fVar.c(strB, z, z2);
            if (!listC.isEmpty()) {
                return listC;
            }
        }
        return MediaCodecUtil.f(fVar, aVar, z, z2);
    }

    public static int L0(androidx.media3.exoplayer.mediacodec.d dVar, androidx.media3.common.a aVar) {
        int i = aVar.o;
        List<byte[]> list = aVar.q;
        if (i == -1) {
            return J0(dVar, aVar);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += list.get(i2).length;
        }
        return aVar.o + length;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean A0() {
        androidx.media3.common.a aVar = this.C0;
        if (this.U1 == null || this.V1 || this.c2) {
            return true;
        }
        return (aVar != null && aVar.p > 0) || this.q1 || this.f1 != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean B0(androidx.media3.exoplayer.mediacodec.d dVar) {
        return N0(dVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean C0() {
        androidx.media3.exoplayer.mediacodec.d dVar = this.I0;
        if (this.G1 != null && dVar != null) {
            String str = dVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.C0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.b
    public final void E() {
        g.a aVar = this.w1;
        this.a2 = null;
        this.h2 = -9223372036854775807L;
        Q0();
        this.N1 = false;
        this.e2 = null;
        this.V1 = true;
        int i = 4;
        try {
            super.E();
            ak3 ak3Var = this.l1;
            aVar.getClass();
            synchronized (ak3Var) {
            }
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new ek9(i, aVar, ak3Var));
            }
            aVar.a(tog.d);
        } catch (Throwable th) {
            ak3 ak3Var2 = this.l1;
            aVar.getClass();
            synchronized (ak3Var2) {
                Handler handler2 = aVar.a;
                if (handler2 != null) {
                    handler2.post(new ek9(i, aVar, ak3Var2));
                }
                aVar.a(tog.d);
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int E0(ia iaVar, androidx.media3.common.a aVar) {
        boolean z;
        int i = 0;
        if (!st9.o(aVar.n)) {
            return l.f(0, 0, 0, 0);
        }
        boolean z2 = aVar.r != null;
        Context context = this.u1;
        List<androidx.media3.exoplayer.mediacodec.d> listK0 = K0(context, iaVar, aVar, z2, false);
        if (z2 && listK0.isEmpty()) {
            listK0 = K0(context, iaVar, aVar, false, false);
        }
        if (listK0.isEmpty()) {
            return l.f(1, 0, 0, 0);
        }
        int i2 = aVar.O;
        if (i2 != 0 && i2 != 2) {
            return l.f(2, 0, 0, 0);
        }
        androidx.media3.exoplayer.mediacodec.d dVar = listK0.get(0);
        boolean zE = dVar.e(aVar);
        if (zE) {
            z = true;
        } else {
            for (int i3 = 1; i3 < listK0.size(); i3++) {
                androidx.media3.exoplayer.mediacodec.d dVar2 = listK0.get(i3);
                if (dVar2.e(aVar)) {
                    z = false;
                    zE = true;
                    dVar = dVar2;
                    break;
                }
            }
            z = true;
        }
        int i4 = zE ? 4 : 3;
        int i5 = dVar.f(aVar) ? 16 : 8;
        int i6 = dVar.g ? 64 : 0;
        int i7 = z ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0;
        if ("video/dolby-vision".equals(aVar.n) && !b.a(context)) {
            i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (zE) {
            List<androidx.media3.exoplayer.mediacodec.d> listK02 = K0(context, iaVar, aVar, z2, true);
            if (!listK02.isEmpty()) {
                HashMap<MediaCodecUtil.a, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.a;
                ArrayList arrayList = new ArrayList(listK02);
                Collections.sort(arrayList, new qg9(new t91(aVar, 5)));
                androidx.media3.exoplayer.mediacodec.d dVar3 = (androidx.media3.exoplayer.mediacodec.d) arrayList.get(0);
                if (dVar3.e(aVar) && dVar3.f(aVar)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // androidx.media3.exoplayer.b
    public final void F(boolean z, boolean z2) {
        d.c cVar;
        this.l1 = new ak3();
        w1d w1dVar = this.d;
        w1dVar.getClass();
        boolean z3 = w1dVar.b;
        ka2.q((z3 && this.d2 == 0) ? false : true);
        if (this.c2 != z3) {
            this.c2 = z3;
            s0();
        }
        ak3 ak3Var = this.l1;
        g.a aVar = this.w1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new xf3(6, aVar, ak3Var));
        }
        boolean z4 = this.H1;
        androidx.media3.exoplayer.video.e eVar = this.z1;
        if (!z4) {
            if (this.J1 != null && this.G1 == null) {
                d.a aVar2 = new d.a(this.u1, eVar);
                aVar2.d = true;
                d82 d82Var = this.V;
                d82Var.getClass();
                aVar2.e = d82Var;
                ka2.q(!aVar2.f);
                if (aVar2.c == null) {
                    aVar2.c = new d.f();
                }
                androidx.media3.exoplayer.video.d dVar = new androidx.media3.exoplayer.video.d(aVar2);
                aVar2.f = true;
                dVar.q = 1;
                SparseArray<d.c> sparseArray = dVar.c;
                if (vjg.k(sparseArray, 0)) {
                    cVar = sparseArray.get(0);
                } else {
                    d.c cVar2 = dVar.new c(dVar.a);
                    dVar.g.add(cVar2);
                    sparseArray.put(0, cVar2);
                    cVar = cVar2;
                }
                this.G1 = cVar;
            }
            this.H1 = true;
        }
        VideoSink videoSink = this.G1;
        if (videoSink == null) {
            d82 d82Var2 = this.V;
            d82Var2.getClass();
            eVar.l = d82Var2;
            eVar.f(!z2 ? 1 : 0);
            return;
        }
        videoSink.s(new androidx.media3.exoplayer.video.b(this));
        rng rngVar = this.f2;
        if (rngVar != null) {
            this.G1.y(rngVar);
        }
        if (this.K1 != null && !this.M1.equals(gie.c)) {
            this.G1.n(this.K1, this.M1);
        }
        this.G1.u(this.P1);
        this.G1.h(this.z0);
        List<Object> list = this.J1;
        if (list != null) {
            this.G1.l(list);
        }
        this.I1 = !z2 ? 1 : 0;
        this.p1 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.b
    public final void G(long j, boolean z) {
        VideoSink videoSink = this.G1;
        if (videoSink != null && !z) {
            videoSink.w(true);
        }
        super.G(j, z);
        VideoSink videoSink2 = this.G1;
        androidx.media3.exoplayer.video.e eVar = this.z1;
        if (videoSink2 == null) {
            wng wngVar = eVar.b;
            wngVar.m = 0L;
            wngVar.p = -1L;
            wngVar.n = -1L;
            eVar.h = -9223372036854775807L;
            eVar.f = -9223372036854775807L;
            eVar.e = Math.min(eVar.e, 1);
            eVar.i = -9223372036854775807L;
        }
        if (z) {
            VideoSink videoSink3 = this.G1;
            if (videoSink3 != null) {
                videoSink3.x(false);
            } else {
                eVar.c(false);
            }
        }
        Q0();
        this.S1 = 0;
    }

    @Override // androidx.media3.exoplayer.b
    public final void H() {
        VideoSink videoSink = this.G1;
        if (videoSink == null || !this.v1) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.b
    public final void I() {
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
            this.H1 = false;
            this.g2 = -9223372036854775807L;
            PlaceholderSurface placeholderSurface = this.L1;
            if (placeholderSurface != null) {
                placeholderSurface.release();
                this.L1 = null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void J() {
        this.R1 = 0;
        d82 d82Var = this.V;
        d82Var.getClass();
        this.Q1 = d82Var.d();
        this.W1 = 0L;
        this.X1 = 0;
        VideoSink videoSink = this.G1;
        if (videoSink != null) {
            videoSink.t();
        } else {
            this.z1.d();
        }
    }

    @Override // androidx.media3.exoplayer.b
    public final void K() {
        P0();
        final int i = this.X1;
        if (i != 0) {
            final long j = this.W1;
            final g.a aVar = this.w1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: sog
                    @Override // java.lang.Runnable
                    public final void run() {
                        g gVar = aVar.b;
                        String str = vjg.a;
                        gVar.i(i, j);
                    }
                });
            }
            this.W1 = 0L;
            this.X1 = 0;
        }
        VideoSink videoSink = this.G1;
        if (videoSink != null) {
            videoSink.r();
        } else {
            this.z1.e();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.b
    public final void L(androidx.media3.common.a[] aVarArr, long j, long j2, h.b bVar) {
        super.L(aVarArr, j, j2, bVar);
        emf emfVar = this.e0;
        if (emfVar.p()) {
            this.h2 = -9223372036854775807L;
        } else {
            bVar.getClass();
            this.h2 = emfVar.g(bVar.a, new emf.b()).d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.Surface M0(androidx.media3.exoplayer.mediacodec.d r6) {
        /*
            r5 = this;
            androidx.media3.exoplayer.video.VideoSink r0 = r5.G1
            if (r0 == 0) goto L9
            android.view.Surface r5 = r0.e()
            return r5
        L9:
            android.view.Surface r0 = r5.K1
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.U0(r6)
            defpackage.ka2.q(r0)
            androidx.media3.exoplayer.video.PlaceholderSurface r0 = r5.L1
            if (r0 == 0) goto L32
            boolean r1 = r0.a
            boolean r3 = r6.f
            if (r1 == r3) goto L32
            if (r0 == 0) goto L32
            r0.release()
            r5.L1 = r2
        L32:
            androidx.media3.exoplayer.video.PlaceholderSurface r0 = r5.L1
            if (r0 != 0) goto La9
            boolean r6 = r6.f
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L45
            boolean r2 = androidx.media3.exoplayer.video.PlaceholderSurface.a()
            if (r2 == 0) goto L43
            goto L47
        L43:
            r2 = r1
            goto L48
        L45:
            int r2 = androidx.media3.exoplayer.video.PlaceholderSurface.d
        L47:
            r2 = r0
        L48:
            defpackage.ka2.q(r2)
            androidx.media3.exoplayer.video.PlaceholderSurface$a r2 = new androidx.media3.exoplayer.video.PlaceholderSurface$a
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r2.<init>(r3)
            if (r6 == 0) goto L57
            int r6 = androidx.media3.exoplayer.video.PlaceholderSurface.d
            goto L58
        L57:
            r6 = r1
        L58:
            r2.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r2.getLooper()
            r3.<init>(r4, r2)
            r2.b = r3
            androidx.media3.common.util.a r4 = new androidx.media3.common.util.a
            r4.<init>(r3)
            r2.a = r4
            monitor-enter(r2)
            android.os.Handler r3 = r2.b     // Catch: java.lang.Throwable -> L87
            android.os.Message r6 = r3.obtainMessage(r0, r6, r1)     // Catch: java.lang.Throwable -> L87
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L87
        L77:
            androidx.media3.exoplayer.video.PlaceholderSurface r6 = r2.e     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L8b
            java.lang.RuntimeException r6 = r2.d     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L8b
            java.lang.Error r6 = r2.c     // Catch: java.lang.Throwable -> L87
            if (r6 != 0) goto L8b
            r2.wait()     // Catch: java.lang.Throwable -> L87 java.lang.InterruptedException -> L89
            goto L77
        L87:
            r5 = move-exception
            goto La7
        L89:
            r1 = r0
            goto L77
        L8b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L95
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L95:
            java.lang.RuntimeException r6 = r2.d
            if (r6 != 0) goto La6
            java.lang.Error r6 = r2.c
            if (r6 != 0) goto La5
            androidx.media3.exoplayer.video.PlaceholderSurface r6 = r2.e
            r6.getClass()
            r5.L1 = r6
            goto La9
        La5:
            throw r6
        La6:
            throw r6
        La7:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L87
            throw r5
        La9:
            androidx.media3.exoplayer.video.PlaceholderSurface r5 = r5.L1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.c.M0(androidx.media3.exoplayer.mediacodec.d):android.view.Surface");
    }

    public final boolean N0(androidx.media3.exoplayer.mediacodec.d dVar) {
        if (this.G1 != null) {
            return true;
        }
        Surface surface = this.K1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && dVar.h) || U0(dVar);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final dk3 O(androidx.media3.exoplayer.mediacodec.d dVar, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        dk3 dk3VarB = dVar.b(aVar, aVar2);
        int i = dk3VarB.e;
        d dVar2 = this.D1;
        dVar2.getClass();
        if (aVar2.u > dVar2.a || aVar2.v > dVar2.b) {
            i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        if (L0(dVar, aVar2) > dVar2.c) {
            i |= 64;
        }
        int i2 = i;
        return new dk3(dVar.a, aVar, aVar2, i2 != 0 ? 0 : dk3VarB.d, i2);
    }

    public final boolean O0(DecoderInputBuffer decoderInputBuffer) {
        if (j() || decoderInputBuffer.h(536870912)) {
            return true;
        }
        long j = this.h2;
        return j == -9223372036854775807L || j - (decoderInputBuffer.f - this.m1.c) <= 100000;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException P(IllegalStateException illegalStateException, androidx.media3.exoplayer.mediacodec.d dVar) {
        return new MediaCodecVideoDecoderException(illegalStateException, dVar, this.K1);
    }

    public final void P0() {
        if (this.R1 > 0) {
            d82 d82Var = this.V;
            d82Var.getClass();
            long jD = d82Var.d();
            final long j = jD - this.Q1;
            final int i = this.R1;
            final g.a aVar = this.w1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: rog
                    @Override // java.lang.Runnable
                    public final void run() {
                        g gVar = aVar.b;
                        String str = vjg.a;
                        gVar.k(i, j);
                    }
                });
            }
            this.R1 = 0;
            this.Q1 = jD;
        }
    }

    public final void Q0() {
        androidx.media3.exoplayer.mediacodec.c cVar;
        if (!this.c2 || (cVar = this.B0) == null) {
            return;
        }
        this.e2 = new e(cVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            cVar.setParameters(bundle);
        }
    }

    public final void R0(androidx.media3.exoplayer.mediacodec.c cVar, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        cVar.h(i, j);
        Trace.endSection();
        this.l1.e++;
        this.S1 = 0;
        if (this.G1 == null) {
            tog togVar = this.Z1;
            boolean zEquals = togVar.equals(tog.d);
            g.a aVar = this.w1;
            if (!zEquals && !togVar.equals(this.a2)) {
                this.a2 = togVar;
                aVar.a(togVar);
            }
            androidx.media3.exoplayer.video.e eVar = this.z1;
            boolean z = eVar.e != 3;
            eVar.e = 3;
            eVar.g = vjg.O(eVar.l.d());
            if (!z || (surface = this.K1) == null) {
                return;
            }
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new qog(aVar, surface, SystemClock.elapsedRealtime()));
            }
            this.N1 = true;
        }
    }

    public final void S0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.K1;
        g.a aVar = this.w1;
        if (surface2 == surface) {
            if (surface != null) {
                tog togVar = this.a2;
                if (togVar != null) {
                    aVar.a(togVar);
                }
                Surface surface3 = this.K1;
                if (surface3 == null || !this.N1 || (handler = aVar.a) == null) {
                    return;
                }
                handler.post(new qog(aVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.K1 = surface;
        VideoSink videoSink = this.G1;
        androidx.media3.exoplayer.video.e eVar = this.z1;
        if (videoSink == null) {
            eVar.h(surface);
        }
        this.N1 = false;
        int i = this.W;
        androidx.media3.exoplayer.mediacodec.c cVar = this.B0;
        if (cVar != null && this.G1 == null) {
            androidx.media3.exoplayer.mediacodec.d dVar = this.I0;
            dVar.getClass();
            if (!N0(dVar) || this.E1) {
                s0();
                d0();
            } else {
                Surface surfaceM0 = M0(dVar);
                if (surfaceM0 != null) {
                    cVar.f(surfaceM0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        bg.h();
                        return;
                    }
                    cVar.d();
                }
            }
        }
        if (surface != null) {
            tog togVar2 = this.a2;
            if (togVar2 != null) {
                aVar.a(togVar2);
            }
        } else {
            this.a2 = null;
            VideoSink videoSink2 = this.G1;
            if (videoSink2 != null) {
                videoSink2.v();
            }
        }
        if (i == 2) {
            VideoSink videoSink3 = this.G1;
            if (videoSink3 != null) {
                videoSink3.x(true);
            } else {
                eVar.c(true);
            }
        }
        Q0();
    }

    public final boolean T0(long j, long j2, boolean z, boolean z2) {
        if (this.G1 != null && this.v1) {
            j2 -= -this.g2;
        }
        if (j < -500000 && !z) {
            rjd rjdVar = this.X;
            rjdVar.getClass();
            int iM = rjdVar.m(j2 - this.Z);
            if (iM != 0) {
                ak3 ak3Var = this.l1;
                PriorityQueue<Long> priorityQueue = this.C1;
                if (z2) {
                    int i = ak3Var.d + iM;
                    ak3Var.d = i;
                    ak3Var.f += this.T1;
                    ak3Var.d = priorityQueue.size() + i;
                } else {
                    ak3Var.j++;
                    W0(priorityQueue.size() + iM, this.T1);
                }
                if (T()) {
                    d0();
                }
                VideoSink videoSink = this.G1;
                if (videoSink != null) {
                    videoSink.w(false);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean U0(androidx.media3.exoplayer.mediacodec.d dVar) {
        if (this.c2 || I0(dVar.a)) {
            return false;
        }
        return !dVar.f || PlaceholderSurface.a();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int V(DecoderInputBuffer decoderInputBuffer) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.U1 == null && !this.c2) || decoderInputBuffer.f >= this.a0 || O0(decoderInputBuffer)) ? 0 : 32;
        }
        return 0;
    }

    public final void V0(androidx.media3.exoplayer.mediacodec.c cVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        cVar.g(i);
        Trace.endSection();
        this.l1.f++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float W(float f, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        androidx.media3.exoplayer.mediacodec.d dVar;
        float fMax = -1.0f;
        for (androidx.media3.common.a aVar2 : aVarArr) {
            float f2 = aVar2.y;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.U1 == null || (dVar = this.I0) == null) {
            return f3;
        }
        int i = aVar.u;
        int i2 = aVar.v;
        float f4 = -3.4028235E38f;
        if (dVar.i) {
            float f5 = dVar.l;
            if (f5 != -3.4028235E38f && dVar.j == i && dVar.k == i2) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!dVar.g(i, i2, 1024.0d)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        if (dVar.g(i, i2, f8)) {
                            f6 = f8;
                        } else {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                dVar.l = f4;
                dVar.j = i;
                dVar.k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    public final void W0(int i, int i2) {
        ak3 ak3Var = this.l1;
        ak3Var.h += i;
        int i3 = i + i2;
        ak3Var.g += i3;
        this.R1 += i3;
        int i4 = this.S1 + i3;
        this.S1 = i4;
        ak3Var.i = Math.max(i4, ak3Var.i);
        int i5 = this.x1;
        if (i5 <= 0 || this.R1 < i5) {
            return;
        }
        P0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList X(ia iaVar, androidx.media3.common.a aVar, boolean z) {
        List<androidx.media3.exoplayer.mediacodec.d> listK0 = K0(this.u1, iaVar, aVar, z, this.c2);
        HashMap<MediaCodecUtil.a, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.a;
        ArrayList arrayList = new ArrayList(listK0);
        Collections.sort(arrayList, new qg9(new t91(aVar, 5)));
        return arrayList;
    }

    public final void X0(long j) {
        ak3 ak3Var = this.l1;
        ak3Var.k += j;
        ak3Var.l++;
        this.W1 += j;
        this.X1++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0131, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0134, code lost:
    
        r15 = r9;
     */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.mediacodec.c.a Z(androidx.media3.exoplayer.mediacodec.d r25, androidx.media3.common.a r26, android.media.MediaCrypto r27, float r28) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.c.Z(androidx.media3.exoplayer.mediacodec.d, androidx.media3.common.a, android.media.MediaCrypto, float):androidx.media3.exoplayer.mediacodec.c$a");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public final void a0(DecoderInputBuffer decoderInputBuffer) {
        if (this.F1) {
            ByteBuffer byteBuffer = decoderInputBuffer.V;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        androidx.media3.exoplayer.mediacodec.c cVar = this.B0;
                        cVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        cVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.k
    public final boolean b() {
        boolean zB = super.b();
        VideoSink videoSink = this.G1;
        if (videoSink != null) {
            return videoSink.m(zB);
        }
        if (zB && (this.B0 == null || this.c2)) {
            return true;
        }
        return this.z1.b(zB);
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.k
    public final boolean c() {
        if (!this.h1) {
            return false;
        }
        VideoSink videoSink = this.G1;
        return videoSink == null || videoSink.c();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean f0(androidx.media3.common.a aVar) throws ExoPlaybackException {
        VideoSink videoSink = this.G1;
        if (videoSink == null || videoSink.d()) {
            return true;
        }
        try {
            return this.G1.o(aVar);
        } catch (VideoSink.VideoSinkException e2) {
            throw this.D(e2, aVar, false, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void g0(Exception exc) {
        zkd.x("MediaCodecVideoRenderer", "Video codec error", exc);
        g.a aVar = this.w1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new vb0(4, aVar, exc));
        }
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void h0(final long j, String str, final long j2) {
        final String str2;
        final g.a aVar = this.w1;
        Handler handler = aVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new Runnable() { // from class: pog
                @Override // java.lang.Runnable
                public final void run() {
                    g gVar = aVar.b;
                    String str3 = vjg.a;
                    gVar.e(j, str2, j2);
                }
            });
        } else {
            str2 = str;
        }
        this.E1 = I0(str2);
        androidx.media3.exoplayer.mediacodec.d dVar = this.I0;
        dVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(dVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = dVar.d.profileLevels;
            if (codecProfileLevelArr == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.F1 = z;
        Q0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.k
    public final void i(long j, long j2) throws ExoPlaybackException {
        VideoSink videoSink = this.G1;
        if (videoSink != null) {
            try {
                videoSink.i(j, j2);
            } catch (VideoSink.VideoSinkException e2) {
                throw D(e2, e2.format, false, 7001);
            }
        }
        super.i(j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void i0(String str) {
        g.a aVar = this.w1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new cg2(4, aVar, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final dk3 j0(ql0 ql0Var) {
        dk3 dk3VarJ0 = super.j0(ql0Var);
        androidx.media3.common.a aVar = (androidx.media3.common.a) ql0Var.c;
        aVar.getClass();
        g.a aVar2 = this.w1;
        Handler handler = aVar2.a;
        if (handler != null) {
            handler.post(new dm3(2, aVar2, aVar, dk3VarJ0));
        }
        return dk3VarJ0;
    }

    @Override // androidx.media3.exoplayer.k
    public final void k() {
        VideoSink videoSink = this.G1;
        if (videoSink == null) {
            androidx.media3.exoplayer.video.e eVar = this.z1;
            if (eVar.e == 0) {
                eVar.e = 1;
                return;
            }
            return;
        }
        int i = this.I1;
        if (i == 0 || i == 1) {
            this.I1 = 0;
        } else {
            videoSink.p();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void k0(androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        androidx.media3.exoplayer.mediacodec.c cVar = this.B0;
        if (cVar != null) {
            cVar.e(this.O1);
        }
        if (this.c2) {
            i = aVar.u;
            integer = aVar.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = aVar.A;
        int i2 = aVar.z;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.Z1 = new tog(i, f, integer);
        VideoSink videoSink = this.G1;
        if (videoSink == null || !this.i2) {
            this.z1.g(aVar.y);
        } else {
            a.C0036a c0036aA = aVar.a();
            c0036aA.t = i;
            c0036aA.u = integer;
            c0036aA.z = f;
            androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0036aA);
            int i4 = this.I1;
            List list = this.J1;
            if (list == null) {
                e47.b bVar = e47.b;
                list = qyc.e;
            }
            videoSink.k(aVar2, this.m1.b, i4, list);
            this.I1 = 2;
        }
        this.i2 = false;
    }

    @Override // androidx.media3.exoplayer.b, androidx.media3.exoplayer.j.b
    public final void m(int i, Object obj) {
        if (i == 1) {
            S0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            rng rngVar = (rng) obj;
            this.f2 = rngVar;
            VideoSink videoSink = this.G1;
            if (videoSink != null) {
                videoSink.y(rngVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.d2 != iIntValue) {
                this.d2 = iIntValue;
                if (this.c2) {
                    s0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.O1 = iIntValue2;
            androidx.media3.exoplayer.mediacodec.c cVar = this.B0;
            if (cVar != null) {
                cVar.e(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.P1 = iIntValue3;
            VideoSink videoSink2 = this.G1;
            if (videoSink2 != null) {
                videoSink2.u(iIntValue3);
                return;
            }
            wng wngVar = this.z1.b;
            if (wngVar.j == iIntValue3) {
                return;
            }
            wngVar.j = iIntValue3;
            wngVar.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List<Object> list = (List) obj;
            if (list.equals(sng.a)) {
                VideoSink videoSink3 = this.G1;
                if (videoSink3 == null || !videoSink3.d()) {
                    return;
                }
                this.G1.b();
                return;
            }
            this.J1 = list;
            VideoSink videoSink4 = this.G1;
            if (videoSink4 != null) {
                videoSink4.l(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            gie gieVar = (gie) obj;
            if (gieVar.a == 0 || gieVar.b == 0) {
                return;
            }
            this.M1 = gieVar;
            VideoSink videoSink5 = this.G1;
            if (videoSink5 != null) {
                Surface surface = this.K1;
                ka2.r(surface);
                videoSink5.n(surface, gieVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.b2 = ((Integer) obj).intValue();
                androidx.media3.exoplayer.mediacodec.c cVar2 = this.B0;
                if (cVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.b2));
                    cVar2.setParameters(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.K1;
                S0(null);
                obj.getClass();
                ((c) obj).m(1, surface2);
                break;
            case 18:
                boolean z = this.U1 != null;
                zsd zsdVar = (zsd) obj;
                this.U1 = zsdVar;
                if (z != (zsdVar != null)) {
                    F0(this.C0);
                }
                break;
            default:
                if (i == 11) {
                    k.a aVar = (k.a) obj;
                    aVar.getClass();
                    this.w0 = aVar;
                }
                break;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void m0(long j) {
        super.m0(j);
        if (this.c2) {
            return;
        }
        this.T1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void n0() {
        VideoSink videoSink = this.G1;
        if (videoSink != null) {
            videoSink.j();
            if (this.g2 == -9223372036854775807L) {
                this.g2 = this.m1.b;
            }
            this.G1.g(-this.g2);
        } else {
            this.z1.f(2);
        }
        this.i2 = true;
        Q0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void o0(DecoderInputBuffer decoderInputBuffer) {
        this.j2 = 0;
        int iV = V(decoderInputBuffer);
        if ((Build.VERSION.SDK_INT < 34 || (iV & 32) == 0) && !this.c2) {
            this.T1++;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean q0(long j, long j2, androidx.media3.exoplayer.mediacodec.c cVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar) {
        int i4;
        cVar.getClass();
        long j4 = j3 - this.m1.c;
        int i5 = 0;
        while (true) {
            PriorityQueue<Long> priorityQueue = this.C1;
            Long lPeek = priorityQueue.peek();
            if (lPeek == null || lPeek.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        W0(i5, 0);
        VideoSink videoSink = this.G1;
        if (videoSink != null) {
            if (!z || z2) {
                return videoSink.q(j3, new a(cVar, i, j4));
            }
            V0(cVar, i);
            return true;
        }
        int iA = this.z1.a(j3, j, j2, this.m1.b, z, z2, this.A1);
        e.a aVar2 = this.A1;
        if (iA == 0) {
            d82 d82Var = this.V;
            d82Var.getClass();
            long jE = d82Var.e();
            rng rngVar = this.f2;
            if (rngVar != null) {
                rngVar.e(j4, jE, aVar, this.D0);
            }
            R0(cVar, i, jE);
            X0(aVar2.a);
            return true;
        }
        if (iA == 1) {
            long j5 = aVar2.b;
            long j6 = aVar2.a;
            if (j5 == this.Y1) {
                V0(cVar, i);
            } else {
                rng rngVar2 = this.f2;
                if (rngVar2 != null) {
                    i4 = i;
                    rngVar2.e(j4, j5, aVar, this.D0);
                } else {
                    i4 = i;
                }
                R0(cVar, i4, j5);
            }
            X0(j6);
            this.Y1 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            cVar.g(i);
            Trace.endSection();
            W0(0, 1);
            X0(aVar2.a);
            return true;
        }
        if (iA == 3) {
            V0(cVar, i);
            X0(aVar2.a);
            return true;
        }
        if (iA != 4 && iA != 5) {
            r6.g(String.valueOf(iA));
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void t0() {
        VideoSink videoSink = this.G1;
        if (videoSink != null) {
            videoSink.j();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void v0() {
        super.v0();
        this.C1.clear();
        this.T1 = 0;
        this.j2 = 0;
        this.V1 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.k
    public final void x(float f, float f2) {
        super.x(f, f2);
        VideoSink videoSink = this.G1;
        if (videoSink != null) {
            videoSink.h(f);
        } else {
            this.z1.i(f);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean z0(DecoderInputBuffer decoderInputBuffer) {
        boolean z = false;
        if (!O0(decoderInputBuffer)) {
            boolean z2 = decoderInputBuffer.f < this.a0;
            if (z2 && !decoderInputBuffer.h(268435456)) {
                if (decoderInputBuffer.h(67108864)) {
                    decoderInputBuffer.n();
                    z = true;
                }
                if (z) {
                    if (z2) {
                        this.l1.d++;
                    } else {
                        this.C1.add(Long.valueOf(decoderInputBuffer.f));
                        this.j2++;
                    }
                }
                return z;
            }
        }
        return false;
    }
}
