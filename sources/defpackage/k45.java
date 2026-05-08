package defpackage;

import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.r;
import androidx.media3.session.s;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.video.playbackService.ExpoVideoPlaybackService$setShowNotification$1", f = "ExpoVideoPlaybackService.kt", l = {}, m = "invokeSuspend")
public final class k45 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ExoPlayer $player;
    final /* synthetic */ boolean $showNotification;
    int label;
    final /* synthetic */ i45 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k45(i45 i45Var, ExoPlayer exoPlayer, boolean z, lu2<? super k45> lu2Var) {
        super(2, lu2Var);
        this.this$0 = i45Var;
        this.$player = exoPlayer;
        this.$showNotification = z;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new k45(this.this$0, this.$player, this.$showNotification, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((k45) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        r rVar = (r) this.this$0.W.get(this.$player);
        if (rVar == null || (bundle2 = rVar.a.B) == null || (bundle = bundle2.deepCopy()) == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("showNotification", this.$showNotification);
        r rVar2 = (r) this.this$0.W.get(this.$player);
        if (rVar2 != null) {
            i45 i45Var = this.this$0;
            boolean z = this.$showNotification;
            ExoPlayer exoPlayer = this.$player;
            s sVar = rVar2.a;
            Bundle bundle3 = new Bundle(bundle);
            sVar.B = bundle3;
            sVar.d(new t91(bundle3, 8));
            i45Var.e(rVar2, z && exoPlayer.W());
        }
        return j6g.a;
    }
}
