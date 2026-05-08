package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j50 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        p3a<AndroidComposeView> p3aVar = AndroidComposeView.B1;
        synchronized (p3aVar) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = p3aVar.a;
                int i2 = p3aVar.b;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i3];
                        boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                        Class<?> cls = AndroidComposeView.y1;
                        androidComposeView.setShowLayoutBounds(AndroidComposeView.a.a());
                        if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                            AndroidComposeView.M(androidComposeView.getRoot());
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        AndroidComposeView.M(((AndroidComposeView) objArr[i3]).getRoot());
                        i3++;
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
