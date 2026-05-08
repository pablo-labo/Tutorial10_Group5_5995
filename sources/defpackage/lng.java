package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lng implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ lng(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(file.isFile());
            default:
                l94 l94Var = (l94) obj;
                return new de0(Float.intBitsToFloat((int) (l94Var.a >> 32)), Float.intBitsToFloat((int) (l94Var.a & 4294967295L)));
        }
    }
}
