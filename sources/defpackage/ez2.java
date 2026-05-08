package defpackage;

import defpackage.w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ez2 {
    public static final ez2 V;
    public static final ez2 W;
    public static final ez2 X;
    public static final ez2 Y;
    public static final /* synthetic */ ez2[] Z;
    public static final a a;
    public static final /* synthetic */ wv4 a0;
    public static final ez2 b;
    public static final ez2 c;
    public static final ez2 d;
    public static final ez2 e;
    public static final ez2 f;
    private final String key;

    public static final class a {
        public static ez2 a(String str) {
            Object next;
            str.getClass();
            wv4 wv4Var = ez2.a0;
            wv4Var.getClass();
            w2.b bVar = new w2.b();
            while (true) {
                if (!bVar.hasNext()) {
                    next = null;
                    break;
                }
                next = bVar.next();
                if (wl7.b(((ez2) next).a(), str)) {
                    break;
                }
            }
            return (ez2) next;
        }
    }

    static {
        ez2 ez2Var = new ez2("Ctk", 0, "CTK");
        b = ez2Var;
        ez2 ez2Var2 = new ez2("Shoe", 1, "SHOE");
        c = ez2Var2;
        ez2 ez2Var3 = new ez2("Sock", 2, "SOCK");
        d = ez2Var3;
        ez2 ez2Var4 = new ez2("RecentSearch", 3, "RQ");
        e = ez2Var4;
        ez2 ez2Var5 = new ez2("LastVisit", 4, "LV");
        f = ez2Var5;
        ez2 ez2Var6 = new ez2("DSANR", 5, "DSANR");
        V = ez2Var6;
        ez2 ez2Var7 = new ez2("CSRF", 6, "CSRF");
        W = ez2Var7;
        ez2 ez2Var8 = new ez2("RF", 7, "RF");
        X = ez2Var8;
        ez2 ez2Var9 = new ez2("AppSignIn", 8, "appSignIn");
        Y = ez2Var9;
        ez2[] ez2VarArr = {ez2Var, ez2Var2, ez2Var3, ez2Var4, ez2Var5, ez2Var6, ez2Var7, ez2Var8, ez2Var9, new ez2("ClickTrackingLog", 9, "MCLK"), new ez2("PublisherNumber", 10, "pub"), new ez2("StealthGroups", 11, "sgroups"), new ez2("ApplyStartCookie", 12, "RJAS"), new ez2("PreviousPageNumber", 13, "PP"), new ez2("ApplyCountHistogram", 14, "KZXEE")};
        Z = ez2VarArr;
        a0 = new wv4(ez2VarArr);
        a = new a();
    }

    public ez2(String str, int i, String str2) {
        this.key = str2;
    }

    public static ez2 valueOf(String str) {
        return (ez2) Enum.valueOf(ez2.class, str);
    }

    public static ez2[] values() {
        return (ez2[]) Z.clone();
    }

    public final String a() {
        return this.key;
    }
}
