package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class hc0 implements tc0, j74, aid {
    public Object b;

    public hc0(tze tzeVar) {
        tzeVar.getClass();
        this.b = tzeVar;
    }

    public static hc0 d(g4b g4bVar) {
        String str;
        g4bVar.K(2);
        int iX = g4bVar.x();
        int i = iX >> 1;
        int iX2 = ((g4bVar.x() >> 3) & 31) | ((iX & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbG = q6.g(str);
        sbG.append(i < 10 ? ".0" : ".");
        sbG.append(i);
        sbG.append(iX2 < 10 ? ".0" : ".");
        sbG.append(iX2);
        return new hc0(sbG.toString());
    }

    public static boolean h(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String m(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // defpackage.aid
    public zhd a(String str) {
        str.getClass();
        return new qze(((tze) this.b).getWritableDatabase());
    }

    @Override // defpackage.tc0
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.b;
        return arrayList.size() == 1 && ((lh8) arrayList.get(0)).c();
    }

    @Override // defpackage.j74
    public xr3 c() {
        return (yr3) this.b;
    }

    public t52 e(hvc hvcVar) {
        hp8 hp8Var;
        mq5 mq5VarH = hvcVar.h();
        hvc hvcVarU = hvcVar.u();
        if (hvcVarU != null) {
            t52 t52VarE = e(hvcVarU);
            in9 in9VarT = t52VarE != null ? t52VarE.T() : null;
            v62 v62VarD = in9VarT != null ? in9VarT.d(hvcVar.getName(), dia.W) : null;
            if (v62VarD instanceof t52) {
                return (t52) v62VarD;
            }
        } else if (mq5VarH != null && (hp8Var = (hp8) z92.Q0(u63.Z(((jp8) this.b).d(mq5VarH.b())))) != null) {
            lp8 lp8Var = hp8Var.Y.d;
            lp8Var.getClass();
            return lp8Var.v(hvcVar.getName(), hvcVar);
        }
        return null;
    }

    public String f(Resources resources, String str, String str2) {
        String[] strArr;
        String strG = g(str2);
        if (!TextUtils.isEmpty(strG)) {
            return strG;
        }
        String strG2 = g(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strG2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strG2, "string", str);
        if (identifier == 0) {
            String strM = m(str2.concat("_loc_key"));
            StringBuilder sb = new StringBuilder(str2.length() + strM.length() + 49);
            sb.append(strM);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        JSONArray jSONArrayL = l(str2.concat("_loc_args"));
        if (jSONArrayL == null) {
            strArr = null;
        } else {
            int length = jSONArrayL.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayL.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            String strM2 = m(str2);
            String string = Arrays.toString(strArr);
            StringBuilder sb2 = new StringBuilder(uz.c(strM2.length() + 58, string));
            sb2.append("Missing format argument for ");
            sb2.append(strM2);
            sb2.append(": ");
            sb2.append(string);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e);
            return null;
        }
    }

    public String g(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public boolean i(String str) {
        String strG = g(str);
        return "1".equals(strG) || Boolean.parseBoolean(strG);
    }

    public Integer j(String str) {
        String strG = g(str);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strG));
        } catch (NumberFormatException unused) {
            String strM = m(str);
            StringBuilder sb = new StringBuilder(uz.c(strM.length() + 38, strG));
            sb.append("Couldn't parse value of ");
            sb.append(strM);
            sb.append("(");
            sb.append(strG);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public Bundle k() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public JSONArray l(String str) {
        String strG = g(str);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        try {
            return new JSONArray(strG);
        } catch (JSONException unused) {
            String strM = m(str);
            StringBuilder sb = new StringBuilder(uz.c(strM.length() + 50, strG));
            sb.append("Malformed JSON for key ");
            sb.append(strM);
            sb.append(": ");
            sb.append(strG);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    @Override // defpackage.tc0
    public z91 t() {
        ArrayList arrayList = (ArrayList) this.b;
        return ((lh8) arrayList.get(0)).c() ? new keb(arrayList) : new f6b(arrayList);
    }

    @Override // defpackage.tc0
    public List x() {
        return (ArrayList) this.b;
    }

    public /* synthetic */ hc0(Object obj) {
        this.b = obj;
    }
}
