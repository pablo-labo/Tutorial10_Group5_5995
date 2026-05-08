package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wc4 {
    public static final wc4 a;
    public static final wc4 b;
    public static final wc4 c;
    public static final /* synthetic */ wc4[] d;
    public static final /* synthetic */ wv4 e;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        wc4 wc4Var = new wc4("LicenseTitle", 0, 1, R.string.label_licenses_title);
        a = wc4Var;
        wc4 wc4Var2 = new wc4("LicenseLocation", 1, 2, R.string.label_add_work_exp_job_city_state);
        wc4 wc4Var3 = new wc4("LicenseTimePeriod", 2, 3, R.string.expiration_date_label);
        b = wc4Var3;
        wc4 wc4Var4 = new wc4("LicenseEndorsements", 3, 4, R.string.label_endorsements);
        c = wc4Var4;
        wc4[] wc4VarArr = {wc4Var, wc4Var2, wc4Var3, wc4Var4};
        d = wc4VarArr;
        e = new wv4(wc4VarArr);
    }

    public wc4(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static wc4 valueOf(String str) {
        return (wc4) Enum.valueOf(wc4.class, str);
    }

    public static wc4[] values() {
        return (wc4[]) d.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
