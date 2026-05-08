package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface c7e {

    public static final class a {
        public final oh7 a;
        public final en6 b;

        public a(oh7 oh7Var, en6 en6Var) {
            en6Var.getClass();
            this.a = oh7Var;
            this.b = en6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Node(range=" + this.a + ", type=" + this.b + ')';
        }
    }

    public static final class b {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();

        public final void a(ArrayList arrayList) {
            this.b.add(arrayList);
        }

        public final void b(t09 t09Var) {
            this.a.addAll(t09Var.b);
            this.b.addAll(t09Var.c);
        }
    }

    b a(uu8 uu8Var, List list);
}
