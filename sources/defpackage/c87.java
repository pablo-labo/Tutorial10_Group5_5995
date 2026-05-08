package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.webkit.CookieManager;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.appwidget.RecentSearchAppWidgetProvider;
import com.indeed.android.jobsearch.appwidget.RelevantJobsAppWidgetProvider;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class c87 {
    public static final d2f a = new d2f(new jr(11));

    public static final class a {
        public static String a(ez2 ez2Var) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.getClass();
            return b(cookieManager, d93.g(), ez2Var);
        }

        public static String b(CookieManager cookieManager, String str, ez2 ez2Var) {
            Object next;
            str.getClass();
            String cookie = cookieManager.getCookie(str);
            if (cookie != null) {
                Iterator it = gz2.a(cookie).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (wl7.b((String) ((Pair) next).a(), ez2Var.a())) {
                        break;
                    }
                }
                Pair pair = (Pair) next;
                if (pair != null) {
                    return (String) pair.e();
                }
            }
            return null;
        }

        public static void c(ez2 ez2Var, String str, long j) {
            str.getClass();
            String strG = d93.g();
            String str2 = (String) c87.a.getValue();
            CookieManager.getInstance().setCookie(strG, ez2Var.a() + "=" + str + "; Path=/; Domain=" + str2 + "; Max-Age=" + j);
        }

        public static /* synthetic */ void d(ez2 ez2Var, String str) {
            pxc pxcVar = d87.a;
            c(ez2Var, str, 157680000L);
        }
    }

    public static void a(Context context) {
        String strG = d93.g();
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.getClass();
        String strB = a.b(cookieManager, strG, ez2.e);
        if (strB == null) {
            strB = "";
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        cookieManager2.getClass();
        String strB2 = a.b(cookieManager2, strG, ez2.f);
        String str = strB2 != null ? strB2 : "";
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        cu8 cu8Var = bu8.j0;
        qf8<Object>[] qf8VarArr = bu8.b;
        cu8Var.b(qf8VarArr[19], bu8Var, strB);
        bu8.k0.b(qf8VarArr[20], bu8Var, str);
        bu8.l0.b(qf8VarArr[21], bu8Var, strG);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) RecentSearchAppWidgetProvider.class)), R.id.recent_search_app_widget_content);
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) RelevantJobsAppWidgetProvider.class)), R.id.relevant_jobs_app_widget_content);
    }
}
