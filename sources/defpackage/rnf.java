package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rnf {
    public static final /* synthetic */ rnf[] a = {new rnf("BLOCK_START", 0), new rnf("BLOCK_END", 1), new rnf("INLINE_START", 2), new rnf("INLINE_END", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    rnf EF5;

    public rnf() {
        throw null;
    }

    public static rnf valueOf(String str) {
        return (rnf) Enum.valueOf(rnf.class, str);
    }

    public static rnf[] values() {
        return (rnf[]) a.clone();
    }
}
