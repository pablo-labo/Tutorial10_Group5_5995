package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class du8 {
    public static final /* synthetic */ du8[] a = {new du8("WARNING", 0), new du8("ERROR", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    du8 EF5;

    public du8() {
        throw null;
    }

    public static du8 valueOf(String str) {
        return (du8) Enum.valueOf(du8.class, str);
    }

    public static du8[] values() {
        return (du8[]) a.clone();
    }
}
