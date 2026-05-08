package defpackage;

import com.facebook.react.bridge.Callback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mjc implements Callback {
    public final /* synthetic */ njc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ int[] d;

    public /* synthetic */ mjc(njc njcVar, int i, String[] strArr, int[] iArr) {
        this.a = njcVar;
        this.b = i;
        this.c = strArr;
        this.d = iArr;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object[] objArr) {
        njc njcVar = this.a;
        g8b g8bVar = njcVar.c;
        if (g8bVar == null || !g8bVar.onRequestPermissionsResult(this.b, this.c, this.d)) {
            return;
        }
        njcVar.c = null;
    }
}
