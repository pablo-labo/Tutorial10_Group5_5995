package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r3e {
    public static final r3e a;
    public static final r3e b;
    public static final r3e c;
    public static final /* synthetic */ r3e[] d;

    static {
        r3e r3eVar = new r3e("Left", 0);
        a = r3eVar;
        r3e r3eVar2 = new r3e("Middle", 1);
        b = r3eVar2;
        r3e r3eVar3 = new r3e("Right", 2);
        c = r3eVar3;
        d = new r3e[]{r3eVar, r3eVar2, r3eVar3};
    }

    public r3e() {
        throw null;
    }

    public static r3e valueOf(String str) {
        return (r3e) Enum.valueOf(r3e.class, str);
    }

    public static r3e[] values() {
        return (r3e[]) d.clone();
    }
}
