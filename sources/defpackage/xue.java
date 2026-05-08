package defpackage;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.linecorp.linesdk.internal.security.encryption.EncryptionException;
import defpackage.r42;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public final class xue implements cve {
    public final d2f a = boa.D(a.a);
    public Mac b;

    public static final class a extends mj8 implements gu5<KeyStore> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final KeyStore invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        }
    }

    public static void g(r42 r42Var, Mac mac) {
        byte[] bArrDoFinal = mac.doFinal(pyd.J(r42Var.a, r42Var.b));
        bArrDoFinal.getClass();
        if (!MessageDigest.isEqual(bArrDoFinal, r42Var.c)) {
            throw new SecurityException("Cipher text has been tampered with.");
        }
    }

    public final String a(Context context, String str) {
        String str2;
        context.getClass();
        str.getClass();
        synchronized (this) {
            try {
                SecretKey secretKeyC = c();
                r42 r42VarA = r42.a.a(str);
                Mac mac = this.b;
                if (mac == null) {
                    wl7.g("hmac");
                    throw null;
                }
                g(r42VarA, mac);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(r42VarA.b);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, secretKeyC, ivParameterSpec);
                byte[] bArrDoFinal = cipher.doFinal(r42VarA.a);
                bArrDoFinal.getClass();
                str2 = new String(bArrDoFinal, a32.b);
            } catch (Exception e) {
                throw new EncryptionException("Failed to decrypt", e);
            }
        }
        return str2;
    }

    public final String b(Context context, String str) {
        String strW0;
        context.getClass();
        str.getClass();
        synchronized (this) {
            f(context);
            try {
                SecretKey secretKeyC = c();
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, secretKeyC);
                byte[] bytes = str.getBytes(a32.b);
                bytes.getClass();
                byte[] bArrDoFinal = cipher.doFinal(bytes);
                bArrDoFinal.getClass();
                byte[] iv = cipher.getIV();
                iv.getClass();
                Mac mac = this.b;
                if (mac == null) {
                    wl7.g("hmac");
                    throw null;
                }
                byte[] iv2 = cipher.getIV();
                iv2.getClass();
                byte[] bArrDoFinal2 = mac.doFinal(pyd.J(bArrDoFinal, iv2));
                bArrDoFinal2.getClass();
                strW0 = z92.W0(u63.a0(bArrDoFinal, iv, bArrDoFinal2), ";", null, null, s42.b, 30);
            } catch (Exception e) {
                throw new EncryptionException("Failed to encrypt", e);
            }
        }
        return strW0;
    }

    public final SecretKey c() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        if (e().containsAlias("com.linecorp.android.security.encryption.StringAesCipher")) {
            KeyStore.Entry entry = e().getEntry("com.linecorp.android.security.encryption.StringAesCipher", null);
            entry.getClass();
            SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
            secretKey.getClass();
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("com.linecorp.android.security.encryption.StringAesCipher", 3).setKeySize(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build();
        keyGenParameterSpecBuild.getClass();
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        return secretKeyGenerateKey;
    }

    public final SecretKey d() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        if (e().containsAlias("com.linecorp.android.security.encryption.StringAesCipher.INTEGRITY_KEY")) {
            KeyStore.Entry entry = e().getEntry("com.linecorp.android.security.encryption.StringAesCipher.INTEGRITY_KEY", null);
            entry.getClass();
            SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
            secretKey.getClass();
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256", "AndroidKeyStore");
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("com.linecorp.android.security.encryption.StringAesCipher.INTEGRITY_KEY", 12).build();
        keyGenParameterSpecBuild.getClass();
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        return secretKeyGenerateKey;
    }

    public final KeyStore e() {
        Object value = this.a.getValue();
        value.getClass();
        return (KeyStore) value;
    }

    public final void f(Context context) {
        context.getClass();
        if (this.b != null) {
            return;
        }
        synchronized (this) {
            c();
            SecretKey secretKeyD = d();
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeyD);
            this.b = mac;
            j6g j6gVar = j6g.a;
        }
    }
}
