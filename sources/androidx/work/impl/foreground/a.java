package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Notification b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SystemForegroundService d;

    public a(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.d = systemForegroundService;
        this.a = i;
        this.b = notification;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        int i2 = this.c;
        SystemForegroundService systemForegroundService = this.d;
        Notification notification = this.b;
        int i3 = this.a;
        if (i >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i3, notification, i2);
        } else if (i >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i3, notification, i2);
        } else {
            systemForegroundService.startForeground(i3, notification);
        }
    }
}
