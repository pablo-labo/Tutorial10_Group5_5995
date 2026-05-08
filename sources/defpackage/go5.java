package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class go5 {
    public static final a89<String, Typeface> a = new a89<>(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final jfe<String, ArrayList<yq2<a>>> d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new z3d());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new jfe<>();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((bo5) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static a b(String str, Context context, List<bo5> list, int i) {
        int i2;
        Typeface typefaceB;
        a89<String, Typeface> a89Var = a;
        Trace.beginSection(jpf.g("getFontSync"));
        try {
            Typeface typefaceB2 = a89Var.b(str);
            if (typefaceB2 != null) {
                return new a(typefaceB2);
            }
            wo5 wo5VarA = ao5.a(context, list);
            List list2 = (List) wo5VarA.b;
            int i3 = wo5VarA.a;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                xo5[] xo5VarArr = (xo5[]) list2.get(0);
                if (xo5VarArr == null || xo5VarArr.length == 0) {
                    i2 = 1;
                } else {
                    int length = xo5VarArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = xo5VarArr[i4].e;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new a(i2);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                xo5[] xo5VarArr2 = (xo5[]) list2.get(0);
                bzf bzfVar = vyf.a;
                Trace.beginSection(jpf.g("TypefaceCompat.createFromFontInfo"));
                typefaceB = vyf.a.b(context, xo5VarArr2, i);
                Trace.endSection();
            } else {
                bzf bzfVar2 = vyf.a;
                Trace.beginSection(jpf.g("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceB = vyf.a.c(context, list2, i);
                Trace.endSection();
            }
            if (typefaceB == null) {
                return new a(-3);
            }
            a89Var.c(str, typefaceB);
            return new a(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
