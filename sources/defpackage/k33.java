package defpackage;

import android.os.Bundle;
import com.datadog.android.ndk.internal.NdkCrashLog;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class k33 implements Callable<Void> {
    public final /* synthetic */ long a;
    public final /* synthetic */ g33 b;

    public k33(g33 g33Var, long j) {
        this.b = g33Var;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong(NdkCrashLog.TIMESTAMP_KEY_NAME, this.a);
        this.b.k.g(bundle);
        return null;
    }
}
