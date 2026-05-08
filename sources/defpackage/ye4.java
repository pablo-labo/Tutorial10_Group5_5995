package defpackage;

import defpackage.ve4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ye4 {
    public static final ve4[] f = new ve4[0];
    public final ue4 a;
    public final ve4 b;
    public final ve4 c;
    public final ve4[] d;
    public boolean e;

    public static abstract class a extends ye4 {
        @Override // defpackage.ye4
        public final boolean l() {
            ve4 ve4VarK;
            ve4 ve4VarO;
            ue4 ue4Var = this.a;
            ve4 ve4VarI = ue4Var.b;
            ve4 ve4VarI2 = ue4Var.c;
            int i = ue4Var.f;
            ve4 ve4Var = this.c;
            ve4[] ve4VarArr = this.d;
            ve4 ve4Var2 = this.b;
            if (i != 6) {
                ve4 ve4VarI3 = ve4Var.a(ve4Var2).i(ve4Var);
                if (i != 0) {
                    if (i != 1) {
                        r6.g("unsupported coordinate system");
                        return false;
                    }
                    ve4 ve4Var3 = ve4VarArr[0];
                    if (!ve4Var3.g()) {
                        ve4 ve4VarI4 = ve4Var3.i(ve4Var3.n());
                        ve4VarI3 = ve4VarI3.i(ve4Var3);
                        ve4VarI = ve4VarI.i(ve4Var3);
                        ve4VarI2 = ve4VarI2.i(ve4VarI4);
                    }
                }
                return ve4VarI3.equals(ve4Var2.a(ve4VarI).i(ve4Var2.n()).a(ve4VarI2));
            }
            ve4 ve4Var4 = ve4VarArr[0];
            boolean zG = ve4Var4.g();
            if (ve4Var2.h()) {
                ve4 ve4VarN = ve4Var.n();
                if (!zG) {
                    ve4VarI2 = ve4VarI2.i(ve4Var4.n());
                }
                return ve4VarN.equals(ve4VarI2);
            }
            ve4 ve4VarN2 = ve4Var2.n();
            if (zG) {
                ve4VarK = k20.j(ve4Var, ve4Var, ve4VarI);
                ve4VarO = ve4VarN2.n().a(ve4VarI2);
            } else {
                ve4 ve4VarN3 = ve4Var4.n();
                ve4 ve4VarN4 = ve4VarN3.n();
                ve4VarK = ve4Var.a(ve4Var4).k(ve4Var, ve4VarI, ve4VarN3);
                ve4VarO = ve4VarN2.o(ve4VarI2, ve4VarN4);
            }
            return ve4VarK.i(ve4VarN2).equals(ve4VarO);
        }
    }

    public static abstract class b extends ye4 {
        @Override // defpackage.ye4
        public final boolean l() {
            ue4 ue4Var = this.a;
            ve4 ve4VarI = ue4Var.b;
            ve4 ve4VarI2 = ue4Var.c;
            ve4 ve4VarN = this.c.n();
            int iC = c();
            if (iC != 0) {
                ve4[] ve4VarArr = this.d;
                if (iC == 1) {
                    ve4 ve4Var = ve4VarArr[0];
                    if (!ve4Var.g()) {
                        ve4 ve4VarN2 = ve4Var.n();
                        ve4 ve4VarI3 = ve4Var.i(ve4VarN2);
                        ve4VarN = ve4VarN.i(ve4Var);
                        ve4VarI = ve4VarI.i(ve4VarN2);
                        ve4VarI2 = ve4VarI2.i(ve4VarI3);
                    }
                } else {
                    if (iC != 2 && iC != 3 && iC != 4) {
                        r6.g("unsupported coordinate system");
                        return false;
                    }
                    ve4 ve4Var2 = ve4VarArr[0];
                    if (!ve4Var2.g()) {
                        ve4 ve4VarN3 = ve4Var2.n();
                        ve4 ve4VarN4 = ve4VarN3.n();
                        ve4 ve4VarI4 = ve4VarN3.i(ve4VarN4);
                        ve4VarI = ve4VarI.i(ve4VarN4);
                        ve4VarI2 = ve4VarI2.i(ve4VarI4);
                    }
                }
            }
            ve4 ve4Var3 = this.b;
            return ve4VarN.equals(ve4Var3.n().a(ve4VarI).i(ve4Var3).a(ve4VarI2));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ye4(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2) {
        ve4[] ve4VarArr;
        int i = ue4Var == null ? 0 : ue4Var.f;
        if (i == 0 || i == 5) {
            ve4VarArr = f;
        } else {
            ve4 ve4VarG = ue4Var.g(te4.b);
            if (i == 1 || i == 2) {
                ve4VarArr = new ve4[]{ve4VarG};
            } else if (i == 3) {
                ve4VarArr = new ve4[]{ve4VarG, ve4VarG, ve4VarG};
            } else if (i != 4) {
                if (i != 6) {
                    l5.q("unknown coordinate system");
                    throw null;
                }
                ve4VarArr = new ve4[]{ve4VarG};
            } else {
                ve4VarArr = new ve4[]{ve4VarG, ue4Var.b};
            }
        }
        this(ue4Var, ve4Var, ve4Var2, ve4VarArr);
    }

    public abstract ye4 a(ye4 ye4Var);

    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.ye4 r11) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye4.b(ye4):boolean");
    }

    public final int c() {
        ue4 ue4Var = this.a;
        if (ue4Var == null) {
            return 0;
        }
        return ue4Var.f;
    }

    public ve4 d() {
        return this.c;
    }

    public ve4 e() {
        ve4[] ve4VarArr = this.d;
        if (ve4VarArr.length <= 0) {
            return null;
        }
        return ve4VarArr[0];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ye4) {
            return b((ye4) obj);
        }
        return false;
    }

    public final boolean f() {
        if (this.b == null || this.c == null) {
            return true;
        }
        ve4[] ve4VarArr = this.d;
        return ve4VarArr.length > 0 && ve4VarArr[0].h();
    }

    public final boolean g() {
        int iC = c();
        return iC == 0 || iC == 5 || f() || this.d[0].g();
    }

    public abstract ye4 h();

    public final int hashCode() {
        ue4 ue4Var = this.a;
        int i = ue4Var == null ? 0 : ~ue4Var.hashCode();
        if (f()) {
            return i;
        }
        ye4 ye4VarI = i();
        return (ye4VarI.d().hashCode() * 257) ^ (i ^ (ye4VarI.b.hashCode() * 17));
    }

    public final ye4 i() {
        int iC;
        if (f() || (iC = c()) == 0 || iC == 5) {
            return this;
        }
        ve4 ve4VarE = e();
        return ve4VarE.g() ? this : j(ve4VarE.f());
    }

    public final ye4 j(ve4 ve4Var) {
        int iC = c();
        ve4 ve4Var2 = this.c;
        ve4 ve4Var3 = this.b;
        ue4 ue4Var = this.a;
        if (iC != 1) {
            if (iC == 2 || iC == 3 || iC == 4) {
                ve4 ve4VarN = ve4Var.n();
                return ue4Var.c(ve4Var3.i(ve4VarN), ve4Var2.i(ve4VarN.i(ve4Var)), this.e);
            }
            if (iC != 6) {
                r6.g("not a projective coordinate system");
                return null;
            }
        }
        return ue4Var.c(ve4Var3.i(ve4Var), ve4Var2.i(ve4Var), this.e);
    }

    public final boolean k() {
        ue4 ue4Var = this.a;
        BigInteger bigInteger = ue4Var.e;
        if (bigInteger != null && !bigInteger.equals(te4.b)) {
            BigInteger bigIntegerAbs = bigInteger.abs();
            ye4 ye4VarI = ue4Var.i();
            int iBitLength = bigIntegerAbs.bitLength();
            if (iBitLength > 0) {
                if (bigIntegerAbs.testBit(0)) {
                    ye4VarI = this;
                }
                for (int i = 1; i < iBitLength; i++) {
                    this = this.m();
                    if (bigIntegerAbs.testBit(i)) {
                        ye4VarI = ye4VarI.a(this);
                    }
                }
            }
            if (bigInteger.signum() < 0) {
                ye4VarI = ye4VarI.h();
            }
            if (ye4VarI.f()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean l();

    public abstract ye4 m();

    public final String toString() {
        if (f()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(this.b);
        stringBuffer.append(',');
        stringBuffer.append(this.c);
        int i = 0;
        while (true) {
            ve4[] ve4VarArr = this.d;
            if (i >= ve4VarArr.length) {
                stringBuffer.append(')');
                return stringBuffer.toString();
            }
            stringBuffer.append(',');
            stringBuffer.append(ve4VarArr[i]);
            i++;
        }
    }

    public static class d extends b {
        public d(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, boolean z) {
            super(ue4Var, ve4Var, ve4Var2);
            if ((ve4Var == null) == (ve4Var2 == null)) {
                this.e = z;
            } else {
                l5.q("Exactly one of the field elements is null");
                throw null;
            }
        }

        /* JADX WARN: Type update failed for variable: r18v0 'this'  ??, new type: ye4$d
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5451. Try increasing type updates limit count.
        	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Type update failed for variable: r18v0 'this'  ??, new type: ye4$d
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5451. Try increasing type updates limit count.
        	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:591)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayGetListener(TypeUpdate.java:572)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        @Override // defpackage.ye4
        public final ye4 a(ye4 ye4Var) {
            char c;
            int i;
            ve4 ve4VarJ;
            ve4 ve4VarI;
            ve4 ve4VarP;
            ve4[] ve4VarArr;
            if (f()) {
                return ye4Var;
            }
            boolean zF = ye4Var.f();
            ve4[] ve4VarArr2 = ye4Var.d;
            if (zF) {
                return this;
            }
            if (this == ye4Var) {
                return m();
            }
            ue4 ue4Var = this.a;
            int i2 = ue4Var.f;
            ve4 ve4VarI2 = ye4Var.b;
            ve4 ve4VarI3 = ye4Var.c;
            ve4 ve4VarI4 = this.b;
            ve4 ve4VarI5 = this.c;
            if (i2 == 0) {
                ve4 ve4VarP2 = ve4VarI2.p(ve4VarI4);
                ve4 ve4VarP3 = ve4VarI3.p(ve4VarI5);
                if (ve4VarP2.h()) {
                    return ve4VarP3.h() ? m() : ue4Var.i();
                }
                ve4 ve4VarD = ve4VarP3.d(ve4VarP2);
                ve4 ve4VarP4 = ve4VarD.n().p(ve4VarI4).p(ve4VarI2);
                return new d(ue4Var, ve4VarP4, ve4VarD.i(ve4VarI4.p(ve4VarP4)).p(ve4VarI5), this.e);
            }
            ve4[] ve4VarArr3 = this.d;
            if (i2 == 1) {
                ve4 ve4VarI6 = ve4VarArr3[0];
                ve4 ve4Var = ve4VarArr2[0];
                boolean zG = ve4VarI6.g();
                boolean zG2 = ve4Var.g();
                if (!zG) {
                    ve4VarI3 = ve4VarI3.i(ve4VarI6);
                }
                if (!zG2) {
                    ve4VarI5 = ve4VarI5.i(ve4Var);
                }
                ve4 ve4VarP5 = ve4VarI3.p(ve4VarI5);
                if (!zG) {
                    ve4VarI2 = ve4VarI2.i(ve4VarI6);
                }
                if (!zG2) {
                    ve4VarI4 = ve4VarI4.i(ve4Var);
                }
                ve4 ve4VarP6 = ve4VarI2.p(ve4VarI4);
                if (ve4VarP6.h()) {
                    return ve4VarP5.h() ? m() : ue4Var.i();
                }
                if (zG) {
                    ve4VarI6 = ve4Var;
                } else if (!zG2) {
                    ve4VarI6 = ve4VarI6.i(ve4Var);
                }
                ve4 ve4VarN = ve4VarP6.n();
                ve4 ve4VarI7 = ve4VarN.i(ve4VarP6);
                ve4 ve4VarI8 = ve4VarN.i(ve4VarI4);
                ve4 ve4VarP7 = ve4VarP5.n().i(ve4VarI6).p(ve4VarI7).p(ve4VarI8.a(ve4VarI8));
                return new d(ue4Var, ve4VarP6.i(ve4VarP7), ve4VarI8.p(ve4VarP7).j(ve4VarP5, ve4VarI5, ve4VarI7), new ve4[]{ve4VarI7.i(ve4VarI6)}, this.e);
            }
            ve4 ve4Var2 = null;
            if (i2 != 2 && i2 != 4) {
                r6.g("unsupported coordinate system");
                return null;
            }
            ve4 ve4Var3 = ve4VarArr3[0];
            ve4 ve4Var4 = ve4VarArr2[0];
            boolean zG3 = ve4Var3.g();
            if (zG3 || !ve4Var3.equals(ve4Var4)) {
                if (!zG3) {
                    ve4 ve4VarN2 = ve4Var3.n();
                    ve4VarI2 = ve4VarN2.i(ve4VarI2);
                    ve4VarI3 = ve4VarN2.i(ve4Var3).i(ve4VarI3);
                }
                boolean zG4 = ve4Var4.g();
                if (zG4) {
                    c = 0;
                } else {
                    c = 0;
                    ve4 ve4VarN3 = ve4Var4.n();
                    ve4VarI4 = ve4VarN3.i(ve4VarI4);
                    ve4VarI5 = ve4VarN3.i(ve4Var4).i(ve4VarI5);
                }
                ve4 ve4VarP8 = ve4VarI4.p(ve4VarI2);
                ve4 ve4VarP9 = ve4VarI5.p(ve4VarI3);
                if (ve4VarP8.h()) {
                    return ve4VarP9.h() ? m() : ue4Var.i();
                }
                ve4 ve4VarN4 = ve4VarP8.n();
                ve4 ve4VarI9 = ve4VarN4.i(ve4VarP8);
                ve4 ve4VarI10 = ve4VarN4.i(ve4VarI4);
                i = 1;
                ve4 ve4VarP10 = ve4VarP9.n().a(ve4VarI9).p(ve4VarI10.a(ve4VarI10));
                ve4VarJ = ve4VarI10.p(ve4VarP10).j(ve4VarP9, ve4VarI9, ve4VarI5);
                ve4 ve4VarI11 = !zG3 ? ve4VarP8.i(ve4Var3) : ve4VarP8;
                ve4VarI = !zG4 ? ve4VarI11.i(ve4Var4) : ve4VarI11;
                if (ve4VarI == ve4VarP8) {
                    ve4VarP = ve4VarP10;
                    ve4Var2 = ve4VarN4;
                } else {
                    ve4VarP = ve4VarP10;
                    ve4Var2 = null;
                }
            } else {
                ve4 ve4VarP11 = ve4VarI4.p(ve4VarI2);
                ve4 ve4VarP12 = ve4VarI5.p(ve4VarI3);
                if (ve4VarP11.h()) {
                    return ve4VarP12.h() ? m() : ue4Var.i();
                }
                ve4 ve4VarN5 = ve4VarP11.n();
                ve4 ve4VarI12 = ve4VarI4.i(ve4VarN5);
                ve4 ve4VarI13 = ve4VarI2.i(ve4VarN5);
                ve4 ve4VarI14 = ve4VarI12.p(ve4VarI13).i(ve4VarI5);
                ve4VarP = ve4VarP12.n().p(ve4VarI12).p(ve4VarI13);
                ve4VarJ = ve4VarI12.p(ve4VarP).i(ve4VarP12).p(ve4VarI14);
                ve4VarI = ve4VarP11.i(ve4Var3);
                i = 1;
                c = 0;
            }
            if (i2 == 4) {
                ve4 ve4VarN6 = n(ve4VarI, ve4Var2);
                ve4VarArr = new ve4[2];
                ve4VarArr[c] = ve4VarI;
                ve4VarArr[i] = ve4VarN6;
            } else {
                ve4VarArr = new ve4[i];
                ve4VarArr[c] = ve4VarI;
            }
            return new d(ue4Var, ve4VarP, ve4VarJ, ve4VarArr, this.e);
        }

        @Override // defpackage.ye4
        public final ye4 h() {
            if (f()) {
                return this;
            }
            ue4 ue4Var = this.a;
            int i = ue4Var.f;
            ve4 ve4Var = this.c;
            ve4 ve4Var2 = this.b;
            return i != 0 ? new d(ue4Var, ve4Var2, ve4Var.l(), this.d, this.e) : new d(ue4Var, ve4Var2, ve4Var.l(), this.e);
        }

        @Override // defpackage.ye4
        public final ye4 m() {
            ve4 ve4VarP;
            ve4 ve4VarA;
            if (f()) {
                return this;
            }
            ve4 ve4Var = this.c;
            boolean zH = ve4Var.h();
            ue4 ue4Var = this.a;
            if (zH) {
                return ue4Var.i();
            }
            int i = ue4Var.f;
            ve4 ve4Var2 = this.b;
            if (i == 0) {
                ve4 ve4VarN = ve4Var2.n();
                ve4 ve4VarD = ve4VarN.a(ve4VarN).a(ve4VarN).a(ue4Var.b).d(ve4Var.a(ve4Var));
                ve4 ve4VarP2 = ve4VarD.n().p(ve4Var2.a(ve4Var2));
                return new d(ue4Var, ve4VarP2, ve4VarD.i(ve4Var2.p(ve4VarP2)).p(ve4Var), this.e);
            }
            ve4[] ve4VarArr = this.d;
            if (i == 1) {
                ve4 ve4Var3 = ve4VarArr[0];
                boolean zG = ve4Var3.g();
                ve4 ve4VarI = ue4Var.b;
                if (!ve4VarI.h() && !zG) {
                    ve4VarI = ve4VarI.i(ve4Var3.n());
                }
                ve4 ve4VarN2 = ve4Var2.n();
                ve4 ve4VarA2 = ve4VarI.a(ve4VarN2.a(ve4VarN2).a(ve4VarN2));
                ve4 ve4VarI2 = zG ? ve4Var : ve4Var.i(ve4Var3);
                ve4 ve4VarN3 = zG ? ve4Var.n() : ve4VarI2.i(ve4Var);
                ve4 ve4VarI3 = ve4Var2.i(ve4VarN3);
                ve4 ve4VarA3 = ve4VarI3.a(ve4VarI3);
                ve4 ve4VarA4 = ve4VarA3.a(ve4VarA3);
                ve4 ve4VarP3 = ve4VarA2.n().p(ve4VarA4.a(ve4VarA4));
                ve4 ve4VarA5 = ve4VarI2.a(ve4VarI2);
                ve4 ve4VarI4 = ve4VarP3.i(ve4VarA5);
                ve4 ve4VarA6 = ve4VarN3.a(ve4VarN3);
                ve4 ve4VarI5 = ve4VarA4.p(ve4VarP3).i(ve4VarA2);
                ve4 ve4VarN4 = ve4VarA6.n();
                ve4 ve4VarP4 = ve4VarI5.p(ve4VarN4.a(ve4VarN4));
                ve4 ve4VarA7 = zG ? ve4VarA6.a(ve4VarA6) : ve4VarA5.n();
                return new d(ue4Var, ve4VarI4, ve4VarP4, new ve4[]{ve4VarA7.a(ve4VarA7).i(ve4VarI2)}, this.e);
            }
            if (i != 2) {
                if (i != 4) {
                    r6.g("unsupported coordinate system");
                    return null;
                }
                ve4 ve4Var4 = ve4VarArr[0];
                ve4 ve4VarN5 = ve4VarArr[1];
                if (ve4VarN5 == null) {
                    ve4VarN5 = n(ve4VarArr[0], null);
                    ve4VarArr[1] = ve4VarN5;
                }
                ve4 ve4VarN6 = ve4Var2.n();
                ve4 ve4VarA8 = ve4VarN6.a(ve4VarN6).a(ve4VarN6).a(ve4VarN5);
                ve4 ve4VarA9 = ve4Var.a(ve4Var);
                ve4 ve4VarI6 = ve4VarA9.i(ve4Var);
                ve4 ve4VarI7 = ve4Var2.i(ve4VarI6);
                ve4 ve4VarA10 = ve4VarI7.a(ve4VarI7);
                ve4 ve4VarP5 = ve4VarA8.n().p(ve4VarA10.a(ve4VarA10));
                ve4 ve4VarN7 = ve4VarI6.n();
                ve4 ve4VarA11 = ve4VarN7.a(ve4VarN7);
                ve4 ve4VarP6 = ve4VarA8.i(ve4VarA10.p(ve4VarP5)).p(ve4VarA11);
                ve4 ve4VarI8 = ve4VarA11.i(ve4VarN5);
                ve4 ve4VarA12 = ve4VarI8.a(ve4VarI8);
                if (!ve4Var4.g()) {
                    ve4VarA9 = ve4VarA9.i(ve4Var4);
                }
                return new d(this.a, ve4VarP5, ve4VarP6, new ve4[]{ve4VarA9, ve4VarA12}, this.e);
            }
            ve4 ve4Var5 = ve4VarArr[0];
            boolean zG2 = ve4Var5.g();
            ve4 ve4VarN8 = ve4Var.n();
            ve4 ve4VarN9 = ve4VarN8.n();
            ve4 ve4Var6 = ue4Var.b;
            ve4 ve4VarL = ve4Var6.l();
            if (ve4VarL.r().equals(BigInteger.valueOf(3L))) {
                ve4 ve4VarN10 = zG2 ? ve4Var5 : ve4Var5.n();
                ve4 ve4VarI9 = ve4Var2.a(ve4VarN10).i(ve4Var2.p(ve4VarN10));
                ve4VarP = ve4VarI9.a(ve4VarI9).a(ve4VarI9);
                ve4 ve4VarI10 = ve4VarN8.i(ve4Var2);
                ve4 ve4VarA13 = ve4VarI10.a(ve4VarI10);
                ve4VarA = ve4VarA13.a(ve4VarA13);
            } else {
                ve4 ve4VarN11 = ve4Var2.n();
                ve4 ve4VarA14 = ve4VarN11.a(ve4VarN11).a(ve4VarN11);
                if (zG2) {
                    ve4VarP = ve4VarA14.a(ve4Var6);
                } else if (ve4Var6.h()) {
                    ve4VarP = ve4VarA14;
                } else {
                    ve4 ve4VarN12 = ve4Var5.n().n();
                    ve4VarP = ve4VarL.c() < ve4Var6.c() ? ve4VarA14.p(ve4VarN12.i(ve4VarL)) : ve4VarA14.a(ve4VarN12.i(ve4Var6));
                }
                ve4 ve4VarI11 = ve4Var2.i(ve4VarN8);
                ve4 ve4VarA15 = ve4VarI11.a(ve4VarI11);
                ve4VarA = ve4VarA15.a(ve4VarA15);
            }
            ve4 ve4VarP7 = ve4VarP.n().p(ve4VarA.a(ve4VarA));
            ve4 ve4VarI12 = ve4VarA.p(ve4VarP7).i(ve4VarP);
            ve4 ve4VarA16 = ve4VarN9.a(ve4VarN9);
            ve4 ve4VarA17 = ve4VarA16.a(ve4VarA16);
            ve4 ve4VarP8 = ve4VarI12.p(ve4VarA17.a(ve4VarA17));
            ve4 ve4VarA18 = ve4Var.a(ve4Var);
            if (!zG2) {
                ve4VarA18 = ve4VarA18.i(ve4Var5);
            }
            return new d(ue4Var, ve4VarP7, ve4VarP8, new ve4[]{ve4VarA18}, this.e);
        }

        public final ve4 n(ve4 ve4Var, ve4 ve4Var2) {
            ve4 ve4Var3 = this.a.b;
            if (ve4Var3.h() || ve4Var.g()) {
                return ve4Var3;
            }
            if (ve4Var2 == null) {
                ve4Var2 = ve4Var.n();
            }
            ve4 ve4VarN = ve4Var2.n();
            ve4 ve4VarL = ve4Var3.l();
            return ve4VarL.c() < ve4Var3.c() ? ve4VarN.i(ve4VarL).l() : ve4VarN.i(ve4Var3);
        }

        public d(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
            super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
            this.e = z;
        }
    }

    public static class c extends a {
        public c(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, boolean z) {
            super(ue4Var, ve4Var, ve4Var2);
            if ((ve4Var == null) != (ve4Var2 == null)) {
                l5.q("Exactly one of the field elements is null");
                throw null;
            }
            if (ve4Var != null) {
                ve4.a.s(ve4Var, ve4Var2);
                if (ue4Var != null) {
                    ve4.a.s(ve4Var, ue4Var.b);
                }
            }
            this.e = z;
        }

        @Override // defpackage.ye4
        public final ye4 a(ye4 ye4Var) {
            ve4 ve4VarI;
            ve4 ve4VarI2;
            ve4 ve4VarI3;
            ve4 ve4VarI4;
            ve4 ve4Var;
            ve4 ve4Var2;
            if (f()) {
                return ye4Var;
            }
            boolean zF = ye4Var.f();
            ve4[] ve4VarArr = ye4Var.d;
            ve4 ve4Var3 = ye4Var.c;
            if (zF) {
                return this;
            }
            ue4 ue4Var = this.a;
            int i = ue4Var.f;
            ve4 ve4Var4 = ye4Var.b;
            ve4 ve4Var5 = this.c;
            ve4 ve4VarI5 = this.b;
            if (i == 0) {
                ve4 ve4VarA = ve4VarI5.a(ve4Var4);
                ve4 ve4VarA2 = ve4Var5.a(ve4Var3);
                if (ve4VarA.h()) {
                    return ve4VarA2.h() ? m() : ue4Var.i();
                }
                ve4 ve4VarD = ve4VarA2.d(ve4VarA);
                ve4 ve4VarA3 = k20.j(ve4VarD, ve4VarD, ve4VarA).a(ue4Var.b);
                return new c(ue4Var, ve4VarA3, ve4VarD.i(ve4VarI5.a(ve4VarA3)).a(ve4VarA3).a(ve4Var5), this.e);
            }
            ve4[] ve4VarArr2 = this.d;
            if (i == 1) {
                ve4 ve4VarI6 = ve4VarArr2[0];
                ve4 ve4Var6 = ve4VarArr[0];
                boolean zG = ve4Var6.g();
                ve4 ve4VarA4 = ve4VarI6.i(ve4Var3).a(zG ? ve4Var5 : ve4Var5.i(ve4Var6));
                ve4 ve4VarA5 = ve4VarI6.i(ve4Var4).a(zG ? ve4VarI5 : ve4VarI5.i(ve4Var6));
                if (ve4VarA5.h()) {
                    return ve4VarA4.h() ? m() : ue4Var.i();
                }
                ve4 ve4VarN = ve4VarA5.n();
                ve4 ve4VarI7 = ve4VarN.i(ve4VarA5);
                if (!zG) {
                    ve4VarI6 = ve4VarI6.i(ve4Var6);
                }
                ve4 ve4VarA6 = ve4VarA4.a(ve4VarA5);
                ve4 ve4VarA7 = ve4VarA6.k(ve4VarA4, ve4VarN, ue4Var.b).i(ve4VarI6).a(ve4VarI7);
                ve4 ve4VarI8 = ve4VarA5.i(ve4VarA7);
                if (!zG) {
                    ve4VarN = ve4VarN.i(ve4Var6);
                }
                return new c(ue4Var, ve4VarI8, ve4VarA4.k(ve4VarI5, ve4VarA5, ve4Var5).k(ve4VarN, ve4VarA6, ve4VarA7), new ve4[]{ve4VarI7.i(ve4VarI6)}, this.e);
            }
            if (i != 6) {
                r6.g("unsupported coordinate system");
                return null;
            }
            if (ve4VarI5.h()) {
                return ve4Var4.h() ? ue4Var.i() : ye4Var.a(this);
            }
            ve4 ve4Var7 = ve4VarArr2[0];
            ve4 ve4Var8 = ve4VarArr[0];
            boolean zG2 = ve4Var7.g();
            if (zG2) {
                ve4VarI = ve4Var3;
                ve4VarI2 = ve4Var4;
            } else {
                ve4VarI2 = ve4Var4.i(ve4Var7);
                ve4VarI = ve4Var3.i(ve4Var7);
            }
            boolean zG3 = ve4Var8.g();
            if (zG3) {
                ve4VarI3 = ve4Var5;
            } else {
                ve4VarI5 = ve4VarI5.i(ve4Var8);
                ve4VarI3 = ve4Var5.i(ve4Var8);
            }
            ve4 ve4VarA8 = ve4VarI3.a(ve4VarI);
            ve4 ve4VarA9 = ve4VarI5.a(ve4VarI2);
            if (ve4VarA9.h()) {
                return ve4VarA8.h() ? m() : ue4Var.i();
            }
            if (ve4Var4.h()) {
                ye4 ye4VarI = i();
                ve4 ve4Var9 = ye4VarI.b;
                ve4 ve4VarD2 = ye4VarI.d();
                ve4 ve4VarD3 = ve4VarD2.a(ve4Var3).d(ve4Var9);
                ve4 ve4VarA10 = k20.j(ve4VarD3, ve4VarD3, ve4Var9).a(ue4Var.b);
                if (ve4VarA10.h()) {
                    return new c(ue4Var, ve4VarA10, ue4Var.c.m(), this.e);
                }
                ve4 ve4VarA11 = ve4VarD3.i(ve4Var9.a(ve4VarA10)).a(ve4VarA10).a(ve4VarD2).d(ve4VarA10).a(ve4VarA10);
                ve4VarI4 = ue4Var.g(te4.b);
                ve4Var = ve4VarA11;
                ve4Var2 = ve4VarA10;
            } else {
                ve4 ve4VarN2 = ve4VarA9.n();
                ve4 ve4VarI9 = ve4VarA8.i(ve4VarI5);
                ve4 ve4VarI10 = ve4VarA8.i(ve4VarI2);
                ve4 ve4VarI11 = ve4VarI9.i(ve4VarI10);
                if (ve4VarI11.h()) {
                    return new c(ue4Var, ve4VarI11, ue4Var.c.m(), this.e);
                }
                ve4 ve4VarI12 = ve4VarA8.i(ve4VarN2);
                ve4VarI4 = !zG3 ? ve4VarI12.i(ve4Var8) : ve4VarI12;
                ve4 ve4VarO = ve4VarI10.a(ve4VarN2).o(ve4VarI4, ve4Var5.a(ve4Var7));
                if (!zG2) {
                    ve4VarI4 = ve4VarI4.i(ve4Var7);
                }
                ve4Var = ve4VarO;
                ve4Var2 = ve4VarI11;
            }
            return new c(ue4Var, ve4Var2, ve4Var, new ve4[]{ve4VarI4}, this.e);
        }

        @Override // defpackage.ye4
        public final ve4 d() {
            int iC = c();
            ve4 ve4Var = this.c;
            if ((iC == 5 || iC == 6) && !f()) {
                ve4 ve4Var2 = this.b;
                if (!ve4Var2.h()) {
                    ve4 ve4VarI = ve4Var.a(ve4Var2).i(ve4Var2);
                    if (6 == iC) {
                        ve4 ve4Var3 = this.d[0];
                        if (!ve4Var3.g()) {
                            return ve4VarI.d(ve4Var3);
                        }
                    }
                    return ve4VarI;
                }
            }
            return ve4Var;
        }

        @Override // defpackage.ye4
        public final ye4 h() {
            if (!f()) {
                ve4 ve4Var = this.b;
                if (!ve4Var.h()) {
                    int iC = c();
                    ue4 ue4Var = this.a;
                    ve4 ve4Var2 = this.c;
                    if (iC == 0) {
                        return new c(ue4Var, ve4Var, ve4Var2.a(ve4Var), this.e);
                    }
                    ve4[] ve4VarArr = this.d;
                    if (iC == 1) {
                        ve4 ve4Var3 = ve4VarArr[0];
                        boolean z = this.e;
                        return new c(this.a, ve4Var, ve4Var2.a(ve4Var), new ve4[]{ve4Var3}, z);
                    }
                    if (iC == 5) {
                        return new c(ue4Var, ve4Var, ve4Var2.b(), this.e);
                    }
                    if (iC != 6) {
                        r6.g("unsupported coordinate system");
                        return null;
                    }
                    ve4 ve4Var4 = ve4VarArr[0];
                    boolean z2 = this.e;
                    return new c(this.a, ve4Var, ve4Var2.a(ve4Var4), new ve4[]{ve4Var4}, z2);
                }
            }
            return this;
        }

        @Override // defpackage.ye4
        public final ye4 m() {
            ve4 ve4VarA;
            if (f()) {
                return this;
            }
            ve4 ve4VarI = this.b;
            boolean zH = ve4VarI.h();
            ue4 ue4Var = this.a;
            if (zH) {
                return ue4Var.i();
            }
            int i = ue4Var.f;
            ve4 ve4VarI2 = this.c;
            if (i == 0) {
                ve4 ve4VarA2 = ve4VarI2.d(ve4VarI).a(ve4VarI);
                ve4 ve4VarA3 = ve4VarA2.n().a(ve4VarA2).a(ue4Var.b);
                return new c(ue4Var, ve4VarA3, ve4VarI.o(ve4VarA3, ve4VarA2.b()), this.e);
            }
            ve4[] ve4VarArr = this.d;
            if (i == 1) {
                ve4 ve4Var = ve4VarArr[0];
                boolean zG = ve4Var.g();
                ve4 ve4VarI3 = zG ? ve4VarI : ve4VarI.i(ve4Var);
                if (!zG) {
                    ve4VarI2 = ve4VarI2.i(ve4Var);
                }
                ve4 ve4VarN = ve4VarI.n();
                ve4 ve4VarA4 = ve4VarN.a(ve4VarI2);
                ve4 ve4VarN2 = ve4VarI3.n();
                ve4 ve4VarA5 = ve4VarA4.a(ve4VarI3);
                ve4 ve4VarK = ve4VarA5.k(ve4VarA4, ve4VarN2, ue4Var.b);
                return new c(ue4Var, ve4VarI3.i(ve4VarK), ve4VarN.n().k(ve4VarI3, ve4VarK, ve4VarA5), new ve4[]{ve4VarI3.i(ve4VarN2)}, this.e);
            }
            if (i != 6) {
                r6.g("unsupported coordinate system");
                return null;
            }
            ve4 ve4Var2 = ve4VarArr[0];
            boolean zG2 = ve4Var2.g();
            ve4 ve4VarI4 = zG2 ? ve4VarI2 : ve4VarI2.i(ve4Var2);
            ve4 ve4VarN3 = zG2 ? ve4Var2 : ve4Var2.n();
            ve4 ve4Var3 = ue4Var.b;
            ve4 ve4VarI5 = zG2 ? ve4Var3 : ve4Var3.i(ve4VarN3);
            ve4 ve4VarJ = k20.j(ve4VarI2, ve4VarI4, ve4VarI5);
            if (ve4VarJ.h()) {
                return new c(ue4Var, ve4VarJ, ue4Var.c.m(), this.e);
            }
            ve4 ve4VarN4 = ve4VarJ.n();
            ve4 ve4VarI6 = zG2 ? ve4VarJ : ve4VarJ.i(ve4VarN3);
            ve4 ve4Var4 = ue4Var.c;
            if (ve4Var4.c() < (ue4Var.h() >> 1)) {
                ve4 ve4VarN5 = ve4VarI2.a(ve4VarI).n();
                ve4VarA = ve4VarN5.a(ve4VarJ).a(ve4VarN3).i(ve4VarN5).a(ve4Var4.g() ? ve4VarI5.a(ve4VarN3).n() : ve4VarI5.o(ve4Var4, ve4VarN3.n())).a(ve4VarN4);
                if (ve4Var3.h()) {
                    ve4VarA = ve4VarA.a(ve4VarI6);
                } else if (!ve4Var3.g()) {
                    ve4VarA = ve4VarA.a(ve4Var3.b().i(ve4VarI6));
                }
            } else {
                if (!zG2) {
                    ve4VarI = ve4VarI.i(ve4Var2);
                }
                ve4VarA = ve4VarI.o(ve4VarJ, ve4VarI4).a(ve4VarN4).a(ve4VarI6);
            }
            return new c(ue4Var, ve4VarN4, ve4VarA, new ve4[]{ve4VarI6}, this.e);
        }

        public c(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr, boolean z) {
            super(ue4Var, ve4Var, ve4Var2, ve4VarArr);
            this.e = z;
        }
    }

    public ye4(ue4 ue4Var, ve4 ve4Var, ve4 ve4Var2, ve4[] ve4VarArr) {
        this.a = ue4Var;
        this.b = ve4Var;
        this.c = ve4Var2;
        this.d = ve4VarArr;
    }
}
