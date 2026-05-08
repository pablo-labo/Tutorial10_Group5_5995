package defpackage;

import defpackage.ere;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ju7 {
    public static final n8a a = n8a.h("message");
    public static final n8a b = n8a.h("allowedTargets");
    public static final n8a c = n8a.h("value");
    public static final Map<mq5, mq5> d = lc9.a0(new Pair(ere.a.t, kc8.c), new Pair(ere.a.w, kc8.d), new Pair(ere.a.x, kc8.f));

    public static ehb a(mq5 mq5Var, ku7 ku7Var, mp8 mp8Var) {
        fu7 fu7VarP;
        mq5Var.getClass();
        ku7Var.getClass();
        mp8Var.getClass();
        if (mq5Var.equals(ere.a.m)) {
            mq5 mq5Var2 = kc8.e;
            mq5Var2.getClass();
            fu7 fu7VarP2 = ku7Var.p(mq5Var2);
            if (fu7VarP2 != null) {
                return new xu7(fu7VarP2, mp8Var);
            }
        }
        mq5 mq5Var3 = d.get(mq5Var);
        if (mq5Var3 == null || (fu7VarP = ku7Var.p(mq5Var3)) == null) {
            return null;
        }
        return b(fu7VarP, mp8Var, false);
    }

    public static ehb b(fu7 fu7Var, mp8 mp8Var, boolean z) {
        fu7Var.getClass();
        mp8Var.getClass();
        a62 a62VarJ = fu7Var.j();
        mq5 mq5Var = kc8.c;
        mq5Var.getClass();
        if (a62VarJ.equals(new a62(mq5Var.b(), mq5Var.a.f()))) {
            return new fw7(fu7Var, mp8Var);
        }
        mq5 mq5Var2 = kc8.d;
        mq5Var2.getClass();
        if (a62VarJ.equals(new a62(mq5Var2.b(), mq5Var2.a.f()))) {
            return new vv7(fu7Var, mp8Var);
        }
        mq5 mq5Var3 = kc8.f;
        mq5Var3.getClass();
        if (a62VarJ.equals(new a62(mq5Var3.b(), mq5Var3.a.f()))) {
            return new iu7(mp8Var, fu7Var, ere.a.x);
        }
        mq5 mq5Var4 = kc8.e;
        mq5Var4.getClass();
        if (a62VarJ.equals(new a62(mq5Var4.b(), mq5Var4.a.f()))) {
            return null;
        }
        return new yo8(fu7Var, mp8Var, z);
    }
}
