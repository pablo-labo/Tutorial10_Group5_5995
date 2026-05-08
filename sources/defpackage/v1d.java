package defpackage;

import android.view.Choreographer;
import org.webrtc.RenderSynchronizer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v1d implements Choreographer.FrameCallback {
    public final /* synthetic */ RenderSynchronizer a;

    public /* synthetic */ v1d(RenderSynchronizer renderSynchronizer) {
        this.a = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.onDisplayRefreshCycleBegin(j);
    }
}
