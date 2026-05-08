package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.oney.WebRTCModule.WebRTCModule;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.VideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public final class iqd extends f5 {
    public static final /* synthetic */ int l = 0;
    public final Intent i;
    public final hqd j;
    public final Context k;

    public class a extends MediaProjection.Callback {
        public a() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public final void onStop() {
            Log.w("iqd", "Media projection stopped.");
            iqd iqdVar = iqd.this;
            iqdVar.j.disable();
            iqdVar.g();
            ln2 ln2Var = iqdVar.h;
            if (ln2Var != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                String str = (String) ln2Var.b;
                writableMapCreateMap.putString("trackId", str);
                Log.d("ln2", "ended event trackId: " + str);
                ((WebRTCModule) ln2Var.a).sendEvent("mediaStreamTrackEnded", writableMapCreateMap);
            }
        }
    }

    public iqd(Activity activity, int i, int i2, Intent intent) {
        super(i, i2, 30);
        this.i = intent;
        this.k = activity;
        hqd hqdVar = new hqd(this, activity, activity);
        this.j = hqdVar;
        if (hqdVar.canDetectOrientation()) {
            hqdVar.enable();
        }
    }

    @Override // defpackage.f5
    public final VideoCapturer b() {
        return new ScreenCapturerAndroid(this.i, new a());
    }

    @Override // defpackage.f5
    public final void c() {
        int i = bk9.a;
        if (zvg.a().a) {
            Context context = this.k;
            context.stopService(new Intent(context, (Class<?>) bk9.class));
        }
        super.c();
    }

    @Override // defpackage.f5
    public final String d() {
        return "screen-capture";
    }
}
