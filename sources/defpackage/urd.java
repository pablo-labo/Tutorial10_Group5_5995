package defpackage;

import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class urd implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ w b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ urd(vrd vrdVar, int i, w wVar) {
        this.d = vrdVar;
        this.c = i;
        this.b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        w wVar = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                vrd vrdVar = (vrd) obj2;
                w.a aVar = (w.a) obj;
                int iE = ((dme) vrdVar.d0.a).e();
                if (iE < 0) {
                    iE = 0;
                }
                if (iE <= i2) {
                    i2 = iE;
                }
                int i3 = -i2;
                boolean z = vrdVar.e0;
                int i4 = z ? 0 : i3;
                if (!z) {
                    i3 = 0;
                }
                aVar.a = true;
                w.a.z(aVar, wVar, i4, i3);
                j6g j6gVar = j6g.a;
                aVar.a = false;
                break;
            default:
                ing ingVar = (ing) obj2;
                w.a aVar2 = (w.a) obj;
                int i5 = ingVar.c;
                igf igfVar = ingVar.b;
                vrf vrfVar = ingVar.d;
                nif nifVarInvoke = ingVar.e.invoke();
                igfVar.a(dwa.a, oie.f(aVar2, i5, vrfVar, nifVarInvoke != null ? nifVarInvoke.a : null, false, wVar.a), i2, wVar.b);
                w.a.y(aVar2, wVar, 0, Math.round(-((cme) igfVar.a).g()));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ urd(ing ingVar, w wVar, int i) {
        this.d = ingVar;
        this.b = wVar;
        this.c = i;
    }
}
