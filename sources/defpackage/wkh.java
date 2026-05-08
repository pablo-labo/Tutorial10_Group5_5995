package defpackage;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wkh {
    public static final HashSet a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    public static final List<String> b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final List<String> c = Arrays.asList("auto", SessionEndedMetric.PROCESS_TYPE_VALUE, "am");
    public static final List<String> d = Arrays.asList("_r", "_dbg");
    public static final List<String> e;
    public static final List<String> f;

    static {
        String[][] strArr = {ak2.f0, ak2.g0};
        int length = 0;
        for (int i = 0; i < 2; i++) {
            length += strArr[i].length;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr[0], length);
        int length2 = strArr[0].length;
        String[] strArr2 = strArr[1];
        System.arraycopy(strArr2, 0, objArrCopyOf, length2, strArr2.length);
        e = Arrays.asList((String[]) objArrCopyOf);
        f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
