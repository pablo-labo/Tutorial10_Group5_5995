package defpackage;

import defpackage.w2;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xj1 {
    public static final xj1 V;
    public static final xj1 W;
    public static final xj1 X;
    public static final xj1 Y;
    public static final xj1 Z;
    public static final a a;
    public static final xj1 a0;
    public static final xj1 b;
    public static final xj1 b0;
    public static final xj1 c;
    public static final /* synthetic */ xj1[] c0;
    public static final xj1 d;
    public static final /* synthetic */ wv4 d0;
    public static final xj1 e;
    public static final xj1 f;
    private final String identifier;

    public static final class a {
        public static xj1 a(String str) {
            Object next;
            wv4 wv4Var = xj1.d0;
            wv4Var.getClass();
            w2.b bVar = new w2.b();
            while (true) {
                if (!bVar.hasNext()) {
                    next = null;
                    break;
                }
                next = bVar.next();
                String strA = ((xj1) next).a();
                Locale locale = Locale.ROOT;
                String lowerCase = strA.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = str.toLowerCase(locale);
                lowerCase2.getClass();
                if (lowerCase.equals(lowerCase2)) {
                    break;
                }
            }
            return (xj1) next;
        }
    }

    static {
        xj1 xj1Var = new xj1("HOME", 0, "HOME");
        b = xj1Var;
        xj1 xj1Var2 = new xj1("MY_JOBS", 1, "MY_JOBS");
        c = xj1Var2;
        xj1 xj1Var3 = new xj1("MESSAGES", 2, "MESSAGES");
        d = xj1Var3;
        xj1 xj1Var4 = new xj1("PROFILE", 3, "PROFILE");
        e = xj1Var4;
        xj1 xj1Var5 = new xj1("NOTIFICATIONS", 4, "NOTIFICATIONS");
        f = xj1Var5;
        xj1 xj1Var6 = new xj1("SEARCH", 5, "SEARCH");
        V = xj1Var6;
        xj1 xj1Var7 = new xj1("ACE", 6, "ACE");
        W = xj1Var7;
        xj1 xj1Var8 = new xj1("JP_HOME", 7, "JP_HOME");
        X = xj1Var8;
        xj1 xj1Var9 = new xj1("JP_DISCOVER", 8, "JP_DISCOVER");
        Y = xj1Var9;
        xj1 xj1Var10 = new xj1("JP_MYJOBS", 9, "JP_MYJOBS");
        Z = xj1Var10;
        xj1 xj1Var11 = new xj1("JP_MYPAGE", 10, "JP_MYPAGE");
        a0 = xj1Var11;
        xj1 xj1Var12 = new xj1("JP_MESSAGES", 11, "JP_MESSAGES");
        b0 = xj1Var12;
        xj1[] xj1VarArr = {xj1Var, xj1Var2, xj1Var3, xj1Var4, xj1Var5, xj1Var6, xj1Var7, xj1Var8, xj1Var9, xj1Var10, xj1Var11, xj1Var12};
        c0 = xj1VarArr;
        d0 = new wv4(xj1VarArr);
        a = new a();
    }

    public xj1(String str, int i, String str2) {
        this.identifier = str2;
    }

    public static xj1 valueOf(String str) {
        return (xj1) Enum.valueOf(xj1.class, str);
    }

    public static xj1[] values() {
        return (xj1[]) c0.clone();
    }

    public final String a() {
        return this.identifier;
    }
}
