package okhttp3.internal.proxy;

import defpackage.l5;
import defpackage.u63;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/proxy/NullProxySelector;", "Ljava/net/ProxySelector;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NullProxySelector extends ProxySelector {
    public static final NullProxySelector a = new NullProxySelector();

    private NullProxySelector() {
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return u63.Z(Proxy.NO_PROXY);
        }
        l5.q("uri must not be null");
        return null;
    }
}
