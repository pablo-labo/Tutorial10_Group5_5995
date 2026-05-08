package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hp7 {

    public static final class a extends hp7 {
        public static final a a = new a();
    }

    public static final class b extends hp7 {
        public final jhb b;
        public final String a = "";
        public final String c = "";

        public b(jhb jhbVar) {
            this.b = jhbVar;
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
            int iHashCode = Boolean.hashCode(false) * 31;
            String str = this.a;
            return this.c.hashCode() + ((this.b.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(unwindToOpener=false, continueUrl=");
            sb.append(this.a);
            sb.append(", postApplyInfo=");
            sb.append(this.b);
            sb.append(", userInfo=");
            return l6.i(sb, this.c, ")");
        }
    }
}
