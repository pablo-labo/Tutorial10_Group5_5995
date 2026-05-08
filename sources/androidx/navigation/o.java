package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.b;
import androidx.navigation.r;
import defpackage.u40;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final ThreadLocal<TypedValue> c = new ThreadLocal<>();
    public final Context a;
    public final u b;

    public static final class a {
        public static r a(TypedValue typedValue, r rVar, r rVar2, String str, String str2) throws XmlPullParserException {
            if (rVar == null || rVar == rVar2) {
                return rVar == null ? rVar2 : rVar;
            }
            StringBuilder sbF = u40.f("Type is ", str, " but found ", str2, ": ");
            sbF.append(typedValue.data);
            throw new XmlPullParserException(sbF.toString());
        }
    }

    public o(Context context, u uVar) {
        context.getClass();
        uVar.getClass();
        this.a = context;
        this.b = uVar;
    }

    public static b c(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        r<Object> rVarA;
        b.a aVar = new b.a();
        int i2 = 0;
        aVar.b = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        Object objH = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith("java")) {
                try {
                    rVarA = r.q.a("j$".concat(string.substring(4)), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                    rVarA = r.q.a(string, resourcePackageName);
                }
            } else {
                rVarA = r.q.a(string, resourcePackageName);
            }
        } else {
            rVarA = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            int i3 = typedValue.resourceId;
            r.m mVar = r.c;
            if (rVarA == mVar) {
                if (i3 != 0) {
                    i2 = i3;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    StringBuilder sb = new StringBuilder("unsupported value '");
                    sb.append((Object) typedValue.string);
                    String strB = rVarA.b();
                    sb.append("' for ");
                    sb.append(strB);
                    sb.append(". Must be a reference to a resource.");
                    throw new XmlPullParserException(sb.toString());
                }
                objH = Integer.valueOf(i2);
            } else if (i3 == 0) {
                r<Object> rVar = r.o;
                if (rVarA == rVar) {
                    objH = typedArray.getString(1);
                } else {
                    int i4 = typedValue.type;
                    r.c cVar = r.l;
                    r.i iVar = r.b;
                    r.f fVar = r.i;
                    if (i4 == 3) {
                        String string2 = typedValue.string.toString();
                        if (rVarA == null) {
                            string2.getClass();
                            try {
                                try {
                                    try {
                                        try {
                                            iVar.h(string2);
                                            rVar = iVar;
                                        } catch (IllegalArgumentException unused) {
                                            fVar.h(string2);
                                            rVar = fVar;
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        cVar.h(string2);
                                        rVar = cVar;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    r.l lVar = r.f;
                                    lVar.h(string2);
                                    rVar = lVar;
                                }
                            } catch (IllegalArgumentException unused4) {
                            }
                            rVarA = rVar;
                        }
                        objH = rVarA.h(string2);
                    } else if (i4 == 4) {
                        rVarA = a.a(typedValue, rVarA, fVar, string, "float");
                        objH = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        rVarA = a.a(typedValue, rVarA, iVar, string, "dimension");
                        objH = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        rVarA = a.a(typedValue, rVarA, cVar, string, "boolean");
                        objH = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i4 < 16 || i4 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (rVarA == fVar) {
                            rVarA = a.a(typedValue, rVarA, fVar, string, "float");
                            objH = Float.valueOf(typedValue.data);
                        } else {
                            rVarA = a.a(typedValue, rVarA, iVar, string, "integer");
                            objH = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            } else {
                if (rVarA != null) {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    String strB2 = rVarA.b();
                    sb2.append("' for ");
                    sb2.append(strB2);
                    sb2.append(". You must use a \"reference\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
                objH = Integer.valueOf(i3);
                rVarA = mVar;
            }
        }
        if (objH != null) {
            aVar.c = objH;
            aVar.d = true;
        }
        if (rVarA != null) {
            aVar.a = rVarA;
        }
        return aVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020d, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.navigation.k a(android.content.res.Resources r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, int r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.o.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):androidx.navigation.k");
    }

    @SuppressLint({"ResourceType"})
    public final l b(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        attributeSetAsAttributeSet.getClass();
        k kVarA = a(resources, xml, attributeSetAsAttributeSet, i);
        if (kVarA instanceof l) {
            return (l) kVarA;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
