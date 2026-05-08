package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vva<T> implements Comparator<T> {
    public <S extends T> vva<S> a() {
        return new vad(this);
    }
}
