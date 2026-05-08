package okhttp3.internal.authenticator;

import defpackage.z92;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.Metadata;
import okhttp3.Authenticator;
import okhttp3.Dns;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JavaNetAuthenticator implements Authenticator {
    public final Dns c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public JavaNetAuthenticator(int i) {
        Dns dns = Dns.a;
        dns.getClass();
        this.c = dns;
    }

    public static InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.a[type.ordinal()]) == 1) {
            return (InetAddress) z92.O0(dns.lookup(httpUrl.d));
        }
        SocketAddress socketAddressAddress = proxy.address();
        socketAddressAddress.getClass();
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        address.getClass();
        return address;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // okhttp3.Authenticator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Request a(okhttp3.Route r22, okhttp3.Response r23) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.authenticator.JavaNetAuthenticator.a(okhttp3.Route, okhttp3.Response):okhttp3.Request");
    }

    public JavaNetAuthenticator() {
        this(0);
    }
}
