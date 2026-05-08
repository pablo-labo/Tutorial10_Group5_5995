package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jv8 {
    public static final jv8 a;
    public static final jv8 b;
    public static final jv8 c;
    public static final /* synthetic */ jv8[] d;
    public static final /* synthetic */ wv4 e;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        jv8 jv8Var = new jv8("LicenseTitle", 0, 1, R.string.label_licenses_title);
        a = jv8Var;
        jv8 jv8Var2 = new jv8("LicenseLocation", 1, 2, R.string.label_add_work_exp_job_city_state);
        b = jv8Var2;
        jv8 jv8Var3 = new jv8("LicenseTimePeriod", 2, 3, R.string.expiration_date_label);
        c = jv8Var3;
        jv8[] jv8VarArr = {jv8Var, jv8Var2, jv8Var3};
        d = jv8VarArr;
        e = new wv4(jv8VarArr);
    }

    public jv8(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static jv8 valueOf(String str) {
        return (jv8) Enum.valueOf(jv8.class, str);
    }

    public static jv8[] values() {
        return (jv8[]) d.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
