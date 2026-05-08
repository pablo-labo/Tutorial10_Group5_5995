package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class iua {
    public static final /* synthetic */ iua[] a = {new iua("NONE", 0), new iua("APPROVAL", 1), new iua("CODE", 2), new iua("UNDEFINED", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    iua EF5;

    public iua() {
        throw null;
    }

    public static iua valueOf(String str) {
        return (iua) Enum.valueOf(iua.class, str);
    }

    public static iua[] values() {
        return (iua[]) a.clone();
    }
}
