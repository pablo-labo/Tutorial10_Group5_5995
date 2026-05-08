package defpackage;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ioe {
    public static final float a(long j, float f, iy3 iy3Var) {
        if (bkf.a(j, bkf.c)) {
            return f;
        }
        long jB = bkf.b(j);
        if (ckf.a(jB, 4294967296L)) {
            return iy3Var.C0(j);
        }
        if (ckf.a(jB, 8589934592L)) {
            return bkf.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float b(long j, float f, iy3 iy3Var) {
        float fC;
        long jB = bkf.b(j);
        if (ckf.a(jB, 4294967296L)) {
            if (iy3Var.p1() <= 1.05d) {
                return iy3Var.C0(j);
            }
            fC = bkf.c(j) / bkf.c(iy3Var.d0(f));
        } else {
            if (!ckf.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = bkf.c(j);
        }
        return fC * f;
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(pnb.P(j)), i, i2, 33);
        }
    }

    public static final void d(Spannable spannable, long j, iy3 iy3Var, int i, int i2) {
        long jB = bkf.b(j);
        if (ckf.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(gf9.b(iy3Var.C0(j)), false), i, i2, 33);
        } else if (ckf.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(bkf.c(j)), i, i2, 33);
        }
    }

    public static final void e(Spannable spannable, b19 b19Var, int i, int i2) {
        if (b19Var != null) {
            ArrayList arrayList = new ArrayList(t92.r0(b19Var, 10));
            Iterator<a19> it = b19Var.a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }
}
