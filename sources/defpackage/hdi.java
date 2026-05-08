package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class hdi extends gai {
    public final byte[] c;

    public hdi(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override // defpackage.gai
    public final byte[] e() {
        return this.c;
    }
}
