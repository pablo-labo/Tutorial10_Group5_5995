package com.rivereactnative;

/* JADX INFO: loaded from: classes3.dex */
public enum h {
    /* JADX INFO: Fake field, exist only in values array */
    Rive("rive"),
    /* JADX INFO: Fake field, exist only in values array */
    Canvas("canvas");

    public static final a a = new a();
    private final String rendererTypeName;

    public static final class a {
    }

    h(String str) {
        this.rendererTypeName = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.rendererTypeName;
    }
}
