package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ho4 {
    public static final /* synthetic */ ho4[] V;
    public static final /* synthetic */ wv4 W;
    public static final ho4 a;
    public static final ho4 b;
    public static final ho4 c;
    public static final ho4 d;
    public static final ho4 e;
    public static final ho4 f;
    private final int labelStringResId;
    private final int stepNumber;

    static {
        ho4 ho4Var = new ho4("EducationLevel", 0, 1, R.string.label_add_edu_education_level);
        a = ho4Var;
        ho4 ho4Var2 = new ho4("FieldOfStudy", 1, 2, R.string.label_add_edu_field_of_study);
        b = ho4Var2;
        ho4 ho4Var3 = new ho4("SchoolName", 2, 3, R.string.label_add_edu_school);
        c = ho4Var3;
        ho4 ho4Var4 = new ho4("SchoolCountry", 3, 4, R.string.label_add_edu_country);
        d = ho4Var4;
        ho4 ho4Var5 = new ho4("SchoolLocation", 4, 5, R.string.label_add_edu_school_location);
        e = ho4Var5;
        ho4 ho4Var6 = new ho4("SchoolTimePeriod", 5, 6, R.string.label_add_edu_time_period);
        f = ho4Var6;
        ho4[] ho4VarArr = {ho4Var, ho4Var2, ho4Var3, ho4Var4, ho4Var5, ho4Var6};
        V = ho4VarArr;
        W = new wv4(ho4VarArr);
    }

    public ho4(String str, int i, int i2, int i3) {
        this.stepNumber = i2;
        this.labelStringResId = i3;
    }

    public static ho4 valueOf(String str) {
        return (ho4) Enum.valueOf(ho4.class, str);
    }

    public static ho4[] values() {
        return (ho4[]) V.clone();
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
