package defpackage;

import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: loaded from: classes3.dex */
public final class xv4<E extends Enum<E>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class<E> c;

    public xv4(E[] eArr) {
        eArr.getClass();
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        cls.getClass();
        this.c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.c.getEnumConstants();
        enumConstants.getClass();
        return new wv4(enumConstants);
    }
}
