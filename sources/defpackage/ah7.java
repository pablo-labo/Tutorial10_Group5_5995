package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ah7 extends vmb<int[]> {
    public int[] a;
    public int b;

    @Override // defpackage.vmb
    public final int[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vmb
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.vmb
    public final int d() {
        return this.b;
    }
}
