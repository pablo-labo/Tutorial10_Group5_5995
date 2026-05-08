package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class lgh {
    public final FirebaseInstanceId a;
    public final Context b;
    public final xih c;
    public final nli d;
    public final ScheduledThreadPoolExecutor f;
    public final xmi h;
    public final ht0 e = new ht0();
    public boolean g = false;

    public lgh(FirebaseInstanceId firebaseInstanceId, xih xihVar, xmi xmiVar, nli nliVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = firebaseInstanceId;
        this.c = xihVar;
        this.h = xmiVar;
        this.d = nliVar;
        this.b = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static <T> T a(Task<T> task) throws IOException {
        try {
            return (T) Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    public final void b(long j) {
        this.f.schedule(new xgh(this, this.b, this.c, Math.min(Math.max(30L, j << 1), 28800L)), j, TimeUnit.SECONDS);
        c(true);
    }

    public final synchronized void c(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7 A[Catch: IOException -> 0x0090, TryCatch #4 {IOException -> 0x0090, blocks: (B:15:0x0029, B:32:0x00e7, B:34:0x00ef, B:20:0x003b, B:22:0x0043, B:24:0x006d, B:27:0x0093, B:29:0x009b, B:31:0x00c5), top: B:90:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgh.d():boolean");
    }
}
