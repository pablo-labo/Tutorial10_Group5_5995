package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface jv0 {
    public static final a a = new a();

    public static final class a implements jv0 {
        @Override // defpackage.jv0
        public final int a(Object obj) {
            if (!(obj instanceof w27)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            w27 w27Var = (w27) obj;
            return w27Var.r.hashCode() + ((w27Var.q.hashCode() + ((w27Var.p.hashCode() + k20.b(w27Var.e, (w27Var.b.hashCode() + (w27Var.a.hashCode() * 31)) * 961, 961)) * 31)) * 31);
        }

        @Override // defpackage.jv0
        public final boolean b(Object obj, Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj instanceof w27) || !(obj2 instanceof w27)) {
                return wl7.b(obj, obj2);
            }
            w27 w27Var = (w27) obj;
            w27 w27Var2 = (w27) obj2;
            return wl7.b(w27Var.a, w27Var2.a) && wl7.b(w27Var.b, w27Var2.b) && wl7.b(w27Var.e, w27Var2.e) && wl7.b(w27Var.p, w27Var2.p) && w27Var.q == w27Var2.q && w27Var.r == w27Var2.r;
        }

        public final String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    }

    int a(Object obj);

    boolean b(Object obj, Object obj2);
}
