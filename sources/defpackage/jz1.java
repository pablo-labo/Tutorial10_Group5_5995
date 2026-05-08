package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jz1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jz1(svb svbVar, Function1 function1, Locale locale) {
        this.a = 0;
        this.b = svbVar;
        this.c = function1;
        this.d = locale;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                svb svbVar = (svb) obj5;
                Function1 function1 = (Function1) obj4;
                Locale locale = (Locale) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                int i3 = 2;
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o97 o97Var = (o97) bVar.M(p97.a);
                    for (hz1 hz1Var : svbVar.G) {
                        String str = hz1Var.b;
                        if (str == null || zve.U(str)) {
                            bVar.L(-1767540394);
                        } else {
                            bVar.L(-1765177512);
                            boolean zK = bVar.K(function1) | bVar.K(hz1Var);
                            Object objV = bVar.v();
                            if (zK || objV == b.a.a) {
                                objV = new rr(i3, function1, hz1Var);
                                bVar.p(objV);
                            }
                            uub.a((gu5) objV, false, null, null, null, bh2.c(1024234146, new lz1(hz1Var, o97Var, locale, i2), bVar), bVar, 196608, 30);
                        }
                        bVar.F();
                    }
                } else {
                    bVar.D();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                mx7.a((ConversationRecord) obj5, (FragmentManager) obj4, (e) obj3, (b) obj, ka2.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                v7a.a((e8a) obj5, (kjg) obj4, (Function2) obj3, (b) obj, ka2.L(9));
                break;
            default:
                ((Integer) obj2).getClass();
                qxb.f((List) obj5, (Function2) obj4, (Locale) obj3, (b) obj, ka2.L(1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ jz1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
