package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import defpackage.nd7;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements nd7<b> {

    public static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    @Override // defpackage.nd7
    public final b create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: qrb
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new aj6(applicationContext, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new b();
    }

    @Override // defpackage.nd7
    public final List<Class<? extends nd7<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
