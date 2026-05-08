package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class rt7 {
    public final ArrayList a;

    public static final class a {
        public ArrayList a;
    }

    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public static final class a {
            public String a;
            public String b;
            public String c;
            public String d;
            public String e;
            public String f;
            public String g;
        }

        public b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JWK{keyType='");
            sb.append(this.a);
            sb.append("', algorithm='");
            sb.append(this.b);
            sb.append("', use='");
            sb.append(this.c);
            sb.append("', keyId='");
            sb.append(this.d);
            sb.append("', curve='");
            sb.append(this.e);
            sb.append("', x='");
            sb.append(this.f);
            sb.append("', y='");
            return l6.i(sb, this.g, "'}");
        }
    }

    public rt7(a aVar) {
        this.a = aVar.a;
    }

    public final String toString() {
        return "JWKSet{keys=" + this.a + '}';
    }
}
