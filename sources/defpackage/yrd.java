package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class yrd {
    public static final yrd a;
    public static final yrd b;
    public static final /* synthetic */ yrd[] c;

    static {
        yrd yrdVar = new yrd("REACT_NATIVE", 0);
        a = yrdVar;
        yrd yrdVar2 = new yrd("WEB_VIEW", 1);
        b = yrdVar2;
        c = new yrd[]{yrdVar, yrdVar2};
    }

    public yrd() {
        throw null;
    }

    public static yrd valueOf(String str) {
        return (yrd) Enum.valueOf(yrd.class, str);
    }

    public static yrd[] values() {
        return (yrd[]) c.clone();
    }
}
