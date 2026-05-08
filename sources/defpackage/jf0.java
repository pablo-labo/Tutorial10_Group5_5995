package defpackage;

import defpackage.ere;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class jf0 {
    public static final n8a a = n8a.h("message");
    public static final n8a b = n8a.h("replaceWith");
    public static final n8a c = n8a.h("level");
    public static final n8a d = n8a.h("expression");
    public static final n8a e = n8a.h("imports");

    public static final zo1 a(ei8 ei8Var, String str, String str2, String str3) {
        ei8Var.getClass();
        zo1 zo1Var = new zo1(ei8Var, ere.a.o, lc9.a0(new Pair(d, new pve(str2)), new Pair(e, new rt0(zr4.a, new if0(ei8Var, 0)))));
        mq5 mq5Var = ere.a.m;
        Pair pair = new Pair(a, new pve(str));
        Pair pair2 = new Pair(b, new kf0(zo1Var));
        mq5 mq5Var2 = ere.a.n;
        mq5Var2.getClass();
        return new zo1(ei8Var, mq5Var, lc9.a0(pair, pair2, new Pair(c, new dw4(new a62(mq5Var2.b(), mq5Var2.a.f()), n8a.h(str3)))));
    }
}
