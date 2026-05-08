package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rxb {
    public static final rxb a;
    public static final rxb b;
    public static final rxb c;
    public static final /* synthetic */ rxb[] d;

    static {
        rxb rxbVar = new rxb("PROFILE", 0);
        a = rxbVar;
        rxb rxbVar2 = new rxb("PREFERENCES", 1);
        b = rxbVar2;
        rxb rxbVar3 = new rxb("RESUME", 2);
        c = rxbVar3;
        d = new rxb[]{rxbVar, rxbVar2, rxbVar3};
    }

    public rxb() {
        throw null;
    }

    public static rxb valueOf(String str) {
        return (rxb) Enum.valueOf(rxb.class, str);
    }

    public static rxb[] values() {
        return (rxb[]) d.clone();
    }
}
