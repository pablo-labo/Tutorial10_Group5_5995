package defpackage;

import android.net.Uri;
import com.indeed.android.jsmappservices.bridge.SearchType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bud {
    public static final List<String> a = u63.a0("searchOnHP", "zrp-searchOnSerp", "searchOnSerp", "searchcategories--search");

    public static String a(String str, jud judVar, SearchType searchType, kud kudVar, String str2, String str3, String str4, Integer num, Integer num2) {
        str.getClass();
        judVar.getClass();
        String str5 = judVar.b;
        searchType.getClass();
        kudVar.getClass();
        Uri.Builder builderClearQuery = Uri.parse(str).buildUpon().clearQuery();
        builderClearQuery.getClass();
        builderClearQuery.appendPath("jobs");
        String str6 = judVar.a;
        if (!zve.U(str6)) {
            builderClearQuery.appendQueryParameter("q", str6);
        }
        if (!zve.U(str5)) {
            builderClearQuery.appendQueryParameter("l", str5);
        }
        String str7 = "";
        String strConcat = (str4 == null || !a.contains(str4)) ? "" : str4.concat(",");
        if (searchType == SearchType.b) {
            strConcat = strConcat.concat("whatOverlay,");
        }
        int iOrdinal = kudVar.ordinal();
        if (iOrdinal == 1) {
            str7 = "searchSuggestions,";
        } else if (iOrdinal == 2) {
            str7 = "relatedQueries,";
        } else if (iOrdinal == 3) {
            str7 = "whatautocomplete,";
        }
        builderClearQuery.appendQueryParameter("from", strConcat.concat(str7).concat("droid_search_overlay"));
        if (kudVar == kud.e) {
            builderClearQuery.appendQueryParameter("rq", "1");
            builderClearQuery.appendQueryParameter("fromage", "last");
        }
        if (num != null) {
            builderClearQuery.appendQueryParameter("rsIdx", num.toString());
        }
        if (num2 != null) {
            builderClearQuery.appendQueryParameter("newCount", num2.toString());
        }
        if (str6.equals(str2)) {
            builderClearQuery.appendQueryParameter("sameQ", "1");
        }
        if (str5.equals(str3)) {
            builderClearQuery.appendQueryParameter("sameL", "1");
        }
        String string = builderClearQuery.build().toString();
        string.getClass();
        return string;
    }
}
