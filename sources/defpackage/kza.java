package defpackage;

import defpackage.xz8;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class kza<T> {

    public static final class a<T> extends kza<T> {
        public final int a() {
            return (0 - 0) + 1;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static final class b<T> extends kza<T> {
        public static final b<Object> g;
        public final zz8 a;
        public final List<nrf<T>> b;
        public final int c;
        public final int d;
        public final yz8 e;
        public final yz8 f;

        static {
            List listZ = u63.Z(nrf.d);
            xz8.c cVar = xz8.c.c;
            xz8.c cVar2 = xz8.c.b;
            g = new b<>(zz8.a, listZ, 0, 0, new yz8(cVar, cVar2, cVar2), null);
        }

        public b(zz8 zz8Var, List<nrf<T>> list, int i, int i2, yz8 yz8Var, yz8 yz8Var2) {
            this.a = zz8Var;
            this.b = list;
            this.c = i;
            this.d = i2;
            this.e = yz8Var;
            this.f = yz8Var2;
            if (zz8Var != zz8.c && i < 0) {
                h5.k(p6.c(i, "Prepend insert defining placeholdersBefore must be > 0, but was "));
                throw null;
            }
            if (zz8Var != zz8.b && i2 < 0) {
                h5.k(p6.c(i2, "Append insert defining placeholdersAfter must be > 0, but was "));
                throw null;
            }
            if (zz8Var == zz8.a && list.isEmpty()) {
                l5.q("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && wl7.b(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && wl7.b(this.e, bVar.e) && wl7.b(this.f, bVar.f);
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + w40.c(this.d, w40.c(this.c, ia.g(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31;
            yz8 yz8Var = this.f;
            return iHashCode + (yz8Var == null ? 0 : yz8Var.hashCode());
        }

        public final String toString() {
            List<T> list;
            List<T> list2;
            List<nrf<T>> list3 = this.b;
            Iterator<T> it = list3.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((nrf) it.next()).b.size();
            }
            int i = this.c;
            String strValueOf = i != -1 ? String.valueOf(i) : "none";
            int i2 = this.d;
            String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
            StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
            sb.append(this.a);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            nrf nrfVar = (nrf) z92.Q0(list3);
            Object objZ0 = null;
            sb.append((nrfVar == null || (list2 = nrfVar.b) == null) ? null : z92.Q0(list2));
            sb.append("\n                    |   last item: ");
            nrf nrfVar2 = (nrf) z92.Z0(list3);
            if (nrfVar2 != null && (list = nrfVar2.b) != null) {
                objZ0 = z92.Z0(list);
            }
            sb.append(objZ0);
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.e);
            sb.append("\n                    ");
            String string = sb.toString();
            yz8 yz8Var = this.f;
            if (yz8Var != null) {
                string = string + "|   mediatorLoadStates: " + yz8Var + '\n';
            }
            return sve.x(string.concat("|)"));
        }
    }

    public static final class c<T> extends kza<T> {
        public final yz8 a;
        public final yz8 b;

        public c(yz8 yz8Var, yz8 yz8Var2) {
            yz8Var.getClass();
            this.a = yz8Var;
            this.b = yz8Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            yz8 yz8Var = this.b;
            return iHashCode + (yz8Var == null ? 0 : yz8Var.hashCode());
        }

        public final String toString() {
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
            yz8 yz8Var = this.b;
            if (yz8Var != null) {
                str = str + "|   mediatorLoadStates: " + yz8Var + '\n';
            }
            return sve.x(str.concat("|)"));
        }
    }

    public static final class d<T> extends kza<T> {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }
}
