package defpackage;

import androidx.compose.ui.platform.ComposeView;
import androidx.media3.exoplayer.video.a;
import com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.debug.DevMenuModule;
import com.oney.WebRTCModule.b;
import com.oney.WebRTCModule.c;
import defpackage.ay4;
import defpackage.kpg;
import org.webrtc.RenderSynchronizer;
import org.webrtc.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class my1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ my1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CatalystInstanceImpl) obj).lambda$decrementPendingJSCalls$5();
                break;
            case 1:
                b bVar = ((c) obj).a;
                bVar.e.execute(new ed3(i2, bVar, b.EnumC0189b.a));
                break;
            case 2:
                DataStoreFileHandler.clearAllData$lambda$2((DataStoreFileHandler) obj);
                break;
            case 3:
                ((a) obj).g.b();
                break;
            case 4:
                DevMenuModule.reload$lambda$0((DevMenuModule) obj);
                break;
            case 5:
                DeviceEventManagerModule.invokeDefaultBackPressRunnable$lambda$0((tn3) obj);
                break;
            case 6:
                ay4.b bVar2 = (ay4.b) obj;
                if (!bVar2.a) {
                    bVar2.a = true;
                    com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
                    if (aVar == null) {
                        r6.g("ReactChoreographer needs to be initialized.");
                    } else {
                        aVar.b(a.EnumC0132a.c, bVar2.c.Y);
                    }
                }
                break;
            case 7:
                ((com.swmansion.gesturehandler.core.a) obj).l();
                break;
            case 8:
                faa faaVar = (faa) obj;
                faaVar.requestLayout();
                faaVar.invalidate();
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((RenderSynchronizer) obj).lambda$new$0();
                break;
            case 10:
                mud mudVar = (mud) obj;
                int i3 = mud.t0;
                ComposeView composeView = mudVar.M().b;
                composeView.setViewCompositionStrategy(kpg.a.a);
                composeView.setContent(new ah2(-72692563, new he4(mudVar, 9), true));
                mudVar.M().b.setVisibility(0);
                break;
            default:
                ((SurfaceTextureHelper) obj).lambda$forceFrame$3();
                break;
        }
    }
}
