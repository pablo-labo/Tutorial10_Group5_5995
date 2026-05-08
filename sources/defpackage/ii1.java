package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ii1 extends vmb<boolean[]> {
    public boolean[] a;
    public int b;

    @Override // defpackage.vmb
    public final boolean[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vmb
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.vmb
    public final int d() {
        return this.b;
    }
}
