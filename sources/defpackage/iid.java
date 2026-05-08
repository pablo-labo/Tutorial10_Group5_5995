package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface iid extends AutoCloseable {
    boolean M1();

    void R(int i, String str);

    default boolean b1() {
        return getLong(0) != 0;
    }

    void e(int i, double d);

    int getColumnCount();

    String getColumnName(int i);

    default List<String> getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(getColumnName(i));
        }
        return arrayList;
    }

    double getDouble(int i);

    default float getFloat(int i) {
        return (float) getDouble(i);
    }

    default int getInt(int i) {
        return (int) getLong(i);
    }

    long getLong(int i);

    boolean isNull(int i);

    void q(int i, long j);

    void r(int i, byte[] bArr);

    String r1(int i);

    void reset();

    void u(int i);
}
