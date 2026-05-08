package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rz1 {
    public static final rz1 a;
    public static final rz1 b;
    public static final rz1 c;
    public static final /* synthetic */ rz1[] d;
    public static final /* synthetic */ wv4 e;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        rz1 rz1Var = new rz1("CertificationTitle", 0, 1, R.string.label_certification_title);
        a = rz1Var;
        rz1 rz1Var2 = new rz1("CertificationTimePeriod", 1, 2, R.string.label_time_period);
        b = rz1Var2;
        rz1 rz1Var3 = new rz1("CertificationDescription", 2, 3, R.string.description);
        c = rz1Var3;
        rz1[] rz1VarArr = {rz1Var, rz1Var2, rz1Var3};
        d = rz1VarArr;
        e = new wv4(rz1VarArr);
    }

    public rz1(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static rz1 valueOf(String str) {
        return (rz1) Enum.valueOf(rz1.class, str);
    }

    public static rz1[] values() {
        return (rz1[]) d.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
