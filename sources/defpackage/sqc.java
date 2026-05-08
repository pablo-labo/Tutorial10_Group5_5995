package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sqc {
    public static final sqc a;
    public static final sqc b;
    public static final sqc c;
    public static final sqc d;
    public static final sqc e;
    public static final /* synthetic */ sqc[] f;

    static {
        sqc sqcVar = new sqc("RAW", 0);
        a = sqcVar;
        sqc sqcVar2 = new sqc("CONNECTING", 1);
        b = sqcVar2;
        sqc sqcVar3 = new sqc("OPEN", 2);
        c = sqcVar3;
        sqc sqcVar4 = new sqc("CLOSED", 3);
        d = sqcVar4;
        sqc sqcVar5 = new sqc("SHUTDOWN", 4);
        e = sqcVar5;
        f = new sqc[]{sqcVar, sqcVar2, sqcVar3, sqcVar4, sqcVar5};
    }

    public sqc() {
        throw null;
    }

    public static sqc valueOf(String str) {
        return (sqc) Enum.valueOf(sqc.class, str);
    }

    public static sqc[] values() {
        return (sqc[]) f.clone();
    }
}
