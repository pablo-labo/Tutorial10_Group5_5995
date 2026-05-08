package defpackage;

import android.net.Uri;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.linecorp.linesdk.LineApiError;
import defpackage.c2f;
import defpackage.gdb;
import defpackage.h8f;
import defpackage.lz8;
import defpackage.vw8;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uw8 implements vw8.a, lz8.a, x.e, c2f.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uw8(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // c2f.a
    public Object b() {
        ihg ihgVar = (ihg) this.a;
        return ihgVar.c.G1((v31) this.b);
    }

    @Override // vw8.a
    public ww8 c(qi7 qi7Var) {
        String string;
        ww8 ww8VarA;
        vw8 vw8Var = (vw8) this.a;
        hua huaVar = (hua) this.b;
        h8f h8fVar = vw8Var.c;
        Uri uriC = thg.c(h8fVar.a, "openchat/v1", "openchats");
        l22 l22Var = h8fVar.b;
        LinkedHashMap linkedHashMapA = h8f.a(qi7Var);
        huaVar.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", huaVar.a);
            jSONObject.put("description", huaVar.b);
            jSONObject.put("creatorDisplayName", huaVar.c);
            jSONObject.put("category", huaVar.d.a());
            jSONObject.put("allowSearch", huaVar.e);
            string = jSONObject.toString();
            string.getClass();
        } catch (JSONException unused) {
            string = "{}";
        }
        h8f.g gVar = h8f.e;
        l22Var.getClass();
        byte[] bytes = string.getBytes();
        HttpURLConnection httpURLConnectionC = null;
        try {
            try {
                httpURLConnectionC = l22Var.c(bytes.length, uriC);
                l22.h(httpURLConnectionC, linkedHashMapA);
                httpURLConnectionC.connect();
                OutputStream outputStream = httpURLConnectionC.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                ww8VarA = l22.b(httpURLConnectionC, gVar, l22Var.b);
            } catch (IOException e) {
                ww8VarA = ww8.a(xw8.c, new LineApiError(e));
                if (httpURLConnectionC != null) {
                }
                return ww8VarA;
            }
            httpURLConnectionC.disconnect();
            return ww8VarA;
        } catch (Throwable th) {
            if (httpURLConnectionC != null) {
                httpURLConnectionC.disconnect();
            }
            throw th;
        }
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        return sVar.k() ? aw5.K1(new x9e(-100)) : vjg.b0((hz8) ((x.e) this.a).g(sVar, dVar, i), new tq7(sVar, dVar, (x.c) this.b));
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).X(((Integer) this.b).intValue(), (ij9) this.a);
    }
}
