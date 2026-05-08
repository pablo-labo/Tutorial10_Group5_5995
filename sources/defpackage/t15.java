package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class t15 implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ AtomicLong b;

    public class a extends u71 {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // defpackage.u71
        public final void a() {
            this.a.run();
        }
    }

    public t15(String str, AtomicLong atomicLong) {
        this.a = str;
        this.b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        threadNewThread.setName(this.a + this.b.getAndIncrement());
        return threadNewThread;
    }
}
