package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class vz5 {
    public final f88 a;

    public vz5(f88 f88Var) {
        this.a = f88Var;
    }

    public static final Pair a(vz5 vz5Var, List list) {
        vz5Var.getClass();
        List list2 = list;
        Object obj = null;
        if (list2 == null || list2.isEmpty()) {
            return new Pair(null, null);
        }
        Iterator it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (zve.L(str2, "employer_often_reviews", false)) {
                obj = "employer_often_reviews";
            } else {
                String str3 = "80pct_viewed";
                if (!str2.equals("80pct_viewed")) {
                    str3 = "50pct_viewed";
                    if (!str2.equals("50pct_viewed")) {
                        str3 = "30pct_viewed";
                        if (str2.equals("30pct_viewed")) {
                        }
                    }
                }
                str = str3;
            }
        }
        return new Pair(obj, str);
    }
}
