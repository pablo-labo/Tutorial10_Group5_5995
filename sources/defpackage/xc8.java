package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class xc8 {
    public final String a;

    public xc8(String str) {
        if (str != null) {
            this.a = str;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc8.a(int):void");
    }

    public static xc8 b(mq5 mq5Var) {
        if (mq5Var != null) {
            return new xc8(mq5Var.a.a.replace(JwtParser.SEPARATOR_CHAR, '/'));
        }
        a(4);
        throw null;
    }

    public static xc8 c(String str) {
        if (str != null) {
            return new xc8(str);
        }
        a(0);
        throw null;
    }

    public static String e(a62 a62Var) {
        mq5 mq5Var = a62Var.a;
        String strReplace = a62Var.b.a.a.replace(JwtParser.SEPARATOR_CHAR, '$');
        if (!mq5Var.a.c()) {
            strReplace = mq5Var.a.a.replace(JwtParser.SEPARATOR_CHAR, '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        a(3);
        throw null;
    }

    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a(10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xc8.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((xc8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
