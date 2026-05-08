package defpackage;

import defpackage.hi8;
import defpackage.rw5;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class jd8 implements c14 {
    public final xc8 a;
    public final xc8 b;
    public final oi8 c;

    public jd8() {
        throw null;
    }

    public jd8(oi8 oi8Var, e5c e5cVar, hd8 hd8Var, b14 b14Var) {
        oi8Var.getClass();
        e5cVar.getClass();
        hd8Var.getClass();
        xc8 xc8Var = new xc8(xc8.e(oi8Var.j()));
        hi8 hi8VarA = oi8Var.a();
        xc8 xc8VarC = null;
        String str = hi8VarA.a != hi8.a.MULTIFILE_CLASS_PART ? null : hi8VarA.f;
        if (str != null && str.length() > 0) {
            xc8VarC = xc8.c(str);
        }
        this.a = xc8Var;
        this.b = xc8VarC;
        this.c = oi8Var;
        rw5.e<e5c, Integer> eVar = od8.m;
        eVar.getClass();
        Integer num = (Integer) r5c.a(e5cVar, eVar);
        if (num != null) {
            hd8Var.getString(num.intValue());
        }
    }

    @Override // defpackage.c14
    public final String a() {
        return w40.f(new StringBuilder("Class '"), c().a().a.a, '\'');
    }

    public final a62 c() {
        mq5 mq5Var;
        xc8 xc8Var = this.a;
        String str = xc8Var.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            mq5Var = mq5.c;
            if (mq5Var == null) {
                xc8.a(9);
                throw null;
            }
        } else {
            mq5Var = new mq5(str.substring(0, iLastIndexOf).replace('/', JwtParser.SEPARATOR_CHAR));
        }
        String strD = xc8Var.d();
        strD.getClass();
        return new a62(mq5Var, n8a.h(zve.o0('/', strD, strD)));
    }

    public final String toString() {
        return jd8.class.getSimpleName() + ": " + this.a;
    }
}
