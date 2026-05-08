package defpackage;

import android.graphics.drawable.Icon;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uc implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ad.d((Function1) obj4, (ig3) obj3, (b) obj, ka2.L(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ojh.b((gu5) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((rc1) obj4).b((gu5) obj3, (b) obj, ka2.L(7));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                by2.d(iL, (gu5) obj3, (b) obj, (String) obj4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(7);
                b88.a(iL2, (b) obj, (e) obj4, (String) obj3);
                break;
            case 5:
                ((g4a) obj4).setValue((String) obj);
                ((g4a) obj3).setValue((String) obj2);
                break;
            case 6:
                break;
            case 7:
                Function1 function1 = (Function1) obj4;
                List list = (List) obj3;
                int iIntValue = ((Integer) obj).intValue();
                if (((Boolean) obj2).booleanValue()) {
                    function1.invoke(((j3d) list.get(iIntValue)).a);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((ddf) obj4).b((Icon) obj3, (b) obj, ka2.L(49));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ uc(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
