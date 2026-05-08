package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class tb4 {
    public static final Lazy a = boa.E(qt8.c, a.a);

    public static final class a extends mj8 implements gu5<Handler> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }
}
