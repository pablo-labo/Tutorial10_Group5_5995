package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final class hqd extends OrientationEventListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ iqd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqd(iqd iqdVar, Context context, Context context2) {
        super(context);
        this.b = iqdVar;
        this.a = context2;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        Activity activity = (Activity) this.a;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) activity.getApplication().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        final int i2 = displayMetrics.widthPixels;
        final int i3 = displayMetrics.heightPixels;
        dlf.a(new Runnable() { // from class: gqd
            @Override // java.lang.Runnable
            public final void run() {
                hqd hqdVar = this.a;
                try {
                    hqdVar.b.g.changeCaptureFormat(i2, i3, 30);
                } catch (Exception unused) {
                }
            }
        });
    }
}
