package defpackage;

import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class yfh implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yfh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Process.setThreadPriority(0);
                ((Runnable) obj).run();
                break;
            default:
                amh amhVar = (amh) obj;
                String action = amhVar.a.getAction();
                StringBuilder sb = new StringBuilder(uz.c(61, action));
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                Log.w("FirebaseInstanceId", sb.toString());
                amhVar.b.trySetResult(null);
                break;
        }
    }
}
