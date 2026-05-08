package defpackage;

import defpackage.ere;
import defpackage.j29;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class nc8 implements v52 {
    public static final n8a g;
    public static final a62 h;
    public final yx9 a;
    public final Function1<xx9, aj3> b;
    public final fla c;
    public static final /* synthetic */ qf8<Object>[] e = {fwc.a.g(new l4c(nc8.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};
    public static final a d = new a();
    public static final mq5 f = ere.l;

    public static final class a {
    }

    static {
        nq5 nq5Var = ere.a.c;
        g = nq5Var.f();
        mq5 mq5VarG = nq5Var.g();
        h = new a62(mq5VarG.b(), mq5VarG.a.f());
    }

    public nc8() {
        throw null;
    }

    public nc8(j29 j29Var, yx9 yx9Var) {
        op1 op1Var = op1.c;
        this.a = yx9Var;
        this.b = op1Var;
        this.c = new j29.h(j29Var, new mc8(this, j29Var));
    }

    @Override // defpackage.v52
    public final t52 a(a62 a62Var) {
        a62Var.getClass();
        if (!a62Var.equals(h)) {
            return null;
        }
        return (w52) zte.c(this.c, e[0]);
    }

    @Override // defpackage.v52
    public final Collection<t52> b(mq5 mq5Var) {
        mq5Var.getClass();
        if (!mq5Var.equals(f)) {
            return is4.a;
        }
        return pi3.k((w52) zte.c(this.c, e[0]));
    }

    @Override // defpackage.v52
    public final boolean c(mq5 mq5Var, n8a n8aVar) {
        mq5Var.getClass();
        n8aVar.getClass();
        return n8aVar.equals(g) && mq5Var.equals(f);
    }
}
