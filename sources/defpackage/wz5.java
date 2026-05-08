package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wz5 {
    public final d88 a;

    public static final class a {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("ApplyLinks(applyLinks=", ")", this.a);
        }
    }

    public static final class b {
        public final List<String> a;

        public b(List<String> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return g7.h("Params(jobKeys=", ")", this.a);
        }
    }

    public wz5(d88 d88Var) {
        this.a = d88Var;
    }
}
