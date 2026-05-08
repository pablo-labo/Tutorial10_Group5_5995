package okhttp3.internal.connection;

import defpackage.jaa;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.CipherSuite;
import okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConnectionSpecSelector {
    public final List<ConnectionSpec> a;
    public int b;
    public boolean c;
    public boolean d;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        list.getClass();
        this.a = list;
    }

    public final ConnectionSpec a(SSLSocket sSLSocket) throws UnknownServiceException {
        ConnectionSpec connectionSpec;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.b;
        List<ConnectionSpec> list = this.a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = list.get(i2);
            if (connectionSpec.b(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (connectionSpec == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            String string = Arrays.toString(enabledProtocols2);
            string.getClass();
            sb.append(", supported protocols=");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (list.get(i3).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.c = z;
        boolean z2 = this.d;
        String[] strArr = connectionSpec.d;
        String[] strArr2 = connectionSpec.c;
        if (strArr2 != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            enabledCipherSuites2.getClass();
            CipherSuite.b.getClass();
            enabledCipherSuites = Util.o(enabledCipherSuites2, strArr2, CipherSuite.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            enabledProtocols3.getClass();
            enabledProtocols = Util.o(enabledProtocols3, strArr, jaa.a);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        CipherSuite.b.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 cipherSuite$Companion$ORDER_BY_NAME$1 = CipherSuite.c;
        byte[] bArr = Util.a;
        cipherSuite$Companion$ORDER_BY_NAME$1.getClass();
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (cipherSuite$Companion$ORDER_BY_NAME$1.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            enabledCipherSuites.getClass();
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        ConnectionSpec.Builder builder = new ConnectionSpec.Builder(connectionSpec);
        enabledCipherSuites.getClass();
        builder.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        enabledProtocols.getClass();
        builder.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        ConnectionSpec connectionSpecA = builder.a();
        if (connectionSpecA.c() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecA.d);
        }
        if (connectionSpecA.a() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecA.c);
        }
        return connectionSpec;
    }
}
