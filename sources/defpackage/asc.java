package defpackage;

import org.apache.avro.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class asc implements kx5<asc> {

    /* JADX INFO: Fake field, exist only in values array */
    asc EF5;
    public static final /* synthetic */ asc[] b = {new asc("UNKNOWN", 0), new asc("AUTOMATION", 1), new asc("UNEXPECTED_ENVIRONMENT", 2), new asc("TOO_MUCH_TRAFFIC", 3), new asc("UNEXPECTED_USAGE_PATTERNS", 4), new asc("LOW_CONFIDENCE_SCORE", 5)};
    public static final g a = j6.d("{\"type\":\"enum\",\"name\":\"RecaptchaClassificationReason\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"symbols\":[\"UNKNOWN\",\"AUTOMATION\",\"UNEXPECTED_ENVIRONMENT\",\"TOO_MUCH_TRAFFIC\",\"UNEXPECTED_USAGE_PATTERNS\",\"LOW_CONFIDENCE_SCORE\"],\"default\":\"UNKNOWN\"}");

    public asc() {
        throw null;
    }

    public static asc valueOf(String str) {
        return (asc) Enum.valueOf(asc.class, str);
    }

    public static asc[] values() {
        return (asc[]) b.clone();
    }

    @Override // defpackage.xw5
    public final g a() {
        return a;
    }
}
