package defpackage;

import com.facebook.react.modules.appearance.AppearanceModule;
import com.oney.WebRTCModule.g;
import com.swmansion.gesturehandler.core.GestureHandler;
import org.webrtc.EglThread;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pn0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AppearanceModule.setColorScheme$lambda$0((String) obj);
                break;
            case 1:
                ((EglThread) obj).lambda$onRenderWindowOpen$2();
                break;
            case 2:
                faa faaVar = (faa) obj;
                faaVar.requestLayout();
                faaVar.invalidate();
                break;
            case 3:
                ((GestureHandler) obj).e();
                break;
            case 4:
                ((s7f) obj).h();
                break;
            default:
                g gVar = (g) obj;
                try {
                    gVar.d0.removeSink(gVar.c0);
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
