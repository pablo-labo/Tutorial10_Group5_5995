package com.rivereactnative;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    TopLeft("topLeft"),
    /* JADX INFO: Fake field, exist only in values array */
    TopCenter("topCenter"),
    /* JADX INFO: Fake field, exist only in values array */
    TopRight("topRight"),
    /* JADX INFO: Fake field, exist only in values array */
    CenterLeft("centerLeft"),
    /* JADX INFO: Fake field, exist only in values array */
    Center("center"),
    /* JADX INFO: Fake field, exist only in values array */
    CenterRight("centerRight"),
    /* JADX INFO: Fake field, exist only in values array */
    BottomLeft("bottomLeft"),
    /* JADX INFO: Fake field, exist only in values array */
    BottomCenter("bottomCenter"),
    /* JADX INFO: Fake field, exist only in values array */
    BottomRight("bottomRight");

    public static final a a = new a();
    private final String mValue;

    public static final class a {
    }

    b(String str) {
        this.mValue = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mValue;
    }
}
