package defpackage;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class q81 {
    public final String[] a = new String[5];
    public int b = 0;

    public final synchronized boolean a(String str) {
        for (String str2 : this.a) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        b(sb);
        Log.w("SoLoader", sb.toString());
        String[] strArr = this.a;
        int i = this.b;
        strArr[i % strArr.length] = str;
        this.b = i + 1;
        return true;
    }

    public final synchronized void b(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.b);
            sb.append(" base apk paths.");
            if (this.b > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = this.a;
                if (i < strArr.length) {
                    int i2 = (this.b - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
