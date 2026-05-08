package defpackage;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;

/* JADX INFO: loaded from: classes3.dex */
public enum y34 {
    /* JADX INFO: Fake field, exist only in values array */
    Web("web"),
    Mobile("mob"),
    /* JADX INFO: Fake field, exist only in values array */
    Desktop("pc"),
    /* JADX INFO: Fake field, exist only in values array */
    ServerSideApp("srv"),
    /* JADX INFO: Fake field, exist only in values array */
    General(SessionEndedMetric.PROCESS_TYPE_VALUE),
    /* JADX INFO: Fake field, exist only in values array */
    ConnectedTV("tv"),
    /* JADX INFO: Fake field, exist only in values array */
    GameConsole("cnsl"),
    /* JADX INFO: Fake field, exist only in values array */
    InternetOfThings("iot");

    private final String value;

    y34(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
