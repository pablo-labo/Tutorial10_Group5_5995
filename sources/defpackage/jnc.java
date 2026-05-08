package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jnc implements Iterable<ModuleHolder>, ze8 {
    public final /* synthetic */ List a;

    public jnc(List list) {
        this.a = list;
    }

    @Override // java.lang.Iterable
    public final Iterator<ModuleHolder> iterator() {
        return new knc(this.a, 0);
    }
}
