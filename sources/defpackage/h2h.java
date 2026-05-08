package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public enum h2h {
    JobTitle(1, R.string.label_add_work_exp_job_title),
    Company(2, R.string.label_add_work_exp_company),
    Country(3, R.string.label_add_work_exp_job_country),
    Location(4, R.string.label_add_work_exp_job_city_state),
    TimePeriod(5, R.string.label_time_period),
    Description(6, R.string.description);

    private final int labelStringResId;
    private final int stepNumber;

    h2h(int i, int i2) {
        this.stepNumber = i;
        this.labelStringResId = i2;
    }

    public final int a() {
        return this.labelStringResId;
    }

    public final int c() {
        return this.stepNumber;
    }
}
