package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ru1 implements Function1 {
    public static final ru1 b = new ru1(0);
    public static final ru1 c = new ru1(1);
    public static final ru1 d = new ru1(2);
    public final /* synthetic */ int a;

    public /* synthetic */ ru1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Class cls = (Class) obj;
                kn2 kn2Var = uu1.a;
                cls.getClass();
                ke8 ke8VarA = uu1.a(cls);
                zr4 zr4Var = zr4.a;
                return qe8.a(ke8VarA, zr4Var, false, zr4Var);
            case 1:
                String str = (String) obj;
                str.getClass();
                return str.length() > 1 ? ja.f(';', "L", str) : str;
            default:
                aj3 aj3Var = (aj3) obj;
                aj3Var.getClass();
                List<rxf> typeParameters = ((fv1) aj3Var).getTypeParameters();
                typeParameters.getClass();
                return new y92(typeParameters);
        }
    }
}
