package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class dl1 implements bl1 {
    public static final dl1 a = new dl1();

    @Override // defpackage.bl1
    public final Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
