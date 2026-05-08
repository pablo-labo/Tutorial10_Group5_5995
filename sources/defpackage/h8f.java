package defpackage;

import android.content.Context;
import android.net.Uri;
import com.linecorp.linesdk.LineFriendProfile;
import com.linecorp.linesdk.LineGroup;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import defpackage.p6e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h8f {
    public static final j c = new j(1);
    public static final f d;
    public static final g e;
    public final Uri a;
    public final l22 b;

    public static class a extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) throws JSONException {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("friends");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                LineProfile lineProfileL = j.l(jSONObject2);
                arrayList.add(new LineFriendProfile(lineProfileL.a, lineProfileL.b, lineProfileL.c, lineProfileL.d, jSONObject2.optString("displayNameOverridden", null)));
            }
            String strOptString = jSONObject.optString("pageToken", null);
            p24 p24Var = new p24();
            p24Var.c = arrayList;
            p24Var.b = strOptString;
            return p24Var;
        }
    }

    public static class b extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) throws JSONException {
            boolean z = jSONObject.getBoolean("friendFlag");
            dx8 dx8Var = new dx8();
            dx8Var.a = z;
            return dx8Var;
        }
    }

    public static class c extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) throws JSONException {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("groups");
            int i = 0;
            while (true) {
                Uri uri = null;
                if (i >= jSONArray.length()) {
                    String strOptString = jSONObject.optString("pageToken", null);
                    up1 up1Var = new up1(1);
                    up1Var.c = arrayList;
                    up1Var.d = strOptString;
                    return up1Var;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String strOptString2 = jSONObject2.optString("pictureUrl", null);
                String string = jSONObject2.getString("groupId");
                String string2 = jSONObject2.getString("groupName");
                if (strOptString2 != null) {
                    uri = Uri.parse(strOptString2);
                }
                arrayList.add(new LineGroup(string, string2, uri));
                i++;
            }
        }
    }

    public static class d extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) {
            return mn9.valueOf(jSONObject.getString("state").toUpperCase());
        }
    }

    public static class e extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) throws JSONException {
            ArrayList arrayList = new ArrayList();
            if (jSONObject.has("results")) {
                JSONArray jSONArray = jSONObject.getJSONArray("results");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    p6e.a aVar = jSONObject2.get("status").equals("OK".toLowerCase()) ? p6e.a.a : p6e.a.b;
                    String string = jSONObject2.getString("to");
                    p6e p6eVar = new p6e();
                    p6eVar.a = string;
                    p6eVar.b = aVar;
                    arrayList.add(p6eVar);
                }
            }
            return arrayList;
        }
    }

    public static class f extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) {
            return Boolean.valueOf(jSONObject.getBoolean("agreed"));
        }
    }

    public static class g extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) {
            return new OpenChatRoomInfo(jSONObject.getString("openchatId"), jSONObject.getString("url"));
        }
    }

    public static class h extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) {
            return iua.valueOf(jSONObject.getString("type").toUpperCase());
        }
    }

    public static class i extends r5i {
        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) {
            return jua.valueOf(jSONObject.getString("status").toUpperCase());
        }
    }

    public static class j extends r5i {
        public static LineProfile l(JSONObject jSONObject) throws JSONException {
            String strOptString = jSONObject.optString("pictureUrl", null);
            return new LineProfile(strOptString == null ? null : Uri.parse(strOptString), jSONObject.getString("userId"), jSONObject.getString("displayName"), jSONObject.optString("statusMessage", null));
        }

        @Override // defpackage.r5i
        public final Object c(JSONObject jSONObject) {
            return l(jSONObject);
        }
    }

    static {
        new b(1);
        new a(1);
        new c(1);
        new e(1);
        d = new f(1);
        e = new g(1);
        new i(1);
        new d(1);
        new h(1);
    }

    public h8f(Uri uri, Context context) {
        l22 l22Var = new l22(context);
        this.a = uri;
        this.b = l22Var;
    }

    public static LinkedHashMap a(qi7 qi7Var) {
        return thg.b("Authorization", "Bearer " + qi7Var.a);
    }
}
