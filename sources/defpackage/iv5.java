package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class iv5 {

    /* JADX INFO: Fake field, exist only in values array */
    iv5 EF5;
    public static final /* synthetic */ iv5[] b = {new iv5("Function", 0), new iv5("SuspendFunction", 1), new iv5("KFunction", 2), new iv5("KSuspendFunction", 3), new iv5("UNKNOWN", 4)};
    public static final a a = new a();

    public static final class a {
    }

    public iv5() {
        throw null;
    }

    public static iv5 valueOf(String str) {
        return (iv5) Enum.valueOf(iv5.class, str);
    }

    public static iv5[] values() {
        return (iv5[]) b.clone();
    }
}
