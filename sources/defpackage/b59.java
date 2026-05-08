package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b59 extends vmb<long[]> {
    public long[] a;
    public int b;

    @Override // defpackage.vmb
    public final long[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vmb
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.vmb
    public final int d() {
        return this.b;
    }
}
