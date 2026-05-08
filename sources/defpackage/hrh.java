package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hrh<T> {
    public static final Object f = new Object();

    @SuppressLint({"StaticFieldLeak"})
    public static volatile Context g;
    public static volatile vsh<ssh<drh>> h;
    public static final AtomicInteger i;
    public final mte a;
    public final String b;
    public final T c;
    public volatile int d = -1;
    public volatile T e;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hrh(mte mteVar, String str, Object obj) {
        if (((Uri) mteVar.a) == null) {
            l5.q("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.a = mteVar;
        this.b = str;
        this.c = obj;
    }

    public abstract T a(Object obj);

    public final String b(String str) {
        String str2 = this.b;
        if (str != null && str.isEmpty()) {
            return str2;
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(str2);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0024, B:13:0x0030, B:15:0x0039, B:17:0x0051, B:21:0x005f, B:20:0x0059, B:42:0x00ce, B:44:0x00dc, B:46:0x00f1, B:49:0x0100, B:51:0x010a, B:53:0x0114, B:52:0x010f, B:55:0x011d, B:56:0x0120, B:57:0x0124, B:35:0x00ac, B:37:0x00c3, B:41:0x00cc, B:22:0x0063, B:24:0x006b, B:26:0x0079, B:29:0x008d, B:31:0x00a3, B:58:0x0129, B:59:0x012b, B:60:0x012c, B:61:0x0133, B:62:0x0134), top: B:68:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0024, B:13:0x0030, B:15:0x0039, B:17:0x0051, B:21:0x005f, B:20:0x0059, B:42:0x00ce, B:44:0x00dc, B:46:0x00f1, B:49:0x0100, B:51:0x010a, B:53:0x0114, B:52:0x010f, B:55:0x011d, B:56:0x0120, B:57:0x0124, B:35:0x00ac, B:37:0x00c3, B:41:0x00cc, B:22:0x0063, B:24:0x006b, B:26:0x0079, B:29:0x008d, B:31:0x00a3, B:58:0x0129, B:59:0x012b, B:60:0x012c, B:61:0x0133, B:62:0x0134), top: B:68:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T c() {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrh.c():java.lang.Object");
    }
}
