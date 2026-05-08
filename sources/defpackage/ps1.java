package defpackage;

import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ps1 implements gu5 {
    public static final ps1 b = new ps1(0);
    public static final ps1 c = new ps1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ps1(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return fwc.b(ReadableArray.class);
            default:
                qw4 qw4Var = qw4.a;
                return (vl3) vl3.f.getValue();
        }
    }
}
