package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class a13 {
    public static final Collection<z03> a;

    static {
        try {
            a = a7e.W(v6e.L(Arrays.asList(new AndroidExceptionPreHandler(), new y05()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
