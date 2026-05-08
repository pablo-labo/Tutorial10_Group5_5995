package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bod {
    public static final bod a;
    public static final bod b;
    public static final bod c;
    public static final bod d;
    public static final /* synthetic */ bod[] e;

    static {
        bod bodVar = new bod("default", 0);
        a = bodVar;
        bod bodVar2 = new bod("needsInformation", 1);
        b = bodVar2;
        bod bodVar3 = new bod("ready", 2);
        c = bodVar3;
        bod bodVar4 = new bod("error", 3);
        d = bodVar4;
        e = new bod[]{bodVar, bodVar2, bodVar3, bodVar4};
    }

    public bod() {
        throw null;
    }

    public static bod valueOf(String str) {
        return (bod) Enum.valueOf(bod.class, str);
    }

    public static bod[] values() {
        return (bod[]) e.clone();
    }
}
