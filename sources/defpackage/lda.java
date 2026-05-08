package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class lda implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mfd b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lda(Object obj, mfd mfdVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = mfdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        int i = this.a;
        mfd mfdVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Cursor cursorI = pg8.I(((wda) obj).a, mfdVar, false);
                try {
                    int iB = r93.b(cursorI, "id");
                    int iB2 = r93.b(cursorI, "isLoggedIn");
                    int iB3 = r93.b(cursorI, "locale");
                    int iB4 = r93.b(cursorI, "destinationUrl");
                    int iB5 = r93.b(cursorI, "label");
                    int iB6 = r93.b(cursorI, "subtitle");
                    ArrayList arrayList = new ArrayList(cursorI.getCount());
                    while (cursorI.moveToNext()) {
                        arrayList.add(new xe6(cursorI.getString(iB), cursorI.getString(iB3), cursorI.getInt(iB2) != 0, cursorI.getString(iB4), cursorI.getString(iB5), cursorI.isNull(iB6) ? null : cursorI.getString(iB6)));
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorI.close();
                }
            default:
                Cursor cursorI2 = pg8.I(((eig) obj).a, mfdVar, false);
                try {
                    int iB7 = r93.b(cursorI2, "id");
                    int iB8 = r93.b(cursorI2, "locale");
                    int iB9 = r93.b(cursorI2, "destinationUrl");
                    int iB10 = r93.b(cursorI2, "label");
                    ArrayList arrayList2 = new ArrayList(cursorI2.getCount());
                    while (cursorI2.moveToNext()) {
                        arrayList2.add(new fig(cursorI2.getString(iB7), cursorI2.getString(iB8), cursorI2.getString(iB9), cursorI2.isNull(iB10) ? null : cursorI2.getString(iB10)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    cursorI2.close();
                    mfdVar.s();
                }
        }
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
