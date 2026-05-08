package defpackage;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class e43 implements Thread.UncaughtExceptionHandler {
    public final c33 a;
    public final nbe b;
    public final Thread.UncaughtExceptionHandler c;
    public final s33 d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public e43(c33 c33Var, nbe nbeVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, s33 s33Var) {
        this.a = c33Var;
        this.b = nbeVar;
        this.c = uncaughtExceptionHandler;
        this.d = s33Var;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.a.a(this.b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
        } catch (Throwable th2) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
