package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.a;
import androidx.media3.exoplayer.source.h;
import defpackage.emf;
import defpackage.ij9;
import defpackage.v20;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class rj9 implements v20 {
    public int A;
    public boolean B;
    public final Context a;
    public final sp3 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public PlaybackException o;
    public b p;
    public b q;
    public b r;
    public androidx.media3.common.a s;
    public androidx.media3.common.a t;
    public androidx.media3.common.a u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = q71.a();
    public final emf.d f = new emf.d();
    public final emf.b g = new emf.b();
    public final HashMap<String, Long> i = new HashMap<>();
    public final HashMap<String, Long> h = new HashMap<>();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class b {
        public final androidx.media3.common.a a;
        public final int b;
        public final String c;

        public b(androidx.media3.common.a aVar, int i, String str) {
            this.a = aVar;
            this.b = i;
            this.c = str;
        }
    }

    public rj9(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        sp3 sp3Var = new sp3();
        this.c = sp3Var;
        sp3Var.d = this;
    }

    public static /* synthetic */ void e(rj9 rj9Var, NetworkEvent networkEvent) {
        rj9Var.d.reportNetworkEvent(networkEvent);
    }

    public static rj9 p(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new rj9(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // defpackage.v20
    public final void a(tog togVar) {
        b bVar = this.p;
        if (bVar != null) {
            androidx.media3.common.a aVar = bVar.a;
            if (aVar.v == -1) {
                a.C0036a c0036aA = aVar.a();
                c0036aA.t = togVar.a;
                c0036aA.u = togVar.b;
                this.p = new b(new androidx.media3.common.a(c0036aA), bVar.b, bVar.c);
            }
        }
    }

    @Override // defpackage.v20
    public final void b(ak3 ak3Var) {
        this.y += ak3Var.g;
        this.z += ak3Var.e;
    }

    @Override // defpackage.v20
    public final void g(PlaybackException playbackException) {
        this.o = playbackException;
    }

    @Override // defpackage.v20
    public final void h(int i) {
        if (i == 1) {
            this.v = true;
        }
        this.l = i;
    }

    @Override // defpackage.v20
    public final void i(nj9 nj9Var) {
        this.w = nj9Var.a;
    }

    @Override // defpackage.v20
    public final void k(int i, long j, v20.a aVar) {
        h.b bVar = aVar.d;
        if (bVar != null) {
            String strC = this.c.c(aVar.b, bVar);
            HashMap<String, Long> map = this.i;
            Long l = map.get(strC);
            HashMap<String, Long> map2 = this.h;
            Long l2 = map2.get(strC);
            map.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // defpackage.v20
    public final void l(v20.a aVar, nj9 nj9Var) {
        h.b bVar = aVar.d;
        if (bVar == null) {
            return;
        }
        androidx.media3.common.a aVar2 = nj9Var.c;
        aVar2.getClass();
        int i = nj9Var.d;
        emf emfVar = aVar.b;
        bVar.getClass();
        b bVar2 = new b(aVar2, i, this.c.c(emfVar, bVar));
        int i2 = nj9Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.q = bVar2;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.r = bVar2;
                return;
            }
        }
        this.p = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05ad A[PHI: r1
  0x05ad: PHI (r1v30 int) = (r1v28 int), (r1v27 int) binds: [B:376:0x05c2, B:366:0x05ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x064f A[ORIG_RETURN, RETURN] */
    @Override // defpackage.v20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.gdb r22, v20.b r23) {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj9.m(gdb, v20$b):void");
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public final boolean o(b bVar) {
        String str;
        if (bVar == null) {
            return false;
        }
        String str2 = bVar.c;
        sp3 sp3Var = this.c;
        synchronized (sp3Var) {
            str = sp3Var.f;
        }
        return str2.equals(str);
    }

    public final void q() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new gj0(2, this, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final LogSessionId r() {
        return this.d.getSessionId();
    }

    @RequiresNonNull({"metricsBuilder"})
    public final void s(emf emfVar, h.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (bVar == null || (iB = emfVar.b(bVar.a)) == -1) {
            return;
        }
        emf.b bVar2 = this.g;
        int i = 0;
        emfVar.f(iB, bVar2, false);
        int i2 = bVar2.c;
        emf.d dVar = this.f;
        emfVar.n(i2, dVar);
        ij9.f fVar = dVar.b.b;
        if (fVar != null) {
            int iH = vjg.H(fVar.a, fVar.b);
            i = iH != 0 ? iH != 1 ? iH != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (dVar.l != -9223372036854775807L && !dVar.j && !dVar.h && !dVar.a()) {
            builder.setMediaDurationMillis(vjg.c0(dVar.l));
        }
        builder.setPlaybackType(dVar.a() ? 2 : 1);
        this.B = true;
    }

    public final void t(v20.a aVar, String str) {
        h.b bVar = aVar.d;
        if (bVar == null || !bVar.b()) {
            q();
            this.j = str;
            this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            s(aVar.b, bVar);
        }
    }

    public final void u(v20.a aVar, String str) {
        h.b bVar = aVar.d;
        if ((bVar == null || !bVar.b()) && str.equals(this.j)) {
            q();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void v(int i, long j, androidx.media3.common.a aVar, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        int i4 = 4;
        if (aVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = aVar.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = aVar.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = aVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = aVar.j;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = aVar.u;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = aVar.v;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = aVar.F;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = aVar.G;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = aVar.d;
            if (str4 != null) {
                String str5 = vjg.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = aVar.y;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new yi0(i4, this, timeSinceCreatedMillis.build()));
    }
}
