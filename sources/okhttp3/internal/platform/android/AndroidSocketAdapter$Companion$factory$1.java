package okhttp3.internal.platform.android;

import defpackage.g7;
import defpackage.m6;
import defpackage.wve;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/internal/platform/android/AndroidSocketAdapter$Companion$factory$1", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final boolean b(SSLSocket sSLSocket) {
        return wve.K(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final SocketAdapter c(SSLSocket sSLSocket) {
        AndroidSocketAdapter.Companion companion = AndroidSocketAdapter.f;
        Class<?> cls = sSLSocket.getClass();
        companion.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                g7.l(m6.f(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new AndroidSocketAdapter(superclass);
    }
}
