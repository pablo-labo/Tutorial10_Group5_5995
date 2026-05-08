package defpackage;

import defpackage.nt0;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class lnb extends nt0 {
    public mne[] f;
    public mne[] g;
    public int h;
    public b i;

    public class a implements Comparator<mne> {
        @Override // java.util.Comparator
        public final int compare(mne mneVar, mne mneVar2) {
            return mneVar.b - mneVar2.b;
        }
    }

    public class b {
        public mne a;

        public b() {
        }

        public final String toString() {
            String string = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbG = q6.g(string);
                    sbG.append(this.a.W[i]);
                    sbG.append(" ");
                    string = sbG.toString();
                }
            }
            StringBuilder sbG2 = h5.g(string, "] ");
            sbG2.append(this.a);
            return sbG2.toString();
        }
    }

    @Override // defpackage.nt0, ox8.a
    public final mne a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            mne[] mneVarArr = this.f;
            mne mneVar = mneVarArr[i2];
            if (!zArr[mneVar.b]) {
                b bVar = this.i;
                bVar.a = mneVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = bVar.a.W[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    mne mneVar2 = mneVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = mneVar2.W[i3];
                            float f3 = bVar.a.W[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.nt0
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.nt0
    public final void i(ox8 ox8Var, nt0 nt0Var, boolean z) {
        mne mneVar = nt0Var.a;
        if (mneVar == null) {
            return;
        }
        float[] fArr = mneVar.W;
        nt0.a aVar = nt0Var.d;
        int iF = aVar.f();
        for (int i = 0; i < iF; i++) {
            mne mneVarB = aVar.b(i);
            float fH = aVar.h(i);
            b bVar = this.i;
            bVar.a = mneVarB;
            if (mneVarB.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = bVar.a.W;
                    float f = (fArr[i2] * fH) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        bVar.a.W[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    lnb.this.k(bVar.a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fH;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bVar.a.W[i3] = f3;
                    } else {
                        bVar.a.W[i3] = 0.0f;
                    }
                }
                j(mneVarB);
            }
            this.b = (nt0Var.b * fH) + this.b;
        }
        k(mneVar);
    }

    public final void j(mne mneVar) {
        int i;
        mne[] mneVarArr;
        int i2 = this.h + 1;
        mne[] mneVarArr2 = this.f;
        if (i2 > mneVarArr2.length) {
            mne[] mneVarArr3 = (mne[]) Arrays.copyOf(mneVarArr2, mneVarArr2.length * 2);
            this.f = mneVarArr3;
            this.g = (mne[]) Arrays.copyOf(mneVarArr3, mneVarArr3.length * 2);
        }
        mne[] mneVarArr4 = this.f;
        int i3 = this.h;
        mneVarArr4[i3] = mneVar;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && mneVarArr4[i3].b > mneVar.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                mneVarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                mneVarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(mneVarArr, 0, i, new a());
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        mneVar.a = true;
        mneVar.a(this);
    }

    public final void k(mne mneVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == mneVar) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        mneVar.a = false;
                        return;
                    } else {
                        mne[] mneVarArr = this.f;
                        int i3 = i + 1;
                        mneVarArr[i] = mneVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.nt0
    public final String toString() {
        b bVar = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            bVar.a = this.f[i];
            str = str + bVar + " ";
        }
        return str;
    }
}
