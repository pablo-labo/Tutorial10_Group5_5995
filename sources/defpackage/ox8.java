package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.mne;
import defpackage.nt0;
import java.util.Arrays;
import lnb.b;

/* JADX INFO: loaded from: classes.dex */
public final class ox8 {
    public static boolean p = false;
    public static int q = 1000;
    public final lnb c;
    public nt0[] f;
    public final us1 l;
    public nt0 o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public mne[] m = new mne[q];
    public int n = 0;

    public interface a {
        mne a(boolean[] zArr);
    }

    public ox8() {
        this.f = null;
        this.f = new nt0[32];
        s();
        us1 us1Var = new us1();
        us1Var.a = new ogb();
        us1Var.b = new ogb();
        us1Var.c = new mne[32];
        this.l = us1Var;
        lnb lnbVar = new lnb(us1Var);
        lnbVar.f = new mne[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        lnbVar.g = new mne[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        lnbVar.h = 0;
        lnbVar.i = lnbVar.new b();
        this.c = lnbVar;
        this.o = new nt0(us1Var);
    }

    public static int n(Object obj) {
        mne mneVar = ((wp2) obj).i;
        if (mneVar != null) {
            return (int) (mneVar.e + 0.5f);
        }
        return 0;
    }

    public final mne a(mne.a aVar) {
        ogb ogbVar = (ogb) this.l.b;
        int i = ogbVar.b;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = ogbVar.a;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            ogbVar.b = i2;
            obj = obj2;
        }
        mne mneVar = (mne) obj;
        if (mneVar == null) {
            mneVar = new mne(aVar);
            mneVar.X = aVar;
        } else {
            mneVar.e();
            mneVar.X = aVar;
        }
        int i3 = this.n;
        int i4 = q;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            q = i5;
            this.m = (mne[]) Arrays.copyOf(this.m, i5);
        }
        mne[] mneVarArr = this.m;
        int i6 = this.n;
        this.n = i6 + 1;
        mneVarArr[i6] = mneVar;
        return mneVar;
    }

    public final void b(mne mneVar, mne mneVar2, int i, float f, mne mneVar3, mne mneVar4, int i2, int i3) {
        nt0 nt0VarL = l();
        if (mneVar2 == mneVar3) {
            nt0VarL.d.k(mneVar, 1.0f);
            nt0VarL.d.k(mneVar4, 1.0f);
            nt0VarL.d.k(mneVar2, -2.0f);
        } else {
            nt0.a aVar = nt0VarL.d;
            if (f == 0.5f) {
                aVar.k(mneVar, 1.0f);
                nt0VarL.d.k(mneVar2, -1.0f);
                nt0VarL.d.k(mneVar3, -1.0f);
                nt0VarL.d.k(mneVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    nt0VarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                aVar.k(mneVar, -1.0f);
                nt0VarL.d.k(mneVar2, 1.0f);
                nt0VarL.b = i;
            } else if (f >= 1.0f) {
                aVar.k(mneVar4, -1.0f);
                nt0VarL.d.k(mneVar3, 1.0f);
                nt0VarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                aVar.k(mneVar, f2 * 1.0f);
                nt0VarL.d.k(mneVar2, f2 * (-1.0f));
                nt0VarL.d.k(mneVar3, (-1.0f) * f);
                nt0VarL.d.k(mneVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    nt0VarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            nt0VarL.b(this, i3);
        }
        c(nt0VarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.nt0 r18) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox8.c(nt0):void");
    }

    public final void d(mne mneVar, int i) {
        int i2 = mneVar.c;
        if (i2 == -1) {
            mneVar.f(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                mne mneVar2 = ((mne[]) this.l.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            nt0 nt0VarL = l();
            nt0VarL.a = mneVar;
            float f = i;
            mneVar.e = f;
            nt0VarL.b = f;
            nt0VarL.e = true;
            c(nt0VarL);
            return;
        }
        nt0 nt0Var = this.f[i2];
        if (nt0Var.e) {
            nt0Var.b = i;
            return;
        }
        if (nt0Var.d.f() == 0) {
            nt0Var.e = true;
            nt0Var.b = i;
            return;
        }
        nt0 nt0VarL2 = l();
        if (i < 0) {
            nt0VarL2.b = i * (-1);
            nt0VarL2.d.k(mneVar, 1.0f);
        } else {
            nt0VarL2.b = i;
            nt0VarL2.d.k(mneVar, -1.0f);
        }
        c(nt0VarL2);
    }

    public final void e(mne mneVar, mne mneVar2, int i, int i2) {
        if (i2 == 8 && mneVar2.f && mneVar.c == -1) {
            mneVar.f(this, mneVar2.e + i);
            return;
        }
        nt0 nt0VarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            nt0VarL.b = i;
        }
        nt0.a aVar = nt0VarL.d;
        if (z) {
            aVar.k(mneVar, 1.0f);
            nt0VarL.d.k(mneVar2, -1.0f);
        } else {
            aVar.k(mneVar, -1.0f);
            nt0VarL.d.k(mneVar2, 1.0f);
        }
        if (i2 != 8) {
            nt0VarL.b(this, i2);
        }
        c(nt0VarL);
    }

    public final void f(mne mneVar, mne mneVar2, int i, int i2) {
        nt0 nt0VarL = l();
        mne mneVarM = m();
        mneVarM.d = 0;
        nt0VarL.c(mneVar, mneVar2, mneVarM, i);
        if (i2 != 8) {
            nt0VarL.d.k(j(i2), (int) (nt0VarL.d.e(mneVarM) * (-1.0f)));
        }
        c(nt0VarL);
    }

    public final void g(mne mneVar, mne mneVar2, int i, int i2) {
        nt0 nt0VarL = l();
        mne mneVarM = m();
        mneVarM.d = 0;
        nt0VarL.d(mneVar, mneVar2, mneVarM, i);
        if (i2 != 8) {
            nt0VarL.d.k(j(i2), (int) (nt0VarL.d.e(mneVarM) * (-1.0f)));
        }
        c(nt0VarL);
    }

    public final void h(nt0 nt0Var) {
        int i;
        if (nt0Var.e) {
            nt0Var.a.f(this, nt0Var.b);
        } else {
            nt0[] nt0VarArr = this.f;
            int i2 = this.j;
            nt0VarArr[i2] = nt0Var;
            mne mneVar = nt0Var.a;
            mneVar.c = i2;
            this.j = i2 + 1;
            mneVar.h(this, nt0Var);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                nt0 nt0Var2 = this.f[i3];
                if (nt0Var2 != null && nt0Var2.e) {
                    nt0Var2.a.f(this, nt0Var2.b);
                    ((ogb) this.l.a).a(nt0Var2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        nt0[] nt0VarArr2 = this.f;
                        int i6 = i4 - 1;
                        nt0 nt0Var3 = nt0VarArr2[i4];
                        nt0VarArr2[i6] = nt0Var3;
                        mne mneVar2 = nt0Var3.a;
                        if (mneVar2.c == i4) {
                            mneVar2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            nt0 nt0Var = this.f[i];
            nt0Var.a.e = nt0Var.b;
        }
    }

    public final mne j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        mne mneVarA = a(mne.a.c);
        float[] fArr = mneVarA.W;
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        mneVarA.b = i2;
        mneVarA.d = i;
        ((mne[]) this.l.c)[i2] = mneVarA;
        lnb lnbVar = this.c;
        lnbVar.i.a = mneVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[mneVarA.d] = 1.0f;
        lnbVar.j(mneVarA);
        return mneVarA;
    }

    public final mne k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof wp2)) {
            return null;
        }
        wp2 wp2Var = (wp2) obj;
        mne mneVar = wp2Var.i;
        if (mneVar == null) {
            wp2Var.h();
            mneVar = wp2Var.i;
        }
        int i = mneVar.b;
        us1 us1Var = this.l;
        if (i != -1 && i <= this.b && ((mne[]) us1Var.c)[i] != null) {
            return mneVar;
        }
        if (i != -1) {
            mneVar.e();
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        mneVar.b = i2;
        mneVar.X = mne.a.a;
        ((mne[]) us1Var.c)[i2] = mneVar;
        return mneVar;
    }

    public final nt0 l() {
        Object obj;
        us1 us1Var = this.l;
        ogb ogbVar = (ogb) us1Var.a;
        int i = ogbVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = ogbVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            ogbVar.b = i2;
        } else {
            obj = null;
        }
        nt0 nt0Var = (nt0) obj;
        if (nt0Var == null) {
            return new nt0(us1Var);
        }
        nt0Var.a = null;
        nt0Var.d.clear();
        nt0Var.b = 0.0f;
        nt0Var.e = false;
        return nt0Var;
    }

    public final mne m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        mne mneVarA = a(mne.a.b);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        mneVarA.b = i;
        ((mne[]) this.l.c)[i] = mneVarA;
        return mneVarA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (nt0[]) Arrays.copyOf(this.f, i);
        us1 us1Var = this.l;
        us1Var.c = (mne[]) Arrays.copyOf((mne[]) us1Var.c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        lnb lnbVar = this.c;
        if (lnbVar.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(lnbVar);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(lnbVar);
                return;
            }
        }
        i();
    }

    public final void q(lnb lnbVar) {
        int i = 0;
        while (true) {
            if (i >= this.j) {
                break;
            }
            nt0 nt0Var = this.f[i];
            mne.a aVar = nt0Var.a.X;
            mne.a aVar2 = mne.a.a;
            if (aVar != aVar2) {
                float f = 0.0f;
                if (nt0Var.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.j) {
                            nt0 nt0Var2 = this.f[i3];
                            if (nt0Var2.a.X != aVar2 && !nt0Var2.e && nt0Var2.b < f) {
                                int iF = nt0Var2.d.f();
                                int i7 = 0;
                                while (i7 < iF) {
                                    mne mneVarB = nt0Var2.d.b(i7);
                                    float f3 = f;
                                    float fE = nt0Var2.d.e(mneVarB);
                                    if (fE > f3) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f4 = mneVarB.V[i8] / fE;
                                            if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = mneVarB.b;
                                                i4 = i3;
                                                f2 = f4;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = f3;
                                }
                            }
                            i3++;
                            f = f;
                        }
                        float f5 = f;
                        if (i4 != -1) {
                            nt0 nt0Var3 = this.f[i4];
                            nt0Var3.a.c = -1;
                            nt0Var3.g(((mne[]) this.l.c)[i5]);
                            mne mneVar = nt0Var3.a;
                            mneVar.c = i4;
                            mneVar.h(this, nt0Var3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.i / 2) {
                            z = true;
                        }
                        f = f5;
                    }
                }
            }
            i++;
        }
        r(lnbVar);
        i();
    }

    public final void r(a aVar) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            if (((nt0) aVar).a != null) {
                this.h[((nt0) aVar).a.b] = true;
            }
            mne mneVarA = aVar.a(this.h);
            if (mneVarA != null) {
                boolean[] zArr = this.h;
                int i3 = mneVarA.b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (mneVarA != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    nt0 nt0Var = this.f[i5];
                    if (nt0Var.a.X != mne.a.a && !nt0Var.e && nt0Var.d.a(mneVarA)) {
                        float fE = nt0Var.d.e(mneVarA);
                        if (fE < 0.0f) {
                            float f2 = (-nt0Var.b) / fE;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    nt0 nt0Var2 = this.f[i4];
                    nt0Var2.a.c = -1;
                    nt0Var2.g(mneVarA);
                    mne mneVar = nt0Var2.a;
                    mneVar.c = i4;
                    mneVar.h(this, nt0Var2);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            nt0 nt0Var = this.f[i];
            if (nt0Var != null) {
                ((ogb) this.l.a).a(nt0Var);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        us1 us1Var;
        int i = 0;
        while (true) {
            us1Var = this.l;
            mne[] mneVarArr = (mne[]) us1Var.c;
            if (i >= mneVarArr.length) {
                break;
            }
            mne mneVar = mneVarArr[i];
            if (mneVar != null) {
                mneVar.e();
            }
            i++;
        }
        ogb ogbVar = (ogb) us1Var.b;
        mne[] mneVarArr2 = this.m;
        int length = this.n;
        ogbVar.getClass();
        if (length > mneVarArr2.length) {
            length = mneVarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            mne mneVar2 = mneVarArr2[i2];
            int i3 = ogbVar.b;
            Object[] objArr = ogbVar.a;
            if (i3 < objArr.length) {
                objArr[i3] = mneVar2;
                ogbVar.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((mne[]) us1Var.c, (Object) null);
        this.b = 0;
        lnb lnbVar = this.c;
        lnbVar.h = 0;
        lnbVar.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            nt0 nt0Var = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new nt0(us1Var);
    }
}
