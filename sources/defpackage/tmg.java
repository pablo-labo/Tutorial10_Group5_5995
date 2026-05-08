package defpackage;

import defpackage.ge0;
import defpackage.wr0;

/* JADX INFO: loaded from: classes.dex */
public final class tmg<V extends ge0> implements nmg<V> {
    public V V;
    public V W;
    public V X;
    public V Y;
    public float[] Z;
    public final z2a a;
    public float[] a0;
    public final a3a b;
    public wr0 b0;
    public final int c;
    public final af4 d;
    public int[] e = mmg.a;
    public float[] f;

    public tmg(z2a z2aVar, a3a a3aVar, int i, af4 af4Var) {
        this.a = z2aVar;
        this.b = a3aVar;
        this.c = i;
        this.d = af4Var;
        float[] fArr = mmg.b;
        this.f = fArr;
        this.Z = fArr;
        this.a0 = fArr;
        this.b0 = mmg.c;
    }

    public final int b(int i) {
        int i2;
        z2a z2aVar = this.a;
        int i3 = z2aVar.b;
        int i4 = 0;
        if (i3 <= 0) {
            l5.s("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = z2aVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float c(int i, int i2, boolean z) {
        af4 af4Var;
        float f;
        z2a z2aVar = this.a;
        if (i >= z2aVar.b - 1) {
            f = i2;
        } else {
            int iA = z2aVar.a(i);
            int iA2 = z2aVar.a(i + 1);
            if (i2 != iA) {
                int i3 = iA2 - iA;
                smg smgVar = (smg) this.b.b(iA);
                if (smgVar == null || (af4Var = smgVar.b) == null) {
                    af4Var = this.d;
                }
                float f2 = i3;
                float fB = af4Var.b((i2 - iA) / f2);
                return z ? fB : ((f2 * fB) + iA) / 1000.0f;
            }
            f = iA;
        }
        return f / 1000.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(V v, V v2, V v3) {
        float[] fArr;
        boolean z = this.b0 != mmg.c;
        V v4 = this.V;
        a3a a3aVar = this.b;
        z2a z2aVar = this.a;
        if (v4 == null) {
            this.V = (V) v.c();
            this.W = (V) v3.c();
            int i = z2aVar.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = z2aVar.a(i2) / 1000.0f;
            }
            this.f = fArr2;
            int i3 = z2aVar.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.e = iArr;
        }
        if (z) {
            if (this.b0 != mmg.c && wl7.b(this.X, v) && wl7.b(this.Y, v2)) {
                return;
            }
            this.X = v;
            this.Y = v2;
            int iB = v.b() + (v.b() % 2);
            this.Z = new float[iB];
            this.a0 = new float[iB];
            int i5 = z2aVar.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iA = z2aVar.a(i6);
                smg smgVar = (smg) a3aVar.b(iA);
                if (iA == 0 && smgVar == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = v.a(i7);
                    }
                } else if (iA == this.c && smgVar == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = v2.a(i8);
                    }
                } else {
                    smgVar.getClass();
                    V v5 = smgVar.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = v5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.b0 = new wr0(this.e, this.f, fArr3);
        }
    }

    @Override // defpackage.nmg
    public final int i() {
        return 0;
    }

    @Override // defpackage.nmg
    public final int j() {
        return this.c;
    }

    @Override // defpackage.lmg
    public final V o(long j, V v, V v2, V v3) {
        long j2 = j / 1000000;
        int[] iArr = mmg.a;
        long j3 = this.c;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return v3;
        }
        e(v, v2, v3);
        V v4 = this.W;
        v4.getClass();
        int i = 0;
        if (this.b0 != mmg.c) {
            int i2 = (int) j4;
            float fC = c(b(i2), i2, false);
            float[] fArr = this.a0;
            wr0.a[][] aVarArr = this.b0.a;
            float f = aVarArr[0][0].a;
            float f2 = aVarArr[aVarArr.length - 1][0].b;
            if (fC < f) {
                fC = f;
            }
            if (fC <= f2) {
                f2 = fC;
            }
            int length = fArr.length;
            boolean z = false;
            for (wr0.a[] aVarArr2 : aVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    wr0.a aVar = aVarArr2[i4];
                    if (f2 <= aVar.b) {
                        if (aVar.p) {
                            fArr[i3] = aVar.q;
                            fArr[i3 + 1] = aVar.r;
                        } else {
                            aVar.c(f2);
                            fArr[i3] = aVar.a();
                            fArr[i3 + 1] = aVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                v4.e(fArr[i], i);
                i++;
            }
        } else {
            ge0 ge0VarQ = q((j4 - 1) * 1000000, v, v2, v3);
            ge0 ge0VarQ2 = q(j4 * 1000000, v, v2, v3);
            int iB = ge0VarQ.b();
            while (i < iB) {
                v4.e((ge0VarQ.a(i) - ge0VarQ2.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lmg
    public final V q(long j, V v, V v2, V v3) {
        V v4;
        V v5;
        wr0.a[][] aVarArr;
        V v6 = v;
        long j2 = j / 1000000;
        int[] iArr = mmg.a;
        int i = this.c;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        a3a a3aVar = this.b;
        smg smgVar = (smg) a3aVar.b(i2);
        if (smgVar != null) {
            return smgVar.a;
        }
        if (i2 >= i) {
            return v2;
        }
        if (i2 <= 0) {
            return v6;
        }
        e(v6, v2, v3);
        V v7 = this.V;
        v7.getClass();
        int i3 = 0;
        if (this.b0 != mmg.c) {
            float fC = c(b(i2), i2, false);
            float[] fArr = this.Z;
            wr0.a[][] aVarArr2 = this.b0.a;
            int length = aVarArr2.length - 1;
            float f = aVarArr2[0][0].a;
            float f2 = aVarArr2[length][0].b;
            int length2 = fArr.length;
            if (fC < f || fC > f2) {
                if (fC > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fC - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    wr0.a aVar = aVarArr2[length][i5];
                    boolean z = aVar.p;
                    float f4 = aVar.r;
                    float f5 = aVar.q;
                    if (z) {
                        float f6 = aVar.a;
                        float f7 = aVar.k;
                        float f8 = aVar.c;
                        aVarArr = aVarArr2;
                        fArr[i4] = (f5 * f3) + k6.b(aVar.e, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = aVar.d;
                        fArr[i4 + 1] = (f4 * f3) + k6.b(aVar.f, f10, f9, f10);
                    } else {
                        aVarArr = aVarArr2;
                        aVar.c(f);
                        fArr[i4] = (aVar.a() * f3) + (aVar.n * aVar.h) + f5;
                        fArr[i4 + 1] = (aVar.b() * f3) + (aVar.o * aVar.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    aVarArr2 = aVarArr;
                }
            } else {
                int length3 = aVarArr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        wr0.a aVar2 = aVarArr2[i6][i8];
                        if (fC <= aVar2.b) {
                            if (aVar2.p) {
                                float f11 = aVar2.a;
                                float f12 = aVar2.k;
                                float f13 = aVar2.c;
                                fArr[i7] = k6.b(aVar2.e, f13, (fC - f11) * f12, f13);
                                float f14 = aVar2.d;
                                fArr[i7 + 1] = k6.b(aVar2.f, f14, (fC - f11) * f12, f14);
                            } else {
                                aVar2.c(fC);
                                fArr[i7] = (aVar2.n * aVar2.h) + aVar2.q;
                                fArr[i7 + 1] = (aVar2.o * aVar2.i) + aVar2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                v7.e(fArr[i9], i9);
            }
        } else {
            int iB = b(i2);
            float fC2 = c(iB, i2, true);
            z2a z2aVar = this.a;
            smg smgVar2 = (smg) a3aVar.b(z2aVar.a(iB));
            if (smgVar2 != null && (v5 = smgVar2.a) != null) {
                v6 = v5;
            }
            smg smgVar3 = (smg) a3aVar.b(z2aVar.a(iB + 1));
            if (smgVar3 == null || (v4 = smgVar3.a) == null) {
                v4 = v2;
            }
            int iB2 = v7.b();
            for (int i10 = 0; i10 < iB2; i10++) {
                v7.e((v4.a(i10) * fC2) + ((1.0f - fC2) * v6.a(i10)), i10);
            }
        }
        return v7;
    }
}
