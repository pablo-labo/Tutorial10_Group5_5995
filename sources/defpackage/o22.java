package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o22 extends vmb<char[]> {
    public char[] a;
    public int b;

    @Override // defpackage.vmb
    public final char[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vmb
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.vmb
    public final int d() {
        return this.b;
    }
}
