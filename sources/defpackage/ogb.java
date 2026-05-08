package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class ogb<T> {
    public final Object[] a = new Object[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    public int b;

    public final void a(nt0 nt0Var) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = nt0Var;
            this.b = i + 1;
        }
    }
}
