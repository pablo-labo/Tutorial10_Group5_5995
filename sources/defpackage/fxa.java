package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fxa {
    public static final a a;
    public static final fxa b;
    public static final fxa c;
    public static final fxa d;
    public static final /* synthetic */ fxa[] e;

    public static final class a {
        public static fxa a(String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1217487446) {
                if (lowerCase.equals("hidden")) {
                    return fxa.c;
                }
                return null;
            }
            if (iHashCode == -907680051) {
                if (lowerCase.equals("scroll")) {
                    return fxa.d;
                }
                return null;
            }
            if (iHashCode == 466743410 && lowerCase.equals("visible")) {
                return fxa.b;
            }
            return null;
        }
    }

    static {
        fxa fxaVar = new fxa("VISIBLE", 0);
        b = fxaVar;
        fxa fxaVar2 = new fxa("HIDDEN", 1);
        c = fxaVar2;
        fxa fxaVar3 = new fxa("SCROLL", 2);
        d = fxaVar3;
        e = new fxa[]{fxaVar, fxaVar2, fxaVar3};
        a = new a();
    }

    public fxa() {
        throw null;
    }

    public static fxa valueOf(String str) {
        return (fxa) Enum.valueOf(fxa.class, str);
    }

    public static fxa[] values() {
        return (fxa[]) e.clone();
    }
}
