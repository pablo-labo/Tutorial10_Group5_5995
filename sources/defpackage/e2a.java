package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e2a<V> implements fze<List<V>>, Serializable {
    private final int expectedValuesPerKey;

    public e2a() {
        wg2.o(2, "expectedValuesPerKey");
        this.expectedValuesPerKey = 2;
    }

    @Override // defpackage.fze
    public final Object get() {
        return new ArrayList(this.expectedValuesPerKey);
    }
}
