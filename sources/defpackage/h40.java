package defpackage;

import org.apache.avro.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h40 implements kx5<h40> {
    public static final /* synthetic */ h40[] V;
    public static final h40 a;
    public static final h40 b;
    public static final h40 c;
    public static final h40 d;
    public static final h40 e;
    public static final g f;

    static {
        h40 h40Var = new h40("SUPERVISED", 0);
        a = h40Var;
        h40 h40Var2 = new h40("SUPERVISED_APPROVAL_DENIED", 1);
        b = h40Var2;
        h40 h40Var3 = new h40("SUPERVISED_APPROVAL_PENDING", 2);
        c = h40Var3;
        h40 h40Var4 = new h40("UNKNOWN", 3);
        d = h40Var4;
        h40 h40Var5 = new h40("VERIFIED", 4);
        e = h40Var5;
        V = new h40[]{h40Var, h40Var2, h40Var3, h40Var4, h40Var5};
        f = j6.d("{\"type\":\"enum\",\"name\":\"AndroidAgeRangeEligibility\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"symbols\":[\"SUPERVISED\",\"SUPERVISED_APPROVAL_DENIED\",\"SUPERVISED_APPROVAL_PENDING\",\"UNKNOWN\",\"VERIFIED\"]}");
    }

    public h40() {
        throw null;
    }

    public static h40 valueOf(String str) {
        return (h40) Enum.valueOf(h40.class, str);
    }

    public static h40[] values() {
        return (h40[]) V.clone();
    }

    @Override // defpackage.xw5
    public final g a() {
        return f;
    }
}
