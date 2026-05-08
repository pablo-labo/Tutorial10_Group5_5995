package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u81 implements l82 {
    public static final HashSet c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));
    public final HashMap a = new HashMap();
    public c17 b;

    @Override // defpackage.ig6
    public final void W(Map<String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        for (String str : c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.a.put(str, obj);
            }
        }
    }

    @Override // defpackage.ig6
    public final void f0(Object obj, String str) {
        Boolean bool = Boolean.FALSE;
        if (c.contains("is_rounded")) {
            this.a.put("is_rounded", bool);
        }
    }

    @Override // defpackage.jg6
    public final Map<String, Object> getExtras() {
        return this.a;
    }

    @Override // defpackage.l82
    public h47 o1() {
        return h47.d;
    }

    @Override // defpackage.l82
    public final b17 s1() {
        if (this.b == null) {
            int width = getWidth();
            int height = getHeight();
            t0();
            o1();
            this.b = new c17(width, height, this.a);
        }
        return this.b;
    }
}
