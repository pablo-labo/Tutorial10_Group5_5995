package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wnb {
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
            str2.getClass();
            arrayList2.add(new vnb(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, wl7.b(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static String b() throws Throwable {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            String strMyProcessName = Process.myProcessName();
            strMyProcessName.getClass();
            return strMyProcessName;
        }
        if (i >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String strA = hob.a();
        return strA != null ? strA : "";
    }
}
