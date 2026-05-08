package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gzc {
    public static final gzc a;
    public static final gzc b;
    public static final /* synthetic */ gzc[] c;

    static {
        gzc gzcVar = new gzc("RELOCATION_PREFERENCE", 0);
        a = gzcVar;
        gzc gzcVar2 = new gzc("LOCATION_AUTOCOMPLETE", 1);
        b = gzcVar2;
        c = new gzc[]{gzcVar, gzcVar2};
    }

    public gzc() {
        throw null;
    }

    public static gzc valueOf(String str) {
        return (gzc) Enum.valueOf(gzc.class, str);
    }

    public static gzc[] values() {
        return (gzc[]) c.clone();
    }
}
