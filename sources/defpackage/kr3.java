package defpackage;

import defpackage.hr3;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr3 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ kr3(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hr3.i iVar = (hr3.i) obj;
                hr3.i iVar2 = (hr3.i) obj2;
                boolean z = iVar.e;
                int i = iVar.Y;
                Object objA = (z && iVar.W) ? hr3.k : hr3.k.a();
                boolean z2 = iVar.f.B;
                id2 id2VarB = id2.a;
                if (z2) {
                    id2VarB = id2VarB.b(Integer.valueOf(i), Integer.valueOf(iVar2.Y), hr3.k.a());
                }
                return id2VarB.b(Integer.valueOf(iVar.Z), Integer.valueOf(iVar2.Z), objA).b(Integer.valueOf(i), Integer.valueOf(iVar2.Y), objA).e();
            default:
                return ((xog) obj).b - ((xog) obj2).b;
        }
    }
}
