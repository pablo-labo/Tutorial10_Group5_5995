package defpackage;

import android.os.Handler;
import androidx.media3.exoplayer.d;

/* JADX INFO: loaded from: classes.dex */
public final class ry0 {
    public final Handler a;
    public final d.a b;

    public ry0(Handler handler, d.a aVar) {
        this.a = handler;
        this.b = aVar;
    }

    public final void a(ak3 ak3Var) {
        synchronized (ak3Var) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new gy0(0, this, ak3Var));
        }
    }
}
