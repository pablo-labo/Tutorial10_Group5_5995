package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uie {
    public static final uie a;
    public static final /* synthetic */ uie[] b;

    static {
        uie uieVar = new uie("LEFT", 0);
        a = uieVar;
        b = new uie[]{uieVar, new uie("RIGHT", 1), new uie("CENTER", 2), new uie("JUSTIFY", 3)};
    }

    public uie() {
        throw null;
    }

    public static uie valueOf(String str) {
        return (uie) Enum.valueOf(uie.class, str);
    }

    public static uie[] values() {
        return (uie[]) b.clone();
    }
}
