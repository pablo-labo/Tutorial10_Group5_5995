package defpackage;

import androidx.media3.exoplayer.video.d;
import androidx.media3.session.s;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.oney.WebRTCModule.b;
import org.webrtc.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hy1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CatalystInstanceImpl) obj).lambda$destroy$2();
                break;
            case 1:
                ((b) obj).c(null);
                break;
            case 2:
                ((s) obj).w();
                break;
            case 3:
                d dVar = (d) obj;
                dVar.m--;
                break;
            case 4:
                ((SurfaceTextureHelper) obj).lambda$stopListening$1();
                break;
            default:
                t2h t2hVar = (t2h) obj;
                t2hVar.d.h(new t91(t2hVar, 10));
                break;
        }
    }
}
