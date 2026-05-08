package defpackage;

import android.net.Uri;
import androidx.media3.datasource.a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class vz implements a {
    public final a a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public vz(a aVar, byte[] bArr, byte[] bArr2) {
        this.a = aVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        return this.a.a();
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                df3 df3Var = new df3(gf3Var, this.a);
                this.d = new CipherInputStream(df3Var, cipher);
                df3Var.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                l5.r(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            l5.r(e2);
            return 0L;
        }
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> e() {
        return this.a.e();
    }

    @Override // androidx.media3.datasource.a
    public final void i(grf grfVar) {
        grfVar.getClass();
        this.a.i(grfVar);
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
