package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class yve implements r6e<String> {
    public final /* synthetic */ String a;

    public yve(String str) {
        this.a = str;
    }

    @Override // defpackage.r6e
    public final Iterator<String> iterator() {
        return new px8(this.a);
    }
}
