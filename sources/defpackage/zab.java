package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class zab {
    public static final zab b;
    public final Constructor<MethodHandles.Lookup> a;

    public static final class a extends zab {

        /* JADX INFO: renamed from: zab$a$a, reason: collision with other inner class name */
        public static final class ExecutorC0489a implements Executor {
            public final Handler a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        @Override // defpackage.zab
        public final Executor a() {
            return new ExecutorC0489a();
        }
    }

    static {
        b = "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new zab();
    }

    public zab() {
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        try {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.a = declaredConstructor;
    }

    public Executor a() {
        return null;
    }
}
