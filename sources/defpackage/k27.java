package defpackage;

import android.content.ClipData;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k27 implements Iterator<ClipData.Item>, ze8 {
    public int a;
    public final int b;
    public final /* synthetic */ ClipData c;

    public k27(ClipData clipData) {
        this.c = clipData;
        this.b = clipData.getItemCount();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final ClipData.Item next() {
        int i = this.a;
        this.a = i + 1;
        ClipData.Item itemAt = this.c.getItemAt(i);
        itemAt.getClass();
        return itemAt;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
