package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c57 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u67 b;

    public /* synthetic */ c57(u67 u67Var, int i) {
        this.a = i;
        this.b = u67Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        u67 u67Var = this.b;
        ss8 ss8Var = (ss8) obj;
        switch (i) {
            case 0:
                ss8Var.getClass();
                u67Var.getClass();
                if (ss8Var.h() == 0 && ss8Var.i() <= u67Var.b0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                ss8Var.getClass();
                u67Var.getClass();
                if (ss8Var.h() == 0 && ss8Var.i() <= u67Var.b0) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
