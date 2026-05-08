package defpackage;

import defpackage.le0;

/* JADX INFO: loaded from: classes.dex */
public abstract class rx8 implements le0.a {

    public static final class b extends rx8 {
        public final String a;
        public final rif b;
        public final tx8 c;

        public b(String str, rif rifVar, tx8 tx8Var) {
            this.a = str;
            this.b = rifVar;
            this.c = tx8Var;
        }

        @Override // defpackage.rx8
        public final tx8 a() {
            return this.c;
        }

        @Override // defpackage.rx8
        public final rif b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            rif rifVar = this.b;
            int iHashCode2 = (iHashCode + (rifVar != null ? rifVar.hashCode() : 0)) * 31;
            tx8 tx8Var = this.c;
            return iHashCode2 + (tx8Var != null ? tx8Var.hashCode() : 0);
        }

        public final String toString() {
            return w40.f(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
        }
    }

    public abstract tx8 a();

    public abstract rif b();

    public static final class a extends rx8 {
        public final String a;
        public final rif b;
        public final tx8 c;

        public a(String str, rif rifVar, tx8 tx8Var) {
            this.a = str;
            this.b = rifVar;
            this.c = tx8Var;
        }

        @Override // defpackage.rx8
        public final tx8 a() {
            return this.c;
        }

        @Override // defpackage.rx8
        public final rif b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            rif rifVar = this.b;
            int iHashCode2 = (iHashCode + (rifVar != null ? rifVar.hashCode() : 0)) * 31;
            tx8 tx8Var = this.c;
            return iHashCode2 + (tx8Var != null ? tx8Var.hashCode() : 0);
        }

        public final String toString() {
            return w40.f(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
        }

        public /* synthetic */ a(tx8 tx8Var) {
            this("url", null, tx8Var);
        }
    }
}
