package defpackage;

import android.util.Base64;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class s42 extends mj8 implements Function1 {
    public static final s42 b;
    public static final s42 c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new s42(i, 0);
        c = new s42(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s42(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                strEncodeToString.getClass();
                return strEncodeToString;
            default:
                ((lx5.b) obj).getClass();
                return j6g.a;
        }
    }
}
