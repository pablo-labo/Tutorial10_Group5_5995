package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface mbb {

    public static final class a implements mbb {
        public static final a a = new a();

        @Override // defpackage.mbb
        public final boolean c(t52 t52Var, r14 r14Var) {
            t52Var.getClass();
            return true;
        }
    }

    public static final class b implements mbb {
        public static final b a = new b();

        @Override // defpackage.mbb
        public final boolean c(t52 t52Var, r14 r14Var) {
            t52Var.getClass();
            return !r14Var.getAnnotations().P0(nbb.a);
        }
    }

    boolean c(t52 t52Var, r14 r14Var);
}
