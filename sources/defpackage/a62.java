package defpackage;

import defpackage.mq5;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class a62 {
    public final mq5 a;
    public final mq5 b;
    public final boolean c;

    public static final class a {
        public static a62 a(String str, boolean z) {
            String strI;
            str.getClass();
            int iR = zve.R(str, '`', 0, false, 6);
            if (iR == -1) {
                iR = str.length();
            }
            int iW = zve.W(str, iR, 4, "/");
            String str2 = "";
            if (iW == -1) {
                strI = wve.I(str, "`", "");
            } else {
                String strReplace = str.substring(0, iW).replace('/', JwtParser.SEPARATOR_CHAR);
                strReplace.getClass();
                strI = wve.I(str.substring(iW + 1), "`", "");
                str2 = strReplace;
            }
            return new a62(new mq5(str2), new mq5(strI), z);
        }

        public static a62 b(mq5 mq5Var) {
            mq5Var.getClass();
            return new a62(mq5Var.b(), mq5Var.a.f());
        }
    }

    public a62(mq5 mq5Var, mq5 mq5Var2, boolean z) {
        mq5Var.getClass();
        mq5Var2.getClass();
        this.a = mq5Var;
        this.b = mq5Var2;
        this.c = z;
        mq5Var2.a.c();
    }

    public static final String c(mq5 mq5Var) {
        String str = mq5Var.a.a;
        return zve.M(str, '/') ? ja.f('`', "`", str) : str;
    }

    public final mq5 a() {
        mq5 mq5Var = this.a;
        boolean zC = mq5Var.a.c();
        mq5 mq5Var2 = this.b;
        if (zC) {
            return mq5Var2;
        }
        return new mq5(mq5Var.a.a + JwtParser.SEPARATOR_CHAR + mq5Var2.a.a);
    }

    public final String b() {
        mq5 mq5Var = this.a;
        boolean zC = mq5Var.a.c();
        mq5 mq5Var2 = this.b;
        if (zC) {
            return c(mq5Var2);
        }
        return wve.H(mq5Var.a.a, JwtParser.SEPARATOR_CHAR, '/') + "/" + c(mq5Var2);
    }

    public final a62 d(n8a n8aVar) {
        n8aVar.getClass();
        return new a62(this.a, this.b.a(n8aVar), this.c);
    }

    public final a62 e() {
        mq5 mq5VarB = this.b.b();
        if (mq5VarB.a.c()) {
            return null;
        }
        return new a62(this.a, mq5VarB, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a62)) {
            return false;
        }
        a62 a62Var = (a62) obj;
        return wl7.b(this.a, a62Var.a) && wl7.b(this.b, a62Var.b) && this.c == a62Var.c;
    }

    public final n8a f() {
        return this.b.a.f();
    }

    public final boolean g() {
        return !this.b.b().a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean zC = this.a.a.c();
        String strB = b();
        return zC ? "/".concat(strB) : strB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a62(mq5 mq5Var, n8a n8aVar) {
        this(mq5Var, mq5.a.a(n8aVar), false);
        mq5Var.getClass();
        n8aVar.getClass();
        mq5 mq5Var2 = mq5.c;
    }
}
