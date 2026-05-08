package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class sd9 {
    public static final Set<en6> i = ut0.I0(new en6[]{zd9.a, zd9.M, zd9.b, zd9.q, zd9.H, zd9.A, zd9.I, zd9.J, zd9.L});
    public final b7h a;
    public en6 b;
    public en6 c;
    public CharSequence d = "";
    public int e;
    public int f;
    public int g;
    public int h;

    public sd9(b7h b7hVar) {
        this.a = b7hVar;
    }

    public final void a() {
        en6 en6Var;
        do {
            b7h b7hVar = this.a;
            this.h = b7hVar.f() + b7hVar.f;
            en6 en6VarA = b7hVar.a();
            this.c = en6VarA;
            en6Var = this.b;
            if (!wl7.b(en6VarA, en6Var) || en6Var == null) {
                return;
            }
        } while (i.contains(en6Var));
    }
}
