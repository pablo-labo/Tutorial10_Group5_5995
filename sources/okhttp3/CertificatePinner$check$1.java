package okhttp3;

import defpackage.gu5;
import defpackage.mj8;
import defpackage.t92;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class CertificatePinner$check$1 extends mj8 implements gu5<List<? extends X509Certificate>> {
    final /* synthetic */ String $hostname;
    final /* synthetic */ List<Certificate> $peerCertificates;
    final /* synthetic */ CertificatePinner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List<? extends Certificate> list, String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    @Override // defpackage.gu5
    public final List<? extends X509Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner = this.this$0.b;
        List<Certificate> listA = this.$peerCertificates;
        if (certificateChainCleaner != null) {
            listA = certificateChainCleaner.a(this.$hostname, listA);
        }
        List<Certificate> list = listA;
        ArrayList arrayList = new ArrayList(t92.r0(list, 10));
        for (Certificate certificate : list) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
