package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rke {
    public static final /* synthetic */ rke[] a = {new rke("Short", 0), new rke("Long", 1), new rke("Indefinite", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    rke EF5;

    public rke() {
        throw null;
    }

    public static rke valueOf(String str) {
        return (rke) Enum.valueOf(rke.class, str);
    }

    public static rke[] values() {
        return (rke[]) a.clone();
    }
}
