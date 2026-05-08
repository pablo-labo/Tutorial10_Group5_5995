package com.rivereactnative;

/* JADX INFO: loaded from: classes3.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    Backwards("backwards"),
    /* JADX INFO: Fake field, exist only in values array */
    Auto("auto"),
    /* JADX INFO: Fake field, exist only in values array */
    Forwards("forwards");

    public static final a a = new a();
    private final String mValue;

    public static final class a {
    }

    c(String str) {
        this.mValue = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mValue;
    }
}
