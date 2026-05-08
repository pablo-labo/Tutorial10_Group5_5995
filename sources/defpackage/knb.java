package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class knb {
    public static final knb a;
    public static final knb b;
    public static final knb c;
    public static final knb d;
    public static final /* synthetic */ knb[] e;

    static {
        knb knbVar = new knb("IMMEDIATE", 0);
        a = knbVar;
        knb knbVar2 = new knb("HIGH", 1);
        b = knbVar2;
        knb knbVar3 = new knb("NORMAL", 2);
        c = knbVar3;
        knb knbVar4 = new knb("LOW", 3);
        d = knbVar4;
        e = new knb[]{knbVar, knbVar2, knbVar3, knbVar4};
    }

    public knb() {
        throw null;
    }

    public static knb valueOf(String str) {
        return (knb) Enum.valueOf(knb.class, str);
    }

    public static knb[] values() {
        return (knb[]) e.clone();
    }
}
