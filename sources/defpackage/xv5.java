package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface xv5<T> extends vi5<T> {

    public static final class a {
        public static /* synthetic */ vi5 a(xv5 xv5Var, v03 v03Var, int i, eo1 eo1Var, int i2) {
            if ((i2 & 1) != 0) {
                v03Var = vr4.a;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                eo1Var = eo1.a;
            }
            return xv5Var.d(v03Var, i, eo1Var);
        }
    }

    vi5<T> d(v03 v03Var, int i, eo1 eo1Var);
}
