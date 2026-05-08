package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.media3.exoplayer.video.VideoSink;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.oney.WebRTCModule.b;
import org.webrtc.RenderSynchronizer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ky1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ky1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CatalystInstanceImpl) obj).lambda$incrementPendingJSCalls$4();
                break;
            case 1:
                int i2 = ComponentActivity.i0;
                ((ComponentActivity) obj).invalidateOptionsMenu();
                break;
            case 2:
                Log.d("com.oney.WebRTCModule.b", "onAudioDevicesRemoved");
                b.this.a();
                break;
            case 3:
                DevLoadingModule.hide$lambda$1((DevLoadingModule) obj);
                break;
            case 4:
                ((ym1) ((i34) obj)).w();
                break;
            case 5:
                UiThreadUtil.assertOnUiThread();
                ((ay4) obj).Y.b = true;
                break;
            case 6:
                ((VideoSink.a) obj).onFirstFrameRendered();
                break;
            case 7:
                ViewGroup viewGroupB = ((qoc) obj).b();
                if (viewGroupB != null) {
                    viewGroupB.removeAllViews();
                    viewGroupB.setId(-1);
                }
                break;
            default:
                ((RenderSynchronizer) obj).lambda$registerListener$1();
                break;
        }
    }
}
