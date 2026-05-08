package defpackage;

import android.net.Uri;
import androidx.emoji2.text.d;
import defpackage.le0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.text.BreakIterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wea implements y1i {
    public static eze a() {
        return new eze(null);
    }

    public static final int b(float f) {
        return ((int) (f >= 0.0f ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.emoji2.text.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(int r11, java.lang.String r12) {
        /*
            androidx.emoji2.text.d r0 = e()
            r1 = 0
            if (r0 == 0) goto L79
            int r2 = r0.c()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            if (r4 == 0) goto L73
            java.lang.String r2 = "charSequence cannot be null"
            defpackage.hh2.m(r12, r2)
            androidx.emoji2.text.d$a r0 = r0.e
            androidx.emoji2.text.f r4 = r0.b
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L28
            int r2 = r12.length()
            if (r11 < r2) goto L2a
        L28:
            r5 = r12
            goto L69
        L2a:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L46
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<uq4> r6 = defpackage.uq4.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            uq4[] r5 = (defpackage.uq4[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L46
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L6a
        L46:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            androidx.emoji2.text.f$c r10 = new androidx.emoji2.text.f$c
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.c(r5, r6, r7, r8, r9, r10)
            androidx.emoji2.text.f$c r12 = (androidx.emoji2.text.f.c) r12
            int r2 = r12.c
            goto L6a
        L69:
            r2 = r0
        L6a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L71
            goto L7a
        L71:
            r1 = r12
            goto L7a
        L73:
            java.lang.String r11 = "Not initialized yet"
            defpackage.r6.g(r11)
            return r3
        L79:
            r5 = r12
        L7a:
            if (r1 == 0) goto L81
            int r11 = r1.intValue()
            return r11
        L81:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wea.c(int, java.lang.String):int");
    }

    public static final int d(int i, String str) {
        d dVarE = e();
        Integer num = null;
        if (dVarE != null) {
            Integer numValueOf = Integer.valueOf(dVarE.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final d e() {
        if (!d.d()) {
            return null;
        }
        d dVarA = d.a();
        if (dVarA.c() == 1) {
            return dVarA;
        }
        return null;
    }

    public static final long f(zhd zhdVar) {
        if (g(zhdVar) == 0) {
            return -1L;
        }
        iid iidVarQ1 = zhdVar.Q1("SELECT last_insert_rowid()");
        try {
            iidVarQ1.M1();
            long j = iidVarQ1.getLong(0);
            pi3.d(iidVarQ1, null);
            return j;
        } finally {
        }
    }

    public static final int g(zhd zhdVar) {
        iid iidVarQ1 = zhdVar.Q1("SELECT changes()");
        try {
            iidVarQ1.M1();
            int i = (int) iidVarQ1.getLong(0);
            pi3.d(iidVarQ1, null);
            return i;
        } finally {
        }
    }

    public static final boolean h(le0 le0Var) {
        int length = le0Var.b.length();
        List<le0.c<? extends le0.a>> list = le0Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                le0.c<? extends le0.a> cVar = list.get(i);
                if ((cVar.a instanceof rx8) && me0.b(0, length, cVar.b, cVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String i(boolean z, Uri uri) {
        uri.getClass();
        try {
            if (uri.isHierarchical() && uri.getScheme() != null) {
                return uri.getScheme() + "://" + uri.getHost() + (z ? uri.getPath() : "/... (redacted)");
            }
            if (!wl7.b(uri.getScheme(), "mailto")) {
                return uri.getScheme() + ":(redacted)";
            }
            String scheme = uri.getScheme();
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            if (schemeSpecificPart == null) {
                schemeSpecificPart = "";
            }
            return scheme + ":(redacted)@" + zve.o0('@', schemeSpecificPart, "");
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return "(unparseable URI)";
        }
    }

    public static final long j(long j, long j2, long j3, String str) {
        String property;
        int i = e3f.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lC = vve.C(property);
        if (lC == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lC.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j2);
        o6.p(sb, "..", j3, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int k(int i, int i2, String str) {
        return (int) j(i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static final Object l(Object obj) throws NoSuchFieldException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof fd8) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    s6.j("Array contains no element matching the predicate.");
                    return null;
                }
            }
        }
        return obj;
    }

    @Override // defpackage.y1i
    public v1i zzb(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.y1i
    public boolean zzc(Class cls) {
        return false;
    }
}
