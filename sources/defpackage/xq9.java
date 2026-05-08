package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xq9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ xq9(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        hr7 hr7Var = (hr7) obj;
        switch (i) {
            case 0:
                hr7Var.getClass();
                hr7Var.a("attachmentType", str2);
                if (str != null) {
                    hr7Var.a("sender", str);
                }
                break;
            default:
                hr7Var.getClass();
                hr7Var.a("sectionType", str2);
                hr7Var.a("itemId", str);
                break;
        }
        return j6g.a;
    }
}
