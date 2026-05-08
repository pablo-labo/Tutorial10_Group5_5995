package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public interface lf0 extends Iterable<af0>, ze8 {

    public static final class a {
        public static final C0307a a = new C0307a();

        /* JADX INFO: renamed from: lf0$a$a, reason: collision with other inner class name */
        public static final class C0307a implements lf0 {
            @Override // defpackage.lf0
            public final boolean P0(mq5 mq5Var) {
                return b.b(this, mq5Var);
            }

            @Override // defpackage.lf0
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public final Iterator<af0> iterator() {
                return xr4.a;
            }

            @Override // defpackage.lf0
            public final af0 p(mq5 mq5Var) {
                mq5Var.getClass();
                return null;
            }

            public final String toString() {
                return "EMPTY";
            }
        }
    }

    public static final class b {
        public static af0 a(lf0 lf0Var, mq5 mq5Var) {
            af0 next;
            mq5Var.getClass();
            Iterator<af0> it = lf0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (wl7.b(next.h(), mq5Var)) {
                    break;
                }
            }
            return next;
        }

        public static boolean b(lf0 lf0Var, mq5 mq5Var) {
            mq5Var.getClass();
            return lf0Var.p(mq5Var) != null;
        }
    }

    boolean P0(mq5 mq5Var);

    boolean isEmpty();

    af0 p(mq5 mq5Var);
}
