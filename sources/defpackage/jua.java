package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jua {
    public static final /* synthetic */ jua[] a = {new jua("ALIVE", 0), new jua("DELETED", 1), new jua("SUSPENDED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    jua EF5;

    public jua() {
        throw null;
    }

    public static jua valueOf(String str) {
        return (jua) Enum.valueOf(jua.class, str);
    }

    public static jua[] values() {
        return (jua[]) a.clone();
    }
}
