package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.d;
import defpackage.e47;
import defpackage.mog;
import defpackage.wqf;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class oog implements mog {
    public final WeakReference<VideoPlayer> a;
    public a c;
    public cqf d;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList<SubtitleTrack> e = new ArrayList<>();

    public oog(VideoPlayer videoPlayer) {
        this.a = new WeakReference<>(videoPlayer);
        videoPlayer.b0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a a() {
        a aVar;
        f47<wpf, cqf> f47Var;
        d dVar;
        VideoPlayer videoPlayer = this.a.get();
        a aVar2 = null;
        Object obj = null;
        aVar2 = null;
        dqf dqfVarP = (videoPlayer == null || (dVar = videoPlayer.X) == null) ? null : dVar.P();
        e47<String> e47Var = dqfVarP != null ? dqfVarP.v : null;
        if (dqfVarP == null || (f47Var = dqfVarP.D) == null) {
            aVar = null;
        } else {
            Iterator it = f47Var.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                wpf wpfVar = (wpf) entry.getKey();
                cqf cqfVar = (cqf) entry.getValue();
                if (wpfVar.c == 3) {
                    e47<Integer> e47Var2 = cqfVar.b;
                    e47Var2.getClass();
                    Integer num = (Integer) z92.Q0(e47Var2);
                    if (num != null) {
                        aVar = wpfVar.d[num.intValue()];
                    }
                }
            }
            aVar = null;
        }
        if (e47Var != null) {
            e47.b bVarListIterator = e47Var.listIterator(0);
            bVarListIterator.getClass();
            if (bVarListIterator.hasNext()) {
                String str = (String) bVarListIterator.next();
                Iterator it2 = this.b.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (wl7.b(((a) next).d, str)) {
                        obj = next;
                        break;
                    }
                }
                aVar2 = (a) obj;
            }
        }
        return aVar == null ? aVar2 : aVar;
    }

    public final void b(boolean z) {
        d dVar;
        dqf dqfVarP;
        d dVar2;
        WeakReference<VideoPlayer> weakReference = this.a;
        VideoPlayer videoPlayer = weakReference.get();
        if (videoPlayer == null || (dVar = videoPlayer.X) == null || (dqfVarP = dVar.P()) == null) {
            return;
        }
        dqf dqfVarB = dqfVarP.a().m(3, !z).b();
        if (!z) {
            dqfVarB = dqfVarB.a().d(3).b();
        }
        VideoPlayer videoPlayer2 = weakReference.get();
        if (videoPlayer2 == null || (dVar2 = videoPlayer2.X) == null) {
            return;
        }
        dVar2.v(dqfVarB);
    }

    @Override // defpackage.mog
    public final void onAudioMixingModeChanged(VideoPlayer videoPlayer, AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2) {
        audioMixingMode.getClass();
    }

    @Override // defpackage.mog
    public final void onIsPlayingChanged(VideoPlayer videoPlayer, boolean z, Boolean bool) {
    }

    @Override // defpackage.mog
    public final void onMutedChanged(VideoPlayer videoPlayer, boolean z, Boolean bool) {
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
        this.c = a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mog
    public final void onTracksChanged(VideoPlayer videoPlayer, wqf wqfVar) {
        String str;
        wqfVar.getClass();
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.clear();
        ArrayList<SubtitleTrack> arrayList = this.e;
        arrayList.clear();
        e47.b bVarListIterator = wqfVar.a.listIterator(0);
        bVarListIterator.getClass();
        while (bVarListIterator.hasNext()) {
            wqf.a aVar = (wqf.a) bVarListIterator.next();
            int i = aVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                a aVarA = aVar.a(i2);
                aVarA.getClass();
                if (st9.n(aVarA.n)) {
                    linkedHashMap.put(aVarA, new Pair(aVar.b, Integer.valueOf(i2)));
                    SubtitleTrack.INSTANCE.getClass();
                    String str2 = aVarA.a;
                    SubtitleTrack subtitleTrack = (str2 == null || (str = aVarA.d) == null) ? null : new SubtitleTrack(str2, str, new Locale(str).getDisplayLanguage());
                    if (subtitleTrack != null) {
                        arrayList.add(subtitleTrack);
                    }
                }
            }
        }
        this.c = a();
    }

    @Override // defpackage.mog
    public final void onVideoSourceLoaded(VideoPlayer videoPlayer, VideoSource videoSource, Double d, List<VideoTrack> list, List<SubtitleTrack> list2, List<AudioTrack> list3) {
        mog.a.a(videoPlayer, list, list2, list3);
    }

    @Override // defpackage.mog
    public final void onVideoTrackChanged(VideoPlayer videoPlayer, VideoTrack videoTrack, VideoTrack videoTrack2) {
    }

    @Override // defpackage.mog
    public final void onVolumeChanged(VideoPlayer videoPlayer, float f, Float f2) {
    }
}
