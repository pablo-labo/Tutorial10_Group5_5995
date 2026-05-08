package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qeb {
    public static final a a;
    public static final qeb b;
    public static final qeb c;
    public static final qeb d;
    public static final qeb e;
    public static final /* synthetic */ qeb[] f;

    public static final class a {
        public static boolean a(qeb qebVar) {
            qebVar.getClass();
            return qebVar == qeb.e || qebVar == qeb.d;
        }

        public static boolean b(qeb qebVar) {
            qebVar.getClass();
            return qebVar == qeb.e || qebVar == qeb.c;
        }

        public static qeb c(String str) {
            if (str == null) {
                return qeb.e;
            }
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            return qeb.valueOf(wve.I(upperCase, "-", "_"));
        }
    }

    static {
        qeb qebVar = new qeb("NONE", 0);
        b = qebVar;
        qeb qebVar2 = new qeb("BOX_NONE", 1);
        c = qebVar2;
        qeb qebVar3 = new qeb("BOX_ONLY", 2);
        d = qebVar3;
        qeb qebVar4 = new qeb("AUTO", 3);
        e = qebVar4;
        f = new qeb[]{qebVar, qebVar2, qebVar3, qebVar4};
        a = new a();
    }

    public qeb() {
        throw null;
    }

    public static qeb valueOf(String str) {
        return (qeb) Enum.valueOf(qeb.class, str);
    }

    public static qeb[] values() {
        return (qeb[]) f.clone();
    }
}
