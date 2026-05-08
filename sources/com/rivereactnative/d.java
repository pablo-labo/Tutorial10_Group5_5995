package com.rivereactnative;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    /* JADX INFO: Fake field, exist only in values array */
    Cover("cover"),
    /* JADX INFO: Fake field, exist only in values array */
    Contain("contain"),
    /* JADX INFO: Fake field, exist only in values array */
    Fill("fill"),
    /* JADX INFO: Fake field, exist only in values array */
    FitWidth("fitWidth"),
    /* JADX INFO: Fake field, exist only in values array */
    FitHeight("fitHeight"),
    /* JADX INFO: Fake field, exist only in values array */
    None("none"),
    /* JADX INFO: Fake field, exist only in values array */
    ScaleDown("scaleDown"),
    /* JADX INFO: Fake field, exist only in values array */
    Layout("layout");

    public static final a a = new a();
    private final String mValue;

    public static final class a {
    }

    d(String str) {
        this.mValue = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mValue;
    }
}
