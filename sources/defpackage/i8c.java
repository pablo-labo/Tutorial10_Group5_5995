package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final class i8c {
    public static final x2b a(s8c s8cVar, b bVar) {
        s8cVar.getClass();
        switch (s8cVar) {
            case WEBVIEW_NOTIFICATIONS:
                bVar.L(1151875887);
                x2b x2bVarA = z2b.a(R.drawable.ic_push_notification_primer_v2_notification_center, 0, bVar);
                bVar.F();
                return x2bVarA;
            case NATIVE_MYJOBS:
            case WEBVIEW_MYJOBS:
                bVar.L(1151881474);
                x2b x2bVarA2 = z2b.a(R.drawable.ic_push_notification_primer_v2_myjobs, 0, bVar);
                bVar.F();
                return x2bVarA2;
            case NATIVE_INBOX:
            case WEBVIEW_INBOX:
                bVar.L(1151886596);
                x2b x2bVarA3 = z2b.a(R.drawable.ic_push_notification_primer_v2_messages, 0, bVar);
                bVar.F();
                return x2bVarA3;
            case HOMEPAGE:
                bVar.L(1151890244);
                x2b x2bVarA4 = z2b.a(R.drawable.ic_push_notification_primer_v2_homepage, 0, bVar);
                bVar.F();
                return x2bVarA4;
            case POST_APPLY:
                bVar.L(1151893967);
                x2b x2bVarA5 = z2b.a(R.drawable.ic_push_notification_primer_v2_notification_center, 0, bVar);
                bVar.F();
                return x2bVarA5;
            case UNKNOWN:
                bVar.L(1151897883);
                bVar.F();
                return new la2(da2.h);
            default:
                bVar.L(1151874236);
                bVar.F();
                l.g();
                return null;
        }
    }

    public static final String b(s8c s8cVar, r8c r8cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        s8cVar.getClass();
        r8cVar.getClass();
        if (r8cVar.b() == 1) {
            return l.e(bVar, -1498329627, R.string.push_primer_optin_benefit_all, bVar);
        }
        String strE = "";
        if (r8cVar.b() == 2) {
            bVar.L(-1498112999);
            switch (s8cVar) {
                case WEBVIEW_NOTIFICATIONS:
                    strE = l.e(bVar, -1295234874, R.string.push_primer_v2_title_notification_center, bVar);
                    bVar.F();
                    return strE;
                case NATIVE_MYJOBS:
                case WEBVIEW_MYJOBS:
                case HOMEPAGE:
                    i3 = -1295239522;
                    i4 = R.string.push_primer_fomo_homepage_myjobs;
                    strE = l.e(bVar, i3, i4, bVar);
                    bVar.F();
                    return strE;
                case NATIVE_INBOX:
                case WEBVIEW_INBOX:
                    i3 = -1295246377;
                    i4 = R.string.push_primer_fomo_messages;
                    strE = l.e(bVar, i3, i4, bVar);
                    bVar.F();
                    return strE;
                case POST_APPLY:
                    strE = l.e(bVar, -1295230342, R.string.push_primer_post_apply_title, bVar);
                    bVar.F();
                    return strE;
                case UNKNOWN:
                    bVar.L(-1497330530);
                    bVar.F();
                    bVar.F();
                    return strE;
                default:
                    bVar.L(-1295249807);
                    bVar.F();
                    l.g();
                    return null;
            }
        }
        bVar.L(-1497260220);
        switch (s8cVar) {
            case WEBVIEW_NOTIFICATIONS:
                strE = l.e(bVar, -1295220666, R.string.push_primer_v2_title_notification_center, bVar);
                bVar.F();
                return strE;
            case NATIVE_MYJOBS:
            case WEBVIEW_MYJOBS:
                i = -1295214855;
                i2 = R.string.push_primer_v2_title_myjobs;
                strE = l.e(bVar, i, i2, bVar);
                bVar.F();
                return strE;
            case NATIVE_INBOX:
            case WEBVIEW_INBOX:
                i = -1295209509;
                i2 = R.string.push_primer_v2_title_messages;
                strE = l.e(bVar, i, i2, bVar);
                bVar.F();
                return strE;
            case HOMEPAGE:
                i = -1295205381;
                i2 = R.string.push_primer_v2_title_homepage;
                strE = l.e(bVar, i, i2, bVar);
                bVar.F();
                return strE;
            case POST_APPLY:
                strE = l.e(bVar, -1295201190, R.string.push_primer_post_apply_title, bVar);
                bVar.F();
                return strE;
            case UNKNOWN:
                bVar.L(-1496426818);
                bVar.F();
                bVar.F();
                return strE;
            default:
                bVar.L(-1295223166);
                bVar.F();
                l.g();
                return null;
        }
    }
}
