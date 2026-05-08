package defpackage;

import androidx.fragment.app.Fragment;
import expo.modules.video.VideoView;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class gab extends Fragment {
    public final VideoView a;
    public final String b = gab.class.getSimpleName() + "_" + UUID.randomUUID();

    public gab(VideoView videoView) {
        this.a = videoView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPictureInPictureModeChanged(boolean z) {
        gdb player;
        super.onPictureInPictureModeChanged(z);
        VideoView videoView = this.a;
        if (!z) {
            videoView.setWillEnterPiP(false);
            videoView.layoutForPiPExit();
            videoView.getOnPictureInPictureStop().invoke(j6g.a);
        } else {
            if (videoView.getWasAutoPaused() && (player = videoView.getPlayerView().getPlayer()) != null) {
                player.u0();
            }
            videoView.layoutForPiPEnter();
            videoView.getOnPictureInPictureStart().invoke(j6g.a);
        }
    }
}
