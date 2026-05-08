package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y28 {
    public static final a a;
    public static final y28 b;
    public static final /* synthetic */ y28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        y28 y28Var = new y28("ZERO", 0, "ZERO");
        y28 y28Var2 = new y28("FOUR", 1, "FOUR");
        y28 y28Var3 = new y28("FIVE", 2, "FIVE");
        y28 y28Var4 = new y28("SIX", 3, "SIX");
        y28 y28Var5 = new y28("SEVEN", 4, "SEVEN");
        y28 y28Var6 = new y28("EIGHT", 5, "EIGHT");
        y28 y28Var7 = new y28("NINE", 6, "NINE");
        y28 y28Var8 = new y28("TEN", 7, "TEN");
        y28 y28Var9 = new y28("ELEVEN", 8, "ELEVEN");
        y28 y28Var10 = new y28("TWELVE", 9, "TWELVE");
        y28 y28Var11 = new y28("THIRTEEN", 10, "THIRTEEN");
        y28 y28Var12 = new y28("FOURTEEN", 11, "FOURTEEN");
        y28 y28Var13 = new y28("FIFTEEN", 12, "FIFTEEN");
        y28 y28Var14 = new y28("SIXTEEN", 13, "SIXTEEN");
        y28 y28Var15 = new y28("SEVENTEEN", 14, "SEVENTEEN");
        y28 y28Var16 = new y28("EIGHTEEN", 15, "EIGHTEEN");
        y28 y28Var17 = new y28("NINETEEN", 16, "NINETEEN");
        y28 y28Var18 = new y28("TWENTY", 17, "TWENTY");
        y28 y28Var19 = new y28("TWENTY_ONE", 18, "TWENTY_ONE");
        y28 y28Var20 = new y28("TWENTY_TWO", 19, "TWENTY_TWO");
        y28 y28Var21 = new y28("TWENTY_THREE", 20, "TWENTY_THREE");
        y28 y28Var22 = new y28("TWENTY_FOUR", 21, "TWENTY_FOUR");
        y28 y28Var23 = new y28("TWENTY_FIVE", 22, "TWENTY_FIVE");
        y28 y28Var24 = new y28("TWENTY_SIX", 23, "TWENTY_SIX");
        y28 y28Var25 = new y28("TWENTY_SEVEN", 24, "TWENTY_SEVEN");
        y28 y28Var26 = new y28("UNKNOWN__", 25, "UNKNOWN__");
        b = y28Var26;
        y28[] y28VarArr = {y28Var, y28Var2, y28Var3, y28Var4, y28Var5, y28Var6, y28Var7, y28Var8, y28Var9, y28Var10, y28Var11, y28Var12, y28Var13, y28Var14, y28Var15, y28Var16, y28Var17, y28Var18, y28Var19, y28Var20, y28Var21, y28Var22, y28Var23, y28Var24, y28Var25, y28Var26};
        c = y28VarArr;
        d = new wv4(y28VarArr);
        a = new a();
        new bw4("JobSeekerProfileInternationalHighestLevelOfEducation", u63.a0("ZERO", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "TWENTY_ONE", "TWENTY_TWO", "TWENTY_THREE", "TWENTY_FOUR", "TWENTY_FIVE", "TWENTY_SIX", "TWENTY_SEVEN"));
    }

    public y28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static y28 valueOf(String str) {
        return (y28) Enum.valueOf(y28.class, str);
    }

    public static y28[] values() {
        return (y28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
