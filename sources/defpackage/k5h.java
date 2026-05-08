package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k5h {
    public static final k5h a;
    public static final /* synthetic */ k5h[] b;

    static {
        k5h k5hVar = new k5h("Text", 0);
        a = k5hVar;
        b = new k5h[]{k5hVar, new k5h("Binary", 1)};
    }

    public k5h() {
        throw null;
    }

    public static k5h valueOf(String str) {
        return (k5h) Enum.valueOf(k5h.class, str);
    }

    public static k5h[] values() {
        return (k5h[]) b.clone();
    }
}
