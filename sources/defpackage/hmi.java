package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class hmi {
    public final SharedPreferences a;
    public final ScheduledThreadPoolExecutor e;
    public final ArrayDeque<String> d = new ArrayDeque<>();
    public final String b = "topic_operation_queue";
    public final String c = ",";

    public hmi(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = sharedPreferences;
        this.e = scheduledThreadPoolExecutor;
    }

    public static hmi a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        hmi hmiVar = new hmi(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (hmiVar.d) {
            try {
                hmiVar.d.clear();
                String string = hmiVar.a.getString(hmiVar.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(hmiVar.c)) {
                    String[] strArrSplit = string.split(hmiVar.c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            hmiVar.d.add(str);
                        }
                    }
                    return hmiVar;
                }
                return hmiVar;
            } finally {
            }
        }
    }
}
