package defpackage;

import android.net.Uri;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class xo7 {
    public static final /* synthetic */ int c = 0;
    public final LinkedHashMap a;
    public final ctc b;

    public final class a {
        public final Object a;
        public final /* synthetic */ xo7 b;

        public a(xo7 xo7Var, Object obj) {
            obj.getClass();
            this.b = xo7Var;
            this.a = obj;
        }

        public final void a(String str) {
            str.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.a);
                jSONObject.put("error", str);
                ctc ctcVar = this.b.b;
                String string = jSONObject.toString();
                string.getClass();
                ctcVar.i(string);
            } catch (Exception e) {
                s55.g("xo7", "Responding with error failed", e);
            }
        }

        public final void b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.a);
                jSONObject.put("result", obj);
                ctc ctcVar = this.b.b;
                String string = jSONObject.toString();
                string.getClass();
                ctcVar.i(string);
            } catch (Exception e) {
                s55.g("xo7", "Responding failed", e);
            }
        }
    }

    public xo7(String str, yya yyaVar, LinkedHashMap linkedHashMap, hh2 hh2Var) {
        yyaVar.getClass();
        this.a = linkedHashMap;
        String string = new Uri.Builder().scheme("ws").encodedAuthority(yyaVar.a()).appendPath("message").appendQueryParameter("device", x70.b()).appendQueryParameter(SessionEndedMetric.PROCESS_TYPE_VALUE, yyaVar.c).appendQueryParameter("clientid", str).build().toString();
        string.getClass();
        this.b = new ctc(string, this, hh2Var);
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            new a(this, obj).a(str);
        }
        s55.f("xo7", "Handling the message failed with reason: ".concat(str));
    }

    public final void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("version");
            String strOptString = jSONObject.optString("method");
            Object objOpt = jSONObject.opt("id");
            Object objOpt2 = jSONObject.opt("params");
            if (iOptInt != 2) {
                s55.f("xo7", "Message with incompatible or missing version of protocol received: " + iOptInt);
            } else {
                if (strOptString == null) {
                    a(objOpt, "No method provided");
                    return;
                }
                d4d d4dVar = (d4d) this.a.get(strOptString);
                if (d4dVar == null) {
                    a(objOpt, "No request handler for method: ".concat(strOptString));
                } else if (objOpt == null) {
                    d4dVar.a();
                } else {
                    d4dVar.b(objOpt2, new a(this, objOpt));
                }
            }
        } catch (Exception e) {
            s55.g("xo7", "Handling the message failed", e);
        }
    }
}
