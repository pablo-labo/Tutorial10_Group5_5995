package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dwa {
    public static final dwa a;
    public static final dwa b;
    public static final /* synthetic */ dwa[] c;

    static {
        dwa dwaVar = new dwa("Vertical", 0);
        a = dwaVar;
        dwa dwaVar2 = new dwa("Horizontal", 1);
        b = dwaVar2;
        c = new dwa[]{dwaVar, dwaVar2};
    }

    public dwa() {
        throw null;
    }

    public static dwa valueOf(String str) {
        return (dwa) Enum.valueOf(dwa.class, str);
    }

    public static dwa[] values() {
        return (dwa[]) c.clone();
    }
}
