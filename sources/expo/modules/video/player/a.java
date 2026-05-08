package expo.modules.video.player;

import defpackage.dqf;
import defpackage.ia;
import defpackage.wl7;
import defpackage.wqf;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.AudioTrackChangedEventPayload;
import expo.modules.video.records.AvailableAudioTracksChangedEventPayload;
import expo.modules.video.records.AvailableSubtitleTracksChangedEventPayload;
import expo.modules.video.records.IsPlayingEventPayload;
import expo.modules.video.records.MutedChangedEventPayload;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.PlaybackRateChangedEventPayload;
import expo.modules.video.records.SourceChangedEventPayload;
import expo.modules.video.records.StatusChangedEventPayload;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.SubtitleTrackChangedEventPayload;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoEventPayload;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoSourceLoadedEventPayload;
import expo.modules.video.records.VideoTrack;
import expo.modules.video.records.VideoTrackChangedEventPayload;
import expo.modules.video.records.VolumeChangedEventPayload;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public final boolean a = true;

    /* JADX INFO: renamed from: expo.modules.video.player.a$a, reason: collision with other inner class name */
    public static final class C0223a extends a {
        public final AudioMixingMode b;
        public final AudioMixingMode c;
        public final String d;

        public C0223a(AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2) {
            audioMixingMode.getClass();
            this.b = audioMixingMode;
            this.c = audioMixingMode2;
            this.d = "audioMixingModeChange";
        }

        @Override // expo.modules.video.player.a
        public final boolean a() {
            return false;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0223a)) {
                return false;
            }
            C0223a c0223a = (C0223a) obj;
            return this.b == c0223a.b && this.c == c0223a.c;
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            AudioMixingMode audioMixingMode = this.c;
            return iHashCode + (audioMixingMode == null ? 0 : audioMixingMode.hashCode());
        }

        public final String toString() {
            return "AudioMixingModeChanged(audioMixingMode=" + this.b + ", oldAudioMixingMode=" + this.c + ")";
        }
    }

    public static final class b extends a {
        public final AudioTrack b;
        public final AudioTrack c;
        public final String d = "audioTrackChange";
        public final AudioTrackChangedEventPayload e;

        public b(AudioTrack audioTrack, AudioTrack audioTrack2) {
            this.b = audioTrack;
            this.c = audioTrack2;
            this.e = new AudioTrackChangedEventPayload(audioTrack, audioTrack2);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            AudioTrack audioTrack = this.b;
            int iHashCode = (audioTrack == null ? 0 : audioTrack.hashCode()) * 31;
            AudioTrack audioTrack2 = this.c;
            return iHashCode + (audioTrack2 != null ? audioTrack2.hashCode() : 0);
        }

        public final String toString() {
            return "AudioTrackChanged(audioTrack=" + this.b + ", oldAudioTrack=" + this.c + ")";
        }
    }

    public static final class c extends a {
        public final List<AudioTrack> b;
        public final ArrayList c;
        public final String d;
        public final AvailableAudioTracksChangedEventPayload e;

        public c(ArrayList arrayList, ArrayList arrayList2) {
            arrayList.getClass();
            this.b = arrayList;
            this.c = arrayList2;
            this.d = "availableAudioTracksChange";
            this.e = new AvailableAudioTracksChangedEventPayload(arrayList, arrayList2);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "AvailableAudioTracksChanged(availableAudioTracks=" + this.b + ", oldAvailableAudioTracks=" + this.c + ")";
        }
    }

    public static final class d extends a {
        public final List<SubtitleTrack> b;
        public final ArrayList c;
        public final String d;
        public final AvailableSubtitleTracksChangedEventPayload e;

        public d(ArrayList arrayList, ArrayList arrayList2) {
            arrayList.getClass();
            this.b = arrayList;
            this.c = arrayList2;
            this.d = "availableSubtitleTracksChange";
            this.e = new AvailableSubtitleTracksChangedEventPayload(arrayList, arrayList2);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.b, dVar.b) && wl7.b(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "AvailableSubtitleTracksChanged(availableSubtitleTracks=" + this.b + ", oldAvailableSubtitleTracks=" + this.c + ")";
        }
    }

    public static final class e extends a {
        public final boolean b;
        public final Boolean c;
        public final String d = "playingChange";
        public final IsPlayingEventPayload e;

        public e(boolean z, Boolean bool) {
            this.b = z;
            this.c = bool;
            this.e = new IsPlayingEventPayload(z, bool);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && wl7.b(this.c, eVar.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.b) * 31;
            Boolean bool = this.c;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "IsPlayingChanged(isPlaying=" + this.b + ", oldIsPlaying=" + this.c + ")";
        }
    }

    public static final class f extends a {
        public final boolean b;
        public final Boolean c;
        public final String d = "mutedChange";
        public final MutedChangedEventPayload e;

        public f(boolean z, Boolean bool) {
            this.b = z;
            this.c = bool;
            this.e = new MutedChangedEventPayload(z, bool);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && wl7.b(this.c, fVar.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.b) * 31;
            Boolean bool = this.c;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "MutedChanged(muted=" + this.b + ", oldMuted=" + this.c + ")";
        }
    }

    public static final class g extends a {
        public final float b;
        public final Float c;
        public final String d = "playbackRateChange";
        public final PlaybackRateChangedEventPayload e;

        public g(float f, Float f2) {
            this.b = f;
            this.c = f2;
            this.e = new PlaybackRateChangedEventPayload(f, f2);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.b, gVar.b) == 0 && wl7.b(this.c, gVar.c);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.b) * 31;
            Float f = this.c;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public final String toString() {
            return "PlaybackRateChanged(rate=" + this.b + ", oldRate=" + this.c + ")";
        }
    }

    public static final class h extends a {
        public final String b = "playToEnd";

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.b;
        }
    }

    public static final class i extends a {
        public final String b = "renderFirstFrame";

        @Override // expo.modules.video.player.a
        public final boolean a() {
            return false;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.b;
        }
    }

    public static final class j extends a {
        public final VideoSource b;
        public final VideoSource c;
        public final String d = "sourceChange";
        public final SourceChangedEventPayload e;

        public j(VideoSource videoSource, VideoSource videoSource2) {
            this.b = videoSource;
            this.c = videoSource2;
            this.e = new SourceChangedEventPayload(videoSource, videoSource2);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return wl7.b(this.b, jVar.b) && wl7.b(this.c, jVar.c);
        }

        public final int hashCode() {
            VideoSource videoSource = this.b;
            int iHashCode = (videoSource == null ? 0 : videoSource.hashCode()) * 31;
            VideoSource videoSource2 = this.c;
            return iHashCode + (videoSource2 != null ? videoSource2.hashCode() : 0);
        }

        public final String toString() {
            return "SourceChanged(source=" + this.b + ", oldSource=" + this.c + ")";
        }
    }

    public static final class k extends a {
        public final PlayerStatus b;
        public final PlayerStatus c;
        public final PlaybackError d;
        public final String e;
        public final StatusChangedEventPayload f;

        public k(PlayerStatus playerStatus, PlayerStatus playerStatus2, PlaybackError playbackError) {
            playerStatus.getClass();
            this.b = playerStatus;
            this.c = playerStatus2;
            this.d = playbackError;
            this.e = "statusChange";
            this.f = new StatusChangedEventPayload(playerStatus, playerStatus2, playbackError);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.f;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.b == kVar.b && this.c == kVar.c && wl7.b(this.d, kVar.d);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            PlayerStatus playerStatus = this.c;
            int iHashCode2 = (iHashCode + (playerStatus == null ? 0 : playerStatus.hashCode())) * 31;
            PlaybackError playbackError = this.d;
            return iHashCode2 + (playbackError != null ? playbackError.hashCode() : 0);
        }

        public final String toString() {
            return "StatusChanged(status=" + this.b + ", oldStatus=" + this.c + ", error=" + this.d + ")";
        }
    }

    public static final class l extends a {
        public final SubtitleTrack b;
        public final SubtitleTrack c;
        public final String d = "subtitleTrackChange";
        public final SubtitleTrackChangedEventPayload e;

        public l(SubtitleTrack subtitleTrack, SubtitleTrack subtitleTrack2) {
            this.b = subtitleTrack;
            this.c = subtitleTrack2;
            this.e = new SubtitleTrackChangedEventPayload(subtitleTrack, subtitleTrack2);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return wl7.b(this.b, lVar.b) && wl7.b(this.c, lVar.c);
        }

        public final int hashCode() {
            SubtitleTrack subtitleTrack = this.b;
            int iHashCode = (subtitleTrack == null ? 0 : subtitleTrack.hashCode()) * 31;
            SubtitleTrack subtitleTrack2 = this.c;
            return iHashCode + (subtitleTrack2 != null ? subtitleTrack2.hashCode() : 0);
        }

        public final String toString() {
            return "SubtitleTrackChanged(subtitleTrack=" + this.b + ", oldSubtitleTrack=" + this.c + ")";
        }
    }

    public static final class m extends a {
        public final TimeUpdate b;
        public final String c = "timeUpdate";
        public final TimeUpdate d;

        public m(TimeUpdate timeUpdate) {
            this.b = timeUpdate;
            this.d = timeUpdate;
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.d;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && wl7.b(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TimeUpdated(timeUpdate=" + this.b + ")";
        }
    }

    public static final class n extends a {
        public final dqf b;
        public final String c;

        public n(dqf dqfVar) {
            dqfVar.getClass();
            this.b = dqfVar;
            this.c = "trackSelectionParametersChange";
        }

        @Override // expo.modules.video.player.a
        public final boolean a() {
            return false;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && wl7.b(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TrackSelectionParametersChanged(trackSelectionParameters=" + this.b + ")";
        }
    }

    public static final class o extends a {
        public final wqf b;
        public final String c;

        public o(wqf wqfVar) {
            wqfVar.getClass();
            this.b = wqfVar;
            this.c = "tracksChange";
        }

        @Override // expo.modules.video.player.a
        public final boolean a() {
            return false;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && wl7.b(this.b, ((o) obj).b);
        }

        public final int hashCode() {
            return this.b.a.hashCode();
        }

        public final String toString() {
            return "TracksChanged(tracks=" + this.b + ")";
        }
    }

    public static final class p extends a {
        public final VideoSource b;
        public final double c;
        public final List<VideoTrack> d;
        public final List<SubtitleTrack> e;
        public final List<AudioTrack> f;
        public final String g;
        public final VideoSourceLoadedEventPayload h;

        public p(VideoSource videoSource, double d, List list, ArrayList arrayList, ArrayList arrayList2) {
            list.getClass();
            arrayList.getClass();
            arrayList2.getClass();
            this.b = videoSource;
            this.c = d;
            this.d = list;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = "sourceLoad";
            this.h = new VideoSourceLoadedEventPayload(videoSource, d, list, arrayList, arrayList2);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.h;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return wl7.b(this.b, pVar.b) && Double.compare(this.c, pVar.c) == 0 && wl7.b(this.d, pVar.d) && wl7.b(this.e, pVar.e) && wl7.b(this.f, pVar.f);
        }

        public final int hashCode() {
            VideoSource videoSource = this.b;
            return this.f.hashCode() + ia.g(this.e, ia.g(this.d, (Double.hashCode(this.c) + ((videoSource == null ? 0 : videoSource.hashCode()) * 31)) * 31, 31), 31);
        }

        public final String toString() {
            return "VideoSourceLoaded(videoSource=" + this.b + ", duration=" + this.c + ", availableVideoTracks=" + this.d + ", availableSubtitleTracks=" + this.e + ", availableAudioTracks=" + this.f + ")";
        }
    }

    public static final class q extends a {
        public final VideoTrack b;
        public final VideoTrack c;
        public final String d = "videoTrackChange";
        public final VideoTrackChangedEventPayload e;

        public q(VideoTrack videoTrack, VideoTrack videoTrack2) {
            this.b = videoTrack;
            this.c = videoTrack2;
            this.e = new VideoTrackChangedEventPayload(videoTrack, videoTrack2);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return wl7.b(this.b, qVar.b) && wl7.b(this.c, qVar.c);
        }

        public final int hashCode() {
            VideoTrack videoTrack = this.b;
            int iHashCode = (videoTrack == null ? 0 : videoTrack.hashCode()) * 31;
            VideoTrack videoTrack2 = this.c;
            return iHashCode + (videoTrack2 != null ? videoTrack2.hashCode() : 0);
        }

        public final String toString() {
            return "VideoTrackChanged(videoTrack=" + this.b + ", oldVideoTrack=" + this.c + ")";
        }
    }

    public static final class r extends a {
        public final float b;
        public final Float c;
        public final String d = "volumeChange";
        public final VolumeChangedEventPayload e;

        public r(float f, Float f2) {
            this.b = f;
            this.c = f2;
            this.e = new VolumeChangedEventPayload(f, f2);
        }

        @Override // expo.modules.video.player.a
        public final VideoEventPayload b() {
            return this.e;
        }

        @Override // expo.modules.video.player.a
        public final String c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return Float.compare(this.b, rVar.b) == 0 && wl7.b(this.c, rVar.c);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.b) * 31;
            Float f = this.c;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public final String toString() {
            return "VolumeChanged(volume=" + this.b + ", oldVolume=" + this.c + ")";
        }
    }

    public boolean a() {
        return this.a;
    }

    public VideoEventPayload b() {
        return null;
    }

    public abstract String c();
}
