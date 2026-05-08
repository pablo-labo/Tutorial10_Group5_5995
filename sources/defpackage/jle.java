package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class jle {
    public static jle b;
    public final Object a = new Object();

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            jle jleVar = jle.this;
            b bVar = (b) message.obj;
            synchronized (jleVar.a) {
                try {
                    if (bVar == null) {
                        bVar.getClass();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    public static class b {
    }

    public jle() {
        new Handler(Looper.getMainLooper(), new a());
    }
}
