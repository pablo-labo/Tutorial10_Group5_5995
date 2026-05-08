package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import defpackage.mog;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zx0 implements AudioManager.OnAudioFocusChangeListener, mog {
    public final gk0 a;
    public AudioFocusRequest d;
    public final d2f b = new d2f(new oj(this, 3));
    public final ArrayList c = new ArrayList();
    public AudioMixingMode e = AudioMixingMode.MIX_WITH_OTHERS;

    @uh3(c = "expo.modules.video.AudioFocusManager$onAudioFocusChange$1", f = "AudioFocusManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return zx0.this.new a(lu2Var);
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
            zx0 zx0Var = zx0.this;
            Iterator it = zx0Var.c.iterator();
            while (it.hasNext()) {
                zx0.a(zx0Var, (WeakReference) it.next());
            }
            zx0.this.d = null;
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.AudioFocusManager$onAudioFocusChange$2", f = "AudioFocusManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return zx0.this.new b(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            zx0 zx0Var = zx0.this;
            Iterator it = zx0Var.c.iterator();
            while (it.hasNext()) {
                zx0.a(zx0Var, (WeakReference) it.next());
            }
            zx0.this.d = null;
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.AudioFocusManager$onAudioFocusChange$3", f = "AudioFocusManager.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ AudioMixingMode $audioMixingMode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AudioMixingMode audioMixingMode, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$audioMixingMode = audioMixingMode;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return zx0.this.new c(this.$audioMixingMode, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            zx0 zx0Var = zx0.this;
            ArrayList<WeakReference> arrayList = zx0Var.c;
            AudioMixingMode audioMixingMode = this.$audioMixingMode;
            for (WeakReference weakReference : arrayList) {
                if (audioMixingMode == AudioMixingMode.DO_NOT_MIX) {
                    zx0.a(zx0Var, weakReference);
                } else {
                    VideoPlayer videoPlayer = (VideoPlayer) weakReference.get();
                    if (videoPlayer != null) {
                        u63.Y(zx0Var.a.g, null, null, new yx0(videoPlayer, null), 3);
                    }
                }
            }
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.video.AudioFocusManager$onAudioFocusChange$4", f = "AudioFocusManager.kt", l = {}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public d(lu2<? super d> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return zx0.this.new d(lu2Var);
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
            zx0 zx0Var = zx0.this;
            Iterator it = zx0Var.c.iterator();
            while (it.hasNext()) {
                VideoPlayer videoPlayer = (VideoPlayer) ((WeakReference) it.next()).get();
                if (videoPlayer != null && !videoPlayer.k0()) {
                    u63.Y(zx0Var.a.g, null, null, new by0(videoPlayer, null), 3);
                }
            }
            return j6g.a;
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AudioMixingMode.values().length];
            try {
                iArr[AudioMixingMode.DUCK_OTHERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioMixingMode.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioMixingMode.DO_NOT_MIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public zx0(gk0 gk0Var) {
        this.a = gk0Var;
    }

    public static final void a(zx0 zx0Var, WeakReference weakReference) {
        zx0Var.getClass();
        VideoPlayer videoPlayer = (VideoPlayer) weakReference.get();
        if (videoPlayer == null || videoPlayer.k0()) {
            return;
        }
        u63.Y(zx0Var.a.g, null, null, new ay0(videoPlayer, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final AudioMixingMode b() {
        List listZ1 = z92.z1(this.c);
        ArrayList arrayList = new ArrayList();
        Iterator it = listZ1.iterator();
        while (true) {
            AudioMixingMode audioMixingMode = null;
            if (!it.hasNext()) {
                break;
            }
            VideoPlayer videoPlayer = (VideoPlayer) ((WeakReference) it.next()).get();
            if (videoPlayer != null) {
                if (!videoPlayer.m0()) {
                    videoPlayer = null;
                }
                if (videoPlayer != null) {
                    audioMixingMode = videoPlayer.q0;
                }
            }
            if (audioMixingMode != null) {
                arrayList.add(audioMixingMode);
            }
        }
        if (arrayList.isEmpty()) {
            return AudioMixingMode.MIX_WITH_OTHERS;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            b0.u("Empty collection can't be reduced.");
            return null;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            AudioMixingMode audioMixingMode2 = (AudioMixingMode) it2.next();
            next = (AudioMixingMode) next;
            if (audioMixingMode2.getPriority() <= next.getPriority()) {
                audioMixingMode2 = null;
            }
            if (audioMixingMode2 != null) {
                next = audioMixingMode2;
            }
        }
        return (AudioMixingMode) next;
    }

    public final boolean c() {
        VideoPlayer videoPlayer;
        List<WeakReference> listZ1 = z92.z1(this.c);
        if ((listZ1 instanceof Collection) && listZ1.isEmpty()) {
            return false;
        }
        for (WeakReference weakReference : listZ1) {
            if (weakReference != null && (videoPlayer = (VideoPlayer) weakReference.get()) != null && ((!videoPlayer.k0() && videoPlayer.m0() && videoPlayer.o0() > 0.0f) || videoPlayer.q0 == AudioMixingMode.DO_NOT_MIX)) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        AudioMixingMode audioMixingModeB = b();
        AudioMixingMode audioMixingMode = AudioMixingMode.MIX_WITH_OTHERS;
        d2f d2fVar = this.b;
        if (audioMixingModeB == audioMixingMode || !c()) {
            AudioFocusRequest audioFocusRequest = this.d;
            if (audioFocusRequest != null) {
                ((AudioManager) d2fVar.getValue()).abandonAudioFocusRequest(audioFocusRequest);
            }
            this.d = null;
            this.e = audioMixingModeB;
            return;
        }
        int i = e.a[audioMixingModeB.ordinal()] != 1 ? 1 : 3;
        AudioFocusRequest audioFocusRequest2 = this.d;
        if (audioFocusRequest2 == null || audioFocusRequest2.getFocusGain() != i) {
            AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(i);
            AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
            builder2.setUsage(1);
            builder2.setContentType(3);
            builder.setOnAudioFocusChangeListener(this);
            AudioFocusRequest audioFocusRequestBuild = builder.setAudioAttributes(builder2.build()).build();
            this.d = audioFocusRequestBuild;
            ((AudioManager) d2fVar.getValue()).requestAudioFocus(audioFocusRequestBuild);
            this.e = audioMixingModeB;
        }
    }

    public final void e() {
        if (c() || b() != this.e) {
            d();
            return;
        }
        AudioFocusRequest audioFocusRequest = this.d;
        if (audioFocusRequest != null) {
            ((AudioManager) this.b.getValue()).abandonAudioFocusRequest(audioFocusRequest);
        }
        this.d = null;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        eu2 eu2Var = this.a.g;
        if (i == -3) {
            u63.Y(eu2Var, null, null, new c(b(), null), 3);
            return;
        }
        if (i == -2) {
            if (b() == AudioMixingMode.MIX_WITH_OTHERS) {
                return;
            }
            u63.Y(eu2Var, null, null, new b(null), 3);
        } else if (i == -1) {
            u63.Y(eu2Var, null, null, new a(null), 3);
        } else {
            if (i != 1) {
                return;
            }
            u63.Y(eu2Var, null, null, new d(null), 3);
        }
    }

    @Override // defpackage.mog
    public final void onAudioMixingModeChanged(VideoPlayer videoPlayer, AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2) {
        audioMixingMode.getClass();
        d();
    }

    @Override // defpackage.mog
    public final void onIsPlayingChanged(VideoPlayer videoPlayer, boolean z, Boolean bool) {
        if (z || c()) {
            if (z && c()) {
                d();
                return;
            }
            return;
        }
        AudioFocusRequest audioFocusRequest = this.d;
        if (audioFocusRequest != null) {
            ((AudioManager) this.b.getValue()).abandonAudioFocusRequest(audioFocusRequest);
        }
        this.d = null;
    }

    @Override // defpackage.mog
    public final void onMutedChanged(VideoPlayer videoPlayer, boolean z, Boolean bool) {
        e();
    }

    @Override // defpackage.mog
    public final void onPlaybackRateChanged(VideoPlayer videoPlayer, float f, Float f2) {
    }

    @Override // defpackage.mog
    public final void onPlayedToEnd(VideoPlayer videoPlayer) {
    }

    @Override // defpackage.mog
    public final void onRenderedFirstFrame(VideoPlayer videoPlayer) {
    }

    @Override // defpackage.mog
    public final void onSourceChanged(VideoPlayer videoPlayer, VideoSource videoSource, VideoSource videoSource2) {
    }

    @Override // defpackage.mog
    public final void onStatusChanged(VideoPlayer videoPlayer, PlayerStatus playerStatus, PlayerStatus playerStatus2, PlaybackError playbackError) {
        playerStatus.getClass();
    }

    @Override // defpackage.mog
    public final void onTimeUpdate(VideoPlayer videoPlayer, TimeUpdate timeUpdate) {
        timeUpdate.getClass();
    }

    @Override // defpackage.mog
    public final void onTrackSelectionParametersChanged(VideoPlayer videoPlayer, dqf dqfVar) {
        dqfVar.getClass();
    }

    @Override // defpackage.mog
    public final void onTracksChanged(VideoPlayer videoPlayer, wqf wqfVar) {
        wqfVar.getClass();
    }

    @Override // defpackage.mog
    public final void onVideoSourceLoaded(VideoPlayer videoPlayer, VideoSource videoSource, Double d2, List<VideoTrack> list, List<SubtitleTrack> list2, List<AudioTrack> list3) {
        mog.a.a(videoPlayer, list, list2, list3);
    }

    @Override // defpackage.mog
    public final void onVideoTrackChanged(VideoPlayer videoPlayer, VideoTrack videoTrack, VideoTrack videoTrack2) {
    }

    @Override // defpackage.mog
    public final void onVolumeChanged(VideoPlayer videoPlayer, float f, Float f2) {
        e();
    }
}
