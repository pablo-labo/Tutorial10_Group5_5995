package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class mef {
    public static final boolean a(int i, KeyEvent keyEvent) {
        return ((int) (pg8.y(keyEvent) >> 32)) == i;
    }

    public static final void b(Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            z39.d().a(b2h.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File file = new File(wf0.a.a(context), "androidx.work.workdb");
            String[] strArr = b2h.b;
            int iV = kc9.V(strArr.length);
            if (iV < 16) {
                iV = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
            for (String str : strArr) {
                Pair pair = new Pair(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
                linkedHashMap.put(pair.d(), pair.e());
            }
            for (Map.Entry entry : lc9.d0(linkedHashMap, new Pair(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        z39.d().g(b2h.a, "Over-writing contents of " + file3);
                    }
                    z39.d().a(b2h.a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }
}
