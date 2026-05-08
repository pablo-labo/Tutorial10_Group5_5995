package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zt5 extends LinkedHashMap<Uri, byte[]> {
    final /* synthetic */ au5 this$0;
    final /* synthetic */ int val$maxSize = 4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt5(au5 au5Var, int i) {
        super(i, 1.0f, false);
        this.this$0 = au5Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        return size() > this.val$maxSize;
    }
}
