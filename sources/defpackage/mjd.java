package defpackage;

import defpackage.f65;
import defpackage.use;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class mjd {
    public final z79<kg8, String> a = new z79<>(1000);
    public final f65.c b = f65.a(10, new a());

    public class a implements f65.b<b> {
        @Override // f65.b
        public final b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                l5.r(e);
                return null;
            }
        }
    }

    public static final class b implements f65.d {
        public final MessageDigest a;
        public final use.a b = new use.a();

        public b(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // f65.d
        public final use.a c() {
            return this.b;
        }
    }

    public final String a(kg8 kg8Var) {
        String strA;
        synchronized (this.a) {
            strA = this.a.a(kg8Var);
        }
        if (strA == null) {
            b bVar = (b) this.b.acquire();
            try {
                kg8Var.b(bVar.a);
                byte[] bArrDigest = bVar.a.digest();
                char[] cArr = xjg.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b2 = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = xjg.a;
                        cArr[i2] = cArr2[(b2 & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b2 & 15];
                    }
                    strA = new String(cArr);
                }
            } finally {
                this.b.a(bVar);
            }
        }
        synchronized (this.a) {
            this.a.d(kg8Var, strA);
        }
        return strA;
    }
}
