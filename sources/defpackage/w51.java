package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w51 {
    public static final /* synthetic */ w51[] a = {new w51("LIGHT", 0), new w51("BOLD", 1), new w51("INVERSE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    w51 EF5;

    public w51() {
        throw null;
    }

    public static w51 valueOf(String str) {
        return (w51) Enum.valueOf(w51.class, str);
    }

    public static w51[] values() {
        return (w51[]) a.clone();
    }
}
