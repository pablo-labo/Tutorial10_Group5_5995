package defpackage;

import expo.modules.video.MethodUnsupportedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a04 implements Function1 {
    public final /* synthetic */ int a;

    public a04(o14 o14Var) {
        this.a = 1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws MethodUnsupportedException {
        switch (this.a) {
            case 0:
                hv1 hv1Var = (hv1) obj;
                hv1Var.getClass();
                return b04.j(hv1Var);
            case 1:
                ((a62) obj).getClass();
                return qne.p;
            default:
                ((Object[]) obj).getClass();
                throw new MethodUnsupportedException("stopPictureInPicture");
        }
    }

    public /* synthetic */ a04(int i) {
        this.a = i;
    }
}
