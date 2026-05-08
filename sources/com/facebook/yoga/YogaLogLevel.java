package com.facebook.yoga;

import defpackage.g84;
import defpackage.l5;
import defpackage.p6;

/* JADX INFO: loaded from: classes2.dex */
@g84
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int mIntValue;

    YogaLogLevel(int i) {
        this.mIntValue = i;
    }

    @g84
    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return WARN;
        }
        if (i == 2) {
            return INFO;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 4) {
            return VERBOSE;
        }
        if (i == 5) {
            return FATAL;
        }
        l5.q(p6.c(i, "Unknown enum value: "));
        return null;
    }
}
