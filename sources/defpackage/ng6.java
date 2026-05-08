package defpackage;

import defpackage.pk6;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ng6 implements pk6.d {
    @Override // pk6.d
    public final void a(sc3 sc3Var, uif uifVar) {
        uifVar.a("Trace-ID", sc3Var.d.toString());
        uifVar.a("Span-ID", sc3Var.e.toString());
        uifVar.a("Parent_ID", sc3Var.f.toString());
        for (Map.Entry entry : sc3Var.c.entrySet()) {
            String str = "Baggage-" + ((String) entry.getKey());
            String strEncode = (String) entry.getValue();
            try {
                strEncode = URLEncoder.encode(strEncode, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
            uifVar.a(str, strEncode);
        }
    }
}
