package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public enum qt9 {
    MilitaryService(1, R.string.country_of_service),
    MilitaryBranch(2, R.string.military_branch),
    MilitaryRank(3, R.string.military_rank),
    MilitaryTimePeriod(4, R.string.label_military_time_period),
    MilitaryDescription(5, R.string.label_military_description);

    private final int labelStringResId;
    private final int stepNumber;

    qt9(int i, int i2) {
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
