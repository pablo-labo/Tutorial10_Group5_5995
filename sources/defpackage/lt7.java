package defpackage;

import defpackage.mt7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lt7 {

    public static final class a extends lt7 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 147578757;
        }

        public final String toString() {
            return "Cancelled";
        }
    }

    public static final class b extends lt7 {
        public final mt7.b a;

        public b(mt7.b bVar) {
            this.a = bVar;
        }
    }
}
