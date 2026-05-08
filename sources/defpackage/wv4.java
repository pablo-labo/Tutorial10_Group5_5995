package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public final class wv4<T extends Enum<T>> extends w2<T> implements EnumEntries<T>, Serializable {
    private final T[] entries;

    public wv4(T[] tArr) {
        tArr.getClass();
        this.entries = tArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new xv4(this.entries);
    }

    @Override // defpackage.l1
    public final int a() {
        return this.entries.length;
    }

    @Override // defpackage.l1, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) ut0.o0(r3.ordinal(), this.entries)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        T[] tArr = this.entries;
        int length = tArr.length;
        if (i >= 0 && i < length) {
            return tArr[i];
        }
        l5.s(k20.l("index: ", i, length, ", size: "));
        return null;
    }

    @Override // defpackage.w2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) ut0.o0(iOrdinal, this.entries)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.w2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) ut0.o0(iOrdinal, this.entries)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
