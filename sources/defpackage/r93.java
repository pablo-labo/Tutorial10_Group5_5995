package defpackage;

import android.database.Cursor;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class r93 {
    public static final int a(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int b(Cursor cursor, String str) {
        String strT0;
        cursor.getClass();
        int iA = a(cursor, str);
        if (iA >= 0) {
            return iA;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            strT0 = ut0.t0(columnNames, null, null, null, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strT0 = "unknown";
        }
        l5.q(t40.l("column '", str, "' does not exist. Available columns: ", strT0));
        return 0;
    }
}
