package defpackage;

import android.database.Cursor;
import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class mda implements Callable<List<we6>> {
    public final /* synthetic */ mfd a;
    public final /* synthetic */ wda b;

    public mda(wda wdaVar, mfd mfdVar) {
        this.b = wdaVar;
        this.a = mfdVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<we6> call() throws Throwable {
        wda wdaVar = this.b;
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = wdaVar.a;
        indeedAppDatabase_Impl.c();
        try {
            Cursor cursorI = pg8.I(indeedAppDatabase_Impl, this.a, true);
            try {
                int iB = r93.b(cursorI, "id");
                int iB2 = r93.b(cursorI, "label");
                int iB3 = r93.b(cursorI, "isLoggedIn");
                int iB4 = r93.b(cursorI, "locale");
                HashMap<String, ArrayList<xy1>> map = new HashMap<>();
                while (cursorI.moveToNext()) {
                    String string = cursorI.getString(iB);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                }
                cursorI.moveToPosition(-1);
                wdaVar.t(map);
                ArrayList arrayList = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    arrayList.add(new we6(new ve6(cursorI.getString(iB), cursorI.isNull(iB2) ? null : cursorI.getString(iB2), cursorI.getString(iB4), cursorI.getInt(iB3) != 0), map.get(cursorI.getString(iB))));
                }
                indeedAppDatabase_Impl.w();
                cursorI.close();
                return arrayList;
            } catch (Throwable th) {
                cursorI.close();
                throw th;
            }
        } finally {
            indeedAppDatabase_Impl.s();
        }
    }

    public final void finalize() {
        this.a.s();
    }
}
