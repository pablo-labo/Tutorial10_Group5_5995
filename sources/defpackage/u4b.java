package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class u4b {
    public static final u4b a;
    public static final u4b b;
    public static final /* synthetic */ u4b[] c;

    static {
        u4b u4bVar = new u4b("Compact", 0);
        a = u4bVar;
        u4b u4bVar2 = new u4b("Regular", 1);
        b = u4bVar2;
        c = new u4b[]{u4bVar, u4bVar2};
    }

    public u4b() {
        throw null;
    }

    public static u4b valueOf(String str) {
        return (u4b) Enum.valueOf(u4b.class, str);
    }

    public static u4b[] values() {
        return (u4b[]) c.clone();
    }
}
