package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lqa {
    public static final lqa a;
    public static final /* synthetic */ lqa[] b;

    /* JADX INFO: Fake field, exist only in values array */
    lqa EF0;

    static {
        lqa lqaVar = new lqa("SKIP", 0);
        lqa lqaVar2 = new lqa("TERMINATE", 1);
        a = lqaVar2;
        b = new lqa[]{lqaVar, lqaVar2};
    }

    public lqa() {
        throw null;
    }

    public static lqa valueOf(String str) {
        return (lqa) Enum.valueOf(lqa.class, str);
    }

    public static lqa[] values() {
        return (lqa[]) b.clone();
    }
}
