package okhttp3;

import defpackage.gu5;
import defpackage.mj8;
import defpackage.zr4;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class Handshake$peerCertificates$2 extends mj8 implements gu5<List<? extends Certificate>> {
    final /* synthetic */ gu5<List<Certificate>> $peerCertificatesFn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$peerCertificates$2(gu5<? extends List<? extends Certificate>> gu5Var) {
        super(0);
        this.$peerCertificatesFn = gu5Var;
    }

    @Override // defpackage.gu5
    public final List<? extends Certificate> invoke() {
        try {
            return this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return zr4.a;
        }
    }
}
