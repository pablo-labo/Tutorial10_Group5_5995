package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oq5 {
    public static final mq5 a(mq5 mq5Var, mq5 mq5Var2) {
        mq5Var.getClass();
        nq5 nq5Var = mq5Var.a;
        mq5Var2.getClass();
        nq5 nq5Var2 = mq5Var2.a;
        if (!mq5Var.equals(mq5Var2) && !nq5Var2.c()) {
            String str = nq5Var.a;
            String str2 = nq5Var2.a;
            if (!wve.K(str, str2, false) || str.charAt(str2.length()) != '.') {
                return mq5Var;
            }
        }
        return nq5Var2.c() ? mq5Var : mq5Var.equals(mq5Var2) ? mq5.c : new mq5(nq5Var.a.substring(nq5Var2.a.length() + 1));
    }
}
