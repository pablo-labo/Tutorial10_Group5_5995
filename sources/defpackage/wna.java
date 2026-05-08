package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wna {

    public static final class a {
        public final String a;
        public final C0471a b;
        public C0471a c;

        /* JADX INFO: renamed from: wna$a$a, reason: collision with other inner class name */
        public static final class C0471a {
            public String a;
            public Object b;
            public C0471a c;
        }

        public a(String str) {
            C0471a c0471a = new C0471a();
            this.b = c0471a;
            this.c = c0471a;
            this.a = str;
        }

        public final void a(String str, boolean z) {
            b(String.valueOf(z), str);
        }

        public final void b(Object obj, String str) {
            C0471a c0471a = new C0471a();
            this.c.c = c0471a;
            this.c = c0471a;
            c0471a.b = obj;
            c0471a.a = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            C0471a c0471a = this.b.c;
            String str = "";
            while (c0471a != null) {
                Object obj = c0471a.b;
                sb.append(str);
                String str2 = c0471a.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                c0471a = c0471a.c;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
