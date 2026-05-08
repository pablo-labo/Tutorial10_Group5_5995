package defpackage;

import defpackage.mne;
import defpackage.ox8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class nt0 implements ox8.a {
    public final a d;
    public mne a = null;
    public float b = 0.0f;
    public final ArrayList<mne> c = new ArrayList<>();
    public boolean e = false;

    public interface a {
        boolean a(mne mneVar);

        mne b(int i);

        void c();

        void clear();

        float d(nt0 nt0Var, boolean z);

        float e(mne mneVar);

        int f();

        void g(mne mneVar, float f, boolean z);

        float h(int i);

        float i(mne mneVar, boolean z);

        void j(float f);

        void k(mne mneVar, float f);
    }

    public nt0(us1 us1Var) {
        this.d = new et0(this, us1Var);
    }

    @Override // ox8.a
    public mne a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(ox8 ox8Var, int i) {
        mne mneVarJ = ox8Var.j(i);
        a aVar = this.d;
        aVar.k(mneVarJ, 1.0f);
        aVar.k(ox8Var.j(i), -1.0f);
    }

    public final void c(mne mneVar, mne mneVar2, mne mneVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a aVar = this.d;
        if (z) {
            aVar.k(mneVar, 1.0f);
            aVar.k(mneVar2, -1.0f);
            aVar.k(mneVar3, -1.0f);
        } else {
            aVar.k(mneVar, -1.0f);
            aVar.k(mneVar2, 1.0f);
            aVar.k(mneVar3, 1.0f);
        }
    }

    public final void d(mne mneVar, mne mneVar2, mne mneVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a aVar = this.d;
        if (z) {
            aVar.k(mneVar, 1.0f);
            aVar.k(mneVar2, -1.0f);
            aVar.k(mneVar3, 1.0f);
        } else {
            aVar.k(mneVar, -1.0f);
            aVar.k(mneVar2, 1.0f);
            aVar.k(mneVar3, -1.0f);
        }
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.f() == 0;
    }

    public final mne f(boolean[] zArr, mne mneVar) {
        mne.a aVar;
        a aVar2 = this.d;
        int iF = aVar2.f();
        mne mneVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < iF; i++) {
            float fH = aVar2.h(i);
            if (fH < 0.0f) {
                mne mneVarB = aVar2.b(i);
                if ((zArr == null || !zArr[mneVarB.b]) && mneVarB != mneVar && (((aVar = mneVarB.X) == mne.a.b || aVar == mne.a.c) && fH < f)) {
                    f = fH;
                    mneVar2 = mneVarB;
                }
            }
        }
        return mneVar2;
    }

    public final void g(mne mneVar) {
        mne mneVar2 = this.a;
        a aVar = this.d;
        if (mneVar2 != null) {
            aVar.k(mneVar2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fI = aVar.i(mneVar, true) * (-1.0f);
        this.a = mneVar;
        if (fI == 1.0f) {
            return;
        }
        this.b /= fI;
        aVar.j(fI);
    }

    public final void h(ox8 ox8Var, mne mneVar, boolean z) {
        if (mneVar.f) {
            a aVar = this.d;
            float fE = aVar.e(mneVar);
            this.b = (mneVar.e * fE) + this.b;
            aVar.i(mneVar, z);
            if (z) {
                mneVar.c(this);
            }
            if (aVar.f() == 0) {
                this.e = true;
                ox8Var.a = true;
            }
        }
    }

    public void i(ox8 ox8Var, nt0 nt0Var, boolean z) {
        a aVar = this.d;
        float fD = aVar.d(nt0Var, z);
        this.b = (nt0Var.b * fD) + this.b;
        if (z) {
            nt0Var.a.c(this);
        }
        if (this.a == null || aVar.f() != 0) {
            return;
        }
        this.e = true;
        ox8Var.a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            mne r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            mne r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.q6.g(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            nt0$a r10 = r10.d
            int r5 = r10.f()
        L3c:
            if (r3 >= r5) goto L98
            mne r6 = r10.b(r3)
            if (r6 != 0) goto L45
            goto L95
        L45:
            float r7 = r10.h(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L4e
            goto L95
        L4e:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L62
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L72
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
        L60:
            float r7 = r7 * r9
            goto L72
        L62:
            if (r8 <= 0) goto L6b
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L72
        L6b:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
            goto L60
        L72:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L7d
            java.lang.String r0 = r0.concat(r6)
            goto L94
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L94:
            r1 = r4
        L95:
            int r3 = r3 + 1
            goto L3c
        L98:
            if (r1 != 0) goto La1
            java.lang.String r10 = "0.0"
            java.lang.String r10 = r0.concat(r10)
            return r10
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt0.toString():java.lang.String");
    }

    public nt0() {
    }
}
