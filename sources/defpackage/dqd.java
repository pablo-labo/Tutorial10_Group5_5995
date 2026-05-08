package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dqd {
    public static final dqd a;
    public static final dqd b;
    public static final dqd c;
    public static final /* synthetic */ dqd[] d;

    static {
        dqd dqdVar = new dqd("First", 0);
        a = dqdVar;
        dqd dqdVar2 = new dqd("SecondYes", 1);
        b = dqdVar2;
        dqd dqdVar3 = new dqd("SecondNo", 2);
        c = dqdVar3;
        d = new dqd[]{dqdVar, dqdVar2, dqdVar3};
    }

    public dqd() {
        throw null;
    }

    public static dqd valueOf(String str) {
        return (dqd) Enum.valueOf(dqd.class, str);
    }

    public static dqd[] values() {
        return (dqd[]) d.clone();
    }
}
