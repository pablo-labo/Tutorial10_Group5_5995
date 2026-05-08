package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class n2f implements d82 {
    @Override // defpackage.d82
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.d82
    public final long b() {
        return SystemClock.uptimeMillis();
    }

    @Override // defpackage.d82
    public final t2f c(Looper looper, Handler.Callback callback) {
        return new t2f(new Handler(looper, callback));
    }

    @Override // defpackage.d82
    public final long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.d82
    public final long e() {
        return System.nanoTime();
    }
}
