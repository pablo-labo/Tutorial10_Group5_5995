package defpackage;

import com.indeed.android.jsmappservices.bridge.PushModalConfigData;

/* JADX INFO: loaded from: classes2.dex */
public final class qm1 implements gt7 {
    public final String a;
    public final String b;

    public qm1(String str, PushModalConfigData pushModalConfigData) {
        this.a = str;
        this.b = pushModalConfigData.a;
    }

    @Override // defpackage.gt7
    public final String a() {
        return this.a;
    }

    @Override // defpackage.gt7
    public final String b() {
        return this.b;
    }
}
