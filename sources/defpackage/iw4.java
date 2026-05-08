package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iw4 {
    public final String a;
    public final List<a> b;
    public final List<Object> c;
    public final Map<String, Object> d;
    public final Map<String, Object> e;

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Location(line = ");
            sb.append(this.a);
            sb.append(", column = ");
            return k6.h(sb, this.b, ')');
        }
    }

    @sy3
    public iw4(String str, List list, List list2, Map map, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = map;
        this.e = linkedHashMap;
    }

    public final String toString() {
        return "Error(message = " + this.a + ", locations = " + this.b + ", path=" + this.c + ", extensions = " + this.d + ", nonStandardFields = " + this.e + ')';
    }
}
