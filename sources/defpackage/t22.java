package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t22 implements bjb<Character> {

    public static abstract class a extends t22 {
        @Override // defpackage.bjb
        @Deprecated
        public final boolean apply(Character ch) {
            return a(ch.charValue());
        }
    }

    public static final class b extends a {
        public final char a;

        public b(char c) {
            this.a = c;
        }

        @Override // defpackage.t22
        public final boolean a(char c) {
            return c == this.a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            char[] cArr = new char[6];
            cArr[0] = '\\';
            cArr[1] = 'u';
            cArr[2] = 0;
            cArr[3] = 0;
            cArr[4] = 0;
            cArr[5] = 0;
            char c = this.a;
            for (int i = 0; i < 4; i++) {
                cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
                c = (char) (c >> 4);
            }
            sb.append(String.copyValueOf(cArr));
            sb.append("')");
            return sb.toString();
        }
    }

    public static abstract class c extends a {
        public final String toString() {
            return "CharMatcher.none()";
        }
    }

    public static final class d extends c {
        public static final d a = new d();

        @Override // defpackage.t22
        public final boolean a(char c) {
            return false;
        }
    }

    public abstract boolean a(char c2);
}
