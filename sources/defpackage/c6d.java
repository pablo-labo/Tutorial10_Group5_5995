package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import defpackage.o85;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c6d implements o85 {
    public final Uri a;
    public final qva b;

    public static final class a implements o85.a<Uri> {
        @Override // o85.a
        public final o85 a(Object obj, qva qvaVar) {
            Uri uri = (Uri) obj;
            if (wl7.b(uri.getScheme(), "android.resource")) {
                return new c6d(uri, qvaVar);
            }
            return null;
        }
    }

    public c6d(Uri uri, qva qvaVar) {
        this.a = uri;
        this.b = qvaVar;
    }

    @Override // defpackage.o85
    public final Object a(lu2<? super m85> lu2Var) throws XmlPullParserException, IOException {
        Integer numB;
        Drawable drawable;
        Uri uri = this.a;
        String authority = uri.getAuthority();
        if (authority != null) {
            if (zve.U(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) z92.Z0(uri.getPathSegments());
                if (str == null || (numB = vve.B(10, str)) == null) {
                    r6.g(p6.d(uri, "Invalid android.resource URI: "));
                    return null;
                }
                int iIntValue = numB.intValue();
                qva qvaVar = this.b;
                Context context = qvaVar.a;
                Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strB = m.b(MimeTypeMap.getSingleton(), charSequence.subSequence(zve.V(charSequence, '/', 0, 6), charSequence.length()).toString());
                boolean zB = wl7.b(strB, "text/xml");
                ze3 ze3Var = ze3.c;
                if (!zB) {
                    TypedValue typedValue2 = new TypedValue();
                    uqc uqcVar = new uqc(c0h.S(resources.openRawResource(iIntValue, typedValue2)));
                    y5d y5dVar = new y5d(typedValue2.density);
                    File cacheDir = context.getCacheDir();
                    cacheDir.mkdirs();
                    return new zne(new vne(uqcVar, cacheDir, y5dVar), strB, ze3Var);
                }
                if (authority.equals(context.getPackageName())) {
                    drawable = pnb.A(context, iIntValue);
                    if (drawable == null) {
                        akb.n(p6.c(iIntValue, "Invalid resource ID: "));
                        return null;
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal<TypedValue> threadLocal = g6d.a;
                    drawable = resources.getDrawable(iIntValue, theme);
                    if (drawable == null) {
                        akb.n(p6.c(iIntValue, "Invalid resource ID: "));
                        return null;
                    }
                }
                boolean z = drawable instanceof VectorDrawable;
                if (z) {
                    drawable = new BitmapDrawable(context.getResources(), hh1.r(drawable, qvaVar.b, qvaVar.c, qvaVar.d, qvaVar.e));
                }
                return new xb4(drawable, z, ze3Var);
            }
        }
        r6.g(p6.d(uri, "Invalid android.resource URI: "));
        return null;
    }
}
