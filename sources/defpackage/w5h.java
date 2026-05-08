package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class w5h implements t07 {
    public final Resources a;
    public final ConcurrentHashMap b;

    public w5h(Resources resources) {
        resources.getClass();
        this.a = resources;
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.t07
    public final l82 a(vs4 vs4Var, int i, h47 h47Var, r07 r07Var) {
        vs4Var.getClass();
        r07Var.getClass();
        try {
            String str = vs4Var.Z;
            if (str == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            int iB = b(str);
            Resources resources = this.a;
            ThreadLocal<TypedValue> threadLocal = g6d.a;
            Drawable drawable = resources.getDrawable(iB, null);
            if (drawable == null) {
                return null;
            }
            km3 km3Var = new km3();
            km3Var.d = drawable;
            return km3Var;
        } catch (Throwable th) {
            s55.g("XmlFormatDecoder", "Cannot decode xml", th);
            return null;
        }
    }

    public final int b(String str) {
        Integer numB;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            Uri uri = Uri.parse(str);
            uri.getClass();
            if (!"res".equals(rhg.b(uri)) && !"android.resource".equals(rhg.b(uri))) {
                ja.i(uri, "Unsupported uri ");
                return 0;
            }
            List<String> pathSegments = uri.getPathSegments();
            pathSegments.getClass();
            String str2 = (String) z92.Z0(pathSegments);
            if (str2 == null || (numB = vve.B(10, str2)) == null) {
                s40.i(uri.getPath(), "Unable to read resource ID from ");
                return 0;
            }
            concurrentHashMap.put(str, numB);
            obj = numB;
        }
        return ((Number) obj).intValue();
    }
}
