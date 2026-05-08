package okhttp3;

import defpackage.d2f;
import defpackage.gu5;
import defpackage.r40;
import defpackage.r6;
import defpackage.t92;
import defpackage.wl7;
import defpackage.zr4;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Handshake;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Handshake {
    public static final Companion e = new Companion(0);
    public final TlsVersion a;
    public final CipherSuite b;
    public final List<Certificate> c;
    public final d2f d;

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, gu5<? extends List<? extends Certificate>> gu5Var) {
        this.a = tlsVersion;
        this.b = cipherSuite;
        this.c = list;
        this.d = new d2f(new Handshake$peerCertificates$2(gu5Var));
    }

    public final List<Certificate> a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.a == this.a && handshake.b == this.b && wl7.b(handshake.a(), a()) && handshake.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(t92.r0(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(t92.r0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static Handshake a(SSLSession sSLSession) throws IOException {
            Certificate[] peerCertificates;
            List listK = zr4.a;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                r6.g("cipherSuite == null");
                return null;
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                r40.h("cipherSuite == ".concat(cipherSuite));
                return null;
            }
            CipherSuite cipherSuiteB = CipherSuite.b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                r6.g("tlsVersion == null");
                return null;
            }
            if ("NONE".equals(protocol)) {
                r40.h("tlsVersion == NONE");
                return null;
            }
            TlsVersion.a.getClass();
            TlsVersion tlsVersionA = TlsVersion.Companion.a(protocol);
            try {
                peerCertificates = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
            }
            List listK2 = peerCertificates != null ? Util.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK;
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                listK = Util.k(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new Handshake(tlsVersionA, cipherSuiteB, listK, new Handshake$Companion$handshake$1(listK2));
        }

        private Companion() {
        }
    }
}
