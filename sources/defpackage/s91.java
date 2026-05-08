package defpackage;

import android.net.Uri;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s91 implements xu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s91(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                y91 y91Var = (y91) obj5;
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                str.getClass();
                str2.getClass();
                str3.getClass();
                String string = y91Var.getString(R.string.indeed_passport_line_auth_endpoint);
                string.getClass();
                Uri uriBuild = Uri.parse(string).buildUpon().appendQueryParameter("state", str).appendQueryParameter("nonce", str2).appendQueryParameter("id_token", str3).appendQueryParameter("friendship_status_changed", String.valueOf(zBooleanValue)).build();
                mq6 mq6VarG = y91Var.G();
                String string2 = uriBuild.toString();
                string2.getClass();
                mq6VarG.h(string2, true, false);
                return j6g.a;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                String str4 = (String) obj;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                int i2 = LaunchActivity.e1;
                str4.getClass();
                str5.getClass();
                str6.getClass();
                String string3 = launchActivity.getString(R.string.indeed_passport_line_auth_endpoint);
                string3.getClass();
                Uri.parse(string3).buildUpon().appendQueryParameter("state", str4).appendQueryParameter("nonce", str5).appendQueryParameter("id_token", str6).appendQueryParameter("friendship_status_changed", String.valueOf(zBooleanValue2)).build();
                launchActivity.E();
                throw null;
        }
    }
}
