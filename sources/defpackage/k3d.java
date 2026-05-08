package defpackage;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes3.dex */
public final class k3d {
    public static final b a;
    public static final a b;

    public enum a {
        INFO(1),
        WARN(2),
        ERROR(3);

        int levelInt;

        a(int i) {
            this.levelInt = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("Stderr", 0);
            a = bVar;
            b bVar2 = new b("Stdout", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    static {
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        b bVar = b.a;
        if (property != null && !property.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                if (strArr[i].equalsIgnoreCase(property)) {
                    bVar = b.b;
                    break;
                }
                i++;
            }
        }
        a = bVar;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        a aVar = a.INFO;
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("ERROR")) {
                aVar = a.ERROR;
            } else if (property2.equalsIgnoreCase("WARN")) {
                aVar = a.WARN;
            }
        }
        b = aVar;
    }

    public static final void a(String str, Throwable th) {
        b().println("SLF4J(E): ".concat(str));
        b().println("SLF4J(E): Reported exception:");
        th.printStackTrace(b());
    }

    public static PrintStream b() {
        return a.ordinal() != 1 ? System.err : System.out;
    }

    public static void c(String str) {
        if (a.INFO.levelInt >= b.levelInt) {
            b().println("SLF4J(I): ".concat(str));
        }
    }

    public static final void d(String str) {
        if (a.WARN.levelInt >= b.levelInt) {
            b().println("SLF4J(W): " + str);
        }
    }
}
