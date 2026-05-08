package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum ejf {
    None("none"),
    /* JADX INFO: Fake field, exist only in values array */
    Underline("underline"),
    /* JADX INFO: Fake field, exist only in values array */
    Overline("overline"),
    /* JADX INFO: Fake field, exist only in values array */
    LineThrough("line-through"),
    /* JADX INFO: Fake field, exist only in values array */
    Blink("blink");

    public static final HashMap b = new HashMap();
    private final String decoration;

    static {
        for (ejf ejfVar : values()) {
            b.put(ejfVar.decoration, ejfVar);
        }
    }

    ejf(String str) {
        this.decoration = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.decoration;
    }
}
