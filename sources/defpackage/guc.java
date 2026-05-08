package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class guc {
    public static final guc a;
    public static final guc b;
    public static final /* synthetic */ guc[] c;

    static {
        guc gucVar = new guc("STANDARD_MOTION", 0);
        a = gucVar;
        guc gucVar2 = new guc("REDUCED_MOTION", 1);
        b = gucVar2;
        c = new guc[]{gucVar, gucVar2};
    }

    public guc() {
        throw null;
    }

    public static guc valueOf(String str) {
        return (guc) Enum.valueOf(guc.class, str);
    }

    public static guc[] values() {
        return (guc[]) c.clone();
    }
}
