package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rp {
    public static final a a;
    public static final rp b;
    public static final /* synthetic */ rp[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        rp rpVar = new rp("OPT_IN", 0, "OPT_IN");
        rp rpVar2 = new rp("OPT_OUT", 1, "OPT_OUT");
        rp rpVar3 = new rp("UNKNOWN__", 2, "UNKNOWN__");
        b = rpVar3;
        rp[] rpVarArr = {rpVar, rpVar2, rpVar3};
        c = rpVarArr;
        d = new wv4(rpVarArr);
        a = new a();
        new bw4("AddJobSeekerProfileSourcingElection", u63.a0("OPT_IN", "OPT_OUT"));
    }

    public rp(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static rp valueOf(String str) {
        return (rp) Enum.valueOf(rp.class, str);
    }

    public static rp[] values() {
        return (rp[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
