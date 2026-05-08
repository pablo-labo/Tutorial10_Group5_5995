package okhttp3.internal.connection;

import defpackage.gu5;
import defpackage.mj8;
import defpackage.t92;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Handshake;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class RealConnection$connectTls$2 extends mj8 implements gu5<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    @Override // defpackage.gu5
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake = this.this$0.e;
        handshake.getClass();
        List<Certificate> listA = handshake.a();
        ArrayList arrayList = new ArrayList(t92.r0(listA, 10));
        for (Certificate certificate : listA) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
