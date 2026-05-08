package defpackage;

import java.util.List;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class e69 {
    public final CharSequence a;
    public final List<String> b;
    public final a c;

    public final class a {
        public final int a;
        public final int b;
        public final int c;
        public final String d;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            String str = e69.this.b.get(i);
            this.d = str;
            if (i2 < -1 || i2 >= str.length()) {
                throw new MarkdownParsingException("");
            }
        }

        public final Integer a() {
            int i = this.b;
            int iMax = Math.max(i, 0);
            while (true) {
                String str = this.d;
                if (iMax >= str.length()) {
                    return null;
                }
                char cCharAt = str.charAt(iMax);
                if (cCharAt != ' ' && cCharAt != '\t') {
                    return Integer.valueOf(iMax - i);
                }
                iMax++;
            }
        }

        public final Integer b() {
            if (this.a + 1 < e69.this.b.size()) {
                return Integer.valueOf((this.d.length() - this.b) + this.c);
            }
            return null;
        }

        public final int c() {
            return (this.d.length() - this.b) + this.c;
        }

        public final a d() {
            Integer numB = b();
            if (numB != null) {
                return e(numB.intValue() - this.c);
            }
            return null;
        }

        public final a e(int i) {
            a aVar = this;
            while (i != 0) {
                int i2 = aVar.b;
                int i3 = i2 + i;
                String str = aVar.d;
                int length = str.length();
                e69 e69Var = e69.this;
                int i4 = aVar.c;
                int i5 = aVar.a;
                if (i3 < length) {
                    return e69Var.new a(i5, i3, i4 + i);
                }
                if (aVar.b() == null) {
                    return null;
                }
                int length2 = str.length() - i2;
                i -= length2;
                aVar = e69Var.new a(i5 + 1, -1, i4 + length2);
            }
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && obj.getClass() == a.class && this.c == ((a) obj).c;
        }

        public final int hashCode() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Position: '");
            int i = this.b;
            String str = this.d;
            return w40.f(sb, i == -1 ? l5.l("\\n", str) : str.substring(i), '\'');
        }
    }

    public e69(String str) {
        str.getClass();
        this.a = str;
        this.b = zve.j0(str, new char[]{'\n'});
        this.c = str.length() > 0 ? new a(0, -1, -1).e(1) : null;
    }
}
