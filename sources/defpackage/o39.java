package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;

/* JADX INFO: loaded from: classes3.dex */
public enum o39 {
    /* JADX INFO: Fake field, exist only in values array */
    Trace("trace"),
    /* JADX INFO: Fake field, exist only in values array */
    Timer("timer"),
    /* JADX INFO: Fake field, exist only in values array */
    Stacktrace("stacktrace"),
    /* JADX INFO: Fake field, exist only in values array */
    Debug(RumEventDeserializer.TELEMETRY_TYPE_DEBUG),
    Info("info"),
    Warn("warn"),
    Error("error"),
    /* JADX INFO: Fake field, exist only in values array */
    Fatal("fatal");

    public static final a a = new a();
    private final String type;

    public static final class a {
    }

    o39(String str) {
        this.type = str;
    }

    public final String a() {
        return this.type;
    }
}
