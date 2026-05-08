package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yfi implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ hdi c;

    public /* synthetic */ yfi(boolean z, String str, hdi hdiVar) {
        this.a = z;
        this.b = str;
        this.c = hdiVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.a;
        String str = this.b;
        hdi hdiVar = this.c;
        String str2 = (z || !tji.b(str, hdiVar, true, false).a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        fib.i(messageDigest);
        byte[] bArrDigest = messageDigest.digest(hdiVar.c);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = ka2.X;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
