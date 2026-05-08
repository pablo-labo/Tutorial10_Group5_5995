package defpackage;

import defpackage.gd8;

/* JADX INFO: loaded from: classes3.dex */
public final class ln9 {
    public final String a;

    public static final class a {
        public static ln9 a(gd8 gd8Var) {
            if (gd8Var instanceof gd8.b) {
                gd8.b bVar = (gd8.b) gd8Var;
                String str = bVar.a;
                String str2 = bVar.b;
                str.getClass();
                str2.getClass();
                return new ln9(str.concat(str2));
            }
            if (!(gd8Var instanceof gd8.a)) {
                l.g();
                return null;
            }
            gd8.a aVar = (gd8.a) gd8Var;
            String str3 = aVar.a;
            String str4 = aVar.b;
            str3.getClass();
            str4.getClass();
            return new ln9(g7.e('#', str3, str4));
        }
    }

    public ln9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln9) && this.a.equals(((ln9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return w40.f(new StringBuilder("MemberSignature(signature="), this.a, ')');
    }
}
