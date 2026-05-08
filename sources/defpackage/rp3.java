package defpackage;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rp3 implements fze {
    @Override // defpackage.fze
    public final Object get() {
        byte[] bArr = new byte[12];
        sp3.i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
