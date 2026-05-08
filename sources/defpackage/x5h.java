package defpackage;

import defpackage.e47;
import defpackage.sz9;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class x5h {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.sz9 a(java.lang.String r18) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x5h.a(java.lang.String):sz9");
    }

    public static qyc b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (ojd.g(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strB = ojd.b(xmlPullParser, strConcat3);
                String strB2 = ojd.b(xmlPullParser, strConcat4);
                String strB3 = ojd.b(xmlPullParser, strConcat5);
                String strB4 = ojd.b(xmlPullParser, strConcat6);
                if (strB == null || strB2 == null) {
                    return qyc.e;
                }
                aVar.c(new sz9.a(strB3 != null ? Long.parseLong(strB3) : 0L, strB, strB4 != null ? Long.parseLong(strB4) : 0L));
            }
        } while (!ojd.f(xmlPullParser, strConcat2));
        return aVar.f();
    }
}
