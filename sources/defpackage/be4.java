package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public enum be4 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);

    private final TimeUnit timeUnit;

    be4(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public final TimeUnit a() {
        return this.timeUnit;
    }
}
