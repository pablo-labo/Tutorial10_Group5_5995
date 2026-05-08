package defpackage;

import expo.modules.video.player.VideoPlayer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.video.player.VideoPlayerKeepAwake$disable$1", f = "VideoPlayerKeepAwake.kt", l = {}, m = "invokeSuspend")
public final class jog extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ log this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jog(log logVar, lu2<? super jog> lu2Var) {
        super(2, lu2Var);
        this.this$0 = logVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new jog(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((jog) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        iog iogVar;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        VideoPlayer videoPlayer = this.this$0.b.get();
        if (videoPlayer != null && (iogVar = this.this$0.d) != null) {
            videoPlayer.X.x0(iogVar);
            this.this$0.d = null;
            yng.a.getClass();
            yng.f.remove(videoPlayer);
            yng.a();
            return j6g.a;
        }
        return j6g.a;
    }
}
