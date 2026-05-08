package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class z5d {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((f5d) message.obj).recycle();
            return true;
        }
    }

    public final synchronized void a(f5d<?> f5dVar, boolean z) {
        try {
            if (this.a || z) {
                this.b.obtainMessage(1, f5dVar).sendToTarget();
            } else {
                this.a = true;
                f5dVar.recycle();
                this.a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
