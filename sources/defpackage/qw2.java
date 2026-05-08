package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qw2 {
    public static final a a;
    public static final bw4 b;
    public static final qw2 c;
    public static final /* synthetic */ qw2[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        qw2 qw2Var = new qw2("CANDAUTO_AUTO_REPLY", 0, "CANDAUTO_AUTO_REPLY");
        qw2 qw2Var2 = new qw2("CANDAUTO_AUTO_CONTACT", 1, "CANDAUTO_AUTO_CONTACT");
        qw2 qw2Var3 = new qw2("CANDAUTO_MAYBE_AUTOMATION", 2, "CANDAUTO_MAYBE_AUTOMATION");
        qw2 qw2Var4 = new qw2("CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH", 3, "CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH");
        qw2 qw2Var5 = new qw2("CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH", 4, "CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH");
        qw2 qw2Var6 = new qw2("CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH", 5, "CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH");
        qw2 qw2Var7 = new qw2("CANDAUTO_NEXUS_INTERVIEW_INVITATION", 6, "CANDAUTO_NEXUS_INTERVIEW_INVITATION");
        qw2 qw2Var8 = new qw2("CANDAUTO_D2M", 7, "CANDAUTO_D2M");
        qw2 qw2Var9 = new qw2("NORMAL", 8, "NORMAL");
        qw2 qw2Var10 = new qw2("SYSTEM", 9, "SYSTEM");
        qw2 qw2Var11 = new qw2("CONFIRMATION_EMAIL", 10, "CONFIRMATION_EMAIL");
        qw2 qw2Var12 = new qw2("NOTIFICATION_EMAIL", 11, "NOTIFICATION_EMAIL");
        qw2 qw2Var13 = new qw2("INVITE_EMAIL", 12, "INVITE_EMAIL");
        qw2 qw2Var14 = new qw2("INVITE_EMAIL_MULTITIME", 13, "INVITE_EMAIL_MULTITIME");
        qw2 qw2Var15 = new qw2("CANCEL_EMAIL", 14, "CANCEL_EMAIL");
        qw2 qw2Var16 = new qw2("CANCEL_EMAIL_MULTITIME", 15, "CANCEL_EMAIL_MULTITIME");
        qw2 qw2Var17 = new qw2("ONE_TO_MANY_EMP_INVITE", 16, "ONE_TO_MANY_EMP_INVITE");
        qw2 qw2Var18 = new qw2("ONE_TO_MANY_EMP_CANCEL", 17, "ONE_TO_MANY_EMP_CANCEL");
        qw2 qw2Var19 = new qw2("D2I_INTERVIEW_INVITE", 18, "D2I_INTERVIEW_INVITE");
        qw2 qw2Var20 = new qw2("D2I_INTERVIEW_REMINDER", 19, "D2I_INTERVIEW_REMINDER");
        qw2 qw2Var21 = new qw2("INBOUND_EMAIL", 20, "INBOUND_EMAIL");
        qw2 qw2Var22 = new qw2("BULK_DRADIS_SEND", 21, "BULK_DRADIS_SEND");
        qw2 qw2Var23 = new qw2("BULK_DRADIS_TEMPLATE", 22, "BULK_DRADIS_TEMPLATE");
        qw2 qw2Var24 = new qw2("RESUME_CONTACT_INITIATED", 23, "RESUME_CONTACT_INITIATED");
        qw2 qw2Var25 = new qw2("RESUME_CONTACT_ACCEPTED", 24, "RESUME_CONTACT_ACCEPTED");
        qw2 qw2Var26 = new qw2("RESUME_CONTACT_DECLINED", 25, "RESUME_CONTACT_DECLINED");
        qw2 qw2Var27 = new qw2("UNKNOWN__", 26, "UNKNOWN__");
        c = qw2Var27;
        qw2[] qw2VarArr = {qw2Var, qw2Var2, qw2Var3, qw2Var4, qw2Var5, qw2Var6, qw2Var7, qw2Var8, qw2Var9, qw2Var10, qw2Var11, qw2Var12, qw2Var13, qw2Var14, qw2Var15, qw2Var16, qw2Var17, qw2Var18, qw2Var19, qw2Var20, qw2Var21, qw2Var22, qw2Var23, qw2Var24, qw2Var25, qw2Var26, qw2Var27};
        d = qw2VarArr;
        e = new wv4(qw2VarArr);
        a = new a();
        b = new bw4("ConversationEventSubType", u63.a0("CANDAUTO_AUTO_REPLY", "CANDAUTO_AUTO_CONTACT", "CANDAUTO_MAYBE_AUTOMATION", "CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH", "CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH", "CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH", "CANDAUTO_NEXUS_INTERVIEW_INVITATION", "CANDAUTO_D2M", "NORMAL", "SYSTEM", "CONFIRMATION_EMAIL", "NOTIFICATION_EMAIL", "INVITE_EMAIL", "INVITE_EMAIL_MULTITIME", "CANCEL_EMAIL", "CANCEL_EMAIL_MULTITIME", "ONE_TO_MANY_EMP_INVITE", "ONE_TO_MANY_EMP_CANCEL", "D2I_INTERVIEW_INVITE", "D2I_INTERVIEW_REMINDER", "INBOUND_EMAIL", "BULK_DRADIS_SEND", "BULK_DRADIS_TEMPLATE", "RESUME_CONTACT_INITIATED", "RESUME_CONTACT_ACCEPTED", "RESUME_CONTACT_DECLINED"));
    }

    public qw2(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static qw2 valueOf(String str) {
        return (qw2) Enum.valueOf(qw2.class, str);
    }

    public static qw2[] values() {
        return (qw2[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
