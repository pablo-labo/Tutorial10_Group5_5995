package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class z3d implements ThreadFactory {

    public static class a extends Thread {
        public final int a;

        public a(Runnable runnable) {
            super(runnable, "fonts-androidx");
            this.a = 10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}
