package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class nda implements Callable<List<o23>> {
    public final /* synthetic */ mfd a;
    public final /* synthetic */ wda b;

    public nda(wda wdaVar, mfd mfdVar) {
        this.b = wdaVar;
        this.a = mfdVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<o23> call() throws IOException {
        Cursor cursorI = pg8.I(this.b.a, this.a, false);
        try {
            int iB = r93.b(cursorI, "locale");
            int iB2 = r93.b(cursorI, "countryCode");
            int iB3 = r93.b(cursorI, "countryName");
            int iB4 = r93.b(cursorI, "baseUrl");
            int iB5 = r93.b(cursorI, "supportedLanguageCodes");
            int iB6 = r93.b(cursorI, "supportedLanguages");
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                String string = cursorI.getString(iB);
                String string2 = cursorI.getString(iB2);
                String string3 = cursorI.getString(iB3);
                String string4 = cursorI.getString(iB4);
                String string5 = cursorI.getString(iB5);
                string5.getClass();
                List list = (List) new ae6().b(string5, new zy2().b);
                String string6 = cursorI.getString(iB6);
                string6.getClass();
                arrayList.add(new o23(string, string2, string3, string4, list, (List) new ae6().b(string6, new zy2().b)));
            }
            return arrayList;
        } finally {
            cursorI.close();
        }
    }

    public final void finalize() {
        this.a.s();
    }
}
