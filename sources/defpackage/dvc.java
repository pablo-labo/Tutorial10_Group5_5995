package defpackage;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dvc extends qv5 implements Function1<Constructor<?>, lvc> {
    public static final dvc a = new dvc(1, lvc.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final lvc invoke(Constructor<?> constructor) {
        Constructor<?> constructor2 = constructor;
        constructor2.getClass();
        return new lvc(constructor2);
    }
}
