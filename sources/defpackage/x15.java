package defpackage;

import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class x15 {
    public static final b a = new b();
    public static final a b = new a();

    public static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            runnable.run();
        }
    }

    public static final class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            UiThreadUtil.runOnUiThread(runnable);
        }
    }
}
