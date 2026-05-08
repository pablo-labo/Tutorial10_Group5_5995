package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public enum r2d {
    ErrorReport(R.string.prepare_error_report_title, R.string.prepare_error_report_body, R.string.no_internet_email_connection_subject, R.string.no_internet_email_body),
    UserInitiatedReport(R.string.prepare_user_initiated_report_title, R.string.prepare_user_initiated_report_body, R.string.user_initiated_report_email_subject, R.string.user_initiated_report_email_body);

    private final int emailBody;
    private final int emailSubject;
    private final int prepareDialogBody;
    private final int prepareDialogTitle;

    r2d(int i, int i2, int i3, int i4) {
        this.prepareDialogTitle = i;
        this.prepareDialogBody = i2;
        this.emailSubject = i3;
        this.emailBody = i4;
    }

    public final int a() {
        return this.emailBody;
    }

    public final int c() {
        return this.emailSubject;
    }
}
