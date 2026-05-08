package defpackage;

import android.net.Uri;
import androidx.navigation.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;

/* JADX INFO: loaded from: classes3.dex */
public final class yid implements nvh {
    public static final ah2 a = new ah2(-407714601, new dm0(1, 0), false);
    public static final ah2 b = new ah2(-117369963, new em0(2), false);
    public static final nfa c = new nfa("InvalidModuleNotifier", 3);
    public static final yid d = new yid();

    public static final int a(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ja.k(str);
    }

    public static final boolean c(m84 m84Var) {
        if (m84Var.k()) {
            m84[] m84VarArrO = m84Var.o();
            m84VarArrO.getClass();
            for (m84 m84Var2 : m84VarArrO) {
                m84Var2.getClass();
                c(m84Var2);
            }
        }
        return m84Var.e();
    }

    public static final r2h d(r3h r3hVar) {
        r3hVar.getClass();
        return new r2h(r3hVar.a, r3hVar.t);
    }

    public static final int e(int i) {
        slf slfVar = slf.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static final void f(v03 v03Var, Throwable th) {
        Throwable runtimeException;
        Iterator<z03> it = a13.a.iterator();
        while (it.hasNext()) {
            try {
                it.next().N0(v03Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    boa.h(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            boa.h(th, new DiagnosticCoroutineContextException(v03Var));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean g(Uri uri) {
        uri.getClass();
        return wl7.b(uri.getScheme(), "content");
    }

    public static final ArrayList h(Map map, Function1 function1) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getValue();
            Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !bVar.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final String i(String str) {
        if (str == null) {
            return null;
        }
        return wve.K(str, "file:///", false) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }

    public static void j(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z = true;
        for (String str : map.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = (String) map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }

    public static String k(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbM = akb.m("<", str2, " threw ");
                    sbM.append(e.getClass().getName());
                    sbM.append(">");
                    string = sbM.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    @Override // defpackage.nvh
    public Object zza() {
        List<svh<?>> list = djh.a;
        return Long.valueOf(((ubi) vbi.b.zza()).zzk());
    }
}
