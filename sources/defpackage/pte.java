package defpackage;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class pte {
    public static void a(PowerManager.WakeLock wakeLock, String str) {
        String strValueOf = String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        String.valueOf(strValueOf).concat(String.valueOf(str));
    }
}
