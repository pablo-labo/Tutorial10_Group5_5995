package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ai5 extends vmb<float[]> {
    public float[] a;
    public int b;

    @Override // defpackage.vmb
    public final float[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vmb
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // defpackage.vmb
    public final int d() {
        return this.b;
    }
}
