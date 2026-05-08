package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public interface qu7 {

    public static final class a {
        public final a62 a;
        public final byte[] b;
        public final hvc c;

        public a(a62 a62Var, hvc hvcVar, int i) {
            hvcVar = (i & 4) != 0 ? null : hvcVar;
            this.a = a62Var;
            this.b = null;
            this.c = hvcVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            byte[] bArr = this.b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            hvc hvcVar = this.c;
            return iHashCode2 + (hvcVar != null ? hvcVar.hashCode() : 0);
        }

        public final String toString() {
            return "Request(classId=" + this.a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.b) + ", outerClass=" + this.c + ')';
        }
    }

    void a(mq5 mq5Var);

    svc b(mq5 mq5Var);

    hvc c(a aVar);
}
