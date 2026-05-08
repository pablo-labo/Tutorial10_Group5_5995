package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class w6e implements r6e<Object> {
    public final /* synthetic */ Object a;

    public w6e(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.r6e
    public final Iterator<Object> iterator() {
        return new x6e(this.a);
    }
}
