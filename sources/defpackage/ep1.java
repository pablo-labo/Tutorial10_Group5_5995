package defpackage;

import defpackage.fp1;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class ep1 implements gu5 {
    public static final ep1 b = new ep1(0);
    public static final ep1 c = new ep1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ep1(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                fp1.a aVar = fp1.a.a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(fp1.class, fp1.class.getClassLoader());
                serviceLoaderLoad.getClass();
                fp1 fp1Var = (fp1) z92.P0(serviceLoaderLoad);
                if (fp1Var != null) {
                    return fp1Var;
                }
                r6.g("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            default:
                return fwc.b(Integer.class);
        }
    }
}
