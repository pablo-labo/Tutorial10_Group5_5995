package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sw2 {
    public static final sw2 V;
    public static final sw2 W;
    public static final sw2 X;
    public static final sw2 Y;
    public static final sw2 Z;
    public static final a a;

    @sy3
    public static final sw2 a0;
    public static final bw4 b;

    @sy3
    public static final sw2 b0;
    public static final sw2 c;

    @sy3
    public static final sw2 c0;
    public static final sw2 d;

    @sy3
    public static final sw2 d0;
    public static final sw2 e;

    @sy3
    public static final sw2 e0;
    public static final sw2 f;

    @sy3
    public static final sw2 f0;

    @sy3
    public static final sw2 g0;

    @sy3
    public static final sw2 h0;

    @sy3
    public static final sw2 i0;
    public static final sw2 j0;
    public static final sw2 k0;
    public static final sw2 l0;
    public static final sw2 m0;
    public static final /* synthetic */ sw2[] n0;
    public static final /* synthetic */ wv4 o0;
    private final String rawValue;

    public static final class a {
    }

    static {
        sw2 sw2Var = new sw2("MESSAGE", 0, "MESSAGE");
        c = sw2Var;
        sw2 sw2Var2 = new sw2("PHONE", 1, "PHONE");
        d = sw2Var2;
        sw2 sw2Var3 = new sw2("UNKNOWN", 2, "UNKNOWN");
        e = sw2Var3;
        sw2 sw2Var4 = new sw2("DRADIS_CALLBACK_REQUEST", 3, "DRADIS_CALLBACK_REQUEST");
        f = sw2Var4;
        sw2 sw2Var5 = new sw2("CALLBACK", 4, "CALLBACK");
        V = sw2Var5;
        sw2 sw2Var6 = new sw2("RESUME_CONTACT_INITIATED", 5, "RESUME_CONTACT_INITIATED");
        W = sw2Var6;
        sw2 sw2Var7 = new sw2("RESUME_CONTACT_ACCEPTED", 6, "RESUME_CONTACT_ACCEPTED");
        X = sw2Var7;
        sw2 sw2Var8 = new sw2("RESUME_CONTACT_DECLINED", 7, "RESUME_CONTACT_DECLINED");
        Y = sw2Var8;
        sw2 sw2Var9 = new sw2("INTERVIEW_EMPLOYER_REQUEST", 8, "INTERVIEW_EMPLOYER_REQUEST");
        Z = sw2Var9;
        sw2 sw2Var10 = new sw2("INTERVIEW_JOBSEEKER_SCHEDULE", 9, "INTERVIEW_JOBSEEKER_SCHEDULE");
        a0 = sw2Var10;
        sw2 sw2Var11 = new sw2("INTERVIEW_EMPLOYER_UPDATE_RESET", 10, "INTERVIEW_EMPLOYER_UPDATE_RESET");
        b0 = sw2Var11;
        sw2 sw2Var12 = new sw2("INTERVIEW_EMPLOYER_UPDATE_MAINTAIN", 11, "INTERVIEW_EMPLOYER_UPDATE_MAINTAIN");
        c0 = sw2Var12;
        sw2 sw2Var13 = new sw2("INTERVIEW_EMPLOYER_CANCEL", 12, "INTERVIEW_EMPLOYER_CANCEL");
        d0 = sw2Var13;
        sw2 sw2Var14 = new sw2("INTERVIEW_JOBSEEKER_DECLINE", 13, "INTERVIEW_JOBSEEKER_DECLINE");
        e0 = sw2Var14;
        sw2 sw2Var15 = new sw2("INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES", 14, "INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES");
        f0 = sw2Var15;
        sw2 sw2Var16 = new sw2("INTERVIEW_JOBSEEKER_CANCEL", 15, "INTERVIEW_JOBSEEKER_CANCEL");
        g0 = sw2Var16;
        sw2 sw2Var17 = new sw2("INTERVIEW_CONFIRMATION_EMAIL", 16, "INTERVIEW_CONFIRMATION_EMAIL");
        h0 = sw2Var17;
        sw2 sw2Var18 = new sw2("INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES_SCHEDULED", 17, "INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES_SCHEDULED");
        i0 = sw2Var18;
        sw2 sw2Var19 = new sw2("I2A_INVITE", 18, "I2A_INVITE");
        j0 = sw2Var19;
        sw2 sw2Var20 = new sw2("C2I_CALL_HISTORY", 19, "C2I_CALL_HISTORY");
        k0 = sw2Var20;
        sw2 sw2Var21 = new sw2("CANDIDATE_DISPOSITION_NOTIFICATION", 20, "CANDIDATE_DISPOSITION_NOTIFICATION");
        l0 = sw2Var21;
        sw2 sw2Var22 = new sw2("UNKNOWN__", 21, "UNKNOWN__");
        m0 = sw2Var22;
        sw2[] sw2VarArr = {sw2Var, sw2Var2, sw2Var3, sw2Var4, sw2Var5, sw2Var6, sw2Var7, sw2Var8, sw2Var9, sw2Var10, sw2Var11, sw2Var12, sw2Var13, sw2Var14, sw2Var15, sw2Var16, sw2Var17, sw2Var18, sw2Var19, sw2Var20, sw2Var21, sw2Var22};
        n0 = sw2VarArr;
        o0 = new wv4(sw2VarArr);
        a = new a();
        b = new bw4("ConversationEventType", u63.a0("MESSAGE", "PHONE", "UNKNOWN", "DRADIS_CALLBACK_REQUEST", "CALLBACK", "RESUME_CONTACT_INITIATED", "RESUME_CONTACT_ACCEPTED", "RESUME_CONTACT_DECLINED", "INTERVIEW_EMPLOYER_REQUEST", "INTERVIEW_JOBSEEKER_SCHEDULE", "INTERVIEW_EMPLOYER_UPDATE_RESET", "INTERVIEW_EMPLOYER_UPDATE_MAINTAIN", "INTERVIEW_EMPLOYER_CANCEL", "INTERVIEW_JOBSEEKER_DECLINE", "INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES", "INTERVIEW_JOBSEEKER_CANCEL", "INTERVIEW_CONFIRMATION_EMAIL", "INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES_SCHEDULED", "I2A_INVITE", "C2I_CALL_HISTORY", "CANDIDATE_DISPOSITION_NOTIFICATION"));
    }

    public sw2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static sw2 valueOf(String str) {
        return (sw2) Enum.valueOf(sw2.class, str);
    }

    public static sw2[] values() {
        return (sw2[]) n0.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
