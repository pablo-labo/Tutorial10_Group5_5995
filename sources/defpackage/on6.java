package defpackage;

import org.apache.avro.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class on6 implements kx5<on6> {

    /* JADX INFO: Fake field, exist only in values array */
    on6 EF5;
    public static final /* synthetic */ on6[] b = {new on6("SELF_DECLARED", 0), new on6("GUARDIAN_DECLARED", 1), new on6("CHECKED_BY_OTHER_METHOD", 2), new on6("GUARDIAN_CHECKED_BY_OTHER_METHOD", 3), new on6("GOVERNMENT_ID_CHECKED", 4), new on6("PAYMENT_CHECKED", 5), new on6("GUARDIAN_PAYMENT_CHECKED", 6), new on6("UNKNOWN", 7)};
    public static final g a = j6.d("{\"type\":\"enum\",\"name\":\"IOSAgeRangeDeclaration\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"symbols\":[\"SELF_DECLARED\",\"GUARDIAN_DECLARED\",\"CHECKED_BY_OTHER_METHOD\",\"GUARDIAN_CHECKED_BY_OTHER_METHOD\",\"GOVERNMENT_ID_CHECKED\",\"PAYMENT_CHECKED\",\"GUARDIAN_PAYMENT_CHECKED\",\"UNKNOWN\"]}");

    public on6() {
        throw null;
    }

    public static on6 valueOf(String str) {
        return (on6) Enum.valueOf(on6.class, str);
    }

    public static on6[] values() {
        return (on6[]) b.clone();
    }

    @Override // defpackage.xw5
    public final g a() {
        return a;
    }
}
