package defpackage;

import defpackage.c7e;
import defpackage.e69;
import defpackage.fe9;
import defpackage.ke9;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z82 implements ee9<fe9.a> {
    public static final pxc a = new pxc("^ {0,3}(~~~+|```+)([^`]*)$");

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpeningInfo(delimiter=");
            sb.append(this.a);
            sb.append(", info=");
            return w40.f(sb, this.b, ')');
        }
    }

    public static a c(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        int i = aVar.b;
        String str = aVar.d;
        if (i == hd9.d(gd9Var, str)) {
            ke9 ke9VarA = a.a(str.substring(i), 0);
            if (ke9VarA != null) {
                ke9.b bVar = ke9VarA.c;
                ie9 ie9VarB = bVar.b(1);
                String str2 = ie9VarB != null ? ie9VarB.a : null;
                str2.getClass();
                ie9 ie9VarB2 = bVar.b(2);
                String str3 = ie9VarB2 != null ? ie9VarB2.a : null;
                str3.getClass();
                return new a(str2, str3);
            }
        }
        return null;
    }

    @Override // defpackage.ee9
    public final List<ce9> a(e69.a aVar, xpb xpbVar, fe9.a aVar2) {
        ArrayList arrayList = xpbVar.b;
        aVar2.getClass();
        gd9 gd9Var = aVar2.a;
        a aVarC = c(aVar, gd9Var);
        if (aVarC == null) {
            return zr4.a;
        }
        String str = aVarC.b;
        int iC = aVar.c() - str.length();
        arrayList.addAll(u63.Z(new c7e.a(new oh7(aVar.c, iC, 1), zd9.E)));
        if (str.length() > 0) {
            arrayList.addAll(u63.Z(new c7e.a(new oh7(iC, aVar.c(), 1), zd9.D)));
        }
        return u63.Z(new y82(gd9Var, xpbVar, aVarC.a));
    }

    @Override // defpackage.ee9
    public final boolean b(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        return c(aVar, gd9Var) != null;
    }
}
