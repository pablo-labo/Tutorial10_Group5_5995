package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class inb {
    public static final a a;
    public static final inb b;
    public static final inb c;
    public static final inb d;
    public static final /* synthetic */ inb[] e;

    public static final class a {
    }

    static {
        inb inbVar = new inb("LOW", 0);
        b = inbVar;
        inb inbVar2 = new inb("MEDIUM", 1);
        c = inbVar2;
        inb inbVar3 = new inb("HIGH", 2);
        d = inbVar3;
        e = new inb[]{inbVar, inbVar2, inbVar3};
        a = new a();
    }

    public inb() {
        throw null;
    }

    public static inb valueOf(String str) {
        return (inb) Enum.valueOf(inb.class, str);
    }

    public static inb[] values() {
        return (inb[]) e.clone();
    }
}
