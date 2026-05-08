package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class ft4 {
    public static final xue a = new xue();
    public static volatile boolean b = false;

    public static class a implements Runnable {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ft4.a.f(this.a);
        }
    }
}
