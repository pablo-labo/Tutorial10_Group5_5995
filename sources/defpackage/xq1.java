package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xq1 extends vmb<byte[]> {
    public byte[] a;
    public int b;

    @Override // defpackage.vmb
    public final byte[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vmb
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.vmb
    public final int d() {
        return this.b;
    }
}
