package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yxd {
    public static final yxd a;
    public static final yxd b;
    public static final /* synthetic */ yxd[] c;

    static {
        yxd yxdVar = new yxd("Inherit", 0);
        a = yxdVar;
        yxd yxdVar2 = new yxd("SecureOn", 1);
        b = yxdVar2;
        c = new yxd[]{yxdVar, yxdVar2, new yxd("SecureOff", 2)};
    }

    public yxd() {
        throw null;
    }

    public static yxd valueOf(String str) {
        return (yxd) Enum.valueOf(yxd.class, str);
    }

    public static yxd[] values() {
        return (yxd[]) c.clone();
    }
}
