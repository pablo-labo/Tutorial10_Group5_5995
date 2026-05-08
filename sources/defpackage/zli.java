package defpackage;

import com.google.android.gms.common.util.VisibleForTesting;
import defpackage.knh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zli {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;

    public zli(String str, int i) {
        this.a = str;
        this.b = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @VisibleForTesting
    public static Boolean b(String str, knh knhVar, ewh ewhVar) {
        List listX;
        fib.i(knhVar);
        if (str != null && knhVar.r() && knhVar.s() != knh.b.UNKNOWN_MATCH_TYPE) {
            knh.b bVarS = knhVar.s();
            knh.b bVar = knh.b.IN_LIST;
            if (bVarS != bVar ? knhVar.t() : knhVar.y() != 0) {
                knh.b bVarS2 = knhVar.s();
                boolean zW = knhVar.w();
                knh.b bVar2 = knh.b.REGEXP;
                String strU = (zW || bVarS2 == bVar2 || bVarS2 == bVar) ? knhVar.u() : knhVar.u().toUpperCase(Locale.ENGLISH);
                if (knhVar.y() == 0) {
                    listX = null;
                } else {
                    listX = knhVar.x();
                    if (!zW) {
                        ArrayList arrayList = new ArrayList(listX.size());
                        Iterator it = listX.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                        }
                        listX = Collections.unmodifiableList(arrayList);
                    }
                }
                String str2 = bVarS2 == bVar2 ? strU : null;
                if (bVarS2 != bVar ? strU != null : listX != null && listX.size() != 0) {
                    if (!zW && bVarS2 != bVar2) {
                        str = str.toUpperCase(Locale.ENGLISH);
                    }
                    switch (vki.a[bVarS2.ordinal()]) {
                        case 1:
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, zW ? 0 : 66).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                ewhVar.X.a(str2, "Invalid regular expression in REGEXP audience filter. expression");
                            }
                            break;
                        case 2:
                            return Boolean.valueOf(str.startsWith(strU));
                        case 3:
                            return Boolean.valueOf(str.endsWith(strU));
                        case 4:
                            return Boolean.valueOf(str.contains(strU));
                        case 5:
                            return Boolean.valueOf(str.equals(strU));
                        case 6:
                            return Boolean.valueOf(listX.contains(str));
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean c(java.math.BigDecimal r9, defpackage.inh r10, double r11) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zli.c(java.math.BigDecimal, inh, double):java.lang.Boolean");
    }

    @VisibleForTesting
    public static Boolean d(boolean z, Boolean bool) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int a();

    public abstract boolean e();

    public abstract boolean f();
}
