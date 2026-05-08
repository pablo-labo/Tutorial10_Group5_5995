package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class lb0 {
    public final XmlPullParser a;
    public int b = 0;
    public final i62 c;

    public lb0(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        i62 i62Var = new i62();
        i62Var.a = new float[64];
        this.c = i62Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.sf2 a(android.content.res.TypedArray r5, android.content.res.Resources.Theme r6, java.lang.String r7, int r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            org.xmlpull.v1.XmlPullParser r0 = r4.a
            boolean r7 = defpackage.syf.b(r0, r7)
            r0 = 0
            r1 = 0
            if (r7 == 0) goto L3e
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r5.getValue(r8, r7)
            int r2 = r7.type
            r3 = 28
            if (r2 < r3) goto L24
            r3 = 31
            if (r2 > r3) goto L24
            int r6 = r7.data
            sf2 r7 = new sf2
            r7.<init>(r0, r6)
            goto L43
        L24:
            android.content.res.Resources r7 = r5.getResources()
            int r8 = r5.getResourceId(r8, r1)
            sf2 r6 = defpackage.sf2.a(r8, r6, r7)     // Catch: java.lang.Exception -> L32
            r7 = r6
            goto L3b
        L32:
            r6 = move-exception
            java.lang.String r7 = "ComplexColorCompat"
            java.lang.String r8 = "Failed to inflate ComplexColor."
            android.util.Log.e(r7, r8, r6)
            r7 = r0
        L3b:
            if (r7 == 0) goto L3e
            goto L43
        L3e:
            sf2 r7 = new sf2
            r7.<init>(r0, r1)
        L43:
            int r5 = r5.getChangingConfigurations()
            r4.c(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb0.a(android.content.res.TypedArray, android.content.res.Resources$Theme, java.lang.String, int):sf2");
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        if (syf.b(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        c(typedArray.getChangingConfigurations());
        return f;
    }

    public final void c(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb0)) {
            return false;
        }
        lb0 lb0Var = (lb0) obj;
        return wl7.b(this.a, lb0Var.a) && this.b == lb0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return k6.h(sb, this.b, ')');
    }
}
