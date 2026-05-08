package defpackage;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class we0 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ we0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IOException {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj2).getCanonicalName());
                z92.V0(((Map) obj).entrySet(), sb, ", ", "(", ")", ye0.b, 48);
                return sb.toString();
            default:
                ap8 ap8Var = (ap8) obj2;
                mp8 mp8Var = ap8Var.Y;
                sv7 sv7Var = mp8Var.a;
                mp8 mp8Var2 = new mp8(new sv7(sv7Var.a, sv7Var.b, sv7Var.c, sv7Var.d, sv7Var.e, sv7Var.f, sv7Var.h, sv7Var.i, sv7Var.j, sv7Var.k, sv7Var.l, sv7Var.m, sv7Var.n, sv7Var.o, sv7Var.p, sv7Var.q, sv7Var.r, sv7Var.s, sv7Var.t, sv7Var.u, sv7Var.v, sv7Var.w), mp8Var.b, mp8Var.c);
                aj3 aj3VarD = ap8Var.d();
                aj3VarD.getClass();
                return new ap8(mp8Var2, aj3VarD, ap8Var.W, (t52) obj);
        }
    }
}
