package defpackage;

import org.apache.avro.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zcb implements kx5<zcb> {
    public static final zcb a;
    public static final g b;
    public static final /* synthetic */ zcb[] c;

    /* JADX INFO: Fake field, exist only in values array */
    zcb EF0;

    static {
        zcb zcbVar = new zcb("IOS", 0);
        zcb zcbVar2 = new zcb("ANDROID", 1);
        a = zcbVar2;
        c = new zcb[]{zcbVar, zcbVar2, new zcb("WEB", 2)};
        b = j6.d("{\"type\":\"enum\",\"name\":\"Platforms\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"symbols\":[\"IOS\",\"ANDROID\",\"WEB\"],\"default\":\"IOS\"}");
    }

    public zcb() {
        throw null;
    }

    public static zcb valueOf(String str) {
        return (zcb) Enum.valueOf(zcb.class, str);
    }

    public static zcb[] values() {
        return (zcb[]) c.clone();
    }

    @Override // defpackage.xw5
    public final g a() {
        return b;
    }
}
