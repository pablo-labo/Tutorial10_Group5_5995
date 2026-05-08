package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nm3 implements at2 {
    public static final nm3 c = new nm3(Collections.EMPTY_MAP);
    public int a;
    public final Map<String, byte[]> b;

    public nm3(Map<String, byte[]> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public static boolean c(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final nm3 b(bt2 bt2Var) {
        byte[] bytes;
        Map<String, byte[]> map = this.b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(bt2Var.b));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map2.remove(listUnmodifiableList.get(i));
        }
        HashMap map3 = new HashMap(bt2Var.a);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(StandardCharsets.UTF_8);
            } else {
                if (!(value2 instanceof byte[])) {
                    o6.h();
                    return null;
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return c(map, map2) ? this : new nm3(map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nm3.class != obj.getClass()) {
            return false;
        }
        return c(this.b, ((nm3) obj).b);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.a = iHashCode;
        }
        return this.a;
    }

    public nm3() {
        this(Collections.EMPTY_MAP);
    }
}
