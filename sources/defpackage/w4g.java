package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w4g extends vmb<v4g> {
    public short[] a;
    public int b;

    @Override // defpackage.vmb
    public final v4g a() {
        return new v4g(Arrays.copyOf(this.a, this.b));
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
