package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y39 {
    public static final /* synthetic */ y39[] a = {new y39("Verbose", 0), new y39("Debug", 1), new y39("Info", 2), new y39("Warn", 3), new y39("Error", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    y39 EF5;

    public y39() {
        throw null;
    }

    public static y39 valueOf(String str) {
        return (y39) Enum.valueOf(y39.class, str);
    }

    public static y39[] values() {
        return (y39[]) a.clone();
    }
}
