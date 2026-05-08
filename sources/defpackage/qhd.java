package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qhd implements ew7 {
    public static final qhd a = new qhd();

    public static final class a implements dw7 {
        public final mvc a;

        public a(mvc mvcVar) {
            mvcVar.getClass();
            this.a = mvcVar;
        }

        @Override // defpackage.dw7
        public final mvc b() {
            return this.a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            u40.k(a.class, sb, ": ");
            sb.append(this.a);
            return sb.toString();
        }
    }

    @Override // defpackage.ew7
    public final a a(zu7 zu7Var) {
        zu7Var.getClass();
        return new a((mvc) zu7Var);
    }
}
