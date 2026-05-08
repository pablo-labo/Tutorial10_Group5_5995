package defpackage;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ujg implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ujg(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte[] bArr = Util.a;
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}
