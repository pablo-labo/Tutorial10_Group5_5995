package defpackage;

import java.lang.Thread;

/* JADX INFO: loaded from: classes2.dex */
public final class g0i implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ a0i b;

    public g0i(a0i a0iVar, String str) {
        this.b = a0iVar;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.zzr().f.a(th, this.a);
    }
}
