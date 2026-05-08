package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class inf {
    public static final inf a;
    public static final inf b;
    public static final /* synthetic */ inf[] c;

    static {
        inf infVar = new inf("On", 0);
        a = infVar;
        inf infVar2 = new inf("Off", 1);
        b = infVar2;
        c = new inf[]{infVar, infVar2, new inf("Indeterminate", 2)};
    }

    public inf() {
        throw null;
    }

    public static inf valueOf(String str) {
        return (inf) Enum.valueOf(inf.class, str);
    }

    public static inf[] values() {
        return (inf[]) c.clone();
    }
}
