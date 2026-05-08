package defpackage;

import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import defpackage.r87;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qa0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((gu5) obj).invoke();
                break;
            case 1:
                ynb.X.f.a(new r87.b((r87) obj));
                break;
            case 2:
                ((VideoFrame.I420Buffer) obj).release();
                break;
            case 3:
                MessageQueueThreadImpl.resetPerfStats$lambda$1((MessageQueueThreadImpl) obj);
                break;
            case 4:
                ((rdb) obj).n.start();
                break;
            case 5:
                RNGestureHandlerModule.install$lambda$1((RNGestureHandlerModule) obj);
                break;
            case 6:
                ((euc) obj).b();
                break;
            case 7:
                ((ScreenCapturerAndroid) obj).updateVirtualDisplay();
                break;
            default:
                Toolbar.f fVar = ((Toolbar) obj).E0;
                h hVar = fVar == null ? null : fVar.b;
                if (hVar != null) {
                    hVar.collapseActionView();
                }
                break;
        }
    }
}
