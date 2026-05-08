package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ga5 implements ha5, ui7 {
    @Override // defpackage.ha5
    public final EnumSet a(ReactApplicationContext reactApplicationContext, String str) {
        EnumSet enumSetNoneOf;
        Object next;
        e8b e8bVar = e8b.b;
        e8b e8bVar2 = e8b.a;
        reactApplicationContext.getClass();
        str.getClass();
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            Iterator it = u63.a0(reactApplicationContext.getFilesDir().getCanonicalPath(), reactApplicationContext.getCacheDir().getCanonicalPath()).iterator();
            while (true) {
                enumSetNoneOf = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str2 = (String) next;
                canonicalPath.getClass();
                if (wve.K(canonicalPath, str2 + "/", false) || wl7.b(str2, canonicalPath)) {
                    break;
                }
            }
            if (((String) next) != null) {
                enumSetNoneOf = EnumSet.of(e8bVar2, e8bVar);
            }
        } catch (IOException unused) {
            enumSetNoneOf = EnumSet.noneOf(e8b.class);
        }
        if (enumSetNoneOf == null) {
            File file = new File(str);
            enumSetNoneOf = EnumSet.noneOf(e8b.class);
            if (file.canRead()) {
                enumSetNoneOf.add(e8bVar2);
            }
            if (file.canWrite()) {
                enumSetNoneOf.add(e8bVar);
            }
            enumSetNoneOf.getClass();
        }
        return enumSetNoneOf;
    }

    @Override // defpackage.ui7
    public final List<Class<?>> f() {
        return u63.Z(ha5.class);
    }
}
