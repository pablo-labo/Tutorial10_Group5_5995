package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.measurement.AppMeasurementReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class kzh {
    public final AppMeasurementReceiver a;

    public kzh(AppMeasurementReceiver appMeasurementReceiver) {
        this.a = appMeasurementReceiver;
    }

    public static boolean a(Context context) {
        ActivityInfo receiverInfo;
        fib.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
