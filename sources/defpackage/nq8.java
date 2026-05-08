package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class nq8<T> implements Comparator {
    public final /* synthetic */ uq8 a;

    public nq8(uq8 uq8Var) {
        this.a = uq8Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Object key = ((br8) t2).getKey();
        uq8 uq8Var = this.a;
        return ak2.i(Integer.valueOf(uq8Var.c(key)), Integer.valueOf(uq8Var.c(((br8) t).getKey())));
    }
}
