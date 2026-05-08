package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qj7 {
    public static final qj7 a;
    public static final qj7 b;
    public static final qj7 c;
    public static final qj7 d;
    public static final /* synthetic */ qj7[] e;

    static {
        qj7 qj7Var = new qj7("CANCEL_INTERVIEW", 0);
        a = qj7Var;
        qj7 qj7Var2 = new qj7("RESCHEDULE_INTERVIEW", 1);
        b = qj7Var2;
        qj7 qj7Var3 = new qj7("SCHEDULE_INTERVIEW", 2);
        c = qj7Var3;
        qj7 qj7Var4 = new qj7("DECLINE_INTERVIEW", 3);
        d = qj7Var4;
        e = new qj7[]{qj7Var, qj7Var2, qj7Var3, qj7Var4};
    }

    public qj7() {
        throw null;
    }

    public static qj7 valueOf(String str) {
        return (qj7) Enum.valueOf(qj7.class, str);
    }

    public static qj7[] values() {
        return (qj7[]) e.clone();
    }
}
