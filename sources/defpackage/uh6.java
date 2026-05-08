package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uh6 {
    public static final uh6 d;
    public final boolean a;
    public final a b;
    public final b c;

    public static final class a {
        public static final a c = new a();
        public final boolean a = true;
        public final boolean b = true;

        public a() {
            if (cr8.f("  ") || cr8.f("") || cr8.f("")) {
                return;
            }
            cr8.f("");
        }

        public final void a(StringBuilder sb, String str) {
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append("  ");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            ia.r(sb, str, "bytePrefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append("");
            sb.append("\"");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            a(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class b {
        public static final b b = new b();
        public final boolean a = true;

        public b() {
            if (cr8.f("")) {
                return;
            }
            cr8.f("");
        }

        public final void a(StringBuilder sb, String str) {
            ia.r(sb, str, "prefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(false);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            a(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        a aVar = a.c;
        b bVar = b.b;
        d = new uh6(false, aVar, bVar);
        new uh6(true, aVar, bVar);
    }

    public uh6(boolean z, a aVar, b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.a = z;
        this.b = aVar;
        this.c = bVar;
    }

    public final String toString() {
        StringBuilder sbG = q6.g("HexFormat(\n    upperCase = ");
        sbG.append(this.a);
        sbG.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a(sbG, "        ");
        sbG.append('\n');
        sbG.append("    ),");
        sbG.append('\n');
        sbG.append("    number = NumberHexFormat(");
        sbG.append('\n');
        this.c.a(sbG, "        ");
        sbG.append('\n');
        sbG.append("    )");
        sbG.append('\n');
        sbG.append(")");
        return sbG.toString();
    }
}
