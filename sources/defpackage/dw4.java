package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class dw4 extends up2<Pair<? extends a62, ? extends n8a>> {
    public final a62 b;
    public final n8a c;

    public dw4(a62 a62Var, n8a n8aVar) {
        super(new Pair(a62Var, n8aVar));
        this.b = a62Var;
        this.c = n8aVar;
    }

    @Override // defpackage.up2
    public final ui8 a(xx9 xx9Var) {
        mge mgeVarO;
        xx9Var.getClass();
        a62 a62Var = this.b;
        t52 t52VarA = rc5.a(xx9Var, a62Var);
        if (t52VarA != null) {
            int i = yz3.a;
            if (!yz3.n(t52VarA, c62.ENUM_CLASS)) {
                t52VarA = null;
            }
            if (t52VarA != null && (mgeVarO = t52VarA.o()) != null) {
                return mgeVarO;
            }
        }
        return lx4.c(kx4.n0, a62Var.toString(), this.c.a);
    }

    @Override // defpackage.up2
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.c);
        return sb.toString();
    }
}
