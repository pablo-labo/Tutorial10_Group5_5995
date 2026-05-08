package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class e72<T> implements ngb<T> {
    public final Object[] a = new Object[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
    public int b;

    @Override // defpackage.ngb
    public final synchronized boolean a(T t) {
        t.getClass();
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.b = i + 1;
        return true;
    }

    @Override // defpackage.ngb
    public final synchronized T acquire() {
        int i = this.b;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        this.b = i2;
        T t = (T) this.a[i2];
        t.getClass();
        this.a[i2] = null;
        return t;
    }

    public final synchronized void b() {
        try {
            int i = this.b;
            for (int i2 = 0; i2 < i; i2++) {
                this.a[i2] = null;
            }
            this.b = 0;
        } catch (Throwable th) {
            throw th;
        }
    }
}
