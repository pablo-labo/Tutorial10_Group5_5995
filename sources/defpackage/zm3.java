package defpackage;

import android.graphics.Bitmap;
import android.media.metrics.PlaybackStateEvent;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.media3.common.a;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.ui.PlayerView;
import defpackage.mt3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zm3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zm3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        x9e x9eVar;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                DefaultDrmSessionManager.c cVar = (DefaultDrmSessionManager.c) obj2;
                a aVar = (a) obj;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.p != 0 && !cVar.c) {
                    Looper looper = defaultDrmSessionManager.t;
                    looper.getClass();
                    cVar.b = defaultDrmSessionManager.e(looper, cVar.a, aVar, false);
                    defaultDrmSessionManager.n.add(cVar);
                    break;
                }
                break;
            case 1:
                mt3.a aVar2 = (mt3.a) obj;
                try {
                    ((Runnable) obj2).run();
                    mt3 mt3Var = mt3.this;
                    if (a4.f.b(mt3Var, null, a4.V)) {
                        a4.f(mt3Var);
                    }
                } catch (Exception e) {
                    aVar2.a(e);
                    return;
                }
                break;
            case 2:
                ((rj9) obj2).d.reportPlaybackStateEvent((PlaybackStateEvent) obj);
                break;
            case 3:
                ResultReceiver resultReceiver = (ResultReceiver) obj;
                try {
                    x9eVar = (x9e) ((hz8) obj2).get();
                    ka2.o(x9eVar, "SessionResult must not be null");
                } catch (InterruptedException e2) {
                    e = e2;
                    zkd.U("MediaSessionLegacyStub", "Custom command failed", e);
                    x9eVar = new x9e(-1);
                } catch (CancellationException e3) {
                    zkd.U("MediaSessionLegacyStub", "Custom command cancelled", e3);
                    x9eVar = new x9e(1);
                } catch (ExecutionException e4) {
                    e = e4;
                    zkd.U("MediaSessionLegacyStub", "Custom command failed", e);
                    x9eVar = new x9e(-1);
                }
                resultReceiver.send(x9eVar.a, x9eVar.b);
                break;
            default:
                PlayerView.a((PlayerView) obj2, (Bitmap) obj);
                break;
        }
    }
}
