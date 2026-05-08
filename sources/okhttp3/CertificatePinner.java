package okhttp3;

import defpackage.gu5;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z92;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/CertificatePinner;", "", "Builder", "Companion", "Pin", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CertificatePinner {
    public static final Companion c = new Companion(0);
    public static final CertificatePinner d = new CertificatePinner(z92.E1(new Builder().a), null);
    public final Set<Pin> a;
    public final CertificateChainCleaner b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public final ArrayList a = new ArrayList();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pin {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pin);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        this.a = set;
        this.b = certificateChainCleaner;
    }

    public final void a(String str, List<? extends Certificate> list) {
        str.getClass();
        list.getClass();
        b(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void b(String str, gu5<? extends List<? extends X509Certificate>> gu5Var) {
        str.getClass();
        Iterator<T> it = this.a.iterator();
        if (it.hasNext()) {
            ((Pin) it.next()).getClass();
            wve.K(null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return certificatePinner.a.equals(this.a) && wl7.b(certificatePinner.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.b;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "<init>", "()V", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
