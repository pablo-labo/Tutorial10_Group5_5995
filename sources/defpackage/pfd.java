package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class pfd {
    public static pfd b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration a;

    public static synchronized pfd a() {
        try {
            if (b == null) {
                b = new pfd();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }
}
