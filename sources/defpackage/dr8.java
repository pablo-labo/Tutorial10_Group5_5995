package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class dr8 implements ese<oh7> {
    public final int a;
    public final int b;
    public final g4a c;
    public int d;

    public static final class a {
    }

    public dr8(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = r.e(nic.H(Math.max(i4 - i3, 0), i4 + i2 + i3), wab.a0);
        this.d = i;
    }

    @Override // defpackage.ese
    public final oh7 getValue() {
        return (oh7) ((gme) this.c).getValue();
    }

    public final void i(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = (i / i2) * i2;
            int i4 = this.b;
            ((gme) this.c).setValue(nic.H(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }
}
