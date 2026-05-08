package defpackage;

import android.app.NotificationManager;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.video.playbackService.ExpoVideoPlaybackService$unregisterPlayer$1", f = "ExpoVideoPlaybackService.kt", l = {}, m = "invokeSuspend")
public final class l45 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ExoPlayer $player;
    int label;
    final /* synthetic */ i45 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l45(i45 i45Var, ExoPlayer exoPlayer, lu2<? super l45> lu2Var) {
        super(2, lu2Var);
        this.this$0 = i45Var;
        this.$player = exoPlayer;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new l45(this.this$0, this.$player, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((l45) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        i45 i45Var = this.this$0;
        ExoPlayer exoPlayer = this.$player;
        int i = i45.b0;
        Object systemService = i45Var.getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(exoPlayer.hashCode());
        r rVar = (r) this.this$0.W.remove(this.$player);
        if (rVar != null) {
            rVar.b();
        }
        boolean zIsEmpty = this.this$0.W.isEmpty();
        i45 i45Var2 = this.this$0;
        if (zIsEmpty) {
            i45Var2.j();
            this.this$0.stopSelf();
        } else {
            i45.i(i45Var2, i45.h(i45Var2));
        }
        return j6g.a;
    }
}
