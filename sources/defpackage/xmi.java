package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class xmi {
    public static WeakReference<xmi> c;
    public hmi a;
    public final ScheduledThreadPoolExecutor b;

    public xmi(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized eni a() {
        String strPeek;
        eni eniVar;
        hmi hmiVar = this.a;
        synchronized (hmiVar.d) {
            strPeek = hmiVar.d.peek();
        }
        Pattern pattern = eni.d;
        eniVar = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                eniVar = new eni(strArrSplit[0], strArrSplit[1]);
            }
        }
        return eniVar;
    }
}
