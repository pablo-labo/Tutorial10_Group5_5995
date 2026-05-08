package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uw7 {
    public final mp8 a;
    public final uxf b;
    public final beb c;
    public final vxf d;

    public uw7(mp8 mp8Var, uxf uxfVar) {
        uxfVar.getClass();
        this.a = mp8Var;
        this.b = uxfVar;
        beb bebVar = new beb();
        this.c = bebVar;
        this.d = new vxf(bebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mge a(defpackage.tu7 r22, defpackage.lw7 r23, defpackage.mge r24) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw7.a(tu7, lw7, mge):mge");
    }

    public final kwf b(tu7 tu7Var) {
        tu7Var.o();
        throw null;
    }

    public final p7g c(bvc bvcVar, lw7 lw7Var, boolean z) {
        mp8 mp8Var = this.a;
        sv7 sv7Var = mp8Var.a;
        bvcVar.getClass();
        boolean z2 = lw7Var.e;
        vvc vvcVarT = bvcVar.t();
        tvc tvcVar = vvcVarT instanceof tvc ? (tvc) vvcVarT : null;
        bnb bnbVarT = tvcVar != null ? tvcVar.t() : null;
        zo8 zo8Var = new zo8(mp8Var, bvcVar, true);
        if (bnbVarT != null) {
            mge mgeVarR = sv7Var.o.l().r(bnbVarT);
            ui8 ui8VarK = boa.K(mgeVarR, new sl2(mgeVarR.getAnnotations(), zo8Var));
            ui8VarK.getClass();
            mge mgeVar = (mge) ui8VarK;
            return z2 ? mgeVar : yi8.a(mgeVar, mgeVar.Q0(true));
        }
        ui8 ui8VarD = d(vvcVarT, wab.A(jyf.b, z2, null, 6));
        ylg ylgVar = ylg.INVARIANT;
        ylg ylgVar2 = ylg.OUT_VARIANCE;
        if (!z2) {
            return yi8.a(sv7Var.o.l().i(ylgVar, ui8VarD, zo8Var), sv7Var.o.l().i(ylgVar2, ui8VarD, zo8Var).Q0(true));
        }
        if (z) {
            ylgVar = ylgVar2;
        }
        return sv7Var.o.l().i(ylgVar, ui8VarD, zo8Var);
    }

    public final ui8 d(jw7 jw7Var, lw7 lw7Var) {
        mge mgeVarA;
        sv7 sv7Var = this.a.a;
        if (jw7Var instanceof tvc) {
            bnb bnbVarT = ((tvc) jw7Var).t();
            return bnbVarT != null ? sv7Var.o.l().t(bnbVarT) : sv7Var.o.l().x();
        }
        boolean z = false;
        if (!(jw7Var instanceof tu7)) {
            if (jw7Var instanceof bvc) {
                return c((bvc) jw7Var, lw7Var, false);
            }
            if (jw7Var instanceof yvc) {
                vvc vvcVarT = ((yvc) jw7Var).t();
                return vvcVarT != null ? d(vvcVarT, lw7Var) : sv7Var.o.l().n();
            }
            if (jw7Var == null) {
                return sv7Var.o.l().n();
            }
            l5.p(jw7Var, "Unsupported type: ");
            return null;
        }
        tu7 tu7Var = (tu7) jw7Var;
        if (!lw7Var.e && lw7Var.b != jyf.a) {
            z = true;
        }
        boolean zE = tu7Var.e();
        kx4 kx4Var = kx4.a;
        if (!zE && !z) {
            mge mgeVarA2 = a(tu7Var, lw7Var, null);
            return mgeVarA2 != null ? mgeVarA2 : lx4.c(kx4Var, tu7Var.m());
        }
        mge mgeVarA3 = a(tu7Var, lw7.a(lw7Var, ow7.c, false, null, null, 61), null);
        if (mgeVarA3 != null && (mgeVarA = a(tu7Var, lw7.a(lw7Var, ow7.b, false, null, null, 61), mgeVarA3)) != null) {
            if (!zE) {
                return yi8.a(mgeVarA3, mgeVarA);
            }
            cjc cjcVar = new cjc(mgeVarA3, mgeVarA);
            vi8.a.d(mgeVarA3, mgeVarA);
            return cjcVar;
        }
        return lx4.c(kx4Var, tu7Var.m());
    }
}
