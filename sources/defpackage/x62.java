package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface x62 {

    public static final class a implements x62 {
        public static final a a = new a();

        @Override // defpackage.x62
        public final String a(v62 v62Var, pz3 pz3Var) {
            if (v62Var instanceof rxf) {
                n8a name = ((rxf) v62Var).getName();
                name.getClass();
                return pz3Var.P(name, false);
            }
            nq5 nq5VarG = yz3.g(v62Var);
            nq5VarG.getClass();
            return pz3Var.H(nq5VarG);
        }
    }

    public static final class b implements x62 {
        public static final b a = new b();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [v62] */
        /* JADX WARN: Type inference failed for: r1v1, types: [aj3] */
        /* JADX WARN: Type inference failed for: r1v2, types: [aj3] */
        @Override // defpackage.x62
        public final String a(v62 v62Var, pz3 pz3Var) {
            if (v62Var instanceof rxf) {
                n8a name = ((rxf) v62Var).getName();
                name.getClass();
                return pz3Var.P(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(v62Var.getName());
                v62Var = v62Var.d();
            } while (v62Var instanceof t52);
            return web.w(new wad(arrayList));
        }
    }

    public static final class c implements x62 {
        public static final c a = new c();

        public static String b(v62 v62Var) {
            String strW;
            n8a name = v62Var.getName();
            name.getClass();
            String strV = web.v(name);
            if (!(v62Var instanceof rxf)) {
                aj3 aj3VarD = v62Var.d();
                aj3VarD.getClass();
                if (aj3VarD instanceof t52) {
                    strW = b((v62) aj3VarD);
                } else if (aj3VarD instanceof lya) {
                    nq5 nq5Var = ((lya) aj3VarD).h().a;
                    nq5Var.getClass();
                    strW = web.w(nq5.e(nq5Var));
                } else {
                    strW = null;
                }
                if (strW != null && !strW.equals("")) {
                    return g7.e(JwtParser.SEPARATOR_CHAR, strW, strV);
                }
            }
            return strV;
        }

        @Override // defpackage.x62
        public final String a(v62 v62Var, pz3 pz3Var) {
            return b(v62Var);
        }
    }

    String a(v62 v62Var, pz3 pz3Var);
}
