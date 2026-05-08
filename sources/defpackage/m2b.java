package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class m2b<T> {

    public static final class a<T> extends m2b<T> {
        public final int a;
        public final ArrayList b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, ArrayList arrayList) {
            this.a = i;
            this.b = arrayList;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && wl7.b(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + Integer.hashCode(this.c) + this.b.hashCode() + Integer.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
            ArrayList arrayList = this.b;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   startIndex: ");
            sb.append(this.a);
            sb.append("\n                    |   first item: ");
            sb.append(z92.Q0(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(z92.Z0(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.d);
            sb.append("\n                    |)\n                    |");
            return sve.x(sb.toString());
        }
    }

    public static final class b<T> extends m2b<T> {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public b(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
            int i = this.b;
            sb.append(i);
            sb.append(" items (\n                    |   startIndex: ");
            uz.i(sb, this.a, "\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.d);
            sb.append("\n                    |)\n                    |");
            return sve.x(sb.toString());
        }
    }

    public static final class c<T> extends m2b<T> {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
            int i = this.a;
            uz.i(sb, i, " items (\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
            sb.append(this.b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |)\n                    |");
            return sve.x(sb.toString());
        }
    }

    public static final class d<T> extends m2b<T> {
        public final ArrayList a;
        public final int b;
        public final int c;

        public d(ArrayList arrayList, int i, int i2) {
            this.a = arrayList;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + Integer.hashCode(this.b) + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
            ArrayList arrayList = this.a;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(z92.Q0(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(z92.Z0(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |)\n                    |");
            return sve.x(sb.toString());
        }
    }

    public static final class e<T> extends m2b<T> {
        public final u0b a;
        public final uab<T> b;

        public e(u0b u0bVar, uab uabVar) {
            uabVar.getClass();
            this.a = u0bVar;
            this.b = uabVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            u0b u0bVar = this.a;
            int i = u0bVar.c;
            e eVar = (e) obj;
            uab<T> uabVar = eVar.b;
            u0b u0bVar2 = eVar.a;
            if (i != u0bVar2.c || u0bVar.d != u0bVar2.d || u0bVar.a() != u0bVar2.a() || u0bVar.b != u0bVar2.b) {
                return false;
            }
            uab<T> uabVar2 = this.b;
            return uabVar2.c() == uabVar.c() && uabVar2.d() == uabVar.d() && uabVar2.a() == uabVar.a() && uabVar2.b() == uabVar.b();
        }

        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
            u0b u0bVar = this.a;
            sb.append(u0bVar.c);
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(u0bVar.d);
            sb.append("\n                    |       size: ");
            sb.append(u0bVar.a());
            sb.append("\n                    |       dataCount: ");
            sb.append(u0bVar.b);
            sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
            uab<T> uabVar = this.b;
            sb.append(uabVar.c());
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(uabVar.d());
            sb.append("\n                    |       size: ");
            sb.append(uabVar.a());
            sb.append("\n                    |       dataCount: ");
            sb.append(uabVar.b());
            sb.append("\n                    |   )\n                    |");
            return sve.x(sb.toString());
        }
    }
}
