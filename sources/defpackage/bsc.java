package defpackage;

import org.apache.avro.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bsc implements kx5<bsc> {

    /* JADX INFO: Fake field, exist only in values array */
    bsc EF5;
    public static final /* synthetic */ bsc[] b = {new bsc("UNKNOWN", 0), new bsc("MALFORMED", 1), new bsc("EXPIRED", 2), new bsc("DUPE", 3), new bsc("MISSING", 4), new bsc("BROWSER_ERROR", 5)};
    public static final g a = j6.d("{\"type\":\"enum\",\"name\":\"RecaptchaInvalidReason\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"symbols\":[\"UNKNOWN\",\"MALFORMED\",\"EXPIRED\",\"DUPE\",\"MISSING\",\"BROWSER_ERROR\"],\"default\":\"UNKNOWN\"}");

    public bsc() {
        throw null;
    }

    public static bsc valueOf(String str) {
        return (bsc) Enum.valueOf(bsc.class, str);
    }

    public static bsc[] values() {
        return (bsc[]) b.clone();
    }

    @Override // defpackage.xw5
    public final g a() {
        return a;
    }
}
