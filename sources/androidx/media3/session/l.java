package androidx.media3.session;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.LegacyConversions;
import androidx.media3.session.j;
import androidx.media3.session.l;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaControllerCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.c;
import androidx.media3.session.q;
import defpackage.aae;
import defpackage.aw5;
import defpackage.cdb;
import defpackage.d82;
import defpackage.d9e;
import defpackage.dq2;
import defpackage.dqf;
import defpackage.e47;
import defpackage.ebe;
import defpackage.emf;
import defpackage.g7;
import defpackage.gdb;
import defpackage.ht0;
import defpackage.hz8;
import defpackage.i47;
import defpackage.ij9;
import defpackage.k20;
import defpackage.ka2;
import defpackage.ky0;
import defpackage.l5;
import defpackage.lz8;
import defpackage.nl3;
import defpackage.oj9;
import defpackage.ox0;
import defpackage.q83;
import defpackage.qx0;
import defpackage.qyc;
import defpackage.s34;
import defpackage.tg1;
import defpackage.tog;
import defpackage.u9c;
import defpackage.v8e;
import defpackage.v9e;
import defpackage.vjg;
import defpackage.w8e;
import defpackage.wqf;
import defpackage.x9e;
import defpackage.zkd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class l implements j.b {
    public final v a;
    public final j b;
    public final aae c;
    public final lz8<gdb.c> d;
    public final b e;
    public final tg1 f;
    public final Bundle g;
    public MediaControllerCompat i;
    public MediaBrowserCompat j;
    public boolean k;
    public boolean l;
    public boolean o;
    public d m = new d();
    public d n = new d();
    public c p = new c();
    public final long h = 100;
    public long q = -9223372036854775807L;
    public long r = -9223372036854775807L;

    public class a extends MediaBrowserCompat.b {
        public a() {
        }
    }

    public final class b extends MediaControllerCompat.a {
        public final Handler d;

        public b(Looper looper) {
            this.d = new Handler(looper, new Handler.Callback() { // from class: aj9
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    if (message.what == 1) {
                        l lVar = l.this;
                        lVar.U0(false, lVar.n);
                    }
                    return true;
                }
            });
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void a(MediaControllerCompat.c cVar) {
            l lVar = l.this;
            d dVar = lVar.n;
            lVar.n = new d(cVar, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h);
            o();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void b(boolean z) {
            j jVar = l.this.b;
            jVar.getClass();
            ka2.q(Looper.myLooper() == jVar.e.getLooper());
            q.b bVar = jVar.d;
            new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
            bVar.G(new v8e("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY));
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void c(Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            l lVar = l.this;
            d dVar = lVar.n;
            lVar.n = new d(dVar.a, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, bundle2);
            lVar.o = true;
            o();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void d(MediaMetadataCompat mediaMetadataCompat) {
            l lVar = l.this;
            d dVar = lVar.n;
            lVar.n = new d(dVar.a, dVar.b, mediaMetadataCompat, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h);
            o();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void e(PlaybackStateCompat playbackStateCompat) {
            l lVar = l.this;
            d dVar = lVar.n;
            lVar.n = new d(dVar.a, l.S0(playbackStateCompat), dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h);
            o();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void f(List<MediaSessionCompat.QueueItem> list) {
            l lVar = l.this;
            d dVar = lVar.n;
            lVar.n = new d(dVar.a, dVar.b, dVar.c, l.R0(list), dVar.e, dVar.f, dVar.g, dVar.h);
            o();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void g(CharSequence charSequence) {
            l lVar = l.this;
            d dVar = lVar.n;
            lVar.n = new d(dVar.a, dVar.b, dVar.c, dVar.d, charSequence, dVar.f, dVar.g, dVar.h);
            o();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void h(int i) {
            l lVar = l.this;
            d dVar = lVar.n;
            lVar.n = new d(dVar.a, dVar.b, dVar.c, dVar.d, dVar.e, i, dVar.g, dVar.h);
            o();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void i() {
            l.this.b.T0();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void j(String str, Bundle bundle) {
            if (str == null) {
                return;
            }
            j jVar = l.this.b;
            jVar.getClass();
            ka2.q(Looper.myLooper() == jVar.e.getLooper());
            jVar.d.G(new v8e(str, Bundle.EMPTY));
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void k() {
            int i;
            boolean zO;
            l lVar = l.this;
            if (!lVar.l) {
                lVar.X0();
                return;
            }
            d dVar = lVar.n;
            PlaybackStateCompat playbackStateCompatS0 = l.S0(lVar.i.c());
            androidx.media3.session.legacy.b bVarA = lVar.i.a.e.a();
            int iM = -1;
            if (bVarA != null) {
                try {
                    i = bVarA.i();
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e);
                    i = -1;
                }
            } else {
                i = -1;
            }
            androidx.media3.session.legacy.b bVarA2 = lVar.i.a.e.a();
            if (bVarA2 != null) {
                try {
                    iM = bVarA2.M();
                } catch (RemoteException | SecurityException e2) {
                    Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e2);
                }
            }
            lVar.n = new d(dVar.a, playbackStateCompatS0, dVar.c, dVar.d, dVar.e, i, iM, dVar.h);
            androidx.media3.session.legacy.b bVarA3 = lVar.i.a.e.a();
            if (bVarA3 != null) {
                try {
                    zO = bVarA3.O();
                } catch (RemoteException | SecurityException e3) {
                    Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e3);
                    zO = false;
                }
            } else {
                zO = false;
            }
            b(zO);
            this.d.removeMessages(1);
            lVar.U0(false, lVar.n);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.a
        public final void l(int i) {
            l lVar = l.this;
            d dVar = lVar.n;
            lVar.n = new d(dVar.a, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, i, dVar.h);
            o();
        }

        public final void o() {
            Handler handler = this.d;
            if (handler.hasMessages(1)) {
                return;
            }
            handler.sendEmptyMessageDelayed(1, l.this.h);
        }
    }

    public l(v vVar, j jVar, aae aaeVar, Bundle bundle, Looper looper, tg1 tg1Var) {
        this.d = new lz8<>(looper, d82.a, new k20(this, 12));
        this.a = vVar;
        this.b = jVar;
        this.e = new b(looper);
        this.c = aaeVar;
        this.g = bundle;
        this.f = tg1Var;
        qyc qycVar = qyc.e;
    }

    public static List<MediaSessionCompat.QueueItem> R0(List<MediaSessionCompat.QueueItem> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        c.a aVar = y.a;
        ArrayList arrayList = new ArrayList();
        for (MediaSessionCompat.QueueItem queueItem : list) {
            if (queueItem != null) {
                arrayList.add(queueItem);
            }
        }
        return arrayList;
    }

    public static PlaybackStateCompat S0(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return null;
        }
        if (playbackStateCompat.d > 0.0f) {
            return playbackStateCompat;
        }
        zkd.T("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j = playbackStateCompat.c;
        long j2 = playbackStateCompat.e;
        int i = playbackStateCompat.f;
        CharSequence charSequence = playbackStateCompat.V;
        List<PlaybackStateCompat.CustomAction> list = playbackStateCompat.X;
        if (list != null) {
            arrayList.addAll(list);
        }
        return new PlaybackStateCompat(playbackStateCompat.a, playbackStateCompat.b, j, 1.0f, j2, i, charSequence, playbackStateCompat.W, arrayList, playbackStateCompat.Y, playbackStateCompat.Z);
    }

    public static gdb.d T0(int i, ij9 ij9Var, long j, boolean z) {
        return new gdb.d(null, i, ij9Var, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    @Override // androidx.media3.session.j.b
    public final void A(boolean z) {
        z zVar = this.p.a;
        if (zVar.t == z) {
            return;
        }
        this.q = y.c(zVar, this.q, this.r, this.b.f);
        this.r = SystemClock.elapsedRealtime();
        z zVarD = this.p.a.d(1, 0, z);
        c cVar = this.p;
        a1(new c(zVarD, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        if (!W0() || this.p.a.j.p()) {
            return;
        }
        MediaControllerCompat mediaControllerCompat = this.i;
        if (z) {
            mediaControllerCompat.d().a.play();
        } else {
            mediaControllerCompat.d().a.pause();
        }
    }

    @Override // androidx.media3.session.j.b
    public final void A0(int i, int i2, int i3) {
        ka2.l(i >= 0 && i <= i2 && i3 >= 0);
        u9c u9cVar = (u9c) this.p.a.j;
        int iO = u9cVar.o();
        int iMin = Math.min(i2, iO);
        int i4 = iMin - i;
        int i5 = iO - i4;
        int i6 = i5 - 1;
        int iMin2 = Math.min(i3, i5);
        if (i >= iO || i == iMin || i == iMin2) {
            return;
        }
        int iV0 = v0();
        if (iV0 >= i) {
            iV0 = iV0 < iMin ? -1 : iV0 - i4;
        }
        if (iV0 == -1) {
            iV0 = vjg.i(i, 0, i6);
            zkd.T("MCImplLegacy", "Currently playing item will be removed and added back to mimic move. Assumes item at " + iV0 + " would be the new current item");
        }
        if (iV0 >= iMin2) {
            iV0 += i4;
        }
        ArrayList arrayList = new ArrayList(u9cVar.e);
        vjg.N(i, iMin, iMin2, arrayList);
        z zVarM = this.p.a.m(new u9c(e47.j(arrayList), u9cVar.f), iV0);
        c cVar = this.p;
        a1(new c(zVarM, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        if (W0()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < i4; i7++) {
                arrayList2.add(this.m.d.get(i));
                this.i.e(this.m.d.get(i).a);
            }
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                this.i.a(((MediaSessionCompat.QueueItem) arrayList2.get(i8)).a, i8 + iMin2);
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void B() {
        this.i.d().a.skipToNext();
    }

    @Override // androidx.media3.session.j.b
    public final void B0(List<ij9> list) {
        q0(Integer.MAX_VALUE, list);
    }

    @Override // androidx.media3.session.j.b
    public final void C(int i) {
        int iS = S() - 1;
        if (iS >= g0().b) {
            z zVarC = this.p.a.c(iS, C0());
            c cVar = this.p;
            a1(new c(zVarC, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        }
        this.i.a.a.adjustVolume(-1, i);
    }

    @Override // androidx.media3.session.j.b
    public final boolean C0() {
        z zVar = this.p.a;
        if (zVar.q.a == 1) {
            return zVar.s;
        }
        MediaControllerCompat mediaControllerCompat = this.i;
        if (mediaControllerCompat == null) {
            return false;
        }
        MediaControllerCompat.c cVarB = mediaControllerCompat.b();
        i47<String> i47Var = LegacyConversions.a;
        return cVarB != null && cVarB.e == 0;
    }

    @Override // androidx.media3.session.j.b
    public final wqf D() {
        return wqf.b;
    }

    @Override // androidx.media3.session.j.b
    public final boolean D0() {
        return this.p.a.i;
    }

    @Override // androidx.media3.session.j.b
    public final q83 E() {
        zkd.T("MCImplLegacy", "Session doesn't support getting Cue");
        return q83.d;
    }

    @Override // androidx.media3.session.j.b
    public final long E0() {
        return r0();
    }

    @Override // androidx.media3.session.j.b
    public final void F(ox0 ox0Var, boolean z) {
        zkd.T("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // androidx.media3.session.j.b
    @Deprecated
    public final void F0(int i) {
        h0(i, 1);
    }

    @Override // androidx.media3.session.j.b
    public final void G(oj9 oj9Var) {
        zkd.T("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override // androidx.media3.session.j.b
    public final void G0() {
        this.i.d().a.fastForward();
    }

    @Override // androidx.media3.session.j.b
    public final int H() {
        return -1;
    }

    @Override // androidx.media3.session.j.b
    public final void H0() {
        this.i.d().a.rewind();
    }

    @Override // androidx.media3.session.j.b
    @Deprecated
    public final void I(boolean z) {
        r(1, z);
    }

    @Override // androidx.media3.session.j.b
    public final oj9 I0() {
        ij9 ij9VarS = this.p.a.s();
        return ij9VarS == null ? oj9.K : ij9VarS.d;
    }

    @Override // androidx.media3.session.j.b
    public final void J(ij9 ij9Var) {
        m(ij9Var, -9223372036854775807L);
    }

    @Override // androidx.media3.session.j.b
    public final void J0(List list) {
        l0(list, 0, -9223372036854775807L);
    }

    @Override // androidx.media3.session.j.b
    public final void K(List list, int i, int i2) {
        ka2.l(i >= 0 && i <= i2);
        int iO = ((u9c) this.p.a.j).o();
        if (i > iO) {
            return;
        }
        int iMin = Math.min(i2, iO);
        q0(iMin, list);
        y(i, iMin);
    }

    @Override // androidx.media3.session.j.b
    public final long K0() {
        long jC = y.c(this.p.a, this.q, this.r, this.b.f);
        this.q = jC;
        return jC;
    }

    @Override // androidx.media3.session.j.b
    public final int L() {
        return 0;
    }

    @Override // androidx.media3.session.j.b
    public final long L0() {
        return this.p.a.A;
    }

    @Override // androidx.media3.session.j.b
    public final emf M() {
        return this.p.a.j;
    }

    @Override // androidx.media3.session.j.b
    public final w8e M0() {
        return this.p.b;
    }

    @Override // androidx.media3.session.j.b
    public final void N(int i, ij9 ij9Var) {
        K(e47.n(ij9Var), i, i + 1);
    }

    @Override // androidx.media3.session.j.b
    public final e47<androidx.media3.session.a> N0() {
        return this.p.d;
    }

    @Override // androidx.media3.session.j.b
    @Deprecated
    public final void O() {
        t(1);
    }

    @Override // androidx.media3.session.j.b
    public final Bundle O0() {
        return this.g;
    }

    @Override // androidx.media3.session.j.b
    public final dqf P() {
        return dqf.F;
    }

    @Override // androidx.media3.session.j.b
    public final hz8 P0(v8e v8eVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean zContains = this.p.b.a.contains(v8eVar);
        String str = v8eVar.b;
        if (zContains) {
            this.i.d().a(str, bundle);
            return aw5.K1(new x9e(0));
        }
        final ebe ebeVar = new ebe();
        final Handler handler = this.b.e;
        ResultReceiver resultReceiver = new ResultReceiver(handler) { // from class: androidx.media3.session.MediaControllerImplLegacy$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle2) {
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                ebeVar.l(new x9e(i, bundle2));
            }
        };
        MediaControllerCompat mediaControllerCompat = this.i;
        mediaControllerCompat.getClass();
        if (TextUtils.isEmpty(str)) {
            l5.q("command must neither be null nor empty");
            return null;
        }
        mediaControllerCompat.a.a.sendCommand(str, bundle, resultReceiver);
        return ebeVar;
    }

    @Override // androidx.media3.session.j.b
    public final void Q() {
        this.i.d().a.skipToNext();
    }

    public final void Q0(final int i, final List list) {
        final ArrayList arrayList = new ArrayList();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Runnable runnable = new Runnable() { // from class: zi9
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap;
                int iIncrementAndGet = atomicInteger.incrementAndGet();
                List list2 = list;
                if (iIncrementAndGet != list2.size()) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = arrayList;
                    if (i2 >= arrayList2.size()) {
                        return;
                    }
                    hz8 hz8Var = (hz8) arrayList2.get(i2);
                    if (hz8Var != null) {
                        try {
                            bitmap = (Bitmap) aw5.J1(hz8Var);
                        } catch (CancellationException | ExecutionException e) {
                            zkd.v("MCImplLegacy", "Failed to get bitmap", e);
                            bitmap = null;
                        }
                    } else {
                        bitmap = null;
                    }
                    this.a.i.a(LegacyConversions.i((ij9) list2.get(i2), bitmap), i + i2);
                    i2++;
                }
            }
        };
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = ((ij9) list.get(i2)).d.k;
            if (bArr == null) {
                arrayList.add(null);
                runnable.run();
            } else {
                hz8<Bitmap> hz8VarC = this.f.c(bArr);
                arrayList.add(hz8VarC);
                Handler handler = this.b.e;
                Objects.requireNonNull(handler);
                hz8VarC.a(runnable, new nl3(handler));
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void R(TextureView textureView) {
        zkd.T("MCImplLegacy", "Session doesn't support setting TextureView");
    }

    @Override // androidx.media3.session.j.b
    public final int S() {
        z zVar = this.p.a;
        if (zVar.q.a == 1) {
            return zVar.r;
        }
        MediaControllerCompat mediaControllerCompat = this.i;
        if (mediaControllerCompat == null) {
            return 0;
        }
        MediaControllerCompat.c cVarB = mediaControllerCompat.b();
        i47<String> i47Var = LegacyConversions.a;
        if (cVarB == null) {
            return 0;
        }
        return cVarB.e;
    }

    @Override // androidx.media3.session.j.b
    public final long T() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.session.j.b
    public final void U(int i, long j) {
        Y0(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041c A[LOOP:2: B:208:0x0418->B:210:0x041c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0613 A[PHI: r29
  0x0613: PHI (r29v10 cdb) = (r29v9 cdb), (r29v11 cdb) binds: [B:308:0x0618, B:305:0x0611] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0738 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x05d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0777 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:411:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5 A[PHI: r4
  0x01c5: PHI (r4v11 int) = (r4v10 int), (r4v20 int) binds: [B:79:0x017f, B:89:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(boolean r81, androidx.media3.session.l.d r82) {
        /*
            Method dump skipped, instruction units count: 2126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.l.U0(boolean, androidx.media3.session.l$d):void");
    }

    @Override // androidx.media3.session.j.b
    public final gdb.a V() {
        return this.p.c;
    }

    public final void V0() {
        emf.d dVar = new emf.d();
        ka2.q(W0() && !this.p.a.j.p());
        z zVar = this.p.a;
        u9c u9cVar = (u9c) zVar.j;
        int i = zVar.c.a.b;
        u9cVar.m(i, dVar, 0L);
        ij9 ij9Var = dVar.b;
        if (u9cVar.r(i) != -1) {
            boolean z = this.p.a.t;
            MediaControllerCompat mediaControllerCompat = this.i;
            if (z) {
                mediaControllerCompat.d().a.play();
            } else {
                mediaControllerCompat.d().a.prepare();
            }
        } else {
            ij9.g gVar = ij9Var.f;
            String str = ij9Var.a;
            if (gVar.a != null) {
                boolean z2 = this.p.a.t;
                MediaControllerCompat mediaControllerCompat2 = this.i;
                if (z2) {
                    MediaControllerCompat.g gVarD = mediaControllerCompat2.d();
                    Uri uri = gVar.a;
                    Bundle bundle = gVar.c;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    gVarD.a.playFromUri(uri, bundle);
                } else {
                    MediaControllerCompat.g gVarD2 = mediaControllerCompat2.d();
                    Uri uri2 = gVar.a;
                    Bundle bundle2 = gVar.c;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    gVarD2.a.prepareFromUri(uri2, bundle2);
                }
            } else {
                String str2 = gVar.b;
                c cVar = this.p;
                if (str2 != null) {
                    boolean z3 = cVar.a.t;
                    MediaControllerCompat mediaControllerCompat3 = this.i;
                    if (z3) {
                        MediaControllerCompat.g gVarD3 = mediaControllerCompat3.d();
                        String str3 = gVar.b;
                        Bundle bundle3 = gVar.c;
                        if (bundle3 == null) {
                            bundle3 = Bundle.EMPTY;
                        }
                        gVarD3.a.playFromSearch(str3, bundle3);
                    } else {
                        MediaControllerCompat.g gVarD4 = mediaControllerCompat3.d();
                        String str4 = gVar.b;
                        Bundle bundle4 = gVar.c;
                        if (bundle4 == null) {
                            bundle4 = Bundle.EMPTY;
                        }
                        gVarD4.a.prepareFromSearch(str4, bundle4);
                    }
                } else {
                    boolean z4 = cVar.a.t;
                    MediaControllerCompat mediaControllerCompat4 = this.i;
                    if (z4) {
                        MediaControllerCompat.g gVarD5 = mediaControllerCompat4.d();
                        Bundle bundle5 = gVar.c;
                        if (bundle5 == null) {
                            bundle5 = Bundle.EMPTY;
                        }
                        gVarD5.a.playFromMediaId(str, bundle5);
                    } else {
                        MediaControllerCompat.g gVarD6 = mediaControllerCompat4.d();
                        Bundle bundle6 = gVar.c;
                        if (bundle6 == null) {
                            bundle6 = Bundle.EMPTY;
                        }
                        gVarD6.a.prepareFromMediaId(str, bundle6);
                    }
                }
            }
        }
        if (this.p.a.c.a.f != 0) {
            this.i.d().a.seekTo(this.p.a.c.a.f);
        }
        if (this.p.c.a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < u9cVar.o(); i2++) {
                if (i2 != i && u9cVar.r(i2) == -1) {
                    u9cVar.m(i2, dVar, 0L);
                    arrayList.add(dVar.b);
                }
            }
            Q0(0, arrayList);
        }
    }

    @Override // androidx.media3.session.j.b
    public final boolean W() {
        return this.p.a.t;
    }

    public final boolean W0() {
        return this.p.a.y != 1;
    }

    @Override // androidx.media3.session.j.b
    public final void X(boolean z) {
        if (z != D0()) {
            z zVarK = this.p.a.k(z);
            c cVar = this.p;
            a1(new c(zVarK, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        }
        MediaControllerCompat.g gVarD = this.i.d();
        i47<String> i47Var = LegacyConversions.a;
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", z ? 1 : 0);
        gVarD.a("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
    }

    public final void X0() {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        int i;
        int iM;
        if (this.k || this.l) {
            return;
        }
        this.l = true;
        MediaControllerCompat.c cVarB = this.i.b();
        PlaybackStateCompat playbackStateCompatS0 = S0(this.i.c());
        MediaMetadata metadata = this.i.a.a.getMetadata();
        if (metadata != null) {
            ht0<String, Integer> ht0Var = MediaMetadataCompat.c;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.b = metadata;
        } else {
            mediaMetadataCompatCreateFromParcel = null;
        }
        List<MediaSession.QueueItem> queue = this.i.a.a.getQueue();
        List<MediaSessionCompat.QueueItem> listR0 = R0(queue != null ? MediaSessionCompat.QueueItem.a(queue) : null);
        CharSequence queueTitle = this.i.a.a.getQueueTitle();
        androidx.media3.session.legacy.b bVarA = this.i.a.e.a();
        int i2 = -1;
        if (bVarA != null) {
            try {
                i = -1;
                i2 = bVarA.i();
            } catch (RemoteException | SecurityException e) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e);
                i = -1;
            }
        } else {
            i = -1;
        }
        androidx.media3.session.legacy.b bVarA2 = this.i.a.e.a();
        if (bVarA2 != null) {
            try {
                iM = bVarA2.M();
            } catch (RemoteException | SecurityException e2) {
                Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e2);
                iM = i;
            }
        } else {
            iM = i;
        }
        U0(true, new d(cVarB, playbackStateCompatS0, mediaMetadataCompatCreateFromParcel, listR0, queueTitle, i2, iM, this.i.a.a.getExtras()));
    }

    @Override // androidx.media3.session.j.b
    public final long Y() {
        return this.p.a.C;
    }

    public final void Y0(int i, long j) {
        Integer num;
        Integer num2;
        int i2;
        long j2;
        long j3;
        long j4;
        int i3 = i;
        long j5 = j;
        ka2.l(i3 >= 0);
        int iV0 = v0();
        emf emfVar = this.p.a.j;
        if ((emfVar.p() || i3 < emfVar.o()) && !k()) {
            if (i3 != iV0) {
                long jR = ((u9c) this.p.a.j).r(i3);
                if (jR != -1) {
                    this.i.d().a.skipToQueueItem(jR);
                    num = 2;
                } else {
                    g7.j(i3, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", "MCImplLegacy");
                    i3 = iV0;
                    num = null;
                }
            } else {
                i3 = iV0;
                num = null;
            }
            long jK0 = K0();
            if (j5 == -9223372036854775807L) {
                j5 = jK0;
                num2 = null;
            } else {
                this.i.d().a.seekTo(j5);
                num2 = 1;
            }
            if (num == null) {
                long jR0 = r0();
                long duration = getDuration();
                long jMax = j5 < jK0 ? j5 : Math.max(j5, jR0);
                j2 = jMax;
                i2 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j3 = jMax - j5;
                j4 = duration;
            } else {
                i2 = 0;
                j2 = 0;
                j3 = 0;
                j4 = -9223372036854775807L;
            }
            z zVarJ = this.p.a.j(new v9e(T0(i3, !emfVar.p() ? emfVar.m(i3, new emf.d(), 0L).b : null, j5, false), false, SystemClock.elapsedRealtime(), j4, j2, i2, j3, -9223372036854775807L, j4, j2));
            if (zVarJ.y != 1) {
                zVarJ = zVarJ.f(2, null);
            }
            z zVar = zVarJ;
            c cVar = this.p;
            a1(new c(zVar, cVar.b, cVar.c, cVar.d, cVar.e, null), num2, num);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void Z(gdb.c cVar) {
        this.d.a(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z0(boolean r18, androidx.media3.session.l.d r19, boolean r20, final androidx.media3.session.l.c r21, final java.lang.Integer r22, java.lang.Integer r23) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.l.Z0(boolean, androidx.media3.session.l$d, boolean, androidx.media3.session.l$c, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // androidx.media3.session.j.b
    public final PlaybackException a() {
        return this.p.a.a;
    }

    @Override // androidx.media3.session.j.b
    public final long a0() {
        return getDuration();
    }

    public final void a1(c cVar, Integer num, Integer num2) {
        Z0(false, this.m, false, cVar, num, num2);
    }

    @Override // androidx.media3.session.j.b
    public final int b() {
        return this.p.a.y;
    }

    @Override // androidx.media3.session.j.b
    public final int b0() {
        return v0();
    }

    @Override // androidx.media3.session.j.b
    public final void c() {
        A(false);
    }

    @Override // androidx.media3.session.j.b
    public final void c0(TextureView textureView) {
        zkd.T("MCImplLegacy", "Session doesn't support clearing TextureView");
    }

    @Override // androidx.media3.session.j.b
    public final boolean d() {
        return false;
    }

    @Override // androidx.media3.session.j.b
    public final tog d0() {
        zkd.T("MCImplLegacy", "Session doesn't support getting VideoSize");
        return tog.d;
    }

    @Override // androidx.media3.session.j.b
    public final cdb e() {
        return this.p.a.g;
    }

    @Override // androidx.media3.session.j.b
    public final float e0() {
        return 1.0f;
    }

    @Override // androidx.media3.session.j.b
    public final void f() {
        z zVar = this.p.a;
        if (zVar.y != 1) {
            return;
        }
        z zVarF = zVar.f(zVar.j.p() ? 4 : 2, null);
        c cVar = this.p;
        a1(new c(zVarF, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        if (this.p.a.j.p()) {
            return;
        }
        V0();
    }

    @Override // androidx.media3.session.j.b
    public final ox0 f0() {
        return this.p.a.o;
    }

    @Override // androidx.media3.session.j.b
    public final void g(cdb cdbVar) {
        if (!cdbVar.equals(e())) {
            z zVarE = this.p.a.e(cdbVar);
            c cVar = this.p;
            a1(new c(zVarE, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        }
        this.i.d().b(cdbVar.a);
    }

    @Override // androidx.media3.session.j.b
    public final s34 g0() {
        return this.p.a.q;
    }

    @Override // androidx.media3.session.j.b
    public final long getDuration() {
        return this.p.a.c.d;
    }

    @Override // androidx.media3.session.j.b
    public final void h(float f) {
        if (f != e().a) {
            z zVarE = this.p.a.e(new cdb(f));
            c cVar = this.p;
            a1(new c(zVarE, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        }
        this.i.d().b(f);
    }

    @Override // androidx.media3.session.j.b
    public final void h0(int i, int i2) {
        s34 s34VarG0 = g0();
        int i3 = s34VarG0.b;
        int i4 = s34VarG0.c;
        if (i3 <= i && (i4 == 0 || i <= i4)) {
            z zVarC = this.p.a.c(i, C0());
            c cVar = this.p;
            a1(new c(zVarC, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        }
        this.i.a.a.setVolumeTo(i, i2);
    }

    @Override // androidx.media3.session.j.b
    public final int i() {
        return this.p.a.h;
    }

    @Override // androidx.media3.session.j.b
    public final int i0() {
        return -1;
    }

    @Override // androidx.media3.session.j.b
    public final void j(Surface surface) {
        zkd.T("MCImplLegacy", "Session doesn't support setting Surface");
    }

    @Override // androidx.media3.session.j.b
    public final void j0(long j) {
        Y0(v0(), j);
    }

    @Override // androidx.media3.session.j.b
    public final boolean k() {
        return this.p.a.c.b;
    }

    @Override // androidx.media3.session.j.b
    public final void k0(float f) {
        zkd.T("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override // androidx.media3.session.j.b
    public final long l() {
        return this.p.a.c.g;
    }

    @Override // androidx.media3.session.j.b
    public final void l0(List<ij9> list, int i, long j) {
        if (list.isEmpty()) {
            n();
            return;
        }
        z zVarN = this.p.a.n(u9c.g.q(0, list), new v9e(T0(i, list.get(i), j == -9223372036854775807L ? 0L : j, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        c cVar = this.p;
        a1(new c(zVarN, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        if (W0()) {
            V0();
        }
    }

    @Override // androidx.media3.session.j.b
    public final void m(ij9 ij9Var, long j) {
        l0(e47.n(ij9Var), 0, j);
    }

    @Override // androidx.media3.session.j.b
    public final void m0(int i) {
        Y0(i, 0L);
    }

    @Override // androidx.media3.session.j.b
    public final void n() {
        y(0, Integer.MAX_VALUE);
    }

    @Override // androidx.media3.session.j.b
    public final long n0() {
        return this.p.a.B;
    }

    @Override // androidx.media3.session.j.b
    public final int o() {
        return this.p.a.c.f;
    }

    @Override // androidx.media3.session.j.b
    public final boolean o0() {
        return this.l;
    }

    @Override // androidx.media3.session.j.b
    public final void p() {
        this.i.d().a.skipToPrevious();
    }

    @Override // androidx.media3.session.j.b
    public final long p0() {
        return K0();
    }

    @Override // androidx.media3.session.j.b
    public final void q() {
        Y0(v0(), 0L);
    }

    @Override // androidx.media3.session.j.b
    public final void q0(int i, List<ij9> list) {
        ka2.l(i >= 0);
        if (list.isEmpty()) {
            return;
        }
        u9c u9cVar = (u9c) this.p.a.j;
        if (u9cVar.p()) {
            l0(list, 0, -9223372036854775807L);
            return;
        }
        int iMin = Math.min(i, M().o());
        u9c u9cVarQ = u9cVar.q(iMin, list);
        int iV0 = v0();
        int size = list.size();
        if (iV0 >= iMin) {
            iV0 += size;
        }
        z zVarM = this.p.a.m(u9cVarQ, iV0);
        c cVar = this.p;
        a1(new c(zVarM, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        if (W0()) {
            Q0(iMin, list);
        }
    }

    @Override // androidx.media3.session.j.b
    public final void r(int i, boolean z) {
        if (z != C0()) {
            z zVarC = this.p.a.c(S(), z);
            c cVar = this.p;
            a1(new c(zVarC, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        }
        this.i.a.a.adjustVolume(z ? -100 : 100, i);
    }

    @Override // androidx.media3.session.j.b
    public final long r0() {
        return this.p.a.c.e;
    }

    @Override // androidx.media3.session.j.b
    public final void release() {
        Messenger messenger;
        if (this.k) {
            return;
        }
        this.k = true;
        MediaBrowserCompat mediaBrowserCompat = this.j;
        if (mediaBrowserCompat != null) {
            MediaBrowserCompat.e eVar = mediaBrowserCompat.a;
            MediaBrowserCompat.g gVar = eVar.f;
            if (gVar != null && (messenger = eVar.g) != null) {
                try {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 7;
                    messageObtain.arg1 = 1;
                    messageObtain.replyTo = messenger;
                    gVar.a.send(messageObtain);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            eVar.b.disconnect();
            this.j = null;
        }
        MediaControllerCompat mediaControllerCompat = this.i;
        if (mediaControllerCompat != null) {
            Set<MediaControllerCompat.a> set = mediaControllerCompat.b;
            b bVar = this.e;
            if (set.remove(bVar)) {
                try {
                    mediaControllerCompat.a.b(bVar);
                } finally {
                    bVar.n(null);
                }
            } else {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            bVar.d.removeCallbacksAndMessages(null);
            this.i = null;
        }
        this.l = false;
        this.d.d();
    }

    @Override // androidx.media3.session.j.b
    @Deprecated
    public final void s() {
        C(1);
    }

    @Override // androidx.media3.session.j.b
    public final oj9 s0() {
        return this.p.a.m;
    }

    @Override // androidx.media3.session.j.b
    public final void stop() {
        z zVar = this.p.a;
        if (zVar.y == 1) {
            return;
        }
        v9e v9eVar = zVar.c;
        gdb.d dVar = v9eVar.a;
        long j = v9eVar.d;
        long j2 = dVar.f;
        z zVarJ = zVar.j(new v9e(dVar, false, SystemClock.elapsedRealtime(), j, j2, y.b(j2, j), 0L, -9223372036854775807L, j, j2));
        z zVar2 = this.p.a;
        if (zVar2.y != 1) {
            zVarJ = zVarJ.f(1, zVar2.a);
        }
        z zVar3 = zVarJ;
        c cVar = this.p;
        a1(new c(zVar3, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        this.i.d().a.stop();
    }

    @Override // androidx.media3.session.j.b
    public final void t(int i) {
        int iS = S();
        int i2 = g0().c;
        if (i2 == 0 || iS + 1 <= i2) {
            z zVarC = this.p.a.c(iS + 1, C0());
            c cVar = this.p;
            a1(new c(zVarC, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        }
        this.i.a.a.adjustVolume(1, i);
    }

    @Override // androidx.media3.session.j.b
    public final boolean t0() {
        return this.p.a.v;
    }

    @Override // androidx.media3.session.j.b
    public final void u(SurfaceView surfaceView) {
        zkd.T("MCImplLegacy", "Session doesn't support setting SurfaceView");
    }

    @Override // androidx.media3.session.j.b
    public final void u0() {
        A(true);
    }

    @Override // androidx.media3.session.j.b
    public final void v(dqf dqfVar) {
    }

    @Override // androidx.media3.session.j.b
    public final int v0() {
        return this.p.a.c.a.b;
    }

    @Override // androidx.media3.session.j.b
    public final void w(int i) {
        y(i, i + 1);
    }

    @Override // androidx.media3.session.j.b
    public final void w0(int i) {
        if (i != i()) {
            z zVarI = this.p.a.i(i);
            c cVar = this.p;
            a1(new c(zVarI, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        }
        MediaControllerCompat.g gVarD = this.i.d();
        int iP = LegacyConversions.p(i);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", iP);
        gVarD.a("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
    }

    @Override // androidx.media3.session.j.b
    public final void x() {
        aae aaeVar = this.c;
        int type = aaeVar.a.getType();
        j jVar = this.b;
        if (type != 0) {
            jVar.U0(new qx0(this, 8));
            return;
        }
        Object objB = aaeVar.a.b();
        ka2.r(objB);
        int i = 3;
        jVar.U0(new ky0(i, this, (MediaSessionCompat.Token) objB));
        jVar.e.postDelayed(new dq2(this, i), 500L);
    }

    @Override // androidx.media3.session.j.b
    public final void x0(gdb.c cVar) {
        this.d.e(cVar);
    }

    @Override // androidx.media3.session.j.b
    public final void y(int i, int i2) {
        ka2.l(i >= 0 && i2 >= i);
        int iO = M().o();
        int iMin = Math.min(i2, iO);
        if (i >= iO || i == iMin) {
            return;
        }
        u9c u9cVar = (u9c) this.p.a.j;
        u9cVar.getClass();
        e47.a aVar = new e47.a();
        e47<u9c.a> e47Var = u9cVar.e;
        aVar.d(e47Var.subList(0, i));
        aVar.d(e47Var.subList(iMin, e47Var.size()));
        u9c u9cVar2 = new u9c(aVar.f(), u9cVar.f);
        int iV0 = v0();
        int i3 = iMin - i;
        if (iV0 >= i) {
            iV0 = iV0 < iMin ? -1 : iV0 - i3;
        }
        if (iV0 == -1) {
            iV0 = vjg.i(i, 0, u9cVar2.o() - 1);
            zkd.T("MCImplLegacy", "Currently playing item is removed. Assumes item at " + iV0 + " is the new current item");
        }
        z zVarM = this.p.a.m(u9cVar2, iV0);
        c cVar = this.p;
        a1(new c(zVarM, cVar.b, cVar.c, cVar.d, cVar.e, null), null, null);
        if (W0()) {
            while (i < iMin && i < this.m.d.size()) {
                this.i.e(this.m.d.get(i).a);
                i++;
            }
        }
    }

    @Override // androidx.media3.session.j.b
    public final void y0(SurfaceView surfaceView) {
        zkd.T("MCImplLegacy", "Session doesn't support clearing SurfaceView");
    }

    @Override // androidx.media3.session.j.b
    public final void z() {
        this.i.d().a.skipToPrevious();
    }

    @Override // androidx.media3.session.j.b
    public final void z0(int i, int i2) {
        A0(i, i + 1, i2);
    }

    public static class c {
        public final z a;
        public final w8e b;
        public final gdb.a c;
        public final e47<androidx.media3.session.a> d;
        public final Bundle e;
        public final d9e f;

        public c() {
            this.a = z.F.l(u9c.g);
            this.b = w8e.b;
            this.c = gdb.a.b;
            this.d = qyc.e;
            this.e = Bundle.EMPTY;
            this.f = null;
        }

        public c(z zVar, w8e w8eVar, gdb.a aVar, e47<androidx.media3.session.a> e47Var, Bundle bundle, d9e d9eVar) {
            this.a = zVar;
            this.b = w8eVar;
            this.c = aVar;
            this.d = e47Var;
            this.e = bundle == null ? Bundle.EMPTY : bundle;
            this.f = d9eVar;
        }
    }

    public static final class d {
        public final MediaControllerCompat.c a;
        public final PlaybackStateCompat b;
        public final MediaMetadataCompat c;
        public final List<MediaSessionCompat.QueueItem> d;
        public final CharSequence e;
        public final int f;
        public final int g;
        public final Bundle h;

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
        }

        public d(MediaControllerCompat.c cVar, PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat, List<MediaSessionCompat.QueueItem> list, CharSequence charSequence, int i, int i2, Bundle bundle) {
            this.a = cVar;
            this.b = playbackStateCompat;
            this.c = mediaMetadataCompat;
            list.getClass();
            this.d = list;
            this.e = charSequence;
            this.f = i;
            this.g = i2;
            this.h = bundle == null ? Bundle.EMPTY : bundle;
        }

        public d() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = Collections.EMPTY_LIST;
            this.e = null;
            this.f = 0;
            this.g = 0;
            this.h = Bundle.EMPTY;
        }
    }
}
