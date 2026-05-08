package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class mq5 {
    public static final mq5 c = new mq5("");
    public final nq5 a;
    public transient mq5 b;

    public static final class a {
        public static mq5 a(n8a n8aVar) {
            n8aVar.getClass();
            String strC = n8aVar.c();
            strC.getClass();
            return new mq5(new nq5(strC, mq5.c.a, n8aVar));
        }
    }

    public mq5(String str) {
        str.getClass();
        this.a = new nq5(this, str);
    }

    public final mq5 a(n8a n8aVar) {
        n8aVar.getClass();
        return new mq5(this.a.a(n8aVar), this);
    }

    public final mq5 b() {
        mq5 mq5Var = this.b;
        if (mq5Var != null) {
            return mq5Var;
        }
        nq5 nq5Var = this.a;
        if (nq5Var.c()) {
            r6.g("root");
            return null;
        }
        nq5 nq5Var2 = nq5Var.c;
        if (nq5Var2 == null) {
            if (nq5Var.c()) {
                r6.g("root");
                return null;
            }
            nq5Var.b();
            nq5Var2 = nq5Var.c;
            nq5Var2.getClass();
        }
        mq5 mq5Var2 = new mq5(nq5Var2);
        this.b = mq5Var2;
        return mq5Var2;
    }

    public final boolean c(n8a n8aVar) {
        n8aVar.getClass();
        nq5 nq5Var = this.a;
        nq5Var.getClass();
        String str = nq5Var.a;
        if (!nq5Var.c()) {
            int iR = zve.R(str, JwtParser.SEPARATOR_CHAR, 0, false, 6);
            if (iR == -1) {
                iR = str.length();
            }
            int i = iR;
            String strC = n8aVar.c();
            strC.getClass();
            if (i == strC.length() && wve.F(0, 0, i, nq5Var.a, strC, false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mq5) {
            return wl7.b(this.a, ((mq5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public mq5(nq5 nq5Var) {
        this.a = nq5Var;
    }

    public mq5(nq5 nq5Var, mq5 mq5Var) {
        this.a = nq5Var;
        this.b = mq5Var;
    }
}
