package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cj1 {
    public static final a a;
    public static final cj1 b;
    public static final cj1 c;
    public static final cj1 d;
    public static final /* synthetic */ cj1[] e;

    public static final class a {
        public static cj1 a(String str) {
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1338941519) {
                if (lowerCase.equals("dashed")) {
                    return cj1.c;
                }
                return null;
            }
            if (iHashCode == -1325970902) {
                if (lowerCase.equals("dotted")) {
                    return cj1.d;
                }
                return null;
            }
            if (iHashCode == 109618859 && lowerCase.equals("solid")) {
                return cj1.b;
            }
            return null;
        }
    }

    static {
        cj1 cj1Var = new cj1("SOLID", 0);
        b = cj1Var;
        cj1 cj1Var2 = new cj1("DASHED", 1);
        c = cj1Var2;
        cj1 cj1Var3 = new cj1("DOTTED", 2);
        d = cj1Var3;
        e = new cj1[]{cj1Var, cj1Var2, cj1Var3};
        a = new a();
    }

    public cj1() {
        throw null;
    }

    public static cj1 valueOf(String str) {
        return (cj1) Enum.valueOf(cj1.class, str);
    }

    public static cj1[] values() {
        return (cj1[]) e.clone();
    }
}
