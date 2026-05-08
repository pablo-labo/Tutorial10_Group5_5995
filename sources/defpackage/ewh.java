package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class ewh extends j3i {
    public final jwh V;
    public final jwh W;
    public final jwh X;
    public final jwh Y;
    public final jwh Z;
    public final jwh a0;
    public final jwh b0;
    public char c;
    public final jwh c0;
    public long d;
    public String e;
    public final jwh f;

    public ewh(i0i i0iVar) {
        super(i0iVar);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new jwh(this, 6, false, false);
        this.V = new jwh(this, 6, true, false);
        this.W = new jwh(this, 6, false, true);
        this.X = new jwh(this, 5, false, false);
        this.Y = new jwh(this, 5, true, false);
        this.Z = new jwh(this, 5, false, true);
        this.a0 = new jwh(this, 4, false, false);
        this.b0 = new jwh(this, 3, false, false);
        this.c0 = new jwh(this, 2, false, false);
    }

    @VisibleForTesting
    public static String j(Object obj, boolean z) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + str.length() + 43);
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof swh ? ((swh) obj).a : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = i0i.class.getCanonicalName();
        if (TextUtils.isEmpty(canonicalName)) {
            canonicalName = "";
        } else {
            int iLastIndexOf = canonicalName.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                canonicalName = canonicalName.substring(0, iLastIndexOf);
            }
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (TextUtils.isEmpty(className)) {
                    className = "";
                } else {
                    int iLastIndexOf2 = className.lastIndexOf(46);
                    if (iLastIndexOf2 != -1) {
                        className = className.substring(0, iLastIndexOf2);
                    }
                }
                if (className.equals(canonicalName)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    public static String k(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strJ = j(obj, z);
        String strJ2 = j(obj2, z);
        String strJ3 = j(obj3, z);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strJ)) {
            sb.append(str2);
            sb.append(strJ);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strJ2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strJ2);
        }
        if (!TextUtils.isEmpty(strJ3)) {
            sb.append(str3);
            sb.append(strJ3);
        }
        return sb.toString();
    }

    public static swh l(String str) {
        if (str == null) {
            return null;
        }
        return new swh(str);
    }

    @Override // defpackage.j3i
    public final boolean i() {
        return false;
    }

    public final void m(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && n(i)) {
            Log.println(i, o(), k(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        fib.i(str);
        a0i a0iVar = this.a.Y;
        if (a0iVar == null) {
            Log.println(6, o(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!a0iVar.b) {
            Log.println(6, o(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        a0iVar.m(new mwh(this, i, str, obj, obj2, obj3));
    }

    @VisibleForTesting
    public final boolean n(int i) {
        return Log.isLoggable(o(), i);
    }

    @VisibleForTesting
    public final String o() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    i0i i0iVar = this.a;
                    String str2 = i0iVar.d;
                    if (str2 == null) {
                        awd awdVar = i0iVar.V.a.f;
                        str2 = "FA";
                    }
                    this.e = str2;
                }
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final jwh p() {
        return this.f;
    }

    public final jwh q() {
        return this.X;
    }
}
