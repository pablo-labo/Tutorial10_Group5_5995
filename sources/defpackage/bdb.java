package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class bdb {
    public final Object a = new Object();
    public Looper b = null;
    public HandlerThread c = null;
    public int d = 0;

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.a) {
            try {
                ka2.q(this.d > 0);
                int i = this.d - 1;
                this.d = i;
                if (i == 0 && (handlerThread = this.c) != null) {
                    handlerThread.quit();
                    this.c = null;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
