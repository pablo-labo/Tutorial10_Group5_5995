package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u9a {
    public static v9a a;

    public static void a(v9a v9aVar) {
        boolean z;
        synchronized (u9a.class) {
            z = a != null;
        }
        if (z) {
            return;
        }
        synchronized (u9a.class) {
            try {
                if (a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                a = v9aVar;
            } finally {
            }
        }
    }

    public static boolean b(String str) {
        v9a v9aVar;
        synchronized (u9a.class) {
            v9aVar = a;
            if (v9aVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return v9aVar.c(str);
    }
}
