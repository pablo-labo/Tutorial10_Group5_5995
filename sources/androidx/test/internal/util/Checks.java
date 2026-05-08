package androidx.test.internal.util;

import android.os.StrictMode;
import androidx.test.internal.platform.ThreadChecker;
import defpackage.l5;
import defpackage.r6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public final class Checks {
    public static final ThreadChecker a;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(ThreadChecker.class).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (arrayList.isEmpty()) {
            new ThreadChecker() { // from class: androidx.test.internal.util.Checks.1
            };
        } else if (arrayList.size() == 1) {
            a = (ThreadChecker) arrayList.get(0);
        } else {
            r6.g(l5.m("Found more than one ", ThreadChecker.class.getName(), " implementations."));
        }
    }
}
