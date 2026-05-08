package defpackage;

import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface mog {

    public static final class a {
        public static void a(VideoPlayer videoPlayer, List list, List list2, List list3) {
            videoPlayer.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
        }
    }

    void onAudioMixingModeChanged(VideoPlayer videoPlayer, AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2);

    void onIsPlayingChanged(VideoPlayer videoPlayer, boolean z, Boolean bool);

    void onMutedChanged(VideoPlayer videoPlayer, boolean z, Boolean bool);

    void onPlaybackRateChanged(VideoPlayer videoPlayer, float f, Float f2);

    void onPlayedToEnd(VideoPlayer videoPlayer);

    void onRenderedFirstFrame(VideoPlayer videoPlayer);

    void onSourceChanged(VideoPlayer videoPlayer, VideoSource videoSource, VideoSource videoSource2);

    void onStatusChanged(VideoPlayer videoPlayer, PlayerStatus playerStatus, PlayerStatus playerStatus2, PlaybackError playbackError);

    void onTimeUpdate(VideoPlayer videoPlayer, TimeUpdate timeUpdate);

    void onTrackSelectionParametersChanged(VideoPlayer videoPlayer, dqf dqfVar);

    void onTracksChanged(VideoPlayer videoPlayer, wqf wqfVar);

    void onVideoSourceLoaded(VideoPlayer videoPlayer, VideoSource videoSource, Double d, List<VideoTrack> list, List<SubtitleTrack> list2, List<AudioTrack> list3);

    void onVideoTrackChanged(VideoPlayer videoPlayer, VideoTrack videoTrack, VideoTrack videoTrack2);

    void onVolumeChanged(VideoPlayer videoPlayer, float f, Float f2);
}
