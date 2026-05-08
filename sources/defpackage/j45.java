package defpackage;

import android.os.Bundle;
import androidx.media3.datasource.b;
import androidx.media3.exoplayer.d;
import androidx.media3.session.r;
import defpackage.e47;
import expo.modules.video.player.VideoPlayer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.video.playbackService.ExpoVideoPlaybackService$registerPlayer$1", f = "ExpoVideoPlaybackService.kt", l = {}, m = "invokeSuspend")
public final class j45 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ VideoPlayer $videoPlayer;
    int label;
    final /* synthetic */ i45 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j45(VideoPlayer videoPlayer, i45 i45Var, lu2<? super j45> lu2Var) {
        super(2, lu2Var);
        this.$videoPlayer = videoPlayer;
        this.this$0 = i45Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new j45(this.$videoPlayer, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((j45) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r rVar;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        d dVar = this.$videoPlayer.X;
        if (this.this$0.W.get(dVar) != null) {
            return j6g.a;
        }
        i45 i45Var = this.this$0;
        i45Var.getClass();
        dVar.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        String strC = p6.c(dVar.hashCode(), "ExpoVideoPlaybackService_");
        zng zngVar = new zng();
        i45 i45Var2 = this.this$0;
        r rVar2 = new r(i45Var, strC, dVar, e47.j(e47.o(i45Var2.a0, i45Var2.Z)), qycVar, qycVar, zngVar, bundle, bundle2, new ws1(new b(i45Var)));
        this.this$0.W.put(dVar, rVar2);
        i45 i45Var3 = this.this$0;
        i45Var3.getClass();
        boolean z = true;
        ka2.k("session is already released", !rVar2.a.k());
        synchronized (i45Var3.a) {
            rVar = (r) i45Var3.f.get(rVar2.a.i);
            if (rVar != null && rVar != rVar2) {
                z = false;
            }
            ka2.k("Session ID should be unique", z);
            i45Var3.f.put(rVar2.a.i, rVar2);
        }
        if (rVar == null) {
            vjg.T(i45Var3.b, new yb3(4, i45Var3, rVar2));
        }
        i45 i45Var4 = this.this$0;
        boolean z2 = this.$videoPlayer.j0;
        i45Var4.getClass();
        u63.Y(i45Var4.k().g, null, null, new k45(i45Var4, dVar, z2, null), 3);
        return j6g.a;
    }
}
