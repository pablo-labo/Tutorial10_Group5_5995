package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pqf extends e4 {
    public final String b;
    public final String c;
    public final Throwable d;

    public pqf(String str, String str2, Throwable th) {
        this.b = str;
        this.c = str2;
        this.d = th;
    }

    @Override // defpackage.rx4
    public final Map<String, Object> a() {
        String strSubstring;
        String str = this.c;
        if (str != null) {
            int length = str.length();
            if (length > 2048) {
                length = 2048;
            }
            strSubstring = str.substring(0, length);
        } else {
            strSubstring = null;
        }
        if (strSubstring == null || strSubstring.length() == 0) {
            strSubstring = "Empty message found";
        }
        HashMap map = new HashMap();
        map.put("className", this.b);
        map.put("message", strSubstring);
        Throwable th = this.d;
        if (th != null) {
            yjg yjgVar = yjg.a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            string.getClass();
            int length2 = string.length();
            if (length2 > 8192) {
                length2 = 8192;
            }
            String strSubstring2 = string.substring(0, length2);
            String name = th.getClass().getName();
            int length3 = name.length();
            if (length3 > 1024) {
                length3 = 1024;
            }
            String strSubstring3 = name.substring(0, length3);
            map.put("stackTrace", strSubstring2);
            map.put("exceptionName", strSubstring3);
        }
        return map;
    }

    @Override // defpackage.e4
    public final String d() {
        return "iglu:com.snowplowanalytics.snowplow/diagnostic_error/jsonschema/1-0-0";
    }
}
