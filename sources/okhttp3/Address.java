package okhttp3;

import defpackage.akb;
import defpackage.h5;
import defpackage.ia;
import defpackage.p6;
import defpackage.w40;
import defpackage.wl7;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Address;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Address {
    public final Dns a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final CertificatePinner e;
    public final Authenticator f;
    public final Proxy g;
    public final ProxySelector h;
    public final HttpUrl i;
    public final List<Protocol> j;
    public final List<ConnectionSpec> k;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        str.getClass();
        dns.getClass();
        socketFactory.getClass();
        authenticator.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = dns;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = certificatePinner;
        this.f = authenticator;
        this.g = proxy;
        this.h = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.e(sSLSocketFactory != null ? "https" : "http");
        builder.c(str);
        if (1 > i || i >= 65536) {
            h5.k(p6.c(i, "unexpected port: "));
            throw null;
        }
        builder.e = i;
        this.i = builder.b();
        this.j = Util.x(list);
        this.k = Util.x(list2);
    }

    public final boolean a(Address address) {
        address.getClass();
        return wl7.b(this.a, address.a) && wl7.b(this.f, address.f) && wl7.b(this.j, address.j) && wl7.b(this.k, address.k) && wl7.b(this.h, address.h) && wl7.b(this.g, address.g) && wl7.b(this.c, address.c) && wl7.b(this.d, address.d) && wl7.b(this.e, address.e) && this.i.e == address.i.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return wl7.b(this.i, address.i) && a(address);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + ia.g(this.k, ia.g(this.j, (this.f.hashCode() + ((this.a.hashCode() + akb.d(527, 31, this.i.i)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.i;
        sb.append(httpUrl.d);
        sb.append(':');
        sb.append(httpUrl.e);
        sb.append(", ");
        Proxy proxy = this.g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.h;
        }
        return w40.f(sb, str, '}');
    }
}
