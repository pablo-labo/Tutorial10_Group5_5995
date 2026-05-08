package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class azg {

    public static final class a extends azg {
        public static final a a = new a();
    }

    public static final class b extends azg {
        public final gu5<j6g> a;

        public b(gu5<j6g> gu5Var) {
            this.a = gu5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ErrorDetectingLocation(retry=" + this.a + ")";
        }
    }

    public static final class c extends azg {
        public final fy a;

        public c(fy fyVar) {
            this.a = fyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ErrorGettingSuggestions(retry=" + this.a + ")";
        }
    }

    public static final class d extends azg {
        public final List<zye> a;

        public d(List<zye> list) {
            this.a = list;
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
            return g7.h("FetchedSuggestions(fetchedSuggestions=", ")", this.a);
        }
    }

    public static final class e extends azg {
        public final String a;

        public e(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && wl7.b(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("FoundLocation(currentLocationString=", this.a, ")");
        }
    }

    public static final class f extends azg {
        public static final f a = new f();
    }

    public static final class g extends azg {
        public static final g a = new g();
    }

    public static final class h extends azg {
        public static final h a = new h();
    }

    public static final class i extends azg {
        public static final i a = new i();
    }

    public static final class j extends azg {
        public final String a;

        public j(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && wl7.b(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("SuggestionSelected(selectedText=", this.a, ")");
        }
    }
}
