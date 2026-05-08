package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.video.VideoSink;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.oney.WebRTCModule.b;
import java.util.ArrayList;
import org.webrtc.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xn0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context.getSharedPreferences(context.getPackageName() + "_preferences", 0).getString("installed_before", null) == null) {
                    yn0 yn0Var = new yn0(new zn0(), context);
                    yf7 yf7Var = new yf7(context);
                    yf7Var.x0(new z(yn0Var, yf7Var));
                }
                break;
            case 1:
                ((CatalystInstanceImpl) obj).lambda$destroy$0();
                break;
            case 2:
                Log.d("com.oney.WebRTCModule.b", "onAudioDevicesAdded");
                b.this.a();
                break;
            case 3:
                ((DefaultDrmSession) obj).f(null);
                break;
            case 4:
                ds5.c(4, (ArrayList) obj);
                break;
            case 5:
                ((Callback) obj).invoke(Boolean.TRUE);
                break;
            case 6:
                ro9 ro9Var = (ro9) obj;
                Rect rect = new Rect();
                ro9Var.getHitRect(rect);
                ViewParent parent = ro9Var.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setTouchDelegate(new TouchDelegate(rect, ro9Var));
                }
                break;
            case 7:
                ((VideoSink.a) obj).f();
                break;
            default:
                ((SurfaceTextureHelper) obj).lambda$returnTextureFrame$5();
                break;
        }
    }
}
