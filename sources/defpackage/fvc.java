package defpackage;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fvc extends qv5 implements Function1<Field, ovc> {
    public static final fvc a = new fvc(1, ovc.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final ovc invoke(Field field) {
        Field field2 = field;
        field2.getClass();
        return new ovc(field2);
    }
}
