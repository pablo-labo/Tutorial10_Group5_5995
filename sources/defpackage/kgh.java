package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class kgh {
    public static kgh e;
    public final Context a;
    public final ScheduledExecutorService b;
    public rgh c = new rgh(this);
    public int d = 1;

    public kgh(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized kgh b(Context context) {
        try {
            if (e == null) {
                e = new kgh(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new v8a("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public final synchronized <T> Task<T> a(vih<T> vihVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(vihVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(strValueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.c.b(vihVar)) {
                rgh rghVar = new rgh(this);
                this.c = rghVar;
                rghVar.b(vihVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return vihVar.b.getTask();
    }
}
