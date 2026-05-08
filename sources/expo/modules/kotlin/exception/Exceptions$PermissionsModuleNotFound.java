package expo.modules.kotlin.exception;

import defpackage.fwc;
import defpackage.h8b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"expo/modules/kotlin/exception/Exceptions$PermissionsModuleNotFound", "Lexpo/modules/kotlin/exception/Exceptions$ModuleNotFound;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Exceptions$PermissionsModuleNotFound extends Exceptions$ModuleNotFound {
    public Exceptions$PermissionsModuleNotFound() {
        super(fwc.a.b(h8b.class) + " module not found, make sure that everything is linked correctly", null);
    }
}
