package defpackage;

import org.apache.avro.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wk0 implements kx5<wk0> {

    /* JADX INFO: Fake field, exist only in values array */
    wk0 EF5;
    public static final /* synthetic */ wk0[] b = {new wk0("TEST", 0), new wk0("JOB_SEARCH_ANDROID", 1), new wk0("JOB_SEARCH_IOS", 2), new wk0("HQM_EMPLOYER_IOS", 3), new wk0("EMPLOYER_ANDROID", 4)};
    public static final g a = j6.d("{\"type\":\"enum\",\"name\":\"AppIds\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"symbols\":[\"TEST\",\"JOB_SEARCH_ANDROID\",\"JOB_SEARCH_IOS\",\"HQM_EMPLOYER_IOS\",\"EMPLOYER_ANDROID\"],\"default\":\"TEST\"}");

    public wk0() {
        throw null;
    }

    public static wk0 valueOf(String str) {
        return (wk0) Enum.valueOf(wk0.class, str);
    }

    public static wk0[] values() {
        return (wk0[]) b.clone();
    }

    @Override // defpackage.xw5
    public final g a() {
        return a;
    }
}
