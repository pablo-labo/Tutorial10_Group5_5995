package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public enum w47 {
    INBOX("JS_MSG_FOLDER/INBOX", R.string.messaging_inbox_header_messages, "inbox"),
    ARCHIVE("JS_MSG_FOLDER/ARCHIVE", R.string.messaging_inbox_header_archive, "archive"),
    SPAM("JS_MSG_FOLDER/SPAM", R.string.messaging_inbox_header_spam, "spam"),
    DRAFTS("JS_MSG_FOLDER/INBOX", R.string.messaging_inbox_filters_drafts, "inbox");

    public static final a a = new a();
    private final String label;
    private final String loggingLabel;
    private final int textId;

    public static final class a {
    }

    w47(String str, int i, String str2) {
        this.label = str;
        this.loggingLabel = str2;
        this.textId = i;
    }

    public final String a() {
        return this.label;
    }

    public final String c() {
        return this.loggingLabel;
    }

    public final int e() {
        return this.textId;
    }
}
