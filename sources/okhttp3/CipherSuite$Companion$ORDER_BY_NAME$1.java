package okhttp3;

import defpackage.wl7;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"okhttp3/CipherSuite$Companion$ORDER_BY_NAME$1", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    @Override // java.util.Comparator
    public final int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        str3.getClass();
        str4.getClass();
        int iMin = Math.min(str3.length(), str4.length());
        for (int i = 4; i < iMin; i++) {
            char cCharAt = str3.charAt(i);
            char cCharAt2 = str4.charAt(i);
            if (cCharAt != cCharAt2) {
                return wl7.c(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str3.length();
        int length2 = str4.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
