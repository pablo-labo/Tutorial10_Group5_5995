package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class jz9 {
    public final String a;
    public final a b;
    public a c;

    public static class a {
        public Object a;
        public a b;
    }

    public jz9(String str) {
        a aVar = new a();
        this.b = aVar;
        this.c = aVar;
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        a aVar = this.b.b;
        String str = "";
        while (aVar != null) {
            Object obj = aVar.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            aVar = aVar.b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
