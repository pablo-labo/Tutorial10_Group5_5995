package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class mee extends vmb<short[]> {
    public short[] a;
    public int b;

    @Override // defpackage.vmb
    public final short[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vmb
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.vmb
    public final int d() {
        return this.b;
    }
}
