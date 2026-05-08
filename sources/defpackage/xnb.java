package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import defpackage.v33;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xnb {
    public static final xnb a = new xnb();

    public static ArrayList a(Context context) {
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = zr4.a;
        }
        List listM0 = z92.M0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listM0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                ja.k("Null processName");
                return null;
            }
            arrayList2.add(new o21(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, wl7.b(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final v33.e.d.a.c b(Context context) {
        Object next;
        String processName;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((v33.e.d.a.c) next).b() == iMyPid) {
                break;
            }
        }
        v33.e.d.a.c cVar = (v33.e.d.a.c) next;
        if (cVar != null) {
            return cVar;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return new o21(iMyPid, 0, processName, false);
    }
}
