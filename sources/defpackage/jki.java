package defpackage;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class jki {

    @VisibleForTesting
    public static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap b = new HashMap(10);

    static {
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i >= 10) {
                return;
            }
            b.put(strArr[i], Integer.valueOf(i));
            i++;
        }
    }
}
