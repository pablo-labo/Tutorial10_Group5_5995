package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/tls/TrustRootIndex;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TrustRootIndex {
    X509Certificate a(X509Certificate x509Certificate);
}
