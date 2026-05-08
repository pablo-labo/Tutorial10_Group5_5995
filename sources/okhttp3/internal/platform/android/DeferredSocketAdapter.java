package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeferredSocketAdapter implements SocketAdapter {
    public final Factory a;
    public SocketAdapter b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        boolean b(SSLSocket sSLSocket);

        SocketAdapter c(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        factory.getClass();
        this.a = factory;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            return socketAdapterE.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        list.getClass();
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            socketAdapterE.d(sSLSocket, str, list);
        }
    }

    public final synchronized SocketAdapter e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
