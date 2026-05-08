package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w94 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w94(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((udf) ((me) obj4).b).b(((yeb) obj2).c);
                j6g j6gVar = j6g.a;
                break;
            default:
                vnd vndVar = (vnd) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ny7.a(vndVar, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }
}
