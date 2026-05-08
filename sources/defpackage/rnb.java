package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class rnb implements ThreadFactory {
    public final String a;
    public final AtomicInteger b = new AtomicInteger(1);

    public rnb(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        return new Thread(new zf3(7, this, runnable), this.a + "-" + this.b.getAndIncrement());
    }
}
