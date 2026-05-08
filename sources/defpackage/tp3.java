package defpackage;

import android.os.Bundle;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class tp3 implements oec {
    public final e9a a;

    public tp3(e9a e9aVar) {
        this.a = e9aVar;
    }

    @Override // defpackage.oec
    public Bundle toBundle() {
        return aq1.a(new Pair("nativeContext", this.a.toBundle()));
    }
}
