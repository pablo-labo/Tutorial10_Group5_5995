package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum zif {
    baseline("baseline"),
    /* JADX INFO: Fake field, exist only in values array */
    textBottom("text-bottom"),
    /* JADX INFO: Fake field, exist only in values array */
    alphabetic("alphabetic"),
    /* JADX INFO: Fake field, exist only in values array */
    ideographic("ideographic"),
    /* JADX INFO: Fake field, exist only in values array */
    middle("middle"),
    /* JADX INFO: Fake field, exist only in values array */
    central("central"),
    /* JADX INFO: Fake field, exist only in values array */
    mathematical("mathematical"),
    /* JADX INFO: Fake field, exist only in values array */
    textTop("text-top"),
    /* JADX INFO: Fake field, exist only in values array */
    bottom("bottom"),
    /* JADX INFO: Fake field, exist only in values array */
    center("center"),
    /* JADX INFO: Fake field, exist only in values array */
    top("top"),
    /* JADX INFO: Fake field, exist only in values array */
    textBeforeEdge("text-before-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    textAfterEdge("text-after-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    beforeEdge("before-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    afterEdge("after-edge"),
    /* JADX INFO: Fake field, exist only in values array */
    hanging("hanging");

    public static final HashMap b = new HashMap();
    private final String alignment;

    static {
        for (zif zifVar : values()) {
            b.put(zifVar.alignment, zifVar);
        }
    }

    zif(String str) {
        this.alignment = str;
    }

    public static zif a(String str) {
        HashMap map = b;
        if (map.containsKey(str)) {
            return (zif) map.get(str);
        }
        l5.q(l5.l("Unknown String Value: ", str));
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.alignment;
    }
}
