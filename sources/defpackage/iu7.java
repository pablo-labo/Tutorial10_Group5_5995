package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class iu7 implements ehb {
    public static final /* synthetic */ qf8<Object>[] f = {fwc.a.g(new l4c(iu7.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};
    public final mq5 a;
    public final qne b;
    public final fla c;
    public final gu7 d;
    public final boolean e;

    public iu7(mp8 mp8Var, fu7 fu7Var, mq5 mq5Var) {
        mp8Var.getClass();
        sv7 sv7Var = mp8Var.a;
        mq5Var.getClass();
        this.a = mq5Var;
        this.b = fu7Var != null ? sv7Var.j.a(fu7Var) : qne.p;
        this.c = sv7Var.a.f(new hu7(mp8Var, this, 0));
        this.d = fu7Var != null ? (gu7) z92.P0(fu7Var.g()) : null;
        this.e = false;
    }

    @Override // defpackage.ehb
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.af0
    public final qne g() {
        return this.b;
    }

    @Override // defpackage.af0
    public final ui8 getType() {
        return (mge) zte.c(this.c, f[0]);
    }

    @Override // defpackage.af0
    public final mq5 h() {
        return this.a;
    }

    @Override // defpackage.af0
    public Map<n8a, up2<?>> i() {
        return bs4.a;
    }
}
