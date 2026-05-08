package defpackage;

import expo.modules.video.player.VideoPlayer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.video.AudioFocusManager$duckPlayer$1$1", f = "AudioFocusManager.kt", l = {}, m = "invokeSuspend")
public final class yx0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ VideoPlayer $player;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(VideoPlayer videoPlayer, lu2<? super yx0> lu2Var) {
        super(2, lu2Var);
        this.$player = videoPlayer;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new yx0(this.$player, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((yx0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        VideoPlayer videoPlayer = this.$player;
        videoPlayer.B0(videoPlayer.o0() / 2.0f);
        return j6g.a;
    }
}
