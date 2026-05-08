package defpackage;

import android.net.Uri;
import defpackage.xh8;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class q97 implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q97 q97Var) {
            super(0);
            this.$this_inject = q97Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    public static String b(String str, String str2, Map map) {
        str.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : uri.getQueryParameterNames()) {
            linkedHashMap.put(str3, uri.getQueryParameter(str3));
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        builderClearQuery.getClass();
        if (!linkedHashMap.containsKey("from") && str2 == null && (map == null || map.isEmpty())) {
            return str;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Locale locale = Locale.ROOT;
                locale.getClass();
                String lowerCase = str4.toLowerCase(locale);
                lowerCase.getClass();
                if (!lowerCase.equals("from")) {
                    builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        if (str2 != null && !zve.U(str2)) {
            builderClearQuery.appendQueryParameter("from", str2);
        }
        for (String str5 : linkedHashMap.keySet()) {
            String lowerCase2 = str5.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (!lowerCase2.equals("from") && (map == null || !map.containsKey(str5))) {
                builderClearQuery.appendQueryParameter(str5, (String) linkedHashMap.get(str5));
            }
        }
        String string = builderClearQuery.build().toString();
        string.getClass();
        return string;
    }

    public final String a(String str, String str2) {
        str.getClass();
        Uri.Builder builderClearQuery = Uri.parse(((p87) this.a.getValue()).h()).buildUpon().clearQuery();
        builderClearQuery.getClass();
        builderClearQuery.appendPath("viewjob");
        builderClearQuery.appendQueryParameter("jk", str);
        if (str2 != null && !zve.U(str2)) {
            builderClearQuery.appendQueryParameter("from", str2);
        }
        String string = builderClearQuery.build().toString();
        string.getClass();
        return string;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
