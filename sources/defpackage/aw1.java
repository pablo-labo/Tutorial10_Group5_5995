package defpackage;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.c27;
import expo.modules.imagepicker.CameraType;
import java.io.Serializable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class aw1 implements ik0<bw1, c27> {
    public final sx9 a;

    public aw1(sx9 sx9Var) {
        sx9Var.getClass();
        this.a = sx9Var;
    }

    @Override // defpackage.ik0
    public final Intent a(wi0 wi0Var, Serializable serializable) {
        bw1 bw1Var = (bw1) serializable;
        bw1Var.getClass();
        Intent intentPutExtra = new Intent(bw1Var.a().getNativeMediaTypes().toCameraIntentAction()).putExtra("output", Uri.parse(bw1Var.b()));
        intentPutExtra.getClass();
        if (wl7.b(bw1Var.a().getNativeMediaTypes().toCameraIntentAction(), "android.media.action.VIDEO_CAPTURE")) {
            intentPutExtra.putExtra("android.intent.extra.durationLimit", bw1Var.a().getVideoMaxDuration());
        }
        if (bw1Var.a().getCameraType() == CameraType.FRONT) {
            intentPutExtra.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
            intentPutExtra.putExtra("android.intent.extras.CAMERA_FACING", 1);
            intentPutExtra.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            return intentPutExtra;
        }
        intentPutExtra.putExtra("android.intent.extras.LENS_FACING_BACK", 1);
        intentPutExtra.putExtra("android.intent.extras.CAMERA_FACING", 0);
        intentPutExtra.putExtra("android.intent.extra.USE_FRONT_CAMERA", false);
        return intentPutExtra;
    }

    @Override // defpackage.ik0
    public final c27 b(Serializable serializable, int i, Intent intent) {
        bw1 bw1Var = (bw1) serializable;
        if (i == 0) {
            return c27.a.a;
        }
        Uri uri = Uri.parse(bw1Var.b());
        uri.getClass();
        ReactApplicationContext reactApplicationContextD = this.a.b().d();
        if (reactApplicationContextD == null) {
            l5.q("React Application Context is null");
            return null;
        }
        ContentResolver contentResolver = reactApplicationContextD.getContentResolver();
        contentResolver.getClass();
        return new c27.c(u63.Z(new Pair(j27.e(contentResolver, uri), uri)));
    }
}
