package okhttp3;

import defpackage.jaa;
import defpackage.l5;
import defpackage.m6;
import defpackage.z92;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConnectionSpec {
    public static final ConnectionSpec e;
    public static final ConnectionSpec f;
    public static final ConnectionSpec g;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        new Companion(0);
        CipherSuite cipherSuite = CipherSuite.r;
        CipherSuite cipherSuite2 = CipherSuite.s;
        CipherSuite cipherSuite3 = CipherSuite.t;
        CipherSuite cipherSuite4 = CipherSuite.l;
        CipherSuite cipherSuite5 = CipherSuite.n;
        CipherSuite cipherSuite6 = CipherSuite.m;
        CipherSuite cipherSuite7 = CipherSuite.o;
        CipherSuite cipherSuite8 = CipherSuite.q;
        CipherSuite cipherSuite9 = CipherSuite.p;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.j, CipherSuite.k, CipherSuite.h, CipherSuite.i, CipherSuite.f, CipherSuite.g, CipherSuite.e};
        Builder builder = new Builder(true);
        builder.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.e(tlsVersion, tlsVersion2);
        builder.d = true;
        e = builder.a();
        Builder builder2 = new Builder(true);
        builder2.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder2.e(tlsVersion, tlsVersion2);
        builder2.d = true;
        f = builder2.a();
        Builder builder3 = new Builder(true);
        builder3.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder3.e(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        builder3.d = true;
        builder3.a();
        g = new Builder(false).a();
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List<CipherSuite> a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.b.b(str));
        }
        return z92.z1(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !Util.i(strArr, sSLSocket.getEnabledProtocols(), jaa.a)) {
            return false;
        }
        String[] strArr2 = this.c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        CipherSuite.b.getClass();
        return Util.i(strArr2, enabledCipherSuites, CipherSuite.c);
    }

    public final List<TlsVersion> c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.a.getClass();
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return z92.z1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = connectionSpec.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, connectionSpec.c) && Arrays.equals(this.d, connectionSpec.d) && this.b == connectionSpec.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return m6.i(sb, this.b, ')');
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "()V", "APPROVED_CIPHER_SUITES", "", "Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "CLEARTEXT", "Lokhttp3/ConnectionSpec;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public final boolean a;
        public String[] b;
        public String[] c;
        public boolean d;

        public Builder(ConnectionSpec connectionSpec) {
            connectionSpec.getClass();
            this.a = connectionSpec.a;
            this.b = connectionSpec.c;
            this.c = connectionSpec.d;
            this.d = connectionSpec.b;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.a, this.d, this.b, this.c);
        }

        public final void b(String... strArr) {
            if (!this.a) {
                l5.q("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
            } else {
                l5.q("At least one cipher suite is required");
            }
        }

        public final void c(CipherSuite... cipherSuiteArr) {
            if (!this.a) {
                l5.q("no cipher suites for cleartext connections");
                return;
            }
            ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
            for (CipherSuite cipherSuite : cipherSuiteArr) {
                arrayList.add(cipherSuite.a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d(String... strArr) {
            if (!this.a) {
                l5.q("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
            } else {
                l5.q("At least one TLS version is required");
            }
        }

        public final void e(TlsVersion... tlsVersionArr) {
            if (!this.a) {
                l5.q("no TLS versions for cleartext connections");
                return;
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public Builder(boolean z) {
            this.a = z;
        }
    }
}
