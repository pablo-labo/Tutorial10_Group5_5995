package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class nq5 {
    public static final n8a e = n8a.n("<root>");
    public final String a;
    public transient mq5 b;
    public transient nq5 c;
    public transient n8a d;

    static {
        Pattern.compile("\\.").getClass();
    }

    public nq5(mq5 mq5Var, String str) {
        str.getClass();
        this.a = str;
        this.b = mq5Var;
    }

    public static final List<n8a> e(nq5 nq5Var) {
        if (nq5Var.c()) {
            return new ArrayList();
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
        List<n8a> listE = e(nq5Var2);
        listE.add(nq5Var.f());
        return listE;
    }

    public final nq5 a(n8a n8aVar) {
        String strC;
        n8aVar.getClass();
        if (c()) {
            strC = n8aVar.c();
        } else {
            strC = this.a + JwtParser.SEPARATOR_CHAR + n8aVar.c();
        }
        strC.getClass();
        return new nq5(strC, this, n8aVar);
    }

    public final void b() {
        String str = this.a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                break;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.d = n8a.f(str.substring(length + 1));
            this.c = new nq5(str.substring(0, length));
        } else {
            this.d = n8a.f(str);
            this.c = mq5.c.a;
        }
    }

    public final boolean c() {
        return this.a.length() == 0;
    }

    public final boolean d() {
        return this.b != null || zve.R(this.a, '<', 0, false, 6) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nq5) {
            return wl7.b(this.a, ((nq5) obj).a);
        }
        return false;
    }

    public final n8a f() {
        n8a n8aVar = this.d;
        if (n8aVar != null) {
            return n8aVar;
        }
        if (c()) {
            r6.g("root");
            return null;
        }
        b();
        n8a n8aVar2 = this.d;
        n8aVar2.getClass();
        return n8aVar2;
    }

    public final mq5 g() {
        mq5 mq5Var = this.b;
        if (mq5Var != null) {
            return mq5Var;
        }
        mq5 mq5Var2 = new mq5(this);
        this.b = mq5Var2;
        return mq5Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (!c()) {
            return this.a;
        }
        String strC = e.c();
        strC.getClass();
        return strC;
    }

    public nq5(String str) {
        this.a = str;
    }

    public nq5(String str, nq5 nq5Var, n8a n8aVar) {
        this.a = str;
        this.c = nq5Var;
        this.d = n8aVar;
    }
}
