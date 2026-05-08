package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ yd(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g4aVar.setValue(bool);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                break;
            case 2:
                g4aVar.setValue((ig3) obj);
                break;
            case 3:
                xm5 xm5Var = (xm5) obj;
                xm5Var.getClass();
                g4aVar.setValue(Boolean.valueOf(xm5Var.a()));
                break;
            case 4:
                mif mifVar = (mif) obj;
                mifVar.getClass();
                g4aVar.setValue(Boolean.valueOf(mifVar.d() || mifVar.b.f > 3));
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                g4aVar.setValue(str2);
                break;
        }
        return j6g.a;
    }
}
