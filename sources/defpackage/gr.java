package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gr {
    public static final gr a;
    public static final gr b;
    public static final /* synthetic */ gr[] c;

    static {
        gr grVar = new gr("LANGUAGE_NAME", 0);
        a = grVar;
        gr grVar2 = new gr("PROFICIENCY", 1);
        b = grVar2;
        c = new gr[]{grVar, grVar2};
    }

    public gr() {
        throw null;
    }

    public static gr valueOf(String str) {
        return (gr) Enum.valueOf(gr.class, str);
    }

    public static gr[] values() {
        return (gr[]) c.clone();
    }
}
