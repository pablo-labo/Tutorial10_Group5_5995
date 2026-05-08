package defpackage;

import defpackage.awc;
import defpackage.fi8;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class bwc implements fi8 {
    public final ClassLoader a;
    public final lp1 b = new lp1();

    public bwc(ClassLoader classLoader) {
        this.a = classLoader;
    }

    @Override // defpackage.fi8
    public final fi8.a.C0233a a(a62 a62Var, us9 us9Var) {
        Class<?> cls;
        awc awcVarA;
        a62Var.getClass();
        us9Var.getClass();
        String strH = wve.H(a62Var.b.a.a, JwtParser.SEPARATOR_CHAR, '$');
        mq5 mq5Var = a62Var.a;
        if (!mq5Var.a.c()) {
            strH = mq5Var + JwtParser.SEPARATOR_CHAR + strH;
        }
        try {
            cls = Class.forName(strH, false, this.a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (awcVarA = awc.a.a(cls)) == null) {
            return null;
        }
        return new fi8.a.C0233a(awcVarA);
    }

    @Override // defpackage.fi8
    public final fi8.a.C0233a b(hvc hvcVar, us9 us9Var) {
        String str;
        Class<?> cls;
        awc awcVarA;
        hvcVar.getClass();
        us9Var.getClass();
        mq5 mq5VarH = hvcVar.h();
        if (mq5VarH == null || (str = mq5VarH.a.a) == null) {
            return null;
        }
        try {
            cls = Class.forName(str, false, this.a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || (awcVarA = awc.a.a(cls)) == null) {
            return null;
        }
        return new fi8.a.C0233a(awcVarA);
    }
}
