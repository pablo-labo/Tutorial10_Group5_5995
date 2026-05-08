package expo.modules.video;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.webkit.URLUtil;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.bs4;
import defpackage.c1f;
import defpackage.cc5;
import defpackage.cdb;
import defpackage.cqf;
import defpackage.ddb;
import defpackage.dqf;
import defpackage.e13;
import defpackage.eb5;
import defpackage.fwc;
import defpackage.g13;
import defpackage.gg8;
import defpackage.gk0;
import defpackage.gu5;
import defpackage.hb5;
import defpackage.hog;
import defpackage.i07;
import defpackage.i45;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.ja;
import defpackage.k45;
import defpackage.ka2;
import defpackage.lng;
import defpackage.log;
import defpackage.lu2;
import defpackage.mng;
import defpackage.nj7;
import defpackage.nog;
import defpackage.ojh;
import defpackage.oog;
import defpackage.p3c;
import defpackage.qf8;
import defpackage.qj9;
import defpackage.r6;
import defpackage.r7d;
import defpackage.sx9;
import defpackage.t40;
import defpackage.t92;
import defpackage.to3;
import defpackage.u63;
import defpackage.uh3;
import defpackage.vjg;
import defpackage.wd4;
import defpackage.wl7;
import defpackage.wpf;
import defpackage.wu5;
import defpackage.wve;
import defpackage.xa5;
import defpackage.yng;
import defpackage.zf8;
import defpackage.zx0;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions$AppContextLost;
import expo.modules.kotlin.exception.Exceptions$ReactContextLost;
import expo.modules.kotlin.types.Either;
import expo.modules.video.VideoView;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.ContentFit;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.player.a;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.BufferOptions;
import expo.modules.video.records.FullscreenOptions;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoThumbnailOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/video/a;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends sx9 {

    /* JADX INFO: renamed from: expo.modules.video.a$a, reason: collision with other inner class name */
    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$1$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class C0221a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ VideoPlayer $player;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0221a(VideoPlayer videoPlayer, lu2<? super C0221a> lu2Var) {
            super(2, lu2Var);
            this.$player = videoPlayer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new C0221a(this.$player, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((C0221a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$player.r0();
            return j6g.a;
        }
    }

    public static final class a0 implements Function1<Object[], Object> {
        public a0() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws CodedException {
            objArr.getClass();
            VideoView.Companion companion = VideoView.INSTANCE;
            Activity activityE = a.this.b().e();
            companion.getClass();
            return Boolean.valueOf(activityE.getPackageManager().hasSystemFeature("android.software.picture_in_picture"));
        }
    }

    public static final class a1 implements Function2<TextureVideoView, Boolean, j6g> {
        public static final a1 a = new a1();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(TextureVideoView textureVideoView, Boolean bool) {
            TextureVideoView textureVideoView2 = textureVideoView;
            boolean zBooleanValue = bool.booleanValue();
            textureVideoView2.getClass();
            textureVideoView2.setUseNativeControls(zBooleanValue);
            return j6g.a;
        }
    }

    public static final class a2 implements Function1<Object[], Object> {
        public a2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Either<Uri, VideoSource> either = (Either) objArr2[1];
            a.this.e((VideoPlayer) obj, either, null);
            return j6g.a;
        }
    }

    public static final class a3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((VideoPlayer) objArr2[0]).s0;
        }
    }

    public static final class a4 implements gu5<zf8> {
        public static final a4 a = new a4();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Double.TYPE);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$14$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        final /* synthetic */ SubtitleTrack $subtitleTrack;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(VideoPlayer videoPlayer, SubtitleTrack subtitleTrack, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$subtitleTrack = subtitleTrack;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$ref, this.$subtitleTrack, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            androidx.media3.exoplayer.d dVar;
            Pair pair;
            Object obj2 = null;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            oog oogVar = this.$ref.V;
            SubtitleTrack subtitleTrack = this.$subtitleTrack;
            LinkedHashMap linkedHashMap = oogVar.b;
            VideoPlayer videoPlayer = oogVar.a.get();
            if (videoPlayer != null && (dVar = videoPlayer.X) != null) {
                dqf dqfVarP = dVar.P();
                dqfVarP.getClass();
                if (oogVar.d != null) {
                    dqfVarP = dqfVarP.a().d(3).b();
                }
                if (subtitleTrack == null) {
                    dVar.v(dqfVarP);
                    oogVar.b(false);
                    oogVar.d = null;
                } else {
                    Iterator it = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (wl7.b(((androidx.media3.common.a) next).a, subtitleTrack.getId())) {
                            obj2 = next;
                            break;
                        }
                    }
                    androidx.media3.common.a aVar = (androidx.media3.common.a) obj2;
                    if (aVar != null && (pair = (Pair) linkedHashMap.get(aVar)) != null) {
                        cqf cqfVar = new cqf((wpf) pair.d(), ((Number) pair.e()).intValue());
                        dVar.v(dqfVarP.a().a(cqfVar).b());
                        oogVar.b(true);
                        oogVar.d = cqfVar;
                    }
                }
            }
            return j6g.a;
        }
    }

    public static final class b0 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            yng.a.getClass();
            long length = 0;
            for (File file : new cc5(new xa5(yng.b().b(), eb5.a, null), true, new lng(0))) {
                file.getClass();
                length += file.length();
            }
            return Long.valueOf(length);
        }
    }

    public static final class b1 implements Function2<TextureVideoView, ContentFit, j6g> {
        public static final b1 a = new b1();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(TextureVideoView textureVideoView, ContentFit contentFit) {
            TextureVideoView textureVideoView2 = textureVideoView;
            ContentFit contentFit2 = contentFit;
            textureVideoView2.getClass();
            contentFit2.getClass();
            textureVideoView2.setContentFit(contentFit2);
            return j6g.a;
        }
    }

    public static final class b2 implements gu5<zf8> {
        public static final b2 a = new b2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(VideoPlayer.class);
        }
    }

    public static final class b3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((VideoPlayer) objArr2[0]).V.e;
        }
    }

    public static final class b4 implements Function1<Object[], j6g> {
        public b4() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Double");
                return null;
            }
            u63.Y(a.this.b().g, null, null, new t((VideoPlayer) obj, ((Double) obj2).doubleValue(), null), 3);
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$17$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ AudioTrack $audioTrack;
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(VideoPlayer videoPlayer, AudioTrack audioTrack, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$audioTrack = audioTrack;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$ref, this.$audioTrack, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            androidx.media3.exoplayer.d dVar;
            Pair pair;
            Object obj2 = null;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            hog hogVar = this.$ref.W;
            AudioTrack audioTrack = this.$audioTrack;
            LinkedHashMap linkedHashMap = hogVar.b;
            VideoPlayer videoPlayer = hogVar.a.get();
            if (videoPlayer != null && (dVar = videoPlayer.X) != null) {
                dqf dqfVarP = dVar.P();
                dqfVarP.getClass();
                if (hogVar.d != null) {
                    dqfVarP = dqfVarP.a().d(1).b();
                }
                if (audioTrack == null) {
                    dVar.v(dqfVarP);
                    hogVar.b(false);
                    hogVar.d = null;
                } else {
                    Iterator it = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (wl7.b(((androidx.media3.common.a) next).a, audioTrack.getId())) {
                            obj2 = next;
                            break;
                        }
                    }
                    androidx.media3.common.a aVar = (androidx.media3.common.a) obj2;
                    if (aVar != null && (pair = (Pair) linkedHashMap.get(aVar)) != null) {
                        cqf cqfVar = new cqf((wpf) pair.d(), ((Number) pair.e()).intValue());
                        dVar.v(dqfVarP.a().a(cqfVar).b());
                        hogVar.b(true);
                        hogVar.d = cqfVar;
                    }
                }
            }
            return j6g.a;
        }
    }

    public static final class c0 implements gu5<j6g> {
        @Override // defpackage.gu5
        public final j6g invoke() {
            androidx.media3.exoplayer.d dVar;
            yng.a.getClass();
            for (VideoView videoView : yng.c.values()) {
                VideoPlayer videoPlayer = videoView.getVideoPlayer();
                if (videoPlayer == null || videoPlayer.h0 || videoView.getWillEnterPiP() || videoView.getIsInFullscreen()) {
                    videoView.setWasAutoPaused(false);
                } else {
                    videoView.getPlayerView().setUseController(false);
                    VideoPlayer videoPlayer2 = videoView.getVideoPlayer();
                    if (videoPlayer2 != null && (dVar = videoPlayer2.X) != null && dVar.t0()) {
                        dVar.c();
                        videoView.setWasAutoPaused(true);
                    }
                }
            }
            return j6g.a;
        }
    }

    public static final class c1 implements Function2<TextureVideoView, Boolean, j6g> {
        public static final c1 a = new c1();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(TextureVideoView textureVideoView, Boolean bool) {
            TextureVideoView textureVideoView2 = textureVideoView;
            boolean zBooleanValue = bool.booleanValue();
            textureVideoView2.getClass();
            textureVideoView2.setAutoEnterPiP(zBooleanValue);
            return j6g.a;
        }
    }

    public static final class c2 implements gu5<zf8> {
        public static final c2 a = new c2();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Double.TYPE);
        }
    }

    public static final class c3 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            String str;
            String str2;
            Object[] objArr2 = objArr;
            objArr2.getClass();
            oog oogVar = ((VideoPlayer) objArr2[0]).V;
            SubtitleTrack.Companion companion = SubtitleTrack.INSTANCE;
            androidx.media3.common.a aVar = oogVar.c;
            companion.getClass();
            if (aVar == null || (str = aVar.a) == null || (str2 = aVar.d) == null) {
                return null;
            }
            return new SubtitleTrack(str, str2, new Locale(str2).getDisplayLanguage());
        }
    }

    public static final class c4 implements gu5<zf8> {
        public static final c4 a = new c4();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(SubtitleTrack.class);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$18$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super Float>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VideoPlayer videoPlayer, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d(this.$ref, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super Float> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return this.$ref.j0();
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public static final class d0 implements gu5<j6g> {
        @Override // defpackage.gu5
        public final j6g invoke() {
            yng.a.getClass();
            for (VideoView videoView : yng.c.values()) {
                videoView.getPlayerView().setUseController(videoView.getUseNativeControls());
            }
            Iterator it = yng.d.values().iterator();
            while (it.hasNext()) {
                FullscreenPlayerActivity fullscreenPlayerActivity = (FullscreenPlayerActivity) ((WeakReference) it.next()).get();
                if (fullscreenPlayerActivity != null) {
                    fullscreenPlayerActivity.finish();
                }
            }
            return j6g.a;
        }
    }

    public static final class d1 implements Function2<TextureVideoView, FullscreenOptions, j6g> {
        public static final d1 a = new d1();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(TextureVideoView textureVideoView, FullscreenOptions fullscreenOptions) {
            TextureVideoView textureVideoView2 = textureVideoView;
            FullscreenOptions fullscreenOptions2 = fullscreenOptions;
            textureVideoView2.getClass();
            if (fullscreenOptions2 != null) {
                textureVideoView2.setFullscreenOptions(fullscreenOptions2);
            }
            return j6g.a;
        }
    }

    public static final class d2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((VideoPlayer) objArr2[0]).W.e;
        }
    }

    public static final class d3 implements Function1<Object[], j6g> {
        public d3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            u63.Y(a.this.b().g, null, null, new c((VideoPlayer) obj, (AudioTrack) objArr2[1], null), 3);
            return j6g.a;
        }
    }

    public static final class d4 implements Function1<Object[], j6g> {
        public d4() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            u63.Y(a.this.b().g, null, null, new b((VideoPlayer) obj, (SubtitleTrack) objArr2[1], null), 3);
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$21$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ float $playbackRate;
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(VideoPlayer videoPlayer, float f, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$playbackRate = f;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new e(this.$ref, this.$playbackRate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            VideoPlayer videoPlayer = this.$ref;
            videoPlayer.o0.a(VideoPlayer.w0[4], new cdb(this.$playbackRate, videoPlayer.i0 ? 1.0f : this.$playbackRate));
            return j6g.a;
        }
    }

    public static final class e0 implements gu5<j6g> {
        public e0() {
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            yng yngVar = yng.a;
            gk0 gk0VarB = a.this.b();
            yngVar.getClass();
            synchronized (yngVar) {
                try {
                    ReactApplicationContext reactApplicationContextD = gk0VarB.d();
                    if (reactApplicationContextD == null) {
                        throw new Exceptions$ReactContextLost();
                    }
                    if (yng.g == null) {
                        yng.g = new zx0(gk0VarB);
                    }
                    if (yng.h == null) {
                        yng.h = new mng(reactApplicationContextD);
                    } else {
                        gk0 gk0Var = yng.b.get();
                        if (!wl7.b(gk0Var != null ? gk0Var.d() : null, gk0VarB.d())) {
                            yng.b().e.n();
                            yng.h = new mng(reactApplicationContextD);
                        }
                    }
                    yng.b = new WeakReference<>(gk0VarB);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j6g.a;
        }
    }

    public static final class e1 implements Function2<TextureVideoView, Boolean, j6g> {
        public static final e1 a = new e1();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(TextureVideoView textureVideoView, Boolean bool) {
            TextureVideoView textureVideoView2 = textureVideoView;
            Boolean bool2 = bool;
            textureVideoView2.getClass();
            boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
            ojh.f(textureVideoView2.getPlayerView(), zBooleanValue);
            VideoPlayer videoPlayer = textureVideoView2.getVideoPlayer();
            if (videoPlayer != null) {
                videoPlayer.g0 = zBooleanValue;
            }
            return j6g.a;
        }
    }

    public static final class e2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            hog hogVar = ((VideoPlayer) objArr2[0]).W;
            AudioTrack.Companion companion = AudioTrack.INSTANCE;
            androidx.media3.common.a aVar = hogVar.c;
            companion.getClass();
            return AudioTrack.Companion.a(aVar);
        }
    }

    public static final class e3 implements gu5<zf8> {
        public static final e3 a = new e3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Float.TYPE);
        }
    }

    public static final class e4 implements gu5<zf8> {
        public static final e4 a = new e4();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(AudioTrack.class);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$24$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $preservesPitch;
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(VideoPlayer videoPlayer, boolean z, lu2<? super f> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$preservesPitch = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new f(this.$ref, this.$preservesPitch, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            VideoPlayer videoPlayer = this.$ref;
            videoPlayer.i0 = this.$preservesPitch;
            i07 i07Var = videoPlayer.o0;
            qf8<Object>[] qf8VarArr = VideoPlayer.w0;
            qf8<Object> qf8Var = qf8VarArr[4];
            i07Var.getClass();
            qf8Var.getClass();
            float f = ((cdb) i07Var.a).a;
            i07Var.a(qf8VarArr[4], new cdb(f, videoPlayer.i0 ? 1.0f : f));
            return j6g.a;
        }
    }

    public static final class f0 implements gu5<zf8> {
        public static final f0 a = new f0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(SurfaceVideoView.class);
        }
    }

    public static final class f1 implements Function2<TextureVideoView, Boolean, j6g> {
        public static final f1 a = new f1();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(TextureVideoView textureVideoView, Boolean bool) {
            TextureVideoView textureVideoView2 = textureVideoView;
            textureVideoView2.getClass();
            textureVideoView2.setUseExoShutter(bool);
            return j6g.a;
        }
    }

    public static final class f2 implements Function1<Object[], Object> {
        public f2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return (Float) u63.i0(a.this.b().g.a, new d((VideoPlayer) objArr2[0], null));
        }
    }

    public static final class f3 implements Function1<Object[], j6g> {
        public f3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Float");
                return null;
            }
            u63.Y(a.this.b().g, null, null, new e((VideoPlayer) obj, ((Float) obj2).floatValue(), null), 3);
            return j6g.a;
        }
    }

    public static final class f4 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Integer.valueOf(((VideoThumbnail) objArr2[0]).V);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$26$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        final /* synthetic */ boolean $showNotification;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(VideoPlayer videoPlayer, boolean z, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$showNotification = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new g(this.$ref, this.$showNotification, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Exceptions$AppContextLost {
            i45 i45Var;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            VideoPlayer videoPlayer = this.$ref;
            boolean z = this.$showNotification;
            videoPlayer.j0 = z;
            if (z) {
                videoPlayer.K0();
            }
            ddb ddbVar = videoPlayer.Y.b;
            if (ddbVar != null && (i45Var = ddbVar.a) != null) {
                androidx.media3.exoplayer.d dVar = videoPlayer.X;
                dVar.getClass();
                u63.Y(i45Var.k().g, null, null, new k45(i45Var, dVar, z, null), 3);
            }
            return j6g.a;
        }
    }

    public static final class g0 implements gu5<zf8> {
        public static final g0 a = new g0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(TextureVideoView.class);
        }
    }

    public static final class g1 implements gu5<zf8> {
        public static final g1 a = new g1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(TextureVideoView.class);
        }
    }

    public static final class g2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Float.valueOf(((VideoPlayer) objArr2[0]).k0);
        }
    }

    public static final class g3 implements gu5<zf8> {
        public static final g3 a = new g3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Boolean.TYPE);
        }
    }

    public static final class g4 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Integer.valueOf(((VideoThumbnail) objArr2[0]).W);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$30$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class h extends c1f implements Function2<e13, lu2<? super Boolean>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(VideoPlayer videoPlayer, lu2<? super h> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new h(this.$ref, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super Boolean> lu2Var) {
            return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            androidx.media3.exoplayer.d dVar = this.$ref.X;
            dVar.y1();
            return Boolean.valueOf(dVar.G == 1);
        }
    }

    public static final class h0 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((VideoView) objArr2[0]).enterFullscreen();
            return j6g.a;
        }
    }

    public static final class h1 implements gu5<zf8> {
        public static final h1 a = new h1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(VideoPlayer.class);
        }
    }

    public static final class h2 implements Function1<Object[], Object> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            i07 i07Var = ((VideoPlayer) objArr2[0]).o0;
            qf8<Object> qf8Var = VideoPlayer.w0[4];
            i07Var.getClass();
            qf8Var.getClass();
            return Float.valueOf(((cdb) i07Var.a).a);
        }
    }

    public static final class h3 implements Function1<Object[], j6g> {
        public h3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            }
            u63.Y(a.this.b().g, null, null, new f((VideoPlayer) obj, ((Boolean) obj2).booleanValue(), null), 3);
            return j6g.a;
        }
    }

    public static final class h4 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return new wd4(((VideoThumbnail) objArr2[0]).e);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$31$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class i extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $loop;
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(VideoPlayer videoPlayer, boolean z, lu2<? super i> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$loop = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new i(this.$ref, this.$loop, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((i) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$ref.X.w0(this.$loop ? 1 : 0);
            return j6g.a;
        }
    }

    public static final class i0 implements gu5<zf8> {
        public static final i0 a = new i0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(SurfaceVideoView.class);
        }
    }

    public static final class i1 implements gu5<zf8> {
        public static final i1 a = new i1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            gg8 gg8Var = gg8.c;
            return fwc.c(Either.class, gg8.a.a(fwc.d(Uri.class)), gg8.a.a(fwc.d(VideoSource.class)));
        }
    }

    public static final class i2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Boolean.valueOf(((VideoPlayer) objArr2[0]).l0);
        }
    }

    public static final class i3 implements gu5<zf8> {
        public static final i3 a = new i3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Boolean.TYPE);
        }
    }

    public static final class i4 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return new wd4(((VideoThumbnail) objArr2[0]).f);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$32$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class j extends c1f implements Function2<e13, lu2<? super Double>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(VideoPlayer videoPlayer, lu2<? super j> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new j(this.$ref, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super Double> lu2Var) {
            return ((j) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return new Double(this.$ref.f0());
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public static final class j0 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws PictureInPictureEnterException, PictureInPictureUnsupportedException, PictureInPictureConfigurationException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            try {
                ((VideoView) objArr2[0]).enterPictureInPicture();
                return j6g.a;
            } catch (IllegalStateException unused) {
                Log.e("ExpoVideo", "Current activity does not support picture-in-picture. Make sure you have configured the `expo-video` config plugin correctly.");
                throw new PictureInPictureConfigurationException();
            }
        }
    }

    public static final class j1 implements Function2<Object[], p3c, j6g> {
        public j1() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            Object[] objArr2 = objArr;
            p3c p3cVar2 = p3cVar;
            objArr2.getClass();
            p3cVar2.getClass();
            Object obj = objArr2[0];
            Either<Uri, VideoSource> either = (Either) objArr2[1];
            a.this.e((VideoPlayer) obj, either, p3cVar2);
            return j6g.a;
        }
    }

    public static final class j2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Boolean.valueOf(((VideoPlayer) objArr2[0]).i0);
        }
    }

    public static final class j3 implements Function1<Object[], j6g> {
        public j3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            }
            u63.Y(a.this.b().g, null, null, new g((VideoPlayer) obj, ((Boolean) obj2).booleanValue(), null), 3);
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$replaceImpl$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class j4 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ p3c $promise;
        final /* synthetic */ VideoPlayer $ref;
        final /* synthetic */ VideoSource $videoSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j4(VideoPlayer videoPlayer, VideoSource videoSource, p3c p3cVar, lu2<? super j4> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$videoSource = videoSource;
            this.$promise = p3cVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new j4(this.$ref, this.$videoSource, this.$promise, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((j4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            VideoPlayer videoPlayer = this.$ref;
            videoPlayer.c0 = this.$videoSource;
            videoPlayer.r0();
            p3c p3cVar = this.$promise;
            if (p3cVar != null) {
                p3cVar.e();
            }
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$36$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class k extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(VideoPlayer videoPlayer, lu2<? super k> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new k(this.$ref, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((k) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$ref.X.u0();
            return j6g.a;
        }
    }

    public static final class k0 implements Function1<View, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(View view) {
            View view2 = view;
            view2.getClass();
            yng.a.getClass();
            yng.c.remove(((VideoView) view2).getVideoViewId());
            return j6g.a;
        }
    }

    public static final class k1 implements gu5<zf8> {
        public static final k1 a = new k1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(VideoThumbnail.class);
        }
    }

    public static final class k2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Boolean.valueOf(((VideoPlayer) objArr2[0]).j0);
        }
    }

    public static final class k3 implements gu5<zf8> {
        public static final k3 a = new k3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Boolean.TYPE);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$37$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class l extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(VideoPlayer videoPlayer, lu2<? super l> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new l(this.$ref, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((l) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$ref.X.c();
            return j6g.a;
        }
    }

    public static final class l0 implements Function1<View, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(View view) {
            View view2 = view;
            view2.getClass();
            VideoView videoView = (VideoView) view2;
            if (videoView.getPlayerView().getUseController() != videoView.getUseNativeControls()) {
                videoView.getPlayerView().setUseController(videoView.getUseNativeControls());
            }
            return j6g.a;
        }
    }

    public static final class l1 implements gu5<zf8> {
        public static final l1 a = new l1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(VideoSource.class);
        }
    }

    public static final class l2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((VideoPlayer) objArr2[0]).f0;
        }
    }

    public static final class l3 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws Exceptions$AppContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            }
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            VideoPlayer videoPlayer = (VideoPlayer) obj;
            videoPlayer.h0 = zBooleanValue;
            if (zBooleanValue) {
                videoPlayer.K0();
            }
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$4$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class m extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $muted;
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(VideoPlayer videoPlayer, boolean z, lu2<? super m> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$muted = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new m(this.$ref, this.$muted, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((m) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$ref.n0.a(VideoPlayer.w0[3], Boolean.valueOf(this.$muted));
            return j6g.a;
        }
    }

    public static final class m0 implements Function2<SurfaceVideoView, VideoPlayer, j6g> {
        public static final m0 a = new m0();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(SurfaceVideoView surfaceVideoView, VideoPlayer videoPlayer) {
            SurfaceVideoView surfaceVideoView2 = surfaceVideoView;
            VideoPlayer videoPlayer2 = videoPlayer;
            surfaceVideoView2.getClass();
            videoPlayer2.getClass();
            surfaceVideoView2.setVideoPlayer(videoPlayer2);
            return j6g.a;
        }
    }

    public static final class m1 implements Function1<Object[], Object> {
        public m1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            VideoSource videoSource = (VideoSource) objArr2[0];
            a aVar = a.this;
            Context applicationContext = aVar.b().e().getApplicationContext();
            applicationContext.getClass();
            VideoPlayer videoPlayer = new VideoPlayer(applicationContext, aVar.b(), videoSource);
            u63.Y(aVar.b().g, null, null, new C0221a(videoPlayer, null), 3);
            return videoPlayer;
        }
    }

    public static final class m2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Boolean.valueOf(((VideoPlayer) objArr2[0]).h0);
        }
    }

    public static final class m3 implements gu5<zf8> {
        public static final m3 a = new m3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Boolean.TYPE);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$41$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class n extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ AudioMixingMode $audioMixingMode;
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(VideoPlayer videoPlayer, AudioMixingMode audioMixingMode, lu2<? super n> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$audioMixingMode = audioMixingMode;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new n(this.$ref, this.$audioMixingMode, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((n) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            VideoPlayer videoPlayer = this.$ref;
            AudioMixingMode audioMixingMode = this.$audioMixingMode;
            videoPlayer.getClass();
            audioMixingMode.getClass();
            AudioMixingMode audioMixingMode2 = videoPlayer.q0;
            videoPlayer.q0 = audioMixingMode;
            videoPlayer.s0(new a.C0223a(audioMixingMode, audioMixingMode2));
            return j6g.a;
        }
    }

    public static final class n0 implements Function2<SurfaceVideoView, Boolean, j6g> {
        public static final n0 a = new n0();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(SurfaceVideoView surfaceVideoView, Boolean bool) {
            SurfaceVideoView surfaceVideoView2 = surfaceVideoView;
            boolean zBooleanValue = bool.booleanValue();
            surfaceVideoView2.getClass();
            surfaceVideoView2.setUseNativeControls(zBooleanValue);
            return j6g.a;
        }
    }

    public static final class n1 implements gu5<zf8> {
        public static final n1 a = new n1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(VideoPlayer.class);
        }
    }

    public static final class n2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Boolean.valueOf(((VideoPlayer) objArr2[0]).m0());
        }
    }

    public static final class n3 implements gu5<zf8> {
        public static final n3 a = new n3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Boolean.TYPE);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$46$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class o extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        final /* synthetic */ double $seekTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(VideoPlayer videoPlayer, double d, lu2<? super o> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$seekTime = d;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new o(this.$ref, this.$seekTime, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((o) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$ref.X.V0(5, this.$ref.X.K0() + ((long) (this.$seekTime * 1000.0d)));
            return j6g.a;
        }
    }

    public static final class o0 implements Function2<SurfaceVideoView, ContentFit, j6g> {
        public static final o0 a = new o0();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(SurfaceVideoView surfaceVideoView, ContentFit contentFit) {
            SurfaceVideoView surfaceVideoView2 = surfaceVideoView;
            ContentFit contentFit2 = contentFit;
            surfaceVideoView2.getClass();
            contentFit2.getClass();
            surfaceVideoView2.setContentFit(contentFit2);
            return j6g.a;
        }
    }

    public static final class o1 implements gu5<zf8> {
        public static final o1 a = new o1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            gg8 gg8Var = gg8.c;
            return fwc.e(List.class, gg8.a.a(fwc.d(wd4.class)));
        }
    }

    public static final class o2 implements Function1<Object[], Object> {
        public o2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Boolean bool = (Boolean) u63.i0(a.this.b().g.a, new h((VideoPlayer) objArr2[0], null));
            bool.getClass();
            return bool;
        }
    }

    public static final class o3 implements Function1<Object[], j6g> {
        public o3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            }
            u63.Y(a.this.b().g, null, null, new i((VideoPlayer) obj, ((Boolean) obj2).booleanValue(), null), 3);
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$47$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class p extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(VideoPlayer videoPlayer, lu2<? super p> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new p(this.$ref, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((p) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$ref.X.V0(5, 0L);
            this.$ref.X.u0();
            return j6g.a;
        }
    }

    public static final class p0 implements Function2<SurfaceVideoView, Boolean, j6g> {
        public static final p0 a = new p0();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(SurfaceVideoView surfaceVideoView, Boolean bool) {
            SurfaceVideoView surfaceVideoView2 = surfaceVideoView;
            boolean zBooleanValue = bool.booleanValue();
            surfaceVideoView2.getClass();
            surfaceVideoView2.setAutoEnterPiP(zBooleanValue);
            return j6g.a;
        }
    }

    public static final class p1 implements gu5<zf8> {
        public static final p1 a = new p1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(VideoThumbnailOptions.class);
        }
    }

    public static final class p2 implements Function1<Object[], Object> {
        public p2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Double.valueOf(((Number) u63.i0(a.this.b().g.a, new j((VideoPlayer) objArr2[0], null))).doubleValue());
        }
    }

    public static final class p3 implements gu5<zf8> {
        public static final p3 a = new p3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(BufferOptions.class);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$48$1", f = "VideoModule.kt", l = {336}, m = "invokeSuspend")
    public static final class q extends c1f implements Function2<MediaMetadataRetriever, lu2<? super List<? extends VideoThumbnail>>, Object> {
        final /* synthetic */ VideoThumbnailOptions $options;
        final /* synthetic */ List<wd4> $times;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: renamed from: expo.modules.video.a$q$a, reason: collision with other inner class name */
        @uh3(c = "expo.modules.video.VideoModule$definition$1$8$48$1$bitmaps$1$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
        public static final class C0222a extends c1f implements Function2<e13, lu2<? super VideoThumbnail>, Object> {
            final /* synthetic */ MediaMetadataRetriever $$this$safeUse;
            final /* synthetic */ VideoThumbnailOptions $options;
            final /* synthetic */ long $time;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0222a(MediaMetadataRetriever mediaMetadataRetriever, long j, VideoThumbnailOptions videoThumbnailOptions, lu2<? super C0222a> lu2Var) {
                super(2, lu2Var);
                this.$$this$safeUse = mediaMetadataRetriever;
                this.$time = j;
                this.$options = videoThumbnailOptions;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0222a(this.$$this$safeUse, this.$time, this.$options, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super VideoThumbnail> lu2Var) {
                return ((C0222a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return qj9.a(this.$$this$safeUse, this.$time, this.$options);
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<wd4> list, a aVar, VideoThumbnailOptions videoThumbnailOptions, lu2<? super q> lu2Var) {
            super(2, lu2Var);
            this.$times = list;
            this.this$0 = aVar;
            this.$options = videoThumbnailOptions;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            q qVar = new q(this.$times, this.this$0, this.$options, lu2Var);
            qVar.L$0 = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MediaMetadataRetriever mediaMetadataRetriever, lu2<? super List<? extends VideoThumbnail>> lu2Var) {
            return ((q) create(mediaMetadataRetriever, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) this.L$0;
            List<wd4> list = this.$times;
            a aVar = this.this$0;
            VideoThumbnailOptions videoThumbnailOptions = this.$options;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(u63.l(aVar.b().e, null, new C0222a(mediaMetadataRetriever, ((wd4) it.next()).a, videoThumbnailOptions, null), 3));
            }
            this.label = 1;
            Object objI = ka2.i(arrayList, this);
            g13 g13Var = g13.a;
            return objI == g13Var ? g13Var : objI;
        }
    }

    public static final class q0 implements Function2<SurfaceVideoView, FullscreenOptions, j6g> {
        public static final q0 a = new q0();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(SurfaceVideoView surfaceVideoView, FullscreenOptions fullscreenOptions) {
            SurfaceVideoView surfaceVideoView2 = surfaceVideoView;
            FullscreenOptions fullscreenOptions2 = fullscreenOptions;
            surfaceVideoView2.getClass();
            if (fullscreenOptions2 != null) {
                surfaceVideoView2.setFullscreenOptions(fullscreenOptions2);
            }
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$lambda$63$lambda$60$$inlined$Coroutine$4", f = "VideoModule.kt", l = {271}, m = "invokeSuspend")
    public static final class q1 extends c1f implements wu5<e13, Object[], lu2<? super Object>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q1(lu2 lu2Var, a aVar) {
            super(3, lu2Var);
            this.this$0 = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws IOException {
            Uri uri;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            VideoThumbnailOptions videoThumbnailOptions = (VideoThumbnailOptions) objArr[2];
            List list = (List) obj3;
            VideoPlayer videoPlayer = (VideoPlayer) obj2;
            VideoSource videoSource = videoPlayer.c0;
            if (videoSource == null) {
                i07 i07Var = videoPlayer.d0;
                qf8<Object> qf8Var = VideoPlayer.w0[1];
                i07Var.getClass();
                qf8Var.getClass();
                videoSource = (VideoSource) i07Var.a;
            }
            if (videoSource == null || (uri = videoSource.getUri()) == null) {
                r6.g("Video source is not set");
                return null;
            }
            String string = uri.toString();
            string.getClass();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (URLUtil.isFileUrl(string)) {
                mediaMetadataRetriever.setDataSource(wve.I(string, "file://", ""));
            } else if (URLUtil.isContentUrl(string)) {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = videoPlayer.c.getContentResolver().openFileDescriptor(uri, "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            mediaMetadataRetriever.setDataSource(fileInputStream.getFD());
                            j6g j6gVar = j6g.a;
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } finally {
                        }
                    } finally {
                    }
                }
            } else {
                Map<String, String> headers = videoSource.getHeaders();
                if (headers == null) {
                    headers = bs4.a;
                }
                mediaMetadataRetriever.setDataSource(string, headers);
            }
            q qVar = new q(list, this.this$0, videoThumbnailOptions, null);
            this.label = 1;
            Object objB = qj9.b(mediaMetadataRetriever, qVar, this);
            g13 g13Var = g13.a;
            return objB == g13Var ? g13Var : objB;
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Object[] objArr, lu2<? super Object> lu2Var) {
            q1 q1Var = new q1(lu2Var, this.this$0);
            q1Var.L$0 = objArr;
            return q1Var.invokeSuspend(j6g.a);
        }
    }

    public static final class q2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((VideoPlayer) objArr2[0]).p0;
        }
    }

    public static final class q3 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type expo.modules.video.records.BufferOptions");
                return null;
            }
            BufferOptions bufferOptions = (BufferOptions) obj2;
            VideoPlayer videoPlayer = (VideoPlayer) obj;
            videoPlayer.getClass();
            videoPlayer.p0 = bufferOptions;
            nog nogVar = videoPlayer.f;
            nogVar.getClass();
            Double preferredForwardBufferDuration = bufferOptions.getPreferredForwardBufferDuration();
            long jDoubleValue = preferredForwardBufferDuration != null ? (long) (preferredForwardBufferDuration.doubleValue() * 1000.0d) : 50000L;
            nogVar.b = vjg.O(jDoubleValue);
            nogVar.c = vjg.O(jDoubleValue);
            int maxBufferBytes = bufferOptions.getMaxBufferBytes() == 0 ? -1 : (int) bufferOptions.getMaxBufferBytes();
            nogVar.f = maxBufferBytes;
            if (maxBufferBytes != -1) {
                Iterator<to3.a> it = nogVar.i.values().iterator();
                while (it.hasNext()) {
                    it.next().b = nogVar.f;
                }
            }
            nogVar.g = bufferOptions.getPrioritizeTimeOverSizeThreshold();
            double minBufferForPlayback = bufferOptions.getMinBufferForPlayback() * 1000.0d;
            long j = nogVar.c;
            long minBufferForPlayback2 = minBufferForPlayback > ((double) (j / 1000)) ? j / 1000 : (long) (bufferOptions.getMinBufferForPlayback() * 1000.0d);
            nogVar.d = vjg.O(minBufferForPlayback2);
            nogVar.e = vjg.O(minBufferForPlayback2);
            nogVar.m();
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$6$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class r extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        final /* synthetic */ float $volume;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(VideoPlayer videoPlayer, float f, lu2<? super r> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$volume = f;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new r(this.$ref, this.$volume, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((r) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            VideoPlayer videoPlayer = this.$ref;
            float f = this.$volume;
            videoPlayer.e0 = f;
            videoPlayer.B0(f);
            return j6g.a;
        }
    }

    public static final class r0 implements Function2<SurfaceVideoView, Boolean, j6g> {
        public static final r0 a = new r0();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(SurfaceVideoView surfaceVideoView, Boolean bool) {
            SurfaceVideoView surfaceVideoView2 = surfaceVideoView;
            Boolean bool2 = bool;
            surfaceVideoView2.getClass();
            boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
            ojh.f(surfaceVideoView2.getPlayerView(), zBooleanValue);
            VideoPlayer videoPlayer = surfaceVideoView2.getVideoPlayer();
            if (videoPlayer != null) {
                videoPlayer.g0 = zBooleanValue;
            }
            return j6g.a;
        }
    }

    public static final class r1 implements Function1<Object[], Object> {
        public r1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            return u63.Y(a.this.b().g, null, null, new o((VideoPlayer) obj, ((Number) objArr2[1]).doubleValue(), null), 3);
        }
    }

    public static final class r2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Boolean.FALSE;
        }
    }

    public static final class r3 implements gu5<zf8> {
        public static final r3 a = new r3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Float.TYPE);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$7$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class s extends c1f implements Function2<e13, lu2<? super Float>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(VideoPlayer videoPlayer, lu2<? super s> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new s(this.$ref, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super Float> lu2Var) {
            return ((s) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return new Float(this.$ref.X.K0() / 1000.0f);
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public static final class s0 implements Function2<SurfaceVideoView, Boolean, j6g> {
        public static final s0 a = new s0();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(SurfaceVideoView surfaceVideoView, Boolean bool) {
            SurfaceVideoView surfaceVideoView2 = surfaceVideoView;
            surfaceVideoView2.getClass();
            surfaceVideoView2.setUseExoShutter(bool);
            return j6g.a;
        }
    }

    public static final class s1 implements gu5<zf8> {
        public static final s1 a = new s1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(VideoPlayer.class);
        }
    }

    public static final class s2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            return Double.valueOf(((VideoPlayer) r3[0]).Z.a() / 1000.0d);
        }
    }

    public static final class s3 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Float");
                return null;
            }
            ((VideoPlayer) obj).Z.c.a(nj7.e[0], Long.valueOf((long) (((Float) obj2).floatValue() * 1000.0f)));
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$8$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class t extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ double $currentTime;
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(VideoPlayer videoPlayer, double d, lu2<? super t> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
            this.$currentTime = d;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new t(this.$ref, this.$currentTime, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((t) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$ref.X.V0(5, (long) (this.$currentTime * 1000.0d));
            return j6g.a;
        }
    }

    public static final class t0 implements gu5<zf8> {
        public static final t0 a = new t0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(SurfaceVideoView.class);
        }
    }

    public static final class t1 implements Function1<Object[], Object> {
        public t1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return u63.Y(a.this.b().g, null, null, new p((VideoPlayer) objArr2[0], null), 3);
        }
    }

    public static final class t2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((VideoPlayer) objArr2[0]).q0;
        }
    }

    public static final class t3 implements gu5<zf8> {
        public static final t3 a = new t3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(AudioMixingMode.class);
        }
    }

    @uh3(c = "expo.modules.video.VideoModule$definition$1$8$9$1", f = "VideoModule.kt", l = {}, m = "invokeSuspend")
    public static final class u extends c1f implements Function2<e13, lu2<? super Long>, Object> {
        final /* synthetic */ VideoPlayer $ref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(VideoPlayer videoPlayer, lu2<? super u> lu2Var) {
            super(2, lu2Var);
            this.$ref = videoPlayer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new u(this.$ref, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super Long> lu2Var) {
            return ((u) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return this.$ref.h0();
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public static final class u0 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ((VideoView) objArr2[0]).enterFullscreen();
            return j6g.a;
        }
    }

    public static final class u1 implements gu5<zf8> {
        public static final u1 a = new u1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(VideoPlayer.class);
        }
    }

    public static final class u2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            log logVar = ((VideoPlayer) objArr2[0]).u0;
            qf8<Object> qf8Var = VideoPlayer.w0[5];
            logVar.getClass();
            qf8Var.getClass();
            return Boolean.valueOf(logVar.c);
        }
    }

    public static final class u3 implements Function1<Object[], j6g> {
        public u3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type expo.modules.video.enums.AudioMixingMode");
                return null;
            }
            u63.Y(a.this.b().g, null, null, new n((VideoPlayer) obj, (AudioMixingMode) obj2, null), 3);
            return j6g.a;
        }
    }

    public static final class v implements Function2<Object[], p3c, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws VideoCacheException {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            long jLongValue = ((Long) p3cVar2).longValue();
            yng.a.getClass();
            yng.b().c(jLongValue);
            return j6g.a;
        }
    }

    public static final class v0 implements gu5<zf8> {
        public static final v0 a = new v0();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(TextureVideoView.class);
        }
    }

    public static final class v1 implements Function1<Object[], Object> {
        public v1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return u63.Y(a.this.b().g, null, null, new k((VideoPlayer) objArr2[0], null), 3);
        }
    }

    public static final class v2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Boolean.valueOf(((VideoPlayer) objArr2[0]).k0());
        }
    }

    public static final class v3 implements gu5<zf8> {
        public static final v3 a = new v3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(Boolean.class);
        }
    }

    public static final class w implements gu5<zf8> {
        public static final w a = new w();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Long.TYPE);
        }
    }

    public static final class w0 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws PictureInPictureEnterException, PictureInPictureUnsupportedException, PictureInPictureConfigurationException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            try {
                ((VideoView) objArr2[0]).enterPictureInPicture();
                return j6g.a;
            } catch (IllegalStateException unused) {
                Log.e("ExpoVideo", "Current activity does not support picture-in-picture. Make sure you have configured the `expo-video` config plugin correctly.");
                throw new PictureInPictureConfigurationException();
            }
        }
    }

    public static final class w1 implements gu5<zf8> {
        public static final w1 a = new w1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(VideoPlayer.class);
        }
    }

    public static final class w2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Float.valueOf(((VideoPlayer) objArr2[0]).o0());
        }
    }

    public static final class w3 implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Boolean bool = (Boolean) objArr2[1];
            ((VideoPlayer) obj).u0.a(VideoPlayer.w0[5], bool != null ? bool.booleanValue() : true);
            return j6g.a;
        }
    }

    public static final class x implements Function1<Object[], j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws VideoCacheException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            long jLongValue = ((Number) objArr2[0]).longValue();
            yng.a.getClass();
            yng.b().c(jLongValue);
            return j6g.a;
        }
    }

    public static final class x0 implements Function1<View, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(View view) {
            View view2 = view;
            view2.getClass();
            yng.a.getClass();
            yng.c.remove(((VideoView) view2).getVideoViewId());
            return j6g.a;
        }
    }

    public static final class x1 implements Function1<Object[], Object> {
        public x1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return u63.Y(a.this.b().g, null, null, new l((VideoPlayer) objArr2[0], null), 3);
        }
    }

    public static final class x2 implements Function1<Object[], Object> {
        public x2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return Float.valueOf(((Number) u63.i0(a.this.b().g.a, new s((VideoPlayer) objArr2[0], null))).floatValue());
        }
    }

    public static final class x3 implements Function1<Object[], j6g> {
        public x3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            }
            u63.Y(a.this.b().g, null, null, new m((VideoPlayer) obj, ((Boolean) obj2).booleanValue(), null), 3);
            return j6g.a;
        }
    }

    public static final class y implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws VideoCacheException, Exceptions$ReactContextLost {
            objArr.getClass();
            yng.a.getClass();
            mng mngVarB = yng.b();
            mng.a();
            File fileB = mngVarB.b();
            androidx.media3.datasource.cache.c cVar = mngVarB.e;
            mngVarB.c.edit().putString("cacheDir", t40.h()).apply();
            mngVarB.e = new androidx.media3.datasource.cache.c(mngVarB.b(), mngVarB.d, mngVarB.b);
            cVar.n();
            hb5.P(fileB);
            return j6g.a;
        }
    }

    public static final class y0 implements Function1<View, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(View view) {
            View view2 = view;
            view2.getClass();
            VideoView videoView = (VideoView) view2;
            if (videoView.getPlayerView().getUseController() != videoView.getUseNativeControls()) {
                videoView.getPlayerView().setUseController(videoView.getUseNativeControls());
            }
            return j6g.a;
        }
    }

    public static final class y1 implements gu5<zf8> {
        public static final y1 a = new y1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(VideoPlayer.class);
        }
    }

    public static final class y2 implements Function1<Object[], Object> {
        public y2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return (Long) u63.i0(a.this.b().g.a, new u((VideoPlayer) objArr2[0], null));
        }
    }

    public static final class y3 implements gu5<zf8> {
        public static final y3 a = new y3();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(Float.TYPE);
        }
    }

    public static final class z implements gu5<zf8> {
        public static final z a = new z();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(VideoPlayer.class);
        }
    }

    public static final class z0 implements Function2<TextureVideoView, VideoPlayer, j6g> {
        public static final z0 a = new z0();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(TextureVideoView textureVideoView, VideoPlayer videoPlayer) {
            TextureVideoView textureVideoView2 = textureVideoView;
            VideoPlayer videoPlayer2 = videoPlayer;
            textureVideoView2.getClass();
            videoPlayer2.getClass();
            textureVideoView2.setVideoPlayer(videoPlayer2);
            return j6g.a;
        }
    }

    public static final class z1 implements gu5<zf8> {
        public static final z1 a = new z1();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            gg8 gg8Var = gg8.c;
            return fwc.c(Either.class, gg8.a.a(fwc.d(Uri.class)), gg8.a.a(fwc.d(VideoSource.class)));
        }
    }

    public static final class z2 implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            return ((VideoPlayer) objArr2[0]).t0;
        }
    }

    public static final class z3 implements Function1<Object[], j6g> {
        public z3() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            if (obj2 == null) {
                ja.k("null cannot be cast to non-null type kotlin.Float");
                return null;
            }
            u63.Y(a.this.b().g, null, null, new r((VideoPlayer) obj, ((Float) obj2).floatValue(), null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x07ca A[Catch: all -> 0x1c83, TryCatch #0 {all -> 0x1c83, blocks: (B:3:0x0080, B:5:0x00bc, B:7:0x00d5, B:9:0x00fb, B:10:0x010f, B:13:0x0138, B:35:0x01db, B:38:0x024b, B:41:0x026d, B:43:0x0290, B:46:0x02b0, B:49:0x02d5, B:52:0x02f1, B:55:0x0316, B:58:0x0332, B:61:0x035b, B:64:0x037d, B:67:0x03a2, B:70:0x03be, B:73:0x03e3, B:76:0x03ff, B:78:0x041a, B:79:0x042d, B:82:0x043e, B:96:0x0479, B:98:0x04af, B:100:0x04cb, B:103:0x04dc, B:117:0x0517, B:119:0x05a3, B:122:0x05c5, B:124:0x05e8, B:125:0x05fa, B:127:0x061f, B:128:0x0631, B:130:0x0656, B:131:0x0668, B:133:0x068d, B:134:0x069f, B:136:0x06c4, B:137:0x06d6, B:139:0x06fb, B:140:0x070b, B:142:0x0726, B:143:0x0739, B:145:0x0748, B:161:0x0794, B:163:0x07ca, B:164:0x07dd, B:166:0x07ec, B:180:0x082b, B:183:0x0870, B:185:0x0891, B:187:0x08a6, B:189:0x08ca, B:190:0x08dc, B:192:0x08f0, B:193:0x0904, B:195:0x0936, B:196:0x094a, B:198:0x0986, B:199:0x099a, B:201:0x09cf, B:202:0x09e2, B:204:0x09f6, B:205:0x0a0a, B:207:0x0a46, B:208:0x0a5a, B:210:0x0a8f, B:212:0x0aa7, B:214:0x0abb, B:215:0x0acf, B:217:0x0b09, B:218:0x0b1d, B:220:0x0b52, B:221:0x0b65, B:223:0x0b79, B:224:0x0b8d, B:226:0x0bc7, B:227:0x0bdb, B:229:0x0c15, B:230:0x0c29, B:232:0x0c63, B:233:0x0c77, B:235:0x0cb1, B:236:0x0cc5, B:238:0x0cff, B:239:0x0d13, B:241:0x0d48, B:242:0x0d5b, B:244:0x0d6f, B:245:0x0d83, B:247:0x0dbd, B:248:0x0dd1, B:250:0x0e0b, B:251:0x0e1f, B:253:0x0e54, B:254:0x0e67, B:256:0x0e7b, B:257:0x0e8f, B:259:0x0ec9, B:260:0x0edd, B:262:0x0f17, B:263:0x0f2b, B:265:0x0f65, B:266:0x0f79, B:268:0x0fae, B:269:0x0fc1, B:271:0x0fd5, B:272:0x0fe9, B:274:0x1023, B:275:0x1037, B:277:0x1071, B:278:0x1085, B:280:0x10ba, B:281:0x10cd, B:283:0x10e1, B:284:0x10f5, B:286:0x112f, B:287:0x1143, B:289:0x1178, B:290:0x118b, B:292:0x119f, B:293:0x11b3, B:295:0x11ed, B:296:0x1201, B:298:0x123b, B:299:0x124f, B:301:0x1284, B:302:0x1297, B:304:0x12ab, B:305:0x12bf, B:307:0x12f9, B:308:0x130d, B:310:0x1342, B:311:0x1355, B:313:0x1369, B:314:0x137d, B:316:0x13b7, B:317:0x13cb, B:319:0x1405, B:320:0x1419, B:322:0x144e, B:323:0x1461, B:325:0x1475, B:326:0x1489, B:328:0x14c3, B:329:0x14d7, B:331:0x1509, B:332:0x151b, B:334:0x152f, B:335:0x1543, B:337:0x156f, B:338:0x1581, B:340:0x1595, B:341:0x15a9, B:343:0x15dd, B:344:0x15f1, B:346:0x1626, B:347:0x1639, B:349:0x164d, B:350:0x1661, B:352:0x169b, B:353:0x16af, B:355:0x16e4, B:356:0x16f7, B:358:0x170b, B:359:0x171f, B:361:0x1759, B:362:0x176d, B:364:0x17a2, B:365:0x17b5, B:367:0x17c9, B:368:0x17dd, B:370:0x180f, B:371:0x1821, B:373:0x1836, B:374:0x1848, B:376:0x185c, B:377:0x1870, B:379:0x189c, B:380:0x18ae, B:382:0x18c3, B:383:0x18d5, B:385:0x1905, B:386:0x1917, B:388:0x192c, B:389:0x193e, B:391:0x1952, B:392:0x1966, B:394:0x1992, B:395:0x19a4, B:397:0x19b8, B:398:0x19cc, B:400:0x1a00, B:401:0x1a12, B:403:0x1a27, B:404:0x1a39, B:406:0x1a4e, B:407:0x1a60, B:409:0x1a7c, B:411:0x1a9d, B:413:0x1ab4, B:415:0x1ae9, B:416:0x1afd, B:418:0x1b47, B:419:0x1b5b, B:421:0x1ba5, B:422:0x1bb9, B:424:0x1c03, B:425:0x1c17, B:428:0x1c77, B:429:0x1c7c, B:430:0x1c7d, B:431:0x1c82, B:167:0x07f4, B:169:0x07fc, B:170:0x0802, B:172:0x0808, B:173:0x080e, B:175:0x0814, B:176:0x081a, B:178:0x0820, B:179:0x0826, B:148:0x0755, B:150:0x075b, B:151:0x0761, B:153:0x0769, B:154:0x0770, B:156:0x0778, B:157:0x0781, B:159:0x0789, B:160:0x078f, B:104:0x04e2, B:106:0x04e8, B:107:0x04ee, B:109:0x04f4, B:110:0x04fa, B:112:0x0500, B:113:0x0506, B:115:0x050c, B:116:0x0512, B:83:0x0444, B:85:0x044a, B:86:0x0450, B:88:0x0456, B:89:0x045c, B:91:0x0462, B:92:0x0468, B:94:0x046e, B:95:0x0474, B:14:0x0151, B:16:0x0174, B:18:0x018f, B:20:0x019e, B:22:0x01a5, B:24:0x01ab, B:25:0x01b1, B:27:0x01b7, B:28:0x01bd, B:30:0x01c3, B:31:0x01c9, B:33:0x01cf, B:34:0x01d5), top: B:435:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07ec A[Catch: all -> 0x1c83, TryCatch #0 {all -> 0x1c83, blocks: (B:3:0x0080, B:5:0x00bc, B:7:0x00d5, B:9:0x00fb, B:10:0x010f, B:13:0x0138, B:35:0x01db, B:38:0x024b, B:41:0x026d, B:43:0x0290, B:46:0x02b0, B:49:0x02d5, B:52:0x02f1, B:55:0x0316, B:58:0x0332, B:61:0x035b, B:64:0x037d, B:67:0x03a2, B:70:0x03be, B:73:0x03e3, B:76:0x03ff, B:78:0x041a, B:79:0x042d, B:82:0x043e, B:96:0x0479, B:98:0x04af, B:100:0x04cb, B:103:0x04dc, B:117:0x0517, B:119:0x05a3, B:122:0x05c5, B:124:0x05e8, B:125:0x05fa, B:127:0x061f, B:128:0x0631, B:130:0x0656, B:131:0x0668, B:133:0x068d, B:134:0x069f, B:136:0x06c4, B:137:0x06d6, B:139:0x06fb, B:140:0x070b, B:142:0x0726, B:143:0x0739, B:145:0x0748, B:161:0x0794, B:163:0x07ca, B:164:0x07dd, B:166:0x07ec, B:180:0x082b, B:183:0x0870, B:185:0x0891, B:187:0x08a6, B:189:0x08ca, B:190:0x08dc, B:192:0x08f0, B:193:0x0904, B:195:0x0936, B:196:0x094a, B:198:0x0986, B:199:0x099a, B:201:0x09cf, B:202:0x09e2, B:204:0x09f6, B:205:0x0a0a, B:207:0x0a46, B:208:0x0a5a, B:210:0x0a8f, B:212:0x0aa7, B:214:0x0abb, B:215:0x0acf, B:217:0x0b09, B:218:0x0b1d, B:220:0x0b52, B:221:0x0b65, B:223:0x0b79, B:224:0x0b8d, B:226:0x0bc7, B:227:0x0bdb, B:229:0x0c15, B:230:0x0c29, B:232:0x0c63, B:233:0x0c77, B:235:0x0cb1, B:236:0x0cc5, B:238:0x0cff, B:239:0x0d13, B:241:0x0d48, B:242:0x0d5b, B:244:0x0d6f, B:245:0x0d83, B:247:0x0dbd, B:248:0x0dd1, B:250:0x0e0b, B:251:0x0e1f, B:253:0x0e54, B:254:0x0e67, B:256:0x0e7b, B:257:0x0e8f, B:259:0x0ec9, B:260:0x0edd, B:262:0x0f17, B:263:0x0f2b, B:265:0x0f65, B:266:0x0f79, B:268:0x0fae, B:269:0x0fc1, B:271:0x0fd5, B:272:0x0fe9, B:274:0x1023, B:275:0x1037, B:277:0x1071, B:278:0x1085, B:280:0x10ba, B:281:0x10cd, B:283:0x10e1, B:284:0x10f5, B:286:0x112f, B:287:0x1143, B:289:0x1178, B:290:0x118b, B:292:0x119f, B:293:0x11b3, B:295:0x11ed, B:296:0x1201, B:298:0x123b, B:299:0x124f, B:301:0x1284, B:302:0x1297, B:304:0x12ab, B:305:0x12bf, B:307:0x12f9, B:308:0x130d, B:310:0x1342, B:311:0x1355, B:313:0x1369, B:314:0x137d, B:316:0x13b7, B:317:0x13cb, B:319:0x1405, B:320:0x1419, B:322:0x144e, B:323:0x1461, B:325:0x1475, B:326:0x1489, B:328:0x14c3, B:329:0x14d7, B:331:0x1509, B:332:0x151b, B:334:0x152f, B:335:0x1543, B:337:0x156f, B:338:0x1581, B:340:0x1595, B:341:0x15a9, B:343:0x15dd, B:344:0x15f1, B:346:0x1626, B:347:0x1639, B:349:0x164d, B:350:0x1661, B:352:0x169b, B:353:0x16af, B:355:0x16e4, B:356:0x16f7, B:358:0x170b, B:359:0x171f, B:361:0x1759, B:362:0x176d, B:364:0x17a2, B:365:0x17b5, B:367:0x17c9, B:368:0x17dd, B:370:0x180f, B:371:0x1821, B:373:0x1836, B:374:0x1848, B:376:0x185c, B:377:0x1870, B:379:0x189c, B:380:0x18ae, B:382:0x18c3, B:383:0x18d5, B:385:0x1905, B:386:0x1917, B:388:0x192c, B:389:0x193e, B:391:0x1952, B:392:0x1966, B:394:0x1992, B:395:0x19a4, B:397:0x19b8, B:398:0x19cc, B:400:0x1a00, B:401:0x1a12, B:403:0x1a27, B:404:0x1a39, B:406:0x1a4e, B:407:0x1a60, B:409:0x1a7c, B:411:0x1a9d, B:413:0x1ab4, B:415:0x1ae9, B:416:0x1afd, B:418:0x1b47, B:419:0x1b5b, B:421:0x1ba5, B:422:0x1bb9, B:424:0x1c03, B:425:0x1c17, B:428:0x1c77, B:429:0x1c7c, B:430:0x1c7d, B:431:0x1c82, B:167:0x07f4, B:169:0x07fc, B:170:0x0802, B:172:0x0808, B:173:0x080e, B:175:0x0814, B:176:0x081a, B:178:0x0820, B:179:0x0826, B:148:0x0755, B:150:0x075b, B:151:0x0761, B:153:0x0769, B:154:0x0770, B:156:0x0778, B:157:0x0781, B:159:0x0789, B:160:0x078f, B:104:0x04e2, B:106:0x04e8, B:107:0x04ee, B:109:0x04f4, B:110:0x04fa, B:112:0x0500, B:113:0x0506, B:115:0x050c, B:116:0x0512, B:83:0x0444, B:85:0x044a, B:86:0x0450, B:88:0x0456, B:89:0x045c, B:91:0x0462, B:92:0x0468, B:94:0x046e, B:95:0x0474, B:14:0x0151, B:16:0x0174, B:18:0x018f, B:20:0x019e, B:22:0x01a5, B:24:0x01ab, B:25:0x01b1, B:27:0x01b7, B:28:0x01bd, B:30:0x01c3, B:31:0x01c9, B:33:0x01cf, B:34:0x01d5), top: B:435:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07f4 A[Catch: all -> 0x1c83, TryCatch #0 {all -> 0x1c83, blocks: (B:3:0x0080, B:5:0x00bc, B:7:0x00d5, B:9:0x00fb, B:10:0x010f, B:13:0x0138, B:35:0x01db, B:38:0x024b, B:41:0x026d, B:43:0x0290, B:46:0x02b0, B:49:0x02d5, B:52:0x02f1, B:55:0x0316, B:58:0x0332, B:61:0x035b, B:64:0x037d, B:67:0x03a2, B:70:0x03be, B:73:0x03e3, B:76:0x03ff, B:78:0x041a, B:79:0x042d, B:82:0x043e, B:96:0x0479, B:98:0x04af, B:100:0x04cb, B:103:0x04dc, B:117:0x0517, B:119:0x05a3, B:122:0x05c5, B:124:0x05e8, B:125:0x05fa, B:127:0x061f, B:128:0x0631, B:130:0x0656, B:131:0x0668, B:133:0x068d, B:134:0x069f, B:136:0x06c4, B:137:0x06d6, B:139:0x06fb, B:140:0x070b, B:142:0x0726, B:143:0x0739, B:145:0x0748, B:161:0x0794, B:163:0x07ca, B:164:0x07dd, B:166:0x07ec, B:180:0x082b, B:183:0x0870, B:185:0x0891, B:187:0x08a6, B:189:0x08ca, B:190:0x08dc, B:192:0x08f0, B:193:0x0904, B:195:0x0936, B:196:0x094a, B:198:0x0986, B:199:0x099a, B:201:0x09cf, B:202:0x09e2, B:204:0x09f6, B:205:0x0a0a, B:207:0x0a46, B:208:0x0a5a, B:210:0x0a8f, B:212:0x0aa7, B:214:0x0abb, B:215:0x0acf, B:217:0x0b09, B:218:0x0b1d, B:220:0x0b52, B:221:0x0b65, B:223:0x0b79, B:224:0x0b8d, B:226:0x0bc7, B:227:0x0bdb, B:229:0x0c15, B:230:0x0c29, B:232:0x0c63, B:233:0x0c77, B:235:0x0cb1, B:236:0x0cc5, B:238:0x0cff, B:239:0x0d13, B:241:0x0d48, B:242:0x0d5b, B:244:0x0d6f, B:245:0x0d83, B:247:0x0dbd, B:248:0x0dd1, B:250:0x0e0b, B:251:0x0e1f, B:253:0x0e54, B:254:0x0e67, B:256:0x0e7b, B:257:0x0e8f, B:259:0x0ec9, B:260:0x0edd, B:262:0x0f17, B:263:0x0f2b, B:265:0x0f65, B:266:0x0f79, B:268:0x0fae, B:269:0x0fc1, B:271:0x0fd5, B:272:0x0fe9, B:274:0x1023, B:275:0x1037, B:277:0x1071, B:278:0x1085, B:280:0x10ba, B:281:0x10cd, B:283:0x10e1, B:284:0x10f5, B:286:0x112f, B:287:0x1143, B:289:0x1178, B:290:0x118b, B:292:0x119f, B:293:0x11b3, B:295:0x11ed, B:296:0x1201, B:298:0x123b, B:299:0x124f, B:301:0x1284, B:302:0x1297, B:304:0x12ab, B:305:0x12bf, B:307:0x12f9, B:308:0x130d, B:310:0x1342, B:311:0x1355, B:313:0x1369, B:314:0x137d, B:316:0x13b7, B:317:0x13cb, B:319:0x1405, B:320:0x1419, B:322:0x144e, B:323:0x1461, B:325:0x1475, B:326:0x1489, B:328:0x14c3, B:329:0x14d7, B:331:0x1509, B:332:0x151b, B:334:0x152f, B:335:0x1543, B:337:0x156f, B:338:0x1581, B:340:0x1595, B:341:0x15a9, B:343:0x15dd, B:344:0x15f1, B:346:0x1626, B:347:0x1639, B:349:0x164d, B:350:0x1661, B:352:0x169b, B:353:0x16af, B:355:0x16e4, B:356:0x16f7, B:358:0x170b, B:359:0x171f, B:361:0x1759, B:362:0x176d, B:364:0x17a2, B:365:0x17b5, B:367:0x17c9, B:368:0x17dd, B:370:0x180f, B:371:0x1821, B:373:0x1836, B:374:0x1848, B:376:0x185c, B:377:0x1870, B:379:0x189c, B:380:0x18ae, B:382:0x18c3, B:383:0x18d5, B:385:0x1905, B:386:0x1917, B:388:0x192c, B:389:0x193e, B:391:0x1952, B:392:0x1966, B:394:0x1992, B:395:0x19a4, B:397:0x19b8, B:398:0x19cc, B:400:0x1a00, B:401:0x1a12, B:403:0x1a27, B:404:0x1a39, B:406:0x1a4e, B:407:0x1a60, B:409:0x1a7c, B:411:0x1a9d, B:413:0x1ab4, B:415:0x1ae9, B:416:0x1afd, B:418:0x1b47, B:419:0x1b5b, B:421:0x1ba5, B:422:0x1bb9, B:424:0x1c03, B:425:0x1c17, B:428:0x1c77, B:429:0x1c7c, B:430:0x1c7d, B:431:0x1c82, B:167:0x07f4, B:169:0x07fc, B:170:0x0802, B:172:0x0808, B:173:0x080e, B:175:0x0814, B:176:0x081a, B:178:0x0820, B:179:0x0826, B:148:0x0755, B:150:0x075b, B:151:0x0761, B:153:0x0769, B:154:0x0770, B:156:0x0778, B:157:0x0781, B:159:0x0789, B:160:0x078f, B:104:0x04e2, B:106:0x04e8, B:107:0x04ee, B:109:0x04f4, B:110:0x04fa, B:112:0x0500, B:113:0x0506, B:115:0x050c, B:116:0x0512, B:83:0x0444, B:85:0x044a, B:86:0x0450, B:88:0x0456, B:89:0x045c, B:91:0x0462, B:92:0x0468, B:94:0x046e, B:95:0x0474, B:14:0x0151, B:16:0x0174, B:18:0x018f, B:20:0x019e, B:22:0x01a5, B:24:0x01ab, B:25:0x01b1, B:27:0x01b7, B:28:0x01bd, B:30:0x01c3, B:31:0x01c9, B:33:0x01cf, B:34:0x01d5), top: B:435:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0870 A[Catch: all -> 0x1c83, TRY_ENTER, TryCatch #0 {all -> 0x1c83, blocks: (B:3:0x0080, B:5:0x00bc, B:7:0x00d5, B:9:0x00fb, B:10:0x010f, B:13:0x0138, B:35:0x01db, B:38:0x024b, B:41:0x026d, B:43:0x0290, B:46:0x02b0, B:49:0x02d5, B:52:0x02f1, B:55:0x0316, B:58:0x0332, B:61:0x035b, B:64:0x037d, B:67:0x03a2, B:70:0x03be, B:73:0x03e3, B:76:0x03ff, B:78:0x041a, B:79:0x042d, B:82:0x043e, B:96:0x0479, B:98:0x04af, B:100:0x04cb, B:103:0x04dc, B:117:0x0517, B:119:0x05a3, B:122:0x05c5, B:124:0x05e8, B:125:0x05fa, B:127:0x061f, B:128:0x0631, B:130:0x0656, B:131:0x0668, B:133:0x068d, B:134:0x069f, B:136:0x06c4, B:137:0x06d6, B:139:0x06fb, B:140:0x070b, B:142:0x0726, B:143:0x0739, B:145:0x0748, B:161:0x0794, B:163:0x07ca, B:164:0x07dd, B:166:0x07ec, B:180:0x082b, B:183:0x0870, B:185:0x0891, B:187:0x08a6, B:189:0x08ca, B:190:0x08dc, B:192:0x08f0, B:193:0x0904, B:195:0x0936, B:196:0x094a, B:198:0x0986, B:199:0x099a, B:201:0x09cf, B:202:0x09e2, B:204:0x09f6, B:205:0x0a0a, B:207:0x0a46, B:208:0x0a5a, B:210:0x0a8f, B:212:0x0aa7, B:214:0x0abb, B:215:0x0acf, B:217:0x0b09, B:218:0x0b1d, B:220:0x0b52, B:221:0x0b65, B:223:0x0b79, B:224:0x0b8d, B:226:0x0bc7, B:227:0x0bdb, B:229:0x0c15, B:230:0x0c29, B:232:0x0c63, B:233:0x0c77, B:235:0x0cb1, B:236:0x0cc5, B:238:0x0cff, B:239:0x0d13, B:241:0x0d48, B:242:0x0d5b, B:244:0x0d6f, B:245:0x0d83, B:247:0x0dbd, B:248:0x0dd1, B:250:0x0e0b, B:251:0x0e1f, B:253:0x0e54, B:254:0x0e67, B:256:0x0e7b, B:257:0x0e8f, B:259:0x0ec9, B:260:0x0edd, B:262:0x0f17, B:263:0x0f2b, B:265:0x0f65, B:266:0x0f79, B:268:0x0fae, B:269:0x0fc1, B:271:0x0fd5, B:272:0x0fe9, B:274:0x1023, B:275:0x1037, B:277:0x1071, B:278:0x1085, B:280:0x10ba, B:281:0x10cd, B:283:0x10e1, B:284:0x10f5, B:286:0x112f, B:287:0x1143, B:289:0x1178, B:290:0x118b, B:292:0x119f, B:293:0x11b3, B:295:0x11ed, B:296:0x1201, B:298:0x123b, B:299:0x124f, B:301:0x1284, B:302:0x1297, B:304:0x12ab, B:305:0x12bf, B:307:0x12f9, B:308:0x130d, B:310:0x1342, B:311:0x1355, B:313:0x1369, B:314:0x137d, B:316:0x13b7, B:317:0x13cb, B:319:0x1405, B:320:0x1419, B:322:0x144e, B:323:0x1461, B:325:0x1475, B:326:0x1489, B:328:0x14c3, B:329:0x14d7, B:331:0x1509, B:332:0x151b, B:334:0x152f, B:335:0x1543, B:337:0x156f, B:338:0x1581, B:340:0x1595, B:341:0x15a9, B:343:0x15dd, B:344:0x15f1, B:346:0x1626, B:347:0x1639, B:349:0x164d, B:350:0x1661, B:352:0x169b, B:353:0x16af, B:355:0x16e4, B:356:0x16f7, B:358:0x170b, B:359:0x171f, B:361:0x1759, B:362:0x176d, B:364:0x17a2, B:365:0x17b5, B:367:0x17c9, B:368:0x17dd, B:370:0x180f, B:371:0x1821, B:373:0x1836, B:374:0x1848, B:376:0x185c, B:377:0x1870, B:379:0x189c, B:380:0x18ae, B:382:0x18c3, B:383:0x18d5, B:385:0x1905, B:386:0x1917, B:388:0x192c, B:389:0x193e, B:391:0x1952, B:392:0x1966, B:394:0x1992, B:395:0x19a4, B:397:0x19b8, B:398:0x19cc, B:400:0x1a00, B:401:0x1a12, B:403:0x1a27, B:404:0x1a39, B:406:0x1a4e, B:407:0x1a60, B:409:0x1a7c, B:411:0x1a9d, B:413:0x1ab4, B:415:0x1ae9, B:416:0x1afd, B:418:0x1b47, B:419:0x1b5b, B:421:0x1ba5, B:422:0x1bb9, B:424:0x1c03, B:425:0x1c17, B:428:0x1c77, B:429:0x1c7c, B:430:0x1c7d, B:431:0x1c82, B:167:0x07f4, B:169:0x07fc, B:170:0x0802, B:172:0x0808, B:173:0x080e, B:175:0x0814, B:176:0x081a, B:178:0x0820, B:179:0x0826, B:148:0x0755, B:150:0x075b, B:151:0x0761, B:153:0x0769, B:154:0x0770, B:156:0x0778, B:157:0x0781, B:159:0x0789, B:160:0x078f, B:104:0x04e2, B:106:0x04e8, B:107:0x04ee, B:109:0x04f4, B:110:0x04fa, B:112:0x0500, B:113:0x0506, B:115:0x050c, B:116:0x0512, B:83:0x0444, B:85:0x044a, B:86:0x0450, B:88:0x0456, B:89:0x045c, B:91:0x0462, B:92:0x0468, B:94:0x046e, B:95:0x0474, B:14:0x0151, B:16:0x0174, B:18:0x018f, B:20:0x019e, B:22:0x01a5, B:24:0x01ab, B:25:0x01b1, B:27:0x01b7, B:28:0x01bd, B:30:0x01c3, B:31:0x01c9, B:33:0x01cf, B:34:0x01d5), top: B:435:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x1c7d A[Catch: all -> 0x1c83, TryCatch #0 {all -> 0x1c83, blocks: (B:3:0x0080, B:5:0x00bc, B:7:0x00d5, B:9:0x00fb, B:10:0x010f, B:13:0x0138, B:35:0x01db, B:38:0x024b, B:41:0x026d, B:43:0x0290, B:46:0x02b0, B:49:0x02d5, B:52:0x02f1, B:55:0x0316, B:58:0x0332, B:61:0x035b, B:64:0x037d, B:67:0x03a2, B:70:0x03be, B:73:0x03e3, B:76:0x03ff, B:78:0x041a, B:79:0x042d, B:82:0x043e, B:96:0x0479, B:98:0x04af, B:100:0x04cb, B:103:0x04dc, B:117:0x0517, B:119:0x05a3, B:122:0x05c5, B:124:0x05e8, B:125:0x05fa, B:127:0x061f, B:128:0x0631, B:130:0x0656, B:131:0x0668, B:133:0x068d, B:134:0x069f, B:136:0x06c4, B:137:0x06d6, B:139:0x06fb, B:140:0x070b, B:142:0x0726, B:143:0x0739, B:145:0x0748, B:161:0x0794, B:163:0x07ca, B:164:0x07dd, B:166:0x07ec, B:180:0x082b, B:183:0x0870, B:185:0x0891, B:187:0x08a6, B:189:0x08ca, B:190:0x08dc, B:192:0x08f0, B:193:0x0904, B:195:0x0936, B:196:0x094a, B:198:0x0986, B:199:0x099a, B:201:0x09cf, B:202:0x09e2, B:204:0x09f6, B:205:0x0a0a, B:207:0x0a46, B:208:0x0a5a, B:210:0x0a8f, B:212:0x0aa7, B:214:0x0abb, B:215:0x0acf, B:217:0x0b09, B:218:0x0b1d, B:220:0x0b52, B:221:0x0b65, B:223:0x0b79, B:224:0x0b8d, B:226:0x0bc7, B:227:0x0bdb, B:229:0x0c15, B:230:0x0c29, B:232:0x0c63, B:233:0x0c77, B:235:0x0cb1, B:236:0x0cc5, B:238:0x0cff, B:239:0x0d13, B:241:0x0d48, B:242:0x0d5b, B:244:0x0d6f, B:245:0x0d83, B:247:0x0dbd, B:248:0x0dd1, B:250:0x0e0b, B:251:0x0e1f, B:253:0x0e54, B:254:0x0e67, B:256:0x0e7b, B:257:0x0e8f, B:259:0x0ec9, B:260:0x0edd, B:262:0x0f17, B:263:0x0f2b, B:265:0x0f65, B:266:0x0f79, B:268:0x0fae, B:269:0x0fc1, B:271:0x0fd5, B:272:0x0fe9, B:274:0x1023, B:275:0x1037, B:277:0x1071, B:278:0x1085, B:280:0x10ba, B:281:0x10cd, B:283:0x10e1, B:284:0x10f5, B:286:0x112f, B:287:0x1143, B:289:0x1178, B:290:0x118b, B:292:0x119f, B:293:0x11b3, B:295:0x11ed, B:296:0x1201, B:298:0x123b, B:299:0x124f, B:301:0x1284, B:302:0x1297, B:304:0x12ab, B:305:0x12bf, B:307:0x12f9, B:308:0x130d, B:310:0x1342, B:311:0x1355, B:313:0x1369, B:314:0x137d, B:316:0x13b7, B:317:0x13cb, B:319:0x1405, B:320:0x1419, B:322:0x144e, B:323:0x1461, B:325:0x1475, B:326:0x1489, B:328:0x14c3, B:329:0x14d7, B:331:0x1509, B:332:0x151b, B:334:0x152f, B:335:0x1543, B:337:0x156f, B:338:0x1581, B:340:0x1595, B:341:0x15a9, B:343:0x15dd, B:344:0x15f1, B:346:0x1626, B:347:0x1639, B:349:0x164d, B:350:0x1661, B:352:0x169b, B:353:0x16af, B:355:0x16e4, B:356:0x16f7, B:358:0x170b, B:359:0x171f, B:361:0x1759, B:362:0x176d, B:364:0x17a2, B:365:0x17b5, B:367:0x17c9, B:368:0x17dd, B:370:0x180f, B:371:0x1821, B:373:0x1836, B:374:0x1848, B:376:0x185c, B:377:0x1870, B:379:0x189c, B:380:0x18ae, B:382:0x18c3, B:383:0x18d5, B:385:0x1905, B:386:0x1917, B:388:0x192c, B:389:0x193e, B:391:0x1952, B:392:0x1966, B:394:0x1992, B:395:0x19a4, B:397:0x19b8, B:398:0x19cc, B:400:0x1a00, B:401:0x1a12, B:403:0x1a27, B:404:0x1a39, B:406:0x1a4e, B:407:0x1a60, B:409:0x1a7c, B:411:0x1a9d, B:413:0x1ab4, B:415:0x1ae9, B:416:0x1afd, B:418:0x1b47, B:419:0x1b5b, B:421:0x1ba5, B:422:0x1bb9, B:424:0x1c03, B:425:0x1c17, B:428:0x1c77, B:429:0x1c7c, B:430:0x1c7d, B:431:0x1c82, B:167:0x07f4, B:169:0x07fc, B:170:0x0802, B:172:0x0808, B:173:0x080e, B:175:0x0814, B:176:0x081a, B:178:0x0820, B:179:0x0826, B:148:0x0755, B:150:0x075b, B:151:0x0761, B:153:0x0769, B:154:0x0770, B:156:0x0778, B:157:0x0781, B:159:0x0789, B:160:0x078f, B:104:0x04e2, B:106:0x04e8, B:107:0x04ee, B:109:0x04f4, B:110:0x04fa, B:112:0x0500, B:113:0x0506, B:115:0x050c, B:116:0x0512, B:83:0x0444, B:85:0x044a, B:86:0x0450, B:88:0x0456, B:89:0x045c, B:91:0x0462, B:92:0x0468, B:94:0x046e, B:95:0x0474, B:14:0x0151, B:16:0x0174, B:18:0x018f, B:20:0x019e, B:22:0x01a5, B:24:0x01ab, B:25:0x01b1, B:27:0x01b7, B:28:0x01bd, B:30:0x01c3, B:31:0x01c9, B:33:0x01cf, B:34:0x01d5), top: B:435:0x0080 }] */
    @Override // defpackage.sx9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wx9 a() {
        /*
            Method dump skipped, instruction units count: 7304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.video.a.a():wx9");
    }

    public final void e(VideoPlayer videoPlayer, Either<Uri, VideoSource> either, p3c p3cVar) {
        VideoSource videoSource;
        if (either != null) {
            iwc iwcVar = fwc.a;
            iwcVar.b(VideoSource.class);
            if (either.b(1)) {
                iwcVar.b(VideoSource.class);
                Object objA = either.a(1);
                objA.getClass();
                videoSource = (VideoSource) objA;
            } else {
                iwcVar.b(Uri.class);
                Object objA2 = either.a(0);
                objA2.getClass();
                videoSource = new VideoSource((Uri) objA2, null, null, null, false, null, 62, null);
            }
        } else {
            videoSource = null;
        }
        u63.Y(b().g, null, null, new j4(videoPlayer, videoSource, p3cVar, null), 3);
    }
}
