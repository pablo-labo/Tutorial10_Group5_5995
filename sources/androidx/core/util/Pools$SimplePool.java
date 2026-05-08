package androidx.core.util;

import defpackage.l5;
import defpackage.ngb;
import defpackage.r6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"androidx/core/util/Pools$SimplePool", "", "T", "Lngb;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Pools$SimplePool<T> implements ngb<T> {
    public final Object[] a;
    public int b;

    public Pools$SimplePool(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            l5.q("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // defpackage.ngb
    public boolean a(T t) {
        t.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = t;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == t) {
                r6.g("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.ngb
    public T acquire() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        t.getClass();
        objArr[i2] = null;
        this.b--;
        return t;
    }
}
