package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gb5 implements Function2 {
    public static final gb5 a = new gb5();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        IOException iOException = (IOException) obj2;
        ((File) obj).getClass();
        iOException.getClass();
        throw iOException;
    }
}
