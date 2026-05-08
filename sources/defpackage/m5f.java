package defpackage;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class m5f {
    public final EnumSet<o5f> a;
    public final X509TrustManager b;
    public final n5f c;

    public m5f(EnumSet<o5f> enumSet) {
        enumSet.getClass();
        this.a = enumSet;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    this.b = (X509TrustManager) trustManager;
                    this.c = new n5f(a());
                    return;
                }
            }
            throw new IllegalStateException(("Unexpected default trust managers:" + Arrays.toString(trustManagers)).toString());
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (KeyStoreException e2) {
            e2.printStackTrace();
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
        }
    }

    public final String[] a() {
        EnumSet<o5f> enumSet = this.a;
        String[] strArr = new String[enumSet.size()];
        Iterator<o5f> it = enumSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = it.next().toString();
            i++;
        }
        return strArr;
    }
}
