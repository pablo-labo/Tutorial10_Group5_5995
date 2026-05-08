package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum tb5 {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");

    public static final HashMap c = new HashMap();
    private final String units;

    static {
        for (tb5 tb5Var : values()) {
            c.put(tb5Var.units, tb5Var);
        }
    }

    tb5(String str) {
        this.units = str;
    }

    public static tb5 a(String str) {
        HashMap map = c;
        if (map.containsKey(str)) {
            return (tb5) map.get(str);
        }
        l5.q(l5.l("Unknown 'Unit' Value: ", str));
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.units;
    }
}
