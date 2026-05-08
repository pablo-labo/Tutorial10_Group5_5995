package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class je1 {
    public static final je1 a;
    public static final /* synthetic */ je1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    je1 EF0;

    static {
        je1 je1Var = new je1("CONSENT", 0);
        je1 je1Var2 = new je1("CONTRACT", 1);
        a = je1Var2;
        b = new je1[]{je1Var, je1Var2, new je1("LEGAL_OBLIGATION", 2), new je1("VITAL_INTERESTS", 3), new je1("PUBLIC_TASK", 4), new je1("LEGITIMATE_INTERESTS", 5)};
    }

    public je1() {
        throw null;
    }

    public static je1 valueOf(String str) {
        return (je1) Enum.valueOf(je1.class, str);
    }

    public static je1[] values() {
        return (je1[]) b.clone();
    }
}
