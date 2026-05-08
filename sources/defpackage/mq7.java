package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mq7 {
    public static final mq7 a;
    public static final mq7 b;
    public static final /* synthetic */ mq7[] c;

    static {
        mq7 mq7Var = new mq7("CANCEL", 0);
        a = mq7Var;
        mq7 mq7Var2 = new mq7("SUCCESS", 1);
        b = mq7Var2;
        c = new mq7[]{mq7Var, mq7Var2};
    }

    public mq7() {
        throw null;
    }

    public static mq7 valueOf(String str) {
        return (mq7) Enum.valueOf(mq7.class, str);
    }

    public static mq7[] values() {
        return (mq7[]) c.clone();
    }
}
