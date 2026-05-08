package defpackage;

import android.content.ClipData;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class l27 implements Iterable<ClipData.Item>, ze8 {
    public final /* synthetic */ ClipData a;

    public l27(ClipData clipData) {
        this.a = clipData;
    }

    @Override // java.lang.Iterable
    public final Iterator<ClipData.Item> iterator() {
        return new k27(this.a);
    }
}
