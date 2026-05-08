package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class odf {
    public static final odf b = new odf(0);
    public static final odf c = new odf(1);
    public static final odf d = new odf(2);
    public final int a;

    public odf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof odf) {
            return this.a == ((odf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return w40.f(new StringBuilder("TextDecoration["), fz8.b(62, ", ", arrayList, null), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
