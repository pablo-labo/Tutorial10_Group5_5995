package defpackage;

import android.app.Dialog;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.ui.PlayerView;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.swmansion.gesturehandler.core.l;
import org.webrtc.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CatalystInstanceImpl) obj).lambda$onNativeException$6();
                break;
            case 1:
                DefaultDrmSessionManager.c cVar = (DefaultDrmSessionManager.c) obj;
                if (!cVar.c) {
                    DrmSession drmSession = cVar.b;
                    if (drmSession != null) {
                        drmSession.f(cVar.a);
                    }
                    DefaultDrmSessionManager.this.n.remove(cVar);
                    cVar.c = true;
                    break;
                }
                break;
            case 2:
                w6b w6bVar = (w6b) obj;
                Dialog dialog = w6bVar.b;
                if (dialog != null) {
                    dialog.dismiss();
                }
                w6bVar.b = null;
                break;
            case 3:
                ((PlayerView) obj).invalidate();
                break;
            case 4:
                ((SurfaceTextureHelper) obj).lambda$dispose$6();
                break;
            default:
                ((l) obj).l();
                break;
        }
    }
}
