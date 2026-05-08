package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lyg {

    public static final class a extends lyg {
        public final oj a;

        public a(oj ojVar) {
            this.a = ojVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ErrorGettingSuggestions(retry=" + this.a + ")";
        }
    }

    public static final class b extends lyg {
        public final List<zye> a;
        public final int b;
        public final boolean c;

        public b(int i, List list, boolean z) {
            list.getClass();
            this.a = list;
            this.b = i;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + w40.c(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FetchedSearchSuggestions(suggestions=");
            sb.append(this.a);
            sb.append(", numToShowUnexpanded=");
            sb.append(this.b);
            sb.append(", isExpanded=");
            return z3.o(sb, this.c, ")");
        }
    }

    public static final class c extends lyg {
        public static final c a = new c();
    }

    public static final class d extends lyg {
        public final String a;

        public d(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("SuggestionSelected(selectedText=", this.a, ")");
        }
    }
}
