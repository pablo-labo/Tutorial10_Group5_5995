package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.indeed.android.jobsearch.R;
import defpackage.xna;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class xf5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public xf5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        fib.k("ApplicationId must be set.", !rve.a(str));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static xf5 a(Context context) {
        t23 t23Var = new t23();
        fib.i(context);
        Resources resources = context.getResources();
        t23Var.a = resources;
        t23Var.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String strA = t23Var.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new xf5(strA, t23Var.a("google_api_key"), t23Var.a("firebase_database_url"), t23Var.a("ga_trackingId"), t23Var.a("gcm_defaultSenderId"), t23Var.a("google_storage_bucket"), t23Var.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xf5)) {
            return false;
        }
        xf5 xf5Var = (xf5) obj;
        return xna.a(this.b, xf5Var.b) && xna.a(this.a, xf5Var.a) && xna.a(this.c, xf5Var.c) && xna.a(this.d, xf5Var.d) && xna.a(this.e, xf5Var.e) && xna.a(this.f, xf5Var.f) && xna.a(this.g, xf5Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        xna.a aVar = new xna.a(this);
        aVar.a(this.b, "applicationId");
        aVar.a(this.a, "apiKey");
        aVar.a(this.c, "databaseUrl");
        aVar.a(this.e, "gcmSenderId");
        aVar.a(this.f, "storageBucket");
        aVar.a(this.g, "projectId");
        return aVar.toString();
    }
}
