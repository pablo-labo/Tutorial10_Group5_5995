package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.k;
import defpackage.e47;
import defpackage.hl3;
import defpackage.ll3;
import defpackage.og9;
import defpackage.tx0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class ll3 {
    public static final Object l0 = new Object();
    public static ScheduledExecutorService m0;
    public static int n0;
    public ox0 A;
    public g B;
    public g C;
    public cdb D;
    public boolean E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public float N;
    public ByteBuffer O;
    public int P;
    public ByteBuffer Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public r51 Y;
    public ux0 Z;
    public final Context a;
    public boolean a0;
    public final f b;
    public long b0;
    public final i22 c;
    public long c0;
    public final luf d;
    public boolean d0;
    public final androidx.media3.common.audio.d e;
    public boolean e0;
    public final wmf f;
    public Looper f0;
    public final qyc g;
    public long g0;
    public final vy0 h;
    public long h0;
    public final ArrayDeque<g> i;
    public Handler i0;
    public int j;
    public Context j0;
    public k k;
    public final boolean k0;
    public final i<AudioSink$InitializationException> l;
    public final i<AudioSink$WriteException> m;
    public final ol3 n;
    public final hl3 o;
    public final pl3 p;
    public final int q;
    public sdb r;
    public og9.a s;
    public e t;
    public e u;
    public androidx.media3.common.audio.a v;
    public AudioTrack w;
    public sx0 x;
    public tx0 y;
    public h z;

    public static final class a {
        public static void a(AudioTrack audioTrack, sdb sdbVar) {
            LogSessionId logSessionIdA = sdbVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface b {
        public static final ol3 a = new ol3();
    }

    public interface c {
        public static final pl3 a = new pl3();
    }

    public static final class d {
        public final Context a;
        public f c;
        public boolean d;
        public hl3 g;
        public final sx0 b = sx0.c;
        public final ol3 e = b.a;
        public final pl3 f = c.a;

        public d(Context context) {
            this.a = context;
        }
    }

    public static final class e {
        public final androidx.media3.common.a a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final androidx.media3.common.audio.a i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public e(androidx.media3.common.a aVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, androidx.media3.common.audio.a aVar2, boolean z, boolean z2, boolean z3) {
            this.a = aVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = aVar2;
            this.j = z;
            this.k = z2;
            this.l = z3;
        }

        public final sy0 a() {
            return new sy0(this.g, this.e, this.f, this.l, this.c == 1, this.h);
        }
    }

    public static class f {
        public final AudioProcessor[] a;
        public final ffe b;
        public final androidx.media3.common.audio.c c;

        public f(AudioProcessor... audioProcessorArr) {
            ffe ffeVar = new ffe();
            androidx.media3.common.audio.c cVar = new androidx.media3.common.audio.c();
            cVar.c = 1.0f;
            cVar.d = 1.0f;
            AudioProcessor.a aVar = AudioProcessor.a.e;
            cVar.e = aVar;
            cVar.f = aVar;
            cVar.g = aVar;
            cVar.h = aVar;
            ByteBuffer byteBuffer = AudioProcessor.a;
            cVar.k = byteBuffer;
            cVar.l = byteBuffer.asShortBuffer();
            cVar.m = byteBuffer;
            cVar.b = -1;
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.b = ffeVar;
            this.c = cVar;
            audioProcessorArr2[audioProcessorArr.length] = ffeVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = cVar;
        }
    }

    public static final class g {
        public final cdb a;
        public final long b;
        public final long c;
        public long d;

        public g(cdb cdbVar, long j, long j2) {
            this.a = cdbVar;
            this.b = j;
            this.c = j2;
        }
    }

    public static final class h {
        public final AudioTrack a;
        public final tx0 b;
        public ml3 c = new AudioRouting.OnRoutingChangedListener() { // from class: ml3
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                AudioDeviceInfo routedDevice;
                ll3.h hVar = this.a;
                if (hVar.c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                    return;
                }
                hVar.b.b(routedDevice);
            }
        };

        /* JADX WARN: Type inference failed for: r3v1, types: [ml3] */
        public h(AudioTrack audioTrack, tx0 tx0Var) {
            this.a = audioTrack;
            this.b = tx0Var;
            audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
        }
    }

    public static final class i<T extends Exception> {
        public T a;
        public long b = -9223372036854775807L;
        public long c = -9223372036854775807L;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void a(T t) throws T {
            boolean z;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.a == null) {
                this.a = t;
            }
            if (this.b == -9223372036854775807L) {
                synchronized (ll3.l0) {
                    z = ll3.n0 > 0;
                }
                if (!z) {
                    this.b = 200 + jElapsedRealtime;
                }
            }
            long j = this.b;
            if (j == -9223372036854775807L || jElapsedRealtime < j) {
                this.c = jElapsedRealtime + 50;
                return;
            }
            T t2 = this.a;
            if (t2 != t) {
                t2.addSuppressed(t);
            }
            T t3 = this.a;
            this.a = null;
            this.b = -9223372036854775807L;
            this.c = -9223372036854775807L;
            throw t3;
        }
    }

    public final class j {
        public j() {
        }

        public final void a(final long j) {
            final ry0 ry0Var;
            Handler handler;
            og9.a aVar = ll3.this.s;
            if (aVar == null || (handler = (ry0Var = og9.this.u1).a) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: hy0
                @Override // java.lang.Runnable
                public final void run() {
                    d.a aVar2 = ry0Var.b;
                    String str = vjg.a;
                    d.this.s.L(j);
                }
            });
        }
    }

    public final class k {
        public final Handler a = new Handler(Looper.myLooper());
        public final a b = new a();

        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                ll3 ll3Var;
                og9.a aVar;
                k.a aVar2;
                k kVar = k.this;
                if (audioTrack.equals(ll3.this.w) && (aVar = (ll3Var = ll3.this).s) != null && ll3Var.U && (aVar2 = og9.this.w0) != null) {
                    aVar2.b();
                }
            }

            public final void onPresentationEnded(AudioTrack audioTrack) {
                k kVar = k.this;
                if (audioTrack.equals(ll3.this.w)) {
                    ll3.this.T = true;
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                ll3 ll3Var;
                og9.a aVar;
                k.a aVar2;
                k kVar = k.this;
                if (audioTrack.equals(ll3.this.w) && (aVar = (ll3Var = ll3.this).s) != null && ll3Var.U && (aVar2 = og9.this.w0) != null) {
                    aVar2.b();
                }
            }
        }

        public k() {
        }

        public final void a(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.a.removeCallbacksAndMessages(null);
        }
    }

    public ll3(d dVar) {
        int deviceId;
        Context context = dVar.a;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.A = ox0.h;
        this.x = applicationContext != null ? null : dVar.b;
        this.b = dVar.c;
        this.j = 0;
        this.n = dVar.e;
        hl3 hl3Var = dVar.g;
        hl3Var.getClass();
        this.o = hl3Var;
        this.h = new vy0(new j());
        i22 i22Var = new i22();
        this.c = i22Var;
        luf lufVar = new luf();
        lufVar.m = vjg.b;
        this.d = lufVar;
        this.e = new androidx.media3.common.audio.d();
        this.f = new wmf();
        this.g = e47.o(lufVar, i22Var);
        this.N = 1.0f;
        this.W = 0;
        this.Y = new r51();
        cdb cdbVar = cdb.d;
        this.C = new g(cdbVar, 0L, 0L);
        this.D = cdbVar;
        this.E = false;
        this.i = new ArrayDeque<>();
        this.l = new i<>();
        this.m = new i<>();
        this.p = dVar.f;
        int i2 = -1;
        if (Build.VERSION.SDK_INT >= 34 && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i2 = deviceId;
        }
        this.q = i2;
        this.k0 = true;
    }

    public static boolean p(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j2) {
        cdb cdbVar;
        e eVar = this.u;
        boolean z = false;
        f fVar = this.b;
        if (eVar == null || !eVar.j) {
            if (this.a0 || eVar.c != 0) {
                cdbVar = cdb.d;
            } else {
                int i2 = eVar.a.H;
                cdbVar = this.D;
                androidx.media3.common.audio.c cVar = fVar.c;
                float f2 = cdbVar.a;
                cVar.getClass();
                ka2.l(f2 > 0.0f);
                if (cVar.c != f2) {
                    cVar.c = f2;
                    cVar.i = true;
                }
                float f3 = cdbVar.b;
                ka2.l(f3 > 0.0f);
                if (cVar.d != f3) {
                    cVar.d = f3;
                    cVar.i = true;
                }
            }
            this.D = cdbVar;
        } else {
            cdbVar = cdb.d;
        }
        cdb cdbVar2 = cdbVar;
        if (!this.a0) {
            e eVar2 = this.u;
            if (eVar2.c == 0) {
                int i3 = eVar2.a.H;
                z = this.E;
                fVar.b.o = z;
            }
        }
        this.E = z;
        this.i.add(new g(cdbVar2, Math.max(0L, j2), vjg.V(this.u.e, k())));
        androidx.media3.common.audio.a aVar = this.u.i;
        this.v = aVar;
        aVar.a();
        og9.a aVar2 = this.s;
        if (aVar2 != null) {
            final boolean z2 = this.E;
            final ry0 ry0Var = og9.this.u1;
            Handler handler = ry0Var.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: py0
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a aVar3 = ry0Var.b;
                        String str = vjg.a;
                        d dVar = d.this;
                        boolean z3 = dVar.c0;
                        boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        dVar.c0 = z4;
                        dVar.m.f(23, new d35(1, z4));
                    }
                });
            }
        }
    }

    public final AudioTrack b(sy0 sy0Var, ox0 ox0Var, int i2, androidx.media3.common.a aVar, Context context) throws AudioSink$InitializationException {
        try {
            AudioTrack audioTrackA = this.p.a(sy0Var, ox0Var, i2, context);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, sy0Var.b, sy0Var.c, sy0Var.a, sy0Var.f, aVar, sy0Var.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new AudioSink$InitializationException(0, sy0Var.b, sy0Var.c, sy0Var.a, sy0Var.f, aVar, sy0Var.e, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.AudioTrack c(ll3.e r9) throws androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            r8 = this;
            int r0 = r8.W     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            int r1 = r8.q     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            r2 = -1
            if (r1 == r2) goto L26
            android.content.Context r2 = r8.a     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            if (r2 == 0) goto L26
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            r4 = 34
            if (r3 < r4) goto L26
            android.content.Context r0 = r8.j0     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            if (r0 != 0) goto L20
            android.content.Context r0 = r2.createDeviceContext(r1)     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            r8.j0 = r0     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L3d
        L20:
            android.content.Context r0 = r8.j0     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            r1 = 0
            r7 = r0
            r5 = r1
            goto L29
        L26:
            r1 = 0
            r5 = r0
            r7 = r1
        L29:
            sy0 r3 = r9.a()     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            ox0 r4 = r8.A     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            androidx.media3.common.a r6 = r9.a     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            r2 = r8
            android.media.AudioTrack r8 = r2.b(r3, r4, r5, r6, r7)     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L37
            return r8
        L37:
            r0 = move-exception
        L38:
            r9 = r0
            goto L3d
        L3a:
            r0 = move-exception
            r2 = r8
            goto L38
        L3d:
            og9$a r8 = r2.s
            if (r8 == 0) goto L44
            r8.a(r9)
        L44:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll3.c(ll3$e):android.media.AudioTrack");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.media3.common.a r26, int[] r27) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll3.d(androidx.media3.common.a, int[]):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    public final void e(long j2) throws T, AudioSink$WriteException {
        int iWrite;
        og9.a aVar;
        k.a aVar2;
        boolean z;
        i<AudioSink$WriteException> iVar = this.m;
        if (this.Q == null) {
            return;
        }
        if (iVar.a != 0) {
            synchronized (l0) {
                z = n0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < iVar.c) {
                return;
            }
        }
        int iRemaining = this.Q.remaining();
        if (this.a0) {
            ka2.q(j2 != -9223372036854775807L);
            if (j2 == Long.MIN_VALUE) {
                j2 = this.b0;
            } else {
                this.b0 = j2;
            }
            iWrite = this.w.write(this.Q, iRemaining, 1, j2 * 1000);
        } else {
            iWrite = this.w.write(this.Q, iRemaining, 1);
        }
        this.c0 = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if (iWrite == -6 || iWrite == -32) {
                if (k() > 0) {
                    z = true;
                } else if (p(this.w)) {
                    if (this.u.c == 1) {
                        this.d0 = true;
                    }
                    z = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(iWrite, this.u.a, z);
            og9.a aVar3 = this.s;
            if (aVar3 != null) {
                aVar3.a(audioSink$WriteException);
            }
            if (!audioSink$WriteException.isRecoverable || this.a == null) {
                iVar.a(audioSink$WriteException);
                return;
            }
            sx0 sx0Var = sx0.c;
            this.x = sx0Var;
            this.y.a(sx0Var);
            throw audioSink$WriteException;
        }
        iVar.a = null;
        iVar.b = -9223372036854775807L;
        iVar.c = -9223372036854775807L;
        if (p(this.w)) {
            if (this.I > 0) {
                this.e0 = false;
            }
            if (this.U && (aVar = this.s) != null && iWrite < iRemaining && !this.e0 && (aVar2 = og9.this.w0) != null) {
                aVar2.a();
            }
        }
        int i2 = this.u.c;
        if (i2 == 0) {
            this.H += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i2 != 0) {
                ka2.q(this.Q == this.O);
                this.I = (((long) this.J) * ((long) this.P)) + this.I;
            }
            this.Q = null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() throws T, androidx.media3.exoplayer.audio.AudioSink$WriteException {
        /*
            r6 = this;
            androidx.media3.common.audio.a r0 = r6.v
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.e(r1)
            java.nio.ByteBuffer r6 = r6.Q
            if (r6 != 0) goto L44
            goto L43
        L14:
            androidx.media3.common.audio.a r0 = r6.v
            boolean r5 = r0.d()
            if (r5 == 0) goto L2e
            boolean r5 = r0.d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.d = r4
            java.util.ArrayList r0 = r0.b
            java.lang.Object r0 = r0.get(r3)
            androidx.media3.common.audio.AudioProcessor r0 = (androidx.media3.common.audio.AudioProcessor) r0
            r0.f()
        L2e:
            r6.t(r1)
            androidx.media3.common.audio.a r0 = r6.v
            boolean r0 = r0.c()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r6 = r6.Q
            if (r6 == 0) goto L43
            boolean r6 = r6.hasRemaining()
            if (r6 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll3.f():boolean");
    }

    public final void g() {
        if (o()) {
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.e0 = false;
            this.J = 0;
            this.C = new g(this.D, 0L, 0L);
            this.M = 0L;
            this.B = null;
            this.i.clear();
            this.O = null;
            this.P = 0;
            this.Q = null;
            this.S = false;
            this.R = false;
            this.T = false;
            this.d.o = 0L;
            androidx.media3.common.audio.a aVar = this.u.i;
            this.v = aVar;
            aVar.a();
            AudioTrack audioTrack = this.h.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (p(this.w)) {
                k kVar = this.k;
                kVar.getClass();
                kVar.a(this.w);
            }
            final sy0 sy0VarA = this.u.a();
            e eVar = this.t;
            if (eVar != null) {
                this.u = eVar;
                this.t = null;
            }
            vy0 vy0Var = this.h;
            vy0Var.f();
            vy0Var.c = null;
            vy0Var.e = null;
            h hVar = this.z;
            if (hVar != null) {
                AudioTrack audioTrack2 = hVar.a;
                ml3 ml3Var = hVar.c;
                ml3Var.getClass();
                audioTrack2.removeOnRoutingChangedListener(ml3Var);
                hVar.c = null;
                this.z = null;
            }
            final AudioTrack audioTrack3 = this.w;
            final og9.a aVar2 = this.s;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (l0) {
                try {
                    if (m0 == null) {
                        String str = vjg.a;
                        m0 = Executors.newSingleThreadScheduledExecutor(new tjg());
                    }
                    n0++;
                    m0.schedule(new Runnable() { // from class: il3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioTrack audioTrack4 = audioTrack3;
                            ty0 ty0Var = aVar2;
                            Handler handler2 = handler;
                            sy0 sy0Var = sy0VarA;
                            try {
                                audioTrack4.flush();
                                audioTrack4.release();
                                if (ty0Var != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new kl3(0, ty0Var, sy0Var));
                                }
                                synchronized (ll3.l0) {
                                    try {
                                        int i2 = ll3.n0 - 1;
                                        ll3.n0 = i2;
                                        if (i2 == 0) {
                                            ll3.m0.shutdown();
                                            ll3.m0 = null;
                                        }
                                    } finally {
                                    }
                                }
                            } catch (Throwable th) {
                                if (ty0Var != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new kl3(0, ty0Var, sy0Var));
                                }
                                synchronized (ll3.l0) {
                                    try {
                                        int i3 = ll3.n0 - 1;
                                        ll3.n0 = i3;
                                        if (i3 == 0) {
                                            ll3.m0.shutdown();
                                            ll3.m0 = null;
                                        }
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w = null;
        }
        i<AudioSink$WriteException> iVar = this.m;
        iVar.a = null;
        iVar.b = -9223372036854775807L;
        iVar.c = -9223372036854775807L;
        i<AudioSink$InitializationException> iVar2 = this.l;
        iVar2.a = null;
        iVar2.b = -9223372036854775807L;
        iVar2.c = -9223372036854775807L;
        this.g0 = 0L;
        this.h0 = 0L;
        Handler handler2 = this.i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final fy0 h(androidx.media3.common.a aVar) {
        boolean zBooleanValue;
        if (this.d0) {
            return fy0.d;
        }
        ox0 ox0Var = this.A;
        hl3 hl3Var = this.o;
        hl3Var.getClass();
        aVar.getClass();
        int i2 = aVar.G;
        ox0Var.getClass();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || i2 == -1) {
            return fy0.d;
        }
        Context context = hl3Var.a;
        Boolean bool = hl3Var.b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = ey0.a(context).getParameters("offloadVariableRateSupported");
                hl3Var.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                hl3Var.b = Boolean.FALSE;
            }
            zBooleanValue = hl3Var.b.booleanValue();
        }
        String str = aVar.n;
        str.getClass();
        int iD = st9.d(str, aVar.k);
        if (iD == 0 || i3 < vjg.r(iD)) {
            return fy0.d;
        }
        int iS = vjg.s(aVar.F);
        if (iS == 0) {
            return fy0.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(iS).setEncoding(iD).build();
            return i3 >= 31 ? hl3.b.a(audioFormatBuild, ox0Var.b().a, zBooleanValue) : hl3.a.a(audioFormatBuild, ox0Var.b().a, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return fy0.d;
        }
    }

    public final int i(androidx.media3.common.a aVar) {
        q();
        String str = aVar.n;
        int i2 = aVar.H;
        if ("audio/raw".equals(str)) {
            if (!vjg.J(i2)) {
                g7.j(i2, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i2 != 2) {
                return 1;
            }
        } else if (this.x.d(this.A, aVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        e eVar = this.u;
        return eVar.c == 0 ? this.F / ((long) eVar.b) : this.G;
    }

    public final long k() {
        e eVar = this.u;
        if (eVar.c != 0) {
            return this.I;
        }
        long j2 = this.H;
        long j3 = eVar.d;
        String str = vjg.a;
        return ((j2 + j3) - 1) / j3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0390, code lost:
    
        if (r15 == 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (n() == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.nio.ByteBuffer r28, final long r29, int r31) throws T, androidx.media3.exoplayer.audio.AudioSink$WriteException, androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll3.l(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean m() {
        if (!o()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.w.isOffloadedPlayback() && this.T) {
            return false;
        }
        long jK = k();
        vy0 vy0Var = this.h;
        long jA = vy0Var.a();
        int i2 = vy0Var.f;
        String str = vjg.a;
        return jK > vjg.X(jA, (long) i2, 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() throws androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll3.n():boolean");
    }

    public final boolean o() {
        return this.w != null;
    }

    @EnsuresNonNull({"audioCapabilities"})
    public final void q() {
        Context context;
        sx0 sx0Var;
        Looper looperMyLooper = Looper.myLooper();
        int i2 = 0;
        boolean z = this.y == null || this.f0 == looperMyLooper;
        StringBuilder sb = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f0;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(" and ");
        sb.append(looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        ka2.p(sb.toString(), z);
        if (this.y == null && (context = this.a) != null) {
            this.f0 = looperMyLooper;
            tx0 tx0Var = new tx0(context, new jl3(this, i2), this.A, this.Z);
            this.y = tx0Var;
            if (tx0Var.j) {
                sx0Var = tx0Var.g;
                sx0Var.getClass();
            } else {
                tx0Var.j = true;
                tx0.b bVar = tx0Var.f;
                if (bVar != null) {
                    bVar.a.registerContentObserver(bVar.b, false, bVar);
                }
                Handler handler = tx0Var.c;
                Context context2 = tx0Var.a;
                tx0.a aVar = tx0Var.d;
                if (aVar != null) {
                    ey0.a(context2).registerAudioDeviceCallback(aVar, handler);
                }
                sx0 sx0VarC = sx0.c(context2, context2.registerReceiver(tx0Var.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), tx0Var.i, tx0Var.h);
                tx0Var.g = sx0VarC;
                sx0Var = sx0VarC;
            }
            this.x = sx0Var;
        }
        this.x.getClass();
    }

    public final void r() {
        this.U = true;
        if (o()) {
            vy0 vy0Var = this.h;
            if (vy0Var.w != -9223372036854775807L) {
                vy0Var.w = vjg.O(vy0Var.F.d());
            }
            vy0Var.j = vjg.V(vy0Var.f, vy0Var.b());
            uy0 uy0Var = vy0Var.e;
            uy0Var.getClass();
            uy0Var.a(0);
            if (!this.S || p(this.w)) {
                this.w.play();
            }
        }
    }

    public final void s() {
        if (this.S) {
            return;
        }
        this.S = true;
        long jK = k();
        vy0 vy0Var = this.h;
        vy0Var.y = vy0Var.b();
        vy0Var.w = vjg.O(vy0Var.F.d());
        vy0Var.z = jK;
        if (p(this.w)) {
            this.T = false;
        }
        this.w.stop();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    public final void t(long j2) throws T, AudioSink$WriteException {
        ByteBuffer byteBuffer;
        e(j2);
        if (this.Q != null) {
            return;
        }
        if (!this.v.d()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 != null) {
                y(byteBuffer2);
                e(j2);
                return;
            }
            return;
        }
        while (!this.v.c()) {
            do {
                androidx.media3.common.audio.a aVar = this.v;
                if (aVar.d()) {
                    ByteBuffer byteBuffer3 = aVar.c[aVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        aVar.e(AudioProcessor.a);
                        byteBuffer = aVar.c[aVar.b()];
                    }
                } else {
                    byteBuffer = AudioProcessor.a;
                }
                if (byteBuffer.hasRemaining()) {
                    y(byteBuffer);
                    e(j2);
                } else {
                    ByteBuffer byteBuffer4 = this.O;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    androidx.media3.common.audio.a aVar2 = this.v;
                    ByteBuffer byteBuffer5 = this.O;
                    if (aVar2.d() && !aVar2.d) {
                        aVar2.e(byteBuffer5);
                    }
                }
            } while (this.Q == null);
            return;
        }
    }

    public final void u() {
        g();
        e47.b bVarListIterator = this.g.listIterator(0);
        while (bVarListIterator.hasNext()) {
            ((AudioProcessor) bVarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        androidx.media3.common.audio.a aVar = this.v;
        if (aVar != null) {
            e47<AudioProcessor> e47Var = aVar.a;
            for (int i2 = 0; i2 < e47Var.size(); i2++) {
                AudioProcessor audioProcessor = e47Var.get(i2);
                audioProcessor.flush();
                audioProcessor.reset();
            }
            aVar.c = new ByteBuffer[0];
            AudioProcessor.a aVar2 = AudioProcessor.a.e;
            aVar.d = false;
        }
        this.U = false;
        this.d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.a).setPitch(this.D.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                zkd.U("DefaultAudioSink", "Failed to set playback params", e2);
            }
            cdb cdbVar = new cdb(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.D = cdbVar;
            float f2 = cdbVar.a;
            vy0 vy0Var = this.h;
            vy0Var.h = f2;
            uy0 uy0Var = vy0Var.e;
            if (uy0Var != null) {
                uy0Var.a(0);
            }
            vy0Var.f();
        }
    }

    public final void w(int i2, int i3) {
        e eVar;
        AudioTrack audioTrack = this.w;
        if (audioTrack == null || !p(audioTrack) || (eVar = this.u) == null || !eVar.k) {
            return;
        }
        this.w.setOffloadDelayPadding(i2, i3);
    }

    public final void x(int i2) {
        ka2.q(Build.VERSION.SDK_INT >= 29);
        this.j = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll3.y(java.nio.ByteBuffer):void");
    }

    public final boolean z(androidx.media3.common.a aVar) {
        return i(aVar) != 0;
    }
}
