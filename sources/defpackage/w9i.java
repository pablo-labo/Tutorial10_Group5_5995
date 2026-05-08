package defpackage;

import android.os.Bundle;
import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class w9i {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        w40.e("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap map;
        Bundle bundle = new Bundle();
        synchronized (w9i.class) {
            map = a;
            map.put("java", 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        return bundle;
    }
}
