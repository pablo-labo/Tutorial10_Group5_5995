package expo.modules.video.player;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.h;
import androidx.media3.ui.PlayerView;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.a74;
import defpackage.adb;
import defpackage.ba6;
import defpackage.c00;
import defpackage.c1f;
import defpackage.cdb;
import defpackage.d49;
import defpackage.ddb;
import defpackage.dqf;
import defpackage.e13;
import defpackage.e47;
import defpackage.edb;
import defpackage.emf;
import defpackage.eq3;
import defpackage.eu2;
import defpackage.fwc;
import defpackage.fze;
import defpackage.gdb;
import defpackage.gg5;
import defpackage.gk0;
import defpackage.hog;
import defpackage.hr3;
import defpackage.i07;
import defpackage.i45;
import defpackage.ij9;
import defpackage.ir;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.jj9;
import defpackage.ka2;
import defpackage.kh;
import defpackage.l45;
import defpackage.log;
import defpackage.lu2;
import defpackage.m89;
import defpackage.ma;
import defpackage.mh;
import defpackage.mog;
import defpackage.nj7;
import defpackage.nog;
import defpackage.o39;
import defpackage.o91;
import defpackage.oj7;
import defpackage.oog;
import defpackage.pa;
import defpackage.pyd;
import defpackage.q83;
import defpackage.qf8;
import defpackage.r40;
import defpackage.r6;
import defpackage.r7d;
import defpackage.sn2;
import defpackage.st9;
import defpackage.u63;
import defpackage.uh3;
import defpackage.v20;
import defpackage.vjg;
import defpackage.vx0;
import defpackage.w3a;
import defpackage.w91;
import defpackage.w92;
import defpackage.wl7;
import defpackage.wqf;
import defpackage.xd;
import defpackage.yng;
import defpackage.yp3;
import defpackage.z92;
import defpackage.zkd;
import defpackage.zr4;
import defpackage.zx0;
import expo.modules.kotlin.exception.Exceptions$AppContextLost;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.player.a;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.BufferOptions;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSize;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lexpo/modules/video/player/VideoPlayer;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Loj7;", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoPlayer extends SharedObject implements AutoCloseable, oj7 {
    public static final /* synthetic */ qf8<Object>[] w0;
    public final oog V;
    public final hog W;
    public final androidx.media3.exoplayer.d X;
    public final edb Y;
    public final nj7 Z;
    public boolean a0;
    public final i07 b0;
    public final Context c;
    public VideoSource c0;
    public final ArrayList d;
    public final i07 d0;
    public final c00 e;
    public float e0;
    public final nog f;
    public PlayerStatus f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public boolean l0;
    public final i07 m0;
    public final i07 n0;
    public final i07 o0;
    public BufferOptions p0;
    public AudioMixingMode q0;
    public boolean r0;
    public VideoTrack s0;
    public List<VideoTrack> t0;
    public final log u0;
    public final e v0;

    @uh3(c = "expo.modules.video.player.VideoPlayer$1", f = "VideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return VideoPlayer.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            VideoPlayer.this.V.b(false);
            return j6g.a;
        }
    }

    public static final class b implements v20 {
        public b() {
        }

        @Override // defpackage.v20
        public final void j(v20.a aVar, androidx.media3.common.a aVar2) {
            Object obj;
            aVar2.getClass();
            VideoPlayer videoPlayer = VideoPlayer.this;
            Iterator<T> it = videoPlayer.t0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                androidx.media3.common.a format = ((VideoTrack) next).getFormat();
                if (wl7.b(format != null ? format.a : null, aVar2.a)) {
                    obj = next;
                    break;
                }
            }
            VideoTrack videoTrack = (VideoTrack) obj;
            VideoTrack videoTrack2 = videoPlayer.s0;
            videoPlayer.s0 = videoTrack;
            videoPlayer.s0(new a.q(videoTrack, videoTrack2));
        }
    }

    @uh3(c = "expo.modules.video.player.VideoPlayer$close$1", f = "VideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return VideoPlayer.this.new c(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            String str;
            boolean zC;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            VideoPlayer videoPlayer = VideoPlayer.this;
            videoPlayer.X.x0(videoPlayer.v0);
            androidx.media3.exoplayer.d dVar = VideoPlayer.this.X;
            dVar.getClass();
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(dVar)));
            sb.append(" [AndroidXMedia3/1.8.0] [");
            sb.append(vjg.a);
            sb.append("] [");
            synchronized (jj9.class) {
                str = jj9.b;
            }
            sb.append(str);
            sb.append("]");
            zkd.D("ExoPlayerImpl", sb.toString());
            dVar.y1();
            dVar.B.a();
            dVar.C.a(false);
            dVar.D.a(false);
            androidx.media3.exoplayer.e eVar = dVar.l;
            if (eVar.x0 || !eVar.Y.getThread().isAlive()) {
                zC = true;
            } else {
                eVar.x0 = true;
                sn2 sn2Var = new sn2(eVar.f0);
                eVar.W.e(7, sn2Var).b();
                zC = sn2Var.c(eVar.k0);
            }
            if (!zC) {
                dVar.m.f(10, new r40(9));
            }
            dVar.m.d();
            dVar.j.d();
            dVar.u.e(dVar.s);
            adb adbVar = dVar.l0;
            if (adbVar.p) {
                dVar.l0 = adbVar.a();
            }
            adb adbVarJ1 = androidx.media3.exoplayer.d.j1(dVar.l0, 1);
            dVar.l0 = adbVarJ1;
            adb adbVarC = adbVarJ1.c(adbVarJ1.b);
            dVar.l0 = adbVarC;
            adbVarC.q = adbVarC.s;
            dVar.l0.r = 0L;
            dVar.s.release();
            dVar.o1();
            Surface surface = dVar.T;
            if (surface != null) {
                surface.release();
                dVar.T = null;
            }
            dVar.d0 = q83.d;
            dVar.h0 = true;
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.player.VideoPlayer$emitTimeUpdate$1", f = "VideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public d(lu2<? super d> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return VideoPlayer.this.new d(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            VideoPlayer.this.s0(new a.m(new TimeUpdate(VideoPlayer.this.X.K0() / 1000.0d, VideoPlayer.this.j0(), VideoPlayer.this.h0(), VideoPlayer.this.f0())));
            return j6g.a;
        }
    }

    public static final class e implements gdb.c {
        public e() {
        }

        @Override // gdb.c
        public final void T(dqf dqfVar) {
            String str;
            String str2;
            String str3;
            String str4;
            dqfVar.getClass();
            VideoPlayer videoPlayer = VideoPlayer.this;
            hog hogVar = videoPlayer.W;
            oog oogVar = videoPlayer.V;
            SubtitleTrack.Companion companion = SubtitleTrack.INSTANCE;
            androidx.media3.common.a aVar = oogVar.c;
            companion.getClass();
            SubtitleTrack subtitleTrack = null;
            SubtitleTrack subtitleTrack2 = (aVar == null || (str3 = aVar.a) == null || (str4 = aVar.d) == null) ? null : new SubtitleTrack(str3, str4, new Locale(str4).getDisplayLanguage());
            AudioTrack.Companion companion2 = AudioTrack.INSTANCE;
            androidx.media3.common.a aVar2 = hogVar.c;
            companion2.getClass();
            AudioTrack audioTrackA = AudioTrack.Companion.a(aVar2);
            videoPlayer.s0(new a.n(dqfVar));
            androidx.media3.common.a aVar3 = oogVar.c;
            companion.getClass();
            if (aVar3 != null && (str = aVar3.a) != null && (str2 = aVar3.d) != null) {
                subtitleTrack = new SubtitleTrack(str, str2, new Locale(str2).getDisplayLanguage());
            }
            androidx.media3.common.a aVar4 = hogVar.c;
            companion2.getClass();
            AudioTrack audioTrackA2 = AudioTrack.Companion.a(aVar4);
            videoPlayer.s0(new a.l(subtitleTrack, subtitleTrack2));
            videoPlayer.s0(new a.b(audioTrackA2, audioTrackA));
        }

        @Override // gdb.c
        public final void W(float f) {
            VideoPlayer videoPlayer = VideoPlayer.this;
            if (videoPlayer.k0()) {
                return;
            }
            videoPlayer.B0(f);
        }

        @Override // gdb.c
        public final void X(int i, ij9 ij9Var) {
            VideoPlayer videoPlayer = VideoPlayer.this;
            if (i == 0) {
                a.h hVar = new a.h();
                qf8<Object>[] qf8VarArr = VideoPlayer.w0;
                videoPlayer.s0(hVar);
            } else {
                videoPlayer.k0 = 0.0f;
                videoPlayer.l0 = false;
            }
            videoPlayer.V.b(false);
            videoPlayer.a0 = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gdb.c
        public final void f0(wqf wqfVar) {
            ArrayList<SubtitleTrack> arrayList;
            ArrayList<AudioTrack> arrayList2;
            e47.b bVar;
            VideoTrack videoTrack;
            String str;
            String str2;
            String str3;
            String str4;
            wqfVar.getClass();
            VideoPlayer videoPlayer = VideoPlayer.this;
            oog oogVar = videoPlayer.V;
            ArrayList arrayList3 = new ArrayList(oogVar.e);
            hog hogVar = videoPlayer.W;
            ArrayList arrayList4 = new ArrayList(hogVar.e);
            SubtitleTrack.Companion companion = SubtitleTrack.INSTANCE;
            androidx.media3.common.a aVar = oogVar.c;
            companion.getClass();
            SubtitleTrack subtitleTrack = (aVar == null || (str3 = aVar.a) == null || (str4 = aVar.d) == null) ? null : new SubtitleTrack(str3, str4, new Locale(str4).getDisplayLanguage());
            AudioTrack.Companion companion2 = AudioTrack.INSTANCE;
            androidx.media3.common.a aVar2 = hogVar.c;
            companion2.getClass();
            AudioTrack audioTrackA = AudioTrack.Companion.a(aVar2);
            videoPlayer.s0(new a.o(wqfVar));
            ArrayList<SubtitleTrack> arrayList5 = oogVar.e;
            ArrayList<AudioTrack> arrayList6 = hogVar.e;
            androidx.media3.common.a aVar3 = oogVar.c;
            companion.getClass();
            SubtitleTrack subtitleTrack2 = (aVar3 == null || (str = aVar3.a) == null || (str2 = aVar3.d) == null) ? null : new SubtitleTrack(str, str2, new Locale(str2).getDisplayLanguage());
            androidx.media3.common.a aVar4 = hogVar.c;
            companion2.getClass();
            AudioTrack audioTrackA2 = AudioTrack.Companion.a(aVar4);
            ArrayList arrayList7 = new ArrayList();
            int i = 0;
            e47.b bVarListIterator = wqfVar.a.listIterator(0);
            bVarListIterator.getClass();
            while (bVarListIterator.hasNext()) {
                wqf.a aVar5 = (wqf.a) bVarListIterator.next();
                int i2 = aVar5.a;
                int i3 = i;
                while (i3 < i2) {
                    androidx.media3.common.a aVarA = aVar5.a(i3);
                    aVarA.getClass();
                    boolean zB = aVar5.b(i3);
                    if (st9.o(aVarA.n)) {
                        VideoTrack.INSTANCE.getClass();
                        String str5 = aVarA.a;
                        if (str5 == null) {
                            bVar = bVarListIterator;
                            videoTrack = null;
                        } else {
                            bVar = bVarListIterator;
                            VideoSize videoSize = new VideoSize(aVarA);
                            String str6 = aVarA.n;
                            int i4 = aVarA.j;
                            Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
                            float f = aVarA.y;
                            videoTrack = new VideoTrack(str5, videoSize, str6, zB, numValueOf, f == -1.0f ? null : Float.valueOf(f), aVarA);
                        }
                        arrayList7.add(videoTrack);
                    } else {
                        bVar = bVarListIterator;
                    }
                    i3++;
                    bVarListIterator = bVar;
                    i = 0;
                }
            }
            videoPlayer.t0 = z92.M0(arrayList7);
            if (videoPlayer.r0) {
                i07 i07Var = videoPlayer.d0;
                qf8<Object> qf8Var = VideoPlayer.w0[1];
                i07Var.getClass();
                qf8Var.getClass();
                a.p pVar = new a.p((VideoSource) i07Var.a, videoPlayer.X.getDuration() / 1000.0d, videoPlayer.t0, arrayList5, arrayList6);
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                videoPlayer.s0(pVar);
                videoPlayer.r0 = false;
            } else {
                arrayList = arrayList5;
                arrayList2 = arrayList6;
            }
            if (!Arrays.equals(arrayList3.toArray(), arrayList.toArray())) {
                videoPlayer.s0(new a.d(arrayList, arrayList3));
            }
            if (!Arrays.equals(arrayList4.toArray(), arrayList2.toArray())) {
                videoPlayer.s0(new a.c(arrayList2, arrayList4));
            }
            if (!wl7.b(subtitleTrack, subtitleTrack2)) {
                videoPlayer.s0(new a.l(subtitleTrack2, subtitleTrack));
            }
            if (wl7.b(audioTrackA, audioTrackA2)) {
                return;
            }
            videoPlayer.s0(new a.b(audioTrackA2, audioTrackA));
        }

        @Override // gdb.c
        public final void o0(cdb cdbVar) {
            cdbVar.getClass();
            VideoPlayer.this.o0.a(VideoPlayer.w0[4], cdbVar);
        }

        @Override // gdb.c
        public final void q0(PlaybackException playbackException) {
            VideoPlayer videoPlayer = VideoPlayer.this;
            if (playbackException == null) {
                VideoPlayer.W(videoPlayer, VideoPlayer.Q(videoPlayer, videoPlayer.X.b()), null);
                return;
            }
            videoPlayer.k0 = 0.0f;
            videoPlayer.l0 = false;
            VideoPlayer.W(videoPlayer, PlayerStatus.ERROR, playbackException);
        }

        @Override // gdb.c
        public final void s(int i) {
            VideoPlayer videoPlayer = VideoPlayer.this;
            androidx.media3.exoplayer.d dVar = videoPlayer.X;
            if (i != 1 || dVar.a() == null) {
                if (i == 3) {
                    videoPlayer.k0 = dVar.getDuration() / 1000.0f;
                    videoPlayer.l0 = dVar.S0();
                }
                VideoPlayer.W(videoPlayer, VideoPlayer.Q(videoPlayer, i), null);
            }
        }

        @Override // gdb.c
        public final void v0(boolean z) {
            VideoPlayer.this.b0.a(VideoPlayer.w0[0], Boolean.valueOf(z));
        }
    }

    static {
        w3a w3aVar = new w3a(VideoPlayer.class, "playing", "getPlaying()Z", 0);
        iwc iwcVar = fwc.a;
        w0 = new qf8[]{iwcVar.e(w3aVar), r40.b(VideoPlayer.class, "commitedSource", "getCommitedSource()Lexpo/modules/video/records/VideoSource;", 0, iwcVar), r40.b(VideoPlayer.class, "volume", "getVolume()F", 0, iwcVar), r40.b(VideoPlayer.class, "muted", "getMuted()Z", 0, iwcVar), r40.b(VideoPlayer.class, "playbackParameters", "getPlaybackParameters()Landroidx/media3/common/PlaybackParameters;", 0, iwcVar), r40.b(VideoPlayer.class, "keepScreenOnWhilePlaying", "getKeepScreenOnWhilePlaying()Z", 0, iwcVar)};
    }

    public VideoPlayer(Context context, gk0 gk0Var, VideoSource videoSource) {
        Object next;
        super(gk0Var.b);
        this.c = context;
        yp3 yp3Var = new yp3(context);
        yp3Var.b.b = 1;
        yp3Var.c = true;
        this.d = new ArrayList();
        c00 c00Var = new c00();
        c00Var.a = new WeakReference(null);
        this.e = c00Var;
        final nog nogVar = new nog();
        this.f = nogVar;
        this.V = new oog(this);
        this.W = new hog(this);
        new hr3(context);
        ExoPlayer.b bVar = new ExoPlayer.b(context, yp3Var);
        Looper mainLooper = context.getMainLooper();
        ka2.q(!bVar.w);
        mainLooper.getClass();
        bVar.i = mainLooper;
        ka2.q(!bVar.w);
        bVar.f = new fze() { // from class: t25
            @Override // defpackage.fze
            public final Object get() {
                return nogVar;
            }
        };
        ka2.q(!bVar.w);
        bVar.w = true;
        androidx.media3.exoplayer.d dVar = new androidx.media3.exoplayer.d(bVar);
        this.X = dVar;
        new gg5(dVar, c00Var, new o91(this, 27));
        this.Y = new edb(gk0Var, new WeakReference(this));
        this.Z = new nj7(this);
        Boolean bool = Boolean.FALSE;
        this.b0 = new i07(bool, new xd(this, 22));
        this.c0 = videoSource;
        this.d0 = new i07(null, new w91(this, 10));
        this.e0 = 1.0f;
        this.f0 = PlayerStatus.IDLE;
        this.m0 = new i07(Float.valueOf(1.0f), new pa(this, 13));
        int i = 12;
        this.n0 = new i07(bool, new kh(this, i));
        this.o0 = new i07(cdb.d, new ir(this, 15), new mh(this, i));
        this.p0 = new BufferOptions(null, 0L, false, 0.0d, 15, null);
        this.q0 = AudioMixingMode.AUTO;
        this.t0 = zr4.a;
        this.u0 = new log(this, gk0Var);
        e eVar = new e();
        this.v0 = eVar;
        b bVar2 = new b();
        dVar.m.a(eVar);
        dVar.s.g0(bVar2);
        yng.a.getClass();
        LinkedHashMap linkedHashMap = yng.e;
        Collection collection = (List) linkedHashMap.get(this);
        linkedHashMap.put(this, collection == null ? new ArrayList() : collection);
        zx0 zx0Var = yng.g;
        if (zx0Var == null) {
            wl7.g("audioFocusManager");
            throw null;
        }
        ArrayList arrayList = zx0Var.c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (wl7.b(((WeakReference) next).get(), this)) {
                    break;
                }
            }
        }
        if (((WeakReference) next) == null) {
            arrayList.add(new WeakReference(this));
        }
        b0(zx0Var);
        zx0Var.e();
        u63.Y(gk0Var.g, null, null, new a(null), 3);
    }

    public static final PlayerStatus Q(VideoPlayer videoPlayer, int i) {
        if (i == 1) {
            return PlayerStatus.IDLE;
        }
        if (i == 2) {
            return PlayerStatus.LOADING;
        }
        if (i == 3) {
            return PlayerStatus.READY_TO_PLAY;
        }
        if (i == 4 && videoPlayer.X.a() != null) {
            return PlayerStatus.ERROR;
        }
        return PlayerStatus.IDLE;
    }

    public static final void W(VideoPlayer videoPlayer, PlayerStatus playerStatus, PlaybackException playbackException) {
        PlayerStatus playerStatus2 = videoPlayer.f0;
        videoPlayer.f0 = playerStatus;
        PlaybackError playbackError = playbackException != null ? new PlaybackError(playbackException) : null;
        if (playbackError == null && videoPlayer.X.b() == 4) {
            videoPlayer.s0(new a.h());
        }
        if (videoPlayer.f0 != playerStatus2) {
            videoPlayer.s0(new a.k(playerStatus, playerStatus2, playbackError));
        }
    }

    public final void B0(float f) {
        this.m0.a(w0[2], Float.valueOf(f));
    }

    public final void K0() throws Exceptions$AppContextLost {
        boolean zBindService;
        d49 d49Var;
        edb edbVar = this.Y;
        ddb ddbVar = edbVar.b;
        if ((ddbVar != null ? ddbVar.a : null) != null) {
            return;
        }
        gk0 gk0VarN = N();
        if (gk0VarN == null) {
            throw new Exceptions$AppContextLost();
        }
        int i = i45.b0;
        Context context = this.c;
        context.getClass();
        ReactApplicationContext reactApplicationContextD = gk0VarN.d();
        if (reactApplicationContextD != null) {
            Intent intent = new Intent(context, (Class<?>) i45.class);
            intent.setAction("androidx.media3.session.MediaSessionService");
            reactApplicationContextD.startService(intent);
            zBindService = reactApplicationContextD.bindService(intent, edbVar, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } else {
            zBindService = false;
        }
        if (zBindService || (d49Var = (d49) gk0VarN.l.getValue()) == null) {
            return;
        }
        d49Var.a(o39.Error, pyd.w("Expo-video has failed to bind with the playback service binder"), null);
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public final void P() {
        close();
    }

    @Override // defpackage.oj7
    public final void a() {
        eu2 eu2Var;
        gk0 gk0VarN = N();
        if (gk0VarN == null || (eu2Var = gk0VarN.g) == null) {
            return;
        }
        u63.Y(eu2Var, null, null, new d(null), 3);
    }

    public final void b0(mog mogVar) {
        mogVar.getClass();
        ArrayList arrayList = this.d;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (wl7.b(((WeakReference) it.next()).get(), mogVar)) {
                    return;
                }
            }
        }
        arrayList.add(new WeakReference(mogVar));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        i45 i45Var;
        gk0 gk0VarN;
        ReactApplicationContext reactApplicationContextD;
        edb edbVar = this.Y;
        if (edbVar.c && (gk0VarN = N()) != null && (reactApplicationContextD = gk0VarN.d()) != null) {
            reactApplicationContextD.unbindService(edbVar);
        }
        ddb ddbVar = edbVar.b;
        if (ddbVar != null && (i45Var = ddbVar.a) != null) {
            androidx.media3.exoplayer.d dVar = this.X;
            dVar.getClass();
            u63.Y(i45Var.k().g, null, null, new l45(i45Var, dVar, null), 3);
        }
        yng.a.getClass();
        yng.e.remove(this);
        zx0 zx0Var = yng.g;
        if (zx0Var == null) {
            wl7.g("audioFocusManager");
            throw null;
        }
        w92.B0(this.d, new ma(zx0Var, 22));
        w92.B0(zx0Var.c, new vx0(this, 0));
        zx0Var.e();
        eq3 eq3Var = a74.a;
        u63.Y(ba6.a, m89.a, null, new c(null), 2);
        this.c0 = null;
        qf8<Object>[] qf8VarArr = w0;
        this.d0.a(qf8VarArr[1], null);
        this.u0.a(qf8VarArr[5], false);
    }

    public final void d0(PlayerView playerView) {
        c00 c00Var = this.e;
        PlayerView playerView2 = (PlayerView) ((WeakReference) c00Var.a).get();
        int i = PlayerView.z0;
        if (playerView2 != playerView) {
            if (playerView != null) {
                playerView.setPlayer(this.X);
            }
            if (playerView2 != null) {
                playerView2.setPlayer(null);
            }
        }
        c00Var.a = new WeakReference(playerView);
    }

    public final double f0() {
        androidx.media3.exoplayer.d dVar = this.X;
        if (dVar.M0() == null) {
            return -1.0d;
        }
        if (dVar.b() == 2) {
            return 0.0d;
        }
        return dVar.r0() / 1000.0d;
    }

    public final Long h0() {
        emf.d dVar = new emf.d();
        androidx.media3.exoplayer.d dVar2 = this.X;
        if (!dVar2.M().p()) {
            dVar2.M().n(dVar2.v0(), dVar);
        }
        long j = dVar.e;
        if (j == -9223372036854775807L) {
            return null;
        }
        return Long.valueOf(dVar2.K0() + j);
    }

    public final Float j0() {
        if (this.X.T() == -9223372036854775807L) {
            return null;
        }
        return Float.valueOf(r4.T() / 1000.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k0() {
        qf8<Object> qf8Var = w0[3];
        i07 i07Var = this.n0;
        i07Var.getClass();
        qf8Var.getClass();
        return ((Boolean) i07Var.a).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m0() {
        qf8<Object> qf8Var = w0[0];
        i07 i07Var = this.b0;
        i07Var.getClass();
        qf8Var.getClass();
        return ((Boolean) i07Var.a).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float o0() {
        qf8<Object> qf8Var = w0[2];
        i07 i07Var = this.m0;
        i07Var.getClass();
        qf8Var.getClass();
        return ((Number) i07Var.a).floatValue();
    }

    public final void r0() {
        this.t0 = zr4.a;
        VideoTrack videoTrack = this.s0;
        this.s0 = null;
        s0(new a.q(null, videoTrack));
        VideoSource videoSource = this.c0;
        h mediaSource = videoSource != null ? videoSource.toMediaSource(this.c) : null;
        androidx.media3.exoplayer.d dVar = this.X;
        if (mediaSource == null) {
            dVar.n();
            dVar.f();
            this.r0 = false;
            return;
        }
        dVar.y1();
        List<h> listSingletonList = Collections.singletonList(mediaSource);
        dVar.y1();
        dVar.y1();
        dVar.q1(listSingletonList, -1, -9223372036854775807L, true);
        dVar.f();
        this.d0.a(w0[1], videoSource);
        this.c0 = null;
        this.r0 = true;
    }

    public final void s0(expo.modules.video.player.a aVar) {
        List listZ1 = z92.z1(this.d);
        ArrayList arrayList = new ArrayList();
        Iterator it = listZ1.iterator();
        while (it.hasNext()) {
            mog mogVar = (mog) ((WeakReference) it.next()).get();
            if (mogVar != null) {
                arrayList.add(mogVar);
            }
        }
        if (aVar instanceof a.k) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a.k kVar = (a.k) aVar;
                ((mog) it2.next()).onStatusChanged(this, kVar.b, kVar.c, kVar.d);
            }
        } else if (aVar instanceof a.e) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a.e eVar = (a.e) aVar;
                ((mog) it3.next()).onIsPlayingChanged(this, eVar.b, eVar.c);
            }
        } else if (aVar instanceof a.r) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                a.r rVar = (a.r) aVar;
                ((mog) it4.next()).onVolumeChanged(this, rVar.b, rVar.c);
            }
        } else if (aVar instanceof a.j) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                a.j jVar = (a.j) aVar;
                ((mog) it5.next()).onSourceChanged(this, jVar.b, jVar.c);
            }
        } else if (aVar instanceof a.g) {
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                a.g gVar = (a.g) aVar;
                ((mog) it6.next()).onPlaybackRateChanged(this, gVar.b, gVar.c);
            }
        } else if (aVar instanceof a.o) {
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                ((mog) it7.next()).onTracksChanged(this, ((a.o) aVar).b);
            }
        } else if (aVar instanceof a.n) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((mog) it8.next()).onTrackSelectionParametersChanged(this, ((a.n) aVar).b);
            }
        } else if (aVar instanceof a.m) {
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                ((mog) it9.next()).onTimeUpdate(this, ((a.m) aVar).b);
            }
        } else if (aVar instanceof a.h) {
            Iterator it10 = arrayList.iterator();
            while (it10.hasNext()) {
                ((mog) it10.next()).onPlayedToEnd(this);
            }
        } else if (aVar instanceof a.f) {
            Iterator it11 = arrayList.iterator();
            while (it11.hasNext()) {
                a.f fVar = (a.f) aVar;
                ((mog) it11.next()).onMutedChanged(this, fVar.b, fVar.c);
            }
        } else if (aVar instanceof a.C0223a) {
            Iterator it12 = arrayList.iterator();
            while (it12.hasNext()) {
                a.C0223a c0223a = (a.C0223a) aVar;
                ((mog) it12.next()).onAudioMixingModeChanged(this, c0223a.b, c0223a.c);
            }
        } else if (aVar instanceof a.q) {
            Iterator it13 = arrayList.iterator();
            while (it13.hasNext()) {
                a.q qVar = (a.q) aVar;
                ((mog) it13.next()).onVideoTrackChanged(this, qVar.b, qVar.c);
            }
        } else if (aVar instanceof a.i) {
            Iterator it14 = arrayList.iterator();
            while (it14.hasNext()) {
                ((mog) it14.next()).onRenderedFirstFrame(this);
            }
        } else if (aVar instanceof a.p) {
            Iterator it15 = arrayList.iterator();
            while (it15.hasNext()) {
                a.p pVar = (a.p) aVar;
                ((mog) it15.next()).onVideoSourceLoaded(this, pVar.b, Double.valueOf(pVar.c), pVar.d, pVar.e, pVar.f);
            }
        }
        if (aVar.a()) {
            v(aVar.c(), aVar.b());
        }
    }
}
