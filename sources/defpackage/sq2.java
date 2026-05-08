package defpackage;

import com.google.gson.JsonIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class sq2 implements hna<Object> {
    public final /* synthetic */ String a;

    public sq2(String str) {
        this.a = str;
    }

    @Override // defpackage.hna
    public final Object b() {
        throw new JsonIOException(this.a);
    }
}
