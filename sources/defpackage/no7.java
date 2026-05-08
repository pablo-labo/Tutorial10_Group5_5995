package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class no7 implements Iterator<Object> {
    public static final no7 a;
    public static final /* synthetic */ no7[] b;

    static {
        no7 no7Var = new no7("INSTANCE", 0);
        a = no7Var;
        b = new no7[]{no7Var};
    }

    public no7() {
        throw null;
    }

    public static no7 valueOf(String str) {
        return (no7) Enum.valueOf(no7.class, str);
    }

    public static no7[] values() {
        return (no7[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        pnb.w("no calls to next() since the last call to remove()", false);
    }
}
