package defpackage;

import android.util.Log;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class b49 {
    public int a;
    public final Object b;
    public final Serializable c;

    public b49(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.c = string;
        this.b = str;
        fib.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.b, i)) {
            i++;
        }
        this.a = i;
    }

    public void a(String str, Object... objArr) {
        if (this.a <= 3) {
            String str2 = (String) this.b;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.c).concat(str));
        }
    }

    public b49(ohd ohdVar) {
        this.b = new WeakReference(ohdVar);
        this.a = 1;
        this.c = new LinkedHashMap();
    }
}
