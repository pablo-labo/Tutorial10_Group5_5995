package defpackage;

import defpackage.j29;

/* JADX INFO: loaded from: classes3.dex */
public final class pc8 extends ei8 {
    public static final /* synthetic */ qf8<Object>[] h = {fwc.a.g(new l4c(pc8.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};
    public r4 f;
    public final fla g;

    public static final class a {
        public final yx9 a;

        public a(yx9 yx9Var) {
            this.a = yx9Var;
        }
    }

    public pc8(j29 j29Var) {
        super(j29Var);
        this.g = new j29.h(j29Var, new oc8(0, this, j29Var));
    }

    public final rc8 L() {
        return (rc8) zte.c(this.g, h[0]);
    }

    @Override // defpackage.ei8
    public final jz d() {
        return L();
    }

    @Override // defpackage.ei8
    public final Iterable m() {
        Iterable<v52> iterableM = super.m();
        yx9 yx9VarL = l();
        yx9VarL.getClass();
        return z92.f1(iterableM, new nc8(this.d, yx9VarL));
    }

    @Override // defpackage.ei8
    public final mbb q() {
        return L();
    }
}
