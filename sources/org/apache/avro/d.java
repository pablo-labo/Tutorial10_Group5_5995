package org.apache.avro;

/* JADX INFO: loaded from: classes3.dex */
public interface d {
    public static final c a = new c(null);
    public static final b b = new b();

    public class a implements d {
    }

    public class b implements d {
        @Override // org.apache.avro.d
        public final c a(String str) {
            if (str == null) {
                return new c("Null name");
            }
            int length = str.length();
            if (length == 0) {
                return new c("Empty name");
            }
            char cCharAt = str.charAt(0);
            if (!Character.isLetter(cCharAt) && cCharAt != '_') {
                return new c("Illegal initial character: ".concat(str));
            }
            for (int i = 1; i < length; i++) {
                char cCharAt2 = str.charAt(i);
                if (!Character.isLetterOrDigit(cCharAt2) && cCharAt2 != '_') {
                    return new c("Illegal character in: ".concat(str));
                }
            }
            return d.a;
        }
    }

    public static class c {
        public final String a;

        public c(String str) {
            this.a = str;
        }
    }

    default c a(String str) {
        return a;
    }
}
