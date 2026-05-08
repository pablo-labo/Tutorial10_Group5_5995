package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a5g implements Executor {
    public static final a5g a;

    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler b;
    public static final /* synthetic */ a5g[] c;

    static {
        a5g a5gVar = new a5g("INSTANCE", 0);
        a = a5gVar;
        c = new a5g[]{a5gVar};
        b = new Handler(Looper.getMainLooper());
    }

    public a5g() {
        throw null;
    }

    public static a5g valueOf(String str) {
        return (a5g) Enum.valueOf(a5g.class, str);
    }

    public static a5g[] values() {
        return (a5g[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
