package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jee {
    public static final jee a;
    public static final jee b;
    public static final jee c;
    public static final /* synthetic */ jee[] d;

    static {
        jee jeeVar = new jee("Hidden", 0);
        a = jeeVar;
        jee jeeVar2 = new jee("Expanded", 1);
        b = jeeVar2;
        jee jeeVar3 = new jee("PartiallyExpanded", 2);
        c = jeeVar3;
        d = new jee[]{jeeVar, jeeVar2, jeeVar3};
    }

    public jee() {
        throw null;
    }

    public static jee valueOf(String str) {
        return (jee) Enum.valueOf(jee.class, str);
    }

    public static jee[] values() {
        return (jee[]) d.clone();
    }
}
